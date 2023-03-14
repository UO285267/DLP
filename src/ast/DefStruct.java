/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	defStruct:def -> name:String  parameter:parameter*

public class DefStruct extends AbstractDef {

	public DefStruct(String name, List<Parameter> parameter) {
		this.name = name;
		this.parameter = parameter;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(parameter);
	}

	public DefStruct(Object name, Object parameter) {
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;
		this.parameter = this.<Parameter>getAstFromContexts(parameter);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, parameter);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Parameter> getParameter() {
		return parameter;
	}
	public void setParameter(List<Parameter> parameter) {
		this.parameter = parameter;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private String name;
	private List<Parameter> parameter;

	public String toString() {
       return "{name:" + getName() + ", parameter:" + getParameter() + "}";
   }


}
