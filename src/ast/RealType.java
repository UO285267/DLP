/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import visitor.*;

//	realType:type -> 

public class RealType extends AbstractType {

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}


	public String toString() {
       return "{RealType}";
   }
   @Override
	public boolean esPrimitivo() {
		return true ; 
	}

	@Override
	public boolean isNumber(){
		return true;
	}
	@Override
	public int getSize() {
		return 4;
	}

	@Override
	public char getSuffix() { 
		return 'f'; 
	} 
	@Override
	public String getMAPLName() { 
		return "float"; 
	} 
}
