package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HTML_ELT", "RULE_OP", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Selenium'", "'{'", "'Browser'", "'}'", "'Click'", "'Go'", "'Fill'", "'('", "','", "')'", "'Select'", "'Verify'", "'Apply_All'", "'if'", "'else'", "'Store'", "'Var'", "'='", "'func'", "'Text'", "'Elements'", "'Element'", "'Condition'", "'Function'", "'Name'", "'For'", "'While'", "'DoWhile'", "'And'", "'Or'", "'URL'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_OP=8;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_HTML_ELT=7;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMyDsl.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMyDsl.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMyDsl.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyDsl.g:71:1: ruleProgram returns [EObject current=null] : ( ( (lv_func_0_0= ruleFunction ) )* ( (lv_b_1_0= ruleBrowser_Task ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_func_0_0 = null;

        EObject lv_b_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_func_0_0= ruleFunction ) )* ( (lv_b_1_0= ruleBrowser_Task ) ) ) )
            // InternalMyDsl.g:78:2: ( ( (lv_func_0_0= ruleFunction ) )* ( (lv_b_1_0= ruleBrowser_Task ) ) )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_func_0_0= ruleFunction ) )* ( (lv_b_1_0= ruleBrowser_Task ) ) )
            // InternalMyDsl.g:79:3: ( (lv_func_0_0= ruleFunction ) )* ( (lv_b_1_0= ruleBrowser_Task ) )
            {
            // InternalMyDsl.g:79:3: ( (lv_func_0_0= ruleFunction ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:80:4: (lv_func_0_0= ruleFunction )
            	    {
            	    // InternalMyDsl.g:80:4: (lv_func_0_0= ruleFunction )
            	    // InternalMyDsl.g:81:5: lv_func_0_0= ruleFunction
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getFuncFunctionParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_func_0_0=ruleFunction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"func",
            	    						lv_func_0_0,
            	    						"org.xtext.example.mydsl.MyDsl.Function");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:98:3: ( (lv_b_1_0= ruleBrowser_Task ) )
            // InternalMyDsl.g:99:4: (lv_b_1_0= ruleBrowser_Task )
            {
            // InternalMyDsl.g:99:4: (lv_b_1_0= ruleBrowser_Task )
            // InternalMyDsl.g:100:5: lv_b_1_0= ruleBrowser_Task
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getBBrowser_TaskParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_b_1_0=ruleBrowser_Task();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					set(
            						current,
            						"b",
            						lv_b_1_0,
            						"org.xtext.example.mydsl.MyDsl.Browser_Task");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleBrowser_Task"
    // InternalMyDsl.g:121:1: entryRuleBrowser_Task returns [EObject current=null] : iv_ruleBrowser_Task= ruleBrowser_Task EOF ;
    public final EObject entryRuleBrowser_Task() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrowser_Task = null;


        try {
            // InternalMyDsl.g:121:53: (iv_ruleBrowser_Task= ruleBrowser_Task EOF )
            // InternalMyDsl.g:122:2: iv_ruleBrowser_Task= ruleBrowser_Task EOF
            {
             newCompositeNode(grammarAccess.getBrowser_TaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBrowser_Task=ruleBrowser_Task();

            state._fsp--;

             current =iv_ruleBrowser_Task; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBrowser_Task"


    // $ANTLR start "ruleBrowser_Task"
    // InternalMyDsl.g:128:1: ruleBrowser_Task returns [EObject current=null] : (otherlv_0= 'Selenium' otherlv_1= '{' otherlv_2= 'Browser' ( (lv_name_3_0= RULE_STRING ) ) ( (lv_operations_4_0= ruleOperation ) )* otherlv_5= '}' ) ;
    public final EObject ruleBrowser_Task() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_5=null;
        EObject lv_operations_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:134:2: ( (otherlv_0= 'Selenium' otherlv_1= '{' otherlv_2= 'Browser' ( (lv_name_3_0= RULE_STRING ) ) ( (lv_operations_4_0= ruleOperation ) )* otherlv_5= '}' ) )
            // InternalMyDsl.g:135:2: (otherlv_0= 'Selenium' otherlv_1= '{' otherlv_2= 'Browser' ( (lv_name_3_0= RULE_STRING ) ) ( (lv_operations_4_0= ruleOperation ) )* otherlv_5= '}' )
            {
            // InternalMyDsl.g:135:2: (otherlv_0= 'Selenium' otherlv_1= '{' otherlv_2= 'Browser' ( (lv_name_3_0= RULE_STRING ) ) ( (lv_operations_4_0= ruleOperation ) )* otherlv_5= '}' )
            // InternalMyDsl.g:136:3: otherlv_0= 'Selenium' otherlv_1= '{' otherlv_2= 'Browser' ( (lv_name_3_0= RULE_STRING ) ) ( (lv_operations_4_0= ruleOperation ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBrowser_TaskAccess().getSeleniumKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getBrowser_TaskAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getBrowser_TaskAccess().getBrowserKeyword_2());
            		
            // InternalMyDsl.g:148:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalMyDsl.g:149:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:149:4: (lv_name_3_0= RULE_STRING )
            // InternalMyDsl.g:150:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_3_0, grammarAccess.getBrowser_TaskAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBrowser_TaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:166:3: ( (lv_operations_4_0= ruleOperation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=17 && LA2_0<=19)||(LA2_0>=23 && LA2_0<=26)||LA2_0==28||LA2_0==31||(LA2_0>=38 && LA2_0<=40)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:167:4: (lv_operations_4_0= ruleOperation )
            	    {
            	    // InternalMyDsl.g:167:4: (lv_operations_4_0= ruleOperation )
            	    // InternalMyDsl.g:168:5: lv_operations_4_0= ruleOperation
            	    {

            	    					newCompositeNode(grammarAccess.getBrowser_TaskAccess().getOperationsOperationParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_operations_4_0=ruleOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBrowser_TaskRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Operation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBrowser_TaskAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBrowser_Task"


    // $ANTLR start "entryRuleOperation"
    // InternalMyDsl.g:193:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalMyDsl.g:193:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalMyDsl.g:194:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMyDsl.g:200:1: ruleOperation returns [EObject current=null] : (this_Action_0= ruleAction | this_Loop_1= ruleLoop | this_Apply_All_2= ruleApply_All | this_If_3= ruleIf | this_Store_4= ruleStore | this_CallFunction_5= ruleCallFunction ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Action_0 = null;

        EObject this_Loop_1 = null;

        EObject this_Apply_All_2 = null;

        EObject this_If_3 = null;

        EObject this_Store_4 = null;

        EObject this_CallFunction_5 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:206:2: ( (this_Action_0= ruleAction | this_Loop_1= ruleLoop | this_Apply_All_2= ruleApply_All | this_If_3= ruleIf | this_Store_4= ruleStore | this_CallFunction_5= ruleCallFunction ) )
            // InternalMyDsl.g:207:2: (this_Action_0= ruleAction | this_Loop_1= ruleLoop | this_Apply_All_2= ruleApply_All | this_If_3= ruleIf | this_Store_4= ruleStore | this_CallFunction_5= ruleCallFunction )
            {
            // InternalMyDsl.g:207:2: (this_Action_0= ruleAction | this_Loop_1= ruleLoop | this_Apply_All_2= ruleApply_All | this_If_3= ruleIf | this_Store_4= ruleStore | this_CallFunction_5= ruleCallFunction )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 17:
            case 18:
            case 19:
            case 23:
            case 24:
                {
                alt3=1;
                }
                break;
            case 38:
            case 39:
            case 40:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case 26:
                {
                alt3=4;
                }
                break;
            case 28:
                {
                alt3=5;
                }
                break;
            case 31:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:208:3: this_Action_0= ruleAction
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Action_0=ruleAction();

                    state._fsp--;


                    			current = this_Action_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:217:3: this_Loop_1= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getLoopParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_1=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:226:3: this_Apply_All_2= ruleApply_All
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getApply_AllParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Apply_All_2=ruleApply_All();

                    state._fsp--;


                    			current = this_Apply_All_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:235:3: this_If_3= ruleIf
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getIfParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_If_3=ruleIf();

                    state._fsp--;


                    			current = this_If_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:244:3: this_Store_4= ruleStore
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getStoreParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Store_4=ruleStore();

                    state._fsp--;


                    			current = this_Store_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:253:3: this_CallFunction_5= ruleCallFunction
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getCallFunctionParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallFunction_5=ruleCallFunction();

                    state._fsp--;


                    			current = this_CallFunction_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:265:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:265:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:266:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:272:1: ruleAction returns [EObject current=null] : (this_Click_0= ruleClick | this_Go_1= ruleGo | this_Fill_2= ruleFill | this_Select_3= ruleSelect | this_Verify_4= ruleVerify ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Click_0 = null;

        EObject this_Go_1 = null;

        EObject this_Fill_2 = null;

        EObject this_Select_3 = null;

        EObject this_Verify_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:278:2: ( (this_Click_0= ruleClick | this_Go_1= ruleGo | this_Fill_2= ruleFill | this_Select_3= ruleSelect | this_Verify_4= ruleVerify ) )
            // InternalMyDsl.g:279:2: (this_Click_0= ruleClick | this_Go_1= ruleGo | this_Fill_2= ruleFill | this_Select_3= ruleSelect | this_Verify_4= ruleVerify )
            {
            // InternalMyDsl.g:279:2: (this_Click_0= ruleClick | this_Go_1= ruleGo | this_Fill_2= ruleFill | this_Select_3= ruleSelect | this_Verify_4= ruleVerify )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 23:
                {
                alt4=4;
                }
                break;
            case 24:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:280:3: this_Click_0= ruleClick
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getClickParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Click_0=ruleClick();

                    state._fsp--;


                    			current = this_Click_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:289:3: this_Go_1= ruleGo
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getGoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Go_1=ruleGo();

                    state._fsp--;


                    			current = this_Go_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:298:3: this_Fill_2= ruleFill
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getFillParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fill_2=ruleFill();

                    state._fsp--;


                    			current = this_Fill_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:307:3: this_Select_3= ruleSelect
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSelectParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Select_3=ruleSelect();

                    state._fsp--;


                    			current = this_Select_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:316:3: this_Verify_4= ruleVerify
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getVerifyParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Verify_4=ruleVerify();

                    state._fsp--;


                    			current = this_Verify_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleClick"
    // InternalMyDsl.g:328:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalMyDsl.g:328:46: (iv_ruleClick= ruleClick EOF )
            // InternalMyDsl.g:329:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalMyDsl.g:335:1: ruleClick returns [EObject current=null] : (otherlv_0= 'Click' ( (lv_elt_1_0= ruleElement ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elt_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:341:2: ( (otherlv_0= 'Click' ( (lv_elt_1_0= ruleElement ) ) ) )
            // InternalMyDsl.g:342:2: (otherlv_0= 'Click' ( (lv_elt_1_0= ruleElement ) ) )
            {
            // InternalMyDsl.g:342:2: (otherlv_0= 'Click' ( (lv_elt_1_0= ruleElement ) ) )
            // InternalMyDsl.g:343:3: otherlv_0= 'Click' ( (lv_elt_1_0= ruleElement ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
            		
            // InternalMyDsl.g:347:3: ( (lv_elt_1_0= ruleElement ) )
            // InternalMyDsl.g:348:4: (lv_elt_1_0= ruleElement )
            {
            // InternalMyDsl.g:348:4: (lv_elt_1_0= ruleElement )
            // InternalMyDsl.g:349:5: lv_elt_1_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getClickAccess().getEltElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_elt_1_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickRule());
            					}
            					set(
            						current,
            						"elt",
            						lv_elt_1_0,
            						"org.xtext.example.mydsl.MyDsl.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleGo"
    // InternalMyDsl.g:370:1: entryRuleGo returns [EObject current=null] : iv_ruleGo= ruleGo EOF ;
    public final EObject entryRuleGo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGo = null;


        try {
            // InternalMyDsl.g:370:43: (iv_ruleGo= ruleGo EOF )
            // InternalMyDsl.g:371:2: iv_ruleGo= ruleGo EOF
            {
             newCompositeNode(grammarAccess.getGoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGo=ruleGo();

            state._fsp--;

             current =iv_ruleGo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGo"


    // $ANTLR start "ruleGo"
    // InternalMyDsl.g:377:1: ruleGo returns [EObject current=null] : (otherlv_0= 'Go' ( (lv_link_1_0= ruleText ) ) ) ;
    public final EObject ruleGo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_link_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:383:2: ( (otherlv_0= 'Go' ( (lv_link_1_0= ruleText ) ) ) )
            // InternalMyDsl.g:384:2: (otherlv_0= 'Go' ( (lv_link_1_0= ruleText ) ) )
            {
            // InternalMyDsl.g:384:2: (otherlv_0= 'Go' ( (lv_link_1_0= ruleText ) ) )
            // InternalMyDsl.g:385:3: otherlv_0= 'Go' ( (lv_link_1_0= ruleText ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getGoAccess().getGoKeyword_0());
            		
            // InternalMyDsl.g:389:3: ( (lv_link_1_0= ruleText ) )
            // InternalMyDsl.g:390:4: (lv_link_1_0= ruleText )
            {
            // InternalMyDsl.g:390:4: (lv_link_1_0= ruleText )
            // InternalMyDsl.g:391:5: lv_link_1_0= ruleText
            {

            					newCompositeNode(grammarAccess.getGoAccess().getLinkTextParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_link_1_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGoRule());
            					}
            					set(
            						current,
            						"link",
            						lv_link_1_0,
            						"org.xtext.example.mydsl.MyDsl.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGo"


    // $ANTLR start "entryRuleFill"
    // InternalMyDsl.g:412:1: entryRuleFill returns [EObject current=null] : iv_ruleFill= ruleFill EOF ;
    public final EObject entryRuleFill() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFill = null;


        try {
            // InternalMyDsl.g:412:45: (iv_ruleFill= ruleFill EOF )
            // InternalMyDsl.g:413:2: iv_ruleFill= ruleFill EOF
            {
             newCompositeNode(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFill=ruleFill();

            state._fsp--;

             current =iv_ruleFill; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFill"


    // $ANTLR start "ruleFill"
    // InternalMyDsl.g:419:1: ruleFill returns [EObject current=null] : (otherlv_0= 'Fill' otherlv_1= '(' ( (lv_elt_2_0= ruleElement ) ) otherlv_3= ',' ( (lv_fillwith_4_0= ruleText ) ) otherlv_5= ')' ) ;
    public final EObject ruleFill() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elt_2_0 = null;

        EObject lv_fillwith_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:425:2: ( (otherlv_0= 'Fill' otherlv_1= '(' ( (lv_elt_2_0= ruleElement ) ) otherlv_3= ',' ( (lv_fillwith_4_0= ruleText ) ) otherlv_5= ')' ) )
            // InternalMyDsl.g:426:2: (otherlv_0= 'Fill' otherlv_1= '(' ( (lv_elt_2_0= ruleElement ) ) otherlv_3= ',' ( (lv_fillwith_4_0= ruleText ) ) otherlv_5= ')' )
            {
            // InternalMyDsl.g:426:2: (otherlv_0= 'Fill' otherlv_1= '(' ( (lv_elt_2_0= ruleElement ) ) otherlv_3= ',' ( (lv_fillwith_4_0= ruleText ) ) otherlv_5= ')' )
            // InternalMyDsl.g:427:3: otherlv_0= 'Fill' otherlv_1= '(' ( (lv_elt_2_0= ruleElement ) ) otherlv_3= ',' ( (lv_fillwith_4_0= ruleText ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getFillAccess().getFillKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFillAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:435:3: ( (lv_elt_2_0= ruleElement ) )
            // InternalMyDsl.g:436:4: (lv_elt_2_0= ruleElement )
            {
            // InternalMyDsl.g:436:4: (lv_elt_2_0= ruleElement )
            // InternalMyDsl.g:437:5: lv_elt_2_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getFillAccess().getEltElementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_elt_2_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFillRule());
            					}
            					set(
            						current,
            						"elt",
            						lv_elt_2_0,
            						"org.xtext.example.mydsl.MyDsl.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getFillAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:458:3: ( (lv_fillwith_4_0= ruleText ) )
            // InternalMyDsl.g:459:4: (lv_fillwith_4_0= ruleText )
            {
            // InternalMyDsl.g:459:4: (lv_fillwith_4_0= ruleText )
            // InternalMyDsl.g:460:5: lv_fillwith_4_0= ruleText
            {

            					newCompositeNode(grammarAccess.getFillAccess().getFillwithTextParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_fillwith_4_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFillRule());
            					}
            					set(
            						current,
            						"fillwith",
            						lv_fillwith_4_0,
            						"org.xtext.example.mydsl.MyDsl.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFillAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFill"


    // $ANTLR start "entryRuleSelect"
    // InternalMyDsl.g:485:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalMyDsl.g:485:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalMyDsl.g:486:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalMyDsl.g:492:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'Select' ( (lv_elt_1_0= ruleElement ) ) ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_elt_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:498:2: ( (otherlv_0= 'Select' ( (lv_elt_1_0= ruleElement ) ) ) )
            // InternalMyDsl.g:499:2: (otherlv_0= 'Select' ( (lv_elt_1_0= ruleElement ) ) )
            {
            // InternalMyDsl.g:499:2: (otherlv_0= 'Select' ( (lv_elt_1_0= ruleElement ) ) )
            // InternalMyDsl.g:500:3: otherlv_0= 'Select' ( (lv_elt_1_0= ruleElement ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
            		
            // InternalMyDsl.g:504:3: ( (lv_elt_1_0= ruleElement ) )
            // InternalMyDsl.g:505:4: (lv_elt_1_0= ruleElement )
            {
            // InternalMyDsl.g:505:4: (lv_elt_1_0= ruleElement )
            // InternalMyDsl.g:506:5: lv_elt_1_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getSelectAccess().getEltElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_elt_1_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectRule());
            					}
            					set(
            						current,
            						"elt",
            						lv_elt_1_0,
            						"org.xtext.example.mydsl.MyDsl.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleVerify"
    // InternalMyDsl.g:527:1: entryRuleVerify returns [EObject current=null] : iv_ruleVerify= ruleVerify EOF ;
    public final EObject entryRuleVerify() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerify = null;


        try {
            // InternalMyDsl.g:527:47: (iv_ruleVerify= ruleVerify EOF )
            // InternalMyDsl.g:528:2: iv_ruleVerify= ruleVerify EOF
            {
             newCompositeNode(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerify=ruleVerify();

            state._fsp--;

             current =iv_ruleVerify; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerify"


    // $ANTLR start "ruleVerify"
    // InternalMyDsl.g:534:1: ruleVerify returns [EObject current=null] : (otherlv_0= 'Verify' otherlv_1= '(' ( (lv_elt_2_0= ruleElement ) ) otherlv_3= ',' ( (lv_find_4_0= ruleText ) ) otherlv_5= ')' ) ;
    public final EObject ruleVerify() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elt_2_0 = null;

        EObject lv_find_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:540:2: ( (otherlv_0= 'Verify' otherlv_1= '(' ( (lv_elt_2_0= ruleElement ) ) otherlv_3= ',' ( (lv_find_4_0= ruleText ) ) otherlv_5= ')' ) )
            // InternalMyDsl.g:541:2: (otherlv_0= 'Verify' otherlv_1= '(' ( (lv_elt_2_0= ruleElement ) ) otherlv_3= ',' ( (lv_find_4_0= ruleText ) ) otherlv_5= ')' )
            {
            // InternalMyDsl.g:541:2: (otherlv_0= 'Verify' otherlv_1= '(' ( (lv_elt_2_0= ruleElement ) ) otherlv_3= ',' ( (lv_find_4_0= ruleText ) ) otherlv_5= ')' )
            // InternalMyDsl.g:542:3: otherlv_0= 'Verify' otherlv_1= '(' ( (lv_elt_2_0= ruleElement ) ) otherlv_3= ',' ( (lv_find_4_0= ruleText ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getVerifyAccess().getVerifyKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getVerifyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:550:3: ( (lv_elt_2_0= ruleElement ) )
            // InternalMyDsl.g:551:4: (lv_elt_2_0= ruleElement )
            {
            // InternalMyDsl.g:551:4: (lv_elt_2_0= ruleElement )
            // InternalMyDsl.g:552:5: lv_elt_2_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getVerifyAccess().getEltElementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_elt_2_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerifyRule());
            					}
            					set(
            						current,
            						"elt",
            						lv_elt_2_0,
            						"org.xtext.example.mydsl.MyDsl.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getVerifyAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:573:3: ( (lv_find_4_0= ruleText ) )
            // InternalMyDsl.g:574:4: (lv_find_4_0= ruleText )
            {
            // InternalMyDsl.g:574:4: (lv_find_4_0= ruleText )
            // InternalMyDsl.g:575:5: lv_find_4_0= ruleText
            {

            					newCompositeNode(grammarAccess.getVerifyAccess().getFindTextParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_find_4_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerifyRule());
            					}
            					set(
            						current,
            						"find",
            						lv_find_4_0,
            						"org.xtext.example.mydsl.MyDsl.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getVerifyAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerify"


    // $ANTLR start "entryRuleApply_All"
    // InternalMyDsl.g:600:1: entryRuleApply_All returns [EObject current=null] : iv_ruleApply_All= ruleApply_All EOF ;
    public final EObject entryRuleApply_All() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApply_All = null;


        try {
            // InternalMyDsl.g:600:50: (iv_ruleApply_All= ruleApply_All EOF )
            // InternalMyDsl.g:601:2: iv_ruleApply_All= ruleApply_All EOF
            {
             newCompositeNode(grammarAccess.getApply_AllRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApply_All=ruleApply_All();

            state._fsp--;

             current =iv_ruleApply_All; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApply_All"


    // $ANTLR start "ruleApply_All"
    // InternalMyDsl.g:607:1: ruleApply_All returns [EObject current=null] : (otherlv_0= 'Apply_All' otherlv_1= '(' ( (lv_elt_2_0= ruleElements ) ) otherlv_3= ',' ( (lv_actions_4_0= ruleAction ) )* otherlv_5= ')' ) ;
    public final EObject ruleApply_All() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_elt_2_0 = null;

        EObject lv_actions_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:613:2: ( (otherlv_0= 'Apply_All' otherlv_1= '(' ( (lv_elt_2_0= ruleElements ) ) otherlv_3= ',' ( (lv_actions_4_0= ruleAction ) )* otherlv_5= ')' ) )
            // InternalMyDsl.g:614:2: (otherlv_0= 'Apply_All' otherlv_1= '(' ( (lv_elt_2_0= ruleElements ) ) otherlv_3= ',' ( (lv_actions_4_0= ruleAction ) )* otherlv_5= ')' )
            {
            // InternalMyDsl.g:614:2: (otherlv_0= 'Apply_All' otherlv_1= '(' ( (lv_elt_2_0= ruleElements ) ) otherlv_3= ',' ( (lv_actions_4_0= ruleAction ) )* otherlv_5= ')' )
            // InternalMyDsl.g:615:3: otherlv_0= 'Apply_All' otherlv_1= '(' ( (lv_elt_2_0= ruleElements ) ) otherlv_3= ',' ( (lv_actions_4_0= ruleAction ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getApply_AllAccess().getApply_AllKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getApply_AllAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:623:3: ( (lv_elt_2_0= ruleElements ) )
            // InternalMyDsl.g:624:4: (lv_elt_2_0= ruleElements )
            {
            // InternalMyDsl.g:624:4: (lv_elt_2_0= ruleElements )
            // InternalMyDsl.g:625:5: lv_elt_2_0= ruleElements
            {

            					newCompositeNode(grammarAccess.getApply_AllAccess().getEltElementsParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_elt_2_0=ruleElements();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApply_AllRule());
            					}
            					set(
            						current,
            						"elt",
            						lv_elt_2_0,
            						"org.xtext.example.mydsl.MyDsl.Elements");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getApply_AllAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:646:3: ( (lv_actions_4_0= ruleAction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=17 && LA5_0<=19)||(LA5_0>=23 && LA5_0<=24)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:647:4: (lv_actions_4_0= ruleAction )
            	    {
            	    // InternalMyDsl.g:647:4: (lv_actions_4_0= ruleAction )
            	    // InternalMyDsl.g:648:5: lv_actions_4_0= ruleAction
            	    {

            	    					newCompositeNode(grammarAccess.getApply_AllAccess().getActionsActionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_actions_4_0=ruleAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApply_AllRule());
            	    					}
            	    					add(
            	    						current,
            	    						"actions",
            	    						lv_actions_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Action");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getApply_AllAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApply_All"


    // $ANTLR start "entryRuleIf"
    // InternalMyDsl.g:673:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalMyDsl.g:673:43: (iv_ruleIf= ruleIf EOF )
            // InternalMyDsl.g:674:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalMyDsl.g:680:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleCondition ) ) ( (lv_add_3_0= ruleAddCondition ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_operationsbis_10_0= ruleOperation ) )* otherlv_11= '}' )? ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_cond_2_0 = null;

        EObject lv_add_3_0 = null;

        EObject lv_operations_6_0 = null;

        EObject lv_operationsbis_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:686:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleCondition ) ) ( (lv_add_3_0= ruleAddCondition ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_operationsbis_10_0= ruleOperation ) )* otherlv_11= '}' )? ) )
            // InternalMyDsl.g:687:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleCondition ) ) ( (lv_add_3_0= ruleAddCondition ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_operationsbis_10_0= ruleOperation ) )* otherlv_11= '}' )? )
            {
            // InternalMyDsl.g:687:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleCondition ) ) ( (lv_add_3_0= ruleAddCondition ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_operationsbis_10_0= ruleOperation ) )* otherlv_11= '}' )? )
            // InternalMyDsl.g:688:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_cond_2_0= ruleCondition ) ) ( (lv_add_3_0= ruleAddCondition ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_operationsbis_10_0= ruleOperation ) )* otherlv_11= '}' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:696:3: ( (lv_cond_2_0= ruleCondition ) )
            // InternalMyDsl.g:697:4: (lv_cond_2_0= ruleCondition )
            {
            // InternalMyDsl.g:697:4: (lv_cond_2_0= ruleCondition )
            // InternalMyDsl.g:698:5: lv_cond_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getIfAccess().getCondConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_cond_2_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_2_0,
            						"org.xtext.example.mydsl.MyDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:715:3: ( (lv_add_3_0= ruleAddCondition ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=41 && LA6_0<=42)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:716:4: (lv_add_3_0= ruleAddCondition )
            	    {
            	    // InternalMyDsl.g:716:4: (lv_add_3_0= ruleAddCondition )
            	    // InternalMyDsl.g:717:5: lv_add_3_0= ruleAddCondition
            	    {

            	    					newCompositeNode(grammarAccess.getIfAccess().getAddAddConditionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_add_3_0=ruleAddCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"add",
            	    						lv_add_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.AddCondition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getIfAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:742:3: ( (lv_operations_6_0= ruleOperation ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=17 && LA7_0<=19)||(LA7_0>=23 && LA7_0<=26)||LA7_0==28||LA7_0==31||(LA7_0>=38 && LA7_0<=40)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:743:4: (lv_operations_6_0= ruleOperation )
            	    {
            	    // InternalMyDsl.g:743:4: (lv_operations_6_0= ruleOperation )
            	    // InternalMyDsl.g:744:5: lv_operations_6_0= ruleOperation
            	    {

            	    					newCompositeNode(grammarAccess.getIfAccess().getOperationsOperationParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_operations_6_0=ruleOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIfRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_6_0,
            	    						"org.xtext.example.mydsl.MyDsl.Operation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalMyDsl.g:765:3: (otherlv_8= 'else' otherlv_9= '{' ( (lv_operationsbis_10_0= ruleOperation ) )* otherlv_11= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:766:4: otherlv_8= 'else' otherlv_9= '{' ( (lv_operationsbis_10_0= ruleOperation ) )* otherlv_11= '}'
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getIfAccess().getElseKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMyDsl.g:774:4: ( (lv_operationsbis_10_0= ruleOperation ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=17 && LA8_0<=19)||(LA8_0>=23 && LA8_0<=26)||LA8_0==28||LA8_0==31||(LA8_0>=38 && LA8_0<=40)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:775:5: (lv_operationsbis_10_0= ruleOperation )
                    	    {
                    	    // InternalMyDsl.g:775:5: (lv_operationsbis_10_0= ruleOperation )
                    	    // InternalMyDsl.g:776:6: lv_operationsbis_10_0= ruleOperation
                    	    {

                    	    						newCompositeNode(grammarAccess.getIfAccess().getOperationsbisOperationParserRuleCall_8_2_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_operationsbis_10_0=ruleOperation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getIfRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"operationsbis",
                    	    							lv_operationsbis_10_0,
                    	    							"org.xtext.example.mydsl.MyDsl.Operation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getIfAccess().getRightCurlyBracketKeyword_8_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleStore"
    // InternalMyDsl.g:802:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // InternalMyDsl.g:802:46: (iv_ruleStore= ruleStore EOF )
            // InternalMyDsl.g:803:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalMyDsl.g:809:1: ruleStore returns [EObject current=null] : (otherlv_0= 'Store' otherlv_1= 'Var' ( (lv_vari_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_t_4_0= ruleType ) ) ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_vari_2_0=null;
        Token otherlv_3=null;
        EObject lv_t_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:815:2: ( (otherlv_0= 'Store' otherlv_1= 'Var' ( (lv_vari_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_t_4_0= ruleType ) ) ) )
            // InternalMyDsl.g:816:2: (otherlv_0= 'Store' otherlv_1= 'Var' ( (lv_vari_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_t_4_0= ruleType ) ) )
            {
            // InternalMyDsl.g:816:2: (otherlv_0= 'Store' otherlv_1= 'Var' ( (lv_vari_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_t_4_0= ruleType ) ) )
            // InternalMyDsl.g:817:3: otherlv_0= 'Store' otherlv_1= 'Var' ( (lv_vari_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_t_4_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getStoreAccess().getVarKeyword_1());
            		
            // InternalMyDsl.g:825:3: ( (lv_vari_2_0= RULE_ID ) )
            // InternalMyDsl.g:826:4: (lv_vari_2_0= RULE_ID )
            {
            // InternalMyDsl.g:826:4: (lv_vari_2_0= RULE_ID )
            // InternalMyDsl.g:827:5: lv_vari_2_0= RULE_ID
            {
            lv_vari_2_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_vari_2_0, grammarAccess.getStoreAccess().getVariIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStoreRule());
            					}
            					setWithLastConsumed(
            						current,
            						"vari",
            						lv_vari_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getStoreAccess().getEqualsSignKeyword_3());
            		
            // InternalMyDsl.g:847:3: ( (lv_t_4_0= ruleType ) )
            // InternalMyDsl.g:848:4: (lv_t_4_0= ruleType )
            {
            // InternalMyDsl.g:848:4: (lv_t_4_0= ruleType )
            // InternalMyDsl.g:849:5: lv_t_4_0= ruleType
            {

            					newCompositeNode(grammarAccess.getStoreAccess().getTTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_t_4_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStoreRule());
            					}
            					set(
            						current,
            						"t",
            						lv_t_4_0,
            						"org.xtext.example.mydsl.MyDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleCallFunction"
    // InternalMyDsl.g:870:1: entryRuleCallFunction returns [EObject current=null] : iv_ruleCallFunction= ruleCallFunction EOF ;
    public final EObject entryRuleCallFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallFunction = null;


        try {
            // InternalMyDsl.g:870:53: (iv_ruleCallFunction= ruleCallFunction EOF )
            // InternalMyDsl.g:871:2: iv_ruleCallFunction= ruleCallFunction EOF
            {
             newCompositeNode(grammarAccess.getCallFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallFunction=ruleCallFunction();

            state._fsp--;

             current =iv_ruleCallFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCallFunction"


    // $ANTLR start "ruleCallFunction"
    // InternalMyDsl.g:877:1: ruleCallFunction returns [EObject current=null] : (otherlv_0= 'func' otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) )* otherlv_5= ')' ) ;
    public final EObject ruleCallFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_vars_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:883:2: ( (otherlv_0= 'func' otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) )* otherlv_5= ')' ) )
            // InternalMyDsl.g:884:2: (otherlv_0= 'func' otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) )* otherlv_5= ')' )
            {
            // InternalMyDsl.g:884:2: (otherlv_0= 'func' otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) )* otherlv_5= ')' )
            // InternalMyDsl.g:885:3: otherlv_0= 'func' otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_vars_4_0= ruleVariable ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCallFunctionAccess().getFuncKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getCallFunctionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:893:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalMyDsl.g:894:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:894:4: (lv_name_2_0= RULE_STRING )
            // InternalMyDsl.g:895:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_name_2_0, grammarAccess.getCallFunctionAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCallFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getCallFunctionAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:915:3: ( (lv_vars_4_0= ruleVariable ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==29) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:916:4: (lv_vars_4_0= ruleVariable )
            	    {
            	    // InternalMyDsl.g:916:4: (lv_vars_4_0= ruleVariable )
            	    // InternalMyDsl.g:917:5: lv_vars_4_0= ruleVariable
            	    {

            	    					newCompositeNode(grammarAccess.getCallFunctionAccess().getVarsVariableParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_vars_4_0=ruleVariable();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCallFunctionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"vars",
            	    						lv_vars_4_0,
            	    						"org.xtext.example.mydsl.MyDsl.Variable");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCallFunctionAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCallFunction"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:942:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyDsl.g:942:45: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:943:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:949:1: ruleType returns [EObject current=null] : ( ( (lv_text_0_0= ruleText ) ) | ( (lv_elts_1_0= ruleElements ) ) | ( (lv_elt_2_0= ruleElement ) ) | ( (lv_cond_3_0= ruleCondition ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject lv_text_0_0 = null;

        EObject lv_elts_1_0 = null;

        EObject lv_elt_2_0 = null;

        EObject lv_cond_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:955:2: ( ( ( (lv_text_0_0= ruleText ) ) | ( (lv_elts_1_0= ruleElements ) ) | ( (lv_elt_2_0= ruleElement ) ) | ( (lv_cond_3_0= ruleCondition ) ) ) )
            // InternalMyDsl.g:956:2: ( ( (lv_text_0_0= ruleText ) ) | ( (lv_elts_1_0= ruleElements ) ) | ( (lv_elt_2_0= ruleElement ) ) | ( (lv_cond_3_0= ruleCondition ) ) )
            {
            // InternalMyDsl.g:956:2: ( ( (lv_text_0_0= ruleText ) ) | ( (lv_elts_1_0= ruleElements ) ) | ( (lv_elt_2_0= ruleElement ) ) | ( (lv_cond_3_0= ruleCondition ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case 29:
                {
                alt11=1;
                }
                break;
            case 33:
                {
                alt11=2;
                }
                break;
            case 34:
                {
                alt11=3;
                }
                break;
            case 35:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:957:3: ( (lv_text_0_0= ruleText ) )
                    {
                    // InternalMyDsl.g:957:3: ( (lv_text_0_0= ruleText ) )
                    // InternalMyDsl.g:958:4: (lv_text_0_0= ruleText )
                    {
                    // InternalMyDsl.g:958:4: (lv_text_0_0= ruleText )
                    // InternalMyDsl.g:959:5: lv_text_0_0= ruleText
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getTextTextParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_text_0_0=ruleText();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"text",
                    						lv_text_0_0,
                    						"org.xtext.example.mydsl.MyDsl.Text");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:977:3: ( (lv_elts_1_0= ruleElements ) )
                    {
                    // InternalMyDsl.g:977:3: ( (lv_elts_1_0= ruleElements ) )
                    // InternalMyDsl.g:978:4: (lv_elts_1_0= ruleElements )
                    {
                    // InternalMyDsl.g:978:4: (lv_elts_1_0= ruleElements )
                    // InternalMyDsl.g:979:5: lv_elts_1_0= ruleElements
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getEltsElementsParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elts_1_0=ruleElements();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"elts",
                    						lv_elts_1_0,
                    						"org.xtext.example.mydsl.MyDsl.Elements");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:997:3: ( (lv_elt_2_0= ruleElement ) )
                    {
                    // InternalMyDsl.g:997:3: ( (lv_elt_2_0= ruleElement ) )
                    // InternalMyDsl.g:998:4: (lv_elt_2_0= ruleElement )
                    {
                    // InternalMyDsl.g:998:4: (lv_elt_2_0= ruleElement )
                    // InternalMyDsl.g:999:5: lv_elt_2_0= ruleElement
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getEltElementParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_elt_2_0=ruleElement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"elt",
                    						lv_elt_2_0,
                    						"org.xtext.example.mydsl.MyDsl.Element");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1017:3: ( (lv_cond_3_0= ruleCondition ) )
                    {
                    // InternalMyDsl.g:1017:3: ( (lv_cond_3_0= ruleCondition ) )
                    // InternalMyDsl.g:1018:4: (lv_cond_3_0= ruleCondition )
                    {
                    // InternalMyDsl.g:1018:4: (lv_cond_3_0= ruleCondition )
                    // InternalMyDsl.g:1019:5: lv_cond_3_0= ruleCondition
                    {

                    					newCompositeNode(grammarAccess.getTypeAccess().getCondConditionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cond_3_0=ruleCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeRule());
                    					}
                    					set(
                    						current,
                    						"cond",
                    						lv_cond_3_0,
                    						"org.xtext.example.mydsl.MyDsl.Condition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleStringType"
    // InternalMyDsl.g:1040:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalMyDsl.g:1040:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalMyDsl.g:1041:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalMyDsl.g:1047:1: ruleStringType returns [EObject current=null] : ( ( (lv_text_0_0= 'Text' ) ) | ( (lv_elts_1_0= 'Elements' ) ) | ( (lv_elt_2_0= 'Element' ) ) | ( (lv_cond_3_0= 'Condition' ) ) ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;
        Token lv_elts_1_0=null;
        Token lv_elt_2_0=null;
        Token lv_cond_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1053:2: ( ( ( (lv_text_0_0= 'Text' ) ) | ( (lv_elts_1_0= 'Elements' ) ) | ( (lv_elt_2_0= 'Element' ) ) | ( (lv_cond_3_0= 'Condition' ) ) ) )
            // InternalMyDsl.g:1054:2: ( ( (lv_text_0_0= 'Text' ) ) | ( (lv_elts_1_0= 'Elements' ) ) | ( (lv_elt_2_0= 'Element' ) ) | ( (lv_cond_3_0= 'Condition' ) ) )
            {
            // InternalMyDsl.g:1054:2: ( ( (lv_text_0_0= 'Text' ) ) | ( (lv_elts_1_0= 'Elements' ) ) | ( (lv_elt_2_0= 'Element' ) ) | ( (lv_cond_3_0= 'Condition' ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt12=1;
                }
                break;
            case 33:
                {
                alt12=2;
                }
                break;
            case 34:
                {
                alt12=3;
                }
                break;
            case 35:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1055:3: ( (lv_text_0_0= 'Text' ) )
                    {
                    // InternalMyDsl.g:1055:3: ( (lv_text_0_0= 'Text' ) )
                    // InternalMyDsl.g:1056:4: (lv_text_0_0= 'Text' )
                    {
                    // InternalMyDsl.g:1056:4: (lv_text_0_0= 'Text' )
                    // InternalMyDsl.g:1057:5: lv_text_0_0= 'Text'
                    {
                    lv_text_0_0=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_text_0_0, grammarAccess.getStringTypeAccess().getTextTextKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStringTypeRule());
                    					}
                    					setWithLastConsumed(current, "text", lv_text_0_0, "Text");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1070:3: ( (lv_elts_1_0= 'Elements' ) )
                    {
                    // InternalMyDsl.g:1070:3: ( (lv_elts_1_0= 'Elements' ) )
                    // InternalMyDsl.g:1071:4: (lv_elts_1_0= 'Elements' )
                    {
                    // InternalMyDsl.g:1071:4: (lv_elts_1_0= 'Elements' )
                    // InternalMyDsl.g:1072:5: lv_elts_1_0= 'Elements'
                    {
                    lv_elts_1_0=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_elts_1_0, grammarAccess.getStringTypeAccess().getEltsElementsKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStringTypeRule());
                    					}
                    					setWithLastConsumed(current, "elts", lv_elts_1_0, "Elements");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1085:3: ( (lv_elt_2_0= 'Element' ) )
                    {
                    // InternalMyDsl.g:1085:3: ( (lv_elt_2_0= 'Element' ) )
                    // InternalMyDsl.g:1086:4: (lv_elt_2_0= 'Element' )
                    {
                    // InternalMyDsl.g:1086:4: (lv_elt_2_0= 'Element' )
                    // InternalMyDsl.g:1087:5: lv_elt_2_0= 'Element'
                    {
                    lv_elt_2_0=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_elt_2_0, grammarAccess.getStringTypeAccess().getEltElementKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStringTypeRule());
                    					}
                    					setWithLastConsumed(current, "elt", lv_elt_2_0, "Element");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1100:3: ( (lv_cond_3_0= 'Condition' ) )
                    {
                    // InternalMyDsl.g:1100:3: ( (lv_cond_3_0= 'Condition' ) )
                    // InternalMyDsl.g:1101:4: (lv_cond_3_0= 'Condition' )
                    {
                    // InternalMyDsl.g:1101:4: (lv_cond_3_0= 'Condition' )
                    // InternalMyDsl.g:1102:5: lv_cond_3_0= 'Condition'
                    {
                    lv_cond_3_0=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_cond_3_0, grammarAccess.getStringTypeAccess().getCondConditionKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStringTypeRule());
                    					}
                    					setWithLastConsumed(current, "cond", lv_cond_3_0, "Condition");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleFuncVar"
    // InternalMyDsl.g:1118:1: entryRuleFuncVar returns [EObject current=null] : iv_ruleFuncVar= ruleFuncVar EOF ;
    public final EObject entryRuleFuncVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncVar = null;


        try {
            // InternalMyDsl.g:1118:48: (iv_ruleFuncVar= ruleFuncVar EOF )
            // InternalMyDsl.g:1119:2: iv_ruleFuncVar= ruleFuncVar EOF
            {
             newCompositeNode(grammarAccess.getFuncVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncVar=ruleFuncVar();

            state._fsp--;

             current =iv_ruleFuncVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncVar"


    // $ANTLR start "ruleFuncVar"
    // InternalMyDsl.g:1125:1: ruleFuncVar returns [EObject current=null] : ( ( (lv_type_0_0= ruleStringType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFuncVar() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1131:2: ( ( ( (lv_type_0_0= ruleStringType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:1132:2: ( ( (lv_type_0_0= ruleStringType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:1132:2: ( ( (lv_type_0_0= ruleStringType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:1133:3: ( (lv_type_0_0= ruleStringType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalMyDsl.g:1133:3: ( (lv_type_0_0= ruleStringType ) )
            // InternalMyDsl.g:1134:4: (lv_type_0_0= ruleStringType )
            {
            // InternalMyDsl.g:1134:4: (lv_type_0_0= ruleStringType )
            // InternalMyDsl.g:1135:5: lv_type_0_0= ruleStringType
            {

            					newCompositeNode(grammarAccess.getFuncVarAccess().getTypeStringTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
            lv_type_0_0=ruleStringType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFuncVarRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.example.mydsl.MyDsl.StringType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1152:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1153:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1153:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1154:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFuncVarAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncVarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncVar"


    // $ANTLR start "entryRuleFunction"
    // InternalMyDsl.g:1174:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalMyDsl.g:1174:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalMyDsl.g:1175:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalMyDsl.g:1181:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'Function' otherlv_1= '(' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'Var' otherlv_6= '=' otherlv_7= '(' ( (lv_vars_8_0= ruleFuncVar ) )* otherlv_9= ')' otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) )* otherlv_12= ')' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_vars_8_0 = null;

        EObject lv_operations_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1187:2: ( (otherlv_0= 'Function' otherlv_1= '(' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'Var' otherlv_6= '=' otherlv_7= '(' ( (lv_vars_8_0= ruleFuncVar ) )* otherlv_9= ')' otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) )* otherlv_12= ')' ) )
            // InternalMyDsl.g:1188:2: (otherlv_0= 'Function' otherlv_1= '(' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'Var' otherlv_6= '=' otherlv_7= '(' ( (lv_vars_8_0= ruleFuncVar ) )* otherlv_9= ')' otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) )* otherlv_12= ')' )
            {
            // InternalMyDsl.g:1188:2: (otherlv_0= 'Function' otherlv_1= '(' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'Var' otherlv_6= '=' otherlv_7= '(' ( (lv_vars_8_0= ruleFuncVar ) )* otherlv_9= ')' otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) )* otherlv_12= ')' )
            // InternalMyDsl.g:1189:3: otherlv_0= 'Function' otherlv_1= '(' otherlv_2= 'Name' ( (lv_name_3_0= RULE_STRING ) ) otherlv_4= ',' otherlv_5= 'Var' otherlv_6= '=' otherlv_7= '(' ( (lv_vars_8_0= ruleFuncVar ) )* otherlv_9= ')' otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) )* otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getNameKeyword_2());
            		
            // InternalMyDsl.g:1201:3: ( (lv_name_3_0= RULE_STRING ) )
            // InternalMyDsl.g:1202:4: (lv_name_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:1202:4: (lv_name_3_0= RULE_STRING )
            // InternalMyDsl.g:1203:5: lv_name_3_0= RULE_STRING
            {
            lv_name_3_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            					newLeafNode(lv_name_3_0, grammarAccess.getFunctionAccess().getNameSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_4());
            		
            otherlv_5=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getVarKeyword_5());
            		
            otherlv_6=(Token)match(input,30,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getEqualsSignKeyword_6());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_24); 

            			newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_7());
            		
            // InternalMyDsl.g:1235:3: ( (lv_vars_8_0= ruleFuncVar ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=32 && LA13_0<=35)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1236:4: (lv_vars_8_0= ruleFuncVar )
            	    {
            	    // InternalMyDsl.g:1236:4: (lv_vars_8_0= ruleFuncVar )
            	    // InternalMyDsl.g:1237:5: lv_vars_8_0= ruleFuncVar
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionAccess().getVarsFuncVarParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_vars_8_0=ruleFuncVar();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"vars",
            	    						lv_vars_8_0,
            	    						"org.xtext.example.mydsl.MyDsl.FuncVar");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_9=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_9, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_9());
            		
            otherlv_10=(Token)match(input,21,FOLLOW_25); 

            			newLeafNode(otherlv_10, grammarAccess.getFunctionAccess().getCommaKeyword_10());
            		
            // InternalMyDsl.g:1262:3: ( (lv_operations_11_0= ruleOperation ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=17 && LA14_0<=19)||(LA14_0>=23 && LA14_0<=26)||LA14_0==28||LA14_0==31||(LA14_0>=38 && LA14_0<=40)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1263:4: (lv_operations_11_0= ruleOperation )
            	    {
            	    // InternalMyDsl.g:1263:4: (lv_operations_11_0= ruleOperation )
            	    // InternalMyDsl.g:1264:5: lv_operations_11_0= ruleOperation
            	    {

            	    					newCompositeNode(grammarAccess.getFunctionAccess().getOperationsOperationParserRuleCall_11_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_operations_11_0=ruleOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFunctionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_11_0,
            	    						"org.xtext.example.mydsl.MyDsl.Operation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_12=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleLoop"
    // InternalMyDsl.g:1289:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalMyDsl.g:1289:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalMyDsl.g:1290:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalMyDsl.g:1296:1: ruleLoop returns [EObject current=null] : (this_ForLoop_0= ruleForLoop | this_WhileLoop_1= ruleWhileLoop | this_DoLoop_2= ruleDoLoop ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        EObject this_ForLoop_0 = null;

        EObject this_WhileLoop_1 = null;

        EObject this_DoLoop_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1302:2: ( (this_ForLoop_0= ruleForLoop | this_WhileLoop_1= ruleWhileLoop | this_DoLoop_2= ruleDoLoop ) )
            // InternalMyDsl.g:1303:2: (this_ForLoop_0= ruleForLoop | this_WhileLoop_1= ruleWhileLoop | this_DoLoop_2= ruleDoLoop )
            {
            // InternalMyDsl.g:1303:2: (this_ForLoop_0= ruleForLoop | this_WhileLoop_1= ruleWhileLoop | this_DoLoop_2= ruleDoLoop )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt15=1;
                }
                break;
            case 39:
                {
                alt15=2;
                }
                break;
            case 40:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1304:3: this_ForLoop_0= ruleForLoop
                    {

                    			newCompositeNode(grammarAccess.getLoopAccess().getForLoopParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForLoop_0=ruleForLoop();

                    state._fsp--;


                    			current = this_ForLoop_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1313:3: this_WhileLoop_1= ruleWhileLoop
                    {

                    			newCompositeNode(grammarAccess.getLoopAccess().getWhileLoopParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileLoop_1=ruleWhileLoop();

                    state._fsp--;


                    			current = this_WhileLoop_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1322:3: this_DoLoop_2= ruleDoLoop
                    {

                    			newCompositeNode(grammarAccess.getLoopAccess().getDoLoopParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoLoop_2=ruleDoLoop();

                    state._fsp--;


                    			current = this_DoLoop_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleForLoop"
    // InternalMyDsl.g:1334:1: entryRuleForLoop returns [EObject current=null] : iv_ruleForLoop= ruleForLoop EOF ;
    public final EObject entryRuleForLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoop = null;


        try {
            // InternalMyDsl.g:1334:48: (iv_ruleForLoop= ruleForLoop EOF )
            // InternalMyDsl.g:1335:2: iv_ruleForLoop= ruleForLoop EOF
            {
             newCompositeNode(grammarAccess.getForLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForLoop=ruleForLoop();

            state._fsp--;

             current =iv_ruleForLoop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForLoop"


    // $ANTLR start "ruleForLoop"
    // InternalMyDsl.g:1341:1: ruleForLoop returns [EObject current=null] : (otherlv_0= 'For' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_step_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_operations_9_0= ruleOperation ) )* otherlv_10= '}' ) ;
    public final EObject ruleForLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_start_2_0=null;
        Token otherlv_3=null;
        Token lv_end_4_0=null;
        Token otherlv_5=null;
        Token lv_step_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_operations_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1347:2: ( (otherlv_0= 'For' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_step_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_operations_9_0= ruleOperation ) )* otherlv_10= '}' ) )
            // InternalMyDsl.g:1348:2: (otherlv_0= 'For' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_step_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_operations_9_0= ruleOperation ) )* otherlv_10= '}' )
            {
            // InternalMyDsl.g:1348:2: (otherlv_0= 'For' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_step_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_operations_9_0= ruleOperation ) )* otherlv_10= '}' )
            // InternalMyDsl.g:1349:3: otherlv_0= 'For' otherlv_1= '(' ( (lv_start_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_end_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_step_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= '{' ( (lv_operations_9_0= ruleOperation ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getForLoopAccess().getForKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1357:3: ( (lv_start_2_0= RULE_INT ) )
            // InternalMyDsl.g:1358:4: (lv_start_2_0= RULE_INT )
            {
            // InternalMyDsl.g:1358:4: (lv_start_2_0= RULE_INT )
            // InternalMyDsl.g:1359:5: lv_start_2_0= RULE_INT
            {
            lv_start_2_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_start_2_0, grammarAccess.getForLoopAccess().getStartINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForLoopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getForLoopAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:1379:3: ( (lv_end_4_0= RULE_INT ) )
            // InternalMyDsl.g:1380:4: (lv_end_4_0= RULE_INT )
            {
            // InternalMyDsl.g:1380:4: (lv_end_4_0= RULE_INT )
            // InternalMyDsl.g:1381:5: lv_end_4_0= RULE_INT
            {
            lv_end_4_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_end_4_0, grammarAccess.getForLoopAccess().getEndINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForLoopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getForLoopAccess().getCommaKeyword_5());
            		
            // InternalMyDsl.g:1401:3: ( (lv_step_6_0= RULE_INT ) )
            // InternalMyDsl.g:1402:4: (lv_step_6_0= RULE_INT )
            {
            // InternalMyDsl.g:1402:4: (lv_step_6_0= RULE_INT )
            // InternalMyDsl.g:1403:5: lv_step_6_0= RULE_INT
            {
            lv_step_6_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_step_6_0, grammarAccess.getForLoopAccess().getStepINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForLoopRule());
            					}
            					setWithLastConsumed(
            						current,
            						"step",
            						lv_step_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getForLoopAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMyDsl.g:1427:3: ( (lv_operations_9_0= ruleOperation ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=17 && LA16_0<=19)||(LA16_0>=23 && LA16_0<=26)||LA16_0==28||LA16_0==31||(LA16_0>=38 && LA16_0<=40)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1428:4: (lv_operations_9_0= ruleOperation )
            	    {
            	    // InternalMyDsl.g:1428:4: (lv_operations_9_0= ruleOperation )
            	    // InternalMyDsl.g:1429:5: lv_operations_9_0= ruleOperation
            	    {

            	    					newCompositeNode(grammarAccess.getForLoopAccess().getOperationsOperationParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_operations_9_0=ruleOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getForLoopRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_9_0,
            	    						"org.xtext.example.mydsl.MyDsl.Operation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForLoop"


    // $ANTLR start "entryRuleWhileLoop"
    // InternalMyDsl.g:1454:1: entryRuleWhileLoop returns [EObject current=null] : iv_ruleWhileLoop= ruleWhileLoop EOF ;
    public final EObject entryRuleWhileLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoop = null;


        try {
            // InternalMyDsl.g:1454:50: (iv_ruleWhileLoop= ruleWhileLoop EOF )
            // InternalMyDsl.g:1455:2: iv_ruleWhileLoop= ruleWhileLoop EOF
            {
             newCompositeNode(grammarAccess.getWhileLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileLoop=ruleWhileLoop();

            state._fsp--;

             current =iv_ruleWhileLoop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileLoop"


    // $ANTLR start "ruleWhileLoop"
    // InternalMyDsl.g:1461:1: ruleWhileLoop returns [EObject current=null] : (otherlv_0= 'While' otherlv_1= '(' ( (lv_c_2_0= ruleCondition ) ) ( (lv_add_3_0= ruleAddCondition ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) )* otherlv_7= '}' ) ;
    public final EObject ruleWhileLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_c_2_0 = null;

        EObject lv_add_3_0 = null;

        EObject lv_operations_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1467:2: ( (otherlv_0= 'While' otherlv_1= '(' ( (lv_c_2_0= ruleCondition ) ) ( (lv_add_3_0= ruleAddCondition ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) )* otherlv_7= '}' ) )
            // InternalMyDsl.g:1468:2: (otherlv_0= 'While' otherlv_1= '(' ( (lv_c_2_0= ruleCondition ) ) ( (lv_add_3_0= ruleAddCondition ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) )* otherlv_7= '}' )
            {
            // InternalMyDsl.g:1468:2: (otherlv_0= 'While' otherlv_1= '(' ( (lv_c_2_0= ruleCondition ) ) ( (lv_add_3_0= ruleAddCondition ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) )* otherlv_7= '}' )
            // InternalMyDsl.g:1469:3: otherlv_0= 'While' otherlv_1= '(' ( (lv_c_2_0= ruleCondition ) ) ( (lv_add_3_0= ruleAddCondition ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileLoopAccess().getWhileKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1477:3: ( (lv_c_2_0= ruleCondition ) )
            // InternalMyDsl.g:1478:4: (lv_c_2_0= ruleCondition )
            {
            // InternalMyDsl.g:1478:4: (lv_c_2_0= ruleCondition )
            // InternalMyDsl.g:1479:5: lv_c_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getWhileLoopAccess().getCConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_c_2_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileLoopRule());
            					}
            					set(
            						current,
            						"c",
            						lv_c_2_0,
            						"org.xtext.example.mydsl.MyDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1496:3: ( (lv_add_3_0= ruleAddCondition ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=41 && LA17_0<=42)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1497:4: (lv_add_3_0= ruleAddCondition )
            	    {
            	    // InternalMyDsl.g:1497:4: (lv_add_3_0= ruleAddCondition )
            	    // InternalMyDsl.g:1498:5: lv_add_3_0= ruleAddCondition
            	    {

            	    					newCompositeNode(grammarAccess.getWhileLoopAccess().getAddAddConditionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_add_3_0=ruleAddCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhileLoopRule());
            	    					}
            	    					add(
            	    						current,
            	    						"add",
            	    						lv_add_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.AddCondition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getWhileLoopAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:1523:3: ( (lv_operations_6_0= ruleOperation ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=17 && LA18_0<=19)||(LA18_0>=23 && LA18_0<=26)||LA18_0==28||LA18_0==31||(LA18_0>=38 && LA18_0<=40)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1524:4: (lv_operations_6_0= ruleOperation )
            	    {
            	    // InternalMyDsl.g:1524:4: (lv_operations_6_0= ruleOperation )
            	    // InternalMyDsl.g:1525:5: lv_operations_6_0= ruleOperation
            	    {

            	    					newCompositeNode(grammarAccess.getWhileLoopAccess().getOperationsOperationParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_operations_6_0=ruleOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhileLoopRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_6_0,
            	    						"org.xtext.example.mydsl.MyDsl.Operation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getWhileLoopAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileLoop"


    // $ANTLR start "entryRuleDoLoop"
    // InternalMyDsl.g:1550:1: entryRuleDoLoop returns [EObject current=null] : iv_ruleDoLoop= ruleDoLoop EOF ;
    public final EObject entryRuleDoLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoLoop = null;


        try {
            // InternalMyDsl.g:1550:47: (iv_ruleDoLoop= ruleDoLoop EOF )
            // InternalMyDsl.g:1551:2: iv_ruleDoLoop= ruleDoLoop EOF
            {
             newCompositeNode(grammarAccess.getDoLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoLoop=ruleDoLoop();

            state._fsp--;

             current =iv_ruleDoLoop; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoLoop"


    // $ANTLR start "ruleDoLoop"
    // InternalMyDsl.g:1557:1: ruleDoLoop returns [EObject current=null] : (otherlv_0= 'DoWhile' otherlv_1= '(' ( (lv_c_2_0= ruleCondition ) ) ( (lv_add_3_0= ruleAddCondition ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) )* otherlv_7= '}' ) ;
    public final EObject ruleDoLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_c_2_0 = null;

        EObject lv_add_3_0 = null;

        EObject lv_operations_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1563:2: ( (otherlv_0= 'DoWhile' otherlv_1= '(' ( (lv_c_2_0= ruleCondition ) ) ( (lv_add_3_0= ruleAddCondition ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) )* otherlv_7= '}' ) )
            // InternalMyDsl.g:1564:2: (otherlv_0= 'DoWhile' otherlv_1= '(' ( (lv_c_2_0= ruleCondition ) ) ( (lv_add_3_0= ruleAddCondition ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) )* otherlv_7= '}' )
            {
            // InternalMyDsl.g:1564:2: (otherlv_0= 'DoWhile' otherlv_1= '(' ( (lv_c_2_0= ruleCondition ) ) ( (lv_add_3_0= ruleAddCondition ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) )* otherlv_7= '}' )
            // InternalMyDsl.g:1565:3: otherlv_0= 'DoWhile' otherlv_1= '(' ( (lv_c_2_0= ruleCondition ) ) ( (lv_add_3_0= ruleAddCondition ) )* otherlv_4= ')' otherlv_5= '{' ( (lv_operations_6_0= ruleOperation ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getDoLoopAccess().getDoWhileKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getDoLoopAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1573:3: ( (lv_c_2_0= ruleCondition ) )
            // InternalMyDsl.g:1574:4: (lv_c_2_0= ruleCondition )
            {
            // InternalMyDsl.g:1574:4: (lv_c_2_0= ruleCondition )
            // InternalMyDsl.g:1575:5: lv_c_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getDoLoopAccess().getCConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_c_2_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoLoopRule());
            					}
            					set(
            						current,
            						"c",
            						lv_c_2_0,
            						"org.xtext.example.mydsl.MyDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1592:3: ( (lv_add_3_0= ruleAddCondition ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=41 && LA19_0<=42)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1593:4: (lv_add_3_0= ruleAddCondition )
            	    {
            	    // InternalMyDsl.g:1593:4: (lv_add_3_0= ruleAddCondition )
            	    // InternalMyDsl.g:1594:5: lv_add_3_0= ruleAddCondition
            	    {

            	    					newCompositeNode(grammarAccess.getDoLoopAccess().getAddAddConditionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_add_3_0=ruleAddCondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDoLoopRule());
            	    					}
            	    					add(
            	    						current,
            	    						"add",
            	    						lv_add_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.AddCondition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getDoLoopAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getDoLoopAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:1619:3: ( (lv_operations_6_0= ruleOperation ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=17 && LA20_0<=19)||(LA20_0>=23 && LA20_0<=26)||LA20_0==28||LA20_0==31||(LA20_0>=38 && LA20_0<=40)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:1620:4: (lv_operations_6_0= ruleOperation )
            	    {
            	    // InternalMyDsl.g:1620:4: (lv_operations_6_0= ruleOperation )
            	    // InternalMyDsl.g:1621:5: lv_operations_6_0= ruleOperation
            	    {

            	    					newCompositeNode(grammarAccess.getDoLoopAccess().getOperationsOperationParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_operations_6_0=ruleOperation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDoLoopRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_6_0,
            	    						"org.xtext.example.mydsl.MyDsl.Operation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDoLoopAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoLoop"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:1646:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:1646:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:1647:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:1653:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'Condition' (this_SimpleOp_1= ruleSimpleOp | this_Verify_2= ruleVerify | this_Variable_3= ruleVariable ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_SimpleOp_1 = null;

        EObject this_Verify_2 = null;

        EObject this_Variable_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1659:2: ( (otherlv_0= 'Condition' (this_SimpleOp_1= ruleSimpleOp | this_Verify_2= ruleVerify | this_Variable_3= ruleVariable ) ) )
            // InternalMyDsl.g:1660:2: (otherlv_0= 'Condition' (this_SimpleOp_1= ruleSimpleOp | this_Verify_2= ruleVerify | this_Variable_3= ruleVariable ) )
            {
            // InternalMyDsl.g:1660:2: (otherlv_0= 'Condition' (this_SimpleOp_1= ruleSimpleOp | this_Verify_2= ruleVerify | this_Variable_3= ruleVariable ) )
            // InternalMyDsl.g:1661:3: otherlv_0= 'Condition' (this_SimpleOp_1= ruleSimpleOp | this_Verify_2= ruleVerify | this_Variable_3= ruleVariable )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0());
            		
            // InternalMyDsl.g:1665:3: (this_SimpleOp_1= ruleSimpleOp | this_Verify_2= ruleVerify | this_Variable_3= ruleVariable )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt21=1;
                }
                break;
            case 24:
                {
                alt21=2;
                }
                break;
            case 29:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1666:4: this_SimpleOp_1= ruleSimpleOp
                    {

                    				newCompositeNode(grammarAccess.getConditionAccess().getSimpleOpParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_SimpleOp_1=ruleSimpleOp();

                    state._fsp--;


                    				current = this_SimpleOp_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1675:4: this_Verify_2= ruleVerify
                    {

                    				newCompositeNode(grammarAccess.getConditionAccess().getVerifyParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Verify_2=ruleVerify();

                    state._fsp--;


                    				current = this_Verify_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1684:4: this_Variable_3= ruleVariable
                    {

                    				newCompositeNode(grammarAccess.getConditionAccess().getVariableParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_Variable_3=ruleVariable();

                    state._fsp--;


                    				current = this_Variable_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleAddCondition"
    // InternalMyDsl.g:1697:1: entryRuleAddCondition returns [EObject current=null] : iv_ruleAddCondition= ruleAddCondition EOF ;
    public final EObject entryRuleAddCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddCondition = null;


        try {
            // InternalMyDsl.g:1697:53: (iv_ruleAddCondition= ruleAddCondition EOF )
            // InternalMyDsl.g:1698:2: iv_ruleAddCondition= ruleAddCondition EOF
            {
             newCompositeNode(grammarAccess.getAddConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddCondition=ruleAddCondition();

            state._fsp--;

             current =iv_ruleAddCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddCondition"


    // $ANTLR start "ruleAddCondition"
    // InternalMyDsl.g:1704:1: ruleAddCondition returns [EObject current=null] : ( ( ( (lv_op_0_1= 'And' | lv_op_0_2= 'Or' ) ) ) ( (lv_cond_1_0= ruleCondition ) ) ) ;
    public final EObject ruleAddCondition() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        EObject lv_cond_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1710:2: ( ( ( ( (lv_op_0_1= 'And' | lv_op_0_2= 'Or' ) ) ) ( (lv_cond_1_0= ruleCondition ) ) ) )
            // InternalMyDsl.g:1711:2: ( ( ( (lv_op_0_1= 'And' | lv_op_0_2= 'Or' ) ) ) ( (lv_cond_1_0= ruleCondition ) ) )
            {
            // InternalMyDsl.g:1711:2: ( ( ( (lv_op_0_1= 'And' | lv_op_0_2= 'Or' ) ) ) ( (lv_cond_1_0= ruleCondition ) ) )
            // InternalMyDsl.g:1712:3: ( ( (lv_op_0_1= 'And' | lv_op_0_2= 'Or' ) ) ) ( (lv_cond_1_0= ruleCondition ) )
            {
            // InternalMyDsl.g:1712:3: ( ( (lv_op_0_1= 'And' | lv_op_0_2= 'Or' ) ) )
            // InternalMyDsl.g:1713:4: ( (lv_op_0_1= 'And' | lv_op_0_2= 'Or' ) )
            {
            // InternalMyDsl.g:1713:4: ( (lv_op_0_1= 'And' | lv_op_0_2= 'Or' ) )
            // InternalMyDsl.g:1714:5: (lv_op_0_1= 'And' | lv_op_0_2= 'Or' )
            {
            // InternalMyDsl.g:1714:5: (lv_op_0_1= 'And' | lv_op_0_2= 'Or' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            else if ( (LA22_0==42) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1715:6: lv_op_0_1= 'And'
                    {
                    lv_op_0_1=(Token)match(input,41,FOLLOW_15); 

                    						newLeafNode(lv_op_0_1, grammarAccess.getAddConditionAccess().getOpAndKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddConditionRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1726:6: lv_op_0_2= 'Or'
                    {
                    lv_op_0_2=(Token)match(input,42,FOLLOW_15); 

                    						newLeafNode(lv_op_0_2, grammarAccess.getAddConditionAccess().getOpOrKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddConditionRule());
                    						}
                    						setWithLastConsumed(current, "op", lv_op_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalMyDsl.g:1739:3: ( (lv_cond_1_0= ruleCondition ) )
            // InternalMyDsl.g:1740:4: (lv_cond_1_0= ruleCondition )
            {
            // InternalMyDsl.g:1740:4: (lv_cond_1_0= ruleCondition )
            // InternalMyDsl.g:1741:5: lv_cond_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getAddConditionAccess().getCondConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_cond_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAddConditionRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_1_0,
            						"org.xtext.example.mydsl.MyDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddCondition"


    // $ANTLR start "entryRuleElements"
    // InternalMyDsl.g:1762:1: entryRuleElements returns [EObject current=null] : iv_ruleElements= ruleElements EOF ;
    public final EObject entryRuleElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElements = null;


        try {
            // InternalMyDsl.g:1762:49: (iv_ruleElements= ruleElements EOF )
            // InternalMyDsl.g:1763:2: iv_ruleElements= ruleElements EOF
            {
             newCompositeNode(grammarAccess.getElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElements=ruleElements();

            state._fsp--;

             current =iv_ruleElements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElements"


    // $ANTLR start "ruleElements"
    // InternalMyDsl.g:1769:1: ruleElements returns [EObject current=null] : (otherlv_0= 'Elements' ( (lv_type_1_0= ruleEltType ) ) ) ;
    public final EObject ruleElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1775:2: ( (otherlv_0= 'Elements' ( (lv_type_1_0= ruleEltType ) ) ) )
            // InternalMyDsl.g:1776:2: (otherlv_0= 'Elements' ( (lv_type_1_0= ruleEltType ) ) )
            {
            // InternalMyDsl.g:1776:2: (otherlv_0= 'Elements' ( (lv_type_1_0= ruleEltType ) ) )
            // InternalMyDsl.g:1777:3: otherlv_0= 'Elements' ( (lv_type_1_0= ruleEltType ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getElementsAccess().getElementsKeyword_0());
            		
            // InternalMyDsl.g:1781:3: ( (lv_type_1_0= ruleEltType ) )
            // InternalMyDsl.g:1782:4: (lv_type_1_0= ruleEltType )
            {
            // InternalMyDsl.g:1782:4: (lv_type_1_0= ruleEltType )
            // InternalMyDsl.g:1783:5: lv_type_1_0= ruleEltType
            {

            					newCompositeNode(grammarAccess.getElementsAccess().getTypeEltTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleEltType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementsRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.example.mydsl.MyDsl.EltType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElements"


    // $ANTLR start "entryRuleElement"
    // InternalMyDsl.g:1804:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalMyDsl.g:1804:48: (iv_ruleElement= ruleElement EOF )
            // InternalMyDsl.g:1805:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyDsl.g:1811:1: ruleElement returns [EObject current=null] : (otherlv_0= 'Element' ( (lv_type_1_0= ruleEltType ) ) ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1817:2: ( (otherlv_0= 'Element' ( (lv_type_1_0= ruleEltType ) ) ) )
            // InternalMyDsl.g:1818:2: (otherlv_0= 'Element' ( (lv_type_1_0= ruleEltType ) ) )
            {
            // InternalMyDsl.g:1818:2: (otherlv_0= 'Element' ( (lv_type_1_0= ruleEltType ) ) )
            // InternalMyDsl.g:1819:3: otherlv_0= 'Element' ( (lv_type_1_0= ruleEltType ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getElementAccess().getElementKeyword_0());
            		
            // InternalMyDsl.g:1823:3: ( (lv_type_1_0= ruleEltType ) )
            // InternalMyDsl.g:1824:4: (lv_type_1_0= ruleEltType )
            {
            // InternalMyDsl.g:1824:4: (lv_type_1_0= ruleEltType )
            // InternalMyDsl.g:1825:5: lv_type_1_0= ruleEltType
            {

            					newCompositeNode(grammarAccess.getElementAccess().getTypeEltTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleEltType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.example.mydsl.MyDsl.EltType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleEltType"
    // InternalMyDsl.g:1846:1: entryRuleEltType returns [EObject current=null] : iv_ruleEltType= ruleEltType EOF ;
    public final EObject entryRuleEltType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEltType = null;


        try {
            // InternalMyDsl.g:1846:48: (iv_ruleEltType= ruleEltType EOF )
            // InternalMyDsl.g:1847:2: iv_ruleEltType= ruleEltType EOF
            {
             newCompositeNode(grammarAccess.getEltTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEltType=ruleEltType();

            state._fsp--;

             current =iv_ruleEltType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEltType"


    // $ANTLR start "ruleEltType"
    // InternalMyDsl.g:1853:1: ruleEltType returns [EObject current=null] : (this_Tag_0= ruleTag | otherlv_1= 'URL' | this_Variable_2= ruleVariable ) ;
    public final EObject ruleEltType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Tag_0 = null;

        EObject this_Variable_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1859:2: ( (this_Tag_0= ruleTag | otherlv_1= 'URL' | this_Variable_2= ruleVariable ) )
            // InternalMyDsl.g:1860:2: (this_Tag_0= ruleTag | otherlv_1= 'URL' | this_Variable_2= ruleVariable )
            {
            // InternalMyDsl.g:1860:2: (this_Tag_0= ruleTag | otherlv_1= 'URL' | this_Variable_2= ruleVariable )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt23=1;
                }
                break;
            case 43:
                {
                alt23=2;
                }
                break;
            case 29:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1861:3: this_Tag_0= ruleTag
                    {

                    			newCompositeNode(grammarAccess.getEltTypeAccess().getTagParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tag_0=ruleTag();

                    state._fsp--;


                    			current = this_Tag_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1870:3: otherlv_1= 'URL'
                    {
                    otherlv_1=(Token)match(input,43,FOLLOW_2); 

                    			newLeafNode(otherlv_1, grammarAccess.getEltTypeAccess().getURLKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1875:3: this_Variable_2= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getEltTypeAccess().getVariableParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_2=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEltType"


    // $ANTLR start "entryRuleTag"
    // InternalMyDsl.g:1887:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalMyDsl.g:1887:44: (iv_ruleTag= ruleTag EOF )
            // InternalMyDsl.g:1888:2: iv_ruleTag= ruleTag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTag=ruleTag();

            state._fsp--;

             current =iv_ruleTag; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalMyDsl.g:1894:1: ruleTag returns [EObject current=null] : (otherlv_0= '{' ( (lv_html_1_0= RULE_HTML_ELT ) ) ( (lv_tag_2_0= ruleText ) ) otherlv_3= '}' ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_html_1_0=null;
        Token otherlv_3=null;
        EObject lv_tag_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1900:2: ( (otherlv_0= '{' ( (lv_html_1_0= RULE_HTML_ELT ) ) ( (lv_tag_2_0= ruleText ) ) otherlv_3= '}' ) )
            // InternalMyDsl.g:1901:2: (otherlv_0= '{' ( (lv_html_1_0= RULE_HTML_ELT ) ) ( (lv_tag_2_0= ruleText ) ) otherlv_3= '}' )
            {
            // InternalMyDsl.g:1901:2: (otherlv_0= '{' ( (lv_html_1_0= RULE_HTML_ELT ) ) ( (lv_tag_2_0= ruleText ) ) otherlv_3= '}' )
            // InternalMyDsl.g:1902:3: otherlv_0= '{' ( (lv_html_1_0= RULE_HTML_ELT ) ) ( (lv_tag_2_0= ruleText ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getTagAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMyDsl.g:1906:3: ( (lv_html_1_0= RULE_HTML_ELT ) )
            // InternalMyDsl.g:1907:4: (lv_html_1_0= RULE_HTML_ELT )
            {
            // InternalMyDsl.g:1907:4: (lv_html_1_0= RULE_HTML_ELT )
            // InternalMyDsl.g:1908:5: lv_html_1_0= RULE_HTML_ELT
            {
            lv_html_1_0=(Token)match(input,RULE_HTML_ELT,FOLLOW_9); 

            					newLeafNode(lv_html_1_0, grammarAccess.getTagAccess().getHtmlHTML_ELTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"html",
            						lv_html_1_0,
            						"org.xtext.example.mydsl.MyDsl.HTML_ELT");
            				

            }


            }

            // InternalMyDsl.g:1924:3: ( (lv_tag_2_0= ruleText ) )
            // InternalMyDsl.g:1925:4: (lv_tag_2_0= ruleText )
            {
            // InternalMyDsl.g:1925:4: (lv_tag_2_0= ruleText )
            // InternalMyDsl.g:1926:5: lv_tag_2_0= ruleText
            {

            					newCompositeNode(grammarAccess.getTagAccess().getTagTextParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
            lv_tag_2_0=ruleText();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTagRule());
            					}
            					set(
            						current,
            						"tag",
            						lv_tag_2_0,
            						"org.xtext.example.mydsl.MyDsl.Text");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTagAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleSimpleOp"
    // InternalMyDsl.g:1951:1: entryRuleSimpleOp returns [EObject current=null] : iv_ruleSimpleOp= ruleSimpleOp EOF ;
    public final EObject entryRuleSimpleOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleOp = null;


        try {
            // InternalMyDsl.g:1951:49: (iv_ruleSimpleOp= ruleSimpleOp EOF )
            // InternalMyDsl.g:1952:2: iv_ruleSimpleOp= ruleSimpleOp EOF
            {
             newCompositeNode(grammarAccess.getSimpleOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleOp=ruleSimpleOp();

            state._fsp--;

             current =iv_ruleSimpleOp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleOp"


    // $ANTLR start "ruleSimpleOp"
    // InternalMyDsl.g:1958:1: ruleSimpleOp returns [EObject current=null] : (otherlv_0= '(' ( (lv_elt1_1_0= ruleComparableElt ) ) ( (lv_op_2_0= RULE_OP ) ) ( (lv_elt2_3_0= ruleComparableElt ) ) otherlv_4= ')' ) ;
    public final EObject ruleSimpleOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_op_2_0=null;
        Token otherlv_4=null;
        EObject lv_elt1_1_0 = null;

        EObject lv_elt2_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1964:2: ( (otherlv_0= '(' ( (lv_elt1_1_0= ruleComparableElt ) ) ( (lv_op_2_0= RULE_OP ) ) ( (lv_elt2_3_0= ruleComparableElt ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:1965:2: (otherlv_0= '(' ( (lv_elt1_1_0= ruleComparableElt ) ) ( (lv_op_2_0= RULE_OP ) ) ( (lv_elt2_3_0= ruleComparableElt ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:1965:2: (otherlv_0= '(' ( (lv_elt1_1_0= ruleComparableElt ) ) ( (lv_op_2_0= RULE_OP ) ) ( (lv_elt2_3_0= ruleComparableElt ) ) otherlv_4= ')' )
            // InternalMyDsl.g:1966:3: otherlv_0= '(' ( (lv_elt1_1_0= ruleComparableElt ) ) ( (lv_op_2_0= RULE_OP ) ) ( (lv_elt2_3_0= ruleComparableElt ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleOpAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:1970:3: ( (lv_elt1_1_0= ruleComparableElt ) )
            // InternalMyDsl.g:1971:4: (lv_elt1_1_0= ruleComparableElt )
            {
            // InternalMyDsl.g:1971:4: (lv_elt1_1_0= ruleComparableElt )
            // InternalMyDsl.g:1972:5: lv_elt1_1_0= ruleComparableElt
            {

            					newCompositeNode(grammarAccess.getSimpleOpAccess().getElt1ComparableEltParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_32);
            lv_elt1_1_0=ruleComparableElt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleOpRule());
            					}
            					set(
            						current,
            						"elt1",
            						lv_elt1_1_0,
            						"org.xtext.example.mydsl.MyDsl.ComparableElt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1989:3: ( (lv_op_2_0= RULE_OP ) )
            // InternalMyDsl.g:1990:4: (lv_op_2_0= RULE_OP )
            {
            // InternalMyDsl.g:1990:4: (lv_op_2_0= RULE_OP )
            // InternalMyDsl.g:1991:5: lv_op_2_0= RULE_OP
            {
            lv_op_2_0=(Token)match(input,RULE_OP,FOLLOW_31); 

            					newLeafNode(lv_op_2_0, grammarAccess.getSimpleOpAccess().getOpOPTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleOpRule());
            					}
            					setWithLastConsumed(
            						current,
            						"op",
            						lv_op_2_0,
            						"org.xtext.example.mydsl.MyDsl.OP");
            				

            }


            }

            // InternalMyDsl.g:2007:3: ( (lv_elt2_3_0= ruleComparableElt ) )
            // InternalMyDsl.g:2008:4: (lv_elt2_3_0= ruleComparableElt )
            {
            // InternalMyDsl.g:2008:4: (lv_elt2_3_0= ruleComparableElt )
            // InternalMyDsl.g:2009:5: lv_elt2_3_0= ruleComparableElt
            {

            					newCompositeNode(grammarAccess.getSimpleOpAccess().getElt2ComparableEltParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_elt2_3_0=ruleComparableElt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleOpRule());
            					}
            					set(
            						current,
            						"elt2",
            						lv_elt2_3_0,
            						"org.xtext.example.mydsl.MyDsl.ComparableElt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSimpleOpAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleOp"


    // $ANTLR start "entryRuleComparableElt"
    // InternalMyDsl.g:2034:1: entryRuleComparableElt returns [EObject current=null] : iv_ruleComparableElt= ruleComparableElt EOF ;
    public final EObject entryRuleComparableElt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparableElt = null;


        try {
            // InternalMyDsl.g:2034:54: (iv_ruleComparableElt= ruleComparableElt EOF )
            // InternalMyDsl.g:2035:2: iv_ruleComparableElt= ruleComparableElt EOF
            {
             newCompositeNode(grammarAccess.getComparableEltRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparableElt=ruleComparableElt();

            state._fsp--;

             current =iv_ruleComparableElt; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparableElt"


    // $ANTLR start "ruleComparableElt"
    // InternalMyDsl.g:2041:1: ruleComparableElt returns [EObject current=null] : ( ( (lv_inte_0_0= RULE_INT ) ) | ( (lv_text_1_0= ruleText ) ) ) ;
    public final EObject ruleComparableElt() throws RecognitionException {
        EObject current = null;

        Token lv_inte_0_0=null;
        EObject lv_text_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2047:2: ( ( ( (lv_inte_0_0= RULE_INT ) ) | ( (lv_text_1_0= ruleText ) ) ) )
            // InternalMyDsl.g:2048:2: ( ( (lv_inte_0_0= RULE_INT ) ) | ( (lv_text_1_0= ruleText ) ) )
            {
            // InternalMyDsl.g:2048:2: ( ( (lv_inte_0_0= RULE_INT ) ) | ( (lv_text_1_0= ruleText ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_STRING||LA24_0==29) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:2049:3: ( (lv_inte_0_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:2049:3: ( (lv_inte_0_0= RULE_INT ) )
                    // InternalMyDsl.g:2050:4: (lv_inte_0_0= RULE_INT )
                    {
                    // InternalMyDsl.g:2050:4: (lv_inte_0_0= RULE_INT )
                    // InternalMyDsl.g:2051:5: lv_inte_0_0= RULE_INT
                    {
                    lv_inte_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_inte_0_0, grammarAccess.getComparableEltAccess().getInteINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComparableEltRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"inte",
                    						lv_inte_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2068:3: ( (lv_text_1_0= ruleText ) )
                    {
                    // InternalMyDsl.g:2068:3: ( (lv_text_1_0= ruleText ) )
                    // InternalMyDsl.g:2069:4: (lv_text_1_0= ruleText )
                    {
                    // InternalMyDsl.g:2069:4: (lv_text_1_0= ruleText )
                    // InternalMyDsl.g:2070:5: lv_text_1_0= ruleText
                    {

                    					newCompositeNode(grammarAccess.getComparableEltAccess().getTextTextParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_text_1_0=ruleText();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComparableEltRule());
                    					}
                    					set(
                    						current,
                    						"text",
                    						lv_text_1_0,
                    						"org.xtext.example.mydsl.MyDsl.Text");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparableElt"


    // $ANTLR start "entryRuleText"
    // InternalMyDsl.g:2091:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalMyDsl.g:2091:45: (iv_ruleText= ruleText EOF )
            // InternalMyDsl.g:2092:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalMyDsl.g:2098:1: ruleText returns [EObject current=null] : ( ( (lv_vari_0_0= ruleVariable ) ) | ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_vari_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2104:2: ( ( ( (lv_vari_0_0= ruleVariable ) ) | ( (lv_name_1_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:2105:2: ( ( (lv_vari_0_0= ruleVariable ) ) | ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:2105:2: ( ( (lv_vari_0_0= ruleVariable ) ) | ( (lv_name_1_0= RULE_STRING ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_STRING) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:2106:3: ( (lv_vari_0_0= ruleVariable ) )
                    {
                    // InternalMyDsl.g:2106:3: ( (lv_vari_0_0= ruleVariable ) )
                    // InternalMyDsl.g:2107:4: (lv_vari_0_0= ruleVariable )
                    {
                    // InternalMyDsl.g:2107:4: (lv_vari_0_0= ruleVariable )
                    // InternalMyDsl.g:2108:5: lv_vari_0_0= ruleVariable
                    {

                    					newCompositeNode(grammarAccess.getTextAccess().getVariVariableParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_vari_0_0=ruleVariable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTextRule());
                    					}
                    					set(
                    						current,
                    						"vari",
                    						lv_vari_0_0,
                    						"org.xtext.example.mydsl.MyDsl.Variable");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2126:3: ( (lv_name_1_0= RULE_STRING ) )
                    {
                    // InternalMyDsl.g:2126:3: ( (lv_name_1_0= RULE_STRING ) )
                    // InternalMyDsl.g:2127:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalMyDsl.g:2127:4: (lv_name_1_0= RULE_STRING )
                    // InternalMyDsl.g:2128:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getTextAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTextRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:2148:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMyDsl.g:2148:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMyDsl.g:2149:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMyDsl.g:2155:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'Var' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2161:2: ( (otherlv_0= 'Var' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:2162:2: (otherlv_0= 'Var' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:2162:2: (otherlv_0= 'Var' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMyDsl.g:2163:3: otherlv_0= 'Var' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
            		
            // InternalMyDsl.g:2167:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:2168:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:2168:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:2169:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000001C0978F0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001CE0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000060000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000E20000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000F00400000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000001C097CE0000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000219E0000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080020004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000020000050L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000100L});

}