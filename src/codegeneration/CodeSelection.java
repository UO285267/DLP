/**
 * Tutorial de Diseño de Lenguajes de Programación
 * @author Raúl Izquierdo
 */

package codegeneration;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import ast.*;
import visitor.*;

public  class CodeSelection extends DefaultVisitor {
    private enum CodeFunction{
        VALUE,ADDRESS
    }
    private Map<String, String> instruccion = new HashMap<String, String>(); 

    public CodeSelection(Writer writer, String sourceFile) {
        this.writer = new PrintWriter(writer);
        this.sourceFile = sourceFile;

        instruccion.put("+", "add"); 
        instruccion.put("-", "sub"); 
        instruccion.put("*", "mul"); 
        instruccion.put("/", "div");
        instruccion.put(">", "gt"); 
        instruccion.put("<", "lt"); 
        instruccion.put(">=", "ge"); 
        instruccion.put("<=", "le");
        instruccion.put("==", "eq"); 
        instruccion.put("!=", "ne"); 
        instruccion.put("&&", "and");
        instruccion.put("||", "or");
        instruccion.put("!", "not");


    }

    public Object visit(Program node, Object param) { 
        out("#source \"" + sourceFile + "\""); 
        visitChildren(node.getAst(), param); 
        out("halt"); 
        return null; 
    } 

    public Object visit(DefVar node, Object param) { 
        out("#GLOBAL " + node.getName() + ":" + node.getType().getMAPLName()); 
        return null; 
    } 

    // class Print { Expression expression; }
    public Object visit(Print node, Object param) { 
        line(node); 
        node.getExpr().accept(this, CodeFunction.VALUE); 
        out("out", node.getExpr().getType()); 
        return null; 
    } 

    public Object visit(Assignment node, Object param) { 
        line(node); 
        node.getLeft().accept(this, CodeFunction.ADDRESS); 
        node.getRight().accept(this, CodeFunction.VALUE); 
        out("store", node.getLeft().getType()); 
        return null; 
    }

    public Object visit(ExprAritmetica node, Object param) { 
        assert (param == CodeFunction.VALUE); 
        node.getLeft().accept(this, CodeFunction.VALUE); 
        node.getRight().accept(this, CodeFunction.VALUE); 
        out(instruccion.get(node.getOp()),node.getType()); 
        return null; 
    } 

    public Object visit(DefStruct node, Object param) {  
        out("#type " + node.getName() + ": {"); 
        for(Parameter p : node.getParameter()){
            out(p.getName() + ":" + p.getType().getMAPLName());
        }
     
        out("}");
        return null; 
    } 

    
    // class Variable { String name; }
    public Object visit(Variable node, Object param) { 
        if (((CodeFunction) param) == CodeFunction.VALUE) { 
            visit(node, CodeFunction.ADDRESS); 
            out("load", node.getType()); 
        } else { // Funcion.DIRECCION
            assert (param == CodeFunction.ADDRESS); 
            out("pusha " + node.getDefinicion().getAddress()); 
        } 
        return null; 
    } 

    // class LitEnt { String string; }
    public Object visit(LitEnt node, Object param) { 
        assert (param == CodeFunction.VALUE); 
        out("pushi " + node.getString()); 
        return null; 
    } 
    // class LitReal { String valor; }
    public Object visit(LitReal node, Object param) { 
        assert (param == CodeFunction.VALUE); 
        out("pushf " + node.getString()); 
        return null; 
    } 
    //class LitChar {string string}
    public Object visit(LitChar node, Object param) { 
        assert (param == CodeFunction.VALUE); 
        out("pushb " + node.getString()); 
        return null; 
    } 

    // Métodos auxiliares recomendados (opcionales) -------------

    // Imprime una línea en el fichero de salida
     private void out(String instruction) {
        writer.println(instruction);
    }

    private void out(String instruccion, Type tipo) { 
        out(instruccion + tipo.getSuffix()); 
    } 

    private void line(AST node) {
        line(node.getEnd());
    }

    private void line(Position pos) {
        if (pos != null)
            out("\n#line " + pos.getLine());
        else
            System.out.println("#line no generado. Se ha pasado una Position null. Falta información en el AST");
    }

    private PrintWriter writer;
    private String sourceFile;
}
