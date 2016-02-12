/*
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MyDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AddCondition_AndKeyword_0_0_or_OrKeyword_0_1;
	protected AbstractElementAlias match_Condition_DoLoop_WhileLoop_______DoWhileKeyword_0_LeftParenthesisKeyword_1___or___WhileKeyword_0_LeftParenthesisKeyword_1_____ConditionKeyword_0__q;
	protected AbstractElementAlias match_DoLoop_WhileLoop___DoWhileKeyword_0_LeftParenthesisKeyword_1___or___WhileKeyword_0_LeftParenthesisKeyword_1__;
	protected AbstractElementAlias match_Element_URLKeyword_1_1_q;
	protected AbstractElementAlias match_If___ElseKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MyDslGrammarAccess) access;
		match_AddCondition_AndKeyword_0_0_or_OrKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAddConditionAccess().getAndKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getAddConditionAccess().getOrKeyword_0_1()));
		match_Condition_DoLoop_WhileLoop_______DoWhileKeyword_0_LeftParenthesisKeyword_1___or___WhileKeyword_0_LeftParenthesisKeyword_1_____ConditionKeyword_0__q = new GroupAlias(false, true, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDoLoopAccess().getDoWhileKeyword_0()), new TokenAlias(false, false, grammarAccess.getDoLoopAccess().getLeftParenthesisKeyword_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getWhileLoopAccess().getWhileKeyword_0()), new TokenAlias(false, false, grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1()))), new TokenAlias(false, false, grammarAccess.getConditionAccess().getConditionKeyword_0()));
		match_DoLoop_WhileLoop___DoWhileKeyword_0_LeftParenthesisKeyword_1___or___WhileKeyword_0_LeftParenthesisKeyword_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getDoLoopAccess().getDoWhileKeyword_0()), new TokenAlias(false, false, grammarAccess.getDoLoopAccess().getLeftParenthesisKeyword_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getWhileLoopAccess().getWhileKeyword_0()), new TokenAlias(false, false, grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1())));
		match_Element_URLKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getElementAccess().getURLKeyword_1_1());
		match_If___ElseKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getIfAccess().getElseKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_8_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getHTML_ELTRule())
			return getHTML_ELTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOPRule())
			return getOPToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal HTML_ELT:
	 * 	'id' | 'class' | 'tag' | 'name'
	 * ;
	 */
	protected String getHTML_ELTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "id";
	}
	
	/**
	 * terminal OP:
	 * 	'<' | '>' | '!=' | '=='
	 * ;
	 */
	protected String getOPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_AddCondition_AndKeyword_0_0_or_OrKeyword_0_1.equals(syntax))
				emit_AddCondition_AndKeyword_0_0_or_OrKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Condition_DoLoop_WhileLoop_______DoWhileKeyword_0_LeftParenthesisKeyword_1___or___WhileKeyword_0_LeftParenthesisKeyword_1_____ConditionKeyword_0__q.equals(syntax))
				emit_Condition_DoLoop_WhileLoop_______DoWhileKeyword_0_LeftParenthesisKeyword_1___or___WhileKeyword_0_LeftParenthesisKeyword_1_____ConditionKeyword_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_DoLoop_WhileLoop___DoWhileKeyword_0_LeftParenthesisKeyword_1___or___WhileKeyword_0_LeftParenthesisKeyword_1__.equals(syntax))
				emit_DoLoop_WhileLoop___DoWhileKeyword_0_LeftParenthesisKeyword_1___or___WhileKeyword_0_LeftParenthesisKeyword_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Element_URLKeyword_1_1_q.equals(syntax))
				emit_Element_URLKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_If___ElseKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q.equals(syntax))
				emit_If___ElseKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'And' | 'Or'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) cond=Condition
	 */
	protected void emit_AddCondition_AndKeyword_0_0_or_OrKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ((('While' '(') | ('DoWhile' '(')) 'Condition')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'FindIf' '(' elt=Element
	 *     (rule start) (ambiguity) 'Verify' '(' elt=Element
	 */
	protected void emit_Condition_DoLoop_WhileLoop_______DoWhileKeyword_0_LeftParenthesisKeyword_1___or___WhileKeyword_0_LeftParenthesisKeyword_1_____ConditionKeyword_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('While' '(') | ('DoWhile' '(')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'Condition' '(' elt1=ComparableElt
	 *     (rule start) (ambiguity) 'Condition' 'FindIf' '(' elt=Element
	 *     (rule start) (ambiguity) 'Condition' 'Var' name=STRING
	 *     (rule start) (ambiguity) 'Condition' 'Verify' '(' elt=Element
	 */
	protected void emit_DoLoop_WhileLoop___DoWhileKeyword_0_LeftParenthesisKeyword_1___or___WhileKeyword_0_LeftParenthesisKeyword_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'URL'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'Element' (ambiguity) (rule start)
	 */
	protected void emit_Element_URLKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('else' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     add+=AddCondition ')' '{' '}' (ambiguity) (rule end)
	 *     cond=Condition ')' '{' '}' (ambiguity) (rule end)
	 *     operations+=Operation '}' (ambiguity) (rule end)
	 */
	protected void emit_If___ElseKeyword_8_0_LeftCurlyBracketKeyword_8_1_RightCurlyBracketKeyword_8_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}