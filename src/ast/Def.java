/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import semantic.Ambito;

public interface Def extends AST {
    public Type getType();
    
    void setAmbito(Ambito ambito);
    String getName();
    

}
