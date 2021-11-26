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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'save'", "'show'", "'='", "'/'", "'.'", "'images'", "'rotate'", "'filter'", "'gray'", "'blur'", "'equalize'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

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

                if ( (LA1_0==RULE_ID||(LA1_0>=11 && LA1_0<=12)||(LA1_0>=16 && LA1_0<=18)||(LA1_0>=20 && LA1_0<=21)) ) {
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


    // $ANTLR start "entryRuleExporter"
    // InternalExtendedIML.g:103:1: entryRuleExporter : ruleExporter EOF ;
    public final void entryRuleExporter() throws RecognitionException {
        try {
            // InternalExtendedIML.g:104:1: ( ruleExporter EOF )
            // InternalExtendedIML.g:105:1: ruleExporter EOF
            {
             before(grammarAccess.getExporterRule()); 
            pushFollow(FOLLOW_1);
            ruleExporter();

            state._fsp--;

             after(grammarAccess.getExporterRule()); 
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
    // $ANTLR end "entryRuleExporter"


    // $ANTLR start "ruleExporter"
    // InternalExtendedIML.g:112:1: ruleExporter : ( ( rule__Exporter__Alternatives ) ) ;
    public final void ruleExporter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:116:2: ( ( ( rule__Exporter__Alternatives ) ) )
            // InternalExtendedIML.g:117:2: ( ( rule__Exporter__Alternatives ) )
            {
            // InternalExtendedIML.g:117:2: ( ( rule__Exporter__Alternatives ) )
            // InternalExtendedIML.g:118:3: ( rule__Exporter__Alternatives )
            {
             before(grammarAccess.getExporterAccess().getAlternatives()); 
            // InternalExtendedIML.g:119:3: ( rule__Exporter__Alternatives )
            // InternalExtendedIML.g:119:4: rule__Exporter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Exporter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExporterAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExporter"


    // $ANTLR start "entryRuleSave"
    // InternalExtendedIML.g:128:1: entryRuleSave : ruleSave EOF ;
    public final void entryRuleSave() throws RecognitionException {
        try {
            // InternalExtendedIML.g:129:1: ( ruleSave EOF )
            // InternalExtendedIML.g:130:1: ruleSave EOF
            {
             before(grammarAccess.getSaveRule()); 
            pushFollow(FOLLOW_1);
            ruleSave();

            state._fsp--;

             after(grammarAccess.getSaveRule()); 
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
    // $ANTLR end "entryRuleSave"


    // $ANTLR start "ruleSave"
    // InternalExtendedIML.g:137:1: ruleSave : ( ( rule__Save__Group__0 ) ) ;
    public final void ruleSave() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:141:2: ( ( ( rule__Save__Group__0 ) ) )
            // InternalExtendedIML.g:142:2: ( ( rule__Save__Group__0 ) )
            {
            // InternalExtendedIML.g:142:2: ( ( rule__Save__Group__0 ) )
            // InternalExtendedIML.g:143:3: ( rule__Save__Group__0 )
            {
             before(grammarAccess.getSaveAccess().getGroup()); 
            // InternalExtendedIML.g:144:3: ( rule__Save__Group__0 )
            // InternalExtendedIML.g:144:4: rule__Save__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Save__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSaveAccess().getGroup()); 

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
    // $ANTLR end "ruleSave"


    // $ANTLR start "entryRuleShow"
    // InternalExtendedIML.g:153:1: entryRuleShow : ruleShow EOF ;
    public final void entryRuleShow() throws RecognitionException {
        try {
            // InternalExtendedIML.g:154:1: ( ruleShow EOF )
            // InternalExtendedIML.g:155:1: ruleShow EOF
            {
             before(grammarAccess.getShowRule()); 
            pushFollow(FOLLOW_1);
            ruleShow();

            state._fsp--;

             after(grammarAccess.getShowRule()); 
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
    // $ANTLR end "entryRuleShow"


    // $ANTLR start "ruleShow"
    // InternalExtendedIML.g:162:1: ruleShow : ( ( rule__Show__Group__0 ) ) ;
    public final void ruleShow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:166:2: ( ( ( rule__Show__Group__0 ) ) )
            // InternalExtendedIML.g:167:2: ( ( rule__Show__Group__0 ) )
            {
            // InternalExtendedIML.g:167:2: ( ( rule__Show__Group__0 ) )
            // InternalExtendedIML.g:168:3: ( rule__Show__Group__0 )
            {
             before(grammarAccess.getShowAccess().getGroup()); 
            // InternalExtendedIML.g:169:3: ( rule__Show__Group__0 )
            // InternalExtendedIML.g:169:4: rule__Show__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Show__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getShowAccess().getGroup()); 

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
    // $ANTLR end "ruleShow"


    // $ANTLR start "entryRuleImporter"
    // InternalExtendedIML.g:178:1: entryRuleImporter : ruleImporter EOF ;
    public final void entryRuleImporter() throws RecognitionException {
        try {
            // InternalExtendedIML.g:179:1: ( ruleImporter EOF )
            // InternalExtendedIML.g:180:1: ruleImporter EOF
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
    // InternalExtendedIML.g:187:1: ruleImporter : ( ( rule__Importer__Alternatives ) ) ;
    public final void ruleImporter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:191:2: ( ( ( rule__Importer__Alternatives ) ) )
            // InternalExtendedIML.g:192:2: ( ( rule__Importer__Alternatives ) )
            {
            // InternalExtendedIML.g:192:2: ( ( rule__Importer__Alternatives ) )
            // InternalExtendedIML.g:193:3: ( rule__Importer__Alternatives )
            {
             before(grammarAccess.getImporterAccess().getAlternatives()); 
            // InternalExtendedIML.g:194:3: ( rule__Importer__Alternatives )
            // InternalExtendedIML.g:194:4: rule__Importer__Alternatives
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
    // InternalExtendedIML.g:203:1: entryRuleImageImporter : ruleImageImporter EOF ;
    public final void entryRuleImageImporter() throws RecognitionException {
        try {
            // InternalExtendedIML.g:204:1: ( ruleImageImporter EOF )
            // InternalExtendedIML.g:205:1: ruleImageImporter EOF
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
    // InternalExtendedIML.g:212:1: ruleImageImporter : ( ( rule__ImageImporter__Group__0 ) ) ;
    public final void ruleImageImporter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:216:2: ( ( ( rule__ImageImporter__Group__0 ) ) )
            // InternalExtendedIML.g:217:2: ( ( rule__ImageImporter__Group__0 ) )
            {
            // InternalExtendedIML.g:217:2: ( ( rule__ImageImporter__Group__0 ) )
            // InternalExtendedIML.g:218:3: ( rule__ImageImporter__Group__0 )
            {
             before(grammarAccess.getImageImporterAccess().getGroup()); 
            // InternalExtendedIML.g:219:3: ( rule__ImageImporter__Group__0 )
            // InternalExtendedIML.g:219:4: rule__ImageImporter__Group__0
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
    // InternalExtendedIML.g:228:1: entryRuleQualifiedImageName : ruleQualifiedImageName EOF ;
    public final void entryRuleQualifiedImageName() throws RecognitionException {
        try {
            // InternalExtendedIML.g:229:1: ( ruleQualifiedImageName EOF )
            // InternalExtendedIML.g:230:1: ruleQualifiedImageName EOF
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
    // InternalExtendedIML.g:237:1: ruleQualifiedImageName : ( RULE_ID ) ;
    public final void ruleQualifiedImageName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:241:2: ( ( RULE_ID ) )
            // InternalExtendedIML.g:242:2: ( RULE_ID )
            {
            // InternalExtendedIML.g:242:2: ( RULE_ID )
            // InternalExtendedIML.g:243:3: RULE_ID
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
    // InternalExtendedIML.g:253:1: entryRuleQualifiedPath : ruleQualifiedPath EOF ;
    public final void entryRuleQualifiedPath() throws RecognitionException {
        try {
            // InternalExtendedIML.g:254:1: ( ruleQualifiedPath EOF )
            // InternalExtendedIML.g:255:1: ruleQualifiedPath EOF
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
    // InternalExtendedIML.g:262:1: ruleQualifiedPath : ( ( rule__QualifiedPath__Group__0 ) ) ;
    public final void ruleQualifiedPath() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:266:2: ( ( ( rule__QualifiedPath__Group__0 ) ) )
            // InternalExtendedIML.g:267:2: ( ( rule__QualifiedPath__Group__0 ) )
            {
            // InternalExtendedIML.g:267:2: ( ( rule__QualifiedPath__Group__0 ) )
            // InternalExtendedIML.g:268:3: ( rule__QualifiedPath__Group__0 )
            {
             before(grammarAccess.getQualifiedPathAccess().getGroup()); 
            // InternalExtendedIML.g:269:3: ( rule__QualifiedPath__Group__0 )
            // InternalExtendedIML.g:269:4: rule__QualifiedPath__Group__0
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
    // InternalExtendedIML.g:278:1: entryRuleDirImporter : ruleDirImporter EOF ;
    public final void entryRuleDirImporter() throws RecognitionException {
        try {
            // InternalExtendedIML.g:279:1: ( ruleDirImporter EOF )
            // InternalExtendedIML.g:280:1: ruleDirImporter EOF
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
    // InternalExtendedIML.g:287:1: ruleDirImporter : ( ( rule__DirImporter__Group__0 ) ) ;
    public final void ruleDirImporter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:291:2: ( ( ( rule__DirImporter__Group__0 ) ) )
            // InternalExtendedIML.g:292:2: ( ( rule__DirImporter__Group__0 ) )
            {
            // InternalExtendedIML.g:292:2: ( ( rule__DirImporter__Group__0 ) )
            // InternalExtendedIML.g:293:3: ( rule__DirImporter__Group__0 )
            {
             before(grammarAccess.getDirImporterAccess().getGroup()); 
            // InternalExtendedIML.g:294:3: ( rule__DirImporter__Group__0 )
            // InternalExtendedIML.g:294:4: rule__DirImporter__Group__0
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
    // InternalExtendedIML.g:303:1: entryRuleOperator : ruleOperator EOF ;
    public final void entryRuleOperator() throws RecognitionException {
        try {
            // InternalExtendedIML.g:304:1: ( ruleOperator EOF )
            // InternalExtendedIML.g:305:1: ruleOperator EOF
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
    // InternalExtendedIML.g:312:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:316:2: ( ( ( rule__Operator__Alternatives ) ) )
            // InternalExtendedIML.g:317:2: ( ( rule__Operator__Alternatives ) )
            {
            // InternalExtendedIML.g:317:2: ( ( rule__Operator__Alternatives ) )
            // InternalExtendedIML.g:318:3: ( rule__Operator__Alternatives )
            {
             before(grammarAccess.getOperatorAccess().getAlternatives()); 
            // InternalExtendedIML.g:319:3: ( rule__Operator__Alternatives )
            // InternalExtendedIML.g:319:4: rule__Operator__Alternatives
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
    // InternalExtendedIML.g:328:1: entryRuleRotateOperation : ruleRotateOperation EOF ;
    public final void entryRuleRotateOperation() throws RecognitionException {
        try {
            // InternalExtendedIML.g:329:1: ( ruleRotateOperation EOF )
            // InternalExtendedIML.g:330:1: ruleRotateOperation EOF
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
    // InternalExtendedIML.g:337:1: ruleRotateOperation : ( ( rule__RotateOperation__Group__0 ) ) ;
    public final void ruleRotateOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:341:2: ( ( ( rule__RotateOperation__Group__0 ) ) )
            // InternalExtendedIML.g:342:2: ( ( rule__RotateOperation__Group__0 ) )
            {
            // InternalExtendedIML.g:342:2: ( ( rule__RotateOperation__Group__0 ) )
            // InternalExtendedIML.g:343:3: ( rule__RotateOperation__Group__0 )
            {
             before(grammarAccess.getRotateOperationAccess().getGroup()); 
            // InternalExtendedIML.g:344:3: ( rule__RotateOperation__Group__0 )
            // InternalExtendedIML.g:344:4: rule__RotateOperation__Group__0
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
    // InternalExtendedIML.g:353:1: entryRuleFilterOperation : ruleFilterOperation EOF ;
    public final void entryRuleFilterOperation() throws RecognitionException {
        try {
            // InternalExtendedIML.g:354:1: ( ruleFilterOperation EOF )
            // InternalExtendedIML.g:355:1: ruleFilterOperation EOF
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
    // InternalExtendedIML.g:362:1: ruleFilterOperation : ( ( rule__FilterOperation__Group__0 ) ) ;
    public final void ruleFilterOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:366:2: ( ( ( rule__FilterOperation__Group__0 ) ) )
            // InternalExtendedIML.g:367:2: ( ( rule__FilterOperation__Group__0 ) )
            {
            // InternalExtendedIML.g:367:2: ( ( rule__FilterOperation__Group__0 ) )
            // InternalExtendedIML.g:368:3: ( rule__FilterOperation__Group__0 )
            {
             before(grammarAccess.getFilterOperationAccess().getGroup()); 
            // InternalExtendedIML.g:369:3: ( rule__FilterOperation__Group__0 )
            // InternalExtendedIML.g:369:4: rule__FilterOperation__Group__0
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
    // InternalExtendedIML.g:378:1: entryRuleBlurOperation : ruleBlurOperation EOF ;
    public final void entryRuleBlurOperation() throws RecognitionException {
        try {
            // InternalExtendedIML.g:379:1: ( ruleBlurOperation EOF )
            // InternalExtendedIML.g:380:1: ruleBlurOperation EOF
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
    // InternalExtendedIML.g:387:1: ruleBlurOperation : ( ( rule__BlurOperation__Group__0 ) ) ;
    public final void ruleBlurOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:391:2: ( ( ( rule__BlurOperation__Group__0 ) ) )
            // InternalExtendedIML.g:392:2: ( ( rule__BlurOperation__Group__0 ) )
            {
            // InternalExtendedIML.g:392:2: ( ( rule__BlurOperation__Group__0 ) )
            // InternalExtendedIML.g:393:3: ( rule__BlurOperation__Group__0 )
            {
             before(grammarAccess.getBlurOperationAccess().getGroup()); 
            // InternalExtendedIML.g:394:3: ( rule__BlurOperation__Group__0 )
            // InternalExtendedIML.g:394:4: rule__BlurOperation__Group__0
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
    // InternalExtendedIML.g:403:1: entryRuleEqualizeOperation : ruleEqualizeOperation EOF ;
    public final void entryRuleEqualizeOperation() throws RecognitionException {
        try {
            // InternalExtendedIML.g:404:1: ( ruleEqualizeOperation EOF )
            // InternalExtendedIML.g:405:1: ruleEqualizeOperation EOF
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
    // InternalExtendedIML.g:412:1: ruleEqualizeOperation : ( ( rule__EqualizeOperation__Group__0 ) ) ;
    public final void ruleEqualizeOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:416:2: ( ( ( rule__EqualizeOperation__Group__0 ) ) )
            // InternalExtendedIML.g:417:2: ( ( rule__EqualizeOperation__Group__0 ) )
            {
            // InternalExtendedIML.g:417:2: ( ( rule__EqualizeOperation__Group__0 ) )
            // InternalExtendedIML.g:418:3: ( rule__EqualizeOperation__Group__0 )
            {
             before(grammarAccess.getEqualizeOperationAccess().getGroup()); 
            // InternalExtendedIML.g:419:3: ( rule__EqualizeOperation__Group__0 )
            // InternalExtendedIML.g:419:4: rule__EqualizeOperation__Group__0
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
    // InternalExtendedIML.g:427:1: rule__AbstractElement__Alternatives : ( ( ruleImporter ) | ( ruleOperator ) | ( ruleExporter ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:431:1: ( ( ruleImporter ) | ( ruleOperator ) | ( ruleExporter ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 16:
                {
                alt2=1;
                }
                break;
            case 17:
            case 18:
            case 20:
            case 21:
                {
                alt2=2;
                }
                break;
            case 11:
            case 12:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalExtendedIML.g:432:2: ( ruleImporter )
                    {
                    // InternalExtendedIML.g:432:2: ( ruleImporter )
                    // InternalExtendedIML.g:433:3: ruleImporter
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
                    // InternalExtendedIML.g:438:2: ( ruleOperator )
                    {
                    // InternalExtendedIML.g:438:2: ( ruleOperator )
                    // InternalExtendedIML.g:439:3: ruleOperator
                    {
                     before(grammarAccess.getAbstractElementAccess().getOperatorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOperator();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getOperatorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalExtendedIML.g:444:2: ( ruleExporter )
                    {
                    // InternalExtendedIML.g:444:2: ( ruleExporter )
                    // InternalExtendedIML.g:445:3: ruleExporter
                    {
                     before(grammarAccess.getAbstractElementAccess().getExporterParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleExporter();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getExporterParserRuleCall_2()); 

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


    // $ANTLR start "rule__Exporter__Alternatives"
    // InternalExtendedIML.g:454:1: rule__Exporter__Alternatives : ( ( ruleSave ) | ( ruleShow ) );
    public final void rule__Exporter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:458:1: ( ( ruleSave ) | ( ruleShow ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalExtendedIML.g:459:2: ( ruleSave )
                    {
                    // InternalExtendedIML.g:459:2: ( ruleSave )
                    // InternalExtendedIML.g:460:3: ruleSave
                    {
                     before(grammarAccess.getExporterAccess().getSaveParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSave();

                    state._fsp--;

                     after(grammarAccess.getExporterAccess().getSaveParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalExtendedIML.g:465:2: ( ruleShow )
                    {
                    // InternalExtendedIML.g:465:2: ( ruleShow )
                    // InternalExtendedIML.g:466:3: ruleShow
                    {
                     before(grammarAccess.getExporterAccess().getShowParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleShow();

                    state._fsp--;

                     after(grammarAccess.getExporterAccess().getShowParserRuleCall_1()); 

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
    // $ANTLR end "rule__Exporter__Alternatives"


    // $ANTLR start "rule__Importer__Alternatives"
    // InternalExtendedIML.g:475:1: rule__Importer__Alternatives : ( ( ruleImageImporter ) | ( ruleDirImporter ) );
    public final void rule__Importer__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:479:1: ( ( ruleImageImporter ) | ( ruleDirImporter ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalExtendedIML.g:480:2: ( ruleImageImporter )
                    {
                    // InternalExtendedIML.g:480:2: ( ruleImageImporter )
                    // InternalExtendedIML.g:481:3: ruleImageImporter
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
                    // InternalExtendedIML.g:486:2: ( ruleDirImporter )
                    {
                    // InternalExtendedIML.g:486:2: ( ruleDirImporter )
                    // InternalExtendedIML.g:487:3: ruleDirImporter
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
    // InternalExtendedIML.g:496:1: rule__Operator__Alternatives : ( ( ruleRotateOperation ) | ( ruleFilterOperation ) | ( ruleBlurOperation ) | ( ruleEqualizeOperation ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:500:1: ( ( ruleRotateOperation ) | ( ruleFilterOperation ) | ( ruleBlurOperation ) | ( ruleEqualizeOperation ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            case 21:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalExtendedIML.g:501:2: ( ruleRotateOperation )
                    {
                    // InternalExtendedIML.g:501:2: ( ruleRotateOperation )
                    // InternalExtendedIML.g:502:3: ruleRotateOperation
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
                    // InternalExtendedIML.g:507:2: ( ruleFilterOperation )
                    {
                    // InternalExtendedIML.g:507:2: ( ruleFilterOperation )
                    // InternalExtendedIML.g:508:3: ruleFilterOperation
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
                    // InternalExtendedIML.g:513:2: ( ruleBlurOperation )
                    {
                    // InternalExtendedIML.g:513:2: ( ruleBlurOperation )
                    // InternalExtendedIML.g:514:3: ruleBlurOperation
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
                    // InternalExtendedIML.g:519:2: ( ruleEqualizeOperation )
                    {
                    // InternalExtendedIML.g:519:2: ( ruleEqualizeOperation )
                    // InternalExtendedIML.g:520:3: ruleEqualizeOperation
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


    // $ANTLR start "rule__Save__Group__0"
    // InternalExtendedIML.g:529:1: rule__Save__Group__0 : rule__Save__Group__0__Impl rule__Save__Group__1 ;
    public final void rule__Save__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:533:1: ( rule__Save__Group__0__Impl rule__Save__Group__1 )
            // InternalExtendedIML.g:534:2: rule__Save__Group__0__Impl rule__Save__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Save__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Save__Group__1();

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
    // $ANTLR end "rule__Save__Group__0"


    // $ANTLR start "rule__Save__Group__0__Impl"
    // InternalExtendedIML.g:541:1: rule__Save__Group__0__Impl : ( 'save' ) ;
    public final void rule__Save__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:545:1: ( ( 'save' ) )
            // InternalExtendedIML.g:546:1: ( 'save' )
            {
            // InternalExtendedIML.g:546:1: ( 'save' )
            // InternalExtendedIML.g:547:2: 'save'
            {
             before(grammarAccess.getSaveAccess().getSaveKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSaveAccess().getSaveKeyword_0()); 

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
    // $ANTLR end "rule__Save__Group__0__Impl"


    // $ANTLR start "rule__Save__Group__1"
    // InternalExtendedIML.g:556:1: rule__Save__Group__1 : rule__Save__Group__1__Impl ;
    public final void rule__Save__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:560:1: ( rule__Save__Group__1__Impl )
            // InternalExtendedIML.g:561:2: rule__Save__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Save__Group__1__Impl();

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
    // $ANTLR end "rule__Save__Group__1"


    // $ANTLR start "rule__Save__Group__1__Impl"
    // InternalExtendedIML.g:567:1: rule__Save__Group__1__Impl : ( ( rule__Save__VarAssignment_1 ) ) ;
    public final void rule__Save__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:571:1: ( ( ( rule__Save__VarAssignment_1 ) ) )
            // InternalExtendedIML.g:572:1: ( ( rule__Save__VarAssignment_1 ) )
            {
            // InternalExtendedIML.g:572:1: ( ( rule__Save__VarAssignment_1 ) )
            // InternalExtendedIML.g:573:2: ( rule__Save__VarAssignment_1 )
            {
             before(grammarAccess.getSaveAccess().getVarAssignment_1()); 
            // InternalExtendedIML.g:574:2: ( rule__Save__VarAssignment_1 )
            // InternalExtendedIML.g:574:3: rule__Save__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Save__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSaveAccess().getVarAssignment_1()); 

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
    // $ANTLR end "rule__Save__Group__1__Impl"


    // $ANTLR start "rule__Show__Group__0"
    // InternalExtendedIML.g:583:1: rule__Show__Group__0 : rule__Show__Group__0__Impl rule__Show__Group__1 ;
    public final void rule__Show__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:587:1: ( rule__Show__Group__0__Impl rule__Show__Group__1 )
            // InternalExtendedIML.g:588:2: rule__Show__Group__0__Impl rule__Show__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Show__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Show__Group__1();

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
    // $ANTLR end "rule__Show__Group__0"


    // $ANTLR start "rule__Show__Group__0__Impl"
    // InternalExtendedIML.g:595:1: rule__Show__Group__0__Impl : ( 'show' ) ;
    public final void rule__Show__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:599:1: ( ( 'show' ) )
            // InternalExtendedIML.g:600:1: ( 'show' )
            {
            // InternalExtendedIML.g:600:1: ( 'show' )
            // InternalExtendedIML.g:601:2: 'show'
            {
             before(grammarAccess.getShowAccess().getShowKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getShowAccess().getShowKeyword_0()); 

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
    // $ANTLR end "rule__Show__Group__0__Impl"


    // $ANTLR start "rule__Show__Group__1"
    // InternalExtendedIML.g:610:1: rule__Show__Group__1 : rule__Show__Group__1__Impl ;
    public final void rule__Show__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:614:1: ( rule__Show__Group__1__Impl )
            // InternalExtendedIML.g:615:2: rule__Show__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Show__Group__1__Impl();

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
    // $ANTLR end "rule__Show__Group__1"


    // $ANTLR start "rule__Show__Group__1__Impl"
    // InternalExtendedIML.g:621:1: rule__Show__Group__1__Impl : ( ( rule__Show__VarAssignment_1 ) ) ;
    public final void rule__Show__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:625:1: ( ( ( rule__Show__VarAssignment_1 ) ) )
            // InternalExtendedIML.g:626:1: ( ( rule__Show__VarAssignment_1 ) )
            {
            // InternalExtendedIML.g:626:1: ( ( rule__Show__VarAssignment_1 ) )
            // InternalExtendedIML.g:627:2: ( rule__Show__VarAssignment_1 )
            {
             before(grammarAccess.getShowAccess().getVarAssignment_1()); 
            // InternalExtendedIML.g:628:2: ( rule__Show__VarAssignment_1 )
            // InternalExtendedIML.g:628:3: rule__Show__VarAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Show__VarAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getShowAccess().getVarAssignment_1()); 

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
    // $ANTLR end "rule__Show__Group__1__Impl"


    // $ANTLR start "rule__ImageImporter__Group__0"
    // InternalExtendedIML.g:637:1: rule__ImageImporter__Group__0 : rule__ImageImporter__Group__0__Impl rule__ImageImporter__Group__1 ;
    public final void rule__ImageImporter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:641:1: ( rule__ImageImporter__Group__0__Impl rule__ImageImporter__Group__1 )
            // InternalExtendedIML.g:642:2: rule__ImageImporter__Group__0__Impl rule__ImageImporter__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalExtendedIML.g:649:1: rule__ImageImporter__Group__0__Impl : ( ( rule__ImageImporter__NameAssignment_0 ) ) ;
    public final void rule__ImageImporter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:653:1: ( ( ( rule__ImageImporter__NameAssignment_0 ) ) )
            // InternalExtendedIML.g:654:1: ( ( rule__ImageImporter__NameAssignment_0 ) )
            {
            // InternalExtendedIML.g:654:1: ( ( rule__ImageImporter__NameAssignment_0 ) )
            // InternalExtendedIML.g:655:2: ( rule__ImageImporter__NameAssignment_0 )
            {
             before(grammarAccess.getImageImporterAccess().getNameAssignment_0()); 
            // InternalExtendedIML.g:656:2: ( rule__ImageImporter__NameAssignment_0 )
            // InternalExtendedIML.g:656:3: rule__ImageImporter__NameAssignment_0
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
    // InternalExtendedIML.g:664:1: rule__ImageImporter__Group__1 : rule__ImageImporter__Group__1__Impl rule__ImageImporter__Group__2 ;
    public final void rule__ImageImporter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:668:1: ( rule__ImageImporter__Group__1__Impl rule__ImageImporter__Group__2 )
            // InternalExtendedIML.g:669:2: rule__ImageImporter__Group__1__Impl rule__ImageImporter__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalExtendedIML.g:676:1: rule__ImageImporter__Group__1__Impl : ( '=' ) ;
    public final void rule__ImageImporter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:680:1: ( ( '=' ) )
            // InternalExtendedIML.g:681:1: ( '=' )
            {
            // InternalExtendedIML.g:681:1: ( '=' )
            // InternalExtendedIML.g:682:2: '='
            {
             before(grammarAccess.getImageImporterAccess().getEqualsSignKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalExtendedIML.g:691:1: rule__ImageImporter__Group__2 : rule__ImageImporter__Group__2__Impl ;
    public final void rule__ImageImporter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:695:1: ( rule__ImageImporter__Group__2__Impl )
            // InternalExtendedIML.g:696:2: rule__ImageImporter__Group__2__Impl
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
    // InternalExtendedIML.g:702:1: rule__ImageImporter__Group__2__Impl : ( ( rule__ImageImporter__ImportedNamespaceAssignment_2 ) ) ;
    public final void rule__ImageImporter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:706:1: ( ( ( rule__ImageImporter__ImportedNamespaceAssignment_2 ) ) )
            // InternalExtendedIML.g:707:1: ( ( rule__ImageImporter__ImportedNamespaceAssignment_2 ) )
            {
            // InternalExtendedIML.g:707:1: ( ( rule__ImageImporter__ImportedNamespaceAssignment_2 ) )
            // InternalExtendedIML.g:708:2: ( rule__ImageImporter__ImportedNamespaceAssignment_2 )
            {
             before(grammarAccess.getImageImporterAccess().getImportedNamespaceAssignment_2()); 
            // InternalExtendedIML.g:709:2: ( rule__ImageImporter__ImportedNamespaceAssignment_2 )
            // InternalExtendedIML.g:709:3: rule__ImageImporter__ImportedNamespaceAssignment_2
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
    // InternalExtendedIML.g:718:1: rule__QualifiedPath__Group__0 : rule__QualifiedPath__Group__0__Impl rule__QualifiedPath__Group__1 ;
    public final void rule__QualifiedPath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:722:1: ( rule__QualifiedPath__Group__0__Impl rule__QualifiedPath__Group__1 )
            // InternalExtendedIML.g:723:2: rule__QualifiedPath__Group__0__Impl rule__QualifiedPath__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalExtendedIML.g:730:1: rule__QualifiedPath__Group__0__Impl : ( ( '/' )? ) ;
    public final void rule__QualifiedPath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:734:1: ( ( ( '/' )? ) )
            // InternalExtendedIML.g:735:1: ( ( '/' )? )
            {
            // InternalExtendedIML.g:735:1: ( ( '/' )? )
            // InternalExtendedIML.g:736:2: ( '/' )?
            {
             before(grammarAccess.getQualifiedPathAccess().getSolidusKeyword_0()); 
            // InternalExtendedIML.g:737:2: ( '/' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalExtendedIML.g:737:3: '/'
                    {
                    match(input,14,FOLLOW_2); 

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
    // InternalExtendedIML.g:745:1: rule__QualifiedPath__Group__1 : rule__QualifiedPath__Group__1__Impl rule__QualifiedPath__Group__2 ;
    public final void rule__QualifiedPath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:749:1: ( rule__QualifiedPath__Group__1__Impl rule__QualifiedPath__Group__2 )
            // InternalExtendedIML.g:750:2: rule__QualifiedPath__Group__1__Impl rule__QualifiedPath__Group__2
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
    // InternalExtendedIML.g:757:1: rule__QualifiedPath__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedPath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:761:1: ( ( RULE_ID ) )
            // InternalExtendedIML.g:762:1: ( RULE_ID )
            {
            // InternalExtendedIML.g:762:1: ( RULE_ID )
            // InternalExtendedIML.g:763:2: RULE_ID
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
    // InternalExtendedIML.g:772:1: rule__QualifiedPath__Group__2 : rule__QualifiedPath__Group__2__Impl rule__QualifiedPath__Group__3 ;
    public final void rule__QualifiedPath__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:776:1: ( rule__QualifiedPath__Group__2__Impl rule__QualifiedPath__Group__3 )
            // InternalExtendedIML.g:777:2: rule__QualifiedPath__Group__2__Impl rule__QualifiedPath__Group__3
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
    // InternalExtendedIML.g:784:1: rule__QualifiedPath__Group__2__Impl : ( ( rule__QualifiedPath__Group_2__0 )* ) ;
    public final void rule__QualifiedPath__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:788:1: ( ( ( rule__QualifiedPath__Group_2__0 )* ) )
            // InternalExtendedIML.g:789:1: ( ( rule__QualifiedPath__Group_2__0 )* )
            {
            // InternalExtendedIML.g:789:1: ( ( rule__QualifiedPath__Group_2__0 )* )
            // InternalExtendedIML.g:790:2: ( rule__QualifiedPath__Group_2__0 )*
            {
             before(grammarAccess.getQualifiedPathAccess().getGroup_2()); 
            // InternalExtendedIML.g:791:2: ( rule__QualifiedPath__Group_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalExtendedIML.g:791:3: rule__QualifiedPath__Group_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__QualifiedPath__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalExtendedIML.g:799:1: rule__QualifiedPath__Group__3 : rule__QualifiedPath__Group__3__Impl rule__QualifiedPath__Group__4 ;
    public final void rule__QualifiedPath__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:803:1: ( rule__QualifiedPath__Group__3__Impl rule__QualifiedPath__Group__4 )
            // InternalExtendedIML.g:804:2: rule__QualifiedPath__Group__3__Impl rule__QualifiedPath__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedPath__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group__4();

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
    // InternalExtendedIML.g:811:1: rule__QualifiedPath__Group__3__Impl : ( ( rule__QualifiedPath__Group_3__0 ) ) ;
    public final void rule__QualifiedPath__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:815:1: ( ( ( rule__QualifiedPath__Group_3__0 ) ) )
            // InternalExtendedIML.g:816:1: ( ( rule__QualifiedPath__Group_3__0 ) )
            {
            // InternalExtendedIML.g:816:1: ( ( rule__QualifiedPath__Group_3__0 ) )
            // InternalExtendedIML.g:817:2: ( rule__QualifiedPath__Group_3__0 )
            {
             before(grammarAccess.getQualifiedPathAccess().getGroup_3()); 
            // InternalExtendedIML.g:818:2: ( rule__QualifiedPath__Group_3__0 )
            // InternalExtendedIML.g:818:3: rule__QualifiedPath__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedPathAccess().getGroup_3()); 

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


    // $ANTLR start "rule__QualifiedPath__Group__4"
    // InternalExtendedIML.g:826:1: rule__QualifiedPath__Group__4 : rule__QualifiedPath__Group__4__Impl ;
    public final void rule__QualifiedPath__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:830:1: ( rule__QualifiedPath__Group__4__Impl )
            // InternalExtendedIML.g:831:2: rule__QualifiedPath__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group__4__Impl();

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
    // $ANTLR end "rule__QualifiedPath__Group__4"


    // $ANTLR start "rule__QualifiedPath__Group__4__Impl"
    // InternalExtendedIML.g:837:1: rule__QualifiedPath__Group__4__Impl : ( ( '/' )? ) ;
    public final void rule__QualifiedPath__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:841:1: ( ( ( '/' )? ) )
            // InternalExtendedIML.g:842:1: ( ( '/' )? )
            {
            // InternalExtendedIML.g:842:1: ( ( '/' )? )
            // InternalExtendedIML.g:843:2: ( '/' )?
            {
             before(grammarAccess.getQualifiedPathAccess().getSolidusKeyword_4()); 
            // InternalExtendedIML.g:844:2: ( '/' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalExtendedIML.g:844:3: '/'
                    {
                    match(input,14,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedPathAccess().getSolidusKeyword_4()); 

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
    // $ANTLR end "rule__QualifiedPath__Group__4__Impl"


    // $ANTLR start "rule__QualifiedPath__Group_2__0"
    // InternalExtendedIML.g:853:1: rule__QualifiedPath__Group_2__0 : rule__QualifiedPath__Group_2__0__Impl rule__QualifiedPath__Group_2__1 ;
    public final void rule__QualifiedPath__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:857:1: ( rule__QualifiedPath__Group_2__0__Impl rule__QualifiedPath__Group_2__1 )
            // InternalExtendedIML.g:858:2: rule__QualifiedPath__Group_2__0__Impl rule__QualifiedPath__Group_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalExtendedIML.g:865:1: rule__QualifiedPath__Group_2__0__Impl : ( '/' ) ;
    public final void rule__QualifiedPath__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:869:1: ( ( '/' ) )
            // InternalExtendedIML.g:870:1: ( '/' )
            {
            // InternalExtendedIML.g:870:1: ( '/' )
            // InternalExtendedIML.g:871:2: '/'
            {
             before(grammarAccess.getQualifiedPathAccess().getSolidusKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalExtendedIML.g:880:1: rule__QualifiedPath__Group_2__1 : rule__QualifiedPath__Group_2__1__Impl ;
    public final void rule__QualifiedPath__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:884:1: ( rule__QualifiedPath__Group_2__1__Impl )
            // InternalExtendedIML.g:885:2: rule__QualifiedPath__Group_2__1__Impl
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
    // InternalExtendedIML.g:891:1: rule__QualifiedPath__Group_2__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedPath__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:895:1: ( ( RULE_ID ) )
            // InternalExtendedIML.g:896:1: ( RULE_ID )
            {
            // InternalExtendedIML.g:896:1: ( RULE_ID )
            // InternalExtendedIML.g:897:2: RULE_ID
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


    // $ANTLR start "rule__QualifiedPath__Group_3__0"
    // InternalExtendedIML.g:907:1: rule__QualifiedPath__Group_3__0 : rule__QualifiedPath__Group_3__0__Impl rule__QualifiedPath__Group_3__1 ;
    public final void rule__QualifiedPath__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:911:1: ( rule__QualifiedPath__Group_3__0__Impl rule__QualifiedPath__Group_3__1 )
            // InternalExtendedIML.g:912:2: rule__QualifiedPath__Group_3__0__Impl rule__QualifiedPath__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedPath__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group_3__1();

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
    // $ANTLR end "rule__QualifiedPath__Group_3__0"


    // $ANTLR start "rule__QualifiedPath__Group_3__0__Impl"
    // InternalExtendedIML.g:919:1: rule__QualifiedPath__Group_3__0__Impl : ( '.' ) ;
    public final void rule__QualifiedPath__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:923:1: ( ( '.' ) )
            // InternalExtendedIML.g:924:1: ( '.' )
            {
            // InternalExtendedIML.g:924:1: ( '.' )
            // InternalExtendedIML.g:925:2: '.'
            {
             before(grammarAccess.getQualifiedPathAccess().getFullStopKeyword_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getQualifiedPathAccess().getFullStopKeyword_3_0()); 

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
    // $ANTLR end "rule__QualifiedPath__Group_3__0__Impl"


    // $ANTLR start "rule__QualifiedPath__Group_3__1"
    // InternalExtendedIML.g:934:1: rule__QualifiedPath__Group_3__1 : rule__QualifiedPath__Group_3__1__Impl ;
    public final void rule__QualifiedPath__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:938:1: ( rule__QualifiedPath__Group_3__1__Impl )
            // InternalExtendedIML.g:939:2: rule__QualifiedPath__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedPath__Group_3__1__Impl();

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
    // $ANTLR end "rule__QualifiedPath__Group_3__1"


    // $ANTLR start "rule__QualifiedPath__Group_3__1__Impl"
    // InternalExtendedIML.g:945:1: rule__QualifiedPath__Group_3__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedPath__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:949:1: ( ( RULE_ID ) )
            // InternalExtendedIML.g:950:1: ( RULE_ID )
            {
            // InternalExtendedIML.g:950:1: ( RULE_ID )
            // InternalExtendedIML.g:951:2: RULE_ID
            {
             before(grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_3_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_3_1()); 

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
    // $ANTLR end "rule__QualifiedPath__Group_3__1__Impl"


    // $ANTLR start "rule__DirImporter__Group__0"
    // InternalExtendedIML.g:961:1: rule__DirImporter__Group__0 : rule__DirImporter__Group__0__Impl rule__DirImporter__Group__1 ;
    public final void rule__DirImporter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:965:1: ( rule__DirImporter__Group__0__Impl rule__DirImporter__Group__1 )
            // InternalExtendedIML.g:966:2: rule__DirImporter__Group__0__Impl rule__DirImporter__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalExtendedIML.g:973:1: rule__DirImporter__Group__0__Impl : ( 'images' ) ;
    public final void rule__DirImporter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:977:1: ( ( 'images' ) )
            // InternalExtendedIML.g:978:1: ( 'images' )
            {
            // InternalExtendedIML.g:978:1: ( 'images' )
            // InternalExtendedIML.g:979:2: 'images'
            {
             before(grammarAccess.getDirImporterAccess().getImagesKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalExtendedIML.g:988:1: rule__DirImporter__Group__1 : rule__DirImporter__Group__1__Impl ;
    public final void rule__DirImporter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:992:1: ( rule__DirImporter__Group__1__Impl )
            // InternalExtendedIML.g:993:2: rule__DirImporter__Group__1__Impl
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
    // InternalExtendedIML.g:999:1: rule__DirImporter__Group__1__Impl : ( ( rule__DirImporter__PathDirAssignment_1 ) ) ;
    public final void rule__DirImporter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1003:1: ( ( ( rule__DirImporter__PathDirAssignment_1 ) ) )
            // InternalExtendedIML.g:1004:1: ( ( rule__DirImporter__PathDirAssignment_1 ) )
            {
            // InternalExtendedIML.g:1004:1: ( ( rule__DirImporter__PathDirAssignment_1 ) )
            // InternalExtendedIML.g:1005:2: ( rule__DirImporter__PathDirAssignment_1 )
            {
             before(grammarAccess.getDirImporterAccess().getPathDirAssignment_1()); 
            // InternalExtendedIML.g:1006:2: ( rule__DirImporter__PathDirAssignment_1 )
            // InternalExtendedIML.g:1006:3: rule__DirImporter__PathDirAssignment_1
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
    // InternalExtendedIML.g:1015:1: rule__RotateOperation__Group__0 : rule__RotateOperation__Group__0__Impl rule__RotateOperation__Group__1 ;
    public final void rule__RotateOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1019:1: ( rule__RotateOperation__Group__0__Impl rule__RotateOperation__Group__1 )
            // InternalExtendedIML.g:1020:2: rule__RotateOperation__Group__0__Impl rule__RotateOperation__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalExtendedIML.g:1027:1: rule__RotateOperation__Group__0__Impl : ( 'rotate' ) ;
    public final void rule__RotateOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1031:1: ( ( 'rotate' ) )
            // InternalExtendedIML.g:1032:1: ( 'rotate' )
            {
            // InternalExtendedIML.g:1032:1: ( 'rotate' )
            // InternalExtendedIML.g:1033:2: 'rotate'
            {
             before(grammarAccess.getRotateOperationAccess().getRotateKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalExtendedIML.g:1042:1: rule__RotateOperation__Group__1 : rule__RotateOperation__Group__1__Impl rule__RotateOperation__Group__2 ;
    public final void rule__RotateOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1046:1: ( rule__RotateOperation__Group__1__Impl rule__RotateOperation__Group__2 )
            // InternalExtendedIML.g:1047:2: rule__RotateOperation__Group__1__Impl rule__RotateOperation__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalExtendedIML.g:1054:1: rule__RotateOperation__Group__1__Impl : ( ( rule__RotateOperation__VarAssignment_1 ) ) ;
    public final void rule__RotateOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1058:1: ( ( ( rule__RotateOperation__VarAssignment_1 ) ) )
            // InternalExtendedIML.g:1059:1: ( ( rule__RotateOperation__VarAssignment_1 ) )
            {
            // InternalExtendedIML.g:1059:1: ( ( rule__RotateOperation__VarAssignment_1 ) )
            // InternalExtendedIML.g:1060:2: ( rule__RotateOperation__VarAssignment_1 )
            {
             before(grammarAccess.getRotateOperationAccess().getVarAssignment_1()); 
            // InternalExtendedIML.g:1061:2: ( rule__RotateOperation__VarAssignment_1 )
            // InternalExtendedIML.g:1061:3: rule__RotateOperation__VarAssignment_1
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
    // InternalExtendedIML.g:1069:1: rule__RotateOperation__Group__2 : rule__RotateOperation__Group__2__Impl ;
    public final void rule__RotateOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1073:1: ( rule__RotateOperation__Group__2__Impl )
            // InternalExtendedIML.g:1074:2: rule__RotateOperation__Group__2__Impl
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
    // InternalExtendedIML.g:1080:1: rule__RotateOperation__Group__2__Impl : ( ( rule__RotateOperation__DegreeAssignment_2 ) ) ;
    public final void rule__RotateOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1084:1: ( ( ( rule__RotateOperation__DegreeAssignment_2 ) ) )
            // InternalExtendedIML.g:1085:1: ( ( rule__RotateOperation__DegreeAssignment_2 ) )
            {
            // InternalExtendedIML.g:1085:1: ( ( rule__RotateOperation__DegreeAssignment_2 ) )
            // InternalExtendedIML.g:1086:2: ( rule__RotateOperation__DegreeAssignment_2 )
            {
             before(grammarAccess.getRotateOperationAccess().getDegreeAssignment_2()); 
            // InternalExtendedIML.g:1087:2: ( rule__RotateOperation__DegreeAssignment_2 )
            // InternalExtendedIML.g:1087:3: rule__RotateOperation__DegreeAssignment_2
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
    // InternalExtendedIML.g:1096:1: rule__FilterOperation__Group__0 : rule__FilterOperation__Group__0__Impl rule__FilterOperation__Group__1 ;
    public final void rule__FilterOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1100:1: ( rule__FilterOperation__Group__0__Impl rule__FilterOperation__Group__1 )
            // InternalExtendedIML.g:1101:2: rule__FilterOperation__Group__0__Impl rule__FilterOperation__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalExtendedIML.g:1108:1: rule__FilterOperation__Group__0__Impl : ( 'filter' ) ;
    public final void rule__FilterOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1112:1: ( ( 'filter' ) )
            // InternalExtendedIML.g:1113:1: ( 'filter' )
            {
            // InternalExtendedIML.g:1113:1: ( 'filter' )
            // InternalExtendedIML.g:1114:2: 'filter'
            {
             before(grammarAccess.getFilterOperationAccess().getFilterKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalExtendedIML.g:1123:1: rule__FilterOperation__Group__1 : rule__FilterOperation__Group__1__Impl rule__FilterOperation__Group__2 ;
    public final void rule__FilterOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1127:1: ( rule__FilterOperation__Group__1__Impl rule__FilterOperation__Group__2 )
            // InternalExtendedIML.g:1128:2: rule__FilterOperation__Group__1__Impl rule__FilterOperation__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalExtendedIML.g:1135:1: rule__FilterOperation__Group__1__Impl : ( ( rule__FilterOperation__VarAssignment_1 ) ) ;
    public final void rule__FilterOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1139:1: ( ( ( rule__FilterOperation__VarAssignment_1 ) ) )
            // InternalExtendedIML.g:1140:1: ( ( rule__FilterOperation__VarAssignment_1 ) )
            {
            // InternalExtendedIML.g:1140:1: ( ( rule__FilterOperation__VarAssignment_1 ) )
            // InternalExtendedIML.g:1141:2: ( rule__FilterOperation__VarAssignment_1 )
            {
             before(grammarAccess.getFilterOperationAccess().getVarAssignment_1()); 
            // InternalExtendedIML.g:1142:2: ( rule__FilterOperation__VarAssignment_1 )
            // InternalExtendedIML.g:1142:3: rule__FilterOperation__VarAssignment_1
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
    // InternalExtendedIML.g:1150:1: rule__FilterOperation__Group__2 : rule__FilterOperation__Group__2__Impl ;
    public final void rule__FilterOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1154:1: ( rule__FilterOperation__Group__2__Impl )
            // InternalExtendedIML.g:1155:2: rule__FilterOperation__Group__2__Impl
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
    // InternalExtendedIML.g:1161:1: rule__FilterOperation__Group__2__Impl : ( 'gray' ) ;
    public final void rule__FilterOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1165:1: ( ( 'gray' ) )
            // InternalExtendedIML.g:1166:1: ( 'gray' )
            {
            // InternalExtendedIML.g:1166:1: ( 'gray' )
            // InternalExtendedIML.g:1167:2: 'gray'
            {
             before(grammarAccess.getFilterOperationAccess().getGrayKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalExtendedIML.g:1177:1: rule__BlurOperation__Group__0 : rule__BlurOperation__Group__0__Impl rule__BlurOperation__Group__1 ;
    public final void rule__BlurOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1181:1: ( rule__BlurOperation__Group__0__Impl rule__BlurOperation__Group__1 )
            // InternalExtendedIML.g:1182:2: rule__BlurOperation__Group__0__Impl rule__BlurOperation__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalExtendedIML.g:1189:1: rule__BlurOperation__Group__0__Impl : ( 'blur' ) ;
    public final void rule__BlurOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1193:1: ( ( 'blur' ) )
            // InternalExtendedIML.g:1194:1: ( 'blur' )
            {
            // InternalExtendedIML.g:1194:1: ( 'blur' )
            // InternalExtendedIML.g:1195:2: 'blur'
            {
             before(grammarAccess.getBlurOperationAccess().getBlurKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalExtendedIML.g:1204:1: rule__BlurOperation__Group__1 : rule__BlurOperation__Group__1__Impl rule__BlurOperation__Group__2 ;
    public final void rule__BlurOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1208:1: ( rule__BlurOperation__Group__1__Impl rule__BlurOperation__Group__2 )
            // InternalExtendedIML.g:1209:2: rule__BlurOperation__Group__1__Impl rule__BlurOperation__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__BlurOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlurOperation__Group__2();

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
    // InternalExtendedIML.g:1216:1: rule__BlurOperation__Group__1__Impl : ( ( rule__BlurOperation__VarAssignment_1 ) ) ;
    public final void rule__BlurOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1220:1: ( ( ( rule__BlurOperation__VarAssignment_1 ) ) )
            // InternalExtendedIML.g:1221:1: ( ( rule__BlurOperation__VarAssignment_1 ) )
            {
            // InternalExtendedIML.g:1221:1: ( ( rule__BlurOperation__VarAssignment_1 ) )
            // InternalExtendedIML.g:1222:2: ( rule__BlurOperation__VarAssignment_1 )
            {
             before(grammarAccess.getBlurOperationAccess().getVarAssignment_1()); 
            // InternalExtendedIML.g:1223:2: ( rule__BlurOperation__VarAssignment_1 )
            // InternalExtendedIML.g:1223:3: rule__BlurOperation__VarAssignment_1
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


    // $ANTLR start "rule__BlurOperation__Group__2"
    // InternalExtendedIML.g:1231:1: rule__BlurOperation__Group__2 : rule__BlurOperation__Group__2__Impl ;
    public final void rule__BlurOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1235:1: ( rule__BlurOperation__Group__2__Impl )
            // InternalExtendedIML.g:1236:2: rule__BlurOperation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlurOperation__Group__2__Impl();

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
    // $ANTLR end "rule__BlurOperation__Group__2"


    // $ANTLR start "rule__BlurOperation__Group__2__Impl"
    // InternalExtendedIML.g:1242:1: rule__BlurOperation__Group__2__Impl : ( ( rule__BlurOperation__IntensityAssignment_2 ) ) ;
    public final void rule__BlurOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1246:1: ( ( ( rule__BlurOperation__IntensityAssignment_2 ) ) )
            // InternalExtendedIML.g:1247:1: ( ( rule__BlurOperation__IntensityAssignment_2 ) )
            {
            // InternalExtendedIML.g:1247:1: ( ( rule__BlurOperation__IntensityAssignment_2 ) )
            // InternalExtendedIML.g:1248:2: ( rule__BlurOperation__IntensityAssignment_2 )
            {
             before(grammarAccess.getBlurOperationAccess().getIntensityAssignment_2()); 
            // InternalExtendedIML.g:1249:2: ( rule__BlurOperation__IntensityAssignment_2 )
            // InternalExtendedIML.g:1249:3: rule__BlurOperation__IntensityAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BlurOperation__IntensityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBlurOperationAccess().getIntensityAssignment_2()); 

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
    // $ANTLR end "rule__BlurOperation__Group__2__Impl"


    // $ANTLR start "rule__EqualizeOperation__Group__0"
    // InternalExtendedIML.g:1258:1: rule__EqualizeOperation__Group__0 : rule__EqualizeOperation__Group__0__Impl rule__EqualizeOperation__Group__1 ;
    public final void rule__EqualizeOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1262:1: ( rule__EqualizeOperation__Group__0__Impl rule__EqualizeOperation__Group__1 )
            // InternalExtendedIML.g:1263:2: rule__EqualizeOperation__Group__0__Impl rule__EqualizeOperation__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalExtendedIML.g:1270:1: rule__EqualizeOperation__Group__0__Impl : ( 'equalize' ) ;
    public final void rule__EqualizeOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1274:1: ( ( 'equalize' ) )
            // InternalExtendedIML.g:1275:1: ( 'equalize' )
            {
            // InternalExtendedIML.g:1275:1: ( 'equalize' )
            // InternalExtendedIML.g:1276:2: 'equalize'
            {
             before(grammarAccess.getEqualizeOperationAccess().getEqualizeKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalExtendedIML.g:1285:1: rule__EqualizeOperation__Group__1 : rule__EqualizeOperation__Group__1__Impl ;
    public final void rule__EqualizeOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1289:1: ( rule__EqualizeOperation__Group__1__Impl )
            // InternalExtendedIML.g:1290:2: rule__EqualizeOperation__Group__1__Impl
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
    // InternalExtendedIML.g:1296:1: rule__EqualizeOperation__Group__1__Impl : ( ( rule__EqualizeOperation__VarAssignment_1 ) ) ;
    public final void rule__EqualizeOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1300:1: ( ( ( rule__EqualizeOperation__VarAssignment_1 ) ) )
            // InternalExtendedIML.g:1301:1: ( ( rule__EqualizeOperation__VarAssignment_1 ) )
            {
            // InternalExtendedIML.g:1301:1: ( ( rule__EqualizeOperation__VarAssignment_1 ) )
            // InternalExtendedIML.g:1302:2: ( rule__EqualizeOperation__VarAssignment_1 )
            {
             before(grammarAccess.getEqualizeOperationAccess().getVarAssignment_1()); 
            // InternalExtendedIML.g:1303:2: ( rule__EqualizeOperation__VarAssignment_1 )
            // InternalExtendedIML.g:1303:3: rule__EqualizeOperation__VarAssignment_1
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
    // InternalExtendedIML.g:1312:1: rule__Model__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1316:1: ( ( ruleAbstractElement ) )
            // InternalExtendedIML.g:1317:2: ( ruleAbstractElement )
            {
            // InternalExtendedIML.g:1317:2: ( ruleAbstractElement )
            // InternalExtendedIML.g:1318:3: ruleAbstractElement
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


    // $ANTLR start "rule__Save__VarAssignment_1"
    // InternalExtendedIML.g:1327:1: rule__Save__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__Save__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1331:1: ( ( RULE_ID ) )
            // InternalExtendedIML.g:1332:2: ( RULE_ID )
            {
            // InternalExtendedIML.g:1332:2: ( RULE_ID )
            // InternalExtendedIML.g:1333:3: RULE_ID
            {
             before(grammarAccess.getSaveAccess().getVarIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSaveAccess().getVarIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Save__VarAssignment_1"


    // $ANTLR start "rule__Show__VarAssignment_1"
    // InternalExtendedIML.g:1342:1: rule__Show__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__Show__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1346:1: ( ( RULE_ID ) )
            // InternalExtendedIML.g:1347:2: ( RULE_ID )
            {
            // InternalExtendedIML.g:1347:2: ( RULE_ID )
            // InternalExtendedIML.g:1348:3: RULE_ID
            {
             before(grammarAccess.getShowAccess().getVarIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getShowAccess().getVarIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Show__VarAssignment_1"


    // $ANTLR start "rule__ImageImporter__NameAssignment_0"
    // InternalExtendedIML.g:1357:1: rule__ImageImporter__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__ImageImporter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1361:1: ( ( RULE_ID ) )
            // InternalExtendedIML.g:1362:2: ( RULE_ID )
            {
            // InternalExtendedIML.g:1362:2: ( RULE_ID )
            // InternalExtendedIML.g:1363:3: RULE_ID
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
    // InternalExtendedIML.g:1372:1: rule__ImageImporter__ImportedNamespaceAssignment_2 : ( ruleQualifiedImageName ) ;
    public final void rule__ImageImporter__ImportedNamespaceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1376:1: ( ( ruleQualifiedImageName ) )
            // InternalExtendedIML.g:1377:2: ( ruleQualifiedImageName )
            {
            // InternalExtendedIML.g:1377:2: ( ruleQualifiedImageName )
            // InternalExtendedIML.g:1378:3: ruleQualifiedImageName
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
    // InternalExtendedIML.g:1387:1: rule__DirImporter__PathDirAssignment_1 : ( ruleQualifiedPath ) ;
    public final void rule__DirImporter__PathDirAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1391:1: ( ( ruleQualifiedPath ) )
            // InternalExtendedIML.g:1392:2: ( ruleQualifiedPath )
            {
            // InternalExtendedIML.g:1392:2: ( ruleQualifiedPath )
            // InternalExtendedIML.g:1393:3: ruleQualifiedPath
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
    // InternalExtendedIML.g:1402:1: rule__RotateOperation__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__RotateOperation__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1406:1: ( ( RULE_ID ) )
            // InternalExtendedIML.g:1407:2: ( RULE_ID )
            {
            // InternalExtendedIML.g:1407:2: ( RULE_ID )
            // InternalExtendedIML.g:1408:3: RULE_ID
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
    // InternalExtendedIML.g:1417:1: rule__RotateOperation__DegreeAssignment_2 : ( RULE_INT ) ;
    public final void rule__RotateOperation__DegreeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1421:1: ( ( RULE_INT ) )
            // InternalExtendedIML.g:1422:2: ( RULE_INT )
            {
            // InternalExtendedIML.g:1422:2: ( RULE_INT )
            // InternalExtendedIML.g:1423:3: RULE_INT
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
    // InternalExtendedIML.g:1432:1: rule__FilterOperation__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__FilterOperation__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1436:1: ( ( RULE_ID ) )
            // InternalExtendedIML.g:1437:2: ( RULE_ID )
            {
            // InternalExtendedIML.g:1437:2: ( RULE_ID )
            // InternalExtendedIML.g:1438:3: RULE_ID
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
    // InternalExtendedIML.g:1447:1: rule__BlurOperation__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__BlurOperation__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1451:1: ( ( RULE_ID ) )
            // InternalExtendedIML.g:1452:2: ( RULE_ID )
            {
            // InternalExtendedIML.g:1452:2: ( RULE_ID )
            // InternalExtendedIML.g:1453:3: RULE_ID
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


    // $ANTLR start "rule__BlurOperation__IntensityAssignment_2"
    // InternalExtendedIML.g:1462:1: rule__BlurOperation__IntensityAssignment_2 : ( RULE_INT ) ;
    public final void rule__BlurOperation__IntensityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1466:1: ( ( RULE_INT ) )
            // InternalExtendedIML.g:1467:2: ( RULE_INT )
            {
            // InternalExtendedIML.g:1467:2: ( RULE_INT )
            // InternalExtendedIML.g:1468:3: RULE_INT
            {
             before(grammarAccess.getBlurOperationAccess().getIntensityINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBlurOperationAccess().getIntensityINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__BlurOperation__IntensityAssignment_2"


    // $ANTLR start "rule__EqualizeOperation__VarAssignment_1"
    // InternalExtendedIML.g:1477:1: rule__EqualizeOperation__VarAssignment_1 : ( RULE_ID ) ;
    public final void rule__EqualizeOperation__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalExtendedIML.g:1481:1: ( ( RULE_ID ) )
            // InternalExtendedIML.g:1482:2: ( RULE_ID )
            {
            // InternalExtendedIML.g:1482:2: ( RULE_ID )
            // InternalExtendedIML.g:1483:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000371812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});

}