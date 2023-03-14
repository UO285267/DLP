/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package ast;

import java.util.*;
import visitor.*;

//	program -> ast:AST*

public class Program extends AbstractAST  {

	public Program(List<AST> ast) {
		this.ast = ast;

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(ast);
	}

	public Program(Object ast) {
		this.ast = this.<AST>getAstFromContexts(ast);

       // Lo siguiente se puede borrar si no se quiere la posicion en el fichero.
       // Obtiene la linea/columna a partir de las de los hijos.
       setPositions(ast);
	}

	public List<AST> getAst() {
		return ast;
	}
	public void setAst(List<AST> ast) {
		this.ast = ast;
	}

	@Override
	public Object accept(Visitor v, Object param) { 
		return v.visit(this, param);
	}

	private List<AST> ast;

	public String toString() {
       return "{ast:" + getAst() + "}";
   }
}
