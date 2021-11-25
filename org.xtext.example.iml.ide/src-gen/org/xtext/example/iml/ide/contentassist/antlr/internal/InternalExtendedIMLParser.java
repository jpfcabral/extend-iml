package org.xtext.example.iml.ide.contentassist.antlr.internal;

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
import org.xtext.example.iml.services.ExtendedIMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExtendedIMLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'/'", "'images'", "'rotate'", "'filter'", "'gray'", "'blur'", "'equalize'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalExtendedIMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExtendedIMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExtendedIMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalExtendedIML.g"; }


    	private ExtendedIMLGrammarAccess grammarAccess;

    	public void setGrammarAccess(ExtendedIMLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalExtendedIML.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalExtendedIML.g:54:1: ( ruleModel EOF )
            // InternalExtendedIML.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalExtendedIML.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalExtendedIML.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalExtendedIML.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalExtendedIML.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalExtendedIML.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=13 && LA1_0<=15)||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExtendedIML.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalExtendedIML.g:78:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalExtendedIML.g:79:1: ( ruleAbstractElement EOF )
            // InternalExtendedIML.g:80:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalExtendedIML.g:87:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:91:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalExtendedIML.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalExtendedIML.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalExtendedIML.g:93:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalExtendedIML.g:94:3: ( rule__AbstractElement__Alternatives )
            // InternalExtendedIML.g:94:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleImporter"
    // InternalExtendedIML.g:103:1: entryRuleImporter : ruleImporter EOF ;
    public final void entryRuleImporter() throws RecognitionException {
        try {
            // InternalExtendedIML.g:104:1: ( ruleImporter EOF )
            // InternalExtendedIML.g:105:1: ruleImporter EOF
            {
             before(grammarAccess.getImporterRule()); 
            pushFollow(FOLLOW_1);
            ruleImporter();

            state._fsp--;

             after(grammarAccess.getImporterRule()); 
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
    // $ANTLR end "entryRuleImporter"


    // $ANTLR start "ruleImporter"
    // InternalExtendedIML.g:112:1: ruleImporter : ( ( rule__Importer__Alternatives ) ) ;
    public final void ruleImporter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:116:2: ( ( ( rule__Importer__Alternatives ) ) )
            // InternalExtendedIML.g:117:2: ( ( rule__Importer__Alternatives ) )
            {
            // InternalExtendedIML.g:117:2: ( ( rule__Importer__Alternatives ) )
            // InternalExtendedIML.g:118:3: ( rule__Importer__Alternatives )
            {
             before(grammarAccess.getImporterAccess().getAlternatives()); 
            // InternalExtendedIML.g:119:3: ( rule__Importer__Alternatives )
            // InternalExtendedIML.g:119:4: rule__Importer__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Importer__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImporterAccess().getAlternatives()); 

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
    // $ANTLR end "ruleImporter"


    // $ANTLR start "entryRuleImageImporter"
    // InternalExtendedIML.g:128:1: entryRuleImageImporter : ruleImageImporter EOF ;
    public final void entryRuleImageImporter() throws RecognitionException {
        try {
            // InternalExtendedIML.g:129:1: ( ruleImageImporter EOF )
            // InternalExtendedIML.g:130:1: ruleImageImporter EOF
            {
             before(grammarAccess.getImageImporterRule()); 
            pushFollow(FOLLOW_1);
            ruleImageImporter();

            state._fsp--;

             after(grammarAccess.getImageImporterRule()); 
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
    // $ANTLR end "entryRuleImageImporter"


    // $ANTLR start "ruleImageImporter"
    // InternalExtendedIML.g:137:1: ruleImageImporter : ( ( rule__ImageImporter__Group__0 ) ) ;
    public final void ruleImageImporter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:141:2: ( ( ( rule__ImageImporter__Group__0 ) ) )
            // InternalExtendedIML.g:142:2: ( ( rule__ImageImporter__Group__0 ) )
            {
            // InternalExtendedIML.g:142:2: ( ( rule__ImageImporter__Group__0 ) )
            // InternalExtendedIML.g:143:3: ( rule__ImageImporter__Group__0 )
            {
             before(grammarAccess.getImageImporterAccess().getGroup()); 
            // InternalExtendedIML.g:144:3: ( rule__ImageImporter__Group__0 )
            // InternalExtendedIML.g:144:4: rule__ImageImporter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImageImporter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageImporterAccess().getGroup()); 

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
    // $ANTLR end "ruleImageImporter"


    // $ANTLR start "entryRuleQualifiedImageName"
    // InternalExtendedIML.g:153:1: entryRuleQualifiedImageName : ruleQualifiedImageName EOF ;
    public final void entryRuleQualifiedImageName() throws RecognitionException {
        try {
            // InternalExtendedIML.g:154:1: ( ruleQualifiedImageName EOF )
            // InternalExtendedIML.g:155:1: ruleQualifiedImageName EOF
            {
             before(grammarAccess.getQualifiedImageNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedImageName();

            state._fsp--;

             after(grammarAccess.getQualifiedImageNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedImageName"


    // $ANTLR start "ruleQualifiedImageName"
    // InternalExtendedIML.g:162:1: ruleQualifiedImageName : ( RULE_ID ) ;
    public final void ruleQualifiedImageName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:166:2: ( ( RULE_ID ) )
            // InternalExtendedIML.g:167:2: ( RULE_ID )
            {
            // InternalExtendedIML.g:167:2: ( RULE_ID )
            // InternalExtendedIML.g:168:3: RULE_ID
            {
             before(grammarAccess.getQualifiedImageNameAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedImageNameAccess().getIDTerminalRuleCall()); 

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
    // $ANTLR end "ruleQualifiedImageName"


    // $ANTLR start "entryRuleQualifiedPath"
    // InternalExtendedIML.g:178:1: entryRuleQualifiedPath : ruleQualifiedPath EOF ;
    public final void entryRuleQualifiedPath() throws RecognitionException {
        try {
            // InternalExtendedIML.g:179:1: ( ruleQualifiedPath EOF )
            // InternalExtendedIML.g:180:1: ruleQualifiedPath EOF
            {
             before(grammarAccess.getQualifiedPathRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedPath();

            state._fsp--;

             after(grammarAccess.getQualifiedPathRule()); 
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
    // $ANTLR end "entryRuleQualifiedPath"


    // $ANTLR start "ruleQualifiedPath"
    // InternalExtendedIML.g:187:1: ruleQualifiedPath : ( ( rule__QualifiedPath__Group__0 ) ) ;
    public final void ruleQualifiedPath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:191:2: ( ( ( rule__QualifiedPath__Group__0 ) ) )
            // InternalExtendedIML.g:192:2: ( ( rule__QualifiedPath__Group__0 ) )
            {
            // InternalExtendedIML.g:192:2: ( ( rule__QualifiedPath__Group__0 ) )
            // InternalExtendedIML.g:193:3: ( rule__QualifiedPath__Group__0 )
            {
             before(grammarAccess.getQualifiedPathAccess().getGroup()); 
            // InternalExtendedIML.g:194:3: ( rule__QualifiedPath__Group__0 )
            // InternalExtendedIML.g:194:4: rule__QualifiedPath__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedPathAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedPath"


    // $ANTLR start "entryRuleDirImporter"
    // InternalExtendedIML.g:203:1: entryRuleDirImporter : ruleDirImporter EOF ;
    public final void entryRuleDirImporter() throws RecognitionException {
        try {
            // InternalExtendedIML.g:204:1: ( ruleDirImporter EOF )
            // InternalExtendedIML.g:205:1: ruleDirImporter EOF
            {
             before(grammarAccess.getDirImporterRule()); 
            pushFollow(FOLLOW_1);
            ruleDirImporter();

            state._fsp--;

             after(grammarAccess.getDirImporterRule()); 
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
    // $ANTLR end "entryRuleDirImporter"


    // $ANTLR start "ruleDirImporter"
    // InternalExtendedIML.g:212:1: ruleDirImporter : ( ( rule__DirImporter__Group__0 ) ) ;
    public final void ruleDirImporter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:216:2: ( ( ( rule__DirImporter__Group__0 ) ) )
            // InternalExtendedIML.g:217:2: ( ( rule__DirImporter__Group__0 ) )
            {
            // InternalExtendedIML.g:217:2: ( ( rule__DirImporter__Group__0 ) )
            // InternalExtendedIML.g:218:3: ( rule__DirImporter__Group__0 )
            {
             before(grammarAccess.getDirImporterAccess().getGroup()); 
            // InternalExtendedIML.g:219:3: ( rule__DirImporter__Group__0 )
            // InternalExtendedIML.g:219:4: rule__DirImporter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DirImporter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDirImporterAccess().getGroup()); 

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
    // $ANTLR end "ruleDirImporter"


    // $ANTLR start "entryRuleOperator"
    // InternalExtendedIML.g:228:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalExtendedIML.g:229:1: ( ruleOperator EOF )
            // InternalExtendedIML.g:230:1: ruleOperator EOF
            {
             before(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleOperator();

            state._fsp--;

             after(grammarAccess.getOperatorRule()); 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalExtendedIML.g:237:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:241:2: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalExtendedIML.g:242:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalExtendedIML.g:242:2: ( ( rule__Operator__Alternatives ) )
            // InternalExtendedIML.g:243:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalExtendedIML.g:244:3: ( rule__Operator__Alternatives )
            // InternalExtendedIML.g:244:4: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatorAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleRotateOperation"
    // InternalExtendedIML.g:253:1: entryRuleRotateOperation : ruleRotateOperation EOF ;
    public final void entryRuleRotateOperation() throws RecognitionException {
        try {
            // InternalExtendedIML.g:254:1: ( ruleRotateOperation EOF )
            // InternalExtendedIML.g:255:1: ruleRotateOperation EOF
            {
             before(grammarAccess.getRotateOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleRotateOperation();

            state._fsp--;

             after(grammarAccess.getRotateOperationRule()); 
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
    // $ANTLR end "entryRuleRotateOperation"


    // $ANTLR start "ruleRotateOperation"
    // InternalExtendedIML.g:262:1: ruleRotateOperation : ( ( rule__RotateOperation__Group__0 ) ) ;
    public final void ruleRotateOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:266:2: ( ( ( rule__RotateOperation__Group__0 ) ) )
            // InternalExtendedIML.g:267:2: ( ( rule__RotateOperation__Group__0 ) )
            {
            // InternalExtendedIML.g:267:2: ( ( rule__RotateOperation__Group__0 ) )
            // InternalExtendedIML.g:268:3: ( rule__RotateOperation__Group__0 )
            {
             before(grammarAccess.getRotateOperationAccess().getGroup()); 
            // InternalExtendedIML.g:269:3: ( rule__RotateOperation__Group__0 )
            // InternalExtendedIML.g:269:4: rule__RotateOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RotateOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRotateOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleRotateOperation"


    // $ANTLR start "entryRuleFilterOperation"
    // InternalExtendedIML.g:278:1: entryRuleFilterOperation : ruleFilterOperation EOF ;
    public final void entryRuleFilterOperation() throws RecognitionException {
        try {
            // InternalExtendedIML.g:279:1: ( ruleFilterOperation EOF )
            // InternalExtendedIML.g:280:1: ruleFilterOperation EOF
            {
             before(grammarAccess.getFilterOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterOperation();

            state._fsp--;

             after(grammarAccess.getFilterOperationRule()); 
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
    // $ANTLR end "entryRuleFilterOperation"


    // $ANTLR start "ruleFilterOperation"
    // InternalExtendedIML.g:287:1: ruleFilterOperation : ( ( rule__FilterOperation__Group__0 ) ) ;
    public final void ruleFilterOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:291:2: ( ( ( rule__FilterOperation__Group__0 ) ) )
            // InternalExtendedIML.g:292:2: ( ( rule__FilterOperation__Group__0 ) )
            {
            // InternalExtendedIML.g:292:2: ( ( rule__FilterOperation__Group__0 ) )
            // InternalExtendedIML.g:293:3: ( rule__FilterOperation__Group__0 )
            {
             before(grammarAccess.getFilterOperationAccess().getGroup()); 
            // InternalExtendedIML.g:294:3: ( rule__FilterOperation__Group__0 )
            // InternalExtendedIML.g:294:4: rule__FilterOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleFilterOperation"


    // $ANTLR start "entryRuleBlurOperation"
    // InternalExtendedIML.g:303:1: entryRuleBlurOperation : ruleBlurOperation EOF ;
    public final void entryRuleBlurOperation() throws RecognitionException {
        try {
            // InternalExtendedIML.g:304:1: ( ruleBlurOperation EOF )
            // InternalExtendedIML.g:305:1: ruleBlurOperation EOF
            {
             before(grammarAccess.getBlurOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleBlurOperation();

            state._fsp--;

             after(grammarAccess.getBlurOperationRule()); 
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
    // $ANTLR end "entryRuleBlurOperation"


    // $ANTLR start "ruleBlurOperation"
    // InternalExtendedIML.g:312:1: ruleBlurOperation : ( ( rule__BlurOperation__Group__0 ) ) ;
    public final void ruleBlurOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:316:2: ( ( ( rule__BlurOperation__Group__0 ) ) )
            // InternalExtendedIML.g:317:2: ( ( rule__BlurOperation__Group__0 ) )
            {
            // InternalExtendedIML.g:317:2: ( ( rule__BlurOperation__Group__0 ) )
            // InternalExtendedIML.g:318:3: ( rule__BlurOperation__Group__0 )
            {
             before(grammarAccess.getBlurOperationAccess().getGroup()); 
            // InternalExtendedIML.g:319:3: ( rule__BlurOperation__Group__0 )
            // InternalExtendedIML.g:319:4: rule__BlurOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BlurOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlurOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleBlurOperation"


    // $ANTLR start "entryRuleEqualizeOperation"
    // InternalExtendedIML.g:328:1: entryRuleEqualizeOperation : ruleEqualizeOperation EOF ;
    public final void entryRuleEqualizeOperation() throws RecognitionException {
        try {
            // InternalExtendedIML.g:329:1: ( ruleEqualizeOperation EOF )
            // InternalExtendedIML.g:330:1: ruleEqualizeOperation EOF
            {
             before(grammarAccess.getEqualizeOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleEqualizeOperation();

            state._fsp--;

             after(grammarAccess.getEqualizeOperationRule()); 
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
    // $ANTLR end "entryRuleEqualizeOperation"


    // $ANTLR start "ruleEqualizeOperation"
    // InternalExtendedIML.g:337:1: ruleEqualizeOperation : ( ( rule__EqualizeOperation__Group__0 ) ) ;
    public final void ruleEqualizeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:341:2: ( ( ( rule__EqualizeOperation__Group__0 ) ) )
            // InternalExtendedIML.g:342:2: ( ( rule__EqualizeOperation__Group__0 ) )
            {
            // InternalExtendedIML.g:342:2: ( ( rule__EqualizeOperation__Group__0 ) )
            // InternalExtendedIML.g:343:3: ( rule__EqualizeOperation__Group__0 )
            {
             before(grammarAccess.getEqualizeOperationAccess().getGroup()); 
            // InternalExtendedIML.g:344:3: ( rule__EqualizeOperation__Group__0 )
            // InternalExtendedIML.g:344:4: rule__EqualizeOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EqualizeOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualizeOperationAccess().getGroup()); 

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
    // $ANTLR end "ruleEqualizeOperation"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalExtendedIML.g:352:1: rule__AbstractElement__Alternatives : ( ( ruleImporter ) | ( ruleOperator ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:356:1: ( ( ruleImporter ) | ( ruleOperator ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==13) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=14 && LA2_0<=15)||(LA2_0>=17 && LA2_0<=18)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalExtendedIML.g:357:2: ( ruleImporter )
                    {
                    // InternalExtendedIML.g:357:2: ( ruleImporter )
                    // InternalExtendedIML.g:358:3: ruleImporter
                    {
                     before(grammarAccess.getAbstractElementAccess().getImporterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleImporter();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getImporterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExtendedIML.g:363:2: ( ruleOperator )
                    {
                    // InternalExtendedIML.g:363:2: ( ruleOperator )
                    // InternalExtendedIML.g:364:3: ruleOperator
                    {
                     before(grammarAccess.getAbstractElementAccess().getOperatorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOperator();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getOperatorParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Importer__Alternatives"
    // InternalExtendedIML.g:373:1: rule__Importer__Alternatives : ( ( ruleImageImporter ) | ( ruleDirImporter ) );
    public final void rule__Importer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:377:1: ( ( ruleImageImporter ) | ( ruleDirImporter ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalExtendedIML.g:378:2: ( ruleImageImporter )
                    {
                    // InternalExtendedIML.g:378:2: ( ruleImageImporter )
                    // InternalExtendedIML.g:379:3: ruleImageImporter
                    {
                     before(grammarAccess.getImporterAccess().getImageImporterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleImageImporter();

                    state._fsp--;

                     after(grammarAccess.getImporterAccess().getImageImporterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExtendedIML.g:384:2: ( ruleDirImporter )
                    {
                    // InternalExtendedIML.g:384:2: ( ruleDirImporter )
                    // InternalExtendedIML.g:385:3: ruleDirImporter
                    {
                     before(grammarAccess.getImporterAccess().getDirImporterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDirImporter();

                    state._fsp--;

                     after(grammarAccess.getImporterAccess().getDirImporterParserRuleCall_1()); 

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
    // $ANTLR end "rule__Importer__Alternatives"


    // $ANTLR start "rule__Operator__Alternatives"
    // InternalExtendedIML.g:394:1: rule__Operator__Alternatives : ( ( ruleRotateOperation ) | ( ruleFilterOperation ) | ( ruleBlurOperation ) | ( ruleEqualizeOperation ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:398:1: ( ( ruleRotateOperation ) | ( ruleFilterOperation ) | ( ruleBlurOperation ) | ( ruleEqualizeOperation ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            case 18:
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
                    // InternalExtendedIML.g:399:2: ( ruleRotateOperation )
                    {
                    // InternalExtendedIML.g:399:2: ( ruleRotateOperation )
                    // InternalExtendedIML.g:400:3: ruleRotateOperation
                    {
                     before(grammarAccess.getOperatorAccess().getRotateOperationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRotateOperation();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getRotateOperationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExtendedIML.g:405:2: ( ruleFilterOperation )
                    {
                    // InternalExtendedIML.g:405:2: ( ruleFilterOperation )
                    // InternalExtendedIML.g:406:3: ruleFilterOperation
                    {
                     before(grammarAccess.getOperatorAccess().getFilterOperationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFilterOperation();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getFilterOperationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExtendedIML.g:411:2: ( ruleBlurOperation )
                    {
                    // InternalExtendedIML.g:411:2: ( ruleBlurOperation )
                    // InternalExtendedIML.g:412:3: ruleBlurOperation
                    {
                     before(grammarAccess.getOperatorAccess().getBlurOperationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBlurOperation();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getBlurOperationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalExtendedIML.g:417:2: ( ruleEqualizeOperation )
                    {
                    // InternalExtendedIML.g:417:2: ( ruleEqualizeOperation )
                    // InternalExtendedIML.g:418:3: ruleEqualizeOperation
                    {
                     before(grammarAccess.getOperatorAccess().getEqualizeOperationParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleEqualizeOperation();

                    state._fsp--;

                     after(grammarAccess.getOperatorAccess().getEqualizeOperationParserRuleCall_3()); 

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
    // $ANTLR end "rule__Operator__Alternatives"


    // $ANTLR start "rule__ImageImporter__Group__0"
    // InternalExtendedIML.g:427:1: rule__ImageImporter__Group__0 : rule__ImageImporter__Group__0__Impl rule__ImageImporter__Group__1 ;
    public final void rule__ImageImporter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:431:1: ( rule__ImageImporter__Group__0__Impl rule__ImageImporter__Group__1 )
            // InternalExtendedIML.g:432:2: rule__ImageImporter__Group__0__Impl rule__ImageImporter__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ImageImporter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageImporter__Group__1();

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
    // $ANTLR end "rule__ImageImporter__Group__0"


    // $ANTLR start "rule__ImageImporter__Group__0__Impl"
    // InternalExtendedIML.g:439:1: rule__ImageImporter__Group__0__Impl : ( ( rule__ImageImporter__NameAssignment_0 ) ) ;
    public final void rule__ImageImporter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:443:1: ( ( ( rule__ImageImporter__NameAssignment_0 ) ) )
            // InternalExtendedIML.g:444:1: ( ( rule__ImageImporter__NameAssignment_0 ) )
            {
            // InternalExtendedIML.g:444:1: ( ( rule__ImageImporter__NameAssignment_0 ) )
            // InternalExtendedIML.g:445:2: ( rule__ImageImporter__NameAssignment_0 )
            {
             before(grammarAccess.getImageImporterAccess().getNameAssignment_0()); 
            // InternalExtendedIML.g:446:2: ( rule__ImageImporter__NameAssignment_0 )
            // InternalExtendedIML.g:446:3: rule__ImageImporter__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ImageImporter__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getImageImporterAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__ImageImporter__Group__0__Impl"


    // $ANTLR start "rule__ImageImporter__Group__1"
    // InternalExtendedIML.g:454:1: rule__ImageImporter__Group__1 : rule__ImageImporter__Group__1__Impl rule__ImageImporter__Group__2 ;
    public final void rule__ImageImporter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:458:1: ( rule__ImageImporter__Group__1__Impl rule__ImageImporter__Group__2 )
            // InternalExtendedIML.g:459:2: rule__ImageImporter__Group__1__Impl rule__ImageImporter__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ImageImporter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageImporter__Group__2();

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
    // $ANTLR end "rule__ImageImporter__Group__1"


    // $ANTLR start "rule__ImageImporter__Group__1__Impl"
    // InternalExtendedIML.g:466:1: rule__ImageImporter__Group__1__Impl : ( '=' ) ;
    public final void rule__ImageImporter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:470:1: ( ( '=' ) )
            // InternalExtendedIML.g:471:1: ( '=' )
            {
            // InternalExtendedIML.g:471:1: ( '=' )
            // InternalExtendedIML.g:472:2: '='
            {
             before(grammarAccess.getImageImporterAccess().getEqualsSignKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getImageImporterAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__ImageImporter__Group__1__Impl"


    // $ANTLR start "rule__ImageImporter__Group__2"
    // InternalExtendedIML.g:481:1: rule__ImageImporter__Group__2 : rule__ImageImporter__Group__2__Impl ;
    public final void rule__ImageImporter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:485:1: ( rule__ImageImporter__Group__2__Impl )
            // InternalExtendedIML.g:486:2: rule__ImageImporter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageImporter__Group__2__Impl();

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
    // $ANTLR end "rule__ImageImporter__Group__2"


    // $ANTLR start "rule__ImageImporter__Group__2__Impl"
    // InternalExtendedIML.g:492:1: rule__ImageImporter__Group__2__Impl : ( ( rule__ImageImporter__ImportedNamespaceAssignment_2 ) ) ;
    public final void rule__ImageImporter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:496:1: ( ( ( rule__ImageImporter__ImportedNamespaceAssignment_2 ) ) )
            // InternalExtendedIML.g:497:1: ( ( rule__ImageImporter__ImportedNamespaceAssignment_2 ) )
            {
            // InternalExtendedIML.g:497:1: ( ( rule__ImageImporter__ImportedNamespaceAssignment_2 ) )
            // InternalExtendedIML.g:498:2: ( rule__ImageImporter__ImportedNamespaceAssignment_2 )
            {
             before(grammarAccess.getImageImporterAccess().getImportedNamespaceAssignment_2()); 
            // InternalExtendedIML.g:499:2: ( rule__ImageImporter__ImportedNamespaceAssignment_2 )
            // InternalExtendedIML.g:499:3: rule__ImageImporter__ImportedNamespaceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ImageImporter__ImportedNamespaceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImageImporterAccess().getImportedNamespaceAssignment_2()); 

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
    // $ANTLR end "rule__ImageImporter__Group__2__Impl"


    // $ANTLR start "rule__QualifiedPath__Group__0"
    // InternalExtendedIML.g:508:1: rule__QualifiedPath__Group__0 : rule__QualifiedPath__Group__0__Impl rule__QualifiedPath__Group__1 ;
    public final void rule__QualifiedPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:512:1: ( rule__QualifiedPath__Group__0__Impl rule__QualifiedPath__Group__1 )
            // InternalExtendedIML.g:513:2: rule__QualifiedPath__Group__0__Impl rule__QualifiedPath__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedPath__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group__1();

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
    // $ANTLR end "rule__QualifiedPath__Group__0"


    // $ANTLR start "rule__QualifiedPath__Group__0__Impl"
    // InternalExtendedIML.g:520:1: rule__QualifiedPath__Group__0__Impl : ( ( '/' )? ) ;
    public final void rule__QualifiedPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:524:1: ( ( ( '/' )? ) )
            // InternalExtendedIML.g:525:1: ( ( '/' )? )
            {
            // InternalExtendedIML.g:525:1: ( ( '/' )? )
            // InternalExtendedIML.g:526:2: ( '/' )?
            {
             before(grammarAccess.getQualifiedPathAccess().getSolidusKeyword_0()); 
            // InternalExtendedIML.g:527:2: ( '/' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalExtendedIML.g:527:3: '/'
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedPathAccess().getSolidusKeyword_0()); 

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
    // $ANTLR end "rule__QualifiedPath__Group__0__Impl"


    // $ANTLR start "rule__QualifiedPath__Group__1"
    // InternalExtendedIML.g:535:1: rule__QualifiedPath__Group__1 : rule__QualifiedPath__Group__1__Impl rule__QualifiedPath__Group__2 ;
    public final void rule__QualifiedPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:539:1: ( rule__QualifiedPath__Group__1__Impl rule__QualifiedPath__Group__2 )
            // InternalExtendedIML.g:540:2: rule__QualifiedPath__Group__1__Impl rule__QualifiedPath__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedPath__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group__2();

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
    // $ANTLR end "rule__QualifiedPath__Group__1"


    // $ANTLR start "rule__QualifiedPath__Group__1__Impl"
    // InternalExtendedIML.g:547:1: rule__QualifiedPath__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:551:1: ( ( RULE_ID ) )
            // InternalExtendedIML.g:552:1: ( RULE_ID )
            {
            // InternalExtendedIML.g:552:1: ( RULE_ID )
            // InternalExtendedIML.g:553:2: RULE_ID
            {
             before(grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__QualifiedPath__Group__1__Impl"


    // $ANTLR start "rule__QualifiedPath__Group__2"
    // InternalExtendedIML.g:562:1: rule__QualifiedPath__Group__2 : rule__QualifiedPath__Group__2__Impl rule__QualifiedPath__Group__3 ;
    public final void rule__QualifiedPath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:566:1: ( rule__QualifiedPath__Group__2__Impl rule__QualifiedPath__Group__3 )
            // InternalExtendedIML.g:567:2: rule__QualifiedPath__Group__2__Impl rule__QualifiedPath__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedPath__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group__3();

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
    // $ANTLR end "rule__QualifiedPath__Group__2"


    // $ANTLR start "rule__QualifiedPath__Group__2__Impl"
    // InternalExtendedIML.g:574:1: rule__QualifiedPath__Group__2__Impl : ( ( rule__QualifiedPath__Group_2__0 )* ) ;
    public final void rule__QualifiedPath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:578:1: ( ( ( rule__QualifiedPath__Group_2__0 )* ) )
            // InternalExtendedIML.g:579:1: ( ( rule__QualifiedPath__Group_2__0 )* )
            {
            // InternalExtendedIML.g:579:1: ( ( rule__QualifiedPath__Group_2__0 )* )
            // InternalExtendedIML.g:580:2: ( rule__QualifiedPath__Group_2__0 )*
            {
             before(grammarAccess.getQualifiedPathAccess().getGroup_2()); 
            // InternalExtendedIML.g:581:2: ( rule__QualifiedPath__Group_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==RULE_ID) ) {
                        int LA6_3 = input.LA(3);

                        if ( (LA6_3==EOF||LA6_3==RULE_ID||(LA6_3>=12 && LA6_3<=15)||(LA6_3>=17 && LA6_3<=18)) ) {
                            alt6=1;
                        }


                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalExtendedIML.g:581:3: rule__QualifiedPath__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__QualifiedPath__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQualifiedPathAccess().getGroup_2()); 

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
    // $ANTLR end "rule__QualifiedPath__Group__2__Impl"


    // $ANTLR start "rule__QualifiedPath__Group__3"
    // InternalExtendedIML.g:589:1: rule__QualifiedPath__Group__3 : rule__QualifiedPath__Group__3__Impl ;
    public final void rule__QualifiedPath__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:593:1: ( rule__QualifiedPath__Group__3__Impl )
            // InternalExtendedIML.g:594:2: rule__QualifiedPath__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group__3__Impl();

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
    // $ANTLR end "rule__QualifiedPath__Group__3"


    // $ANTLR start "rule__QualifiedPath__Group__3__Impl"
    // InternalExtendedIML.g:600:1: rule__QualifiedPath__Group__3__Impl : ( ( '/' )? ) ;
    public final void rule__QualifiedPath__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:604:1: ( ( ( '/' )? ) )
            // InternalExtendedIML.g:605:1: ( ( '/' )? )
            {
            // InternalExtendedIML.g:605:1: ( ( '/' )? )
            // InternalExtendedIML.g:606:2: ( '/' )?
            {
             before(grammarAccess.getQualifiedPathAccess().getSolidusKeyword_3()); 
            // InternalExtendedIML.g:607:2: ( '/' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalExtendedIML.g:607:3: '/'
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedPathAccess().getSolidusKeyword_3()); 

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
    // $ANTLR end "rule__QualifiedPath__Group__3__Impl"


    // $ANTLR start "rule__QualifiedPath__Group_2__0"
    // InternalExtendedIML.g:616:1: rule__QualifiedPath__Group_2__0 : rule__QualifiedPath__Group_2__0__Impl rule__QualifiedPath__Group_2__1 ;
    public final void rule__QualifiedPath__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:620:1: ( rule__QualifiedPath__Group_2__0__Impl rule__QualifiedPath__Group_2__1 )
            // InternalExtendedIML.g:621:2: rule__QualifiedPath__Group_2__0__Impl rule__QualifiedPath__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedPath__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group_2__1();

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
    // $ANTLR end "rule__QualifiedPath__Group_2__0"


    // $ANTLR start "rule__QualifiedPath__Group_2__0__Impl"
    // InternalExtendedIML.g:628:1: rule__QualifiedPath__Group_2__0__Impl : ( '/' ) ;
    public final void rule__QualifiedPath__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:632:1: ( ( '/' ) )
            // InternalExtendedIML.g:633:1: ( '/' )
            {
            // InternalExtendedIML.g:633:1: ( '/' )
            // InternalExtendedIML.g:634:2: '/'
            {
             before(grammarAccess.getQualifiedPathAccess().getSolidusKeyword_2_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getQualifiedPathAccess().getSolidusKeyword_2_0()); 

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
    // $ANTLR end "rule__QualifiedPath__Group_2__0__Impl"


    // $ANTLR start "rule__QualifiedPath__Group_2__1"
    // InternalExtendedIML.g:643:1: rule__QualifiedPath__Group_2__1 : rule__QualifiedPath__Group_2__1__Impl ;
    public final void rule__QualifiedPath__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:647:1: ( rule__QualifiedPath__Group_2__1__Impl )
            // InternalExtendedIML.g:648:2: rule__QualifiedPath__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group_2__1__Impl();

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
    // $ANTLR end "rule__QualifiedPath__Group_2__1"


    // $ANTLR start "rule__QualifiedPath__Group_2__1__Impl"
    // InternalExtendedIML.g:654:1: rule__QualifiedPath__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedPath__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:658:1: ( ( RULE_ID ) )
            // InternalExtendedIML.g:659:1: ( RULE_ID )
            {
            // InternalExtendedIML.g:659:1: ( RULE_ID )
            // InternalExtendedIML.g:660:2: RULE_ID
            {
             before(grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_2_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_2_1()); 

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
    // $ANTLR end "rule__QualifiedPath__Group_2__1__Impl"


    // $ANTLR start "rule__DirImporter__Group__0"
    // InternalExtendedIML.g:670:1: rule__DirImporter__Group__0 : rule__DirImporter__Group__0__Impl rule__DirImporter__Group__1 ;
    public final void rule__DirImporter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:674:1: ( rule__DirImporter__Group__0__Impl rule__DirImporter__Group__1 )
            // InternalExtendedIML.g:675:2: rule__DirImporter__Group__0__Impl rule__DirImporter__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__DirImporter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirImporter__Group__1();

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
    // $ANTLR end "rule__DirImporter__Group__0"


    // $ANTLR start "rule__DirImporter__Group__0__Impl"
    // InternalExtendedIML.g:682:1: rule__DirImporter__Group__0__Impl : ( 'images' ) ;
    public final void rule__DirImporter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:686:1: ( ( 'images' ) )
            // InternalExtendedIML.g:687:1: ( 'images' )
            {
            // InternalExtendedIML.g:687:1: ( 'images' )
            // InternalExtendedIML.g:688:2: 'images'
            {
             before(grammarAccess.getDirImporterAccess().getImagesKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDirImporterAccess().getImagesKeyword_0()); 

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
    // $ANTLR end "rule__DirImporter__Group__0__Impl"


    // $ANTLR start "rule__DirImporter__Group__1"
    // InternalExtendedIML.g:697:1: rule__DirImporter__Group__1 : rule__DirImporter__Group__1__Impl ;
    public final void rule__DirImporter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:701:1: ( rule__DirImporter__Group__1__Impl )
            // InternalExtendedIML.g:702:2: rule__DirImporter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirImporter__Group__1__Impl();

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
    // $ANTLR end "rule__DirImporter__Group__1"


    // $ANTLR start "rule__DirImporter__Group__1__Impl"
    // InternalExtendedIML.g:708:1: rule__DirImporter__Group__1__Impl : ( ( rule__DirImporter__PathDirAssignment_1 ) ) ;
    public final void rule__DirImporter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:712:1: ( ( ( rule__DirImporter__PathDirAssignment_1 ) ) )
            // InternalExtendedIML.g:713:1: ( ( rule__DirImporter__PathDirAssignment_1 ) )
            {
            // InternalExtendedIML.g:713:1: ( ( rule__DirImporter__PathDirAssignment_1 ) )
            // InternalExtendedIML.g:714:2: ( rule__DirImporter__PathDirAssignment_1 )
            {
             before(grammarAccess.getDirImporterAccess().getPathDirAssignment_1()); 
            // InternalExtendedIML.g:715:2: ( rule__DirImporter__PathDirAssignment_1 )
            // InternalExtendedIML.g:715:3: rule__DirImporter__PathDirAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DirImporter__PathDirAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDirImporterAccess().getPathDirAssignment_1()); 

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
    // $ANTLR end "rule__DirImporter__Group__1__Impl"


    // $ANTLR start "rule__RotateOperation__Group__0"
    // InternalExtendedIML.g:724:1: rule__RotateOperation__Group__0 : rule__RotateOperation__Group__0__Impl rule__RotateOperation__Group__1 ;
    public final void rule__RotateOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:728:1: ( rule__RotateOperation__Group__0__Impl rule__RotateOperation__Group__1 )
            // InternalExtendedIML.g:729:2: rule__RotateOperation__Group__0__Impl rule__RotateOperation__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__RotateOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateOperation__Group__1();

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
    // $ANTLR end "rule__RotateOperation__Group__0"


    // $ANTLR start "rule__RotateOperation__Group__0__Impl"
    // InternalExtendedIML.g:736:1: rule__RotateOperation__Group__0__Impl : ( 'rotate' ) ;
    public final void rule__RotateOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:740:1: ( ( 'rotate' ) )
            // InternalExtendedIML.g:741:1: ( 'rotate' )
            {
            // InternalExtendedIML.g:741:1: ( 'rotate' )
            // InternalExtendedIML.g:742:2: 'rotate'
            {
             before(grammarAccess.getRotateOperationAccess().getRotateKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRotateOperationAccess().getRotateKeyword_0()); 

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
    // $ANTLR end "rule__RotateOperation__Group__0__Impl"


    // $ANTLR start "rule__RotateOperation__Group__1"
    // InternalExtendedIML.g:751:1: rule__RotateOperation__Group__1 : rule__RotateOperation__Group__1__Impl rule__RotateOperation__Group__2 ;
    public final void rule__RotateOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:755:1: ( rule__RotateOperation__Group__1__Impl rule__RotateOperation__Group__2 )
            // InternalExtendedIML.g:756:2: rule__RotateOperation__Group__1__Impl rule__RotateOperation__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__RotateOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RotateOperation__Group__2();

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
    // $ANTLR end "rule__RotateOperation__Group__1"


    // $ANTLR start "rule__RotateOperation__Group__1__Impl"
    // InternalExtendedIML.g:763:1: rule__RotateOperation__Group__1__Impl : ( ( rule__RotateOperation__VarAssignment_1 ) ) ;
    public final void rule__RotateOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:767:1: ( ( ( rule__RotateOperation__VarAssignment_1 ) ) )
            // InternalExtendedIML.g:768:1: ( ( rule__RotateOperation__VarAssignment_1 ) )
            {
            // InternalExtendedIML.g:768:1: ( ( rule__RotateOperation__VarAssignment_1 ) )
            // InternalExtendedIML.g:769:2: ( rule__RotateOperation__VarAssignment_1 )
            {
             before(grammarAccess.getRotateOperationAccess().getVarAssignment_1()); 
            // InternalExtendedIML.g:770:2: ( rule__RotateOperation__VarAssignment_1 )
            // InternalExtendedIML.g:770:3: rule__RotateOperation__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RotateOperation__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRotateOperationAccess().getVarAssignment_1()); 

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
    // $ANTLR end "rule__RotateOperation__Group__1__Impl"


    // $ANTLR start "rule__RotateOperation__Group__2"
    // InternalExtendedIML.g:778:1: rule__RotateOperation__Group__2 : rule__RotateOperation__Group__2__Impl ;
    public final void rule__RotateOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:782:1: ( rule__RotateOperation__Group__2__Impl )
            // InternalExtendedIML.g:783:2: rule__RotateOperation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RotateOperation__Group__2__Impl();

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
    // $ANTLR end "rule__RotateOperation__Group__2"


    // $ANTLR start "rule__RotateOperation__Group__2__Impl"
    // InternalExtendedIML.g:789:1: rule__RotateOperation__Group__2__Impl : ( ( rule__RotateOperation__DegreeAssignment_2 ) ) ;
    public final void rule__RotateOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:793:1: ( ( ( rule__RotateOperation__DegreeAssignment_2 ) ) )
            // InternalExtendedIML.g:794:1: ( ( rule__RotateOperation__DegreeAssignment_2 ) )
            {
            // InternalExtendedIML.g:794:1: ( ( rule__RotateOperation__DegreeAssignment_2 ) )
            // InternalExtendedIML.g:795:2: ( rule__RotateOperation__DegreeAssignment_2 )
            {
             before(grammarAccess.getRotateOperationAccess().getDegreeAssignment_2()); 
            // InternalExtendedIML.g:796:2: ( rule__RotateOperation__DegreeAssignment_2 )
            // InternalExtendedIML.g:796:3: rule__RotateOperation__DegreeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RotateOperation__DegreeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRotateOperationAccess().getDegreeAssignment_2()); 

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
    // $ANTLR end "rule__RotateOperation__Group__2__Impl"


    // $ANTLR start "rule__FilterOperation__Group__0"
    // InternalExtendedIML.g:805:1: rule__FilterOperation__Group__0 : rule__FilterOperation__Group__0__Impl rule__FilterOperation__Group__1 ;
    public final void rule__FilterOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:809:1: ( rule__FilterOperation__Group__0__Impl rule__FilterOperation__Group__1 )
            // InternalExtendedIML.g:810:2: rule__FilterOperation__Group__0__Impl rule__FilterOperation__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__FilterOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group__1();

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
    // $ANTLR end "rule__FilterOperation__Group__0"


    // $ANTLR start "rule__FilterOperation__Group__0__Impl"
    // InternalExtendedIML.g:817:1: rule__FilterOperation__Group__0__Impl : ( 'filter' ) ;
    public final void rule__FilterOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:821:1: ( ( 'filter' ) )
            // InternalExtendedIML.g:822:1: ( 'filter' )
            {
            // InternalExtendedIML.g:822:1: ( 'filter' )
            // InternalExtendedIML.g:823:2: 'filter'
            {
             before(grammarAccess.getFilterOperationAccess().getFilterKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getFilterKeyword_0()); 

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
    // $ANTLR end "rule__FilterOperation__Group__0__Impl"


    // $ANTLR start "rule__FilterOperation__Group__1"
    // InternalExtendedIML.g:832:1: rule__FilterOperation__Group__1 : rule__FilterOperation__Group__1__Impl rule__FilterOperation__Group__2 ;
    public final void rule__FilterOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:836:1: ( rule__FilterOperation__Group__1__Impl rule__FilterOperation__Group__2 )
            // InternalExtendedIML.g:837:2: rule__FilterOperation__Group__1__Impl rule__FilterOperation__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__FilterOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group__2();

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
    // $ANTLR end "rule__FilterOperation__Group__1"


    // $ANTLR start "rule__FilterOperation__Group__1__Impl"
    // InternalExtendedIML.g:844:1: rule__FilterOperation__Group__1__Impl : ( ( rule__FilterOperation__VarAssignment_1 ) ) ;
    public final void rule__FilterOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:848:1: ( ( ( rule__FilterOperation__VarAssignment_1 ) ) )
            // InternalExtendedIML.g:849:1: ( ( rule__FilterOperation__VarAssignment_1 ) )
            {
            // InternalExtendedIML.g:849:1: ( ( rule__FilterOperation__VarAssignment_1 ) )
            // InternalExtendedIML.g:850:2: ( rule__FilterOperation__VarAssignment_1 )
            {
             before(grammarAccess.getFilterOperationAccess().getVarAssignment_1()); 
            // InternalExtendedIML.g:851:2: ( rule__FilterOperation__VarAssignment_1 )
            // InternalExtendedIML.g:851:3: rule__FilterOperation__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterOperation__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterOperationAccess().getVarAssignment_1()); 

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
    // $ANTLR end "rule__FilterOperation__Group__1__Impl"


    // $ANTLR start "rule__FilterOperation__Group__2"
    // InternalExtendedIML.g:859:1: rule__FilterOperation__Group__2 : rule__FilterOperation__Group__2__Impl ;
    public final void rule__FilterOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:863:1: ( rule__FilterOperation__Group__2__Impl )
            // InternalExtendedIML.g:864:2: rule__FilterOperation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterOperation__Group__2__Impl();

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
    // $ANTLR end "rule__FilterOperation__Group__2"


    // $ANTLR start "rule__FilterOperation__Group__2__Impl"
    // InternalExtendedIML.g:870:1: rule__FilterOperation__Group__2__Impl : ( 'gray' ) ;
    public final void rule__FilterOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:874:1: ( ( 'gray' ) )
            // InternalExtendedIML.g:875:1: ( 'gray' )
            {
            // InternalExtendedIML.g:875:1: ( 'gray' )
            // InternalExtendedIML.g:876:2: 'gray'
            {
             before(grammarAccess.getFilterOperationAccess().getGrayKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getGrayKeyword_2()); 

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
    // $ANTLR end "rule__FilterOperation__Group__2__Impl"


    // $ANTLR start "rule__BlurOperation__Group__0"
    // InternalExtendedIML.g:886:1: rule__BlurOperation__Group__0 : rule__BlurOperation__Group__0__Impl rule__BlurOperation__Group__1 ;
    public final void rule__BlurOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:890:1: ( rule__BlurOperation__Group__0__Impl rule__BlurOperation__Group__1 )
            // InternalExtendedIML.g:891:2: rule__BlurOperation__Group__0__Impl rule__BlurOperation__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__BlurOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlurOperation__Group__1();

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
    // $ANTLR end "rule__BlurOperation__Group__0"


    // $ANTLR start "rule__BlurOperation__Group__0__Impl"
    // InternalExtendedIML.g:898:1: rule__BlurOperation__Group__0__Impl : ( 'blur' ) ;
    public final void rule__BlurOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:902:1: ( ( 'blur' ) )
            // InternalExtendedIML.g:903:1: ( 'blur' )
            {
            // InternalExtendedIML.g:903:1: ( 'blur' )
            // InternalExtendedIML.g:904:2: 'blur'
            {
             before(grammarAccess.getBlurOperationAccess().getBlurKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBlurOperationAccess().getBlurKeyword_0()); 

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
    // $ANTLR end "rule__BlurOperation__Group__0__Impl"


    // $ANTLR start "rule__BlurOperation__Group__1"
    // InternalExtendedIML.g:913:1: rule__BlurOperation__Group__1 : rule__BlurOperation__Group__1__Impl ;
    public final void rule__BlurOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:917:1: ( rule__BlurOperation__Group__1__Impl )
            // InternalExtendedIML.g:918:2: rule__BlurOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlurOperation__Group__1__Impl();

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
    // $ANTLR end "rule__BlurOperation__Group__1"


    // $ANTLR start "rule__BlurOperation__Group__1__Impl"
    // InternalExtendedIML.g:924:1: rule__BlurOperation__Group__1__Impl : ( ( rule__BlurOperation__VarAssignment_1 ) ) ;
    public final void rule__BlurOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:928:1: ( ( ( rule__BlurOperation__VarAssignment_1 ) ) )
            // InternalExtendedIML.g:929:1: ( ( rule__BlurOperation__VarAssignment_1 ) )
            {
            // InternalExtendedIML.g:929:1: ( ( rule__BlurOperation__VarAssignment_1 ) )
            // InternalExtendedIML.g:930:2: ( rule__BlurOperation__VarAssignment_1 )
            {
             before(grammarAccess.getBlurOperationAccess().getVarAssignment_1()); 
            // InternalExtendedIML.g:931:2: ( rule__BlurOperation__VarAssignment_1 )
            // InternalExtendedIML.g:931:3: rule__BlurOperation__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BlurOperation__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBlurOperationAccess().getVarAssignment_1()); 

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
    // $ANTLR end "rule__BlurOperation__Group__1__Impl"


    // $ANTLR start "rule__EqualizeOperation__Group__0"
    // InternalExtendedIML.g:940:1: rule__EqualizeOperation__Group__0 : rule__EqualizeOperation__Group__0__Impl rule__EqualizeOperation__Group__1 ;
    public final void rule__EqualizeOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:944:1: ( rule__EqualizeOperation__Group__0__Impl rule__EqualizeOperation__Group__1 )
            // InternalExtendedIML.g:945:2: rule__EqualizeOperation__Group__0__Impl rule__EqualizeOperation__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EqualizeOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EqualizeOperation__Group__1();

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
    // $ANTLR end "rule__EqualizeOperation__Group__0"


    // $ANTLR start "rule__EqualizeOperation__Group__0__Impl"
    // InternalExtendedIML.g:952:1: rule__EqualizeOperation__Group__0__Impl : ( 'equalize' ) ;
    public final void rule__EqualizeOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:956:1: ( ( 'equalize' ) )
            // InternalExtendedIML.g:957:1: ( 'equalize' )
            {
            // InternalExtendedIML.g:957:1: ( 'equalize' )
            // InternalExtendedIML.g:958:2: 'equalize'
            {
             before(grammarAccess.getEqualizeOperationAccess().getEqualizeKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEqualizeOperationAccess().getEqualizeKeyword_0()); 

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
    // $ANTLR end "rule__EqualizeOperation__Group__0__Impl"


    // $ANTLR start "rule__EqualizeOperation__Group__1"
    // InternalExtendedIML.g:967:1: rule__EqualizeOperation__Group__1 : rule__EqualizeOperation__Group__1__Impl ;
    public final void rule__EqualizeOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:971:1: ( rule__EqualizeOperation__Group__1__Impl )
            // InternalExtendedIML.g:972:2: rule__EqualizeOperation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EqualizeOperation__Group__1__Impl();

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
    // $ANTLR end "rule__EqualizeOperation__Group__1"


    // $ANTLR start "rule__EqualizeOperation__Group__1__Impl"
    // InternalExtendedIML.g:978:1: rule__EqualizeOperation__Group__1__Impl : ( ( rule__EqualizeOperation__VarAssignment_1 ) ) ;
    public final void rule__EqualizeOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:982:1: ( ( ( rule__EqualizeOperation__VarAssignment_1 ) ) )
            // InternalExtendedIML.g:983:1: ( ( rule__EqualizeOperation__VarAssignment_1 ) )
            {
            // InternalExtendedIML.g:983:1: ( ( rule__EqualizeOperation__VarAssignment_1 ) )
            // InternalExtendedIML.g:984:2: ( rule__EqualizeOperation__VarAssignment_1 )
            {
             before(grammarAccess.getEqualizeOperationAccess().getVarAssignment_1()); 
            // InternalExtendedIML.g:985:2: ( rule__EqualizeOperation__VarAssignment_1 )
            // InternalExtendedIML.g:985:3: rule__EqualizeOperation__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EqualizeOperation__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualizeOperationAccess().getVarAssignment_1()); 

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
    // $ANTLR end "rule__EqualizeOperation__Group__1__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalExtendedIML.g:994:1: rule__Model__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:998:1: ( ( ruleAbstractElement ) )
            // InternalExtendedIML.g:999:2: ( ruleAbstractElement )
            {
            // InternalExtendedIML.g:999:2: ( ruleAbstractElement )
            // InternalExtendedIML.g:1000:3: ruleAbstractElement
            {
             before(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__ImageImporter__NameAssignment_0"
    // InternalExtendedIML.g:1009:1: rule__ImageImporter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ImageImporter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1013:1: ( ( RULE_ID ) )
            // InternalExtendedIML.g:1014:2: ( RULE_ID )
            {
            // InternalExtendedIML.g:1014:2: ( RULE_ID )
            // InternalExtendedIML.g:1015:3: RULE_ID
            {
             before(grammarAccess.getImageImporterAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImageImporterAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ImageImporter__NameAssignment_0"


    // $ANTLR start "rule__ImageImporter__ImportedNamespaceAssignment_2"
    // InternalExtendedIML.g:1024:1: rule__ImageImporter__ImportedNamespaceAssignment_2 : ( ruleQualifiedImageName ) ;
    public final void rule__ImageImporter__ImportedNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1028:1: ( ( ruleQualifiedImageName ) )
            // InternalExtendedIML.g:1029:2: ( ruleQualifiedImageName )
            {
            // InternalExtendedIML.g:1029:2: ( ruleQualifiedImageName )
            // InternalExtendedIML.g:1030:3: ruleQualifiedImageName
            {
             before(grammarAccess.getImageImporterAccess().getImportedNamespaceQualifiedImageNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedImageName();

            state._fsp--;

             after(grammarAccess.getImageImporterAccess().getImportedNamespaceQualifiedImageNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ImageImporter__ImportedNamespaceAssignment_2"


    // $ANTLR start "rule__DirImporter__PathDirAssignment_1"
    // InternalExtendedIML.g:1039:1: rule__DirImporter__PathDirAssignment_1 : ( ruleQualifiedPath ) ;
    public final void rule__DirImporter__PathDirAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1043:1: ( ( ruleQualifiedPath ) )
            // InternalExtendedIML.g:1044:2: ( ruleQualifiedPath )
            {
            // InternalExtendedIML.g:1044:2: ( ruleQualifiedPath )
            // InternalExtendedIML.g:1045:3: ruleQualifiedPath
            {
             before(grammarAccess.getDirImporterAccess().getPathDirQualifiedPathParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedPath();

            state._fsp--;

             after(grammarAccess.getDirImporterAccess().getPathDirQualifiedPathParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DirImporter__PathDirAssignment_1"


    // $ANTLR start "rule__RotateOperation__VarAssignment_1"
    // InternalExtendedIML.g:1054:1: rule__RotateOperation__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__RotateOperation__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1058:1: ( ( RULE_ID ) )
            // InternalExtendedIML.g:1059:2: ( RULE_ID )
            {
            // InternalExtendedIML.g:1059:2: ( RULE_ID )
            // InternalExtendedIML.g:1060:3: RULE_ID
            {
             before(grammarAccess.getRotateOperationAccess().getVarIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRotateOperationAccess().getVarIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__RotateOperation__VarAssignment_1"


    // $ANTLR start "rule__RotateOperation__DegreeAssignment_2"
    // InternalExtendedIML.g:1069:1: rule__RotateOperation__DegreeAssignment_2 : ( RULE_INT ) ;
    public final void rule__RotateOperation__DegreeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1073:1: ( ( RULE_INT ) )
            // InternalExtendedIML.g:1074:2: ( RULE_INT )
            {
            // InternalExtendedIML.g:1074:2: ( RULE_INT )
            // InternalExtendedIML.g:1075:3: RULE_INT
            {
             before(grammarAccess.getRotateOperationAccess().getDegreeINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRotateOperationAccess().getDegreeINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__RotateOperation__DegreeAssignment_2"


    // $ANTLR start "rule__FilterOperation__VarAssignment_1"
    // InternalExtendedIML.g:1084:1: rule__FilterOperation__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__FilterOperation__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1088:1: ( ( RULE_ID ) )
            // InternalExtendedIML.g:1089:2: ( RULE_ID )
            {
            // InternalExtendedIML.g:1089:2: ( RULE_ID )
            // InternalExtendedIML.g:1090:3: RULE_ID
            {
             before(grammarAccess.getFilterOperationAccess().getVarIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFilterOperationAccess().getVarIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__FilterOperation__VarAssignment_1"


    // $ANTLR start "rule__BlurOperation__VarAssignment_1"
    // InternalExtendedIML.g:1099:1: rule__BlurOperation__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__BlurOperation__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1103:1: ( ( RULE_ID ) )
            // InternalExtendedIML.g:1104:2: ( RULE_ID )
            {
            // InternalExtendedIML.g:1104:2: ( RULE_ID )
            // InternalExtendedIML.g:1105:3: RULE_ID
            {
             before(grammarAccess.getBlurOperationAccess().getVarIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBlurOperationAccess().getVarIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__BlurOperation__VarAssignment_1"


    // $ANTLR start "rule__EqualizeOperation__VarAssignment_1"
    // InternalExtendedIML.g:1114:1: rule__EqualizeOperation__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__EqualizeOperation__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1118:1: ( ( RULE_ID ) )
            // InternalExtendedIML.g:1119:2: ( RULE_ID )
            {
            // InternalExtendedIML.g:1119:2: ( RULE_ID )
            // InternalExtendedIML.g:1120:3: RULE_ID
            {
             before(grammarAccess.getEqualizeOperationAccess().getVarIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEqualizeOperationAccess().getVarIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__EqualizeOperation__VarAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000006E012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});

}