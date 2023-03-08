/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import visitor.*;

//	program -> def:def*  func:func*  est:structType*

public class Program extends AbstractAST  {

	public Program(List<Def> def, List<Func> func, List<StructType> est) {
		this.def = def;
		this.func = func;
		this.est = est;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(def, func, est);
	}

	public Program(Object def, Object func, Object est) {
		this.def = this.<Def>getAstFromContexts(def);
		this.func = this.<Func>getAstFromContexts(func);
		this.est = this.<StructType>getAstFromContexts(est);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(def, func, est);
	}

	public List<Def> getDef() {
		return def;
	}
	public void setDef(List<Def> def) {
		this.def = def;
	}

	public List<Func> getFunc() {
		return func;
	}
	public void setFunc(List<Func> func) {
		this.func = func;
	}

	public List<StructType> getEst() {
		return est;
	}
	public void setEst(List<StructType> est) {
		this.est = est;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private List<Def> def;
	private List<Func> func;
	private List<StructType> est;

	public String toString() {
       return "{def:" + getDef() + ", func:" + getFunc() + ", est:" + getEst() + "}";
   }
}
