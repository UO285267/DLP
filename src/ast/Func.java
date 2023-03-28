/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import org.antlr.v4.runtime.*;

import visitor.*;

//	func:def -> name:String  parameter:parameter*  retorno:type  def:def*  sentence:sentence*

public class Func extends AbstractDef {

	public Func(String name, List<Parameter> parameter, Type retorno, List<DefVar> defvar, List<Sentence> sentence) {
		this.name = name;
		this.parameter = parameter;
		this.retorno = retorno;
		this.defvar = defvar;
		this.sentence = sentence;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(parameter, retorno, defvar, sentence);
	}

	public Func(Object name, Object parameter, Object retorno, Object defvar, Object sentence) {
		this.name = (name instanceof Token) ? ((Token)name).getText() : (String) name;
		this.parameter = this.<Parameter>getAstFromContexts(parameter);
		this.retorno = (Type) getAST(retorno);
		this.defvar = this.<DefVar>getAstFromContexts(defvar);
		this.sentence = this.<Sentence>getAstFromContexts(sentence);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(name, parameter, retorno, defvar, sentence);
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

	public List<DefVar> getDefvar() {
		return defvar;
	}
	public void setDefvar(List<DefVar> defvar) {
		this.defvar = defvar;
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
	private List<DefVar> defvar;
	private List<Sentence> sentence;

	public String toString() {
       return "{name:" + getName() + ", parameter:" + getParameter() + ", retorno:" + getRetorno() + ", defvar:" + getDefvar() + ", sentence:" + getSentence() + "}";
   }

	@Override
	public Type getType() {
		if(retorno != null)
			return retorno;
		return new VoidType();
	}
}
