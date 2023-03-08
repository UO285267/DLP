/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	ifSentence:sentence -> condition:expr  iftrue:sentence*

public class IfSentence extends AbstractSentence {

	public IfSentence(Expr condition, List<Sentence> iftrue) {
		this.condition = condition;
		this.iftrue = iftrue;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condition, iftrue);
	}

	public IfSentence(Object condition, Object iftrue) {
		this.condition = (Expr) getAST(condition);
		this.iftrue = this.<Sentence>getAstFromContexts(iftrue);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condition, iftrue);
	}

	public Expr getCondition() {
		return condition;
	}
	public void setCondition(Expr condition) {
		this.condition = condition;
	}

	public List<Sentence> getIftrue() {
		return iftrue;
	}
	public void setIftrue(List<Sentence> iftrue) {
		this.iftrue = iftrue;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expr condition;
	private List<Sentence> iftrue;

	public String toString() {
       return "{condition:" + getCondition() + ", iftrue:" + getIftrue() + "}";
   }
}
