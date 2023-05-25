package ast;

import visitor.Visitor;

public class BoolType extends AbstractType {

    @Override
    public int getSize() {
       
        return 2;
    }

    @Override
    public String getMAPLName() {
       
        return "int";
    }

    @Override
	public boolean esPrimitivo() {
		return true ; 
	}
    @Override
	public char getSuffix() { 
		return 'i'; 
	} 

    @Override
    public Object accept(Visitor visitor, Object param) {
        return visitor.visit(this, param);
    }
    
}
