/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	parameter -> neme:String  type:type

public class Parameter extends AbstractAST  {

	public Parameter(String neme, Type type) {
		this.neme = neme;
		this.type = type;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(type);
	}

	public Parameter(Object neme, Object type) {
		this.neme = (neme instanceof Token) ? ((Token)neme).getText() : (String) neme;
		this.type = (Type) getAST(type);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(neme, type);
	}

	public String getNeme() {
		return neme;
	}
	public void setNeme(String neme) {
		this.neme = neme;
	}

	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String neme;
	private Type type;

	public String toString() {
       return "{neme:" + getNeme() + ", type:" + getType() + "}";
   }
}
