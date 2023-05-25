/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package visitor;

import ast.*;
import java.util.*;

/*
DefaultVisitor. Implementación base del visitor para ser derivada por nuevos visitor.
	No modificar esta clase. Para crear nuevos visitor usar el fichero "_PlantillaParaVisitors.txt".
	DefaultVisitor ofrece una implementación por defecto de cada nodo que se limita a visitar los nodos hijos.
*/
public class DefaultVisitor implements Visitor {

	//	class Program { List<AST> ast; }
	public Object visit(Program node, Object param) {
		visitChildren(node.getAst(), param);
		return null;
	}

	//	class Func { String name;  List<Parameter> parameter;  Type retorno;  List<DefVar> defvar;  List<Sentence> sentence; }
	public Object visit(Func node, Object param) {
		visitChildren(node.getParameter(), param);
		if (node.getRetorno() != null)
			node.getRetorno().accept(this, param);
		visitChildren(node.getDefvar(), param);
		visitChildren(node.getSentence(), param);
		return null;
	}

	//	class DefVar { String name;  Type type; }
	public Object visit(DefVar node, Object param) {
		if (node.getType() != null)
			node.getType().accept(this, param);
		return null;
	}

	//	class Parameter { String name;  Type type; }
	public Object visit(Parameter node, Object param) {
		if (node.getType() != null)
			node.getType().accept(this, param);
		return null;
	}

	//	class DefStruct { String name;  List<Parameter> parameter; }
	public Object visit(DefStruct node, Object param) {
		visitChildren(node.getParameter(), param);
		return null;
	}

	//	class IntType {  }
	public Object visit(IntType node, Object param) {
		return null;
	}

	//	class RealType {  }
	public Object visit(RealType node, Object param) {
		return null;
	}

	public Object visit(BoolType node, Object param) {
		return null;
	}

	//	class CharType {  }
	public Object visit(CharType node, Object param) {
		return null;
	}

	//	class ArrayType { int index;  Type type; }
	public Object visit(ArrayType node, Object param) {
		if (node.getType() != null)
			node.getType().accept(this, param);
		return null;
	}

	//	class StructType { String name; }
	public Object visit(StructType node, Object param) {
		return null;
	}

	//	class VoidType {  }
	public Object visit(VoidType node, Object param) {
		return null;
	}

	//	class Print { String string;  Expr expr; }
	public Object visit(Print node, Object param) {
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		return null;
	}

	//	class Read { Expr expr; }
	public Object visit(Read node, Object param) {
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		return null;
	}

	//	class Assignment { Expr left;  Expr right; }
	public Object visit(Assignment node, Object param) {
		if (node.getLeft() != null)
			node.getLeft().accept(this, param);
		if (node.getRight() != null)
			node.getRight().accept(this, param);
		return null;
	}

	//	class IfSentence { Expr condition;  List<Sentence> iftrue; }
	public Object visit(IfSentence node, Object param) {
		if (node.getCondition() != null)
			node.getCondition().accept(this, param);
		visitChildren(node.getIftrue(), param);
		return null;
	}

	//	class IfElseSentence { Expr condition;  List<Sentence> iftrue;  List<Sentence> else1; }
	public Object visit(IfElseSentence node, Object param) {
		if (node.getCondition() != null)
			node.getCondition().accept(this, param);
		visitChildren(node.getIftrue(), param);
		visitChildren(node.getElse1(), param);
		return null;
	}

	//	class WhileSentence { Expr condition;  List<Sentence> sentence; }
	public Object visit(WhileSentence node, Object param) {
		if (node.getCondition() != null)
			node.getCondition().accept(this, param);
		visitChildren(node.getSentence(), param);
		return null;
	}

	//	class ReturnNode { Expr expr; }
	public Object visit(ReturnNode node, Object param) {
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		return null;
	}

	//	class FuncCall { String name;  List<Expr> args; }
	public Object visit(FuncCall node, Object param) {
		visitChildren(node.getArgs(), param);
		return null;
	}

	//	class ExprAritmetica { Expr left;  String op;  Expr right; }
	public Object visit(ExprAritmetica node, Object param) {
		if (node.getLeft() != null)
			node.getLeft().accept(this, param);
		if (node.getRight() != null)
			node.getRight().accept(this, param);
		return null;
	}

	//	class ExprLogica { Expr left;  String op;  Expr right; }
	public Object visit(ExprLogica node, Object param) {
		if (node.getLeft() != null)
			node.getLeft().accept(this, param);
		if (node.getRight() != null)
			node.getRight().accept(this, param);
		return null;
	}

	//	class ExprLogicaNe { Expr expr; }
	public Object visit(ExprLogicaNe node, Object param) {
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		return null;
	}

	//	class Acces { Expr left;  String right; }
	public Object visit(Acces node, Object param) {
		if (node.getLeft() != null)
			node.getLeft().accept(this, param);
		return null;
	}

	//	class ArrayAcces { Expr left;  Expr right; }
	public Object visit(ArrayAcces node, Object param) {
		if (node.getLeft() != null)
			node.getLeft().accept(this, param);
		if (node.getRight() != null)
			node.getRight().accept(this, param);
		return null;
	}

	//	class Cast { Type typeToConvert;  Expr expr; }
	public Object visit(Cast node, Object param) {
		if (node.getTypeToConvert() != null)
			node.getTypeToConvert().accept(this, param);
		if (node.getExpr() != null)
			node.getExpr().accept(this, param);
		return null;
	}

	//	class LitEnt { String string; }
	public Object visit(LitEnt node, Object param) {
		return null;
	}

	//	class LitReal { String string; }
	public Object visit(LitReal node, Object param) {
		return null;
	}

	//	class LitChar { String string; }
	public Object visit(LitChar node, Object param) {
		return null;
	}

	public Object visit(LitBool node, Object param) {
		return null;
	}

	//	class Variable { String string; }
	public Object visit(Variable node, Object param) {
		return null;
	}

	//	class MethodCallExpr { String name;  List<Expr> args; }
	public Object visit(MethodCallExpr node, Object param) {
		visitChildren(node.getArgs(), param);
		return null;
	}

    // Método auxiliar -----------------------------
    protected void visitChildren(List<? extends AST> children, Object param) {
        if (children != null)
            for (AST child : children)
                child.accept(this, param);
    }
}
