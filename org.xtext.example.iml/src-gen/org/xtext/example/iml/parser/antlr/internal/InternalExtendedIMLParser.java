package org.xtext.example.iml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.iml.services.ExtendedIMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalExtendedIMLParser extends AbstractInternalAntlrParser {
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

        public InternalExtendedIMLParser(TokenStream input, ExtendedIMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected ExtendedIMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalExtendedIML.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalExtendedIML.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalExtendedIML.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalExtendedIML.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalExtendedIML.g:77:2: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // InternalExtendedIML.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // InternalExtendedIML.g:78:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=11 && LA1_0<=12)||(LA1_0>=16 && LA1_0<=18)||(LA1_0>=20 && LA1_0<=21)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalExtendedIML.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // InternalExtendedIML.g:79:3: (lv_elements_0_0= ruleAbstractElement )
            	    // InternalExtendedIML.g:80:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.example.iml.ExtendedIML.AbstractElement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalExtendedIML.g:100:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // InternalExtendedIML.g:100:56: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // InternalExtendedIML.g:101:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalExtendedIML.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_Importer_0= ruleImporter | this_Operator_1= ruleOperator | this_Exporter_2= ruleExporter ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Importer_0 = null;

        EObject this_Operator_1 = null;

        EObject this_Exporter_2 = null;



        	enterRule();

        try {
            // InternalExtendedIML.g:113:2: ( (this_Importer_0= ruleImporter | this_Operator_1= ruleOperator | this_Exporter_2= ruleExporter ) )
            // InternalExtendedIML.g:114:2: (this_Importer_0= ruleImporter | this_Operator_1= ruleOperator | this_Exporter_2= ruleExporter )
            {
            // InternalExtendedIML.g:114:2: (this_Importer_0= ruleImporter | this_Operator_1= ruleOperator | this_Exporter_2= ruleExporter )
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
                    // InternalExtendedIML.g:115:3: this_Importer_0= ruleImporter
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getImporterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Importer_0=ruleImporter();

                    state._fsp--;


                    			current = this_Importer_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExtendedIML.g:124:3: this_Operator_1= ruleOperator
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getOperatorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operator_1=ruleOperator();

                    state._fsp--;


                    			current = this_Operator_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalExtendedIML.g:133:3: this_Exporter_2= ruleExporter
                    {

                    			newCompositeNode(grammarAccess.getAbstractElementAccess().getExporterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Exporter_2=ruleExporter();

                    state._fsp--;


                    			current = this_Exporter_2;
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleExporter"
    // InternalExtendedIML.g:145:1: entryRuleExporter returns [EObject current=null] : iv_ruleExporter= ruleExporter EOF ;
    public final EObject entryRuleExporter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExporter = null;


        try {
            // InternalExtendedIML.g:145:49: (iv_ruleExporter= ruleExporter EOF )
            // InternalExtendedIML.g:146:2: iv_ruleExporter= ruleExporter EOF
            {
             newCompositeNode(grammarAccess.getExporterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExporter=ruleExporter();

            state._fsp--;

             current =iv_ruleExporter; 
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
    // $ANTLR end "entryRuleExporter"


    // $ANTLR start "ruleExporter"
    // InternalExtendedIML.g:152:1: ruleExporter returns [EObject current=null] : (this_Save_0= ruleSave | this_Show_1= ruleShow ) ;
    public final EObject ruleExporter() throws RecognitionException {
        EObject current = null;

        EObject this_Save_0 = null;

        EObject this_Show_1 = null;



        	enterRule();

        try {
            // InternalExtendedIML.g:158:2: ( (this_Save_0= ruleSave | this_Show_1= ruleShow ) )
            // InternalExtendedIML.g:159:2: (this_Save_0= ruleSave | this_Show_1= ruleShow )
            {
            // InternalExtendedIML.g:159:2: (this_Save_0= ruleSave | this_Show_1= ruleShow )
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
                    // InternalExtendedIML.g:160:3: this_Save_0= ruleSave
                    {

                    			newCompositeNode(grammarAccess.getExporterAccess().getSaveParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Save_0=ruleSave();

                    state._fsp--;


                    			current = this_Save_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExtendedIML.g:169:3: this_Show_1= ruleShow
                    {

                    			newCompositeNode(grammarAccess.getExporterAccess().getShowParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Show_1=ruleShow();

                    state._fsp--;


                    			current = this_Show_1;
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
    // $ANTLR end "ruleExporter"


    // $ANTLR start "entryRuleSave"
    // InternalExtendedIML.g:181:1: entryRuleSave returns [EObject current=null] : iv_ruleSave= ruleSave EOF ;
    public final EObject entryRuleSave() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSave = null;


        try {
            // InternalExtendedIML.g:181:45: (iv_ruleSave= ruleSave EOF )
            // InternalExtendedIML.g:182:2: iv_ruleSave= ruleSave EOF
            {
             newCompositeNode(grammarAccess.getSaveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSave=ruleSave();

            state._fsp--;

             current =iv_ruleSave; 
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
    // $ANTLR end "entryRuleSave"


    // $ANTLR start "ruleSave"
    // InternalExtendedIML.g:188:1: ruleSave returns [EObject current=null] : (otherlv_0= 'save' ( (lv_var_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSave() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_1_0=null;


        	enterRule();

        try {
            // InternalExtendedIML.g:194:2: ( (otherlv_0= 'save' ( (lv_var_1_0= RULE_ID ) ) ) )
            // InternalExtendedIML.g:195:2: (otherlv_0= 'save' ( (lv_var_1_0= RULE_ID ) ) )
            {
            // InternalExtendedIML.g:195:2: (otherlv_0= 'save' ( (lv_var_1_0= RULE_ID ) ) )
            // InternalExtendedIML.g:196:3: otherlv_0= 'save' ( (lv_var_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSaveAccess().getSaveKeyword_0());
            		
            // InternalExtendedIML.g:200:3: ( (lv_var_1_0= RULE_ID ) )
            // InternalExtendedIML.g:201:4: (lv_var_1_0= RULE_ID )
            {
            // InternalExtendedIML.g:201:4: (lv_var_1_0= RULE_ID )
            // InternalExtendedIML.g:202:5: lv_var_1_0= RULE_ID
            {
            lv_var_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_var_1_0, grammarAccess.getSaveAccess().getVarIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSaveRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_1_0,
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
    // $ANTLR end "ruleSave"


    // $ANTLR start "entryRuleShow"
    // InternalExtendedIML.g:222:1: entryRuleShow returns [EObject current=null] : iv_ruleShow= ruleShow EOF ;
    public final EObject entryRuleShow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShow = null;


        try {
            // InternalExtendedIML.g:222:45: (iv_ruleShow= ruleShow EOF )
            // InternalExtendedIML.g:223:2: iv_ruleShow= ruleShow EOF
            {
             newCompositeNode(grammarAccess.getShowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShow=ruleShow();

            state._fsp--;

             current =iv_ruleShow; 
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
    // $ANTLR end "entryRuleShow"


    // $ANTLR start "ruleShow"
    // InternalExtendedIML.g:229:1: ruleShow returns [EObject current=null] : (otherlv_0= 'show' ( (lv_var_1_0= RULE_ID ) ) ) ;
    public final EObject ruleShow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_1_0=null;


        	enterRule();

        try {
            // InternalExtendedIML.g:235:2: ( (otherlv_0= 'show' ( (lv_var_1_0= RULE_ID ) ) ) )
            // InternalExtendedIML.g:236:2: (otherlv_0= 'show' ( (lv_var_1_0= RULE_ID ) ) )
            {
            // InternalExtendedIML.g:236:2: (otherlv_0= 'show' ( (lv_var_1_0= RULE_ID ) ) )
            // InternalExtendedIML.g:237:3: otherlv_0= 'show' ( (lv_var_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getShowAccess().getShowKeyword_0());
            		
            // InternalExtendedIML.g:241:3: ( (lv_var_1_0= RULE_ID ) )
            // InternalExtendedIML.g:242:4: (lv_var_1_0= RULE_ID )
            {
            // InternalExtendedIML.g:242:4: (lv_var_1_0= RULE_ID )
            // InternalExtendedIML.g:243:5: lv_var_1_0= RULE_ID
            {
            lv_var_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_var_1_0, grammarAccess.getShowAccess().getVarIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getShowRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_1_0,
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
    // $ANTLR end "ruleShow"


    // $ANTLR start "entryRuleImporter"
    // InternalExtendedIML.g:263:1: entryRuleImporter returns [EObject current=null] : iv_ruleImporter= ruleImporter EOF ;
    public final EObject entryRuleImporter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImporter = null;


        try {
            // InternalExtendedIML.g:263:49: (iv_ruleImporter= ruleImporter EOF )
            // InternalExtendedIML.g:264:2: iv_ruleImporter= ruleImporter EOF
            {
             newCompositeNode(grammarAccess.getImporterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImporter=ruleImporter();

            state._fsp--;

             current =iv_ruleImporter; 
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
    // $ANTLR end "entryRuleImporter"


    // $ANTLR start "ruleImporter"
    // InternalExtendedIML.g:270:1: ruleImporter returns [EObject current=null] : (this_ImageImporter_0= ruleImageImporter | this_DirImporter_1= ruleDirImporter ) ;
    public final EObject ruleImporter() throws RecognitionException {
        EObject current = null;

        EObject this_ImageImporter_0 = null;

        EObject this_DirImporter_1 = null;



        	enterRule();

        try {
            // InternalExtendedIML.g:276:2: ( (this_ImageImporter_0= ruleImageImporter | this_DirImporter_1= ruleDirImporter ) )
            // InternalExtendedIML.g:277:2: (this_ImageImporter_0= ruleImageImporter | this_DirImporter_1= ruleDirImporter )
            {
            // InternalExtendedIML.g:277:2: (this_ImageImporter_0= ruleImageImporter | this_DirImporter_1= ruleDirImporter )
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
                    // InternalExtendedIML.g:278:3: this_ImageImporter_0= ruleImageImporter
                    {

                    			newCompositeNode(grammarAccess.getImporterAccess().getImageImporterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImageImporter_0=ruleImageImporter();

                    state._fsp--;


                    			current = this_ImageImporter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExtendedIML.g:287:3: this_DirImporter_1= ruleDirImporter
                    {

                    			newCompositeNode(grammarAccess.getImporterAccess().getDirImporterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DirImporter_1=ruleDirImporter();

                    state._fsp--;


                    			current = this_DirImporter_1;
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
    // $ANTLR end "ruleImporter"


    // $ANTLR start "entryRuleImageImporter"
    // InternalExtendedIML.g:299:1: entryRuleImageImporter returns [EObject current=null] : iv_ruleImageImporter= ruleImageImporter EOF ;
    public final EObject entryRuleImageImporter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageImporter = null;


        try {
            // InternalExtendedIML.g:299:54: (iv_ruleImageImporter= ruleImageImporter EOF )
            // InternalExtendedIML.g:300:2: iv_ruleImageImporter= ruleImageImporter EOF
            {
             newCompositeNode(grammarAccess.getImageImporterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImageImporter=ruleImageImporter();

            state._fsp--;

             current =iv_ruleImageImporter; 
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
    // $ANTLR end "entryRuleImageImporter"


    // $ANTLR start "ruleImageImporter"
    // InternalExtendedIML.g:306:1: ruleImageImporter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_importedNamespace_2_0= ruleQualifiedImageName ) ) ) ;
    public final EObject ruleImageImporter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;



        	enterRule();

        try {
            // InternalExtendedIML.g:312:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_importedNamespace_2_0= ruleQualifiedImageName ) ) ) )
            // InternalExtendedIML.g:313:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_importedNamespace_2_0= ruleQualifiedImageName ) ) )
            {
            // InternalExtendedIML.g:313:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_importedNamespace_2_0= ruleQualifiedImageName ) ) )
            // InternalExtendedIML.g:314:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_importedNamespace_2_0= ruleQualifiedImageName ) )
            {
            // InternalExtendedIML.g:314:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalExtendedIML.g:315:4: (lv_name_0_0= RULE_ID )
            {
            // InternalExtendedIML.g:315:4: (lv_name_0_0= RULE_ID )
            // InternalExtendedIML.g:316:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getImageImporterAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageImporterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getImageImporterAccess().getEqualsSignKeyword_1());
            		
            // InternalExtendedIML.g:336:3: ( (lv_importedNamespace_2_0= ruleQualifiedImageName ) )
            // InternalExtendedIML.g:337:4: (lv_importedNamespace_2_0= ruleQualifiedImageName )
            {
            // InternalExtendedIML.g:337:4: (lv_importedNamespace_2_0= ruleQualifiedImageName )
            // InternalExtendedIML.g:338:5: lv_importedNamespace_2_0= ruleQualifiedImageName
            {

            					newCompositeNode(grammarAccess.getImageImporterAccess().getImportedNamespaceQualifiedImageNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_2_0=ruleQualifiedImageName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImageImporterRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_2_0,
            						"org.xtext.example.iml.ExtendedIML.QualifiedImageName");
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
    // $ANTLR end "ruleImageImporter"


    // $ANTLR start "entryRuleQualifiedImageName"
    // InternalExtendedIML.g:359:1: entryRuleQualifiedImageName returns [String current=null] : iv_ruleQualifiedImageName= ruleQualifiedImageName EOF ;
    public final String entryRuleQualifiedImageName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedImageName = null;


        try {
            // InternalExtendedIML.g:359:58: (iv_ruleQualifiedImageName= ruleQualifiedImageName EOF )
            // InternalExtendedIML.g:360:2: iv_ruleQualifiedImageName= ruleQualifiedImageName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedImageNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedImageName=ruleQualifiedImageName();

            state._fsp--;

             current =iv_ruleQualifiedImageName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedImageName"


    // $ANTLR start "ruleQualifiedImageName"
    // InternalExtendedIML.g:366:1: ruleQualifiedImageName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleQualifiedImageName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalExtendedIML.g:372:2: (this_ID_0= RULE_ID )
            // InternalExtendedIML.g:373:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getQualifiedImageNameAccess().getIDTerminalRuleCall());
            	

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
    // $ANTLR end "ruleQualifiedImageName"


    // $ANTLR start "entryRuleQualifiedPath"
    // InternalExtendedIML.g:383:1: entryRuleQualifiedPath returns [String current=null] : iv_ruleQualifiedPath= ruleQualifiedPath EOF ;
    public final String entryRuleQualifiedPath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedPath = null;


        try {
            // InternalExtendedIML.g:383:53: (iv_ruleQualifiedPath= ruleQualifiedPath EOF )
            // InternalExtendedIML.g:384:2: iv_ruleQualifiedPath= ruleQualifiedPath EOF
            {
             newCompositeNode(grammarAccess.getQualifiedPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedPath=ruleQualifiedPath();

            state._fsp--;

             current =iv_ruleQualifiedPath.getText(); 
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
    // $ANTLR end "entryRuleQualifiedPath"


    // $ANTLR start "ruleQualifiedPath"
    // InternalExtendedIML.g:390:1: ruleQualifiedPath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '/' )? this_ID_1= RULE_ID (kw= '/' this_ID_3= RULE_ID )* (kw= '.' this_ID_5= RULE_ID ) (kw= '/' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedPath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;
        Token this_ID_5=null;


        	enterRule();

        try {
            // InternalExtendedIML.g:396:2: ( ( (kw= '/' )? this_ID_1= RULE_ID (kw= '/' this_ID_3= RULE_ID )* (kw= '.' this_ID_5= RULE_ID ) (kw= '/' )? ) )
            // InternalExtendedIML.g:397:2: ( (kw= '/' )? this_ID_1= RULE_ID (kw= '/' this_ID_3= RULE_ID )* (kw= '.' this_ID_5= RULE_ID ) (kw= '/' )? )
            {
            // InternalExtendedIML.g:397:2: ( (kw= '/' )? this_ID_1= RULE_ID (kw= '/' this_ID_3= RULE_ID )* (kw= '.' this_ID_5= RULE_ID ) (kw= '/' )? )
            // InternalExtendedIML.g:398:3: (kw= '/' )? this_ID_1= RULE_ID (kw= '/' this_ID_3= RULE_ID )* (kw= '.' this_ID_5= RULE_ID ) (kw= '/' )?
            {
            // InternalExtendedIML.g:398:3: (kw= '/' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalExtendedIML.g:399:4: kw= '/'
                    {
                    kw=(Token)match(input,14,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedPathAccess().getSolidusKeyword_0());
                    			

                    }
                    break;

            }

            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_6); 

            			current.merge(this_ID_1);
            		

            			newLeafNode(this_ID_1, grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_1());
            		
            // InternalExtendedIML.g:412:3: (kw= '/' this_ID_3= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalExtendedIML.g:413:4: kw= '/' this_ID_3= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedPathAccess().getSolidusKeyword_2_0());
            	    			
            	    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    				current.merge(this_ID_3);
            	    			

            	    				newLeafNode(this_ID_3, grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalExtendedIML.g:426:3: (kw= '.' this_ID_5= RULE_ID )
            // InternalExtendedIML.g:427:4: kw= '.' this_ID_5= RULE_ID
            {
            kw=(Token)match(input,15,FOLLOW_4); 

            				current.merge(kw);
            				newLeafNode(kw, grammarAccess.getQualifiedPathAccess().getFullStopKeyword_3_0());
            			
            this_ID_5=(Token)match(input,RULE_ID,FOLLOW_7); 

            				current.merge(this_ID_5);
            			

            				newLeafNode(this_ID_5, grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_3_1());
            			

            }

            // InternalExtendedIML.g:440:3: (kw= '/' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalExtendedIML.g:441:4: kw= '/'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedPathAccess().getSolidusKeyword_4());
                    			

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
    // $ANTLR end "ruleQualifiedPath"


    // $ANTLR start "entryRuleDirImporter"
    // InternalExtendedIML.g:451:1: entryRuleDirImporter returns [EObject current=null] : iv_ruleDirImporter= ruleDirImporter EOF ;
    public final EObject entryRuleDirImporter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirImporter = null;


        try {
            // InternalExtendedIML.g:451:52: (iv_ruleDirImporter= ruleDirImporter EOF )
            // InternalExtendedIML.g:452:2: iv_ruleDirImporter= ruleDirImporter EOF
            {
             newCompositeNode(grammarAccess.getDirImporterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirImporter=ruleDirImporter();

            state._fsp--;

             current =iv_ruleDirImporter; 
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
    // $ANTLR end "entryRuleDirImporter"


    // $ANTLR start "ruleDirImporter"
    // InternalExtendedIML.g:458:1: ruleDirImporter returns [EObject current=null] : (otherlv_0= 'images' ( (lv_pathDir_1_0= ruleQualifiedPath ) ) ) ;
    public final EObject ruleDirImporter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_pathDir_1_0 = null;



        	enterRule();

        try {
            // InternalExtendedIML.g:464:2: ( (otherlv_0= 'images' ( (lv_pathDir_1_0= ruleQualifiedPath ) ) ) )
            // InternalExtendedIML.g:465:2: (otherlv_0= 'images' ( (lv_pathDir_1_0= ruleQualifiedPath ) ) )
            {
            // InternalExtendedIML.g:465:2: (otherlv_0= 'images' ( (lv_pathDir_1_0= ruleQualifiedPath ) ) )
            // InternalExtendedIML.g:466:3: otherlv_0= 'images' ( (lv_pathDir_1_0= ruleQualifiedPath ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDirImporterAccess().getImagesKeyword_0());
            		
            // InternalExtendedIML.g:470:3: ( (lv_pathDir_1_0= ruleQualifiedPath ) )
            // InternalExtendedIML.g:471:4: (lv_pathDir_1_0= ruleQualifiedPath )
            {
            // InternalExtendedIML.g:471:4: (lv_pathDir_1_0= ruleQualifiedPath )
            // InternalExtendedIML.g:472:5: lv_pathDir_1_0= ruleQualifiedPath
            {

            					newCompositeNode(grammarAccess.getDirImporterAccess().getPathDirQualifiedPathParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_pathDir_1_0=ruleQualifiedPath();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDirImporterRule());
            					}
            					set(
            						current,
            						"pathDir",
            						lv_pathDir_1_0,
            						"org.xtext.example.iml.ExtendedIML.QualifiedPath");
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
    // $ANTLR end "ruleDirImporter"


    // $ANTLR start "entryRuleOperator"
    // InternalExtendedIML.g:493:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalExtendedIML.g:493:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalExtendedIML.g:494:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator; 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalExtendedIML.g:500:1: ruleOperator returns [EObject current=null] : (this_RotateOperation_0= ruleRotateOperation | this_FilterOperation_1= ruleFilterOperation | this_BlurOperation_2= ruleBlurOperation | this_EqualizeOperation_3= ruleEqualizeOperation ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        EObject this_RotateOperation_0 = null;

        EObject this_FilterOperation_1 = null;

        EObject this_BlurOperation_2 = null;

        EObject this_EqualizeOperation_3 = null;



        	enterRule();

        try {
            // InternalExtendedIML.g:506:2: ( (this_RotateOperation_0= ruleRotateOperation | this_FilterOperation_1= ruleFilterOperation | this_BlurOperation_2= ruleBlurOperation | this_EqualizeOperation_3= ruleEqualizeOperation ) )
            // InternalExtendedIML.g:507:2: (this_RotateOperation_0= ruleRotateOperation | this_FilterOperation_1= ruleFilterOperation | this_BlurOperation_2= ruleBlurOperation | this_EqualizeOperation_3= ruleEqualizeOperation )
            {
            // InternalExtendedIML.g:507:2: (this_RotateOperation_0= ruleRotateOperation | this_FilterOperation_1= ruleFilterOperation | this_BlurOperation_2= ruleBlurOperation | this_EqualizeOperation_3= ruleEqualizeOperation )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt8=1;
                }
                break;
            case 18:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            case 21:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalExtendedIML.g:508:3: this_RotateOperation_0= ruleRotateOperation
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getRotateOperationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RotateOperation_0=ruleRotateOperation();

                    state._fsp--;


                    			current = this_RotateOperation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalExtendedIML.g:517:3: this_FilterOperation_1= ruleFilterOperation
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getFilterOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FilterOperation_1=ruleFilterOperation();

                    state._fsp--;


                    			current = this_FilterOperation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalExtendedIML.g:526:3: this_BlurOperation_2= ruleBlurOperation
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getBlurOperationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BlurOperation_2=ruleBlurOperation();

                    state._fsp--;


                    			current = this_BlurOperation_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalExtendedIML.g:535:3: this_EqualizeOperation_3= ruleEqualizeOperation
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getEqualizeOperationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EqualizeOperation_3=ruleEqualizeOperation();

                    state._fsp--;


                    			current = this_EqualizeOperation_3;
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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleRotateOperation"
    // InternalExtendedIML.g:547:1: entryRuleRotateOperation returns [EObject current=null] : iv_ruleRotateOperation= ruleRotateOperation EOF ;
    public final EObject entryRuleRotateOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotateOperation = null;


        try {
            // InternalExtendedIML.g:547:56: (iv_ruleRotateOperation= ruleRotateOperation EOF )
            // InternalExtendedIML.g:548:2: iv_ruleRotateOperation= ruleRotateOperation EOF
            {
             newCompositeNode(grammarAccess.getRotateOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotateOperation=ruleRotateOperation();

            state._fsp--;

             current =iv_ruleRotateOperation; 
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
    // $ANTLR end "entryRuleRotateOperation"


    // $ANTLR start "ruleRotateOperation"
    // InternalExtendedIML.g:554:1: ruleRotateOperation returns [EObject current=null] : (otherlv_0= 'rotate' ( (lv_var_1_0= RULE_ID ) ) ( (lv_degree_2_0= RULE_INT ) ) ) ;
    public final EObject ruleRotateOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_1_0=null;
        Token lv_degree_2_0=null;


        	enterRule();

        try {
            // InternalExtendedIML.g:560:2: ( (otherlv_0= 'rotate' ( (lv_var_1_0= RULE_ID ) ) ( (lv_degree_2_0= RULE_INT ) ) ) )
            // InternalExtendedIML.g:561:2: (otherlv_0= 'rotate' ( (lv_var_1_0= RULE_ID ) ) ( (lv_degree_2_0= RULE_INT ) ) )
            {
            // InternalExtendedIML.g:561:2: (otherlv_0= 'rotate' ( (lv_var_1_0= RULE_ID ) ) ( (lv_degree_2_0= RULE_INT ) ) )
            // InternalExtendedIML.g:562:3: otherlv_0= 'rotate' ( (lv_var_1_0= RULE_ID ) ) ( (lv_degree_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateOperationAccess().getRotateKeyword_0());
            		
            // InternalExtendedIML.g:566:3: ( (lv_var_1_0= RULE_ID ) )
            // InternalExtendedIML.g:567:4: (lv_var_1_0= RULE_ID )
            {
            // InternalExtendedIML.g:567:4: (lv_var_1_0= RULE_ID )
            // InternalExtendedIML.g:568:5: lv_var_1_0= RULE_ID
            {
            lv_var_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_var_1_0, grammarAccess.getRotateOperationAccess().getVarIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalExtendedIML.g:584:3: ( (lv_degree_2_0= RULE_INT ) )
            // InternalExtendedIML.g:585:4: (lv_degree_2_0= RULE_INT )
            {
            // InternalExtendedIML.g:585:4: (lv_degree_2_0= RULE_INT )
            // InternalExtendedIML.g:586:5: lv_degree_2_0= RULE_INT
            {
            lv_degree_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_degree_2_0, grammarAccess.getRotateOperationAccess().getDegreeINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRotateOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"degree",
            						lv_degree_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleRotateOperation"


    // $ANTLR start "entryRuleFilterOperation"
    // InternalExtendedIML.g:606:1: entryRuleFilterOperation returns [EObject current=null] : iv_ruleFilterOperation= ruleFilterOperation EOF ;
    public final EObject entryRuleFilterOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterOperation = null;


        try {
            // InternalExtendedIML.g:606:56: (iv_ruleFilterOperation= ruleFilterOperation EOF )
            // InternalExtendedIML.g:607:2: iv_ruleFilterOperation= ruleFilterOperation EOF
            {
             newCompositeNode(grammarAccess.getFilterOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterOperation=ruleFilterOperation();

            state._fsp--;

             current =iv_ruleFilterOperation; 
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
    // $ANTLR end "entryRuleFilterOperation"


    // $ANTLR start "ruleFilterOperation"
    // InternalExtendedIML.g:613:1: ruleFilterOperation returns [EObject current=null] : (otherlv_0= 'filter' ( (lv_var_1_0= RULE_ID ) ) otherlv_2= 'gray' ) ;
    public final EObject ruleFilterOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalExtendedIML.g:619:2: ( (otherlv_0= 'filter' ( (lv_var_1_0= RULE_ID ) ) otherlv_2= 'gray' ) )
            // InternalExtendedIML.g:620:2: (otherlv_0= 'filter' ( (lv_var_1_0= RULE_ID ) ) otherlv_2= 'gray' )
            {
            // InternalExtendedIML.g:620:2: (otherlv_0= 'filter' ( (lv_var_1_0= RULE_ID ) ) otherlv_2= 'gray' )
            // InternalExtendedIML.g:621:3: otherlv_0= 'filter' ( (lv_var_1_0= RULE_ID ) ) otherlv_2= 'gray'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFilterOperationAccess().getFilterKeyword_0());
            		
            // InternalExtendedIML.g:625:3: ( (lv_var_1_0= RULE_ID ) )
            // InternalExtendedIML.g:626:4: (lv_var_1_0= RULE_ID )
            {
            // InternalExtendedIML.g:626:4: (lv_var_1_0= RULE_ID )
            // InternalExtendedIML.g:627:5: lv_var_1_0= RULE_ID
            {
            lv_var_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_var_1_0, grammarAccess.getFilterOperationAccess().getVarIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFilterOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getFilterOperationAccess().getGrayKeyword_2());
            		

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
    // $ANTLR end "ruleFilterOperation"


    // $ANTLR start "entryRuleBlurOperation"
    // InternalExtendedIML.g:651:1: entryRuleBlurOperation returns [EObject current=null] : iv_ruleBlurOperation= ruleBlurOperation EOF ;
    public final EObject entryRuleBlurOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlurOperation = null;


        try {
            // InternalExtendedIML.g:651:54: (iv_ruleBlurOperation= ruleBlurOperation EOF )
            // InternalExtendedIML.g:652:2: iv_ruleBlurOperation= ruleBlurOperation EOF
            {
             newCompositeNode(grammarAccess.getBlurOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlurOperation=ruleBlurOperation();

            state._fsp--;

             current =iv_ruleBlurOperation; 
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
    // $ANTLR end "entryRuleBlurOperation"


    // $ANTLR start "ruleBlurOperation"
    // InternalExtendedIML.g:658:1: ruleBlurOperation returns [EObject current=null] : (otherlv_0= 'blur' ( (lv_var_1_0= RULE_ID ) ) ( (lv_intensity_2_0= RULE_INT ) ) ) ;
    public final EObject ruleBlurOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_1_0=null;
        Token lv_intensity_2_0=null;


        	enterRule();

        try {
            // InternalExtendedIML.g:664:2: ( (otherlv_0= 'blur' ( (lv_var_1_0= RULE_ID ) ) ( (lv_intensity_2_0= RULE_INT ) ) ) )
            // InternalExtendedIML.g:665:2: (otherlv_0= 'blur' ( (lv_var_1_0= RULE_ID ) ) ( (lv_intensity_2_0= RULE_INT ) ) )
            {
            // InternalExtendedIML.g:665:2: (otherlv_0= 'blur' ( (lv_var_1_0= RULE_ID ) ) ( (lv_intensity_2_0= RULE_INT ) ) )
            // InternalExtendedIML.g:666:3: otherlv_0= 'blur' ( (lv_var_1_0= RULE_ID ) ) ( (lv_intensity_2_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBlurOperationAccess().getBlurKeyword_0());
            		
            // InternalExtendedIML.g:670:3: ( (lv_var_1_0= RULE_ID ) )
            // InternalExtendedIML.g:671:4: (lv_var_1_0= RULE_ID )
            {
            // InternalExtendedIML.g:671:4: (lv_var_1_0= RULE_ID )
            // InternalExtendedIML.g:672:5: lv_var_1_0= RULE_ID
            {
            lv_var_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_var_1_0, grammarAccess.getBlurOperationAccess().getVarIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBlurOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalExtendedIML.g:688:3: ( (lv_intensity_2_0= RULE_INT ) )
            // InternalExtendedIML.g:689:4: (lv_intensity_2_0= RULE_INT )
            {
            // InternalExtendedIML.g:689:4: (lv_intensity_2_0= RULE_INT )
            // InternalExtendedIML.g:690:5: lv_intensity_2_0= RULE_INT
            {
            lv_intensity_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_intensity_2_0, grammarAccess.getBlurOperationAccess().getIntensityINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBlurOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"intensity",
            						lv_intensity_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleBlurOperation"


    // $ANTLR start "entryRuleEqualizeOperation"
    // InternalExtendedIML.g:710:1: entryRuleEqualizeOperation returns [EObject current=null] : iv_ruleEqualizeOperation= ruleEqualizeOperation EOF ;
    public final EObject entryRuleEqualizeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualizeOperation = null;


        try {
            // InternalExtendedIML.g:710:58: (iv_ruleEqualizeOperation= ruleEqualizeOperation EOF )
            // InternalExtendedIML.g:711:2: iv_ruleEqualizeOperation= ruleEqualizeOperation EOF
            {
             newCompositeNode(grammarAccess.getEqualizeOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEqualizeOperation=ruleEqualizeOperation();

            state._fsp--;

             current =iv_ruleEqualizeOperation; 
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
    // $ANTLR end "entryRuleEqualizeOperation"


    // $ANTLR start "ruleEqualizeOperation"
    // InternalExtendedIML.g:717:1: ruleEqualizeOperation returns [EObject current=null] : (otherlv_0= 'equalize' ( (lv_var_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEqualizeOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_1_0=null;


        	enterRule();

        try {
            // InternalExtendedIML.g:723:2: ( (otherlv_0= 'equalize' ( (lv_var_1_0= RULE_ID ) ) ) )
            // InternalExtendedIML.g:724:2: (otherlv_0= 'equalize' ( (lv_var_1_0= RULE_ID ) ) )
            {
            // InternalExtendedIML.g:724:2: (otherlv_0= 'equalize' ( (lv_var_1_0= RULE_ID ) ) )
            // InternalExtendedIML.g:725:3: otherlv_0= 'equalize' ( (lv_var_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEqualizeOperationAccess().getEqualizeKeyword_0());
            		
            // InternalExtendedIML.g:729:3: ( (lv_var_1_0= RULE_ID ) )
            // InternalExtendedIML.g:730:4: (lv_var_1_0= RULE_ID )
            {
            // InternalExtendedIML.g:730:4: (lv_var_1_0= RULE_ID )
            // InternalExtendedIML.g:731:5: lv_var_1_0= RULE_ID
            {
            lv_var_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_var_1_0, grammarAccess.getEqualizeOperationAccess().getVarIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEqualizeOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"var",
            						lv_var_1_0,
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
    // $ANTLR end "ruleEqualizeOperation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000371812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});

}