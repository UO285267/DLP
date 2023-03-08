/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	whileSentence:sentence -> condition:expr  sentence:sentence*

public class WhileSentence extends AbstractSentence {

	public WhileSentence(Expr condition, List<Sentence> sentence) {
		this.condition = condition;
		this.sentence = sentence;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condition, sentence);
	}

	public WhileSentence(Object condition, Object sentence) {
		this.condition = (Expr) getAST(condition);
		this.sentence = this.<Sentence>getAstFromContexts(sentence);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(condition, sentence);
	}

	public Expr getCondition() {
		return condition;
	}
	public void setCondition(Expr condition) {
		this.condition = condition;
	}

	public List<Sentence> getSentence() {
		return sentence;
	}
	public void setSentence(List<Sentence> sentence) {
		this.sentence = sentence;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private Expr condition;
	private List<Sentence> sentence;

	public String toString() {
       return "{condition:" + getCondition() + ", sentence:" + getSentence() + "}";
   }
}
