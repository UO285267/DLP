package ast;
import visitor.*;
import org.antlr.v4.runtime.*;

public class LitBool extends AbstractExpr{

    private String string;

    public LitBool(String string) {
		this.string = string;
	}

	public LitBool(Object string) {
		this.string = (string instanceof Token) ? ((Token)string).getText() : (String) string;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(string);
	}

	public String getString() {
        if(string.equals("false")){
            return "0";
        }
		return "1";
	}
	public void setString(String string) {
		this.string = string;
	}

    @Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}
}
