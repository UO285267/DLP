/**
 * @generated VGen (for ANTLR) 1.7.2
 */

package visitor;

import ast.*;

public interface Visitor {
	public Object visit(Program node, Object param);
	public Object visit(Func node, Object param);
	public Object visit(Def node, Object param);
	public Object visit(Parameter node, Object param);
	public Object visit(IntType node, Object param);
	public Object visit(RealType node, Object param);
	public Object visit(CharType node, Object param);
	public Object visit(ArrayType node, Object param);
	public Object visit(StructType node, Object param);
	public Object visit(VoidType node, Object param);
	public Object visit(Print node, Object param);
	public Object visit(Read node, Object param);
	public Object visit(Assignment node, Object param);
	public Object visit(IfSentence node, Object param);
	public Object visit(IfElseSentence node, Object param);
	public Object visit(WhileSentence node, Object param);
	public Object visit(ReturnNode node, Object param);
	public Object visit(FuncCall node, Object param);
	public Object visit(ExprAritmetica node, Object param);
	public Object visit(ExprLogica node, Object param);
	public Object visit(Acces node, Object param);
	public Object visit(ArrayAcces node, Object param);
	public Object visit(Cast node, Object param);
	public Object visit(LitEnt node, Object param);
	public Object visit(LitReal node, Object param);
	public Object visit(LitChar node, Object param);
	public Object visit(Variable node, Object param);
	public Object visit(MethodCallExpr node, Object param);
}
