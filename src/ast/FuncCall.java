/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	funcCall:sentence -> name:String  args:expr

public class FuncCall extends AbstractSentence {

	public FuncCall(String name, Expr args) {
		this.name = name;
		this.args = args;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(args);
	}

	public FuncCall(Object name, Object args) {
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;
		this.args = (Expr) getAST(args);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, args);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Expr getArgs() {
		return args;
	}
	public void setArgs(Expr args) {
		this.args = args;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String name;
	private Expr args;
	private Func definicion;
	
	public Func getDefinicion() {
		return definicion;
	}

	public void setDefinicion(Func definicion) {
		this.definicion = definicion;
	}

	public String toString() {
       return "{name:" + getName() + ", args:" + getArgs() + "}";
   }
}
