/**
 * Tutorial de Diseño de Lenguajes de Programación
 * @author Raúl Izquierdo
 */

package codegeneration;

import ast.*;
import visitor.*;

/**
 * Clase encargada de asignar direcciones a las variables.
 */
public class MemoryAllocation extends DefaultVisitor {

    /*
    * Poner aquí los visit.
    *
    * Si se ha usado VGen, solo hay que copiarlos de la clase 'visitor/_PlantillaParaVisitors.txt'.
    */

    public Object visit(Program prog, Object param) {
        int dirAcumu = 0 ;
        for (AST ast : prog.getAst()) {
            if(ast instanceof DefVar ){
                DefVar def = (DefVar) ast;
                def.setAddress(dirAcumu);
                dirAcumu += def.getType().getSize();
            }
            ast.accept(this, param);
        }
         return null;
    }

    public Object visit(DefStruct struct, Object param) {
        int offset = 0 ;
        for(Parameter parameter : struct.getParameter()){
            parameter.setAddress(offset);
            offset += parameter.getType().getSize();
        }
        return null;
    }

    public Object visit(Func func, Object param) {
        int offsetLocal = 0; 
        int offset = 4 ;
        for(int i = func.getParameter().size() -1 ; i >= 0; i--){
            func.getParameter().get(i).setAddress(offset);
            offset += func.getParameter().get(i).getType().getSize();
        }
        for(DefVar var :func.getDefvar()){
            
            offsetLocal += var.getType().getSize();
            var.setAddress(-offsetLocal);
        }
        return null;
    }
}
