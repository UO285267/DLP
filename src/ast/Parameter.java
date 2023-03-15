/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	parameter:def -> neme:String  type:type

public class Parameter extends AbstractDef {

	public Parameter(String neme, Type type) {
		this.name = neme;
		this.type = type;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(type);
	}

	public Parameter(Object neme, Object type) {
		this.name = (neme instanceof Token) ? ((Token)neme).getText() : (String) neme;
		this.type = (Type) getAST(type);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(neme, type);
	}

	public String getName() {
		return name;
	}
	public void setName(String neme) {
		this.name = neme;
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

	private String name;
	private Type type;
	private Def definicion;

	public Def getDefinicion(){
		return definicion;
	}

	public void setDefinicion(Def def){
		definicion = def;
	}
	public String toString() {
       return "{neme:" + getName() + ", type:" + getType() + "}";
   }

	
}
