/*
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Inject
	private MyDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getOperationAccess().getAlternatives(), "rule__Operation__Alternatives");
					put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getStringTypeAccess().getAlternatives(), "rule__StringType__Alternatives");
					put(grammarAccess.getLoopAccess().getAlternatives(), "rule__Loop__Alternatives");
					put(grammarAccess.getConditionAccess().getAlternatives_1(), "rule__Condition__Alternatives_1");
					put(grammarAccess.getAddConditionAccess().getOpAlternatives_0_0(), "rule__AddCondition__OpAlternatives_0_0");
					put(grammarAccess.getEltTypeAccess().getAlternatives(), "rule__EltType__Alternatives");
					put(grammarAccess.getComparableEltAccess().getAlternatives(), "rule__ComparableElt__Alternatives");
					put(grammarAccess.getTextAccess().getAlternatives(), "rule__Text__Alternatives");
					put(grammarAccess.getProgramAccess().getGroup(), "rule__Program__Group__0");
					put(grammarAccess.getBrowser_TaskAccess().getGroup(), "rule__Browser_Task__Group__0");
					put(grammarAccess.getClickAccess().getGroup(), "rule__Click__Group__0");
					put(grammarAccess.getGoAccess().getGroup(), "rule__Go__Group__0");
					put(grammarAccess.getFillAccess().getGroup(), "rule__Fill__Group__0");
					put(grammarAccess.getSelectAccess().getGroup(), "rule__Select__Group__0");
					put(grammarAccess.getVerifyAccess().getGroup(), "rule__Verify__Group__0");
					put(grammarAccess.getApply_AllAccess().getGroup(), "rule__Apply_All__Group__0");
					put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
					put(grammarAccess.getIfAccess().getGroup_8(), "rule__If__Group_8__0");
					put(grammarAccess.getStoreAccess().getGroup(), "rule__Store__Group__0");
					put(grammarAccess.getCallFunctionAccess().getGroup(), "rule__CallFunction__Group__0");
					put(grammarAccess.getFuncVarAccess().getGroup(), "rule__FuncVar__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getForLoopAccess().getGroup(), "rule__ForLoop__Group__0");
					put(grammarAccess.getWhileLoopAccess().getGroup(), "rule__WhileLoop__Group__0");
					put(grammarAccess.getDoLoopAccess().getGroup(), "rule__DoLoop__Group__0");
					put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
					put(grammarAccess.getAddConditionAccess().getGroup(), "rule__AddCondition__Group__0");
					put(grammarAccess.getElementsAccess().getGroup(), "rule__Elements__Group__0");
					put(grammarAccess.getElementAccess().getGroup(), "rule__Element__Group__0");
					put(grammarAccess.getTagAccess().getGroup(), "rule__Tag__Group__0");
					put(grammarAccess.getSimpleOpAccess().getGroup(), "rule__SimpleOp__Group__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getProgramAccess().getFuncAssignment_0(), "rule__Program__FuncAssignment_0");
					put(grammarAccess.getProgramAccess().getBAssignment_1(), "rule__Program__BAssignment_1");
					put(grammarAccess.getBrowser_TaskAccess().getNameAssignment_3(), "rule__Browser_Task__NameAssignment_3");
					put(grammarAccess.getBrowser_TaskAccess().getOperationsAssignment_4(), "rule__Browser_Task__OperationsAssignment_4");
					put(grammarAccess.getClickAccess().getEltAssignment_1(), "rule__Click__EltAssignment_1");
					put(grammarAccess.getGoAccess().getLinkAssignment_1(), "rule__Go__LinkAssignment_1");
					put(grammarAccess.getFillAccess().getEltAssignment_2(), "rule__Fill__EltAssignment_2");
					put(grammarAccess.getFillAccess().getFillwithAssignment_4(), "rule__Fill__FillwithAssignment_4");
					put(grammarAccess.getSelectAccess().getEltAssignment_1(), "rule__Select__EltAssignment_1");
					put(grammarAccess.getVerifyAccess().getEltAssignment_2(), "rule__Verify__EltAssignment_2");
					put(grammarAccess.getVerifyAccess().getFindAssignment_4(), "rule__Verify__FindAssignment_4");
					put(grammarAccess.getApply_AllAccess().getEltAssignment_2(), "rule__Apply_All__EltAssignment_2");
					put(grammarAccess.getApply_AllAccess().getActionsAssignment_4(), "rule__Apply_All__ActionsAssignment_4");
					put(grammarAccess.getIfAccess().getCondAssignment_2(), "rule__If__CondAssignment_2");
					put(grammarAccess.getIfAccess().getAddAssignment_3(), "rule__If__AddAssignment_3");
					put(grammarAccess.getIfAccess().getOperationsAssignment_6(), "rule__If__OperationsAssignment_6");
					put(grammarAccess.getIfAccess().getOperationsbisAssignment_8_2(), "rule__If__OperationsbisAssignment_8_2");
					put(grammarAccess.getStoreAccess().getVariAssignment_2(), "rule__Store__VariAssignment_2");
					put(grammarAccess.getStoreAccess().getTAssignment_4(), "rule__Store__TAssignment_4");
					put(grammarAccess.getCallFunctionAccess().getNameAssignment_2(), "rule__CallFunction__NameAssignment_2");
					put(grammarAccess.getCallFunctionAccess().getVarsAssignment_4(), "rule__CallFunction__VarsAssignment_4");
					put(grammarAccess.getTypeAccess().getTextAssignment_0(), "rule__Type__TextAssignment_0");
					put(grammarAccess.getTypeAccess().getEltsAssignment_1(), "rule__Type__EltsAssignment_1");
					put(grammarAccess.getTypeAccess().getEltAssignment_2(), "rule__Type__EltAssignment_2");
					put(grammarAccess.getTypeAccess().getCondAssignment_3(), "rule__Type__CondAssignment_3");
					put(grammarAccess.getStringTypeAccess().getTextAssignment_0(), "rule__StringType__TextAssignment_0");
					put(grammarAccess.getStringTypeAccess().getEltsAssignment_1(), "rule__StringType__EltsAssignment_1");
					put(grammarAccess.getStringTypeAccess().getEltAssignment_2(), "rule__StringType__EltAssignment_2");
					put(grammarAccess.getStringTypeAccess().getCondAssignment_3(), "rule__StringType__CondAssignment_3");
					put(grammarAccess.getFuncVarAccess().getTypeAssignment_0(), "rule__FuncVar__TypeAssignment_0");
					put(grammarAccess.getFuncVarAccess().getNameAssignment_1(), "rule__FuncVar__NameAssignment_1");
					put(grammarAccess.getFunctionAccess().getNameAssignment_3(), "rule__Function__NameAssignment_3");
					put(grammarAccess.getFunctionAccess().getVarsAssignment_8(), "rule__Function__VarsAssignment_8");
					put(grammarAccess.getFunctionAccess().getOperationsAssignment_11(), "rule__Function__OperationsAssignment_11");
					put(grammarAccess.getForLoopAccess().getStartAssignment_2(), "rule__ForLoop__StartAssignment_2");
					put(grammarAccess.getForLoopAccess().getEndAssignment_4(), "rule__ForLoop__EndAssignment_4");
					put(grammarAccess.getForLoopAccess().getStepAssignment_6(), "rule__ForLoop__StepAssignment_6");
					put(grammarAccess.getForLoopAccess().getOperationsAssignment_9(), "rule__ForLoop__OperationsAssignment_9");
					put(grammarAccess.getWhileLoopAccess().getCAssignment_2(), "rule__WhileLoop__CAssignment_2");
					put(grammarAccess.getWhileLoopAccess().getAddAssignment_3(), "rule__WhileLoop__AddAssignment_3");
					put(grammarAccess.getWhileLoopAccess().getOperationsAssignment_6(), "rule__WhileLoop__OperationsAssignment_6");
					put(grammarAccess.getDoLoopAccess().getCAssignment_2(), "rule__DoLoop__CAssignment_2");
					put(grammarAccess.getDoLoopAccess().getAddAssignment_3(), "rule__DoLoop__AddAssignment_3");
					put(grammarAccess.getDoLoopAccess().getOperationsAssignment_6(), "rule__DoLoop__OperationsAssignment_6");
					put(grammarAccess.getAddConditionAccess().getOpAssignment_0(), "rule__AddCondition__OpAssignment_0");
					put(grammarAccess.getAddConditionAccess().getCondAssignment_1(), "rule__AddCondition__CondAssignment_1");
					put(grammarAccess.getElementsAccess().getTypeAssignment_1(), "rule__Elements__TypeAssignment_1");
					put(grammarAccess.getElementAccess().getTypeAssignment_1(), "rule__Element__TypeAssignment_1");
					put(grammarAccess.getTagAccess().getHtmlAssignment_1(), "rule__Tag__HtmlAssignment_1");
					put(grammarAccess.getTagAccess().getTagAssignment_2(), "rule__Tag__TagAssignment_2");
					put(grammarAccess.getSimpleOpAccess().getElt1Assignment_1(), "rule__SimpleOp__Elt1Assignment_1");
					put(grammarAccess.getSimpleOpAccess().getOpAssignment_2(), "rule__SimpleOp__OpAssignment_2");
					put(grammarAccess.getSimpleOpAccess().getElt2Assignment_3(), "rule__SimpleOp__Elt2Assignment_3");
					put(grammarAccess.getComparableEltAccess().getInteAssignment_0(), "rule__ComparableElt__InteAssignment_0");
					put(grammarAccess.getComparableEltAccess().getTextAssignment_1(), "rule__ComparableElt__TextAssignment_1");
					put(grammarAccess.getTextAccess().getVariAssignment_0(), "rule__Text__VariAssignment_0");
					put(grammarAccess.getTextAccess().getNameAssignment_1(), "rule__Text__NameAssignment_1");
					put(grammarAccess.getVariableAccess().getNameAssignment_1(), "rule__Variable__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalMyDslParser typedParser = (InternalMyDslParser) parser;
			typedParser.entryRuleProgram();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
