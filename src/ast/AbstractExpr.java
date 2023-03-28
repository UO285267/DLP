/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

public abstract class AbstractExpr extends AbstractAST implements Expr {
    private Type type;

    private boolean lValue;
    @Override
    public Type getType() {
        return type;
    }
    @Override
    public void setType(Type type) {
        this.type = type;
    }
    
    @Override
    public boolean isLValue() {
        
        return lValue;
    }
    @Override
    public void setLValue(boolean lValue) {
        this.lValue = lValue;
        
    }

    
}
