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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT1", "RULE_INT2", "RULE_INT3", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'.'", "'/'", "':'", "'path'", "'rotate'", "'filter'", "'gray'", "'blur'", "'equalize'", "'show'", "'save'", "'fill'"
    };
    public static final int RULE_INT1=5;
    public static final int RULE_INT2=6;
    public static final int RULE_INT3=7;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int RULE_INT=8;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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

                if ( (LA1_0==RULE_ID||(LA1_0>=18 && LA1_0<=20)||(LA1_0>=22 && LA1_0<=26)) ) {
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
    // InternalExtendedIML.g:107:1: ruleAbstractElement returns [EObject current=null] : (this_Importer_0= ruleImporter | this_Operator_1= ruleOperator ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Importer_0 = null;

        EObject this_Operator_1 = null;



        	enterRule();

        try {
            // InternalExtendedIML.g:113:2: ( (this_Importer_0= ruleImporter | this_Operator_1= ruleOperator ) )
            // InternalExtendedIML.g:114:2: (this_Importer_0= ruleImporter | this_Operator_1= ruleOperator )
            {
            // InternalExtendedIML.g:114:2: (this_Importer_0= ruleImporter | this_Operator_1= ruleOperator )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==18) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=19 && LA2_0<=20)||(LA2_0>=22 && LA2_0<=26)) ) {
                alt2=2;
            }
            else {
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


    // $ANTLR start "entryRuleImporter"
    // InternalExtendedIML.g:136:1: entryRuleImporter returns [EObject current=null] : iv_ruleImporter= ruleImporter EOF ;
    public final EObject entryRuleImporter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImporter = null;


        try {
            // InternalExtendedIML.g:136:49: (iv_ruleImporter= ruleImporter EOF )
            // InternalExtendedIML.g:137:2: iv_ruleImporter= ruleImporter EOF
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
    // InternalExtendedIML.g:143:1: ruleImporter returns [EObject current=null] : (this_ImageImporter_0= ruleImageImporter | this_DirImporter_1= ruleDirImporter ) ;
    public final EObject ruleImporter() throws RecognitionException {
        EObject current = null;

        EObject this_ImageImporter_0 = null;

        EObject this_DirImporter_1 = null;



        	enterRule();

        try {
            // InternalExtendedIML.g:149:2: ( (this_ImageImporter_0= ruleImageImporter | this_DirImporter_1= ruleDirImporter ) )
            // InternalExtendedIML.g:150:2: (this_ImageImporter_0= ruleImageImporter | this_DirImporter_1= ruleDirImporter )
            {
            // InternalExtendedIML.g:150:2: (this_ImageImporter_0= ruleImageImporter | this_DirImporter_1= ruleDirImporter )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalExtendedIML.g:151:3: this_ImageImporter_0= ruleImageImporter
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
                    // InternalExtendedIML.g:160:3: this_DirImporter_1= ruleDirImporter
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
    // InternalExtendedIML.g:172:1: entryRuleImageImporter returns [EObject current=null] : iv_ruleImageImporter= ruleImageImporter EOF ;
    public final EObject entryRuleImageImporter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageImporter = null;


        try {
            // InternalExtendedIML.g:172:54: (iv_ruleImageImporter= ruleImageImporter EOF )
            // InternalExtendedIML.g:173:2: iv_ruleImageImporter= ruleImageImporter EOF
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
    // InternalExtendedIML.g:179:1: ruleImageImporter returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_importedNamespace_2_0= ruleQualifiedImageName ) ) ) ;
    public final EObject ruleImageImporter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;



        	enterRule();

        try {
            // InternalExtendedIML.g:185:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_importedNamespace_2_0= ruleQualifiedImageName ) ) ) )
            // InternalExtendedIML.g:186:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_importedNamespace_2_0= ruleQualifiedImageName ) ) )
            {
            // InternalExtendedIML.g:186:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_importedNamespace_2_0= ruleQualifiedImageName ) ) )
            // InternalExtendedIML.g:187:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_importedNamespace_2_0= ruleQualifiedImageName ) )
            {
            // InternalExtendedIML.g:187:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalExtendedIML.g:188:4: (lv_name_0_0= RULE_ID )
            {
            // InternalExtendedIML.g:188:4: (lv_name_0_0= RULE_ID )
            // InternalExtendedIML.g:189:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

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

            otherlv_1=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getImageImporterAccess().getEqualsSignKeyword_1());
            		
            // InternalExtendedIML.g:209:3: ( (lv_importedNamespace_2_0= ruleQualifiedImageName ) )
            // InternalExtendedIML.g:210:4: (lv_importedNamespace_2_0= ruleQualifiedImageName )
            {
            // InternalExtendedIML.g:210:4: (lv_importedNamespace_2_0= ruleQualifiedImageName )
            // InternalExtendedIML.g:211:5: lv_importedNamespace_2_0= ruleQualifiedImageName
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
    // InternalExtendedIML.g:232:1: entryRuleQualifiedImageName returns [String current=null] : iv_ruleQualifiedImageName= ruleQualifiedImageName EOF ;
    public final String entryRuleQualifiedImageName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedImageName = null;


        try {
            // InternalExtendedIML.g:232:58: (iv_ruleQualifiedImageName= ruleQualifiedImageName EOF )
            // InternalExtendedIML.g:233:2: iv_ruleQualifiedImageName= ruleQualifiedImageName EOF
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
    // InternalExtendedIML.g:239:1: ruleQualifiedImageName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleQualifiedImageName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalExtendedIML.g:245:2: (this_ID_0= RULE_ID )
            // InternalExtendedIML.g:246:2: this_ID_0= RULE_ID
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
    // InternalExtendedIML.g:256:1: entryRuleQualifiedPath returns [String current=null] : iv_ruleQualifiedPath= ruleQualifiedPath EOF ;
    public final String entryRuleQualifiedPath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedPath = null;


        try {
            // InternalExtendedIML.g:256:53: (iv_ruleQualifiedPath= ruleQualifiedPath EOF )
            // InternalExtendedIML.g:257:2: iv_ruleQualifiedPath= ruleQualifiedPath EOF
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
    // InternalExtendedIML.g:263:1: ruleQualifiedPath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '.' )? (kw= '/' )? this_ID_2= RULE_ID (kw= ':' )? (kw= '/' this_ID_5= RULE_ID )* (kw= '/' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedPath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_5=null;


        	enterRule();

        try {
            // InternalExtendedIML.g:269:2: ( ( (kw= '.' )? (kw= '/' )? this_ID_2= RULE_ID (kw= ':' )? (kw= '/' this_ID_5= RULE_ID )* (kw= '/' )? ) )
            // InternalExtendedIML.g:270:2: ( (kw= '.' )? (kw= '/' )? this_ID_2= RULE_ID (kw= ':' )? (kw= '/' this_ID_5= RULE_ID )* (kw= '/' )? )
            {
            // InternalExtendedIML.g:270:2: ( (kw= '.' )? (kw= '/' )? this_ID_2= RULE_ID (kw= ':' )? (kw= '/' this_ID_5= RULE_ID )* (kw= '/' )? )
            // InternalExtendedIML.g:271:3: (kw= '.' )? (kw= '/' )? this_ID_2= RULE_ID (kw= ':' )? (kw= '/' this_ID_5= RULE_ID )* (kw= '/' )?
            {
            // InternalExtendedIML.g:271:3: (kw= '.' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalExtendedIML.g:272:4: kw= '.'
                    {
                    kw=(Token)match(input,15,FOLLOW_6); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedPathAccess().getFullStopKeyword_0());
                    			

                    }
                    break;

            }

            // InternalExtendedIML.g:278:3: (kw= '/' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalExtendedIML.g:279:4: kw= '/'
                    {
                    kw=(Token)match(input,16,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedPathAccess().getSolidusKeyword_1());
                    			

                    }
                    break;

            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_2);
            		

            			newLeafNode(this_ID_2, grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_2());
            		
            // InternalExtendedIML.g:292:3: (kw= ':' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalExtendedIML.g:293:4: kw= ':'
                    {
                    kw=(Token)match(input,17,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedPathAccess().getColonKeyword_3());
                    			

                    }
                    break;

            }

            // InternalExtendedIML.g:299:3: (kw= '/' this_ID_5= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==RULE_ID) ) {
                        int LA7_3 = input.LA(3);

                        if ( (LA7_3==EOF||LA7_3==RULE_ID||LA7_3==16||(LA7_3>=18 && LA7_3<=20)||(LA7_3>=22 && LA7_3<=26)) ) {
                            alt7=1;
                        }


                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalExtendedIML.g:300:4: kw= '/' this_ID_5= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedPathAccess().getSolidusKeyword_4_0());
            	    			
            	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    				current.merge(this_ID_5);
            	    			

            	    				newLeafNode(this_ID_5, grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_4_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalExtendedIML.g:313:3: (kw= '/' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalExtendedIML.g:314:4: kw= '/'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedPathAccess().getSolidusKeyword_5());
                    			

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
    // InternalExtendedIML.g:324:1: entryRuleDirImporter returns [EObject current=null] : iv_ruleDirImporter= ruleDirImporter EOF ;
    public final EObject entryRuleDirImporter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirImporter = null;


        try {
            // InternalExtendedIML.g:324:52: (iv_ruleDirImporter= ruleDirImporter EOF )
            // InternalExtendedIML.g:325:2: iv_ruleDirImporter= ruleDirImporter EOF
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
    // InternalExtendedIML.g:331:1: ruleDirImporter returns [EObject current=null] : (otherlv_0= 'path' ( (lv_pathDir_1_0= ruleQualifiedPath ) ) ) ;
    public final EObject ruleDirImporter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_pathDir_1_0 = null;



        	enterRule();

        try {
            // InternalExtendedIML.g:337:2: ( (otherlv_0= 'path' ( (lv_pathDir_1_0= ruleQualifiedPath ) ) ) )
            // InternalExtendedIML.g:338:2: (otherlv_0= 'path' ( (lv_pathDir_1_0= ruleQualifiedPath ) ) )
            {
            // InternalExtendedIML.g:338:2: (otherlv_0= 'path' ( (lv_pathDir_1_0= ruleQualifiedPath ) ) )
            // InternalExtendedIML.g:339:3: otherlv_0= 'path' ( (lv_pathDir_1_0= ruleQualifiedPath ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getDirImporterAccess().getPathKeyword_0());
            		
            // InternalExtendedIML.g:343:3: ( (lv_pathDir_1_0= ruleQualifiedPath ) )
            // InternalExtendedIML.g:344:4: (lv_pathDir_1_0= ruleQualifiedPath )
            {
            // InternalExtendedIML.g:344:4: (lv_pathDir_1_0= ruleQualifiedPath )
            // InternalExtendedIML.g:345:5: lv_pathDir_1_0= ruleQualifiedPath
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
    // InternalExtendedIML.g:366:1: entryRuleOperator returns [EObject current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final EObject entryRuleOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperator = null;


        try {
            // InternalExtendedIML.g:366:49: (iv_ruleOperator= ruleOperator EOF )
            // InternalExtendedIML.g:367:2: iv_ruleOperator= ruleOperator EOF
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
    // InternalExtendedIML.g:373:1: ruleOperator returns [EObject current=null] : (this_RotateOperation_0= ruleRotateOperation | this_FilterOperation_1= ruleFilterOperation | this_BlurOperation_2= ruleBlurOperation | this_EqualizeOperation_3= ruleEqualizeOperation | this_ShowOperation_4= ruleShowOperation | this_SaveOperation_5= ruleSaveOperation | this_FillOperation_6= ruleFillOperation ) ;
    public final EObject ruleOperator() throws RecognitionException {
        EObject current = null;

        EObject this_RotateOperation_0 = null;

        EObject this_FilterOperation_1 = null;

        EObject this_BlurOperation_2 = null;

        EObject this_EqualizeOperation_3 = null;

        EObject this_ShowOperation_4 = null;

        EObject this_SaveOperation_5 = null;

        EObject this_FillOperation_6 = null;



        	enterRule();

        try {
            // InternalExtendedIML.g:379:2: ( (this_RotateOperation_0= ruleRotateOperation | this_FilterOperation_1= ruleFilterOperation | this_BlurOperation_2= ruleBlurOperation | this_EqualizeOperation_3= ruleEqualizeOperation | this_ShowOperation_4= ruleShowOperation | this_SaveOperation_5= ruleSaveOperation | this_FillOperation_6= ruleFillOperation ) )
            // InternalExtendedIML.g:380:2: (this_RotateOperation_0= ruleRotateOperation | this_FilterOperation_1= ruleFilterOperation | this_BlurOperation_2= ruleBlurOperation | this_EqualizeOperation_3= ruleEqualizeOperation | this_ShowOperation_4= ruleShowOperation | this_SaveOperation_5= ruleSaveOperation | this_FillOperation_6= ruleFillOperation )
            {
            // InternalExtendedIML.g:380:2: (this_RotateOperation_0= ruleRotateOperation | this_FilterOperation_1= ruleFilterOperation | this_BlurOperation_2= ruleBlurOperation | this_EqualizeOperation_3= ruleEqualizeOperation | this_ShowOperation_4= ruleShowOperation | this_SaveOperation_5= ruleSaveOperation | this_FillOperation_6= ruleFillOperation )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            case 23:
                {
                alt9=4;
                }
                break;
            case 24:
                {
                alt9=5;
                }
                break;
            case 25:
                {
                alt9=6;
                }
                break;
            case 26:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalExtendedIML.g:381:3: this_RotateOperation_0= ruleRotateOperation
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
                    // InternalExtendedIML.g:390:3: this_FilterOperation_1= ruleFilterOperation
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
                    // InternalExtendedIML.g:399:3: this_BlurOperation_2= ruleBlurOperation
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
                    // InternalExtendedIML.g:408:3: this_EqualizeOperation_3= ruleEqualizeOperation
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getEqualizeOperationParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EqualizeOperation_3=ruleEqualizeOperation();

                    state._fsp--;


                    			current = this_EqualizeOperation_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalExtendedIML.g:417:3: this_ShowOperation_4= ruleShowOperation
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getShowOperationParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ShowOperation_4=ruleShowOperation();

                    state._fsp--;


                    			current = this_ShowOperation_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalExtendedIML.g:426:3: this_SaveOperation_5= ruleSaveOperation
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getSaveOperationParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_SaveOperation_5=ruleSaveOperation();

                    state._fsp--;


                    			current = this_SaveOperation_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalExtendedIML.g:435:3: this_FillOperation_6= ruleFillOperation
                    {

                    			newCompositeNode(grammarAccess.getOperatorAccess().getFillOperationParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_FillOperation_6=ruleFillOperation();

                    state._fsp--;


                    			current = this_FillOperation_6;
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
    // InternalExtendedIML.g:447:1: entryRuleRotateOperation returns [EObject current=null] : iv_ruleRotateOperation= ruleRotateOperation EOF ;
    public final EObject entryRuleRotateOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotateOperation = null;


        try {
            // InternalExtendedIML.g:447:56: (iv_ruleRotateOperation= ruleRotateOperation EOF )
            // InternalExtendedIML.g:448:2: iv_ruleRotateOperation= ruleRotateOperation EOF
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
    // InternalExtendedIML.g:454:1: ruleRotateOperation returns [EObject current=null] : (otherlv_0= 'rotate' ( (lv_var_1_0= RULE_ID ) )? ( (lv_degree_2_0= ruleValidRotateInt ) ) ) ;
    public final EObject ruleRotateOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_1_0=null;
        AntlrDatatypeRuleToken lv_degree_2_0 = null;



        	enterRule();

        try {
            // InternalExtendedIML.g:460:2: ( (otherlv_0= 'rotate' ( (lv_var_1_0= RULE_ID ) )? ( (lv_degree_2_0= ruleValidRotateInt ) ) ) )
            // InternalExtendedIML.g:461:2: (otherlv_0= 'rotate' ( (lv_var_1_0= RULE_ID ) )? ( (lv_degree_2_0= ruleValidRotateInt ) ) )
            {
            // InternalExtendedIML.g:461:2: (otherlv_0= 'rotate' ( (lv_var_1_0= RULE_ID ) )? ( (lv_degree_2_0= ruleValidRotateInt ) ) )
            // InternalExtendedIML.g:462:3: otherlv_0= 'rotate' ( (lv_var_1_0= RULE_ID ) )? ( (lv_degree_2_0= ruleValidRotateInt ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRotateOperationAccess().getRotateKeyword_0());
            		
            // InternalExtendedIML.g:466:3: ( (lv_var_1_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalExtendedIML.g:467:4: (lv_var_1_0= RULE_ID )
                    {
                    // InternalExtendedIML.g:467:4: (lv_var_1_0= RULE_ID )
                    // InternalExtendedIML.g:468:5: lv_var_1_0= RULE_ID
                    {
                    lv_var_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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
                    break;

            }

            // InternalExtendedIML.g:484:3: ( (lv_degree_2_0= ruleValidRotateInt ) )
            // InternalExtendedIML.g:485:4: (lv_degree_2_0= ruleValidRotateInt )
            {
            // InternalExtendedIML.g:485:4: (lv_degree_2_0= ruleValidRotateInt )
            // InternalExtendedIML.g:486:5: lv_degree_2_0= ruleValidRotateInt
            {

            					newCompositeNode(grammarAccess.getRotateOperationAccess().getDegreeValidRotateIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_degree_2_0=ruleValidRotateInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRotateOperationRule());
            					}
            					set(
            						current,
            						"degree",
            						lv_degree_2_0,
            						"org.xtext.example.iml.ExtendedIML.ValidRotateInt");
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
    // $ANTLR end "ruleRotateOperation"


    // $ANTLR start "entryRuleValidRotateInt"
    // InternalExtendedIML.g:507:1: entryRuleValidRotateInt returns [String current=null] : iv_ruleValidRotateInt= ruleValidRotateInt EOF ;
    public final String entryRuleValidRotateInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidRotateInt = null;


        try {
            // InternalExtendedIML.g:507:54: (iv_ruleValidRotateInt= ruleValidRotateInt EOF )
            // InternalExtendedIML.g:508:2: iv_ruleValidRotateInt= ruleValidRotateInt EOF
            {
             newCompositeNode(grammarAccess.getValidRotateIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidRotateInt=ruleValidRotateInt();

            state._fsp--;

             current =iv_ruleValidRotateInt.getText(); 
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
    // $ANTLR end "entryRuleValidRotateInt"


    // $ANTLR start "ruleValidRotateInt"
    // InternalExtendedIML.g:514:1: ruleValidRotateInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT1_0= RULE_INT1 | this_INT2_1= RULE_INT2 | this_INT3_2= RULE_INT3 ) ;
    public final AntlrDatatypeRuleToken ruleValidRotateInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT1_0=null;
        Token this_INT2_1=null;
        Token this_INT3_2=null;


        	enterRule();

        try {
            // InternalExtendedIML.g:520:2: ( (this_INT1_0= RULE_INT1 | this_INT2_1= RULE_INT2 | this_INT3_2= RULE_INT3 ) )
            // InternalExtendedIML.g:521:2: (this_INT1_0= RULE_INT1 | this_INT2_1= RULE_INT2 | this_INT3_2= RULE_INT3 )
            {
            // InternalExtendedIML.g:521:2: (this_INT1_0= RULE_INT1 | this_INT2_1= RULE_INT2 | this_INT3_2= RULE_INT3 )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_INT1:
                {
                alt11=1;
                }
                break;
            case RULE_INT2:
                {
                alt11=2;
                }
                break;
            case RULE_INT3:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalExtendedIML.g:522:3: this_INT1_0= RULE_INT1
                    {
                    this_INT1_0=(Token)match(input,RULE_INT1,FOLLOW_2); 

                    			current.merge(this_INT1_0);
                    		

                    			newLeafNode(this_INT1_0, grammarAccess.getValidRotateIntAccess().getINT1TerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalExtendedIML.g:530:3: this_INT2_1= RULE_INT2
                    {
                    this_INT2_1=(Token)match(input,RULE_INT2,FOLLOW_2); 

                    			current.merge(this_INT2_1);
                    		

                    			newLeafNode(this_INT2_1, grammarAccess.getValidRotateIntAccess().getINT2TerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalExtendedIML.g:538:3: this_INT3_2= RULE_INT3
                    {
                    this_INT3_2=(Token)match(input,RULE_INT3,FOLLOW_2); 

                    			current.merge(this_INT3_2);
                    		

                    			newLeafNode(this_INT3_2, grammarAccess.getValidRotateIntAccess().getINT3TerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleValidRotateInt"


    // $ANTLR start "entryRuleFilterOperation"
    // InternalExtendedIML.g:549:1: entryRuleFilterOperation returns [EObject current=null] : iv_ruleFilterOperation= ruleFilterOperation EOF ;
    public final EObject entryRuleFilterOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterOperation = null;


        try {
            // InternalExtendedIML.g:549:56: (iv_ruleFilterOperation= ruleFilterOperation EOF )
            // InternalExtendedIML.g:550:2: iv_ruleFilterOperation= ruleFilterOperation EOF
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
    // InternalExtendedIML.g:556:1: ruleFilterOperation returns [EObject current=null] : ( () otherlv_1= 'filter' ( (lv_var_2_0= RULE_ID ) )? otherlv_3= 'gray' ) ;
    public final EObject ruleFilterOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_var_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalExtendedIML.g:562:2: ( ( () otherlv_1= 'filter' ( (lv_var_2_0= RULE_ID ) )? otherlv_3= 'gray' ) )
            // InternalExtendedIML.g:563:2: ( () otherlv_1= 'filter' ( (lv_var_2_0= RULE_ID ) )? otherlv_3= 'gray' )
            {
            // InternalExtendedIML.g:563:2: ( () otherlv_1= 'filter' ( (lv_var_2_0= RULE_ID ) )? otherlv_3= 'gray' )
            // InternalExtendedIML.g:564:3: () otherlv_1= 'filter' ( (lv_var_2_0= RULE_ID ) )? otherlv_3= 'gray'
            {
            // InternalExtendedIML.g:564:3: ()
            // InternalExtendedIML.g:565:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFilterOperationAccess().getFilterOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getFilterOperationAccess().getFilterKeyword_1());
            		
            // InternalExtendedIML.g:575:3: ( (lv_var_2_0= RULE_ID ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalExtendedIML.g:576:4: (lv_var_2_0= RULE_ID )
                    {
                    // InternalExtendedIML.g:576:4: (lv_var_2_0= RULE_ID )
                    // InternalExtendedIML.g:577:5: lv_var_2_0= RULE_ID
                    {
                    lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    					newLeafNode(lv_var_2_0, grammarAccess.getFilterOperationAccess().getVarIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFilterOperationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"var",
                    						lv_var_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getFilterOperationAccess().getGrayKeyword_3());
            		

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
    // InternalExtendedIML.g:601:1: entryRuleBlurOperation returns [EObject current=null] : iv_ruleBlurOperation= ruleBlurOperation EOF ;
    public final EObject entryRuleBlurOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlurOperation = null;


        try {
            // InternalExtendedIML.g:601:54: (iv_ruleBlurOperation= ruleBlurOperation EOF )
            // InternalExtendedIML.g:602:2: iv_ruleBlurOperation= ruleBlurOperation EOF
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
    // InternalExtendedIML.g:608:1: ruleBlurOperation returns [EObject current=null] : (otherlv_0= 'blur' ( (lv_var_1_0= RULE_ID ) )? ( (lv_intensity_2_0= ruleValidBlur ) ) ) ;
    public final EObject ruleBlurOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_var_1_0=null;
        AntlrDatatypeRuleToken lv_intensity_2_0 = null;



        	enterRule();

        try {
            // InternalExtendedIML.g:614:2: ( (otherlv_0= 'blur' ( (lv_var_1_0= RULE_ID ) )? ( (lv_intensity_2_0= ruleValidBlur ) ) ) )
            // InternalExtendedIML.g:615:2: (otherlv_0= 'blur' ( (lv_var_1_0= RULE_ID ) )? ( (lv_intensity_2_0= ruleValidBlur ) ) )
            {
            // InternalExtendedIML.g:615:2: (otherlv_0= 'blur' ( (lv_var_1_0= RULE_ID ) )? ( (lv_intensity_2_0= ruleValidBlur ) ) )
            // InternalExtendedIML.g:616:3: otherlv_0= 'blur' ( (lv_var_1_0= RULE_ID ) )? ( (lv_intensity_2_0= ruleValidBlur ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getBlurOperationAccess().getBlurKeyword_0());
            		
            // InternalExtendedIML.g:620:3: ( (lv_var_1_0= RULE_ID ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalExtendedIML.g:621:4: (lv_var_1_0= RULE_ID )
                    {
                    // InternalExtendedIML.g:621:4: (lv_var_1_0= RULE_ID )
                    // InternalExtendedIML.g:622:5: lv_var_1_0= RULE_ID
                    {
                    lv_var_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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
                    break;

            }

            // InternalExtendedIML.g:638:3: ( (lv_intensity_2_0= ruleValidBlur ) )
            // InternalExtendedIML.g:639:4: (lv_intensity_2_0= ruleValidBlur )
            {
            // InternalExtendedIML.g:639:4: (lv_intensity_2_0= ruleValidBlur )
            // InternalExtendedIML.g:640:5: lv_intensity_2_0= ruleValidBlur
            {

            					newCompositeNode(grammarAccess.getBlurOperationAccess().getIntensityValidBlurParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_intensity_2_0=ruleValidBlur();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlurOperationRule());
            					}
            					set(
            						current,
            						"intensity",
            						lv_intensity_2_0,
            						"org.xtext.example.iml.ExtendedIML.ValidBlur");
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
    // $ANTLR end "ruleBlurOperation"


    // $ANTLR start "entryRuleValidBlur"
    // InternalExtendedIML.g:661:1: entryRuleValidBlur returns [String current=null] : iv_ruleValidBlur= ruleValidBlur EOF ;
    public final String entryRuleValidBlur() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidBlur = null;


        try {
            // InternalExtendedIML.g:661:49: (iv_ruleValidBlur= ruleValidBlur EOF )
            // InternalExtendedIML.g:662:2: iv_ruleValidBlur= ruleValidBlur EOF
            {
             newCompositeNode(grammarAccess.getValidBlurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidBlur=ruleValidBlur();

            state._fsp--;

             current =iv_ruleValidBlur.getText(); 
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
    // $ANTLR end "entryRuleValidBlur"


    // $ANTLR start "ruleValidBlur"
    // InternalExtendedIML.g:668:1: ruleValidBlur returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT1_0= RULE_INT1 | this_INT2_1= RULE_INT2 ) ;
    public final AntlrDatatypeRuleToken ruleValidBlur() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT1_0=null;
        Token this_INT2_1=null;


        	enterRule();

        try {
            // InternalExtendedIML.g:674:2: ( (this_INT1_0= RULE_INT1 | this_INT2_1= RULE_INT2 ) )
            // InternalExtendedIML.g:675:2: (this_INT1_0= RULE_INT1 | this_INT2_1= RULE_INT2 )
            {
            // InternalExtendedIML.g:675:2: (this_INT1_0= RULE_INT1 | this_INT2_1= RULE_INT2 )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT1) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_INT2) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalExtendedIML.g:676:3: this_INT1_0= RULE_INT1
                    {
                    this_INT1_0=(Token)match(input,RULE_INT1,FOLLOW_2); 

                    			current.merge(this_INT1_0);
                    		

                    			newLeafNode(this_INT1_0, grammarAccess.getValidBlurAccess().getINT1TerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalExtendedIML.g:684:3: this_INT2_1= RULE_INT2
                    {
                    this_INT2_1=(Token)match(input,RULE_INT2,FOLLOW_2); 

                    			current.merge(this_INT2_1);
                    		

                    			newLeafNode(this_INT2_1, grammarAccess.getValidBlurAccess().getINT2TerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleValidBlur"


    // $ANTLR start "entryRuleEqualizeOperation"
    // InternalExtendedIML.g:695:1: entryRuleEqualizeOperation returns [EObject current=null] : iv_ruleEqualizeOperation= ruleEqualizeOperation EOF ;
    public final EObject entryRuleEqualizeOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualizeOperation = null;


        try {
            // InternalExtendedIML.g:695:58: (iv_ruleEqualizeOperation= ruleEqualizeOperation EOF )
            // InternalExtendedIML.g:696:2: iv_ruleEqualizeOperation= ruleEqualizeOperation EOF
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
    // InternalExtendedIML.g:702:1: ruleEqualizeOperation returns [EObject current=null] : ( () otherlv_1= 'equalize' ( (lv_var_2_0= RULE_ID ) )? ) ;
    public final EObject ruleEqualizeOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_var_2_0=null;


        	enterRule();

        try {
            // InternalExtendedIML.g:708:2: ( ( () otherlv_1= 'equalize' ( (lv_var_2_0= RULE_ID ) )? ) )
            // InternalExtendedIML.g:709:2: ( () otherlv_1= 'equalize' ( (lv_var_2_0= RULE_ID ) )? )
            {
            // InternalExtendedIML.g:709:2: ( () otherlv_1= 'equalize' ( (lv_var_2_0= RULE_ID ) )? )
            // InternalExtendedIML.g:710:3: () otherlv_1= 'equalize' ( (lv_var_2_0= RULE_ID ) )?
            {
            // InternalExtendedIML.g:710:3: ()
            // InternalExtendedIML.g:711:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEqualizeOperationAccess().getEqualizeOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getEqualizeOperationAccess().getEqualizeKeyword_1());
            		
            // InternalExtendedIML.g:721:3: ( (lv_var_2_0= RULE_ID ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==EOF||LA15_1==RULE_ID||(LA15_1>=18 && LA15_1<=20)||(LA15_1>=22 && LA15_1<=26)) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalExtendedIML.g:722:4: (lv_var_2_0= RULE_ID )
                    {
                    // InternalExtendedIML.g:722:4: (lv_var_2_0= RULE_ID )
                    // InternalExtendedIML.g:723:5: lv_var_2_0= RULE_ID
                    {
                    lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_var_2_0, grammarAccess.getEqualizeOperationAccess().getVarIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEqualizeOperationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"var",
                    						lv_var_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


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
    // $ANTLR end "ruleEqualizeOperation"


    // $ANTLR start "entryRuleShowOperation"
    // InternalExtendedIML.g:743:1: entryRuleShowOperation returns [EObject current=null] : iv_ruleShowOperation= ruleShowOperation EOF ;
    public final EObject entryRuleShowOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShowOperation = null;


        try {
            // InternalExtendedIML.g:743:54: (iv_ruleShowOperation= ruleShowOperation EOF )
            // InternalExtendedIML.g:744:2: iv_ruleShowOperation= ruleShowOperation EOF
            {
             newCompositeNode(grammarAccess.getShowOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleShowOperation=ruleShowOperation();

            state._fsp--;

             current =iv_ruleShowOperation; 
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
    // $ANTLR end "entryRuleShowOperation"


    // $ANTLR start "ruleShowOperation"
    // InternalExtendedIML.g:750:1: ruleShowOperation returns [EObject current=null] : ( () otherlv_1= 'show' ( (lv_var_2_0= RULE_ID ) )? ) ;
    public final EObject ruleShowOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_var_2_0=null;


        	enterRule();

        try {
            // InternalExtendedIML.g:756:2: ( ( () otherlv_1= 'show' ( (lv_var_2_0= RULE_ID ) )? ) )
            // InternalExtendedIML.g:757:2: ( () otherlv_1= 'show' ( (lv_var_2_0= RULE_ID ) )? )
            {
            // InternalExtendedIML.g:757:2: ( () otherlv_1= 'show' ( (lv_var_2_0= RULE_ID ) )? )
            // InternalExtendedIML.g:758:3: () otherlv_1= 'show' ( (lv_var_2_0= RULE_ID ) )?
            {
            // InternalExtendedIML.g:758:3: ()
            // InternalExtendedIML.g:759:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getShowOperationAccess().getShowOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getShowOperationAccess().getShowKeyword_1());
            		
            // InternalExtendedIML.g:769:3: ( (lv_var_2_0= RULE_ID ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==EOF||LA16_1==RULE_ID||(LA16_1>=18 && LA16_1<=20)||(LA16_1>=22 && LA16_1<=26)) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // InternalExtendedIML.g:770:4: (lv_var_2_0= RULE_ID )
                    {
                    // InternalExtendedIML.g:770:4: (lv_var_2_0= RULE_ID )
                    // InternalExtendedIML.g:771:5: lv_var_2_0= RULE_ID
                    {
                    lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_var_2_0, grammarAccess.getShowOperationAccess().getVarIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getShowOperationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"var",
                    						lv_var_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


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
    // $ANTLR end "ruleShowOperation"


    // $ANTLR start "entryRuleSaveOperation"
    // InternalExtendedIML.g:791:1: entryRuleSaveOperation returns [EObject current=null] : iv_ruleSaveOperation= ruleSaveOperation EOF ;
    public final EObject entryRuleSaveOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSaveOperation = null;


        try {
            // InternalExtendedIML.g:791:54: (iv_ruleSaveOperation= ruleSaveOperation EOF )
            // InternalExtendedIML.g:792:2: iv_ruleSaveOperation= ruleSaveOperation EOF
            {
             newCompositeNode(grammarAccess.getSaveOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSaveOperation=ruleSaveOperation();

            state._fsp--;

             current =iv_ruleSaveOperation; 
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
    // $ANTLR end "entryRuleSaveOperation"


    // $ANTLR start "ruleSaveOperation"
    // InternalExtendedIML.g:798:1: ruleSaveOperation returns [EObject current=null] : ( () otherlv_1= 'save' ( (lv_var_2_0= RULE_ID ) )? ) ;
    public final EObject ruleSaveOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_var_2_0=null;


        	enterRule();

        try {
            // InternalExtendedIML.g:804:2: ( ( () otherlv_1= 'save' ( (lv_var_2_0= RULE_ID ) )? ) )
            // InternalExtendedIML.g:805:2: ( () otherlv_1= 'save' ( (lv_var_2_0= RULE_ID ) )? )
            {
            // InternalExtendedIML.g:805:2: ( () otherlv_1= 'save' ( (lv_var_2_0= RULE_ID ) )? )
            // InternalExtendedIML.g:806:3: () otherlv_1= 'save' ( (lv_var_2_0= RULE_ID ) )?
            {
            // InternalExtendedIML.g:806:3: ()
            // InternalExtendedIML.g:807:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSaveOperationAccess().getSaveOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getSaveOperationAccess().getSaveKeyword_1());
            		
            // InternalExtendedIML.g:817:3: ( (lv_var_2_0= RULE_ID ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==EOF||LA17_1==RULE_ID||(LA17_1>=18 && LA17_1<=20)||(LA17_1>=22 && LA17_1<=26)) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalExtendedIML.g:818:4: (lv_var_2_0= RULE_ID )
                    {
                    // InternalExtendedIML.g:818:4: (lv_var_2_0= RULE_ID )
                    // InternalExtendedIML.g:819:5: lv_var_2_0= RULE_ID
                    {
                    lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_var_2_0, grammarAccess.getSaveOperationAccess().getVarIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSaveOperationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"var",
                    						lv_var_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


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
    // $ANTLR end "ruleSaveOperation"


    // $ANTLR start "entryRuleFillOperation"
    // InternalExtendedIML.g:839:1: entryRuleFillOperation returns [EObject current=null] : iv_ruleFillOperation= ruleFillOperation EOF ;
    public final EObject entryRuleFillOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFillOperation = null;


        try {
            // InternalExtendedIML.g:839:54: (iv_ruleFillOperation= ruleFillOperation EOF )
            // InternalExtendedIML.g:840:2: iv_ruleFillOperation= ruleFillOperation EOF
            {
             newCompositeNode(grammarAccess.getFillOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFillOperation=ruleFillOperation();

            state._fsp--;

             current =iv_ruleFillOperation; 
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
    // $ANTLR end "entryRuleFillOperation"


    // $ANTLR start "ruleFillOperation"
    // InternalExtendedIML.g:846:1: ruleFillOperation returns [EObject current=null] : ( () otherlv_1= 'fill' ( (lv_var_2_0= RULE_ID ) )? ( (lv_size_3_0= ruleValidINT ) ) ) ;
    public final EObject ruleFillOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_var_2_0=null;
        AntlrDatatypeRuleToken lv_size_3_0 = null;



        	enterRule();

        try {
            // InternalExtendedIML.g:852:2: ( ( () otherlv_1= 'fill' ( (lv_var_2_0= RULE_ID ) )? ( (lv_size_3_0= ruleValidINT ) ) ) )
            // InternalExtendedIML.g:853:2: ( () otherlv_1= 'fill' ( (lv_var_2_0= RULE_ID ) )? ( (lv_size_3_0= ruleValidINT ) ) )
            {
            // InternalExtendedIML.g:853:2: ( () otherlv_1= 'fill' ( (lv_var_2_0= RULE_ID ) )? ( (lv_size_3_0= ruleValidINT ) ) )
            // InternalExtendedIML.g:854:3: () otherlv_1= 'fill' ( (lv_var_2_0= RULE_ID ) )? ( (lv_size_3_0= ruleValidINT ) )
            {
            // InternalExtendedIML.g:854:3: ()
            // InternalExtendedIML.g:855:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFillOperationAccess().getFillOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getFillOperationAccess().getFillKeyword_1());
            		
            // InternalExtendedIML.g:865:3: ( (lv_var_2_0= RULE_ID ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalExtendedIML.g:866:4: (lv_var_2_0= RULE_ID )
                    {
                    // InternalExtendedIML.g:866:4: (lv_var_2_0= RULE_ID )
                    // InternalExtendedIML.g:867:5: lv_var_2_0= RULE_ID
                    {
                    lv_var_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

                    					newLeafNode(lv_var_2_0, grammarAccess.getFillOperationAccess().getVarIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFillOperationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"var",
                    						lv_var_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalExtendedIML.g:883:3: ( (lv_size_3_0= ruleValidINT ) )
            // InternalExtendedIML.g:884:4: (lv_size_3_0= ruleValidINT )
            {
            // InternalExtendedIML.g:884:4: (lv_size_3_0= ruleValidINT )
            // InternalExtendedIML.g:885:5: lv_size_3_0= ruleValidINT
            {

            					newCompositeNode(grammarAccess.getFillOperationAccess().getSizeValidINTParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_size_3_0=ruleValidINT();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFillOperationRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_3_0,
            						"org.xtext.example.iml.ExtendedIML.ValidINT");
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
    // $ANTLR end "ruleFillOperation"


    // $ANTLR start "entryRuleValidINT"
    // InternalExtendedIML.g:906:1: entryRuleValidINT returns [String current=null] : iv_ruleValidINT= ruleValidINT EOF ;
    public final String entryRuleValidINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidINT = null;


        try {
            // InternalExtendedIML.g:906:48: (iv_ruleValidINT= ruleValidINT EOF )
            // InternalExtendedIML.g:907:2: iv_ruleValidINT= ruleValidINT EOF
            {
             newCompositeNode(grammarAccess.getValidINTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValidINT=ruleValidINT();

            state._fsp--;

             current =iv_ruleValidINT.getText(); 
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
    // $ANTLR end "entryRuleValidINT"


    // $ANTLR start "ruleValidINT"
    // InternalExtendedIML.g:913:1: ruleValidINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_INT2_1= RULE_INT2 | this_INT3_2= RULE_INT3 ) ;
    public final AntlrDatatypeRuleToken ruleValidINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_INT2_1=null;
        Token this_INT3_2=null;


        	enterRule();

        try {
            // InternalExtendedIML.g:919:2: ( (this_INT_0= RULE_INT | this_INT2_1= RULE_INT2 | this_INT3_2= RULE_INT3 ) )
            // InternalExtendedIML.g:920:2: (this_INT_0= RULE_INT | this_INT2_1= RULE_INT2 | this_INT3_2= RULE_INT3 )
            {
            // InternalExtendedIML.g:920:2: (this_INT_0= RULE_INT | this_INT2_1= RULE_INT2 | this_INT3_2= RULE_INT3 )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt19=1;
                }
                break;
            case RULE_INT2:
                {
                alt19=2;
                }
                break;
            case RULE_INT3:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalExtendedIML.g:921:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getValidINTAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalExtendedIML.g:929:3: this_INT2_1= RULE_INT2
                    {
                    this_INT2_1=(Token)match(input,RULE_INT2,FOLLOW_2); 

                    			current.merge(this_INT2_1);
                    		

                    			newLeafNode(this_INT2_1, grammarAccess.getValidINTAccess().getINT2TerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalExtendedIML.g:937:3: this_INT3_2= RULE_INT3
                    {
                    this_INT3_2=(Token)match(input,RULE_INT3,FOLLOW_2); 

                    			current.merge(this_INT3_2);
                    		

                    			newLeafNode(this_INT3_2, grammarAccess.getValidINTAccess().getINT3TerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleValidINT"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000007DC0012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000001D0L});

}