/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import visitor.*;

//	program -> def:def*  func:func*

public class Program extends AbstractAST  {

	public Program(List<Def> def, List<Func> func) {
		this.def = def;
		this.func = func;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(def, func);
	}

	public Program(Object def, Object func) {
		this.def = this.<Def>getAstFromContexts(def);
		this.func = this.<Func>getAstFromContexts(func);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(def, func);
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

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private List<Def> def;
	private List<Func> func;

	public String toString() {
       return "{def:" + getDef() + ", func:" + getFunc() + "}";
   }
}
