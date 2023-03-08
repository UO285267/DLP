/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	print:sentence -> string:String  expr:expr

public class Print extends AbstractSentence {

	public Print(String string, Expr expr) {
		this.string = string;
		this.expr = expr;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(expr);
	}

	public Print(Object string, Object expr) {
		this.string = (string instanceof Token) ? ((Token)string).getText() : (String) string;
		this.expr = (Expr) getAST(expr);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(string, expr);
	}

	public String getString() {
		return string;
	}
	public void setString(String string) {
		this.string = string;
	}

	public Expr getExpr() {
		return expr;
	}
	public void setExpr(Expr expr) {
		this.expr = expr;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String string;
	private Expr expr;

	public String toString() {
       return "{string:" + getString() + ", expr:" + getExpr() + "}";
   }
}
