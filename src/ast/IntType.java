/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import visitor.*;

//	intType:type -> 

public class IntType extends AbstractType {

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}


	public String toString() {
       return "{IntType}";
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
		return 2;
	}


	@Override
	public char getSuffix() { 
		return 'i'; 
	} 

	@Override
	public String getMAPLName() { 
		return "int"; 
	} 
}
