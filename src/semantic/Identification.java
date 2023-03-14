/**
 * Tutorial de Diseño de Lenguajes de Programación
 * @author Raúl Izquierdo
 */

package semantic;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.DefaultErrorStrategy;

import ast.*;
import main.*;
import visitor.*;

public class Identification extends DefaultVisitor {

    public Identification(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    public Object visit(DefVar node, Object param) { 
        node.getType().accept(this, param); // No es necesario realmente
        Def definicion = variables.get(node.getName()); 
        predicado(definicion == null, "Variable ya definida: " + node.getName(), node); 
        variables.put(node.getName(), node); 
        return null; 
    }

    public Object visit(Parameter node, Object param) { 
        node.getType().accept(this, param); // No es necesario realmente
        Def definicion = variables.get(node.getName()); 
        predicado(definicion == null, "Variable ya definida: " + node.getName(), node); 
        variables.put(node.getName(), node); 
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
        Def definicion = variables.get(node.getString()); 
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
    private Map<String, Def> variables = new HashMap<String, Def>();
    private Map<String, DefStruct> estruct = new HashMap<String, DefStruct>();
}
