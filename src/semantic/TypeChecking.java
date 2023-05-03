/**
 * Tutorial de Diseño de Lenguajes de Programación
 * @author Raúl Izquierdo
 */

package semantic;


import ast.*;
import main.*;
import visitor.*;

public class TypeChecking extends DefaultVisitor {

    public TypeChecking(ErrorManager errorManager) {
        this.errorManager = errorManager;
    }

    // # ----------------------------------------------------------
    /*
    * Poner aquí los visit.
    *
    * Si se ha usado VGen, solo hay que copiarlos de la clase 'visitor/_PlantillaParaVisitors.txt'.
    */

    // public Object visit(Program prog, Object param) {
    //      ...
    // }

    // ...
    // ...
    // ...

    // # ----------------------------------------------------------
    // Métodos auxiliares recomendados (opcionales) -------------

    /**
     * predicado. Método auxiliar para implementar los predicados. Borrar si no se quiere usar.
     *
     * Ejemplos de uso (suponiendo que existe un método "esPrimitivo(expr)"):
     *
     *      1. predicado(esPrimitivo(expr.tipo), "La expresión debe ser de un tipo primitivo", expr.getStart());
     *      2. predicado(esPrimitivo(expr.tipo), "La expresión debe ser de un tipo primitivo", expr); // Se asume getStart()
     *      3. predicado(esPrimitivo(expr.tipo), "La expresión debe ser de un tipo primitivo");
     *
     * NOTA: El método getStart() (ejemplo 1) indica la linea/columna del fichero fuente donde estaba el nodo
     * (y así poder dar información más detallada de la posición del error). Si se usa VGen, dicho método
     * habrá sido generado en todos los nodos del AST.
     * No es obligatorio llamar a getStart() (ejemplo 2), ya que si se pasa el nodo, se usará por defecto dicha
     * posición.
     * Si no se quiere imprimir la posición del fichero, se puede omitir el tercer argumento (ejemplo 3).
     *
     * @param condition     Debe cumplirse para que no se produzca un error
     * @param errorMessage  Se imprime si no se cumple la condición
     * @param posicionError Fila y columna del fichero donde se ha producido el error.
     */

     public Object visit(Print node, Object param) {
        node.getExpr().accept(this, param);

        predicado(esPrimitivo(node.getExpr().getType()), "La expresion debe ser primitivo",node);
       
        return null;
    }

     public Object visit(Read node, Object param) {
        node.getExpr().accept(this, param);

        predicado(esPrimitivo(node.getExpr().getType()), "La expresion debe ser primitivo",node);
        predicado(node.getExpr().isLValue(),"La expresion tiene que ser un lValue" ,node.getStart());
        return null;
    }


     public Object visit(IfElseSentence node, Object param) {
        super.visit(node, param);
        predicado(node.getCondition().getType() instanceof IntType, "La ocndicion debe ser un numero entero",node.getStart());
        return null;
    }

     public Object visit(IfSentence node, Object param) {
        super.visit(node, param);
        predicado(node.getCondition().getType() instanceof IntType, "La ocndicion debe ser un numero entero",node.getStart());
        return null;
    }


     public Object visit(WhileSentence node, Object param) {
        super.visit(node, param);
        predicado(node.getCondition().getType() instanceof IntType, "La ocndicion debe ser un numero entero",node.getStart());
        return null;
    }

     public Object visit(ReturnNode node, Object param) {

        super.visit(node, param);
       
       if (node.getFunc().getRetorno() == null) {
            // expr == null
            
        } else {
            // expr.type ≠ VoidType
            predicado(node.getExpr() != null, "El retorno no puede ser de tipo Void", node.getEnd());
            if(node.getExpr()!= null)
                predicado(node.getExpr().getType().getClass()  == node.getFunc().getRetorno().getClass(), "Tipo de retorno no coincide", node.getEnd());
    
        }
        return null;
    }

    public Object visit(Parameter node, Object param) {
        node.getType().accept(this, param);

        predicado(esPrimitivo(node.getType()), "El parametro debe ser primitivo",node);
        return null;
    }

    public Object visit(Func node , Object param){

        boolean hasReturn = false;
        for (Sentence s : node.getSentence()) {
            if (s instanceof ReturnNode) {
                hasReturn = true;
                break;
            }
            if (s instanceof IfElseSentence) {
                IfElseSentence se = (IfElseSentence) s;
                for (Sentence sent : se.getIftrue())
                    if (sent instanceof ReturnNode) {
                        hasReturn = true;
                        break;
                    }
                for (Sentence sent : se.getElse1())
                    if (sent instanceof ReturnNode) {
                        hasReturn = true;
                        break;
                    }
            }else if(s instanceof IfSentence){
                IfSentence se = (IfSentence) s;
                for (Sentence sent : se.getIftrue())
                    if (sent instanceof ReturnNode) {
                        hasReturn = true;
                        break;
                    }
            }else if (s instanceof WhileSentence) {
                WhileSentence se = (WhileSentence) s;
                for (Sentence sent : se.getSentence())
                    if (sent instanceof ReturnNode) {
                        hasReturn = true;
                        break;
                    }
            }
            if (node.getRetorno() != null) {
                // returnNode ⊂ method.definition
                predicado(hasReturn, "Este método debe retornar un resultado de tipo: " + node.getRetorno(),
                        node.getStart());
                // si (∃ return) =>
                // method.retornable = true
                if (hasReturn)
                    node.setRetornable(true);
            }
        }

        super.visit(node, param);

        return null ;
    }

    public Object visit(FuncCall node, Object param) { 
        if(node.getArgs() != null){
            for(Expr exp: node.getArgs() )
                exp.accept(this, param);
        }

        predicado(node.getDefinicion().isRetornable(),"La funcion debe retornar algo ", node.getStart());
        
        boolean eqParams = false;
        if(node.getDefinicion().getParameter() != null)
            eqParams = node.getArgs().size() == node.getDefinicion().getParameter().size();
        predicado(eqParams,"El número de parámetos no coincide", node.getStart());
        
        if(eqParams){
            boolean sameType =true;
            for(int i = 0 ; i < node.getArgs().size();i++){
                if(!mismoTipo(node.getArgs().get(i),node.getDefinicion().getParameter().get(i))){
                    sameType = false;
                }
            }
            predicado(sameType, "El tipo de los parámetros no coincide", node.getStart());
        }
        return null; 
    }

     public Object visit(Cast node, Object param) { 
        if(node.getTypeToConvert() != null){
            node.getTypeToConvert().accept(this, param);
        }
        node.getExpr().accept(this, param);

        predicado(esPrimitivo(node.getTypeToConvert()),
         "El tipo a convertir tiene que ser primitivo", node.getStart());
        predicado(esPrimitivo(node.getExpr().getType()), 
        "Solo se pueden convertir tipos simples", node.getStart());
        predicado(node.getTypeToConvert().getClass() != node.getExpr().getType().getClass(),
        "Los tipos del cast tienen que ser diferentes", node.getStart());

        node.setType(node.getTypeToConvert());
        node.setLValue(false);

        return null; 
    }
    

     public Object visit(MethodCallExpr node, Object param) { 
        if(node.getArgs() != null){
            for(Expr exp: node.getArgs() )
                exp.accept(this, param);
        }
        
        boolean eqParams = false;
        if(node.getDefinicion().getParameter() != null)
            eqParams = node.getArgs().size() == node.getDefinicion().getParameter().size();
        predicado(eqParams,"El número de parámetos no coincide", node.getStart());
        
        predicado(node.getDefinicion().getRetorno() == null , 
            "La funcion no tiene retorno",node.getStart());
        if(eqParams){
            boolean sameType =true;
            for(int i = 0 ; i < node.getArgs().size();i++){
                if(!mismoTipo(node.getArgs().get(i),node.getDefinicion().getParameter().get(i))){
                    sameType = false;
                }
            }
            predicado(sameType, "El tipo de los parámetros no coincide", node.getStart());
        }
        node.setType(node.getDefinicion().getRetorno());
        return null; 
    }

     public Object visit(Assignment node, Object param) { 
        super.visit(node, param); 
        predicado(mismoTipo(node.getLeft(), node.getRight()), "Los operandos deben ser del mismo tipo", node); 
        predicado(node.getLeft().isLValue(), "Se requiere expresión modificable", node
       .getLeft()); 
       predicado(esPrimitivo(node.getLeft().getType()), "Valor de la izquierda debe ser simple");
        return null; 
    }

    public Object visit(ExprAritmetica node, Object param) { 
        super.visit(node, param); 
        predicado(esPrimitivo(node.getLeft().getType()), "Debe ser un tipo simple");
        predicado(esPrimitivo(node.getRight().getType()), "Debe ser un tipo simple");

        predicado(mismoTipo(node.getLeft(), node.getRight()), "Los operandos deben ser del mismo tipo", node); 
        if(node.getOp().equals("%")){
            predicado(node.getLeft().getType().getClass() == IntType.class,
                    "Los operandos deben de ser enteros", node.getStart());
            predicado(node.getRight().getType().getClass() == IntType.class,
                    "Los operandos deben de ser enteros", node.getStart());
        }else{
            predicado(isNumber(node.getRight().getType()),"Los operandos deben de ser numeros",node.getStart());
            predicado(isNumber(node.getLeft().getType()),"Los operandos deben de ser numeros",node.getStart());
        }
        node.setType(node.getLeft().getType()); 
        node.setLValue(false); 
        return null; 
    } 

    public Object visit(ExprLogica node, Object param) { 
        
        super.visit(node, param); 
        predicado(esPrimitivo(node.getLeft().getType()), "Debe ser un tipo simple");
       
        predicado(mismoTipo(node.getLeft(), node.getRight()), "Los operandos deben ser del mismo tipo", node); 
        if(node.getOp().equals("&&")|| node.getOp().equals("||")){
            predicado(node.getLeft().getType().getClass() == IntType.class,
                    "Los operandos deben de ser enteros", node.getStart());
            predicado(node.getRight().getType().getClass() == IntType.class,
                    "Los operandos deben de ser enteros", node.getStart());
        }else{
            predicado(isNumber(node.getRight().getType()),"Los operandos deben de ser numeros",node.getStart());
            predicado(isNumber(node.getLeft().getType()),"Los operandos deben de ser numeros",node.getStart());
        }
        node.setType(new IntType()); 
        node.setLValue(false); 
        return null; 
    } 
    
    public Object visit(ExprLogicaNe node, Object param) {

    

        if (node.getExpr() != null)
            node.getExpr().accept(this, param);

   
        predicado(node.getExpr().getType().getClass() == IntType.class,
                "El tipo de la expresión tiene que ser entero", node.getStart());

        
        node.setType(new IntType());
        
        node.setLValue(false);
        return null;
    }

    public Object visit(Acces node , Object param){
        if (node.getLeft() != null)
            node.getLeft().accept(this, param);

         predicado(node.getLeft().getType() instanceof StructType,
                "La expresión de la izquierda tiene que ser de tipo estructura", node.getStart());

        Parameter par = null;

        if (node.getLeft().getType() instanceof StructType) {
            StructType tipo = (StructType) node.getLeft().getType();
            for (Parameter d : tipo.getStruct().getParameter()){
                if (d.getName().equals(node.getRight())) {
                    par = d;
                }
            }
            predicado(par != null, "El campo " + node.getRight() + " no está definido", node.getStart());
        }
        if (par != null)
            node.setType(par.getType());
        else
            node.setType(node.getLeft().getType()); // para evitar NullPointer

        node.setLValue(true);
        return null ; 
    }

    public Object visit(ArrayAcces node , Object param){
        
        super.visit(node, param);

         predicado(node.getLeft().getType() instanceof ArrayType,
                "La expresión de la izquierda tiene que ser de tipo array", node.getStart());

                predicado(node.getRight().getType().getClass() == IntType.class, "El índice tiene que ser un entero",
                node.getStart());

        if (node.getLeft().getType() instanceof ArrayType) {
            ArrayType tipo = (ArrayType) node.getLeft().getType();
            node.setType(tipo.getType());
        }else{
            node.setType(new VoidType());
        }
        
        node.setLValue(true);
        return null ; 
    }

    public Object visit(Variable node, Object param) { 
        node.setType(node.getDefinicion().getType()); 
        node.setLValue(true); 
        return null; 
    } 
    // class IntConstant { String valor; }
    public Object visit(LitEnt node, Object param) { 
        node.setType(new IntType()); 
        node.setLValue(false); 
        return null; 
    } 
    // class RealConstant { String valor; }
    public Object visit(LitReal node, Object param) { 
        node.setType(new RealType()); 
        node.setLValue(false); 
        return null; 
    } 

    public Object visit(LitChar node, Object param) { 
        node.setType(new CharType()); 
        node.setLValue(false); 
        return null; 
    } 


    private boolean isNumber(Type type){
        return type.isNumber();
    }


    private boolean esPrimitivo(Type type){
        return type.esPrimitivo();
    }

    private boolean mismoTipo(Expr a, Expr b) { 
        return (a.getType().getClass() == b.getType().getClass()); 
    } 

    private boolean mismoTipo(Expr a, Parameter b) { 
        return (a.getType().getClass() == b.getType().getClass()); 
    } 

    private void predicado(boolean condition, String errorMessage, AST node) {
        predicado(condition, errorMessage, node.getStart());
    }

    private void predicado(boolean condition, String errorMessage, Position position) {
        if (!condition)
            errorManager.notify("Type Checking", errorMessage, position);
    }

    private void predicado(boolean condition, String errorMessage) {
        predicado(condition, errorMessage, (Position) null);
    }

    private ErrorManager errorManager;
}
