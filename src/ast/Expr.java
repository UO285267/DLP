/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

public interface Expr extends AST {
    

    public void setType(Type type); 
    public Type getType(); 

    public void setLValue(boolean lValue );
    public boolean isLValue();

}
