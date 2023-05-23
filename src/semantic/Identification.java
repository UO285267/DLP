/**
 * Tutorial de Diseño de Lenguajes de Programación
 * @author Raúl Izquierdo
 */

package semantic;

import java.util.HashMap;
import java.util.Map;


import ast.*;
import main.*;
import visitor.*;

public class Identification extends DefaultVisitor {

    public Identification(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }
    
    public Object visit(Program node, Object param) {
        
		for (AST ast : node.getAst()) {
            ast.accept(this, param);
            if(ast instanceof DefVar){
                DefVar def = (DefVar) ast;
                def.setAmbito(Ambito.GLOBAL);
            }
        }
        

		return null;
	}

    public Object visit(Func node, Object param){
        Func func = funcs.get(node.getName());
        predicado(func== null, "Funcion ya definida: " + node.getName(), node); 

        funcs.put(node.getName(), node);
        
        context.set();
        super.visit(node, node);
        context.reset();
        if(node.getSentence() != null){
            for (Sentence se : node.getSentence()) {

                if(se instanceof IfElseSentence ){
                    IfElseSentence s = (IfElseSentence) se;
                    for(Sentence sen: s.getIftrue()){
                        sen.setFunc(node);
                    }
                    for(Sentence sen: s.getElse1()){
                        sen.setFunc(node);
                    }
                }
                if(se instanceof IfSentence ){
                    IfSentence s = (IfSentence) se;
                    for(Sentence sen: s.getIftrue()){
                        sen.setFunc(node);
                    }
                }
                if(se instanceof WhileSentence ){
                    WhileSentence s = (WhileSentence) se;
                    for(Sentence sen: s.getSentence()){
                        sen.setFunc(node);
                    }
                }
            se.setFunc(node); 
            }
        }
        node.getDefvar();
        if(node.getParameter()!= null){
            for(Parameter par: node.getParameter()){
                par.getDefinicion().setAmbito(Ambito.PARAM);
            }
        }
        if(node.getDefvar() != null){
            for (DefVar child : node.getDefvar()) 
                child.setAmbito(Ambito.LOCAL);
            }
        return null;
    }

    public Object visit(FuncCall node,Object param){
        for (Expr expr : node.getArgs()) {
            expr.accept(this, param);
        }

        Func func = funcs.get(node.getName());
        predicado(func != null, "Funcion no definida: " + node.getName(), node);

        node.setDefinicion(func);
        return null;
    }

    public Object visit(MethodCallExpr node,Object param){
        for (Expr expr : node.getArgs()) {
            expr.accept(this, param);
        }

        Func func = funcs.get(node.getName());
        predicado(func != null, "Funcion no definida: " + node.getName(), node);

        node.setDefinicion(func);
        return null;
    }

    public Object visit(DefVar node, Object param) { 
        node.getType().accept(this, param); 
        Def definicion = context.getFromTop(node.getName()); 
        predicado(definicion == null, "Variable ya definida: " + node.getName(), node); 
        context.put(node.getName(), node); 
        return null; 
    }

    public Object visit(Parameter node, Object param) { 
        node.getType().accept(this, param); 

        DefVar definicion = context.getFromTop(node.getName()); 
        predicado(definicion == null, "Variable ya definida: " + node.getName(), node); 
        DefVar var = new DefVar(node.getName(), node.getType());
        node.setDefinicion(var);
        context.put(node.getName(), var); 
        return null; 
    }

    public Object visit(DefStruct node , Object param){
        DefStruct definicion =estruct.get(node.getName()); 
        predicado(definicion == null, "Estruct ya definida: " + node.getName(), node); 
        estruct.put(node.getName(), node); 
        context.set();
        for(Parameter p : node.getParameter()){
            p.accept(this, param);
        }
        context.reset();
        return null; 
    }
    
    public Object visit(StructType node, Object param){
        DefStruct definicion =estruct.get(node.getName()); 
        predicado(definicion != null, "Estruct no definida: " + node.getName(), node); 
        node.setStruct(definicion);
        return null; 
    }

    // class Variable { String name; }
    public Object visit(Variable node, Object param) { 
        DefVar definicion = context.getFromAny(node.getString()); 
        predicado(definicion != null, "Variable no definida: " + node.getString(), node); 
        node.setDefinicion(definicion); // Enlazar referencia con definición
        return null; 
   } 
       


    private void error(String msg, Position position) {
        errorManager.notify("Identification", msg, position);
    }

    private void predicado(boolean condition, String errorMessage, AST node) { 
        if (!condition) 
        error(errorMessage, node.getStart()); 
        } 

    private ErrorManager errorManager;
    private ContextMap<String, DefVar> context = new ContextMap<String, DefVar>();
    private Map<String, DefStruct> estruct = new HashMap<String, DefStruct>();
    private Map<String,Func> funcs = new HashMap<String, Func>();
}
