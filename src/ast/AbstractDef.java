/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import semantic.Ambito;

public abstract class AbstractDef extends AbstractAST implements Def {

    @Override
    public Type getType() {
        // TODO Auto-generated method stub
        return null;
    }

    public Ambito getAmbito() {
        return ambito;
    }

    public void setAmbito(Ambito ambito) {
        this.ambito = ambito;
    }
    private int address;

	public int getAddress() {
		return address;
	}

	public void setAddress(int addres) {
		this.address = addres;
	}
    private Ambito ambito;


}
