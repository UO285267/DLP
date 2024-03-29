/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import org.antlr.v4.runtime.*;

import visitor.*;

//	structType:type -> name:String

public class StructType extends AbstractType {

	public StructType(String name) {
		this.name = name;
	}

	public StructType(Object name) {
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private DefStruct struct;
	public DefStruct getStruct() {
		return struct;
	}

	public void setStruct(DefStruct struct) {
		this.struct = struct;
	}
	

	private String name;

	public String toString() {
       return "{name:" + getName() + "}";
   }

	@Override
	public boolean esPrimitivo() {
		return false ;
	}

	@Override
	public int getSize() {
		int size = 0 ;
		for (Parameter par : struct.getParameter()) {
			size += par.getType().getSize();
		}
		return size; 
	}

	@Override
	public String getMAPLName() { 
		return getName(); 
	} 
}
