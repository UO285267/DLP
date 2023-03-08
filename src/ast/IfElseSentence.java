/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	ifElseSentence:sentence -> condition:expr  iftrue:sentence*  else1:sentence*

public class IfElseSentence extends AbstractSentence {

	public IfElseSentence(Expr condition, List<Sentence> iftrue, List<Sentence> else1) {
		this.condition = condition;
		this.iftrue = iftrue;
		this.else1 = else1;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condition, iftrue, else1);
	}

	public IfElseSentence(Object condition, Object iftrue, Object else1) {
		this.condition = (Expr) getAST(condition);
		this.iftrue = this.<Sentence>getAstFromContexts(iftrue);
		this.else1 = this.<Sentence>getAstFromContexts(else1);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condition, iftrue, else1);
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

	public List<Sentence> getElse1() {
		return else1;
	}
	public void setElse1(List<Sentence> else1) {
		this.else1 = else1;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expr condition;
	private List<Sentence> iftrue;
	private List<Sentence> else1;

	public String toString() {
       return "{condition:" + getCondition() + ", iftrue:" + getIftrue() + ", else1:" + getElse1() + "}";
   }
}
