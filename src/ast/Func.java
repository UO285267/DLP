/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	func -> name:String  parameter:parameter*  retorno:type  def:def*  sentence:sentence*

public class Func extends AbstractAST  {

	public Func(String name, List<Parameter> parameter, Type retorno, List<Def> def, List<Sentence> sentence) {
		this.name = name;
		this.parameter = parameter;
		this.retorno = retorno;
		this.def = def;
		this.sentence = sentence;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(parameter, retorno, def, sentence);
	}

	public Func(Object name, Object parameter, Object retorno, Object def, Object sentence) {
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;
		this.parameter = this.<Parameter>getAstFromContexts(parameter);
		this.retorno = (Type) getAST(retorno);
		this.def = this.<Def>getAstFromContexts(def);
		this.sentence = this.<Sentence>getAstFromContexts(sentence);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, parameter, retorno, def, sentence);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Parameter> getParameter() {
		return parameter;
	}
	public void setParameter(List<Parameter> parameter) {
		this.parameter = parameter;
	}

	public Type getRetorno() {
		return retorno;
	}
	public void setRetorno(Type retorno) {
		this.retorno = retorno;
	}

	public List<Def> getDef() {
		return def;
	}
	public void setDef(List<Def> def) {
		this.def = def;
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

	private String name;
	private List<Parameter> parameter;
	private Type retorno;
	private List<Def> def;
	private List<Sentence> sentence;

	public String toString() {
       return "{name:" + getName() + ", parameter:" + getParameter() + ", retorno:" + getRetorno() + ", def:" + getDef() + ", sentence:" + getSentence() + "}";
   }
}
