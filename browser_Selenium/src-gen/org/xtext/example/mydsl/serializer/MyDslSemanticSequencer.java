/*
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.AddCondition;
import org.xtext.example.mydsl.myDsl.Apply_All;
import org.xtext.example.mydsl.myDsl.Browser_Task;
import org.xtext.example.mydsl.myDsl.CallFunction;
import org.xtext.example.mydsl.myDsl.Click;
import org.xtext.example.mydsl.myDsl.ComparableElt;
import org.xtext.example.mydsl.myDsl.DoLoop;
import org.xtext.example.mydsl.myDsl.Element;
import org.xtext.example.mydsl.myDsl.Fill;
import org.xtext.example.mydsl.myDsl.ForLoop;
import org.xtext.example.mydsl.myDsl.Function;
import org.xtext.example.mydsl.myDsl.Go;
import org.xtext.example.mydsl.myDsl.If;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Program;
import org.xtext.example.mydsl.myDsl.Select;
import org.xtext.example.mydsl.myDsl.SimpleOp;
import org.xtext.example.mydsl.myDsl.Store;
import org.xtext.example.mydsl.myDsl.Tag;
import org.xtext.example.mydsl.myDsl.Text;
import org.xtext.example.mydsl.myDsl.Variable;
import org.xtext.example.mydsl.myDsl.Verify;
import org.xtext.example.mydsl.myDsl.WhileLoop;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.ADD_CONDITION:
				sequence_AddCondition(context, (AddCondition) semanticObject); 
				return; 
			case MyDslPackage.APPLY_ALL:
				sequence_Apply_All(context, (Apply_All) semanticObject); 
				return; 
			case MyDslPackage.BROWSER_TASK:
				sequence_Browser_Task(context, (Browser_Task) semanticObject); 
				return; 
			case MyDslPackage.CALL_FUNCTION:
				sequence_CallFunction(context, (CallFunction) semanticObject); 
				return; 
			case MyDslPackage.CLICK:
				sequence_Click(context, (Click) semanticObject); 
				return; 
			case MyDslPackage.COMPARABLE_ELT:
				sequence_ComparableElt(context, (ComparableElt) semanticObject); 
				return; 
			case MyDslPackage.DO_LOOP:
				sequence_DoLoop(context, (DoLoop) semanticObject); 
				return; 
			case MyDslPackage.ELEMENT:
				sequence_Element(context, (Element) semanticObject); 
				return; 
			case MyDslPackage.FILL:
				sequence_Fill(context, (Fill) semanticObject); 
				return; 
			case MyDslPackage.FOR_LOOP:
				sequence_ForLoop(context, (ForLoop) semanticObject); 
				return; 
			case MyDslPackage.FUNCTION:
				sequence_Function(context, (Function) semanticObject); 
				return; 
			case MyDslPackage.GO:
				sequence_Go(context, (Go) semanticObject); 
				return; 
			case MyDslPackage.IF:
				sequence_If(context, (If) semanticObject); 
				return; 
			case MyDslPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case MyDslPackage.SELECT:
				sequence_Select(context, (Select) semanticObject); 
				return; 
			case MyDslPackage.SIMPLE_OP:
				sequence_SimpleOp(context, (SimpleOp) semanticObject); 
				return; 
			case MyDslPackage.STORE:
				sequence_Store(context, (Store) semanticObject); 
				return; 
			case MyDslPackage.TAG:
				sequence_Tag(context, (Tag) semanticObject); 
				return; 
			case MyDslPackage.TEXT:
				sequence_Text(context, (Text) semanticObject); 
				return; 
			case MyDslPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case MyDslPackage.VERIFY:
				sequence_Verify(context, (Verify) semanticObject); 
				return; 
			case MyDslPackage.WHILE_LOOP:
				sequence_WhileLoop(context, (WhileLoop) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AddCondition returns AddCondition
	 *
	 * Constraint:
	 *     ((op='And' | op='Or') cond=Condition)
	 */
	protected void sequence_AddCondition(ISerializationContext context, AddCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Apply_All
	 *     Apply_All returns Apply_All
	 *
	 * Constraint:
	 *     (elt=Element operations+=Operation*)
	 */
	protected void sequence_Apply_All(ISerializationContext context, Apply_All semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Browser_Task returns Browser_Task
	 *
	 * Constraint:
	 *     (name=STRING operations+=Operation*)
	 */
	protected void sequence_Browser_Task(ISerializationContext context, Browser_Task semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns CallFunction
	 *     CallFunction returns CallFunction
	 *
	 * Constraint:
	 *     vars+=Variable+
	 */
	protected void sequence_CallFunction(ISerializationContext context, CallFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Click
	 *     Action returns Click
	 *     Click returns Click
	 *
	 * Constraint:
	 *     elt=Element
	 */
	protected void sequence_Click(ISerializationContext context, Click semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.CLICK__ELT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.CLICK__ELT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClickAccess().getEltElementParserRuleCall_1_0(), semanticObject.getElt());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ComparableElt returns ComparableElt
	 *
	 * Constraint:
	 *     (inte=INT | text=Text)
	 */
	protected void sequence_ComparableElt(ISerializationContext context, ComparableElt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns DoLoop
	 *     Loop returns DoLoop
	 *     DoLoop returns DoLoop
	 *
	 * Constraint:
	 *     (c=Condition add+=AddCondition* operations+=Operation*)
	 */
	protected void sequence_DoLoop(ISerializationContext context, DoLoop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Element returns Element
	 *
	 * Constraint:
	 *     type=EltType
	 */
	protected void sequence_Element(ISerializationContext context, Element semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ELEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ELEMENT__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElementAccess().getTypeEltTypeParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Fill
	 *     Action returns Fill
	 *     Fill returns Fill
	 *
	 * Constraint:
	 *     (elt=Element fillwith=Text)
	 */
	protected void sequence_Fill(ISerializationContext context, Fill semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FILL__ELT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FILL__ELT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.FILL__FILLWITH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.FILL__FILLWITH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFillAccess().getEltElementParserRuleCall_2_0(), semanticObject.getElt());
		feeder.accept(grammarAccess.getFillAccess().getFillwithTextParserRuleCall_4_0(), semanticObject.getFillwith());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns ForLoop
	 *     Loop returns ForLoop
	 *     ForLoop returns ForLoop
	 *
	 * Constraint:
	 *     (start=INT end=INT step=INT operations+=Operation*)
	 */
	protected void sequence_ForLoop(ISerializationContext context, ForLoop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Function returns Function
	 *
	 * Constraint:
	 *     (name=STRING vars+=Variable* operations+=Operation*)
	 */
	protected void sequence_Function(ISerializationContext context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Go
	 *     Action returns Go
	 *     Go returns Go
	 *
	 * Constraint:
	 *     link=Text
	 */
	protected void sequence_Go(ISerializationContext context, Go semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.GO__LINK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.GO__LINK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGoAccess().getLinkTextParserRuleCall_1_0(), semanticObject.getLink());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns If
	 *     If returns If
	 *
	 * Constraint:
	 *     (cond=Condition add+=AddCondition* operations+=Operation* operationsbis+=Operation*)
	 */
	protected void sequence_If(ISerializationContext context, If semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     (func+=Function* b=Browser_Task)
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Select
	 *     Action returns Select
	 *     Select returns Select
	 *
	 * Constraint:
	 *     elt=Element
	 */
	protected void sequence_Select(ISerializationContext context, Select semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SELECT__ELT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SELECT__ELT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSelectAccess().getEltElementParserRuleCall_1_0(), semanticObject.getElt());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns SimpleOp
	 *     SimpleOp returns SimpleOp
	 *
	 * Constraint:
	 *     (elt1=ComparableElt op=OP elt2=ComparableElt)
	 */
	protected void sequence_SimpleOp(ISerializationContext context, SimpleOp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SIMPLE_OP__ELT1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SIMPLE_OP__ELT1));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SIMPLE_OP__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SIMPLE_OP__OP));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SIMPLE_OP__ELT2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SIMPLE_OP__ELT2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSimpleOpAccess().getElt1ComparableEltParserRuleCall_1_0(), semanticObject.getElt1());
		feeder.accept(grammarAccess.getSimpleOpAccess().getOpOPTerminalRuleCall_2_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getSimpleOpAccess().getElt2ComparableEltParserRuleCall_3_0(), semanticObject.getElt2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Store
	 *     Store returns Store
	 *
	 * Constraint:
	 *     (var=STRING (text=Text | elt=Element))
	 */
	protected void sequence_Store(ISerializationContext context, Store semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EltType returns Tag
	 *     Tag returns Tag
	 *
	 * Constraint:
	 *     (html=HTML_ELT tag=Text)
	 */
	protected void sequence_Tag(ISerializationContext context, Tag semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TAG__HTML) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TAG__HTML));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.TAG__TAG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.TAG__TAG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTagAccess().getHtmlHTML_ELTTerminalRuleCall_1_0(), semanticObject.getHtml());
		feeder.accept(grammarAccess.getTagAccess().getTagTextParserRuleCall_2_0(), semanticObject.getTag());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Text returns Text
	 *
	 * Constraint:
	 *     (vari=Variable | name=STRING)
	 */
	protected void sequence_Text(ISerializationContext context, Text semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Condition returns Variable
	 *     EltType returns Variable
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.VARIABLE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns Verify
	 *     Action returns Verify
	 *     Verify returns Verify
	 *     Condition returns Verify
	 *
	 * Constraint:
	 *     (elt=Element find=Text)
	 */
	protected void sequence_Verify(ISerializationContext context, Verify semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.VERIFY__ELT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.VERIFY__ELT));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.VERIFY__FIND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.VERIFY__FIND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVerifyAccess().getEltElementParserRuleCall_2_0(), semanticObject.getElt());
		feeder.accept(grammarAccess.getVerifyAccess().getFindTextParserRuleCall_4_0(), semanticObject.getFind());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Operation returns WhileLoop
	 *     Loop returns WhileLoop
	 *     WhileLoop returns WhileLoop
	 *
	 * Constraint:
	 *     (c=Condition add+=AddCondition* operations+=Operation*)
	 */
	protected void sequence_WhileLoop(ISerializationContext context, WhileLoop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
