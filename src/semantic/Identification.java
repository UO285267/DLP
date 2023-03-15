/**
 * Tutorial de Diseño de Lenguajes de Programación
 * @author Raúl Izquierdo
 */

package semantic;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.DefaultErrorStrategy;
import org.antlr.v4.runtime.atn.EpsilonTransition;

import ast.*;
import main.*;
import visitor.*;

public class Identification extends DefaultVisitor {

    public Identification(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    public Object visit(Func node, Object param){
        Func func = funcs.get(node.getName());
        predicado(func== null, "Funcion ya definida: " + node.getName(), node); 

        funcs.put(node.getName(), node);
        
        context.set();
        super.visit(node, node);
        context.reset();

        for (Sentence se : node.getSentence()) {
           se.setFunc(node); 
        }
        return null;
    }

    public Object visit(FuncCall node,Object param){
        node.getArgs().accept(this, param);

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
        node.getType().accept(this, param); // No es necesario realmente
        Def definicion = context.getFromTop(node.getName()); 
        predicado(definicion == null, "Variable ya definida: " + node.getName(), node); 
        context.put(node.getName(), node); 
        return null; 
    }

    public Object visit(Parameter node, Object param) { 
        node.getType().accept(this, param); // No es necesario realmente

        DefVar definicion = context.getFromTop(node.getName()); 
        predicado(definicion == null, "Variable ya definida: " + node.getName(), node); 
        DefVar var = new DefVar(node.getName(), node.getType());

        context.put(node.getName(), var); 
        return null; 
    }

    public Object visit(DefStruct node , Object param){
        DefStruct definicion =estruct.get(node.getName()); 
        predicado(definicion == null, "Estruct ya definida: " + node.getName(), node); 
        estruct.put(node.getName(), node); 
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
        Def definicion = context.getFromAny(node.getString()); 
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
