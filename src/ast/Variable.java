/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	variable:expr -> string:String

public class Variable extends AbstractExpr {

	public Variable(String string) {
		this.string = string;
	}

	public Variable(Object string) {
		this.string = (string instanceof Token) ? ((Token)string).getText() : (String) string;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(string);
	}

	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String string;
	private DefVar definicion;

	public DefVar getDefinicion(){
		return definicion;
	}

	public void setDefinicion(DefVar def){
		definicion = def;
	}

	public String toString() {
       return "{string:" + getString() + "}";
   }
}
