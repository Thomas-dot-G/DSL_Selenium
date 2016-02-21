package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_HTML_ELT", "RULE_OP", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'And'", "'Or'", "'URL'", "'Selenium'", "'{'", "'Browser'", "'}'", "'Click'", "'Go'", "'Fill'", "'('", "','", "')'", "'Select'", "'Verify'", "'Apply_All'", "'if'", "'else'", "'Store'", "'Var'", "'='", "'func'", "'Function'", "'Name'", "'For'", "'While'", "'DoWhile'", "'Condition'", "'Elements'", "'Element'", "'Text'"
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalMyDsl.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleProgram EOF )
            // InternalMyDsl.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyDsl.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Program__Group__0 )
            // InternalMyDsl.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleBrowser_Task"
    // InternalMyDsl.g:78:1: entryRuleBrowser_Task : ruleBrowser_Task EOF ;
    public final void entryRuleBrowser_Task() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleBrowser_Task EOF )
            // InternalMyDsl.g:80:1: ruleBrowser_Task EOF
            {
             before(grammarAccess.getBrowser_TaskRule()); 
            pushFollow(FOLLOW_1);
            ruleBrowser_Task();

            state._fsp--;

             after(grammarAccess.getBrowser_TaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBrowser_Task"


    // $ANTLR start "ruleBrowser_Task"
    // InternalMyDsl.g:87:1: ruleBrowser_Task : ( ( rule__Browser_Task__Group__0 ) ) ;
    public final void ruleBrowser_Task() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Browser_Task__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Browser_Task__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Browser_Task__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Browser_Task__Group__0 )
            {
             before(grammarAccess.getBrowser_TaskAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Browser_Task__Group__0 )
            // InternalMyDsl.g:94:4: rule__Browser_Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Browser_Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBrowser_TaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBrowser_Task"


    // $ANTLR start "entryRuleOperation"
    // InternalMyDsl.g:103:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleOperation EOF )
            // InternalMyDsl.g:105:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMyDsl.g:112:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Operation__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__Operation__Alternatives )
            // InternalMyDsl.g:119:4: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:128:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleAction EOF )
            // InternalMyDsl.g:130:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:137:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Action__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Action__Alternatives )
            // InternalMyDsl.g:144:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleClick"
    // InternalMyDsl.g:153:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleClick EOF )
            // InternalMyDsl.g:155:1: ruleClick EOF
            {
             before(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            ruleClick();

            state._fsp--;

             after(grammarAccess.getClickRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalMyDsl.g:162:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Click__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Click__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Click__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Click__Group__0 )
            // InternalMyDsl.g:169:4: rule__Click__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleGo"
    // InternalMyDsl.g:178:1: entryRuleGo : ruleGo EOF ;
    public final void entryRuleGo() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleGo EOF )
            // InternalMyDsl.g:180:1: ruleGo EOF
            {
             before(grammarAccess.getGoRule()); 
            pushFollow(FOLLOW_1);
            ruleGo();

            state._fsp--;

             after(grammarAccess.getGoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGo"


    // $ANTLR start "ruleGo"
    // InternalMyDsl.g:187:1: ruleGo : ( ( rule__Go__Group__0 ) ) ;
    public final void ruleGo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Go__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Go__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Go__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Go__Group__0 )
            {
             before(grammarAccess.getGoAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Go__Group__0 )
            // InternalMyDsl.g:194:4: rule__Go__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Go__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGo"


    // $ANTLR start "entryRuleFill"
    // InternalMyDsl.g:203:1: entryRuleFill : ruleFill EOF ;
    public final void entryRuleFill() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleFill EOF )
            // InternalMyDsl.g:205:1: ruleFill EOF
            {
             before(grammarAccess.getFillRule()); 
            pushFollow(FOLLOW_1);
            ruleFill();

            state._fsp--;

             after(grammarAccess.getFillRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFill"


    // $ANTLR start "ruleFill"
    // InternalMyDsl.g:212:1: ruleFill : ( ( rule__Fill__Group__0 ) ) ;
    public final void ruleFill() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Fill__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Fill__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Fill__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Fill__Group__0 )
            {
             before(grammarAccess.getFillAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Fill__Group__0 )
            // InternalMyDsl.g:219:4: rule__Fill__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fill__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFill"


    // $ANTLR start "entryRuleSelect"
    // InternalMyDsl.g:228:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleSelect EOF )
            // InternalMyDsl.g:230:1: ruleSelect EOF
            {
             before(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getSelectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalMyDsl.g:237:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Select__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Select__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Select__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Select__Group__0 )
            // InternalMyDsl.g:244:4: rule__Select__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleVerify"
    // InternalMyDsl.g:253:1: entryRuleVerify : ruleVerify EOF ;
    public final void entryRuleVerify() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleVerify EOF )
            // InternalMyDsl.g:255:1: ruleVerify EOF
            {
             before(grammarAccess.getVerifyRule()); 
            pushFollow(FOLLOW_1);
            ruleVerify();

            state._fsp--;

             after(grammarAccess.getVerifyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerify"


    // $ANTLR start "ruleVerify"
    // InternalMyDsl.g:262:1: ruleVerify : ( ( rule__Verify__Group__0 ) ) ;
    public final void ruleVerify() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Verify__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Verify__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Verify__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Verify__Group__0 )
            {
             before(grammarAccess.getVerifyAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Verify__Group__0 )
            // InternalMyDsl.g:269:4: rule__Verify__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerify"


    // $ANTLR start "entryRuleApply_All"
    // InternalMyDsl.g:278:1: entryRuleApply_All : ruleApply_All EOF ;
    public final void entryRuleApply_All() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleApply_All EOF )
            // InternalMyDsl.g:280:1: ruleApply_All EOF
            {
             before(grammarAccess.getApply_AllRule()); 
            pushFollow(FOLLOW_1);
            ruleApply_All();

            state._fsp--;

             after(grammarAccess.getApply_AllRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApply_All"


    // $ANTLR start "ruleApply_All"
    // InternalMyDsl.g:287:1: ruleApply_All : ( ( rule__Apply_All__Group__0 ) ) ;
    public final void ruleApply_All() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Apply_All__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Apply_All__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Apply_All__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Apply_All__Group__0 )
            {
             before(grammarAccess.getApply_AllAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Apply_All__Group__0 )
            // InternalMyDsl.g:294:4: rule__Apply_All__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Apply_All__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApply_AllAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApply_All"


    // $ANTLR start "entryRuleIf"
    // InternalMyDsl.g:303:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleIf EOF )
            // InternalMyDsl.g:305:1: ruleIf EOF
            {
             before(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            ruleIf();

            state._fsp--;

             after(grammarAccess.getIfRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalMyDsl.g:312:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__If__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__If__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__If__Group__0 )
            // InternalMyDsl.g:319:4: rule__If__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleStore"
    // InternalMyDsl.g:328:1: entryRuleStore : ruleStore EOF ;
    public final void entryRuleStore() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleStore EOF )
            // InternalMyDsl.g:330:1: ruleStore EOF
            {
             before(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_1);
            ruleStore();

            state._fsp--;

             after(grammarAccess.getStoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // InternalMyDsl.g:337:1: ruleStore : ( ( rule__Store__Group__0 ) ) ;
    public final void ruleStore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Store__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Store__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Store__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Store__Group__0 )
            {
             before(grammarAccess.getStoreAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Store__Group__0 )
            // InternalMyDsl.g:344:4: rule__Store__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleCallFunction"
    // InternalMyDsl.g:353:1: entryRuleCallFunction : ruleCallFunction EOF ;
    public final void entryRuleCallFunction() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleCallFunction EOF )
            // InternalMyDsl.g:355:1: ruleCallFunction EOF
            {
             before(grammarAccess.getCallFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleCallFunction();

            state._fsp--;

             after(grammarAccess.getCallFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCallFunction"


    // $ANTLR start "ruleCallFunction"
    // InternalMyDsl.g:362:1: ruleCallFunction : ( ( rule__CallFunction__Group__0 ) ) ;
    public final void ruleCallFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__CallFunction__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__CallFunction__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__CallFunction__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__CallFunction__Group__0 )
            {
             before(grammarAccess.getCallFunctionAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__CallFunction__Group__0 )
            // InternalMyDsl.g:369:4: rule__CallFunction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CallFunction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCallFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCallFunction"


    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:378:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleType EOF )
            // InternalMyDsl.g:380:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:387:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:393:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:394:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:394:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleStringType"
    // InternalMyDsl.g:403:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleStringType EOF )
            // InternalMyDsl.g:405:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleStringType();

            state._fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalMyDsl.g:412:1: ruleStringType : ( ( rule__StringType__Alternatives ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__StringType__Alternatives ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__StringType__Alternatives ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__StringType__Alternatives ) )
            // InternalMyDsl.g:418:3: ( rule__StringType__Alternatives )
            {
             before(grammarAccess.getStringTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:419:3: ( rule__StringType__Alternatives )
            // InternalMyDsl.g:419:4: rule__StringType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleFuncVar"
    // InternalMyDsl.g:428:1: entryRuleFuncVar : ruleFuncVar EOF ;
    public final void entryRuleFuncVar() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleFuncVar EOF )
            // InternalMyDsl.g:430:1: ruleFuncVar EOF
            {
             before(grammarAccess.getFuncVarRule()); 
            pushFollow(FOLLOW_1);
            ruleFuncVar();

            state._fsp--;

             after(grammarAccess.getFuncVarRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFuncVar"


    // $ANTLR start "ruleFuncVar"
    // InternalMyDsl.g:437:1: ruleFuncVar : ( ( rule__FuncVar__Group__0 ) ) ;
    public final void ruleFuncVar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__FuncVar__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__FuncVar__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__FuncVar__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__FuncVar__Group__0 )
            {
             before(grammarAccess.getFuncVarAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__FuncVar__Group__0 )
            // InternalMyDsl.g:444:4: rule__FuncVar__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FuncVar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFuncVarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFuncVar"


    // $ANTLR start "entryRuleFunction"
    // InternalMyDsl.g:453:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleFunction EOF )
            // InternalMyDsl.g:455:1: ruleFunction EOF
            {
             before(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getFunctionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalMyDsl.g:462:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Function__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Function__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Function__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Function__Group__0 )
            {
             before(grammarAccess.getFunctionAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Function__Group__0 )
            // InternalMyDsl.g:469:4: rule__Function__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleLoop"
    // InternalMyDsl.g:478:1: entryRuleLoop : ruleLoop EOF ;
    public final void entryRuleLoop() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleLoop EOF )
            // InternalMyDsl.g:480:1: ruleLoop EOF
            {
             before(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleLoop();

            state._fsp--;

             after(grammarAccess.getLoopRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalMyDsl.g:487:1: ruleLoop : ( ( rule__Loop__Alternatives ) ) ;
    public final void ruleLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Loop__Alternatives ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Loop__Alternatives ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Loop__Alternatives ) )
            // InternalMyDsl.g:493:3: ( rule__Loop__Alternatives )
            {
             before(grammarAccess.getLoopAccess().getAlternatives()); 
            // InternalMyDsl.g:494:3: ( rule__Loop__Alternatives )
            // InternalMyDsl.g:494:4: rule__Loop__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Loop__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLoopAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleForLoop"
    // InternalMyDsl.g:503:1: entryRuleForLoop : ruleForLoop EOF ;
    public final void entryRuleForLoop() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleForLoop EOF )
            // InternalMyDsl.g:505:1: ruleForLoop EOF
            {
             before(grammarAccess.getForLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleForLoop();

            state._fsp--;

             after(grammarAccess.getForLoopRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForLoop"


    // $ANTLR start "ruleForLoop"
    // InternalMyDsl.g:512:1: ruleForLoop : ( ( rule__ForLoop__Group__0 ) ) ;
    public final void ruleForLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__ForLoop__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__ForLoop__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__ForLoop__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__ForLoop__Group__0 )
            {
             before(grammarAccess.getForLoopAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__ForLoop__Group__0 )
            // InternalMyDsl.g:519:4: rule__ForLoop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForLoop"


    // $ANTLR start "entryRuleWhileLoop"
    // InternalMyDsl.g:528:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleWhileLoop EOF )
            // InternalMyDsl.g:530:1: ruleWhileLoop EOF
            {
             before(grammarAccess.getWhileLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleWhileLoop();

            state._fsp--;

             after(grammarAccess.getWhileLoopRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhileLoop"


    // $ANTLR start "ruleWhileLoop"
    // InternalMyDsl.g:537:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__WhileLoop__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__WhileLoop__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__WhileLoop__Group__0 )
            {
             before(grammarAccess.getWhileLoopAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__WhileLoop__Group__0 )
            // InternalMyDsl.g:544:4: rule__WhileLoop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhileLoop"


    // $ANTLR start "entryRuleDoLoop"
    // InternalMyDsl.g:553:1: entryRuleDoLoop : ruleDoLoop EOF ;
    public final void entryRuleDoLoop() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleDoLoop EOF )
            // InternalMyDsl.g:555:1: ruleDoLoop EOF
            {
             before(grammarAccess.getDoLoopRule()); 
            pushFollow(FOLLOW_1);
            ruleDoLoop();

            state._fsp--;

             after(grammarAccess.getDoLoopRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoLoop"


    // $ANTLR start "ruleDoLoop"
    // InternalMyDsl.g:562:1: ruleDoLoop : ( ( rule__DoLoop__Group__0 ) ) ;
    public final void ruleDoLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__DoLoop__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__DoLoop__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__DoLoop__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__DoLoop__Group__0 )
            {
             before(grammarAccess.getDoLoopAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__DoLoop__Group__0 )
            // InternalMyDsl.g:569:4: rule__DoLoop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoLoop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoLoop"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:578:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleCondition EOF )
            // InternalMyDsl.g:580:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:587:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__Condition__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__Condition__Group__0 )
            // InternalMyDsl.g:594:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleAddCondition"
    // InternalMyDsl.g:603:1: entryRuleAddCondition : ruleAddCondition EOF ;
    public final void entryRuleAddCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleAddCondition EOF )
            // InternalMyDsl.g:605:1: ruleAddCondition EOF
            {
             before(grammarAccess.getAddConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddCondition();

            state._fsp--;

             after(grammarAccess.getAddConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddCondition"


    // $ANTLR start "ruleAddCondition"
    // InternalMyDsl.g:612:1: ruleAddCondition : ( ( rule__AddCondition__Group__0 ) ) ;
    public final void ruleAddCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__AddCondition__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__AddCondition__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__AddCondition__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__AddCondition__Group__0 )
            {
             before(grammarAccess.getAddConditionAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__AddCondition__Group__0 )
            // InternalMyDsl.g:619:4: rule__AddCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddCondition"


    // $ANTLR start "entryRuleElements"
    // InternalMyDsl.g:628:1: entryRuleElements : ruleElements EOF ;
    public final void entryRuleElements() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleElements EOF )
            // InternalMyDsl.g:630:1: ruleElements EOF
            {
             before(grammarAccess.getElementsRule()); 
            pushFollow(FOLLOW_1);
            ruleElements();

            state._fsp--;

             after(grammarAccess.getElementsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElements"


    // $ANTLR start "ruleElements"
    // InternalMyDsl.g:637:1: ruleElements : ( ( rule__Elements__Group__0 ) ) ;
    public final void ruleElements() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__Elements__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__Elements__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__Elements__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__Elements__Group__0 )
            {
             before(grammarAccess.getElementsAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__Elements__Group__0 )
            // InternalMyDsl.g:644:4: rule__Elements__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Elements__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElements"


    // $ANTLR start "entryRuleElement"
    // InternalMyDsl.g:653:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleElement EOF )
            // InternalMyDsl.g:655:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalMyDsl.g:662:1: ruleElement : ( ( rule__Element__Group__0 ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__Element__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__Element__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__Element__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__Element__Group__0 )
            {
             before(grammarAccess.getElementAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__Element__Group__0 )
            // InternalMyDsl.g:669:4: rule__Element__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleEltType"
    // InternalMyDsl.g:678:1: entryRuleEltType : ruleEltType EOF ;
    public final void entryRuleEltType() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleEltType EOF )
            // InternalMyDsl.g:680:1: ruleEltType EOF
            {
             before(grammarAccess.getEltTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleEltType();

            state._fsp--;

             after(grammarAccess.getEltTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEltType"


    // $ANTLR start "ruleEltType"
    // InternalMyDsl.g:687:1: ruleEltType : ( ( rule__EltType__Alternatives ) ) ;
    public final void ruleEltType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__EltType__Alternatives ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__EltType__Alternatives ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__EltType__Alternatives ) )
            // InternalMyDsl.g:693:3: ( rule__EltType__Alternatives )
            {
             before(grammarAccess.getEltTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:694:3: ( rule__EltType__Alternatives )
            // InternalMyDsl.g:694:4: rule__EltType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EltType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEltTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEltType"


    // $ANTLR start "entryRuleTag"
    // InternalMyDsl.g:703:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleTag EOF )
            // InternalMyDsl.g:705:1: ruleTag EOF
            {
             before(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalMyDsl.g:712:1: ruleTag : ( ( rule__Tag__Group__0 ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__Tag__Group__0 ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__Tag__Group__0 ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__Tag__Group__0 ) )
            // InternalMyDsl.g:718:3: ( rule__Tag__Group__0 )
            {
             before(grammarAccess.getTagAccess().getGroup()); 
            // InternalMyDsl.g:719:3: ( rule__Tag__Group__0 )
            // InternalMyDsl.g:719:4: rule__Tag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleSimpleOp"
    // InternalMyDsl.g:728:1: entryRuleSimpleOp : ruleSimpleOp EOF ;
    public final void entryRuleSimpleOp() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleSimpleOp EOF )
            // InternalMyDsl.g:730:1: ruleSimpleOp EOF
            {
             before(grammarAccess.getSimpleOpRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleOp();

            state._fsp--;

             after(grammarAccess.getSimpleOpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleOp"


    // $ANTLR start "ruleSimpleOp"
    // InternalMyDsl.g:737:1: ruleSimpleOp : ( ( rule__SimpleOp__Group__0 ) ) ;
    public final void ruleSimpleOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__SimpleOp__Group__0 ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__SimpleOp__Group__0 ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__SimpleOp__Group__0 ) )
            // InternalMyDsl.g:743:3: ( rule__SimpleOp__Group__0 )
            {
             before(grammarAccess.getSimpleOpAccess().getGroup()); 
            // InternalMyDsl.g:744:3: ( rule__SimpleOp__Group__0 )
            // InternalMyDsl.g:744:4: rule__SimpleOp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleOp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleOpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleOp"


    // $ANTLR start "entryRuleComparableElt"
    // InternalMyDsl.g:753:1: entryRuleComparableElt : ruleComparableElt EOF ;
    public final void entryRuleComparableElt() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleComparableElt EOF )
            // InternalMyDsl.g:755:1: ruleComparableElt EOF
            {
             before(grammarAccess.getComparableEltRule()); 
            pushFollow(FOLLOW_1);
            ruleComparableElt();

            state._fsp--;

             after(grammarAccess.getComparableEltRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparableElt"


    // $ANTLR start "ruleComparableElt"
    // InternalMyDsl.g:762:1: ruleComparableElt : ( ( rule__ComparableElt__Alternatives ) ) ;
    public final void ruleComparableElt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__ComparableElt__Alternatives ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__ComparableElt__Alternatives ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__ComparableElt__Alternatives ) )
            // InternalMyDsl.g:768:3: ( rule__ComparableElt__Alternatives )
            {
             before(grammarAccess.getComparableEltAccess().getAlternatives()); 
            // InternalMyDsl.g:769:3: ( rule__ComparableElt__Alternatives )
            // InternalMyDsl.g:769:4: rule__ComparableElt__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComparableElt__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparableEltAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparableElt"


    // $ANTLR start "entryRuleText"
    // InternalMyDsl.g:778:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalMyDsl.g:779:1: ( ruleText EOF )
            // InternalMyDsl.g:780:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalMyDsl.g:787:1: ruleText : ( ( rule__Text__Alternatives ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:2: ( ( ( rule__Text__Alternatives ) ) )
            // InternalMyDsl.g:792:2: ( ( rule__Text__Alternatives ) )
            {
            // InternalMyDsl.g:792:2: ( ( rule__Text__Alternatives ) )
            // InternalMyDsl.g:793:3: ( rule__Text__Alternatives )
            {
             before(grammarAccess.getTextAccess().getAlternatives()); 
            // InternalMyDsl.g:794:3: ( rule__Text__Alternatives )
            // InternalMyDsl.g:794:4: rule__Text__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Text__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:803:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMyDsl.g:804:1: ( ruleVariable EOF )
            // InternalMyDsl.g:805:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMyDsl.g:812:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalMyDsl.g:817:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalMyDsl.g:817:2: ( ( rule__Variable__Group__0 ) )
            // InternalMyDsl.g:818:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalMyDsl.g:819:3: ( rule__Variable__Group__0 )
            // InternalMyDsl.g:819:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalMyDsl.g:827:1: rule__Operation__Alternatives : ( ( ruleAction ) | ( ruleLoop ) | ( ruleApply_All ) | ( ruleIf ) | ( ruleStore ) | ( ruleCallFunction ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:831:1: ( ( ruleAction ) | ( ruleLoop ) | ( ruleApply_All ) | ( ruleIf ) | ( ruleStore ) | ( ruleCallFunction ) )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 20:
            case 21:
            case 22:
            case 26:
            case 27:
                {
                alt1=1;
                }
                break;
            case 37:
            case 38:
            case 39:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            case 29:
                {
                alt1=4;
                }
                break;
            case 31:
                {
                alt1=5;
                }
                break;
            case 34:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:832:2: ( ruleAction )
                    {
                    // InternalMyDsl.g:832:2: ( ruleAction )
                    // InternalMyDsl.g:833:3: ruleAction
                    {
                     before(grammarAccess.getOperationAccess().getActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAction();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:838:2: ( ruleLoop )
                    {
                    // InternalMyDsl.g:838:2: ( ruleLoop )
                    // InternalMyDsl.g:839:3: ruleLoop
                    {
                     before(grammarAccess.getOperationAccess().getLoopParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLoop();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getLoopParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:844:2: ( ruleApply_All )
                    {
                    // InternalMyDsl.g:844:2: ( ruleApply_All )
                    // InternalMyDsl.g:845:3: ruleApply_All
                    {
                     before(grammarAccess.getOperationAccess().getApply_AllParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleApply_All();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getApply_AllParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:850:2: ( ruleIf )
                    {
                    // InternalMyDsl.g:850:2: ( ruleIf )
                    // InternalMyDsl.g:851:3: ruleIf
                    {
                     before(grammarAccess.getOperationAccess().getIfParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleIf();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getIfParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:856:2: ( ruleStore )
                    {
                    // InternalMyDsl.g:856:2: ( ruleStore )
                    // InternalMyDsl.g:857:3: ruleStore
                    {
                     before(grammarAccess.getOperationAccess().getStoreParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleStore();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getStoreParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:862:2: ( ruleCallFunction )
                    {
                    // InternalMyDsl.g:862:2: ( ruleCallFunction )
                    // InternalMyDsl.g:863:3: ruleCallFunction
                    {
                     before(grammarAccess.getOperationAccess().getCallFunctionParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleCallFunction();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getCallFunctionParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalMyDsl.g:872:1: rule__Action__Alternatives : ( ( ruleClick ) | ( ruleGo ) | ( ruleFill ) | ( ruleSelect ) | ( ruleVerify ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:876:1: ( ( ruleClick ) | ( ruleGo ) | ( ruleFill ) | ( ruleSelect ) | ( ruleVerify ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            case 26:
                {
                alt2=4;
                }
                break;
            case 27:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:877:2: ( ruleClick )
                    {
                    // InternalMyDsl.g:877:2: ( ruleClick )
                    // InternalMyDsl.g:878:3: ruleClick
                    {
                     before(grammarAccess.getActionAccess().getClickParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleClick();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getClickParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:883:2: ( ruleGo )
                    {
                    // InternalMyDsl.g:883:2: ( ruleGo )
                    // InternalMyDsl.g:884:3: ruleGo
                    {
                     before(grammarAccess.getActionAccess().getGoParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleGo();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getGoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:889:2: ( ruleFill )
                    {
                    // InternalMyDsl.g:889:2: ( ruleFill )
                    // InternalMyDsl.g:890:3: ruleFill
                    {
                     before(grammarAccess.getActionAccess().getFillParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFill();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getFillParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:895:2: ( ruleSelect )
                    {
                    // InternalMyDsl.g:895:2: ( ruleSelect )
                    // InternalMyDsl.g:896:3: ruleSelect
                    {
                     before(grammarAccess.getActionAccess().getSelectParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSelect();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getSelectParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:901:2: ( ruleVerify )
                    {
                    // InternalMyDsl.g:901:2: ( ruleVerify )
                    // InternalMyDsl.g:902:3: ruleVerify
                    {
                     before(grammarAccess.getActionAccess().getVerifyParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleVerify();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getVerifyParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:911:1: rule__Type__Alternatives : ( ( ( rule__Type__TextAssignment_0 ) ) | ( ( rule__Type__EltsAssignment_1 ) ) | ( ( rule__Type__EltAssignment_2 ) ) | ( ( rule__Type__CondAssignment_3 ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:915:1: ( ( ( rule__Type__TextAssignment_0 ) ) | ( ( rule__Type__EltsAssignment_1 ) ) | ( ( rule__Type__EltAssignment_2 ) ) | ( ( rule__Type__CondAssignment_3 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case 32:
                {
                alt3=1;
                }
                break;
            case 41:
                {
                alt3=2;
                }
                break;
            case 42:
                {
                alt3=3;
                }
                break;
            case 40:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:916:2: ( ( rule__Type__TextAssignment_0 ) )
                    {
                    // InternalMyDsl.g:916:2: ( ( rule__Type__TextAssignment_0 ) )
                    // InternalMyDsl.g:917:3: ( rule__Type__TextAssignment_0 )
                    {
                     before(grammarAccess.getTypeAccess().getTextAssignment_0()); 
                    // InternalMyDsl.g:918:3: ( rule__Type__TextAssignment_0 )
                    // InternalMyDsl.g:918:4: rule__Type__TextAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__TextAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getTextAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:922:2: ( ( rule__Type__EltsAssignment_1 ) )
                    {
                    // InternalMyDsl.g:922:2: ( ( rule__Type__EltsAssignment_1 ) )
                    // InternalMyDsl.g:923:3: ( rule__Type__EltsAssignment_1 )
                    {
                     before(grammarAccess.getTypeAccess().getEltsAssignment_1()); 
                    // InternalMyDsl.g:924:3: ( rule__Type__EltsAssignment_1 )
                    // InternalMyDsl.g:924:4: rule__Type__EltsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__EltsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getEltsAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:928:2: ( ( rule__Type__EltAssignment_2 ) )
                    {
                    // InternalMyDsl.g:928:2: ( ( rule__Type__EltAssignment_2 ) )
                    // InternalMyDsl.g:929:3: ( rule__Type__EltAssignment_2 )
                    {
                     before(grammarAccess.getTypeAccess().getEltAssignment_2()); 
                    // InternalMyDsl.g:930:3: ( rule__Type__EltAssignment_2 )
                    // InternalMyDsl.g:930:4: rule__Type__EltAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__EltAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getEltAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:934:2: ( ( rule__Type__CondAssignment_3 ) )
                    {
                    // InternalMyDsl.g:934:2: ( ( rule__Type__CondAssignment_3 ) )
                    // InternalMyDsl.g:935:3: ( rule__Type__CondAssignment_3 )
                    {
                     before(grammarAccess.getTypeAccess().getCondAssignment_3()); 
                    // InternalMyDsl.g:936:3: ( rule__Type__CondAssignment_3 )
                    // InternalMyDsl.g:936:4: rule__Type__CondAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Type__CondAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeAccess().getCondAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__StringType__Alternatives"
    // InternalMyDsl.g:944:1: rule__StringType__Alternatives : ( ( ( rule__StringType__TextAssignment_0 ) ) | ( ( rule__StringType__EltsAssignment_1 ) ) | ( ( rule__StringType__EltAssignment_2 ) ) | ( ( rule__StringType__CondAssignment_3 ) ) );
    public final void rule__StringType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:948:1: ( ( ( rule__StringType__TextAssignment_0 ) ) | ( ( rule__StringType__EltsAssignment_1 ) ) | ( ( rule__StringType__EltAssignment_2 ) ) | ( ( rule__StringType__CondAssignment_3 ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt4=1;
                }
                break;
            case 41:
                {
                alt4=2;
                }
                break;
            case 42:
                {
                alt4=3;
                }
                break;
            case 40:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:949:2: ( ( rule__StringType__TextAssignment_0 ) )
                    {
                    // InternalMyDsl.g:949:2: ( ( rule__StringType__TextAssignment_0 ) )
                    // InternalMyDsl.g:950:3: ( rule__StringType__TextAssignment_0 )
                    {
                     before(grammarAccess.getStringTypeAccess().getTextAssignment_0()); 
                    // InternalMyDsl.g:951:3: ( rule__StringType__TextAssignment_0 )
                    // InternalMyDsl.g:951:4: rule__StringType__TextAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringType__TextAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringTypeAccess().getTextAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:955:2: ( ( rule__StringType__EltsAssignment_1 ) )
                    {
                    // InternalMyDsl.g:955:2: ( ( rule__StringType__EltsAssignment_1 ) )
                    // InternalMyDsl.g:956:3: ( rule__StringType__EltsAssignment_1 )
                    {
                     before(grammarAccess.getStringTypeAccess().getEltsAssignment_1()); 
                    // InternalMyDsl.g:957:3: ( rule__StringType__EltsAssignment_1 )
                    // InternalMyDsl.g:957:4: rule__StringType__EltsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringType__EltsAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringTypeAccess().getEltsAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:961:2: ( ( rule__StringType__EltAssignment_2 ) )
                    {
                    // InternalMyDsl.g:961:2: ( ( rule__StringType__EltAssignment_2 ) )
                    // InternalMyDsl.g:962:3: ( rule__StringType__EltAssignment_2 )
                    {
                     before(grammarAccess.getStringTypeAccess().getEltAssignment_2()); 
                    // InternalMyDsl.g:963:3: ( rule__StringType__EltAssignment_2 )
                    // InternalMyDsl.g:963:4: rule__StringType__EltAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringType__EltAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringTypeAccess().getEltAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:967:2: ( ( rule__StringType__CondAssignment_3 ) )
                    {
                    // InternalMyDsl.g:967:2: ( ( rule__StringType__CondAssignment_3 ) )
                    // InternalMyDsl.g:968:3: ( rule__StringType__CondAssignment_3 )
                    {
                     before(grammarAccess.getStringTypeAccess().getCondAssignment_3()); 
                    // InternalMyDsl.g:969:3: ( rule__StringType__CondAssignment_3 )
                    // InternalMyDsl.g:969:4: rule__StringType__CondAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringType__CondAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getStringTypeAccess().getCondAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Alternatives"


    // $ANTLR start "rule__Loop__Alternatives"
    // InternalMyDsl.g:977:1: rule__Loop__Alternatives : ( ( ruleForLoop ) | ( ruleWhileLoop ) | ( ruleDoLoop ) );
    public final void rule__Loop__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:981:1: ( ( ruleForLoop ) | ( ruleWhileLoop ) | ( ruleDoLoop ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt5=1;
                }
                break;
            case 38:
                {
                alt5=2;
                }
                break;
            case 39:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:982:2: ( ruleForLoop )
                    {
                    // InternalMyDsl.g:982:2: ( ruleForLoop )
                    // InternalMyDsl.g:983:3: ruleForLoop
                    {
                     before(grammarAccess.getLoopAccess().getForLoopParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleForLoop();

                    state._fsp--;

                     after(grammarAccess.getLoopAccess().getForLoopParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:988:2: ( ruleWhileLoop )
                    {
                    // InternalMyDsl.g:988:2: ( ruleWhileLoop )
                    // InternalMyDsl.g:989:3: ruleWhileLoop
                    {
                     before(grammarAccess.getLoopAccess().getWhileLoopParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWhileLoop();

                    state._fsp--;

                     after(grammarAccess.getLoopAccess().getWhileLoopParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:994:2: ( ruleDoLoop )
                    {
                    // InternalMyDsl.g:994:2: ( ruleDoLoop )
                    // InternalMyDsl.g:995:3: ruleDoLoop
                    {
                     before(grammarAccess.getLoopAccess().getDoLoopParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDoLoop();

                    state._fsp--;

                     after(grammarAccess.getLoopAccess().getDoLoopParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Loop__Alternatives"


    // $ANTLR start "rule__Condition__Alternatives_1"
    // InternalMyDsl.g:1004:1: rule__Condition__Alternatives_1 : ( ( ruleSimpleOp ) | ( ruleVerify ) | ( ruleVariable ) );
    public final void rule__Condition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1008:1: ( ( ruleSimpleOp ) | ( ruleVerify ) | ( ruleVariable ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 27:
                {
                alt6=2;
                }
                break;
            case 32:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1009:2: ( ruleSimpleOp )
                    {
                    // InternalMyDsl.g:1009:2: ( ruleSimpleOp )
                    // InternalMyDsl.g:1010:3: ruleSimpleOp
                    {
                     before(grammarAccess.getConditionAccess().getSimpleOpParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleOp();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getSimpleOpParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1015:2: ( ruleVerify )
                    {
                    // InternalMyDsl.g:1015:2: ( ruleVerify )
                    // InternalMyDsl.g:1016:3: ruleVerify
                    {
                     before(grammarAccess.getConditionAccess().getVerifyParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVerify();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getVerifyParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1021:2: ( ruleVariable )
                    {
                    // InternalMyDsl.g:1021:2: ( ruleVariable )
                    // InternalMyDsl.g:1022:3: ruleVariable
                    {
                     before(grammarAccess.getConditionAccess().getVariableParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getVariableParserRuleCall_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Alternatives_1"


    // $ANTLR start "rule__AddCondition__OpAlternatives_0_0"
    // InternalMyDsl.g:1031:1: rule__AddCondition__OpAlternatives_0_0 : ( ( 'And' ) | ( 'Or' ) );
    public final void rule__AddCondition__OpAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1035:1: ( ( 'And' ) | ( 'Or' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1036:2: ( 'And' )
                    {
                    // InternalMyDsl.g:1036:2: ( 'And' )
                    // InternalMyDsl.g:1037:3: 'And'
                    {
                     before(grammarAccess.getAddConditionAccess().getOpAndKeyword_0_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getAddConditionAccess().getOpAndKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1042:2: ( 'Or' )
                    {
                    // InternalMyDsl.g:1042:2: ( 'Or' )
                    // InternalMyDsl.g:1043:3: 'Or'
                    {
                     before(grammarAccess.getAddConditionAccess().getOpOrKeyword_0_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getAddConditionAccess().getOpOrKeyword_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddCondition__OpAlternatives_0_0"


    // $ANTLR start "rule__EltType__Alternatives"
    // InternalMyDsl.g:1052:1: rule__EltType__Alternatives : ( ( ruleTag ) | ( 'URL' ) | ( ruleVariable ) );
    public final void rule__EltType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1056:1: ( ( ruleTag ) | ( 'URL' ) | ( ruleVariable ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 32:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1057:2: ( ruleTag )
                    {
                    // InternalMyDsl.g:1057:2: ( ruleTag )
                    // InternalMyDsl.g:1058:3: ruleTag
                    {
                     before(grammarAccess.getEltTypeAccess().getTagParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTag();

                    state._fsp--;

                     after(grammarAccess.getEltTypeAccess().getTagParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1063:2: ( 'URL' )
                    {
                    // InternalMyDsl.g:1063:2: ( 'URL' )
                    // InternalMyDsl.g:1064:3: 'URL'
                    {
                     before(grammarAccess.getEltTypeAccess().getURLKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEltTypeAccess().getURLKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1069:2: ( ruleVariable )
                    {
                    // InternalMyDsl.g:1069:2: ( ruleVariable )
                    // InternalMyDsl.g:1070:3: ruleVariable
                    {
                     before(grammarAccess.getEltTypeAccess().getVariableParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getEltTypeAccess().getVariableParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EltType__Alternatives"


    // $ANTLR start "rule__ComparableElt__Alternatives"
    // InternalMyDsl.g:1079:1: rule__ComparableElt__Alternatives : ( ( ( rule__ComparableElt__InteAssignment_0 ) ) | ( ( rule__ComparableElt__TextAssignment_1 ) ) );
    public final void rule__ComparableElt__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1083:1: ( ( ( rule__ComparableElt__InteAssignment_0 ) ) | ( ( rule__ComparableElt__TextAssignment_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_STRING||LA9_0==32) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1084:2: ( ( rule__ComparableElt__InteAssignment_0 ) )
                    {
                    // InternalMyDsl.g:1084:2: ( ( rule__ComparableElt__InteAssignment_0 ) )
                    // InternalMyDsl.g:1085:3: ( rule__ComparableElt__InteAssignment_0 )
                    {
                     before(grammarAccess.getComparableEltAccess().getInteAssignment_0()); 
                    // InternalMyDsl.g:1086:3: ( rule__ComparableElt__InteAssignment_0 )
                    // InternalMyDsl.g:1086:4: rule__ComparableElt__InteAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparableElt__InteAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparableEltAccess().getInteAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1090:2: ( ( rule__ComparableElt__TextAssignment_1 ) )
                    {
                    // InternalMyDsl.g:1090:2: ( ( rule__ComparableElt__TextAssignment_1 ) )
                    // InternalMyDsl.g:1091:3: ( rule__ComparableElt__TextAssignment_1 )
                    {
                     before(grammarAccess.getComparableEltAccess().getTextAssignment_1()); 
                    // InternalMyDsl.g:1092:3: ( rule__ComparableElt__TextAssignment_1 )
                    // InternalMyDsl.g:1092:4: rule__ComparableElt__TextAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparableElt__TextAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparableEltAccess().getTextAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparableElt__Alternatives"


    // $ANTLR start "rule__Text__Alternatives"
    // InternalMyDsl.g:1100:1: rule__Text__Alternatives : ( ( ( rule__Text__VariAssignment_0 ) ) | ( ( rule__Text__NameAssignment_1 ) ) );
    public final void rule__Text__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1104:1: ( ( ( rule__Text__VariAssignment_0 ) ) | ( ( rule__Text__NameAssignment_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1105:2: ( ( rule__Text__VariAssignment_0 ) )
                    {
                    // InternalMyDsl.g:1105:2: ( ( rule__Text__VariAssignment_0 ) )
                    // InternalMyDsl.g:1106:3: ( rule__Text__VariAssignment_0 )
                    {
                     before(grammarAccess.getTextAccess().getVariAssignment_0()); 
                    // InternalMyDsl.g:1107:3: ( rule__Text__VariAssignment_0 )
                    // InternalMyDsl.g:1107:4: rule__Text__VariAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__VariAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextAccess().getVariAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1111:2: ( ( rule__Text__NameAssignment_1 ) )
                    {
                    // InternalMyDsl.g:1111:2: ( ( rule__Text__NameAssignment_1 ) )
                    // InternalMyDsl.g:1112:3: ( rule__Text__NameAssignment_1 )
                    {
                     before(grammarAccess.getTextAccess().getNameAssignment_1()); 
                    // InternalMyDsl.g:1113:3: ( rule__Text__NameAssignment_1 )
                    // InternalMyDsl.g:1113:4: rule__Text__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__NameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTextAccess().getNameAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Alternatives"


    // $ANTLR start "rule__Program__Group__0"
    // InternalMyDsl.g:1121:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1125:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalMyDsl.g:1126:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalMyDsl.g:1133:1: rule__Program__Group__0__Impl : ( ( rule__Program__FuncAssignment_0 )* ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1137:1: ( ( ( rule__Program__FuncAssignment_0 )* ) )
            // InternalMyDsl.g:1138:1: ( ( rule__Program__FuncAssignment_0 )* )
            {
            // InternalMyDsl.g:1138:1: ( ( rule__Program__FuncAssignment_0 )* )
            // InternalMyDsl.g:1139:2: ( rule__Program__FuncAssignment_0 )*
            {
             before(grammarAccess.getProgramAccess().getFuncAssignment_0()); 
            // InternalMyDsl.g:1140:2: ( rule__Program__FuncAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1140:3: rule__Program__FuncAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__FuncAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getFuncAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalMyDsl.g:1148:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1152:1: ( rule__Program__Group__1__Impl )
            // InternalMyDsl.g:1153:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalMyDsl.g:1159:1: rule__Program__Group__1__Impl : ( ( rule__Program__BAssignment_1 ) ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1163:1: ( ( ( rule__Program__BAssignment_1 ) ) )
            // InternalMyDsl.g:1164:1: ( ( rule__Program__BAssignment_1 ) )
            {
            // InternalMyDsl.g:1164:1: ( ( rule__Program__BAssignment_1 ) )
            // InternalMyDsl.g:1165:2: ( rule__Program__BAssignment_1 )
            {
             before(grammarAccess.getProgramAccess().getBAssignment_1()); 
            // InternalMyDsl.g:1166:2: ( rule__Program__BAssignment_1 )
            // InternalMyDsl.g:1166:3: rule__Program__BAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Program__BAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getBAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Browser_Task__Group__0"
    // InternalMyDsl.g:1175:1: rule__Browser_Task__Group__0 : rule__Browser_Task__Group__0__Impl rule__Browser_Task__Group__1 ;
    public final void rule__Browser_Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1179:1: ( rule__Browser_Task__Group__0__Impl rule__Browser_Task__Group__1 )
            // InternalMyDsl.g:1180:2: rule__Browser_Task__Group__0__Impl rule__Browser_Task__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Browser_Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Browser_Task__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Browser_Task__Group__0"


    // $ANTLR start "rule__Browser_Task__Group__0__Impl"
    // InternalMyDsl.g:1187:1: rule__Browser_Task__Group__0__Impl : ( 'Selenium' ) ;
    public final void rule__Browser_Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1191:1: ( ( 'Selenium' ) )
            // InternalMyDsl.g:1192:1: ( 'Selenium' )
            {
            // InternalMyDsl.g:1192:1: ( 'Selenium' )
            // InternalMyDsl.g:1193:2: 'Selenium'
            {
             before(grammarAccess.getBrowser_TaskAccess().getSeleniumKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBrowser_TaskAccess().getSeleniumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Browser_Task__Group__0__Impl"


    // $ANTLR start "rule__Browser_Task__Group__1"
    // InternalMyDsl.g:1202:1: rule__Browser_Task__Group__1 : rule__Browser_Task__Group__1__Impl rule__Browser_Task__Group__2 ;
    public final void rule__Browser_Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1206:1: ( rule__Browser_Task__Group__1__Impl rule__Browser_Task__Group__2 )
            // InternalMyDsl.g:1207:2: rule__Browser_Task__Group__1__Impl rule__Browser_Task__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Browser_Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Browser_Task__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Browser_Task__Group__1"


    // $ANTLR start "rule__Browser_Task__Group__1__Impl"
    // InternalMyDsl.g:1214:1: rule__Browser_Task__Group__1__Impl : ( '{' ) ;
    public final void rule__Browser_Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1218:1: ( ( '{' ) )
            // InternalMyDsl.g:1219:1: ( '{' )
            {
            // InternalMyDsl.g:1219:1: ( '{' )
            // InternalMyDsl.g:1220:2: '{'
            {
             before(grammarAccess.getBrowser_TaskAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBrowser_TaskAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Browser_Task__Group__1__Impl"


    // $ANTLR start "rule__Browser_Task__Group__2"
    // InternalMyDsl.g:1229:1: rule__Browser_Task__Group__2 : rule__Browser_Task__Group__2__Impl rule__Browser_Task__Group__3 ;
    public final void rule__Browser_Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1233:1: ( rule__Browser_Task__Group__2__Impl rule__Browser_Task__Group__3 )
            // InternalMyDsl.g:1234:2: rule__Browser_Task__Group__2__Impl rule__Browser_Task__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Browser_Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Browser_Task__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Browser_Task__Group__2"


    // $ANTLR start "rule__Browser_Task__Group__2__Impl"
    // InternalMyDsl.g:1241:1: rule__Browser_Task__Group__2__Impl : ( 'Browser' ) ;
    public final void rule__Browser_Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1245:1: ( ( 'Browser' ) )
            // InternalMyDsl.g:1246:1: ( 'Browser' )
            {
            // InternalMyDsl.g:1246:1: ( 'Browser' )
            // InternalMyDsl.g:1247:2: 'Browser'
            {
             before(grammarAccess.getBrowser_TaskAccess().getBrowserKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBrowser_TaskAccess().getBrowserKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Browser_Task__Group__2__Impl"


    // $ANTLR start "rule__Browser_Task__Group__3"
    // InternalMyDsl.g:1256:1: rule__Browser_Task__Group__3 : rule__Browser_Task__Group__3__Impl rule__Browser_Task__Group__4 ;
    public final void rule__Browser_Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1260:1: ( rule__Browser_Task__Group__3__Impl rule__Browser_Task__Group__4 )
            // InternalMyDsl.g:1261:2: rule__Browser_Task__Group__3__Impl rule__Browser_Task__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Browser_Task__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Browser_Task__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Browser_Task__Group__3"


    // $ANTLR start "rule__Browser_Task__Group__3__Impl"
    // InternalMyDsl.g:1268:1: rule__Browser_Task__Group__3__Impl : ( ( rule__Browser_Task__NameAssignment_3 ) ) ;
    public final void rule__Browser_Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1272:1: ( ( ( rule__Browser_Task__NameAssignment_3 ) ) )
            // InternalMyDsl.g:1273:1: ( ( rule__Browser_Task__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:1273:1: ( ( rule__Browser_Task__NameAssignment_3 ) )
            // InternalMyDsl.g:1274:2: ( rule__Browser_Task__NameAssignment_3 )
            {
             before(grammarAccess.getBrowser_TaskAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:1275:2: ( rule__Browser_Task__NameAssignment_3 )
            // InternalMyDsl.g:1275:3: rule__Browser_Task__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Browser_Task__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBrowser_TaskAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Browser_Task__Group__3__Impl"


    // $ANTLR start "rule__Browser_Task__Group__4"
    // InternalMyDsl.g:1283:1: rule__Browser_Task__Group__4 : rule__Browser_Task__Group__4__Impl rule__Browser_Task__Group__5 ;
    public final void rule__Browser_Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1287:1: ( rule__Browser_Task__Group__4__Impl rule__Browser_Task__Group__5 )
            // InternalMyDsl.g:1288:2: rule__Browser_Task__Group__4__Impl rule__Browser_Task__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Browser_Task__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Browser_Task__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Browser_Task__Group__4"


    // $ANTLR start "rule__Browser_Task__Group__4__Impl"
    // InternalMyDsl.g:1295:1: rule__Browser_Task__Group__4__Impl : ( ( rule__Browser_Task__OperationsAssignment_4 )* ) ;
    public final void rule__Browser_Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1299:1: ( ( ( rule__Browser_Task__OperationsAssignment_4 )* ) )
            // InternalMyDsl.g:1300:1: ( ( rule__Browser_Task__OperationsAssignment_4 )* )
            {
            // InternalMyDsl.g:1300:1: ( ( rule__Browser_Task__OperationsAssignment_4 )* )
            // InternalMyDsl.g:1301:2: ( rule__Browser_Task__OperationsAssignment_4 )*
            {
             before(grammarAccess.getBrowser_TaskAccess().getOperationsAssignment_4()); 
            // InternalMyDsl.g:1302:2: ( rule__Browser_Task__OperationsAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=20 && LA12_0<=22)||(LA12_0>=26 && LA12_0<=29)||LA12_0==31||LA12_0==34||(LA12_0>=37 && LA12_0<=39)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1302:3: rule__Browser_Task__OperationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Browser_Task__OperationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getBrowser_TaskAccess().getOperationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Browser_Task__Group__4__Impl"


    // $ANTLR start "rule__Browser_Task__Group__5"
    // InternalMyDsl.g:1310:1: rule__Browser_Task__Group__5 : rule__Browser_Task__Group__5__Impl ;
    public final void rule__Browser_Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1314:1: ( rule__Browser_Task__Group__5__Impl )
            // InternalMyDsl.g:1315:2: rule__Browser_Task__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Browser_Task__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Browser_Task__Group__5"


    // $ANTLR start "rule__Browser_Task__Group__5__Impl"
    // InternalMyDsl.g:1321:1: rule__Browser_Task__Group__5__Impl : ( '}' ) ;
    public final void rule__Browser_Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1325:1: ( ( '}' ) )
            // InternalMyDsl.g:1326:1: ( '}' )
            {
            // InternalMyDsl.g:1326:1: ( '}' )
            // InternalMyDsl.g:1327:2: '}'
            {
             before(grammarAccess.getBrowser_TaskAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBrowser_TaskAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Browser_Task__Group__5__Impl"


    // $ANTLR start "rule__Click__Group__0"
    // InternalMyDsl.g:1337:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1341:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalMyDsl.g:1342:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Click__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__0"


    // $ANTLR start "rule__Click__Group__0__Impl"
    // InternalMyDsl.g:1349:1: rule__Click__Group__0__Impl : ( 'Click' ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1353:1: ( ( 'Click' ) )
            // InternalMyDsl.g:1354:1: ( 'Click' )
            {
            // InternalMyDsl.g:1354:1: ( 'Click' )
            // InternalMyDsl.g:1355:2: 'Click'
            {
             before(grammarAccess.getClickAccess().getClickKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getClickKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__0__Impl"


    // $ANTLR start "rule__Click__Group__1"
    // InternalMyDsl.g:1364:1: rule__Click__Group__1 : rule__Click__Group__1__Impl ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1368:1: ( rule__Click__Group__1__Impl )
            // InternalMyDsl.g:1369:2: rule__Click__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__1"


    // $ANTLR start "rule__Click__Group__1__Impl"
    // InternalMyDsl.g:1375:1: rule__Click__Group__1__Impl : ( ( rule__Click__EltAssignment_1 ) ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1379:1: ( ( ( rule__Click__EltAssignment_1 ) ) )
            // InternalMyDsl.g:1380:1: ( ( rule__Click__EltAssignment_1 ) )
            {
            // InternalMyDsl.g:1380:1: ( ( rule__Click__EltAssignment_1 ) )
            // InternalMyDsl.g:1381:2: ( rule__Click__EltAssignment_1 )
            {
             before(grammarAccess.getClickAccess().getEltAssignment_1()); 
            // InternalMyDsl.g:1382:2: ( rule__Click__EltAssignment_1 )
            // InternalMyDsl.g:1382:3: rule__Click__EltAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Click__EltAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getEltAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__1__Impl"


    // $ANTLR start "rule__Go__Group__0"
    // InternalMyDsl.g:1391:1: rule__Go__Group__0 : rule__Go__Group__0__Impl rule__Go__Group__1 ;
    public final void rule__Go__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1395:1: ( rule__Go__Group__0__Impl rule__Go__Group__1 )
            // InternalMyDsl.g:1396:2: rule__Go__Group__0__Impl rule__Go__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Go__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Go__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__0"


    // $ANTLR start "rule__Go__Group__0__Impl"
    // InternalMyDsl.g:1403:1: rule__Go__Group__0__Impl : ( 'Go' ) ;
    public final void rule__Go__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1407:1: ( ( 'Go' ) )
            // InternalMyDsl.g:1408:1: ( 'Go' )
            {
            // InternalMyDsl.g:1408:1: ( 'Go' )
            // InternalMyDsl.g:1409:2: 'Go'
            {
             before(grammarAccess.getGoAccess().getGoKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGoAccess().getGoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__0__Impl"


    // $ANTLR start "rule__Go__Group__1"
    // InternalMyDsl.g:1418:1: rule__Go__Group__1 : rule__Go__Group__1__Impl ;
    public final void rule__Go__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1422:1: ( rule__Go__Group__1__Impl )
            // InternalMyDsl.g:1423:2: rule__Go__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Go__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__1"


    // $ANTLR start "rule__Go__Group__1__Impl"
    // InternalMyDsl.g:1429:1: rule__Go__Group__1__Impl : ( ( rule__Go__LinkAssignment_1 ) ) ;
    public final void rule__Go__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1433:1: ( ( ( rule__Go__LinkAssignment_1 ) ) )
            // InternalMyDsl.g:1434:1: ( ( rule__Go__LinkAssignment_1 ) )
            {
            // InternalMyDsl.g:1434:1: ( ( rule__Go__LinkAssignment_1 ) )
            // InternalMyDsl.g:1435:2: ( rule__Go__LinkAssignment_1 )
            {
             before(grammarAccess.getGoAccess().getLinkAssignment_1()); 
            // InternalMyDsl.g:1436:2: ( rule__Go__LinkAssignment_1 )
            // InternalMyDsl.g:1436:3: rule__Go__LinkAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Go__LinkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGoAccess().getLinkAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__Group__1__Impl"


    // $ANTLR start "rule__Fill__Group__0"
    // InternalMyDsl.g:1445:1: rule__Fill__Group__0 : rule__Fill__Group__0__Impl rule__Fill__Group__1 ;
    public final void rule__Fill__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1449:1: ( rule__Fill__Group__0__Impl rule__Fill__Group__1 )
            // InternalMyDsl.g:1450:2: rule__Fill__Group__0__Impl rule__Fill__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Fill__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__0"


    // $ANTLR start "rule__Fill__Group__0__Impl"
    // InternalMyDsl.g:1457:1: rule__Fill__Group__0__Impl : ( 'Fill' ) ;
    public final void rule__Fill__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1461:1: ( ( 'Fill' ) )
            // InternalMyDsl.g:1462:1: ( 'Fill' )
            {
            // InternalMyDsl.g:1462:1: ( 'Fill' )
            // InternalMyDsl.g:1463:2: 'Fill'
            {
             before(grammarAccess.getFillAccess().getFillKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getFillKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__0__Impl"


    // $ANTLR start "rule__Fill__Group__1"
    // InternalMyDsl.g:1472:1: rule__Fill__Group__1 : rule__Fill__Group__1__Impl rule__Fill__Group__2 ;
    public final void rule__Fill__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1476:1: ( rule__Fill__Group__1__Impl rule__Fill__Group__2 )
            // InternalMyDsl.g:1477:2: rule__Fill__Group__1__Impl rule__Fill__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Fill__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__1"


    // $ANTLR start "rule__Fill__Group__1__Impl"
    // InternalMyDsl.g:1484:1: rule__Fill__Group__1__Impl : ( '(' ) ;
    public final void rule__Fill__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1488:1: ( ( '(' ) )
            // InternalMyDsl.g:1489:1: ( '(' )
            {
            // InternalMyDsl.g:1489:1: ( '(' )
            // InternalMyDsl.g:1490:2: '('
            {
             before(grammarAccess.getFillAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__1__Impl"


    // $ANTLR start "rule__Fill__Group__2"
    // InternalMyDsl.g:1499:1: rule__Fill__Group__2 : rule__Fill__Group__2__Impl rule__Fill__Group__3 ;
    public final void rule__Fill__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1503:1: ( rule__Fill__Group__2__Impl rule__Fill__Group__3 )
            // InternalMyDsl.g:1504:2: rule__Fill__Group__2__Impl rule__Fill__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Fill__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__2"


    // $ANTLR start "rule__Fill__Group__2__Impl"
    // InternalMyDsl.g:1511:1: rule__Fill__Group__2__Impl : ( ( rule__Fill__EltAssignment_2 ) ) ;
    public final void rule__Fill__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1515:1: ( ( ( rule__Fill__EltAssignment_2 ) ) )
            // InternalMyDsl.g:1516:1: ( ( rule__Fill__EltAssignment_2 ) )
            {
            // InternalMyDsl.g:1516:1: ( ( rule__Fill__EltAssignment_2 ) )
            // InternalMyDsl.g:1517:2: ( rule__Fill__EltAssignment_2 )
            {
             before(grammarAccess.getFillAccess().getEltAssignment_2()); 
            // InternalMyDsl.g:1518:2: ( rule__Fill__EltAssignment_2 )
            // InternalMyDsl.g:1518:3: rule__Fill__EltAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Fill__EltAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getEltAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__2__Impl"


    // $ANTLR start "rule__Fill__Group__3"
    // InternalMyDsl.g:1526:1: rule__Fill__Group__3 : rule__Fill__Group__3__Impl rule__Fill__Group__4 ;
    public final void rule__Fill__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1530:1: ( rule__Fill__Group__3__Impl rule__Fill__Group__4 )
            // InternalMyDsl.g:1531:2: rule__Fill__Group__3__Impl rule__Fill__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Fill__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__3"


    // $ANTLR start "rule__Fill__Group__3__Impl"
    // InternalMyDsl.g:1538:1: rule__Fill__Group__3__Impl : ( ',' ) ;
    public final void rule__Fill__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1542:1: ( ( ',' ) )
            // InternalMyDsl.g:1543:1: ( ',' )
            {
            // InternalMyDsl.g:1543:1: ( ',' )
            // InternalMyDsl.g:1544:2: ','
            {
             before(grammarAccess.getFillAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__3__Impl"


    // $ANTLR start "rule__Fill__Group__4"
    // InternalMyDsl.g:1553:1: rule__Fill__Group__4 : rule__Fill__Group__4__Impl rule__Fill__Group__5 ;
    public final void rule__Fill__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1557:1: ( rule__Fill__Group__4__Impl rule__Fill__Group__5 )
            // InternalMyDsl.g:1558:2: rule__Fill__Group__4__Impl rule__Fill__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Fill__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fill__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__4"


    // $ANTLR start "rule__Fill__Group__4__Impl"
    // InternalMyDsl.g:1565:1: rule__Fill__Group__4__Impl : ( ( rule__Fill__FillwithAssignment_4 ) ) ;
    public final void rule__Fill__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1569:1: ( ( ( rule__Fill__FillwithAssignment_4 ) ) )
            // InternalMyDsl.g:1570:1: ( ( rule__Fill__FillwithAssignment_4 ) )
            {
            // InternalMyDsl.g:1570:1: ( ( rule__Fill__FillwithAssignment_4 ) )
            // InternalMyDsl.g:1571:2: ( rule__Fill__FillwithAssignment_4 )
            {
             before(grammarAccess.getFillAccess().getFillwithAssignment_4()); 
            // InternalMyDsl.g:1572:2: ( rule__Fill__FillwithAssignment_4 )
            // InternalMyDsl.g:1572:3: rule__Fill__FillwithAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Fill__FillwithAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFillAccess().getFillwithAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__4__Impl"


    // $ANTLR start "rule__Fill__Group__5"
    // InternalMyDsl.g:1580:1: rule__Fill__Group__5 : rule__Fill__Group__5__Impl ;
    public final void rule__Fill__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1584:1: ( rule__Fill__Group__5__Impl )
            // InternalMyDsl.g:1585:2: rule__Fill__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fill__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__5"


    // $ANTLR start "rule__Fill__Group__5__Impl"
    // InternalMyDsl.g:1591:1: rule__Fill__Group__5__Impl : ( ')' ) ;
    public final void rule__Fill__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1595:1: ( ( ')' ) )
            // InternalMyDsl.g:1596:1: ( ')' )
            {
            // InternalMyDsl.g:1596:1: ( ')' )
            // InternalMyDsl.g:1597:2: ')'
            {
             before(grammarAccess.getFillAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFillAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__Group__5__Impl"


    // $ANTLR start "rule__Select__Group__0"
    // InternalMyDsl.g:1607:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1611:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalMyDsl.g:1612:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Select__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0"


    // $ANTLR start "rule__Select__Group__0__Impl"
    // InternalMyDsl.g:1619:1: rule__Select__Group__0__Impl : ( 'Select' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1623:1: ( ( 'Select' ) )
            // InternalMyDsl.g:1624:1: ( 'Select' )
            {
            // InternalMyDsl.g:1624:1: ( 'Select' )
            // InternalMyDsl.g:1625:2: 'Select'
            {
             before(grammarAccess.getSelectAccess().getSelectKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0__Impl"


    // $ANTLR start "rule__Select__Group__1"
    // InternalMyDsl.g:1634:1: rule__Select__Group__1 : rule__Select__Group__1__Impl ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1638:1: ( rule__Select__Group__1__Impl )
            // InternalMyDsl.g:1639:2: rule__Select__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1"


    // $ANTLR start "rule__Select__Group__1__Impl"
    // InternalMyDsl.g:1645:1: rule__Select__Group__1__Impl : ( ( rule__Select__EltAssignment_1 ) ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1649:1: ( ( ( rule__Select__EltAssignment_1 ) ) )
            // InternalMyDsl.g:1650:1: ( ( rule__Select__EltAssignment_1 ) )
            {
            // InternalMyDsl.g:1650:1: ( ( rule__Select__EltAssignment_1 ) )
            // InternalMyDsl.g:1651:2: ( rule__Select__EltAssignment_1 )
            {
             before(grammarAccess.getSelectAccess().getEltAssignment_1()); 
            // InternalMyDsl.g:1652:2: ( rule__Select__EltAssignment_1 )
            // InternalMyDsl.g:1652:3: rule__Select__EltAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__EltAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getEltAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1__Impl"


    // $ANTLR start "rule__Verify__Group__0"
    // InternalMyDsl.g:1661:1: rule__Verify__Group__0 : rule__Verify__Group__0__Impl rule__Verify__Group__1 ;
    public final void rule__Verify__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1665:1: ( rule__Verify__Group__0__Impl rule__Verify__Group__1 )
            // InternalMyDsl.g:1666:2: rule__Verify__Group__0__Impl rule__Verify__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Verify__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__0"


    // $ANTLR start "rule__Verify__Group__0__Impl"
    // InternalMyDsl.g:1673:1: rule__Verify__Group__0__Impl : ( 'Verify' ) ;
    public final void rule__Verify__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1677:1: ( ( 'Verify' ) )
            // InternalMyDsl.g:1678:1: ( 'Verify' )
            {
            // InternalMyDsl.g:1678:1: ( 'Verify' )
            // InternalMyDsl.g:1679:2: 'Verify'
            {
             before(grammarAccess.getVerifyAccess().getVerifyKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getVerifyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__0__Impl"


    // $ANTLR start "rule__Verify__Group__1"
    // InternalMyDsl.g:1688:1: rule__Verify__Group__1 : rule__Verify__Group__1__Impl rule__Verify__Group__2 ;
    public final void rule__Verify__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1692:1: ( rule__Verify__Group__1__Impl rule__Verify__Group__2 )
            // InternalMyDsl.g:1693:2: rule__Verify__Group__1__Impl rule__Verify__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Verify__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__1"


    // $ANTLR start "rule__Verify__Group__1__Impl"
    // InternalMyDsl.g:1700:1: rule__Verify__Group__1__Impl : ( '(' ) ;
    public final void rule__Verify__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1704:1: ( ( '(' ) )
            // InternalMyDsl.g:1705:1: ( '(' )
            {
            // InternalMyDsl.g:1705:1: ( '(' )
            // InternalMyDsl.g:1706:2: '('
            {
             before(grammarAccess.getVerifyAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__1__Impl"


    // $ANTLR start "rule__Verify__Group__2"
    // InternalMyDsl.g:1715:1: rule__Verify__Group__2 : rule__Verify__Group__2__Impl rule__Verify__Group__3 ;
    public final void rule__Verify__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1719:1: ( rule__Verify__Group__2__Impl rule__Verify__Group__3 )
            // InternalMyDsl.g:1720:2: rule__Verify__Group__2__Impl rule__Verify__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Verify__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__2"


    // $ANTLR start "rule__Verify__Group__2__Impl"
    // InternalMyDsl.g:1727:1: rule__Verify__Group__2__Impl : ( ( rule__Verify__EltAssignment_2 ) ) ;
    public final void rule__Verify__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1731:1: ( ( ( rule__Verify__EltAssignment_2 ) ) )
            // InternalMyDsl.g:1732:1: ( ( rule__Verify__EltAssignment_2 ) )
            {
            // InternalMyDsl.g:1732:1: ( ( rule__Verify__EltAssignment_2 ) )
            // InternalMyDsl.g:1733:2: ( rule__Verify__EltAssignment_2 )
            {
             before(grammarAccess.getVerifyAccess().getEltAssignment_2()); 
            // InternalMyDsl.g:1734:2: ( rule__Verify__EltAssignment_2 )
            // InternalMyDsl.g:1734:3: rule__Verify__EltAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Verify__EltAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getEltAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__2__Impl"


    // $ANTLR start "rule__Verify__Group__3"
    // InternalMyDsl.g:1742:1: rule__Verify__Group__3 : rule__Verify__Group__3__Impl rule__Verify__Group__4 ;
    public final void rule__Verify__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1746:1: ( rule__Verify__Group__3__Impl rule__Verify__Group__4 )
            // InternalMyDsl.g:1747:2: rule__Verify__Group__3__Impl rule__Verify__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Verify__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__3"


    // $ANTLR start "rule__Verify__Group__3__Impl"
    // InternalMyDsl.g:1754:1: rule__Verify__Group__3__Impl : ( ',' ) ;
    public final void rule__Verify__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1758:1: ( ( ',' ) )
            // InternalMyDsl.g:1759:1: ( ',' )
            {
            // InternalMyDsl.g:1759:1: ( ',' )
            // InternalMyDsl.g:1760:2: ','
            {
             before(grammarAccess.getVerifyAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__3__Impl"


    // $ANTLR start "rule__Verify__Group__4"
    // InternalMyDsl.g:1769:1: rule__Verify__Group__4 : rule__Verify__Group__4__Impl rule__Verify__Group__5 ;
    public final void rule__Verify__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1773:1: ( rule__Verify__Group__4__Impl rule__Verify__Group__5 )
            // InternalMyDsl.g:1774:2: rule__Verify__Group__4__Impl rule__Verify__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Verify__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Verify__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__4"


    // $ANTLR start "rule__Verify__Group__4__Impl"
    // InternalMyDsl.g:1781:1: rule__Verify__Group__4__Impl : ( ( rule__Verify__FindAssignment_4 ) ) ;
    public final void rule__Verify__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1785:1: ( ( ( rule__Verify__FindAssignment_4 ) ) )
            // InternalMyDsl.g:1786:1: ( ( rule__Verify__FindAssignment_4 ) )
            {
            // InternalMyDsl.g:1786:1: ( ( rule__Verify__FindAssignment_4 ) )
            // InternalMyDsl.g:1787:2: ( rule__Verify__FindAssignment_4 )
            {
             before(grammarAccess.getVerifyAccess().getFindAssignment_4()); 
            // InternalMyDsl.g:1788:2: ( rule__Verify__FindAssignment_4 )
            // InternalMyDsl.g:1788:3: rule__Verify__FindAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Verify__FindAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVerifyAccess().getFindAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__4__Impl"


    // $ANTLR start "rule__Verify__Group__5"
    // InternalMyDsl.g:1796:1: rule__Verify__Group__5 : rule__Verify__Group__5__Impl ;
    public final void rule__Verify__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1800:1: ( rule__Verify__Group__5__Impl )
            // InternalMyDsl.g:1801:2: rule__Verify__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Verify__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__5"


    // $ANTLR start "rule__Verify__Group__5__Impl"
    // InternalMyDsl.g:1807:1: rule__Verify__Group__5__Impl : ( ')' ) ;
    public final void rule__Verify__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1811:1: ( ( ')' ) )
            // InternalMyDsl.g:1812:1: ( ')' )
            {
            // InternalMyDsl.g:1812:1: ( ')' )
            // InternalMyDsl.g:1813:2: ')'
            {
             before(grammarAccess.getVerifyAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVerifyAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__Group__5__Impl"


    // $ANTLR start "rule__Apply_All__Group__0"
    // InternalMyDsl.g:1823:1: rule__Apply_All__Group__0 : rule__Apply_All__Group__0__Impl rule__Apply_All__Group__1 ;
    public final void rule__Apply_All__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1827:1: ( rule__Apply_All__Group__0__Impl rule__Apply_All__Group__1 )
            // InternalMyDsl.g:1828:2: rule__Apply_All__Group__0__Impl rule__Apply_All__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Apply_All__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apply_All__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply_All__Group__0"


    // $ANTLR start "rule__Apply_All__Group__0__Impl"
    // InternalMyDsl.g:1835:1: rule__Apply_All__Group__0__Impl : ( 'Apply_All' ) ;
    public final void rule__Apply_All__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1839:1: ( ( 'Apply_All' ) )
            // InternalMyDsl.g:1840:1: ( 'Apply_All' )
            {
            // InternalMyDsl.g:1840:1: ( 'Apply_All' )
            // InternalMyDsl.g:1841:2: 'Apply_All'
            {
             before(grammarAccess.getApply_AllAccess().getApply_AllKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getApply_AllAccess().getApply_AllKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply_All__Group__0__Impl"


    // $ANTLR start "rule__Apply_All__Group__1"
    // InternalMyDsl.g:1850:1: rule__Apply_All__Group__1 : rule__Apply_All__Group__1__Impl rule__Apply_All__Group__2 ;
    public final void rule__Apply_All__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1854:1: ( rule__Apply_All__Group__1__Impl rule__Apply_All__Group__2 )
            // InternalMyDsl.g:1855:2: rule__Apply_All__Group__1__Impl rule__Apply_All__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Apply_All__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apply_All__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply_All__Group__1"


    // $ANTLR start "rule__Apply_All__Group__1__Impl"
    // InternalMyDsl.g:1862:1: rule__Apply_All__Group__1__Impl : ( '(' ) ;
    public final void rule__Apply_All__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1866:1: ( ( '(' ) )
            // InternalMyDsl.g:1867:1: ( '(' )
            {
            // InternalMyDsl.g:1867:1: ( '(' )
            // InternalMyDsl.g:1868:2: '('
            {
             before(grammarAccess.getApply_AllAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getApply_AllAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply_All__Group__1__Impl"


    // $ANTLR start "rule__Apply_All__Group__2"
    // InternalMyDsl.g:1877:1: rule__Apply_All__Group__2 : rule__Apply_All__Group__2__Impl rule__Apply_All__Group__3 ;
    public final void rule__Apply_All__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1881:1: ( rule__Apply_All__Group__2__Impl rule__Apply_All__Group__3 )
            // InternalMyDsl.g:1882:2: rule__Apply_All__Group__2__Impl rule__Apply_All__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Apply_All__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apply_All__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply_All__Group__2"


    // $ANTLR start "rule__Apply_All__Group__2__Impl"
    // InternalMyDsl.g:1889:1: rule__Apply_All__Group__2__Impl : ( ( rule__Apply_All__EltAssignment_2 ) ) ;
    public final void rule__Apply_All__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1893:1: ( ( ( rule__Apply_All__EltAssignment_2 ) ) )
            // InternalMyDsl.g:1894:1: ( ( rule__Apply_All__EltAssignment_2 ) )
            {
            // InternalMyDsl.g:1894:1: ( ( rule__Apply_All__EltAssignment_2 ) )
            // InternalMyDsl.g:1895:2: ( rule__Apply_All__EltAssignment_2 )
            {
             before(grammarAccess.getApply_AllAccess().getEltAssignment_2()); 
            // InternalMyDsl.g:1896:2: ( rule__Apply_All__EltAssignment_2 )
            // InternalMyDsl.g:1896:3: rule__Apply_All__EltAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Apply_All__EltAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getApply_AllAccess().getEltAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply_All__Group__2__Impl"


    // $ANTLR start "rule__Apply_All__Group__3"
    // InternalMyDsl.g:1904:1: rule__Apply_All__Group__3 : rule__Apply_All__Group__3__Impl rule__Apply_All__Group__4 ;
    public final void rule__Apply_All__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1908:1: ( rule__Apply_All__Group__3__Impl rule__Apply_All__Group__4 )
            // InternalMyDsl.g:1909:2: rule__Apply_All__Group__3__Impl rule__Apply_All__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Apply_All__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apply_All__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply_All__Group__3"


    // $ANTLR start "rule__Apply_All__Group__3__Impl"
    // InternalMyDsl.g:1916:1: rule__Apply_All__Group__3__Impl : ( ',' ) ;
    public final void rule__Apply_All__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1920:1: ( ( ',' ) )
            // InternalMyDsl.g:1921:1: ( ',' )
            {
            // InternalMyDsl.g:1921:1: ( ',' )
            // InternalMyDsl.g:1922:2: ','
            {
             before(grammarAccess.getApply_AllAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getApply_AllAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply_All__Group__3__Impl"


    // $ANTLR start "rule__Apply_All__Group__4"
    // InternalMyDsl.g:1931:1: rule__Apply_All__Group__4 : rule__Apply_All__Group__4__Impl rule__Apply_All__Group__5 ;
    public final void rule__Apply_All__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1935:1: ( rule__Apply_All__Group__4__Impl rule__Apply_All__Group__5 )
            // InternalMyDsl.g:1936:2: rule__Apply_All__Group__4__Impl rule__Apply_All__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Apply_All__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Apply_All__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply_All__Group__4"


    // $ANTLR start "rule__Apply_All__Group__4__Impl"
    // InternalMyDsl.g:1943:1: rule__Apply_All__Group__4__Impl : ( ( rule__Apply_All__ActionsAssignment_4 )* ) ;
    public final void rule__Apply_All__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1947:1: ( ( ( rule__Apply_All__ActionsAssignment_4 )* ) )
            // InternalMyDsl.g:1948:1: ( ( rule__Apply_All__ActionsAssignment_4 )* )
            {
            // InternalMyDsl.g:1948:1: ( ( rule__Apply_All__ActionsAssignment_4 )* )
            // InternalMyDsl.g:1949:2: ( rule__Apply_All__ActionsAssignment_4 )*
            {
             before(grammarAccess.getApply_AllAccess().getActionsAssignment_4()); 
            // InternalMyDsl.g:1950:2: ( rule__Apply_All__ActionsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=20 && LA13_0<=22)||(LA13_0>=26 && LA13_0<=27)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1950:3: rule__Apply_All__ActionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Apply_All__ActionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getApply_AllAccess().getActionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply_All__Group__4__Impl"


    // $ANTLR start "rule__Apply_All__Group__5"
    // InternalMyDsl.g:1958:1: rule__Apply_All__Group__5 : rule__Apply_All__Group__5__Impl ;
    public final void rule__Apply_All__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1962:1: ( rule__Apply_All__Group__5__Impl )
            // InternalMyDsl.g:1963:2: rule__Apply_All__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Apply_All__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply_All__Group__5"


    // $ANTLR start "rule__Apply_All__Group__5__Impl"
    // InternalMyDsl.g:1969:1: rule__Apply_All__Group__5__Impl : ( ')' ) ;
    public final void rule__Apply_All__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1973:1: ( ( ')' ) )
            // InternalMyDsl.g:1974:1: ( ')' )
            {
            // InternalMyDsl.g:1974:1: ( ')' )
            // InternalMyDsl.g:1975:2: ')'
            {
             before(grammarAccess.getApply_AllAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getApply_AllAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply_All__Group__5__Impl"


    // $ANTLR start "rule__If__Group__0"
    // InternalMyDsl.g:1985:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1989:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalMyDsl.g:1990:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__If__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // InternalMyDsl.g:1997:1: rule__If__Group__0__Impl : ( 'if' ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2001:1: ( ( 'if' ) )
            // InternalMyDsl.g:2002:1: ( 'if' )
            {
            // InternalMyDsl.g:2002:1: ( 'if' )
            // InternalMyDsl.g:2003:2: 'if'
            {
             before(grammarAccess.getIfAccess().getIfKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // InternalMyDsl.g:2012:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2016:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalMyDsl.g:2017:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__If__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // InternalMyDsl.g:2024:1: rule__If__Group__1__Impl : ( '(' ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2028:1: ( ( '(' ) )
            // InternalMyDsl.g:2029:1: ( '(' )
            {
            // InternalMyDsl.g:2029:1: ( '(' )
            // InternalMyDsl.g:2030:2: '('
            {
             before(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // InternalMyDsl.g:2039:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2043:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalMyDsl.g:2044:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__If__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // InternalMyDsl.g:2051:1: rule__If__Group__2__Impl : ( ( rule__If__CondAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2055:1: ( ( ( rule__If__CondAssignment_2 ) ) )
            // InternalMyDsl.g:2056:1: ( ( rule__If__CondAssignment_2 ) )
            {
            // InternalMyDsl.g:2056:1: ( ( rule__If__CondAssignment_2 ) )
            // InternalMyDsl.g:2057:2: ( rule__If__CondAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getCondAssignment_2()); 
            // InternalMyDsl.g:2058:2: ( rule__If__CondAssignment_2 )
            // InternalMyDsl.g:2058:3: rule__If__CondAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__If__CondAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getCondAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group__3"
    // InternalMyDsl.g:2066:1: rule__If__Group__3 : rule__If__Group__3__Impl rule__If__Group__4 ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2070:1: ( rule__If__Group__3__Impl rule__If__Group__4 )
            // InternalMyDsl.g:2071:2: rule__If__Group__3__Impl rule__If__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__If__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3"


    // $ANTLR start "rule__If__Group__3__Impl"
    // InternalMyDsl.g:2078:1: rule__If__Group__3__Impl : ( ( rule__If__AddAssignment_3 )* ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2082:1: ( ( ( rule__If__AddAssignment_3 )* ) )
            // InternalMyDsl.g:2083:1: ( ( rule__If__AddAssignment_3 )* )
            {
            // InternalMyDsl.g:2083:1: ( ( rule__If__AddAssignment_3 )* )
            // InternalMyDsl.g:2084:2: ( rule__If__AddAssignment_3 )*
            {
             before(grammarAccess.getIfAccess().getAddAssignment_3()); 
            // InternalMyDsl.g:2085:2: ( rule__If__AddAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=13 && LA14_0<=14)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:2085:3: rule__If__AddAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__If__AddAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getIfAccess().getAddAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3__Impl"


    // $ANTLR start "rule__If__Group__4"
    // InternalMyDsl.g:2093:1: rule__If__Group__4 : rule__If__Group__4__Impl rule__If__Group__5 ;
    public final void rule__If__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2097:1: ( rule__If__Group__4__Impl rule__If__Group__5 )
            // InternalMyDsl.g:2098:2: rule__If__Group__4__Impl rule__If__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__If__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4"


    // $ANTLR start "rule__If__Group__4__Impl"
    // InternalMyDsl.g:2105:1: rule__If__Group__4__Impl : ( ')' ) ;
    public final void rule__If__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2109:1: ( ( ')' ) )
            // InternalMyDsl.g:2110:1: ( ')' )
            {
            // InternalMyDsl.g:2110:1: ( ')' )
            // InternalMyDsl.g:2111:2: ')'
            {
             before(grammarAccess.getIfAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__4__Impl"


    // $ANTLR start "rule__If__Group__5"
    // InternalMyDsl.g:2120:1: rule__If__Group__5 : rule__If__Group__5__Impl rule__If__Group__6 ;
    public final void rule__If__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2124:1: ( rule__If__Group__5__Impl rule__If__Group__6 )
            // InternalMyDsl.g:2125:2: rule__If__Group__5__Impl rule__If__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__If__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5"


    // $ANTLR start "rule__If__Group__5__Impl"
    // InternalMyDsl.g:2132:1: rule__If__Group__5__Impl : ( '{' ) ;
    public final void rule__If__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2136:1: ( ( '{' ) )
            // InternalMyDsl.g:2137:1: ( '{' )
            {
            // InternalMyDsl.g:2137:1: ( '{' )
            // InternalMyDsl.g:2138:2: '{'
            {
             before(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__5__Impl"


    // $ANTLR start "rule__If__Group__6"
    // InternalMyDsl.g:2147:1: rule__If__Group__6 : rule__If__Group__6__Impl rule__If__Group__7 ;
    public final void rule__If__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2151:1: ( rule__If__Group__6__Impl rule__If__Group__7 )
            // InternalMyDsl.g:2152:2: rule__If__Group__6__Impl rule__If__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__If__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6"


    // $ANTLR start "rule__If__Group__6__Impl"
    // InternalMyDsl.g:2159:1: rule__If__Group__6__Impl : ( ( rule__If__OperationsAssignment_6 )* ) ;
    public final void rule__If__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2163:1: ( ( ( rule__If__OperationsAssignment_6 )* ) )
            // InternalMyDsl.g:2164:1: ( ( rule__If__OperationsAssignment_6 )* )
            {
            // InternalMyDsl.g:2164:1: ( ( rule__If__OperationsAssignment_6 )* )
            // InternalMyDsl.g:2165:2: ( rule__If__OperationsAssignment_6 )*
            {
             before(grammarAccess.getIfAccess().getOperationsAssignment_6()); 
            // InternalMyDsl.g:2166:2: ( rule__If__OperationsAssignment_6 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=20 && LA15_0<=22)||(LA15_0>=26 && LA15_0<=29)||LA15_0==31||LA15_0==34||(LA15_0>=37 && LA15_0<=39)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:2166:3: rule__If__OperationsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__If__OperationsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getIfAccess().getOperationsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__6__Impl"


    // $ANTLR start "rule__If__Group__7"
    // InternalMyDsl.g:2174:1: rule__If__Group__7 : rule__If__Group__7__Impl rule__If__Group__8 ;
    public final void rule__If__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2178:1: ( rule__If__Group__7__Impl rule__If__Group__8 )
            // InternalMyDsl.g:2179:2: rule__If__Group__7__Impl rule__If__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__If__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__7"


    // $ANTLR start "rule__If__Group__7__Impl"
    // InternalMyDsl.g:2186:1: rule__If__Group__7__Impl : ( '}' ) ;
    public final void rule__If__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2190:1: ( ( '}' ) )
            // InternalMyDsl.g:2191:1: ( '}' )
            {
            // InternalMyDsl.g:2191:1: ( '}' )
            // InternalMyDsl.g:2192:2: '}'
            {
             before(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__7__Impl"


    // $ANTLR start "rule__If__Group__8"
    // InternalMyDsl.g:2201:1: rule__If__Group__8 : rule__If__Group__8__Impl ;
    public final void rule__If__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2205:1: ( rule__If__Group__8__Impl )
            // InternalMyDsl.g:2206:2: rule__If__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__8"


    // $ANTLR start "rule__If__Group__8__Impl"
    // InternalMyDsl.g:2212:1: rule__If__Group__8__Impl : ( ( rule__If__Group_8__0 )? ) ;
    public final void rule__If__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2216:1: ( ( ( rule__If__Group_8__0 )? ) )
            // InternalMyDsl.g:2217:1: ( ( rule__If__Group_8__0 )? )
            {
            // InternalMyDsl.g:2217:1: ( ( rule__If__Group_8__0 )? )
            // InternalMyDsl.g:2218:2: ( rule__If__Group_8__0 )?
            {
             before(grammarAccess.getIfAccess().getGroup_8()); 
            // InternalMyDsl.g:2219:2: ( rule__If__Group_8__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:2219:3: rule__If__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__If__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__8__Impl"


    // $ANTLR start "rule__If__Group_8__0"
    // InternalMyDsl.g:2228:1: rule__If__Group_8__0 : rule__If__Group_8__0__Impl rule__If__Group_8__1 ;
    public final void rule__If__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2232:1: ( rule__If__Group_8__0__Impl rule__If__Group_8__1 )
            // InternalMyDsl.g:2233:2: rule__If__Group_8__0__Impl rule__If__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__If__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__0"


    // $ANTLR start "rule__If__Group_8__0__Impl"
    // InternalMyDsl.g:2240:1: rule__If__Group_8__0__Impl : ( 'else' ) ;
    public final void rule__If__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2244:1: ( ( 'else' ) )
            // InternalMyDsl.g:2245:1: ( 'else' )
            {
            // InternalMyDsl.g:2245:1: ( 'else' )
            // InternalMyDsl.g:2246:2: 'else'
            {
             before(grammarAccess.getIfAccess().getElseKeyword_8_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getElseKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__0__Impl"


    // $ANTLR start "rule__If__Group_8__1"
    // InternalMyDsl.g:2255:1: rule__If__Group_8__1 : rule__If__Group_8__1__Impl rule__If__Group_8__2 ;
    public final void rule__If__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2259:1: ( rule__If__Group_8__1__Impl rule__If__Group_8__2 )
            // InternalMyDsl.g:2260:2: rule__If__Group_8__1__Impl rule__If__Group_8__2
            {
            pushFollow(FOLLOW_8);
            rule__If__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__1"


    // $ANTLR start "rule__If__Group_8__1__Impl"
    // InternalMyDsl.g:2267:1: rule__If__Group_8__1__Impl : ( '{' ) ;
    public final void rule__If__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2271:1: ( ( '{' ) )
            // InternalMyDsl.g:2272:1: ( '{' )
            {
            // InternalMyDsl.g:2272:1: ( '{' )
            // InternalMyDsl.g:2273:2: '{'
            {
             before(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__1__Impl"


    // $ANTLR start "rule__If__Group_8__2"
    // InternalMyDsl.g:2282:1: rule__If__Group_8__2 : rule__If__Group_8__2__Impl rule__If__Group_8__3 ;
    public final void rule__If__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2286:1: ( rule__If__Group_8__2__Impl rule__If__Group_8__3 )
            // InternalMyDsl.g:2287:2: rule__If__Group_8__2__Impl rule__If__Group_8__3
            {
            pushFollow(FOLLOW_8);
            rule__If__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__2"


    // $ANTLR start "rule__If__Group_8__2__Impl"
    // InternalMyDsl.g:2294:1: rule__If__Group_8__2__Impl : ( ( rule__If__OperationsbisAssignment_8_2 )* ) ;
    public final void rule__If__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2298:1: ( ( ( rule__If__OperationsbisAssignment_8_2 )* ) )
            // InternalMyDsl.g:2299:1: ( ( rule__If__OperationsbisAssignment_8_2 )* )
            {
            // InternalMyDsl.g:2299:1: ( ( rule__If__OperationsbisAssignment_8_2 )* )
            // InternalMyDsl.g:2300:2: ( rule__If__OperationsbisAssignment_8_2 )*
            {
             before(grammarAccess.getIfAccess().getOperationsbisAssignment_8_2()); 
            // InternalMyDsl.g:2301:2: ( rule__If__OperationsbisAssignment_8_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=20 && LA17_0<=22)||(LA17_0>=26 && LA17_0<=29)||LA17_0==31||LA17_0==34||(LA17_0>=37 && LA17_0<=39)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:2301:3: rule__If__OperationsbisAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__If__OperationsbisAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getIfAccess().getOperationsbisAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__2__Impl"


    // $ANTLR start "rule__If__Group_8__3"
    // InternalMyDsl.g:2309:1: rule__If__Group_8__3 : rule__If__Group_8__3__Impl ;
    public final void rule__If__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2313:1: ( rule__If__Group_8__3__Impl )
            // InternalMyDsl.g:2314:2: rule__If__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__3"


    // $ANTLR start "rule__If__Group_8__3__Impl"
    // InternalMyDsl.g:2320:1: rule__If__Group_8__3__Impl : ( '}' ) ;
    public final void rule__If__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2324:1: ( ( '}' ) )
            // InternalMyDsl.g:2325:1: ( '}' )
            {
            // InternalMyDsl.g:2325:1: ( '}' )
            // InternalMyDsl.g:2326:2: '}'
            {
             before(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_8_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getRightCurlyBracketKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group_8__3__Impl"


    // $ANTLR start "rule__Store__Group__0"
    // InternalMyDsl.g:2336:1: rule__Store__Group__0 : rule__Store__Group__0__Impl rule__Store__Group__1 ;
    public final void rule__Store__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2340:1: ( rule__Store__Group__0__Impl rule__Store__Group__1 )
            // InternalMyDsl.g:2341:2: rule__Store__Group__0__Impl rule__Store__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Store__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__0"


    // $ANTLR start "rule__Store__Group__0__Impl"
    // InternalMyDsl.g:2348:1: rule__Store__Group__0__Impl : ( 'Store' ) ;
    public final void rule__Store__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2352:1: ( ( 'Store' ) )
            // InternalMyDsl.g:2353:1: ( 'Store' )
            {
            // InternalMyDsl.g:2353:1: ( 'Store' )
            // InternalMyDsl.g:2354:2: 'Store'
            {
             before(grammarAccess.getStoreAccess().getStoreKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getStoreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__0__Impl"


    // $ANTLR start "rule__Store__Group__1"
    // InternalMyDsl.g:2363:1: rule__Store__Group__1 : rule__Store__Group__1__Impl rule__Store__Group__2 ;
    public final void rule__Store__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2367:1: ( rule__Store__Group__1__Impl rule__Store__Group__2 )
            // InternalMyDsl.g:2368:2: rule__Store__Group__1__Impl rule__Store__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Store__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__1"


    // $ANTLR start "rule__Store__Group__1__Impl"
    // InternalMyDsl.g:2375:1: rule__Store__Group__1__Impl : ( 'Var' ) ;
    public final void rule__Store__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2379:1: ( ( 'Var' ) )
            // InternalMyDsl.g:2380:1: ( 'Var' )
            {
            // InternalMyDsl.g:2380:1: ( 'Var' )
            // InternalMyDsl.g:2381:2: 'Var'
            {
             before(grammarAccess.getStoreAccess().getVarKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getVarKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__1__Impl"


    // $ANTLR start "rule__Store__Group__2"
    // InternalMyDsl.g:2390:1: rule__Store__Group__2 : rule__Store__Group__2__Impl rule__Store__Group__3 ;
    public final void rule__Store__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2394:1: ( rule__Store__Group__2__Impl rule__Store__Group__3 )
            // InternalMyDsl.g:2395:2: rule__Store__Group__2__Impl rule__Store__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Store__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__2"


    // $ANTLR start "rule__Store__Group__2__Impl"
    // InternalMyDsl.g:2402:1: rule__Store__Group__2__Impl : ( ( rule__Store__VariAssignment_2 ) ) ;
    public final void rule__Store__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2406:1: ( ( ( rule__Store__VariAssignment_2 ) ) )
            // InternalMyDsl.g:2407:1: ( ( rule__Store__VariAssignment_2 ) )
            {
            // InternalMyDsl.g:2407:1: ( ( rule__Store__VariAssignment_2 ) )
            // InternalMyDsl.g:2408:2: ( rule__Store__VariAssignment_2 )
            {
             before(grammarAccess.getStoreAccess().getVariAssignment_2()); 
            // InternalMyDsl.g:2409:2: ( rule__Store__VariAssignment_2 )
            // InternalMyDsl.g:2409:3: rule__Store__VariAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Store__VariAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getVariAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__2__Impl"


    // $ANTLR start "rule__Store__Group__3"
    // InternalMyDsl.g:2417:1: rule__Store__Group__3 : rule__Store__Group__3__Impl rule__Store__Group__4 ;
    public final void rule__Store__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2421:1: ( rule__Store__Group__3__Impl rule__Store__Group__4 )
            // InternalMyDsl.g:2422:2: rule__Store__Group__3__Impl rule__Store__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Store__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Store__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__3"


    // $ANTLR start "rule__Store__Group__3__Impl"
    // InternalMyDsl.g:2429:1: rule__Store__Group__3__Impl : ( '=' ) ;
    public final void rule__Store__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2433:1: ( ( '=' ) )
            // InternalMyDsl.g:2434:1: ( '=' )
            {
            // InternalMyDsl.g:2434:1: ( '=' )
            // InternalMyDsl.g:2435:2: '='
            {
             before(grammarAccess.getStoreAccess().getEqualsSignKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__3__Impl"


    // $ANTLR start "rule__Store__Group__4"
    // InternalMyDsl.g:2444:1: rule__Store__Group__4 : rule__Store__Group__4__Impl ;
    public final void rule__Store__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2448:1: ( rule__Store__Group__4__Impl )
            // InternalMyDsl.g:2449:2: rule__Store__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Store__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__4"


    // $ANTLR start "rule__Store__Group__4__Impl"
    // InternalMyDsl.g:2455:1: rule__Store__Group__4__Impl : ( ( rule__Store__TAssignment_4 ) ) ;
    public final void rule__Store__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2459:1: ( ( ( rule__Store__TAssignment_4 ) ) )
            // InternalMyDsl.g:2460:1: ( ( rule__Store__TAssignment_4 ) )
            {
            // InternalMyDsl.g:2460:1: ( ( rule__Store__TAssignment_4 ) )
            // InternalMyDsl.g:2461:2: ( rule__Store__TAssignment_4 )
            {
             before(grammarAccess.getStoreAccess().getTAssignment_4()); 
            // InternalMyDsl.g:2462:2: ( rule__Store__TAssignment_4 )
            // InternalMyDsl.g:2462:3: rule__Store__TAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Store__TAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStoreAccess().getTAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__Group__4__Impl"


    // $ANTLR start "rule__CallFunction__Group__0"
    // InternalMyDsl.g:2471:1: rule__CallFunction__Group__0 : rule__CallFunction__Group__0__Impl rule__CallFunction__Group__1 ;
    public final void rule__CallFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2475:1: ( rule__CallFunction__Group__0__Impl rule__CallFunction__Group__1 )
            // InternalMyDsl.g:2476:2: rule__CallFunction__Group__0__Impl rule__CallFunction__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__CallFunction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallFunction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallFunction__Group__0"


    // $ANTLR start "rule__CallFunction__Group__0__Impl"
    // InternalMyDsl.g:2483:1: rule__CallFunction__Group__0__Impl : ( 'func' ) ;
    public final void rule__CallFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2487:1: ( ( 'func' ) )
            // InternalMyDsl.g:2488:1: ( 'func' )
            {
            // InternalMyDsl.g:2488:1: ( 'func' )
            // InternalMyDsl.g:2489:2: 'func'
            {
             before(grammarAccess.getCallFunctionAccess().getFuncKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCallFunctionAccess().getFuncKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallFunction__Group__0__Impl"


    // $ANTLR start "rule__CallFunction__Group__1"
    // InternalMyDsl.g:2498:1: rule__CallFunction__Group__1 : rule__CallFunction__Group__1__Impl rule__CallFunction__Group__2 ;
    public final void rule__CallFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2502:1: ( rule__CallFunction__Group__1__Impl rule__CallFunction__Group__2 )
            // InternalMyDsl.g:2503:2: rule__CallFunction__Group__1__Impl rule__CallFunction__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__CallFunction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallFunction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallFunction__Group__1"


    // $ANTLR start "rule__CallFunction__Group__1__Impl"
    // InternalMyDsl.g:2510:1: rule__CallFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__CallFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2514:1: ( ( '(' ) )
            // InternalMyDsl.g:2515:1: ( '(' )
            {
            // InternalMyDsl.g:2515:1: ( '(' )
            // InternalMyDsl.g:2516:2: '('
            {
             before(grammarAccess.getCallFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCallFunctionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallFunction__Group__1__Impl"


    // $ANTLR start "rule__CallFunction__Group__2"
    // InternalMyDsl.g:2525:1: rule__CallFunction__Group__2 : rule__CallFunction__Group__2__Impl rule__CallFunction__Group__3 ;
    public final void rule__CallFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2529:1: ( rule__CallFunction__Group__2__Impl rule__CallFunction__Group__3 )
            // InternalMyDsl.g:2530:2: rule__CallFunction__Group__2__Impl rule__CallFunction__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__CallFunction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallFunction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallFunction__Group__2"


    // $ANTLR start "rule__CallFunction__Group__2__Impl"
    // InternalMyDsl.g:2537:1: rule__CallFunction__Group__2__Impl : ( ( rule__CallFunction__NameAssignment_2 ) ) ;
    public final void rule__CallFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2541:1: ( ( ( rule__CallFunction__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2542:1: ( ( rule__CallFunction__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2542:1: ( ( rule__CallFunction__NameAssignment_2 ) )
            // InternalMyDsl.g:2543:2: ( rule__CallFunction__NameAssignment_2 )
            {
             before(grammarAccess.getCallFunctionAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2544:2: ( rule__CallFunction__NameAssignment_2 )
            // InternalMyDsl.g:2544:3: rule__CallFunction__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CallFunction__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCallFunctionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallFunction__Group__2__Impl"


    // $ANTLR start "rule__CallFunction__Group__3"
    // InternalMyDsl.g:2552:1: rule__CallFunction__Group__3 : rule__CallFunction__Group__3__Impl rule__CallFunction__Group__4 ;
    public final void rule__CallFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2556:1: ( rule__CallFunction__Group__3__Impl rule__CallFunction__Group__4 )
            // InternalMyDsl.g:2557:2: rule__CallFunction__Group__3__Impl rule__CallFunction__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__CallFunction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallFunction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallFunction__Group__3"


    // $ANTLR start "rule__CallFunction__Group__3__Impl"
    // InternalMyDsl.g:2564:1: rule__CallFunction__Group__3__Impl : ( ',' ) ;
    public final void rule__CallFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2568:1: ( ( ',' ) )
            // InternalMyDsl.g:2569:1: ( ',' )
            {
            // InternalMyDsl.g:2569:1: ( ',' )
            // InternalMyDsl.g:2570:2: ','
            {
             before(grammarAccess.getCallFunctionAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCallFunctionAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallFunction__Group__3__Impl"


    // $ANTLR start "rule__CallFunction__Group__4"
    // InternalMyDsl.g:2579:1: rule__CallFunction__Group__4 : rule__CallFunction__Group__4__Impl rule__CallFunction__Group__5 ;
    public final void rule__CallFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2583:1: ( rule__CallFunction__Group__4__Impl rule__CallFunction__Group__5 )
            // InternalMyDsl.g:2584:2: rule__CallFunction__Group__4__Impl rule__CallFunction__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__CallFunction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallFunction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallFunction__Group__4"


    // $ANTLR start "rule__CallFunction__Group__4__Impl"
    // InternalMyDsl.g:2591:1: rule__CallFunction__Group__4__Impl : ( ( rule__CallFunction__VarsAssignment_4 )* ) ;
    public final void rule__CallFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2595:1: ( ( ( rule__CallFunction__VarsAssignment_4 )* ) )
            // InternalMyDsl.g:2596:1: ( ( rule__CallFunction__VarsAssignment_4 )* )
            {
            // InternalMyDsl.g:2596:1: ( ( rule__CallFunction__VarsAssignment_4 )* )
            // InternalMyDsl.g:2597:2: ( rule__CallFunction__VarsAssignment_4 )*
            {
             before(grammarAccess.getCallFunctionAccess().getVarsAssignment_4()); 
            // InternalMyDsl.g:2598:2: ( rule__CallFunction__VarsAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:2598:3: rule__CallFunction__VarsAssignment_4
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__CallFunction__VarsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getCallFunctionAccess().getVarsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallFunction__Group__4__Impl"


    // $ANTLR start "rule__CallFunction__Group__5"
    // InternalMyDsl.g:2606:1: rule__CallFunction__Group__5 : rule__CallFunction__Group__5__Impl ;
    public final void rule__CallFunction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2610:1: ( rule__CallFunction__Group__5__Impl )
            // InternalMyDsl.g:2611:2: rule__CallFunction__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallFunction__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallFunction__Group__5"


    // $ANTLR start "rule__CallFunction__Group__5__Impl"
    // InternalMyDsl.g:2617:1: rule__CallFunction__Group__5__Impl : ( ')' ) ;
    public final void rule__CallFunction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2621:1: ( ( ')' ) )
            // InternalMyDsl.g:2622:1: ( ')' )
            {
            // InternalMyDsl.g:2622:1: ( ')' )
            // InternalMyDsl.g:2623:2: ')'
            {
             before(grammarAccess.getCallFunctionAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCallFunctionAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallFunction__Group__5__Impl"


    // $ANTLR start "rule__FuncVar__Group__0"
    // InternalMyDsl.g:2633:1: rule__FuncVar__Group__0 : rule__FuncVar__Group__0__Impl rule__FuncVar__Group__1 ;
    public final void rule__FuncVar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2637:1: ( rule__FuncVar__Group__0__Impl rule__FuncVar__Group__1 )
            // InternalMyDsl.g:2638:2: rule__FuncVar__Group__0__Impl rule__FuncVar__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__FuncVar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FuncVar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncVar__Group__0"


    // $ANTLR start "rule__FuncVar__Group__0__Impl"
    // InternalMyDsl.g:2645:1: rule__FuncVar__Group__0__Impl : ( ( rule__FuncVar__TypeAssignment_0 ) ) ;
    public final void rule__FuncVar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2649:1: ( ( ( rule__FuncVar__TypeAssignment_0 ) ) )
            // InternalMyDsl.g:2650:1: ( ( rule__FuncVar__TypeAssignment_0 ) )
            {
            // InternalMyDsl.g:2650:1: ( ( rule__FuncVar__TypeAssignment_0 ) )
            // InternalMyDsl.g:2651:2: ( rule__FuncVar__TypeAssignment_0 )
            {
             before(grammarAccess.getFuncVarAccess().getTypeAssignment_0()); 
            // InternalMyDsl.g:2652:2: ( rule__FuncVar__TypeAssignment_0 )
            // InternalMyDsl.g:2652:3: rule__FuncVar__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FuncVar__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFuncVarAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncVar__Group__0__Impl"


    // $ANTLR start "rule__FuncVar__Group__1"
    // InternalMyDsl.g:2660:1: rule__FuncVar__Group__1 : rule__FuncVar__Group__1__Impl ;
    public final void rule__FuncVar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2664:1: ( rule__FuncVar__Group__1__Impl )
            // InternalMyDsl.g:2665:2: rule__FuncVar__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FuncVar__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncVar__Group__1"


    // $ANTLR start "rule__FuncVar__Group__1__Impl"
    // InternalMyDsl.g:2671:1: rule__FuncVar__Group__1__Impl : ( ( rule__FuncVar__NameAssignment_1 ) ) ;
    public final void rule__FuncVar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2675:1: ( ( ( rule__FuncVar__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2676:1: ( ( rule__FuncVar__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2676:1: ( ( rule__FuncVar__NameAssignment_1 ) )
            // InternalMyDsl.g:2677:2: ( rule__FuncVar__NameAssignment_1 )
            {
             before(grammarAccess.getFuncVarAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2678:2: ( rule__FuncVar__NameAssignment_1 )
            // InternalMyDsl.g:2678:3: rule__FuncVar__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FuncVar__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFuncVarAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncVar__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // InternalMyDsl.g:2687:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2691:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // InternalMyDsl.g:2692:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Function__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // InternalMyDsl.g:2699:1: rule__Function__Group__0__Impl : ( 'Function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2703:1: ( ( 'Function' ) )
            // InternalMyDsl.g:2704:1: ( 'Function' )
            {
            // InternalMyDsl.g:2704:1: ( 'Function' )
            // InternalMyDsl.g:2705:2: 'Function'
            {
             before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // InternalMyDsl.g:2714:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2718:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // InternalMyDsl.g:2719:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Function__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // InternalMyDsl.g:2726:1: rule__Function__Group__1__Impl : ( '(' ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2730:1: ( ( '(' ) )
            // InternalMyDsl.g:2731:1: ( '(' )
            {
            // InternalMyDsl.g:2731:1: ( '(' )
            // InternalMyDsl.g:2732:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // InternalMyDsl.g:2741:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2745:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // InternalMyDsl.g:2746:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Function__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // InternalMyDsl.g:2753:1: rule__Function__Group__2__Impl : ( 'Name' ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2757:1: ( ( 'Name' ) )
            // InternalMyDsl.g:2758:1: ( 'Name' )
            {
            // InternalMyDsl.g:2758:1: ( 'Name' )
            // InternalMyDsl.g:2759:2: 'Name'
            {
             before(grammarAccess.getFunctionAccess().getNameKeyword_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // InternalMyDsl.g:2768:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2772:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // InternalMyDsl.g:2773:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Function__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // InternalMyDsl.g:2780:1: rule__Function__Group__3__Impl : ( ( rule__Function__NameAssignment_3 ) ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2784:1: ( ( ( rule__Function__NameAssignment_3 ) ) )
            // InternalMyDsl.g:2785:1: ( ( rule__Function__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:2785:1: ( ( rule__Function__NameAssignment_3 ) )
            // InternalMyDsl.g:2786:2: ( rule__Function__NameAssignment_3 )
            {
             before(grammarAccess.getFunctionAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:2787:2: ( rule__Function__NameAssignment_3 )
            // InternalMyDsl.g:2787:3: rule__Function__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Function__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFunctionAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // InternalMyDsl.g:2795:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2799:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // InternalMyDsl.g:2800:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__Function__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // InternalMyDsl.g:2807:1: rule__Function__Group__4__Impl : ( ',' ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2811:1: ( ( ',' ) )
            // InternalMyDsl.g:2812:1: ( ',' )
            {
            // InternalMyDsl.g:2812:1: ( ',' )
            // InternalMyDsl.g:2813:2: ','
            {
             before(grammarAccess.getFunctionAccess().getCommaKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // InternalMyDsl.g:2822:1: rule__Function__Group__5 : rule__Function__Group__5__Impl rule__Function__Group__6 ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2826:1: ( rule__Function__Group__5__Impl rule__Function__Group__6 )
            // InternalMyDsl.g:2827:2: rule__Function__Group__5__Impl rule__Function__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Function__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // InternalMyDsl.g:2834:1: rule__Function__Group__5__Impl : ( 'Var' ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2838:1: ( ( 'Var' ) )
            // InternalMyDsl.g:2839:1: ( 'Var' )
            {
            // InternalMyDsl.g:2839:1: ( 'Var' )
            // InternalMyDsl.g:2840:2: 'Var'
            {
             before(grammarAccess.getFunctionAccess().getVarKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getVarKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__Function__Group__6"
    // InternalMyDsl.g:2849:1: rule__Function__Group__6 : rule__Function__Group__6__Impl rule__Function__Group__7 ;
    public final void rule__Function__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2853:1: ( rule__Function__Group__6__Impl rule__Function__Group__7 )
            // InternalMyDsl.g:2854:2: rule__Function__Group__6__Impl rule__Function__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Function__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__6"


    // $ANTLR start "rule__Function__Group__6__Impl"
    // InternalMyDsl.g:2861:1: rule__Function__Group__6__Impl : ( '=' ) ;
    public final void rule__Function__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2865:1: ( ( '=' ) )
            // InternalMyDsl.g:2866:1: ( '=' )
            {
            // InternalMyDsl.g:2866:1: ( '=' )
            // InternalMyDsl.g:2867:2: '='
            {
             before(grammarAccess.getFunctionAccess().getEqualsSignKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getEqualsSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__6__Impl"


    // $ANTLR start "rule__Function__Group__7"
    // InternalMyDsl.g:2876:1: rule__Function__Group__7 : rule__Function__Group__7__Impl rule__Function__Group__8 ;
    public final void rule__Function__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2880:1: ( rule__Function__Group__7__Impl rule__Function__Group__8 )
            // InternalMyDsl.g:2881:2: rule__Function__Group__7__Impl rule__Function__Group__8
            {
            pushFollow(FOLLOW_29);
            rule__Function__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__7"


    // $ANTLR start "rule__Function__Group__7__Impl"
    // InternalMyDsl.g:2888:1: rule__Function__Group__7__Impl : ( '(' ) ;
    public final void rule__Function__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2892:1: ( ( '(' ) )
            // InternalMyDsl.g:2893:1: ( '(' )
            {
            // InternalMyDsl.g:2893:1: ( '(' )
            // InternalMyDsl.g:2894:2: '('
            {
             before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__7__Impl"


    // $ANTLR start "rule__Function__Group__8"
    // InternalMyDsl.g:2903:1: rule__Function__Group__8 : rule__Function__Group__8__Impl rule__Function__Group__9 ;
    public final void rule__Function__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2907:1: ( rule__Function__Group__8__Impl rule__Function__Group__9 )
            // InternalMyDsl.g:2908:2: rule__Function__Group__8__Impl rule__Function__Group__9
            {
            pushFollow(FOLLOW_29);
            rule__Function__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__8"


    // $ANTLR start "rule__Function__Group__8__Impl"
    // InternalMyDsl.g:2915:1: rule__Function__Group__8__Impl : ( ( rule__Function__VarsAssignment_8 )* ) ;
    public final void rule__Function__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2919:1: ( ( ( rule__Function__VarsAssignment_8 )* ) )
            // InternalMyDsl.g:2920:1: ( ( rule__Function__VarsAssignment_8 )* )
            {
            // InternalMyDsl.g:2920:1: ( ( rule__Function__VarsAssignment_8 )* )
            // InternalMyDsl.g:2921:2: ( rule__Function__VarsAssignment_8 )*
            {
             before(grammarAccess.getFunctionAccess().getVarsAssignment_8()); 
            // InternalMyDsl.g:2922:2: ( rule__Function__VarsAssignment_8 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=40 && LA19_0<=43)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:2922:3: rule__Function__VarsAssignment_8
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Function__VarsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getVarsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__8__Impl"


    // $ANTLR start "rule__Function__Group__9"
    // InternalMyDsl.g:2930:1: rule__Function__Group__9 : rule__Function__Group__9__Impl rule__Function__Group__10 ;
    public final void rule__Function__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2934:1: ( rule__Function__Group__9__Impl rule__Function__Group__10 )
            // InternalMyDsl.g:2935:2: rule__Function__Group__9__Impl rule__Function__Group__10
            {
            pushFollow(FOLLOW_13);
            rule__Function__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__9"


    // $ANTLR start "rule__Function__Group__9__Impl"
    // InternalMyDsl.g:2942:1: rule__Function__Group__9__Impl : ( ')' ) ;
    public final void rule__Function__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2946:1: ( ( ')' ) )
            // InternalMyDsl.g:2947:1: ( ')' )
            {
            // InternalMyDsl.g:2947:1: ( ')' )
            // InternalMyDsl.g:2948:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_9()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__9__Impl"


    // $ANTLR start "rule__Function__Group__10"
    // InternalMyDsl.g:2957:1: rule__Function__Group__10 : rule__Function__Group__10__Impl rule__Function__Group__11 ;
    public final void rule__Function__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2961:1: ( rule__Function__Group__10__Impl rule__Function__Group__11 )
            // InternalMyDsl.g:2962:2: rule__Function__Group__10__Impl rule__Function__Group__11
            {
            pushFollow(FOLLOW_31);
            rule__Function__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__10"


    // $ANTLR start "rule__Function__Group__10__Impl"
    // InternalMyDsl.g:2969:1: rule__Function__Group__10__Impl : ( ',' ) ;
    public final void rule__Function__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2973:1: ( ( ',' ) )
            // InternalMyDsl.g:2974:1: ( ',' )
            {
            // InternalMyDsl.g:2974:1: ( ',' )
            // InternalMyDsl.g:2975:2: ','
            {
             before(grammarAccess.getFunctionAccess().getCommaKeyword_10()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getCommaKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__10__Impl"


    // $ANTLR start "rule__Function__Group__11"
    // InternalMyDsl.g:2984:1: rule__Function__Group__11 : rule__Function__Group__11__Impl rule__Function__Group__12 ;
    public final void rule__Function__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2988:1: ( rule__Function__Group__11__Impl rule__Function__Group__12 )
            // InternalMyDsl.g:2989:2: rule__Function__Group__11__Impl rule__Function__Group__12
            {
            pushFollow(FOLLOW_31);
            rule__Function__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Function__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__11"


    // $ANTLR start "rule__Function__Group__11__Impl"
    // InternalMyDsl.g:2996:1: rule__Function__Group__11__Impl : ( ( rule__Function__OperationsAssignment_11 )* ) ;
    public final void rule__Function__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3000:1: ( ( ( rule__Function__OperationsAssignment_11 )* ) )
            // InternalMyDsl.g:3001:1: ( ( rule__Function__OperationsAssignment_11 )* )
            {
            // InternalMyDsl.g:3001:1: ( ( rule__Function__OperationsAssignment_11 )* )
            // InternalMyDsl.g:3002:2: ( rule__Function__OperationsAssignment_11 )*
            {
             before(grammarAccess.getFunctionAccess().getOperationsAssignment_11()); 
            // InternalMyDsl.g:3003:2: ( rule__Function__OperationsAssignment_11 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=20 && LA20_0<=22)||(LA20_0>=26 && LA20_0<=29)||LA20_0==31||LA20_0==34||(LA20_0>=37 && LA20_0<=39)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:3003:3: rule__Function__OperationsAssignment_11
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Function__OperationsAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getFunctionAccess().getOperationsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__11__Impl"


    // $ANTLR start "rule__Function__Group__12"
    // InternalMyDsl.g:3011:1: rule__Function__Group__12 : rule__Function__Group__12__Impl ;
    public final void rule__Function__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3015:1: ( rule__Function__Group__12__Impl )
            // InternalMyDsl.g:3016:2: rule__Function__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Function__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__12"


    // $ANTLR start "rule__Function__Group__12__Impl"
    // InternalMyDsl.g:3022:1: rule__Function__Group__12__Impl : ( ')' ) ;
    public final void rule__Function__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3026:1: ( ( ')' ) )
            // InternalMyDsl.g:3027:1: ( ')' )
            {
            // InternalMyDsl.g:3027:1: ( ')' )
            // InternalMyDsl.g:3028:2: ')'
            {
             before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_12()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__12__Impl"


    // $ANTLR start "rule__ForLoop__Group__0"
    // InternalMyDsl.g:3038:1: rule__ForLoop__Group__0 : rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 ;
    public final void rule__ForLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3042:1: ( rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 )
            // InternalMyDsl.g:3043:2: rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__ForLoop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__0"


    // $ANTLR start "rule__ForLoop__Group__0__Impl"
    // InternalMyDsl.g:3050:1: rule__ForLoop__Group__0__Impl : ( 'For' ) ;
    public final void rule__ForLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3054:1: ( ( 'For' ) )
            // InternalMyDsl.g:3055:1: ( 'For' )
            {
            // InternalMyDsl.g:3055:1: ( 'For' )
            // InternalMyDsl.g:3056:2: 'For'
            {
             before(grammarAccess.getForLoopAccess().getForKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__0__Impl"


    // $ANTLR start "rule__ForLoop__Group__1"
    // InternalMyDsl.g:3065:1: rule__ForLoop__Group__1 : rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 ;
    public final void rule__ForLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3069:1: ( rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 )
            // InternalMyDsl.g:3070:2: rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__ForLoop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__1"


    // $ANTLR start "rule__ForLoop__Group__1__Impl"
    // InternalMyDsl.g:3077:1: rule__ForLoop__Group__1__Impl : ( '(' ) ;
    public final void rule__ForLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3081:1: ( ( '(' ) )
            // InternalMyDsl.g:3082:1: ( '(' )
            {
            // InternalMyDsl.g:3082:1: ( '(' )
            // InternalMyDsl.g:3083:2: '('
            {
             before(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__1__Impl"


    // $ANTLR start "rule__ForLoop__Group__2"
    // InternalMyDsl.g:3092:1: rule__ForLoop__Group__2 : rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 ;
    public final void rule__ForLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3096:1: ( rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 )
            // InternalMyDsl.g:3097:2: rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ForLoop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__2"


    // $ANTLR start "rule__ForLoop__Group__2__Impl"
    // InternalMyDsl.g:3104:1: rule__ForLoop__Group__2__Impl : ( ( rule__ForLoop__StartAssignment_2 ) ) ;
    public final void rule__ForLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3108:1: ( ( ( rule__ForLoop__StartAssignment_2 ) ) )
            // InternalMyDsl.g:3109:1: ( ( rule__ForLoop__StartAssignment_2 ) )
            {
            // InternalMyDsl.g:3109:1: ( ( rule__ForLoop__StartAssignment_2 ) )
            // InternalMyDsl.g:3110:2: ( rule__ForLoop__StartAssignment_2 )
            {
             before(grammarAccess.getForLoopAccess().getStartAssignment_2()); 
            // InternalMyDsl.g:3111:2: ( rule__ForLoop__StartAssignment_2 )
            // InternalMyDsl.g:3111:3: rule__ForLoop__StartAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__StartAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getStartAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__2__Impl"


    // $ANTLR start "rule__ForLoop__Group__3"
    // InternalMyDsl.g:3119:1: rule__ForLoop__Group__3 : rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 ;
    public final void rule__ForLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3123:1: ( rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 )
            // InternalMyDsl.g:3124:2: rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__ForLoop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__3"


    // $ANTLR start "rule__ForLoop__Group__3__Impl"
    // InternalMyDsl.g:3131:1: rule__ForLoop__Group__3__Impl : ( ',' ) ;
    public final void rule__ForLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3135:1: ( ( ',' ) )
            // InternalMyDsl.g:3136:1: ( ',' )
            {
            // InternalMyDsl.g:3136:1: ( ',' )
            // InternalMyDsl.g:3137:2: ','
            {
             before(grammarAccess.getForLoopAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__3__Impl"


    // $ANTLR start "rule__ForLoop__Group__4"
    // InternalMyDsl.g:3146:1: rule__ForLoop__Group__4 : rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 ;
    public final void rule__ForLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3150:1: ( rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 )
            // InternalMyDsl.g:3151:2: rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__ForLoop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__4"


    // $ANTLR start "rule__ForLoop__Group__4__Impl"
    // InternalMyDsl.g:3158:1: rule__ForLoop__Group__4__Impl : ( ( rule__ForLoop__EndAssignment_4 ) ) ;
    public final void rule__ForLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3162:1: ( ( ( rule__ForLoop__EndAssignment_4 ) ) )
            // InternalMyDsl.g:3163:1: ( ( rule__ForLoop__EndAssignment_4 ) )
            {
            // InternalMyDsl.g:3163:1: ( ( rule__ForLoop__EndAssignment_4 ) )
            // InternalMyDsl.g:3164:2: ( rule__ForLoop__EndAssignment_4 )
            {
             before(grammarAccess.getForLoopAccess().getEndAssignment_4()); 
            // InternalMyDsl.g:3165:2: ( rule__ForLoop__EndAssignment_4 )
            // InternalMyDsl.g:3165:3: rule__ForLoop__EndAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__EndAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getEndAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__4__Impl"


    // $ANTLR start "rule__ForLoop__Group__5"
    // InternalMyDsl.g:3173:1: rule__ForLoop__Group__5 : rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 ;
    public final void rule__ForLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3177:1: ( rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 )
            // InternalMyDsl.g:3178:2: rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__ForLoop__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__5"


    // $ANTLR start "rule__ForLoop__Group__5__Impl"
    // InternalMyDsl.g:3185:1: rule__ForLoop__Group__5__Impl : ( ',' ) ;
    public final void rule__ForLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3189:1: ( ( ',' ) )
            // InternalMyDsl.g:3190:1: ( ',' )
            {
            // InternalMyDsl.g:3190:1: ( ',' )
            // InternalMyDsl.g:3191:2: ','
            {
             before(grammarAccess.getForLoopAccess().getCommaKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__5__Impl"


    // $ANTLR start "rule__ForLoop__Group__6"
    // InternalMyDsl.g:3200:1: rule__ForLoop__Group__6 : rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7 ;
    public final void rule__ForLoop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3204:1: ( rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7 )
            // InternalMyDsl.g:3205:2: rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__ForLoop__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__6"


    // $ANTLR start "rule__ForLoop__Group__6__Impl"
    // InternalMyDsl.g:3212:1: rule__ForLoop__Group__6__Impl : ( ( rule__ForLoop__StepAssignment_6 ) ) ;
    public final void rule__ForLoop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3216:1: ( ( ( rule__ForLoop__StepAssignment_6 ) ) )
            // InternalMyDsl.g:3217:1: ( ( rule__ForLoop__StepAssignment_6 ) )
            {
            // InternalMyDsl.g:3217:1: ( ( rule__ForLoop__StepAssignment_6 ) )
            // InternalMyDsl.g:3218:2: ( rule__ForLoop__StepAssignment_6 )
            {
             before(grammarAccess.getForLoopAccess().getStepAssignment_6()); 
            // InternalMyDsl.g:3219:2: ( rule__ForLoop__StepAssignment_6 )
            // InternalMyDsl.g:3219:3: rule__ForLoop__StepAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__StepAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getStepAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__6__Impl"


    // $ANTLR start "rule__ForLoop__Group__7"
    // InternalMyDsl.g:3227:1: rule__ForLoop__Group__7 : rule__ForLoop__Group__7__Impl rule__ForLoop__Group__8 ;
    public final void rule__ForLoop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3231:1: ( rule__ForLoop__Group__7__Impl rule__ForLoop__Group__8 )
            // InternalMyDsl.g:3232:2: rule__ForLoop__Group__7__Impl rule__ForLoop__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__ForLoop__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__7"


    // $ANTLR start "rule__ForLoop__Group__7__Impl"
    // InternalMyDsl.g:3239:1: rule__ForLoop__Group__7__Impl : ( ')' ) ;
    public final void rule__ForLoop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3243:1: ( ( ')' ) )
            // InternalMyDsl.g:3244:1: ( ')' )
            {
            // InternalMyDsl.g:3244:1: ( ')' )
            // InternalMyDsl.g:3245:2: ')'
            {
             before(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__7__Impl"


    // $ANTLR start "rule__ForLoop__Group__8"
    // InternalMyDsl.g:3254:1: rule__ForLoop__Group__8 : rule__ForLoop__Group__8__Impl rule__ForLoop__Group__9 ;
    public final void rule__ForLoop__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3258:1: ( rule__ForLoop__Group__8__Impl rule__ForLoop__Group__9 )
            // InternalMyDsl.g:3259:2: rule__ForLoop__Group__8__Impl rule__ForLoop__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__ForLoop__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__8"


    // $ANTLR start "rule__ForLoop__Group__8__Impl"
    // InternalMyDsl.g:3266:1: rule__ForLoop__Group__8__Impl : ( '{' ) ;
    public final void rule__ForLoop__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3270:1: ( ( '{' ) )
            // InternalMyDsl.g:3271:1: ( '{' )
            {
            // InternalMyDsl.g:3271:1: ( '{' )
            // InternalMyDsl.g:3272:2: '{'
            {
             before(grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getLeftCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__8__Impl"


    // $ANTLR start "rule__ForLoop__Group__9"
    // InternalMyDsl.g:3281:1: rule__ForLoop__Group__9 : rule__ForLoop__Group__9__Impl rule__ForLoop__Group__10 ;
    public final void rule__ForLoop__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3285:1: ( rule__ForLoop__Group__9__Impl rule__ForLoop__Group__10 )
            // InternalMyDsl.g:3286:2: rule__ForLoop__Group__9__Impl rule__ForLoop__Group__10
            {
            pushFollow(FOLLOW_8);
            rule__ForLoop__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__9"


    // $ANTLR start "rule__ForLoop__Group__9__Impl"
    // InternalMyDsl.g:3293:1: rule__ForLoop__Group__9__Impl : ( ( rule__ForLoop__OperationsAssignment_9 )* ) ;
    public final void rule__ForLoop__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3297:1: ( ( ( rule__ForLoop__OperationsAssignment_9 )* ) )
            // InternalMyDsl.g:3298:1: ( ( rule__ForLoop__OperationsAssignment_9 )* )
            {
            // InternalMyDsl.g:3298:1: ( ( rule__ForLoop__OperationsAssignment_9 )* )
            // InternalMyDsl.g:3299:2: ( rule__ForLoop__OperationsAssignment_9 )*
            {
             before(grammarAccess.getForLoopAccess().getOperationsAssignment_9()); 
            // InternalMyDsl.g:3300:2: ( rule__ForLoop__OperationsAssignment_9 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=20 && LA21_0<=22)||(LA21_0>=26 && LA21_0<=29)||LA21_0==31||LA21_0==34||(LA21_0>=37 && LA21_0<=39)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:3300:3: rule__ForLoop__OperationsAssignment_9
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ForLoop__OperationsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getForLoopAccess().getOperationsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__9__Impl"


    // $ANTLR start "rule__ForLoop__Group__10"
    // InternalMyDsl.g:3308:1: rule__ForLoop__Group__10 : rule__ForLoop__Group__10__Impl ;
    public final void rule__ForLoop__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3312:1: ( rule__ForLoop__Group__10__Impl )
            // InternalMyDsl.g:3313:2: rule__ForLoop__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForLoop__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__10"


    // $ANTLR start "rule__ForLoop__Group__10__Impl"
    // InternalMyDsl.g:3319:1: rule__ForLoop__Group__10__Impl : ( '}' ) ;
    public final void rule__ForLoop__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3323:1: ( ( '}' ) )
            // InternalMyDsl.g:3324:1: ( '}' )
            {
            // InternalMyDsl.g:3324:1: ( '}' )
            // InternalMyDsl.g:3325:2: '}'
            {
             before(grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_10()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__10__Impl"


    // $ANTLR start "rule__WhileLoop__Group__0"
    // InternalMyDsl.g:3335:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3339:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalMyDsl.g:3340:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__WhileLoop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__0"


    // $ANTLR start "rule__WhileLoop__Group__0__Impl"
    // InternalMyDsl.g:3347:1: rule__WhileLoop__Group__0__Impl : ( 'While' ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3351:1: ( ( 'While' ) )
            // InternalMyDsl.g:3352:1: ( 'While' )
            {
            // InternalMyDsl.g:3352:1: ( 'While' )
            // InternalMyDsl.g:3353:2: 'While'
            {
             before(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__0__Impl"


    // $ANTLR start "rule__WhileLoop__Group__1"
    // InternalMyDsl.g:3362:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3366:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalMyDsl.g:3367:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__WhileLoop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__1"


    // $ANTLR start "rule__WhileLoop__Group__1__Impl"
    // InternalMyDsl.g:3374:1: rule__WhileLoop__Group__1__Impl : ( '(' ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3378:1: ( ( '(' ) )
            // InternalMyDsl.g:3379:1: ( '(' )
            {
            // InternalMyDsl.g:3379:1: ( '(' )
            // InternalMyDsl.g:3380:2: '('
            {
             before(grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__1__Impl"


    // $ANTLR start "rule__WhileLoop__Group__2"
    // InternalMyDsl.g:3389:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3393:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalMyDsl.g:3394:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__WhileLoop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__2"


    // $ANTLR start "rule__WhileLoop__Group__2__Impl"
    // InternalMyDsl.g:3401:1: rule__WhileLoop__Group__2__Impl : ( ( rule__WhileLoop__CAssignment_2 ) ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3405:1: ( ( ( rule__WhileLoop__CAssignment_2 ) ) )
            // InternalMyDsl.g:3406:1: ( ( rule__WhileLoop__CAssignment_2 ) )
            {
            // InternalMyDsl.g:3406:1: ( ( rule__WhileLoop__CAssignment_2 ) )
            // InternalMyDsl.g:3407:2: ( rule__WhileLoop__CAssignment_2 )
            {
             before(grammarAccess.getWhileLoopAccess().getCAssignment_2()); 
            // InternalMyDsl.g:3408:2: ( rule__WhileLoop__CAssignment_2 )
            // InternalMyDsl.g:3408:3: rule__WhileLoop__CAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__WhileLoop__CAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhileLoopAccess().getCAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__2__Impl"


    // $ANTLR start "rule__WhileLoop__Group__3"
    // InternalMyDsl.g:3416:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3420:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalMyDsl.g:3421:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__WhileLoop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__3"


    // $ANTLR start "rule__WhileLoop__Group__3__Impl"
    // InternalMyDsl.g:3428:1: rule__WhileLoop__Group__3__Impl : ( ( rule__WhileLoop__AddAssignment_3 )* ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3432:1: ( ( ( rule__WhileLoop__AddAssignment_3 )* ) )
            // InternalMyDsl.g:3433:1: ( ( rule__WhileLoop__AddAssignment_3 )* )
            {
            // InternalMyDsl.g:3433:1: ( ( rule__WhileLoop__AddAssignment_3 )* )
            // InternalMyDsl.g:3434:2: ( rule__WhileLoop__AddAssignment_3 )*
            {
             before(grammarAccess.getWhileLoopAccess().getAddAssignment_3()); 
            // InternalMyDsl.g:3435:2: ( rule__WhileLoop__AddAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=13 && LA22_0<=14)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:3435:3: rule__WhileLoop__AddAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__WhileLoop__AddAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getWhileLoopAccess().getAddAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__3__Impl"


    // $ANTLR start "rule__WhileLoop__Group__4"
    // InternalMyDsl.g:3443:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5 ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3447:1: ( rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5 )
            // InternalMyDsl.g:3448:2: rule__WhileLoop__Group__4__Impl rule__WhileLoop__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__WhileLoop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__4"


    // $ANTLR start "rule__WhileLoop__Group__4__Impl"
    // InternalMyDsl.g:3455:1: rule__WhileLoop__Group__4__Impl : ( ')' ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3459:1: ( ( ')' ) )
            // InternalMyDsl.g:3460:1: ( ')' )
            {
            // InternalMyDsl.g:3460:1: ( ')' )
            // InternalMyDsl.g:3461:2: ')'
            {
             before(grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__4__Impl"


    // $ANTLR start "rule__WhileLoop__Group__5"
    // InternalMyDsl.g:3470:1: rule__WhileLoop__Group__5 : rule__WhileLoop__Group__5__Impl rule__WhileLoop__Group__6 ;
    public final void rule__WhileLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3474:1: ( rule__WhileLoop__Group__5__Impl rule__WhileLoop__Group__6 )
            // InternalMyDsl.g:3475:2: rule__WhileLoop__Group__5__Impl rule__WhileLoop__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__WhileLoop__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__5"


    // $ANTLR start "rule__WhileLoop__Group__5__Impl"
    // InternalMyDsl.g:3482:1: rule__WhileLoop__Group__5__Impl : ( '{' ) ;
    public final void rule__WhileLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3486:1: ( ( '{' ) )
            // InternalMyDsl.g:3487:1: ( '{' )
            {
            // InternalMyDsl.g:3487:1: ( '{' )
            // InternalMyDsl.g:3488:2: '{'
            {
             before(grammarAccess.getWhileLoopAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getWhileLoopAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__5__Impl"


    // $ANTLR start "rule__WhileLoop__Group__6"
    // InternalMyDsl.g:3497:1: rule__WhileLoop__Group__6 : rule__WhileLoop__Group__6__Impl rule__WhileLoop__Group__7 ;
    public final void rule__WhileLoop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3501:1: ( rule__WhileLoop__Group__6__Impl rule__WhileLoop__Group__7 )
            // InternalMyDsl.g:3502:2: rule__WhileLoop__Group__6__Impl rule__WhileLoop__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__WhileLoop__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__6"


    // $ANTLR start "rule__WhileLoop__Group__6__Impl"
    // InternalMyDsl.g:3509:1: rule__WhileLoop__Group__6__Impl : ( ( rule__WhileLoop__OperationsAssignment_6 )* ) ;
    public final void rule__WhileLoop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3513:1: ( ( ( rule__WhileLoop__OperationsAssignment_6 )* ) )
            // InternalMyDsl.g:3514:1: ( ( rule__WhileLoop__OperationsAssignment_6 )* )
            {
            // InternalMyDsl.g:3514:1: ( ( rule__WhileLoop__OperationsAssignment_6 )* )
            // InternalMyDsl.g:3515:2: ( rule__WhileLoop__OperationsAssignment_6 )*
            {
             before(grammarAccess.getWhileLoopAccess().getOperationsAssignment_6()); 
            // InternalMyDsl.g:3516:2: ( rule__WhileLoop__OperationsAssignment_6 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=20 && LA23_0<=22)||(LA23_0>=26 && LA23_0<=29)||LA23_0==31||LA23_0==34||(LA23_0>=37 && LA23_0<=39)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:3516:3: rule__WhileLoop__OperationsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__WhileLoop__OperationsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getWhileLoopAccess().getOperationsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__6__Impl"


    // $ANTLR start "rule__WhileLoop__Group__7"
    // InternalMyDsl.g:3524:1: rule__WhileLoop__Group__7 : rule__WhileLoop__Group__7__Impl ;
    public final void rule__WhileLoop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3528:1: ( rule__WhileLoop__Group__7__Impl )
            // InternalMyDsl.g:3529:2: rule__WhileLoop__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhileLoop__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__7"


    // $ANTLR start "rule__WhileLoop__Group__7__Impl"
    // InternalMyDsl.g:3535:1: rule__WhileLoop__Group__7__Impl : ( '}' ) ;
    public final void rule__WhileLoop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3539:1: ( ( '}' ) )
            // InternalMyDsl.g:3540:1: ( '}' )
            {
            // InternalMyDsl.g:3540:1: ( '}' )
            // InternalMyDsl.g:3541:2: '}'
            {
             before(grammarAccess.getWhileLoopAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getWhileLoopAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__7__Impl"


    // $ANTLR start "rule__DoLoop__Group__0"
    // InternalMyDsl.g:3551:1: rule__DoLoop__Group__0 : rule__DoLoop__Group__0__Impl rule__DoLoop__Group__1 ;
    public final void rule__DoLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3555:1: ( rule__DoLoop__Group__0__Impl rule__DoLoop__Group__1 )
            // InternalMyDsl.g:3556:2: rule__DoLoop__Group__0__Impl rule__DoLoop__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__DoLoop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoLoop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoLoop__Group__0"


    // $ANTLR start "rule__DoLoop__Group__0__Impl"
    // InternalMyDsl.g:3563:1: rule__DoLoop__Group__0__Impl : ( 'DoWhile' ) ;
    public final void rule__DoLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3567:1: ( ( 'DoWhile' ) )
            // InternalMyDsl.g:3568:1: ( 'DoWhile' )
            {
            // InternalMyDsl.g:3568:1: ( 'DoWhile' )
            // InternalMyDsl.g:3569:2: 'DoWhile'
            {
             before(grammarAccess.getDoLoopAccess().getDoWhileKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDoLoopAccess().getDoWhileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoLoop__Group__0__Impl"


    // $ANTLR start "rule__DoLoop__Group__1"
    // InternalMyDsl.g:3578:1: rule__DoLoop__Group__1 : rule__DoLoop__Group__1__Impl rule__DoLoop__Group__2 ;
    public final void rule__DoLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3582:1: ( rule__DoLoop__Group__1__Impl rule__DoLoop__Group__2 )
            // InternalMyDsl.g:3583:2: rule__DoLoop__Group__1__Impl rule__DoLoop__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__DoLoop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoLoop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoLoop__Group__1"


    // $ANTLR start "rule__DoLoop__Group__1__Impl"
    // InternalMyDsl.g:3590:1: rule__DoLoop__Group__1__Impl : ( '(' ) ;
    public final void rule__DoLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3594:1: ( ( '(' ) )
            // InternalMyDsl.g:3595:1: ( '(' )
            {
            // InternalMyDsl.g:3595:1: ( '(' )
            // InternalMyDsl.g:3596:2: '('
            {
             before(grammarAccess.getDoLoopAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDoLoopAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoLoop__Group__1__Impl"


    // $ANTLR start "rule__DoLoop__Group__2"
    // InternalMyDsl.g:3605:1: rule__DoLoop__Group__2 : rule__DoLoop__Group__2__Impl rule__DoLoop__Group__3 ;
    public final void rule__DoLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3609:1: ( rule__DoLoop__Group__2__Impl rule__DoLoop__Group__3 )
            // InternalMyDsl.g:3610:2: rule__DoLoop__Group__2__Impl rule__DoLoop__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__DoLoop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoLoop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoLoop__Group__2"


    // $ANTLR start "rule__DoLoop__Group__2__Impl"
    // InternalMyDsl.g:3617:1: rule__DoLoop__Group__2__Impl : ( ( rule__DoLoop__CAssignment_2 ) ) ;
    public final void rule__DoLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3621:1: ( ( ( rule__DoLoop__CAssignment_2 ) ) )
            // InternalMyDsl.g:3622:1: ( ( rule__DoLoop__CAssignment_2 ) )
            {
            // InternalMyDsl.g:3622:1: ( ( rule__DoLoop__CAssignment_2 ) )
            // InternalMyDsl.g:3623:2: ( rule__DoLoop__CAssignment_2 )
            {
             before(grammarAccess.getDoLoopAccess().getCAssignment_2()); 
            // InternalMyDsl.g:3624:2: ( rule__DoLoop__CAssignment_2 )
            // InternalMyDsl.g:3624:3: rule__DoLoop__CAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DoLoop__CAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDoLoopAccess().getCAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoLoop__Group__2__Impl"


    // $ANTLR start "rule__DoLoop__Group__3"
    // InternalMyDsl.g:3632:1: rule__DoLoop__Group__3 : rule__DoLoop__Group__3__Impl rule__DoLoop__Group__4 ;
    public final void rule__DoLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3636:1: ( rule__DoLoop__Group__3__Impl rule__DoLoop__Group__4 )
            // InternalMyDsl.g:3637:2: rule__DoLoop__Group__3__Impl rule__DoLoop__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__DoLoop__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoLoop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoLoop__Group__3"


    // $ANTLR start "rule__DoLoop__Group__3__Impl"
    // InternalMyDsl.g:3644:1: rule__DoLoop__Group__3__Impl : ( ( rule__DoLoop__AddAssignment_3 )* ) ;
    public final void rule__DoLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3648:1: ( ( ( rule__DoLoop__AddAssignment_3 )* ) )
            // InternalMyDsl.g:3649:1: ( ( rule__DoLoop__AddAssignment_3 )* )
            {
            // InternalMyDsl.g:3649:1: ( ( rule__DoLoop__AddAssignment_3 )* )
            // InternalMyDsl.g:3650:2: ( rule__DoLoop__AddAssignment_3 )*
            {
             before(grammarAccess.getDoLoopAccess().getAddAssignment_3()); 
            // InternalMyDsl.g:3651:2: ( rule__DoLoop__AddAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=13 && LA24_0<=14)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:3651:3: rule__DoLoop__AddAssignment_3
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__DoLoop__AddAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getDoLoopAccess().getAddAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoLoop__Group__3__Impl"


    // $ANTLR start "rule__DoLoop__Group__4"
    // InternalMyDsl.g:3659:1: rule__DoLoop__Group__4 : rule__DoLoop__Group__4__Impl rule__DoLoop__Group__5 ;
    public final void rule__DoLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3663:1: ( rule__DoLoop__Group__4__Impl rule__DoLoop__Group__5 )
            // InternalMyDsl.g:3664:2: rule__DoLoop__Group__4__Impl rule__DoLoop__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__DoLoop__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoLoop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoLoop__Group__4"


    // $ANTLR start "rule__DoLoop__Group__4__Impl"
    // InternalMyDsl.g:3671:1: rule__DoLoop__Group__4__Impl : ( ')' ) ;
    public final void rule__DoLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3675:1: ( ( ')' ) )
            // InternalMyDsl.g:3676:1: ( ')' )
            {
            // InternalMyDsl.g:3676:1: ( ')' )
            // InternalMyDsl.g:3677:2: ')'
            {
             before(grammarAccess.getDoLoopAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDoLoopAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoLoop__Group__4__Impl"


    // $ANTLR start "rule__DoLoop__Group__5"
    // InternalMyDsl.g:3686:1: rule__DoLoop__Group__5 : rule__DoLoop__Group__5__Impl rule__DoLoop__Group__6 ;
    public final void rule__DoLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3690:1: ( rule__DoLoop__Group__5__Impl rule__DoLoop__Group__6 )
            // InternalMyDsl.g:3691:2: rule__DoLoop__Group__5__Impl rule__DoLoop__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__DoLoop__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoLoop__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoLoop__Group__5"


    // $ANTLR start "rule__DoLoop__Group__5__Impl"
    // InternalMyDsl.g:3698:1: rule__DoLoop__Group__5__Impl : ( '{' ) ;
    public final void rule__DoLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3702:1: ( ( '{' ) )
            // InternalMyDsl.g:3703:1: ( '{' )
            {
            // InternalMyDsl.g:3703:1: ( '{' )
            // InternalMyDsl.g:3704:2: '{'
            {
             before(grammarAccess.getDoLoopAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDoLoopAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoLoop__Group__5__Impl"


    // $ANTLR start "rule__DoLoop__Group__6"
    // InternalMyDsl.g:3713:1: rule__DoLoop__Group__6 : rule__DoLoop__Group__6__Impl rule__DoLoop__Group__7 ;
    public final void rule__DoLoop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3717:1: ( rule__DoLoop__Group__6__Impl rule__DoLoop__Group__7 )
            // InternalMyDsl.g:3718:2: rule__DoLoop__Group__6__Impl rule__DoLoop__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__DoLoop__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoLoop__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoLoop__Group__6"


    // $ANTLR start "rule__DoLoop__Group__6__Impl"
    // InternalMyDsl.g:3725:1: rule__DoLoop__Group__6__Impl : ( ( rule__DoLoop__OperationsAssignment_6 )* ) ;
    public final void rule__DoLoop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3729:1: ( ( ( rule__DoLoop__OperationsAssignment_6 )* ) )
            // InternalMyDsl.g:3730:1: ( ( rule__DoLoop__OperationsAssignment_6 )* )
            {
            // InternalMyDsl.g:3730:1: ( ( rule__DoLoop__OperationsAssignment_6 )* )
            // InternalMyDsl.g:3731:2: ( rule__DoLoop__OperationsAssignment_6 )*
            {
             before(grammarAccess.getDoLoopAccess().getOperationsAssignment_6()); 
            // InternalMyDsl.g:3732:2: ( rule__DoLoop__OperationsAssignment_6 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=20 && LA25_0<=22)||(LA25_0>=26 && LA25_0<=29)||LA25_0==31||LA25_0==34||(LA25_0>=37 && LA25_0<=39)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:3732:3: rule__DoLoop__OperationsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DoLoop__OperationsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getDoLoopAccess().getOperationsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoLoop__Group__6__Impl"


    // $ANTLR start "rule__DoLoop__Group__7"
    // InternalMyDsl.g:3740:1: rule__DoLoop__Group__7 : rule__DoLoop__Group__7__Impl ;
    public final void rule__DoLoop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3744:1: ( rule__DoLoop__Group__7__Impl )
            // InternalMyDsl.g:3745:2: rule__DoLoop__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoLoop__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoLoop__Group__7"


    // $ANTLR start "rule__DoLoop__Group__7__Impl"
    // InternalMyDsl.g:3751:1: rule__DoLoop__Group__7__Impl : ( '}' ) ;
    public final void rule__DoLoop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3755:1: ( ( '}' ) )
            // InternalMyDsl.g:3756:1: ( '}' )
            {
            // InternalMyDsl.g:3756:1: ( '}' )
            // InternalMyDsl.g:3757:2: '}'
            {
             before(grammarAccess.getDoLoopAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDoLoopAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoLoop__Group__7__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalMyDsl.g:3767:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3771:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalMyDsl.g:3772:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalMyDsl.g:3779:1: rule__Condition__Group__0__Impl : ( 'Condition' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3783:1: ( ( 'Condition' ) )
            // InternalMyDsl.g:3784:1: ( 'Condition' )
            {
            // InternalMyDsl.g:3784:1: ( 'Condition' )
            // InternalMyDsl.g:3785:2: 'Condition'
            {
             before(grammarAccess.getConditionAccess().getConditionKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConditionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalMyDsl.g:3794:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3798:1: ( rule__Condition__Group__1__Impl )
            // InternalMyDsl.g:3799:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalMyDsl.g:3805:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__Alternatives_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3809:1: ( ( ( rule__Condition__Alternatives_1 ) ) )
            // InternalMyDsl.g:3810:1: ( ( rule__Condition__Alternatives_1 ) )
            {
            // InternalMyDsl.g:3810:1: ( ( rule__Condition__Alternatives_1 ) )
            // InternalMyDsl.g:3811:2: ( rule__Condition__Alternatives_1 )
            {
             before(grammarAccess.getConditionAccess().getAlternatives_1()); 
            // InternalMyDsl.g:3812:2: ( rule__Condition__Alternatives_1 )
            // InternalMyDsl.g:3812:3: rule__Condition__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__AddCondition__Group__0"
    // InternalMyDsl.g:3821:1: rule__AddCondition__Group__0 : rule__AddCondition__Group__0__Impl rule__AddCondition__Group__1 ;
    public final void rule__AddCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3825:1: ( rule__AddCondition__Group__0__Impl rule__AddCondition__Group__1 )
            // InternalMyDsl.g:3826:2: rule__AddCondition__Group__0__Impl rule__AddCondition__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__AddCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddCondition__Group__0"


    // $ANTLR start "rule__AddCondition__Group__0__Impl"
    // InternalMyDsl.g:3833:1: rule__AddCondition__Group__0__Impl : ( ( rule__AddCondition__OpAssignment_0 ) ) ;
    public final void rule__AddCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3837:1: ( ( ( rule__AddCondition__OpAssignment_0 ) ) )
            // InternalMyDsl.g:3838:1: ( ( rule__AddCondition__OpAssignment_0 ) )
            {
            // InternalMyDsl.g:3838:1: ( ( rule__AddCondition__OpAssignment_0 ) )
            // InternalMyDsl.g:3839:2: ( rule__AddCondition__OpAssignment_0 )
            {
             before(grammarAccess.getAddConditionAccess().getOpAssignment_0()); 
            // InternalMyDsl.g:3840:2: ( rule__AddCondition__OpAssignment_0 )
            // InternalMyDsl.g:3840:3: rule__AddCondition__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AddCondition__OpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAddConditionAccess().getOpAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddCondition__Group__0__Impl"


    // $ANTLR start "rule__AddCondition__Group__1"
    // InternalMyDsl.g:3848:1: rule__AddCondition__Group__1 : rule__AddCondition__Group__1__Impl ;
    public final void rule__AddCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3852:1: ( rule__AddCondition__Group__1__Impl )
            // InternalMyDsl.g:3853:2: rule__AddCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddCondition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddCondition__Group__1"


    // $ANTLR start "rule__AddCondition__Group__1__Impl"
    // InternalMyDsl.g:3859:1: rule__AddCondition__Group__1__Impl : ( ( rule__AddCondition__CondAssignment_1 ) ) ;
    public final void rule__AddCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3863:1: ( ( ( rule__AddCondition__CondAssignment_1 ) ) )
            // InternalMyDsl.g:3864:1: ( ( rule__AddCondition__CondAssignment_1 ) )
            {
            // InternalMyDsl.g:3864:1: ( ( rule__AddCondition__CondAssignment_1 ) )
            // InternalMyDsl.g:3865:2: ( rule__AddCondition__CondAssignment_1 )
            {
             before(grammarAccess.getAddConditionAccess().getCondAssignment_1()); 
            // InternalMyDsl.g:3866:2: ( rule__AddCondition__CondAssignment_1 )
            // InternalMyDsl.g:3866:3: rule__AddCondition__CondAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AddCondition__CondAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAddConditionAccess().getCondAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddCondition__Group__1__Impl"


    // $ANTLR start "rule__Elements__Group__0"
    // InternalMyDsl.g:3875:1: rule__Elements__Group__0 : rule__Elements__Group__0__Impl rule__Elements__Group__1 ;
    public final void rule__Elements__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3879:1: ( rule__Elements__Group__0__Impl rule__Elements__Group__1 )
            // InternalMyDsl.g:3880:2: rule__Elements__Group__0__Impl rule__Elements__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Elements__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Elements__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elements__Group__0"


    // $ANTLR start "rule__Elements__Group__0__Impl"
    // InternalMyDsl.g:3887:1: rule__Elements__Group__0__Impl : ( 'Elements' ) ;
    public final void rule__Elements__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3891:1: ( ( 'Elements' ) )
            // InternalMyDsl.g:3892:1: ( 'Elements' )
            {
            // InternalMyDsl.g:3892:1: ( 'Elements' )
            // InternalMyDsl.g:3893:2: 'Elements'
            {
             before(grammarAccess.getElementsAccess().getElementsKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getElementsAccess().getElementsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elements__Group__0__Impl"


    // $ANTLR start "rule__Elements__Group__1"
    // InternalMyDsl.g:3902:1: rule__Elements__Group__1 : rule__Elements__Group__1__Impl ;
    public final void rule__Elements__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3906:1: ( rule__Elements__Group__1__Impl )
            // InternalMyDsl.g:3907:2: rule__Elements__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Elements__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elements__Group__1"


    // $ANTLR start "rule__Elements__Group__1__Impl"
    // InternalMyDsl.g:3913:1: rule__Elements__Group__1__Impl : ( ( rule__Elements__TypeAssignment_1 ) ) ;
    public final void rule__Elements__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3917:1: ( ( ( rule__Elements__TypeAssignment_1 ) ) )
            // InternalMyDsl.g:3918:1: ( ( rule__Elements__TypeAssignment_1 ) )
            {
            // InternalMyDsl.g:3918:1: ( ( rule__Elements__TypeAssignment_1 ) )
            // InternalMyDsl.g:3919:2: ( rule__Elements__TypeAssignment_1 )
            {
             before(grammarAccess.getElementsAccess().getTypeAssignment_1()); 
            // InternalMyDsl.g:3920:2: ( rule__Elements__TypeAssignment_1 )
            // InternalMyDsl.g:3920:3: rule__Elements__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Elements__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElementsAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elements__Group__1__Impl"


    // $ANTLR start "rule__Element__Group__0"
    // InternalMyDsl.g:3929:1: rule__Element__Group__0 : rule__Element__Group__0__Impl rule__Element__Group__1 ;
    public final void rule__Element__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3933:1: ( rule__Element__Group__0__Impl rule__Element__Group__1 )
            // InternalMyDsl.g:3934:2: rule__Element__Group__0__Impl rule__Element__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__Element__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Element__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__0"


    // $ANTLR start "rule__Element__Group__0__Impl"
    // InternalMyDsl.g:3941:1: rule__Element__Group__0__Impl : ( 'Element' ) ;
    public final void rule__Element__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3945:1: ( ( 'Element' ) )
            // InternalMyDsl.g:3946:1: ( 'Element' )
            {
            // InternalMyDsl.g:3946:1: ( 'Element' )
            // InternalMyDsl.g:3947:2: 'Element'
            {
             before(grammarAccess.getElementAccess().getElementKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getElementAccess().getElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__0__Impl"


    // $ANTLR start "rule__Element__Group__1"
    // InternalMyDsl.g:3956:1: rule__Element__Group__1 : rule__Element__Group__1__Impl ;
    public final void rule__Element__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3960:1: ( rule__Element__Group__1__Impl )
            // InternalMyDsl.g:3961:2: rule__Element__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Element__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__1"


    // $ANTLR start "rule__Element__Group__1__Impl"
    // InternalMyDsl.g:3967:1: rule__Element__Group__1__Impl : ( ( rule__Element__TypeAssignment_1 ) ) ;
    public final void rule__Element__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3971:1: ( ( ( rule__Element__TypeAssignment_1 ) ) )
            // InternalMyDsl.g:3972:1: ( ( rule__Element__TypeAssignment_1 ) )
            {
            // InternalMyDsl.g:3972:1: ( ( rule__Element__TypeAssignment_1 ) )
            // InternalMyDsl.g:3973:2: ( rule__Element__TypeAssignment_1 )
            {
             before(grammarAccess.getElementAccess().getTypeAssignment_1()); 
            // InternalMyDsl.g:3974:2: ( rule__Element__TypeAssignment_1 )
            // InternalMyDsl.g:3974:3: rule__Element__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Element__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Group__1__Impl"


    // $ANTLR start "rule__Tag__Group__0"
    // InternalMyDsl.g:3983:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3987:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // InternalMyDsl.g:3988:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Tag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__0"


    // $ANTLR start "rule__Tag__Group__0__Impl"
    // InternalMyDsl.g:3995:1: rule__Tag__Group__0__Impl : ( '{' ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3999:1: ( ( '{' ) )
            // InternalMyDsl.g:4000:1: ( '{' )
            {
            // InternalMyDsl.g:4000:1: ( '{' )
            // InternalMyDsl.g:4001:2: '{'
            {
             before(grammarAccess.getTagAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__0__Impl"


    // $ANTLR start "rule__Tag__Group__1"
    // InternalMyDsl.g:4010:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl rule__Tag__Group__2 ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4014:1: ( rule__Tag__Group__1__Impl rule__Tag__Group__2 )
            // InternalMyDsl.g:4015:2: rule__Tag__Group__1__Impl rule__Tag__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Tag__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__1"


    // $ANTLR start "rule__Tag__Group__1__Impl"
    // InternalMyDsl.g:4022:1: rule__Tag__Group__1__Impl : ( ( rule__Tag__HtmlAssignment_1 ) ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4026:1: ( ( ( rule__Tag__HtmlAssignment_1 ) ) )
            // InternalMyDsl.g:4027:1: ( ( rule__Tag__HtmlAssignment_1 ) )
            {
            // InternalMyDsl.g:4027:1: ( ( rule__Tag__HtmlAssignment_1 ) )
            // InternalMyDsl.g:4028:2: ( rule__Tag__HtmlAssignment_1 )
            {
             before(grammarAccess.getTagAccess().getHtmlAssignment_1()); 
            // InternalMyDsl.g:4029:2: ( rule__Tag__HtmlAssignment_1 )
            // InternalMyDsl.g:4029:3: rule__Tag__HtmlAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tag__HtmlAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getHtmlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__1__Impl"


    // $ANTLR start "rule__Tag__Group__2"
    // InternalMyDsl.g:4037:1: rule__Tag__Group__2 : rule__Tag__Group__2__Impl rule__Tag__Group__3 ;
    public final void rule__Tag__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4041:1: ( rule__Tag__Group__2__Impl rule__Tag__Group__3 )
            // InternalMyDsl.g:4042:2: rule__Tag__Group__2__Impl rule__Tag__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Tag__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__2"


    // $ANTLR start "rule__Tag__Group__2__Impl"
    // InternalMyDsl.g:4049:1: rule__Tag__Group__2__Impl : ( ( rule__Tag__TagAssignment_2 ) ) ;
    public final void rule__Tag__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4053:1: ( ( ( rule__Tag__TagAssignment_2 ) ) )
            // InternalMyDsl.g:4054:1: ( ( rule__Tag__TagAssignment_2 ) )
            {
            // InternalMyDsl.g:4054:1: ( ( rule__Tag__TagAssignment_2 ) )
            // InternalMyDsl.g:4055:2: ( rule__Tag__TagAssignment_2 )
            {
             before(grammarAccess.getTagAccess().getTagAssignment_2()); 
            // InternalMyDsl.g:4056:2: ( rule__Tag__TagAssignment_2 )
            // InternalMyDsl.g:4056:3: rule__Tag__TagAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Tag__TagAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getTagAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__2__Impl"


    // $ANTLR start "rule__Tag__Group__3"
    // InternalMyDsl.g:4064:1: rule__Tag__Group__3 : rule__Tag__Group__3__Impl ;
    public final void rule__Tag__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4068:1: ( rule__Tag__Group__3__Impl )
            // InternalMyDsl.g:4069:2: rule__Tag__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__3"


    // $ANTLR start "rule__Tag__Group__3__Impl"
    // InternalMyDsl.g:4075:1: rule__Tag__Group__3__Impl : ( '}' ) ;
    public final void rule__Tag__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4079:1: ( ( '}' ) )
            // InternalMyDsl.g:4080:1: ( '}' )
            {
            // InternalMyDsl.g:4080:1: ( '}' )
            // InternalMyDsl.g:4081:2: '}'
            {
             before(grammarAccess.getTagAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__3__Impl"


    // $ANTLR start "rule__SimpleOp__Group__0"
    // InternalMyDsl.g:4091:1: rule__SimpleOp__Group__0 : rule__SimpleOp__Group__0__Impl rule__SimpleOp__Group__1 ;
    public final void rule__SimpleOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4095:1: ( rule__SimpleOp__Group__0__Impl rule__SimpleOp__Group__1 )
            // InternalMyDsl.g:4096:2: rule__SimpleOp__Group__0__Impl rule__SimpleOp__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__SimpleOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleOp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOp__Group__0"


    // $ANTLR start "rule__SimpleOp__Group__0__Impl"
    // InternalMyDsl.g:4103:1: rule__SimpleOp__Group__0__Impl : ( '(' ) ;
    public final void rule__SimpleOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4107:1: ( ( '(' ) )
            // InternalMyDsl.g:4108:1: ( '(' )
            {
            // InternalMyDsl.g:4108:1: ( '(' )
            // InternalMyDsl.g:4109:2: '('
            {
             before(grammarAccess.getSimpleOpAccess().getLeftParenthesisKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSimpleOpAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOp__Group__0__Impl"


    // $ANTLR start "rule__SimpleOp__Group__1"
    // InternalMyDsl.g:4118:1: rule__SimpleOp__Group__1 : rule__SimpleOp__Group__1__Impl rule__SimpleOp__Group__2 ;
    public final void rule__SimpleOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4122:1: ( rule__SimpleOp__Group__1__Impl rule__SimpleOp__Group__2 )
            // InternalMyDsl.g:4123:2: rule__SimpleOp__Group__1__Impl rule__SimpleOp__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__SimpleOp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleOp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOp__Group__1"


    // $ANTLR start "rule__SimpleOp__Group__1__Impl"
    // InternalMyDsl.g:4130:1: rule__SimpleOp__Group__1__Impl : ( ( rule__SimpleOp__Elt1Assignment_1 ) ) ;
    public final void rule__SimpleOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4134:1: ( ( ( rule__SimpleOp__Elt1Assignment_1 ) ) )
            // InternalMyDsl.g:4135:1: ( ( rule__SimpleOp__Elt1Assignment_1 ) )
            {
            // InternalMyDsl.g:4135:1: ( ( rule__SimpleOp__Elt1Assignment_1 ) )
            // InternalMyDsl.g:4136:2: ( rule__SimpleOp__Elt1Assignment_1 )
            {
             before(grammarAccess.getSimpleOpAccess().getElt1Assignment_1()); 
            // InternalMyDsl.g:4137:2: ( rule__SimpleOp__Elt1Assignment_1 )
            // InternalMyDsl.g:4137:3: rule__SimpleOp__Elt1Assignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleOp__Elt1Assignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleOpAccess().getElt1Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOp__Group__1__Impl"


    // $ANTLR start "rule__SimpleOp__Group__2"
    // InternalMyDsl.g:4145:1: rule__SimpleOp__Group__2 : rule__SimpleOp__Group__2__Impl rule__SimpleOp__Group__3 ;
    public final void rule__SimpleOp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4149:1: ( rule__SimpleOp__Group__2__Impl rule__SimpleOp__Group__3 )
            // InternalMyDsl.g:4150:2: rule__SimpleOp__Group__2__Impl rule__SimpleOp__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__SimpleOp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleOp__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOp__Group__2"


    // $ANTLR start "rule__SimpleOp__Group__2__Impl"
    // InternalMyDsl.g:4157:1: rule__SimpleOp__Group__2__Impl : ( ( rule__SimpleOp__OpAssignment_2 ) ) ;
    public final void rule__SimpleOp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4161:1: ( ( ( rule__SimpleOp__OpAssignment_2 ) ) )
            // InternalMyDsl.g:4162:1: ( ( rule__SimpleOp__OpAssignment_2 ) )
            {
            // InternalMyDsl.g:4162:1: ( ( rule__SimpleOp__OpAssignment_2 ) )
            // InternalMyDsl.g:4163:2: ( rule__SimpleOp__OpAssignment_2 )
            {
             before(grammarAccess.getSimpleOpAccess().getOpAssignment_2()); 
            // InternalMyDsl.g:4164:2: ( rule__SimpleOp__OpAssignment_2 )
            // InternalMyDsl.g:4164:3: rule__SimpleOp__OpAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SimpleOp__OpAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimpleOpAccess().getOpAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOp__Group__2__Impl"


    // $ANTLR start "rule__SimpleOp__Group__3"
    // InternalMyDsl.g:4172:1: rule__SimpleOp__Group__3 : rule__SimpleOp__Group__3__Impl rule__SimpleOp__Group__4 ;
    public final void rule__SimpleOp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4176:1: ( rule__SimpleOp__Group__3__Impl rule__SimpleOp__Group__4 )
            // InternalMyDsl.g:4177:2: rule__SimpleOp__Group__3__Impl rule__SimpleOp__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__SimpleOp__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleOp__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOp__Group__3"


    // $ANTLR start "rule__SimpleOp__Group__3__Impl"
    // InternalMyDsl.g:4184:1: rule__SimpleOp__Group__3__Impl : ( ( rule__SimpleOp__Elt2Assignment_3 ) ) ;
    public final void rule__SimpleOp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4188:1: ( ( ( rule__SimpleOp__Elt2Assignment_3 ) ) )
            // InternalMyDsl.g:4189:1: ( ( rule__SimpleOp__Elt2Assignment_3 ) )
            {
            // InternalMyDsl.g:4189:1: ( ( rule__SimpleOp__Elt2Assignment_3 ) )
            // InternalMyDsl.g:4190:2: ( rule__SimpleOp__Elt2Assignment_3 )
            {
             before(grammarAccess.getSimpleOpAccess().getElt2Assignment_3()); 
            // InternalMyDsl.g:4191:2: ( rule__SimpleOp__Elt2Assignment_3 )
            // InternalMyDsl.g:4191:3: rule__SimpleOp__Elt2Assignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SimpleOp__Elt2Assignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSimpleOpAccess().getElt2Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOp__Group__3__Impl"


    // $ANTLR start "rule__SimpleOp__Group__4"
    // InternalMyDsl.g:4199:1: rule__SimpleOp__Group__4 : rule__SimpleOp__Group__4__Impl ;
    public final void rule__SimpleOp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4203:1: ( rule__SimpleOp__Group__4__Impl )
            // InternalMyDsl.g:4204:2: rule__SimpleOp__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleOp__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOp__Group__4"


    // $ANTLR start "rule__SimpleOp__Group__4__Impl"
    // InternalMyDsl.g:4210:1: rule__SimpleOp__Group__4__Impl : ( ')' ) ;
    public final void rule__SimpleOp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4214:1: ( ( ')' ) )
            // InternalMyDsl.g:4215:1: ( ')' )
            {
            // InternalMyDsl.g:4215:1: ( ')' )
            // InternalMyDsl.g:4216:2: ')'
            {
             before(grammarAccess.getSimpleOpAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSimpleOpAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOp__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalMyDsl.g:4226:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4230:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMyDsl.g:4231:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalMyDsl.g:4238:1: rule__Variable__Group__0__Impl : ( 'Var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4242:1: ( ( 'Var' ) )
            // InternalMyDsl.g:4243:1: ( 'Var' )
            {
            // InternalMyDsl.g:4243:1: ( 'Var' )
            // InternalMyDsl.g:4244:2: 'Var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalMyDsl.g:4253:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4257:1: ( rule__Variable__Group__1__Impl )
            // InternalMyDsl.g:4258:2: rule__Variable__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalMyDsl.g:4264:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4268:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalMyDsl.g:4269:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:4269:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalMyDsl.g:4270:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:4271:2: ( rule__Variable__NameAssignment_1 )
            // InternalMyDsl.g:4271:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Program__FuncAssignment_0"
    // InternalMyDsl.g:4280:1: rule__Program__FuncAssignment_0 : ( ruleFunction ) ;
    public final void rule__Program__FuncAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4284:1: ( ( ruleFunction ) )
            // InternalMyDsl.g:4285:2: ( ruleFunction )
            {
            // InternalMyDsl.g:4285:2: ( ruleFunction )
            // InternalMyDsl.g:4286:3: ruleFunction
            {
             before(grammarAccess.getProgramAccess().getFuncFunctionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFunction();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getFuncFunctionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__FuncAssignment_0"


    // $ANTLR start "rule__Program__BAssignment_1"
    // InternalMyDsl.g:4295:1: rule__Program__BAssignment_1 : ( ruleBrowser_Task ) ;
    public final void rule__Program__BAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4299:1: ( ( ruleBrowser_Task ) )
            // InternalMyDsl.g:4300:2: ( ruleBrowser_Task )
            {
            // InternalMyDsl.g:4300:2: ( ruleBrowser_Task )
            // InternalMyDsl.g:4301:3: ruleBrowser_Task
            {
             before(grammarAccess.getProgramAccess().getBBrowser_TaskParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBrowser_Task();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getBBrowser_TaskParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__BAssignment_1"


    // $ANTLR start "rule__Browser_Task__NameAssignment_3"
    // InternalMyDsl.g:4310:1: rule__Browser_Task__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Browser_Task__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4314:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4315:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4315:2: ( RULE_STRING )
            // InternalMyDsl.g:4316:3: RULE_STRING
            {
             before(grammarAccess.getBrowser_TaskAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBrowser_TaskAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Browser_Task__NameAssignment_3"


    // $ANTLR start "rule__Browser_Task__OperationsAssignment_4"
    // InternalMyDsl.g:4325:1: rule__Browser_Task__OperationsAssignment_4 : ( ruleOperation ) ;
    public final void rule__Browser_Task__OperationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4329:1: ( ( ruleOperation ) )
            // InternalMyDsl.g:4330:2: ( ruleOperation )
            {
            // InternalMyDsl.g:4330:2: ( ruleOperation )
            // InternalMyDsl.g:4331:3: ruleOperation
            {
             before(grammarAccess.getBrowser_TaskAccess().getOperationsOperationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getBrowser_TaskAccess().getOperationsOperationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Browser_Task__OperationsAssignment_4"


    // $ANTLR start "rule__Click__EltAssignment_1"
    // InternalMyDsl.g:4340:1: rule__Click__EltAssignment_1 : ( ruleElement ) ;
    public final void rule__Click__EltAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4344:1: ( ( ruleElement ) )
            // InternalMyDsl.g:4345:2: ( ruleElement )
            {
            // InternalMyDsl.g:4345:2: ( ruleElement )
            // InternalMyDsl.g:4346:3: ruleElement
            {
             before(grammarAccess.getClickAccess().getEltElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getClickAccess().getEltElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__EltAssignment_1"


    // $ANTLR start "rule__Go__LinkAssignment_1"
    // InternalMyDsl.g:4355:1: rule__Go__LinkAssignment_1 : ( ruleText ) ;
    public final void rule__Go__LinkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4359:1: ( ( ruleText ) )
            // InternalMyDsl.g:4360:2: ( ruleText )
            {
            // InternalMyDsl.g:4360:2: ( ruleText )
            // InternalMyDsl.g:4361:3: ruleText
            {
             before(grammarAccess.getGoAccess().getLinkTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getGoAccess().getLinkTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Go__LinkAssignment_1"


    // $ANTLR start "rule__Fill__EltAssignment_2"
    // InternalMyDsl.g:4370:1: rule__Fill__EltAssignment_2 : ( ruleElement ) ;
    public final void rule__Fill__EltAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4374:1: ( ( ruleElement ) )
            // InternalMyDsl.g:4375:2: ( ruleElement )
            {
            // InternalMyDsl.g:4375:2: ( ruleElement )
            // InternalMyDsl.g:4376:3: ruleElement
            {
             before(grammarAccess.getFillAccess().getEltElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getFillAccess().getEltElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__EltAssignment_2"


    // $ANTLR start "rule__Fill__FillwithAssignment_4"
    // InternalMyDsl.g:4385:1: rule__Fill__FillwithAssignment_4 : ( ruleText ) ;
    public final void rule__Fill__FillwithAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4389:1: ( ( ruleText ) )
            // InternalMyDsl.g:4390:2: ( ruleText )
            {
            // InternalMyDsl.g:4390:2: ( ruleText )
            // InternalMyDsl.g:4391:3: ruleText
            {
             before(grammarAccess.getFillAccess().getFillwithTextParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getFillAccess().getFillwithTextParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fill__FillwithAssignment_4"


    // $ANTLR start "rule__Select__EltAssignment_1"
    // InternalMyDsl.g:4400:1: rule__Select__EltAssignment_1 : ( ruleElement ) ;
    public final void rule__Select__EltAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4404:1: ( ( ruleElement ) )
            // InternalMyDsl.g:4405:2: ( ruleElement )
            {
            // InternalMyDsl.g:4405:2: ( ruleElement )
            // InternalMyDsl.g:4406:3: ruleElement
            {
             before(grammarAccess.getSelectAccess().getEltElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getEltElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__EltAssignment_1"


    // $ANTLR start "rule__Verify__EltAssignment_2"
    // InternalMyDsl.g:4415:1: rule__Verify__EltAssignment_2 : ( ruleElement ) ;
    public final void rule__Verify__EltAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4419:1: ( ( ruleElement ) )
            // InternalMyDsl.g:4420:2: ( ruleElement )
            {
            // InternalMyDsl.g:4420:2: ( ruleElement )
            // InternalMyDsl.g:4421:3: ruleElement
            {
             before(grammarAccess.getVerifyAccess().getEltElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getVerifyAccess().getEltElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__EltAssignment_2"


    // $ANTLR start "rule__Verify__FindAssignment_4"
    // InternalMyDsl.g:4430:1: rule__Verify__FindAssignment_4 : ( ruleText ) ;
    public final void rule__Verify__FindAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4434:1: ( ( ruleText ) )
            // InternalMyDsl.g:4435:2: ( ruleText )
            {
            // InternalMyDsl.g:4435:2: ( ruleText )
            // InternalMyDsl.g:4436:3: ruleText
            {
             before(grammarAccess.getVerifyAccess().getFindTextParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getVerifyAccess().getFindTextParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Verify__FindAssignment_4"


    // $ANTLR start "rule__Apply_All__EltAssignment_2"
    // InternalMyDsl.g:4445:1: rule__Apply_All__EltAssignment_2 : ( ruleElements ) ;
    public final void rule__Apply_All__EltAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4449:1: ( ( ruleElements ) )
            // InternalMyDsl.g:4450:2: ( ruleElements )
            {
            // InternalMyDsl.g:4450:2: ( ruleElements )
            // InternalMyDsl.g:4451:3: ruleElements
            {
             before(grammarAccess.getApply_AllAccess().getEltElementsParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElements();

            state._fsp--;

             after(grammarAccess.getApply_AllAccess().getEltElementsParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply_All__EltAssignment_2"


    // $ANTLR start "rule__Apply_All__ActionsAssignment_4"
    // InternalMyDsl.g:4460:1: rule__Apply_All__ActionsAssignment_4 : ( ruleAction ) ;
    public final void rule__Apply_All__ActionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4464:1: ( ( ruleAction ) )
            // InternalMyDsl.g:4465:2: ( ruleAction )
            {
            // InternalMyDsl.g:4465:2: ( ruleAction )
            // InternalMyDsl.g:4466:3: ruleAction
            {
             before(grammarAccess.getApply_AllAccess().getActionsActionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getApply_AllAccess().getActionsActionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Apply_All__ActionsAssignment_4"


    // $ANTLR start "rule__If__CondAssignment_2"
    // InternalMyDsl.g:4475:1: rule__If__CondAssignment_2 : ( ruleCondition ) ;
    public final void rule__If__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4479:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:4480:2: ( ruleCondition )
            {
            // InternalMyDsl.g:4480:2: ( ruleCondition )
            // InternalMyDsl.g:4481:3: ruleCondition
            {
             before(grammarAccess.getIfAccess().getCondConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getIfAccess().getCondConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__CondAssignment_2"


    // $ANTLR start "rule__If__AddAssignment_3"
    // InternalMyDsl.g:4490:1: rule__If__AddAssignment_3 : ( ruleAddCondition ) ;
    public final void rule__If__AddAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4494:1: ( ( ruleAddCondition ) )
            // InternalMyDsl.g:4495:2: ( ruleAddCondition )
            {
            // InternalMyDsl.g:4495:2: ( ruleAddCondition )
            // InternalMyDsl.g:4496:3: ruleAddCondition
            {
             before(grammarAccess.getIfAccess().getAddAddConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAddCondition();

            state._fsp--;

             after(grammarAccess.getIfAccess().getAddAddConditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__AddAssignment_3"


    // $ANTLR start "rule__If__OperationsAssignment_6"
    // InternalMyDsl.g:4505:1: rule__If__OperationsAssignment_6 : ( ruleOperation ) ;
    public final void rule__If__OperationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4509:1: ( ( ruleOperation ) )
            // InternalMyDsl.g:4510:2: ( ruleOperation )
            {
            // InternalMyDsl.g:4510:2: ( ruleOperation )
            // InternalMyDsl.g:4511:3: ruleOperation
            {
             before(grammarAccess.getIfAccess().getOperationsOperationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getIfAccess().getOperationsOperationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__OperationsAssignment_6"


    // $ANTLR start "rule__If__OperationsbisAssignment_8_2"
    // InternalMyDsl.g:4520:1: rule__If__OperationsbisAssignment_8_2 : ( ruleOperation ) ;
    public final void rule__If__OperationsbisAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4524:1: ( ( ruleOperation ) )
            // InternalMyDsl.g:4525:2: ( ruleOperation )
            {
            // InternalMyDsl.g:4525:2: ( ruleOperation )
            // InternalMyDsl.g:4526:3: ruleOperation
            {
             before(grammarAccess.getIfAccess().getOperationsbisOperationParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getIfAccess().getOperationsbisOperationParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__OperationsbisAssignment_8_2"


    // $ANTLR start "rule__Store__VariAssignment_2"
    // InternalMyDsl.g:4535:1: rule__Store__VariAssignment_2 : ( RULE_ID ) ;
    public final void rule__Store__VariAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4539:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4540:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4540:2: ( RULE_ID )
            // InternalMyDsl.g:4541:3: RULE_ID
            {
             before(grammarAccess.getStoreAccess().getVariIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStoreAccess().getVariIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__VariAssignment_2"


    // $ANTLR start "rule__Store__TAssignment_4"
    // InternalMyDsl.g:4550:1: rule__Store__TAssignment_4 : ( ruleType ) ;
    public final void rule__Store__TAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4554:1: ( ( ruleType ) )
            // InternalMyDsl.g:4555:2: ( ruleType )
            {
            // InternalMyDsl.g:4555:2: ( ruleType )
            // InternalMyDsl.g:4556:3: ruleType
            {
             before(grammarAccess.getStoreAccess().getTTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getStoreAccess().getTTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Store__TAssignment_4"


    // $ANTLR start "rule__CallFunction__NameAssignment_2"
    // InternalMyDsl.g:4565:1: rule__CallFunction__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__CallFunction__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4569:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4570:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4570:2: ( RULE_STRING )
            // InternalMyDsl.g:4571:3: RULE_STRING
            {
             before(grammarAccess.getCallFunctionAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCallFunctionAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallFunction__NameAssignment_2"


    // $ANTLR start "rule__CallFunction__VarsAssignment_4"
    // InternalMyDsl.g:4580:1: rule__CallFunction__VarsAssignment_4 : ( ruleVariable ) ;
    public final void rule__CallFunction__VarsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4584:1: ( ( ruleVariable ) )
            // InternalMyDsl.g:4585:2: ( ruleVariable )
            {
            // InternalMyDsl.g:4585:2: ( ruleVariable )
            // InternalMyDsl.g:4586:3: ruleVariable
            {
             before(grammarAccess.getCallFunctionAccess().getVarsVariableParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getCallFunctionAccess().getVarsVariableParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallFunction__VarsAssignment_4"


    // $ANTLR start "rule__Type__TextAssignment_0"
    // InternalMyDsl.g:4595:1: rule__Type__TextAssignment_0 : ( ruleText ) ;
    public final void rule__Type__TextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4599:1: ( ( ruleText ) )
            // InternalMyDsl.g:4600:2: ( ruleText )
            {
            // InternalMyDsl.g:4600:2: ( ruleText )
            // InternalMyDsl.g:4601:3: ruleText
            {
             before(grammarAccess.getTypeAccess().getTextTextParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getTextTextParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__TextAssignment_0"


    // $ANTLR start "rule__Type__EltsAssignment_1"
    // InternalMyDsl.g:4610:1: rule__Type__EltsAssignment_1 : ( ruleElements ) ;
    public final void rule__Type__EltsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4614:1: ( ( ruleElements ) )
            // InternalMyDsl.g:4615:2: ( ruleElements )
            {
            // InternalMyDsl.g:4615:2: ( ruleElements )
            // InternalMyDsl.g:4616:3: ruleElements
            {
             before(grammarAccess.getTypeAccess().getEltsElementsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElements();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getEltsElementsParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__EltsAssignment_1"


    // $ANTLR start "rule__Type__EltAssignment_2"
    // InternalMyDsl.g:4625:1: rule__Type__EltAssignment_2 : ( ruleElement ) ;
    public final void rule__Type__EltAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4629:1: ( ( ruleElement ) )
            // InternalMyDsl.g:4630:2: ( ruleElement )
            {
            // InternalMyDsl.g:4630:2: ( ruleElement )
            // InternalMyDsl.g:4631:3: ruleElement
            {
             before(grammarAccess.getTypeAccess().getEltElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getEltElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__EltAssignment_2"


    // $ANTLR start "rule__Type__CondAssignment_3"
    // InternalMyDsl.g:4640:1: rule__Type__CondAssignment_3 : ( ruleCondition ) ;
    public final void rule__Type__CondAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4644:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:4645:2: ( ruleCondition )
            {
            // InternalMyDsl.g:4645:2: ( ruleCondition )
            // InternalMyDsl.g:4646:3: ruleCondition
            {
             before(grammarAccess.getTypeAccess().getCondConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getTypeAccess().getCondConditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__CondAssignment_3"


    // $ANTLR start "rule__StringType__TextAssignment_0"
    // InternalMyDsl.g:4655:1: rule__StringType__TextAssignment_0 : ( ( 'Text' ) ) ;
    public final void rule__StringType__TextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4659:1: ( ( ( 'Text' ) ) )
            // InternalMyDsl.g:4660:2: ( ( 'Text' ) )
            {
            // InternalMyDsl.g:4660:2: ( ( 'Text' ) )
            // InternalMyDsl.g:4661:3: ( 'Text' )
            {
             before(grammarAccess.getStringTypeAccess().getTextTextKeyword_0_0()); 
            // InternalMyDsl.g:4662:3: ( 'Text' )
            // InternalMyDsl.g:4663:4: 'Text'
            {
             before(grammarAccess.getStringTypeAccess().getTextTextKeyword_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getTextTextKeyword_0_0()); 

            }

             after(grammarAccess.getStringTypeAccess().getTextTextKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__TextAssignment_0"


    // $ANTLR start "rule__StringType__EltsAssignment_1"
    // InternalMyDsl.g:4674:1: rule__StringType__EltsAssignment_1 : ( ( 'Elements' ) ) ;
    public final void rule__StringType__EltsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4678:1: ( ( ( 'Elements' ) ) )
            // InternalMyDsl.g:4679:2: ( ( 'Elements' ) )
            {
            // InternalMyDsl.g:4679:2: ( ( 'Elements' ) )
            // InternalMyDsl.g:4680:3: ( 'Elements' )
            {
             before(grammarAccess.getStringTypeAccess().getEltsElementsKeyword_1_0()); 
            // InternalMyDsl.g:4681:3: ( 'Elements' )
            // InternalMyDsl.g:4682:4: 'Elements'
            {
             before(grammarAccess.getStringTypeAccess().getEltsElementsKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getEltsElementsKeyword_1_0()); 

            }

             after(grammarAccess.getStringTypeAccess().getEltsElementsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__EltsAssignment_1"


    // $ANTLR start "rule__StringType__EltAssignment_2"
    // InternalMyDsl.g:4693:1: rule__StringType__EltAssignment_2 : ( ( 'Element' ) ) ;
    public final void rule__StringType__EltAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4697:1: ( ( ( 'Element' ) ) )
            // InternalMyDsl.g:4698:2: ( ( 'Element' ) )
            {
            // InternalMyDsl.g:4698:2: ( ( 'Element' ) )
            // InternalMyDsl.g:4699:3: ( 'Element' )
            {
             before(grammarAccess.getStringTypeAccess().getEltElementKeyword_2_0()); 
            // InternalMyDsl.g:4700:3: ( 'Element' )
            // InternalMyDsl.g:4701:4: 'Element'
            {
             before(grammarAccess.getStringTypeAccess().getEltElementKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getEltElementKeyword_2_0()); 

            }

             after(grammarAccess.getStringTypeAccess().getEltElementKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__EltAssignment_2"


    // $ANTLR start "rule__StringType__CondAssignment_3"
    // InternalMyDsl.g:4712:1: rule__StringType__CondAssignment_3 : ( ( 'Condition' ) ) ;
    public final void rule__StringType__CondAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4716:1: ( ( ( 'Condition' ) ) )
            // InternalMyDsl.g:4717:2: ( ( 'Condition' ) )
            {
            // InternalMyDsl.g:4717:2: ( ( 'Condition' ) )
            // InternalMyDsl.g:4718:3: ( 'Condition' )
            {
             before(grammarAccess.getStringTypeAccess().getCondConditionKeyword_3_0()); 
            // InternalMyDsl.g:4719:3: ( 'Condition' )
            // InternalMyDsl.g:4720:4: 'Condition'
            {
             before(grammarAccess.getStringTypeAccess().getCondConditionKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getCondConditionKeyword_3_0()); 

            }

             after(grammarAccess.getStringTypeAccess().getCondConditionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__CondAssignment_3"


    // $ANTLR start "rule__FuncVar__TypeAssignment_0"
    // InternalMyDsl.g:4731:1: rule__FuncVar__TypeAssignment_0 : ( ruleStringType ) ;
    public final void rule__FuncVar__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4735:1: ( ( ruleStringType ) )
            // InternalMyDsl.g:4736:2: ( ruleStringType )
            {
            // InternalMyDsl.g:4736:2: ( ruleStringType )
            // InternalMyDsl.g:4737:3: ruleStringType
            {
             before(grammarAccess.getFuncVarAccess().getTypeStringTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStringType();

            state._fsp--;

             after(grammarAccess.getFuncVarAccess().getTypeStringTypeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncVar__TypeAssignment_0"


    // $ANTLR start "rule__FuncVar__NameAssignment_1"
    // InternalMyDsl.g:4746:1: rule__FuncVar__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FuncVar__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4750:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4751:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4751:2: ( RULE_ID )
            // InternalMyDsl.g:4752:3: RULE_ID
            {
             before(grammarAccess.getFuncVarAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFuncVarAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FuncVar__NameAssignment_1"


    // $ANTLR start "rule__Function__NameAssignment_3"
    // InternalMyDsl.g:4761:1: rule__Function__NameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Function__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4765:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4766:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4766:2: ( RULE_STRING )
            // InternalMyDsl.g:4767:3: RULE_STRING
            {
             before(grammarAccess.getFunctionAccess().getNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFunctionAccess().getNameSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__NameAssignment_3"


    // $ANTLR start "rule__Function__VarsAssignment_8"
    // InternalMyDsl.g:4776:1: rule__Function__VarsAssignment_8 : ( ruleFuncVar ) ;
    public final void rule__Function__VarsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4780:1: ( ( ruleFuncVar ) )
            // InternalMyDsl.g:4781:2: ( ruleFuncVar )
            {
            // InternalMyDsl.g:4781:2: ( ruleFuncVar )
            // InternalMyDsl.g:4782:3: ruleFuncVar
            {
             before(grammarAccess.getFunctionAccess().getVarsFuncVarParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleFuncVar();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getVarsFuncVarParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__VarsAssignment_8"


    // $ANTLR start "rule__Function__OperationsAssignment_11"
    // InternalMyDsl.g:4791:1: rule__Function__OperationsAssignment_11 : ( ruleOperation ) ;
    public final void rule__Function__OperationsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4795:1: ( ( ruleOperation ) )
            // InternalMyDsl.g:4796:2: ( ruleOperation )
            {
            // InternalMyDsl.g:4796:2: ( ruleOperation )
            // InternalMyDsl.g:4797:3: ruleOperation
            {
             before(grammarAccess.getFunctionAccess().getOperationsOperationParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getFunctionAccess().getOperationsOperationParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__OperationsAssignment_11"


    // $ANTLR start "rule__ForLoop__StartAssignment_2"
    // InternalMyDsl.g:4806:1: rule__ForLoop__StartAssignment_2 : ( RULE_INT ) ;
    public final void rule__ForLoop__StartAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4810:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4811:2: ( RULE_INT )
            {
            // InternalMyDsl.g:4811:2: ( RULE_INT )
            // InternalMyDsl.g:4812:3: RULE_INT
            {
             before(grammarAccess.getForLoopAccess().getStartINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getStartINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__StartAssignment_2"


    // $ANTLR start "rule__ForLoop__EndAssignment_4"
    // InternalMyDsl.g:4821:1: rule__ForLoop__EndAssignment_4 : ( RULE_INT ) ;
    public final void rule__ForLoop__EndAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4825:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4826:2: ( RULE_INT )
            {
            // InternalMyDsl.g:4826:2: ( RULE_INT )
            // InternalMyDsl.g:4827:3: RULE_INT
            {
             before(grammarAccess.getForLoopAccess().getEndINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getEndINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__EndAssignment_4"


    // $ANTLR start "rule__ForLoop__StepAssignment_6"
    // InternalMyDsl.g:4836:1: rule__ForLoop__StepAssignment_6 : ( RULE_INT ) ;
    public final void rule__ForLoop__StepAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4840:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4841:2: ( RULE_INT )
            {
            // InternalMyDsl.g:4841:2: ( RULE_INT )
            // InternalMyDsl.g:4842:3: RULE_INT
            {
             before(grammarAccess.getForLoopAccess().getStepINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getStepINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__StepAssignment_6"


    // $ANTLR start "rule__ForLoop__OperationsAssignment_9"
    // InternalMyDsl.g:4851:1: rule__ForLoop__OperationsAssignment_9 : ( ruleOperation ) ;
    public final void rule__ForLoop__OperationsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4855:1: ( ( ruleOperation ) )
            // InternalMyDsl.g:4856:2: ( ruleOperation )
            {
            // InternalMyDsl.g:4856:2: ( ruleOperation )
            // InternalMyDsl.g:4857:3: ruleOperation
            {
             before(grammarAccess.getForLoopAccess().getOperationsOperationParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getForLoopAccess().getOperationsOperationParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__OperationsAssignment_9"


    // $ANTLR start "rule__WhileLoop__CAssignment_2"
    // InternalMyDsl.g:4866:1: rule__WhileLoop__CAssignment_2 : ( ruleCondition ) ;
    public final void rule__WhileLoop__CAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4870:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:4871:2: ( ruleCondition )
            {
            // InternalMyDsl.g:4871:2: ( ruleCondition )
            // InternalMyDsl.g:4872:3: ruleCondition
            {
             before(grammarAccess.getWhileLoopAccess().getCConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getWhileLoopAccess().getCConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__CAssignment_2"


    // $ANTLR start "rule__WhileLoop__AddAssignment_3"
    // InternalMyDsl.g:4881:1: rule__WhileLoop__AddAssignment_3 : ( ruleAddCondition ) ;
    public final void rule__WhileLoop__AddAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4885:1: ( ( ruleAddCondition ) )
            // InternalMyDsl.g:4886:2: ( ruleAddCondition )
            {
            // InternalMyDsl.g:4886:2: ( ruleAddCondition )
            // InternalMyDsl.g:4887:3: ruleAddCondition
            {
             before(grammarAccess.getWhileLoopAccess().getAddAddConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAddCondition();

            state._fsp--;

             after(grammarAccess.getWhileLoopAccess().getAddAddConditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__AddAssignment_3"


    // $ANTLR start "rule__WhileLoop__OperationsAssignment_6"
    // InternalMyDsl.g:4896:1: rule__WhileLoop__OperationsAssignment_6 : ( ruleOperation ) ;
    public final void rule__WhileLoop__OperationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4900:1: ( ( ruleOperation ) )
            // InternalMyDsl.g:4901:2: ( ruleOperation )
            {
            // InternalMyDsl.g:4901:2: ( ruleOperation )
            // InternalMyDsl.g:4902:3: ruleOperation
            {
             before(grammarAccess.getWhileLoopAccess().getOperationsOperationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getWhileLoopAccess().getOperationsOperationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__OperationsAssignment_6"


    // $ANTLR start "rule__DoLoop__CAssignment_2"
    // InternalMyDsl.g:4911:1: rule__DoLoop__CAssignment_2 : ( ruleCondition ) ;
    public final void rule__DoLoop__CAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4915:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:4916:2: ( ruleCondition )
            {
            // InternalMyDsl.g:4916:2: ( ruleCondition )
            // InternalMyDsl.g:4917:3: ruleCondition
            {
             before(grammarAccess.getDoLoopAccess().getCConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getDoLoopAccess().getCConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoLoop__CAssignment_2"


    // $ANTLR start "rule__DoLoop__AddAssignment_3"
    // InternalMyDsl.g:4926:1: rule__DoLoop__AddAssignment_3 : ( ruleAddCondition ) ;
    public final void rule__DoLoop__AddAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4930:1: ( ( ruleAddCondition ) )
            // InternalMyDsl.g:4931:2: ( ruleAddCondition )
            {
            // InternalMyDsl.g:4931:2: ( ruleAddCondition )
            // InternalMyDsl.g:4932:3: ruleAddCondition
            {
             before(grammarAccess.getDoLoopAccess().getAddAddConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAddCondition();

            state._fsp--;

             after(grammarAccess.getDoLoopAccess().getAddAddConditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoLoop__AddAssignment_3"


    // $ANTLR start "rule__DoLoop__OperationsAssignment_6"
    // InternalMyDsl.g:4941:1: rule__DoLoop__OperationsAssignment_6 : ( ruleOperation ) ;
    public final void rule__DoLoop__OperationsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4945:1: ( ( ruleOperation ) )
            // InternalMyDsl.g:4946:2: ( ruleOperation )
            {
            // InternalMyDsl.g:4946:2: ( ruleOperation )
            // InternalMyDsl.g:4947:3: ruleOperation
            {
             before(grammarAccess.getDoLoopAccess().getOperationsOperationParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getDoLoopAccess().getOperationsOperationParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoLoop__OperationsAssignment_6"


    // $ANTLR start "rule__AddCondition__OpAssignment_0"
    // InternalMyDsl.g:4956:1: rule__AddCondition__OpAssignment_0 : ( ( rule__AddCondition__OpAlternatives_0_0 ) ) ;
    public final void rule__AddCondition__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4960:1: ( ( ( rule__AddCondition__OpAlternatives_0_0 ) ) )
            // InternalMyDsl.g:4961:2: ( ( rule__AddCondition__OpAlternatives_0_0 ) )
            {
            // InternalMyDsl.g:4961:2: ( ( rule__AddCondition__OpAlternatives_0_0 ) )
            // InternalMyDsl.g:4962:3: ( rule__AddCondition__OpAlternatives_0_0 )
            {
             before(grammarAccess.getAddConditionAccess().getOpAlternatives_0_0()); 
            // InternalMyDsl.g:4963:3: ( rule__AddCondition__OpAlternatives_0_0 )
            // InternalMyDsl.g:4963:4: rule__AddCondition__OpAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AddCondition__OpAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAddConditionAccess().getOpAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddCondition__OpAssignment_0"


    // $ANTLR start "rule__AddCondition__CondAssignment_1"
    // InternalMyDsl.g:4971:1: rule__AddCondition__CondAssignment_1 : ( ruleCondition ) ;
    public final void rule__AddCondition__CondAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4975:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:4976:2: ( ruleCondition )
            {
            // InternalMyDsl.g:4976:2: ( ruleCondition )
            // InternalMyDsl.g:4977:3: ruleCondition
            {
             before(grammarAccess.getAddConditionAccess().getCondConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getAddConditionAccess().getCondConditionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddCondition__CondAssignment_1"


    // $ANTLR start "rule__Elements__TypeAssignment_1"
    // InternalMyDsl.g:4986:1: rule__Elements__TypeAssignment_1 : ( ruleEltType ) ;
    public final void rule__Elements__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4990:1: ( ( ruleEltType ) )
            // InternalMyDsl.g:4991:2: ( ruleEltType )
            {
            // InternalMyDsl.g:4991:2: ( ruleEltType )
            // InternalMyDsl.g:4992:3: ruleEltType
            {
             before(grammarAccess.getElementsAccess().getTypeEltTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEltType();

            state._fsp--;

             after(grammarAccess.getElementsAccess().getTypeEltTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Elements__TypeAssignment_1"


    // $ANTLR start "rule__Element__TypeAssignment_1"
    // InternalMyDsl.g:5001:1: rule__Element__TypeAssignment_1 : ( ruleEltType ) ;
    public final void rule__Element__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5005:1: ( ( ruleEltType ) )
            // InternalMyDsl.g:5006:2: ( ruleEltType )
            {
            // InternalMyDsl.g:5006:2: ( ruleEltType )
            // InternalMyDsl.g:5007:3: ruleEltType
            {
             before(grammarAccess.getElementAccess().getTypeEltTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEltType();

            state._fsp--;

             after(grammarAccess.getElementAccess().getTypeEltTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__TypeAssignment_1"


    // $ANTLR start "rule__Tag__HtmlAssignment_1"
    // InternalMyDsl.g:5016:1: rule__Tag__HtmlAssignment_1 : ( RULE_HTML_ELT ) ;
    public final void rule__Tag__HtmlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5020:1: ( ( RULE_HTML_ELT ) )
            // InternalMyDsl.g:5021:2: ( RULE_HTML_ELT )
            {
            // InternalMyDsl.g:5021:2: ( RULE_HTML_ELT )
            // InternalMyDsl.g:5022:3: RULE_HTML_ELT
            {
             before(grammarAccess.getTagAccess().getHtmlHTML_ELTTerminalRuleCall_1_0()); 
            match(input,RULE_HTML_ELT,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getHtmlHTML_ELTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__HtmlAssignment_1"


    // $ANTLR start "rule__Tag__TagAssignment_2"
    // InternalMyDsl.g:5031:1: rule__Tag__TagAssignment_2 : ( ruleText ) ;
    public final void rule__Tag__TagAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5035:1: ( ( ruleText ) )
            // InternalMyDsl.g:5036:2: ( ruleText )
            {
            // InternalMyDsl.g:5036:2: ( ruleText )
            // InternalMyDsl.g:5037:3: ruleText
            {
             before(grammarAccess.getTagAccess().getTagTextParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTagAccess().getTagTextParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__TagAssignment_2"


    // $ANTLR start "rule__SimpleOp__Elt1Assignment_1"
    // InternalMyDsl.g:5046:1: rule__SimpleOp__Elt1Assignment_1 : ( ruleComparableElt ) ;
    public final void rule__SimpleOp__Elt1Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5050:1: ( ( ruleComparableElt ) )
            // InternalMyDsl.g:5051:2: ( ruleComparableElt )
            {
            // InternalMyDsl.g:5051:2: ( ruleComparableElt )
            // InternalMyDsl.g:5052:3: ruleComparableElt
            {
             before(grammarAccess.getSimpleOpAccess().getElt1ComparableEltParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparableElt();

            state._fsp--;

             after(grammarAccess.getSimpleOpAccess().getElt1ComparableEltParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOp__Elt1Assignment_1"


    // $ANTLR start "rule__SimpleOp__OpAssignment_2"
    // InternalMyDsl.g:5061:1: rule__SimpleOp__OpAssignment_2 : ( RULE_OP ) ;
    public final void rule__SimpleOp__OpAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5065:1: ( ( RULE_OP ) )
            // InternalMyDsl.g:5066:2: ( RULE_OP )
            {
            // InternalMyDsl.g:5066:2: ( RULE_OP )
            // InternalMyDsl.g:5067:3: RULE_OP
            {
             before(grammarAccess.getSimpleOpAccess().getOpOPTerminalRuleCall_2_0()); 
            match(input,RULE_OP,FOLLOW_2); 
             after(grammarAccess.getSimpleOpAccess().getOpOPTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOp__OpAssignment_2"


    // $ANTLR start "rule__SimpleOp__Elt2Assignment_3"
    // InternalMyDsl.g:5076:1: rule__SimpleOp__Elt2Assignment_3 : ( ruleComparableElt ) ;
    public final void rule__SimpleOp__Elt2Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5080:1: ( ( ruleComparableElt ) )
            // InternalMyDsl.g:5081:2: ( ruleComparableElt )
            {
            // InternalMyDsl.g:5081:2: ( ruleComparableElt )
            // InternalMyDsl.g:5082:3: ruleComparableElt
            {
             before(grammarAccess.getSimpleOpAccess().getElt2ComparableEltParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComparableElt();

            state._fsp--;

             after(grammarAccess.getSimpleOpAccess().getElt2ComparableEltParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleOp__Elt2Assignment_3"


    // $ANTLR start "rule__ComparableElt__InteAssignment_0"
    // InternalMyDsl.g:5091:1: rule__ComparableElt__InteAssignment_0 : ( RULE_INT ) ;
    public final void rule__ComparableElt__InteAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5095:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:5096:2: ( RULE_INT )
            {
            // InternalMyDsl.g:5096:2: ( RULE_INT )
            // InternalMyDsl.g:5097:3: RULE_INT
            {
             before(grammarAccess.getComparableEltAccess().getInteINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getComparableEltAccess().getInteINTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparableElt__InteAssignment_0"


    // $ANTLR start "rule__ComparableElt__TextAssignment_1"
    // InternalMyDsl.g:5106:1: rule__ComparableElt__TextAssignment_1 : ( ruleText ) ;
    public final void rule__ComparableElt__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5110:1: ( ( ruleText ) )
            // InternalMyDsl.g:5111:2: ( ruleText )
            {
            // InternalMyDsl.g:5111:2: ( ruleText )
            // InternalMyDsl.g:5112:3: ruleText
            {
             before(grammarAccess.getComparableEltAccess().getTextTextParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getComparableEltAccess().getTextTextParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparableElt__TextAssignment_1"


    // $ANTLR start "rule__Text__VariAssignment_0"
    // InternalMyDsl.g:5121:1: rule__Text__VariAssignment_0 : ( ruleVariable ) ;
    public final void rule__Text__VariAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5125:1: ( ( ruleVariable ) )
            // InternalMyDsl.g:5126:2: ( ruleVariable )
            {
            // InternalMyDsl.g:5126:2: ( ruleVariable )
            // InternalMyDsl.g:5127:3: ruleVariable
            {
             before(grammarAccess.getTextAccess().getVariVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getTextAccess().getVariVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__VariAssignment_0"


    // $ANTLR start "rule__Text__NameAssignment_1"
    // InternalMyDsl.g:5136:1: rule__Text__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Text__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5140:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:5141:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:5141:2: ( RULE_STRING )
            // InternalMyDsl.g:5142:3: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__NameAssignment_1"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalMyDsl.g:5151:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5155:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5156:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5156:2: ( RULE_ID )
            // InternalMyDsl.g:5157:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000E4BC780000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000E4BC700002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000E700000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C700002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002006000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000070100000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000102000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000F0002000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000F0000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000E4BE700000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000010CF00000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100028000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000100000050L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000100L});

}