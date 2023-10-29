package geodes.sms.relis.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import geodes.sms.relis.services.RelisTextualGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRelisTextualParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RelisClassificationStatistic'", "'{'", "'}'", "'Variable'", "';'", "'Descriptive'", "':'", "','", "'Comparative'", "'Evolution'", "'Continuous'", "'Nominal'", "'Frequency_tables'", "'Bar_plots'", "'Statistics'", "'Box_plots'", "'Violin_plots'", "'Stacked_bar_plots'", "'Grouped_bar_plots'", "'Bubble_charts'", "'Fisher_exact_test'", "'Shapiro_Wilk_correlation_test'", "'Pearson_correlation_test'", "'Spearman_correlation_test'", "'Evolution_plots'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRelisTextualParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRelisTextualParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRelisTextualParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRelisTextual.g"; }



     	private RelisTextualGrammarAccess grammarAccess;

        public InternalRelisTextualParser(TokenStream input, RelisTextualGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RelisRoot";
       	}

       	@Override
       	protected RelisTextualGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRelisRoot"
    // InternalRelisTextual.g:65:1: entryRuleRelisRoot returns [EObject current=null] : iv_ruleRelisRoot= ruleRelisRoot EOF ;
    public final EObject entryRuleRelisRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelisRoot = null;


        try {
            // InternalRelisTextual.g:65:50: (iv_ruleRelisRoot= ruleRelisRoot EOF )
            // InternalRelisTextual.g:66:2: iv_ruleRelisRoot= ruleRelisRoot EOF
            {
             newCompositeNode(grammarAccess.getRelisRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelisRoot=ruleRelisRoot();

            state._fsp--;

             current =iv_ruleRelisRoot; 
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
    // $ANTLR end "entryRuleRelisRoot"


    // $ANTLR start "ruleRelisRoot"
    // InternalRelisTextual.g:72:1: ruleRelisRoot returns [EObject current=null] : ( () otherlv_1= 'RelisClassificationStatistic' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_variable_4_0= ruleVariable ) ) ( (lv_variable_5_0= ruleVariable ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleRelisRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_variable_4_0 = null;

        EObject lv_variable_5_0 = null;



        	enterRule();

        try {
            // InternalRelisTextual.g:78:2: ( ( () otherlv_1= 'RelisClassificationStatistic' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_variable_4_0= ruleVariable ) ) ( (lv_variable_5_0= ruleVariable ) )* )? otherlv_6= '}' ) )
            // InternalRelisTextual.g:79:2: ( () otherlv_1= 'RelisClassificationStatistic' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_variable_4_0= ruleVariable ) ) ( (lv_variable_5_0= ruleVariable ) )* )? otherlv_6= '}' )
            {
            // InternalRelisTextual.g:79:2: ( () otherlv_1= 'RelisClassificationStatistic' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_variable_4_0= ruleVariable ) ) ( (lv_variable_5_0= ruleVariable ) )* )? otherlv_6= '}' )
            // InternalRelisTextual.g:80:3: () otherlv_1= 'RelisClassificationStatistic' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_variable_4_0= ruleVariable ) ) ( (lv_variable_5_0= ruleVariable ) )* )? otherlv_6= '}'
            {
            // InternalRelisTextual.g:80:3: ()
            // InternalRelisTextual.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelisRootAccess().getRelisRootAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRelisRootAccess().getRelisClassificationStatisticKeyword_1());
            		
            // InternalRelisTextual.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRelisTextual.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalRelisTextual.g:92:4: (lv_name_2_0= ruleEString )
            // InternalRelisTextual.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRelisRootAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelisRootRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"geodes.sms.relis.RelisTextual.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRelisRootAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRelisTextual.g:114:3: ( ( (lv_variable_4_0= ruleVariable ) ) ( (lv_variable_5_0= ruleVariable ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRelisTextual.g:115:4: ( (lv_variable_4_0= ruleVariable ) ) ( (lv_variable_5_0= ruleVariable ) )*
                    {
                    // InternalRelisTextual.g:115:4: ( (lv_variable_4_0= ruleVariable ) )
                    // InternalRelisTextual.g:116:5: (lv_variable_4_0= ruleVariable )
                    {
                    // InternalRelisTextual.g:116:5: (lv_variable_4_0= ruleVariable )
                    // InternalRelisTextual.g:117:6: lv_variable_4_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getRelisRootAccess().getVariableVariableParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_variable_4_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelisRootRule());
                    						}
                    						add(
                    							current,
                    							"variable",
                    							lv_variable_4_0,
                    							"geodes.sms.relis.RelisTextual.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRelisTextual.g:134:4: ( (lv_variable_5_0= ruleVariable ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRelisTextual.g:135:5: (lv_variable_5_0= ruleVariable )
                    	    {
                    	    // InternalRelisTextual.g:135:5: (lv_variable_5_0= ruleVariable )
                    	    // InternalRelisTextual.g:136:6: lv_variable_5_0= ruleVariable
                    	    {

                    	    						newCompositeNode(grammarAccess.getRelisRootAccess().getVariableVariableParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_variable_5_0=ruleVariable();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRelisRootRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"variable",
                    	    							lv_variable_5_0,
                    	    							"geodes.sms.relis.RelisTextual.Variable");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRelisRootAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRelisRoot"


    // $ANTLR start "entryRuleStatistic"
    // InternalRelisTextual.g:162:1: entryRuleStatistic returns [EObject current=null] : iv_ruleStatistic= ruleStatistic EOF ;
    public final EObject entryRuleStatistic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatistic = null;


        try {
            // InternalRelisTextual.g:162:50: (iv_ruleStatistic= ruleStatistic EOF )
            // InternalRelisTextual.g:163:2: iv_ruleStatistic= ruleStatistic EOF
            {
             newCompositeNode(grammarAccess.getStatisticRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatistic=ruleStatistic();

            state._fsp--;

             current =iv_ruleStatistic; 
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
    // $ANTLR end "entryRuleStatistic"


    // $ANTLR start "ruleStatistic"
    // InternalRelisTextual.g:169:1: ruleStatistic returns [EObject current=null] : (this_Descriptive_0= ruleDescriptive | this_Comparative_1= ruleComparative | this_Evolution_2= ruleEvolution ) ;
    public final EObject ruleStatistic() throws RecognitionException {
        EObject current = null;

        EObject this_Descriptive_0 = null;

        EObject this_Comparative_1 = null;

        EObject this_Evolution_2 = null;



        	enterRule();

        try {
            // InternalRelisTextual.g:175:2: ( (this_Descriptive_0= ruleDescriptive | this_Comparative_1= ruleComparative | this_Evolution_2= ruleEvolution ) )
            // InternalRelisTextual.g:176:2: (this_Descriptive_0= ruleDescriptive | this_Comparative_1= ruleComparative | this_Evolution_2= ruleEvolution )
            {
            // InternalRelisTextual.g:176:2: (this_Descriptive_0= ruleDescriptive | this_Comparative_1= ruleComparative | this_Evolution_2= ruleEvolution )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRelisTextual.g:177:3: this_Descriptive_0= ruleDescriptive
                    {

                    			newCompositeNode(grammarAccess.getStatisticAccess().getDescriptiveParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Descriptive_0=ruleDescriptive();

                    state._fsp--;


                    			current = this_Descriptive_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRelisTextual.g:186:3: this_Comparative_1= ruleComparative
                    {

                    			newCompositeNode(grammarAccess.getStatisticAccess().getComparativeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Comparative_1=ruleComparative();

                    state._fsp--;


                    			current = this_Comparative_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRelisTextual.g:195:3: this_Evolution_2= ruleEvolution
                    {

                    			newCompositeNode(grammarAccess.getStatisticAccess().getEvolutionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Evolution_2=ruleEvolution();

                    state._fsp--;


                    			current = this_Evolution_2;
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
    // $ANTLR end "ruleStatistic"


    // $ANTLR start "entryRuleVariable"
    // InternalRelisTextual.g:207:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalRelisTextual.g:207:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalRelisTextual.g:208:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalRelisTextual.g:214:1: ruleVariable returns [EObject current=null] : ( () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) ( (lv_type_3_0= ruleType ) ) otherlv_4= '{' ( ( (lv_statistic_5_0= ruleStatistic ) ) (otherlv_6= ';' ( (lv_statistic_7_0= ruleStatistic ) ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_3_0 = null;

        EObject lv_statistic_5_0 = null;

        EObject lv_statistic_7_0 = null;



        	enterRule();

        try {
            // InternalRelisTextual.g:220:2: ( ( () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) ( (lv_type_3_0= ruleType ) ) otherlv_4= '{' ( ( (lv_statistic_5_0= ruleStatistic ) ) (otherlv_6= ';' ( (lv_statistic_7_0= ruleStatistic ) ) )* )? otherlv_8= '}' ) )
            // InternalRelisTextual.g:221:2: ( () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) ( (lv_type_3_0= ruleType ) ) otherlv_4= '{' ( ( (lv_statistic_5_0= ruleStatistic ) ) (otherlv_6= ';' ( (lv_statistic_7_0= ruleStatistic ) ) )* )? otherlv_8= '}' )
            {
            // InternalRelisTextual.g:221:2: ( () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) ( (lv_type_3_0= ruleType ) ) otherlv_4= '{' ( ( (lv_statistic_5_0= ruleStatistic ) ) (otherlv_6= ';' ( (lv_statistic_7_0= ruleStatistic ) ) )* )? otherlv_8= '}' )
            // InternalRelisTextual.g:222:3: () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) ( (lv_type_3_0= ruleType ) ) otherlv_4= '{' ( ( (lv_statistic_5_0= ruleStatistic ) ) (otherlv_6= ';' ( (lv_statistic_7_0= ruleStatistic ) ) )* )? otherlv_8= '}'
            {
            // InternalRelisTextual.g:222:3: ()
            // InternalRelisTextual.g:223:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getVariableKeyword_1());
            		
            // InternalRelisTextual.g:233:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRelisTextual.g:234:4: (lv_name_2_0= ruleEString )
            {
            // InternalRelisTextual.g:234:4: (lv_name_2_0= ruleEString )
            // InternalRelisTextual.g:235:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"geodes.sms.relis.RelisTextual.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRelisTextual.g:252:3: ( (lv_type_3_0= ruleType ) )
            // InternalRelisTextual.g:253:4: (lv_type_3_0= ruleType )
            {
            // InternalRelisTextual.g:253:4: (lv_type_3_0= ruleType )
            // InternalRelisTextual.g:254:5: lv_type_3_0= ruleType
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_3_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"geodes.sms.relis.RelisTextual.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalRelisTextual.g:275:3: ( ( (lv_statistic_5_0= ruleStatistic ) ) (otherlv_6= ';' ( (lv_statistic_7_0= ruleStatistic ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16||(LA5_0>=19 && LA5_0<=20)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRelisTextual.g:276:4: ( (lv_statistic_5_0= ruleStatistic ) ) (otherlv_6= ';' ( (lv_statistic_7_0= ruleStatistic ) ) )*
                    {
                    // InternalRelisTextual.g:276:4: ( (lv_statistic_5_0= ruleStatistic ) )
                    // InternalRelisTextual.g:277:5: (lv_statistic_5_0= ruleStatistic )
                    {
                    // InternalRelisTextual.g:277:5: (lv_statistic_5_0= ruleStatistic )
                    // InternalRelisTextual.g:278:6: lv_statistic_5_0= ruleStatistic
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getStatisticStatisticParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_statistic_5_0=ruleStatistic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						add(
                    							current,
                    							"statistic",
                    							lv_statistic_5_0,
                    							"geodes.sms.relis.RelisTextual.Statistic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRelisTextual.g:295:4: (otherlv_6= ';' ( (lv_statistic_7_0= ruleStatistic ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==15) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRelisTextual.g:296:5: otherlv_6= ';' ( (lv_statistic_7_0= ruleStatistic ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getSemicolonKeyword_5_1_0());
                    	    				
                    	    // InternalRelisTextual.g:300:5: ( (lv_statistic_7_0= ruleStatistic ) )
                    	    // InternalRelisTextual.g:301:6: (lv_statistic_7_0= ruleStatistic )
                    	    {
                    	    // InternalRelisTextual.g:301:6: (lv_statistic_7_0= ruleStatistic )
                    	    // InternalRelisTextual.g:302:7: lv_statistic_7_0= ruleStatistic
                    	    {

                    	    							newCompositeNode(grammarAccess.getVariableAccess().getStatisticStatisticParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_statistic_7_0=ruleStatistic();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVariableRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statistic",
                    	    								lv_statistic_7_0,
                    	    								"geodes.sms.relis.RelisTextual.Statistic");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleEString"
    // InternalRelisTextual.g:329:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRelisTextual.g:329:47: (iv_ruleEString= ruleEString EOF )
            // InternalRelisTextual.g:330:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRelisTextual.g:336:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRelisTextual.g:342:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRelisTextual.g:343:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRelisTextual.g:343:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRelisTextual.g:344:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRelisTextual.g:352:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleDescriptive"
    // InternalRelisTextual.g:363:1: entryRuleDescriptive returns [EObject current=null] : iv_ruleDescriptive= ruleDescriptive EOF ;
    public final EObject entryRuleDescriptive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptive = null;


        try {
            // InternalRelisTextual.g:363:52: (iv_ruleDescriptive= ruleDescriptive EOF )
            // InternalRelisTextual.g:364:2: iv_ruleDescriptive= ruleDescriptive EOF
            {
             newCompositeNode(grammarAccess.getDescriptiveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescriptive=ruleDescriptive();

            state._fsp--;

             current =iv_ruleDescriptive; 
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
    // $ANTLR end "entryRuleDescriptive"


    // $ANTLR start "ruleDescriptive"
    // InternalRelisTextual.g:370:1: ruleDescriptive returns [EObject current=null] : ( () otherlv_1= 'Descriptive' otherlv_2= ':' ( ( (lv_stats_3_0= ruleDescStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleDescStats ) ) )* )? ) ;
    public final EObject ruleDescriptive() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_stats_3_0 = null;

        Enumerator lv_stats_5_0 = null;



        	enterRule();

        try {
            // InternalRelisTextual.g:376:2: ( ( () otherlv_1= 'Descriptive' otherlv_2= ':' ( ( (lv_stats_3_0= ruleDescStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleDescStats ) ) )* )? ) )
            // InternalRelisTextual.g:377:2: ( () otherlv_1= 'Descriptive' otherlv_2= ':' ( ( (lv_stats_3_0= ruleDescStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleDescStats ) ) )* )? )
            {
            // InternalRelisTextual.g:377:2: ( () otherlv_1= 'Descriptive' otherlv_2= ':' ( ( (lv_stats_3_0= ruleDescStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleDescStats ) ) )* )? )
            // InternalRelisTextual.g:378:3: () otherlv_1= 'Descriptive' otherlv_2= ':' ( ( (lv_stats_3_0= ruleDescStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleDescStats ) ) )* )?
            {
            // InternalRelisTextual.g:378:3: ()
            // InternalRelisTextual.g:379:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDescriptiveAccess().getDescriptiveAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDescriptiveAccess().getDescriptiveKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getDescriptiveAccess().getColonKeyword_2());
            		
            // InternalRelisTextual.g:393:3: ( ( (lv_stats_3_0= ruleDescStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleDescStats ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=23 && LA8_0<=27)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRelisTextual.g:394:4: ( (lv_stats_3_0= ruleDescStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleDescStats ) ) )*
                    {
                    // InternalRelisTextual.g:394:4: ( (lv_stats_3_0= ruleDescStats ) )
                    // InternalRelisTextual.g:395:5: (lv_stats_3_0= ruleDescStats )
                    {
                    // InternalRelisTextual.g:395:5: (lv_stats_3_0= ruleDescStats )
                    // InternalRelisTextual.g:396:6: lv_stats_3_0= ruleDescStats
                    {

                    						newCompositeNode(grammarAccess.getDescriptiveAccess().getStatsDescStatsEnumRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_stats_3_0=ruleDescStats();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDescriptiveRule());
                    						}
                    						add(
                    							current,
                    							"stats",
                    							lv_stats_3_0,
                    							"geodes.sms.relis.RelisTextual.DescStats");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRelisTextual.g:413:4: (otherlv_4= ',' ( (lv_stats_5_0= ruleDescStats ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==18) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRelisTextual.g:414:5: otherlv_4= ',' ( (lv_stats_5_0= ruleDescStats ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_13); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDescriptiveAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalRelisTextual.g:418:5: ( (lv_stats_5_0= ruleDescStats ) )
                    	    // InternalRelisTextual.g:419:6: (lv_stats_5_0= ruleDescStats )
                    	    {
                    	    // InternalRelisTextual.g:419:6: (lv_stats_5_0= ruleDescStats )
                    	    // InternalRelisTextual.g:420:7: lv_stats_5_0= ruleDescStats
                    	    {

                    	    							newCompositeNode(grammarAccess.getDescriptiveAccess().getStatsDescStatsEnumRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_stats_5_0=ruleDescStats();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDescriptiveRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"stats",
                    	    								lv_stats_5_0,
                    	    								"geodes.sms.relis.RelisTextual.DescStats");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


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
    // $ANTLR end "ruleDescriptive"


    // $ANTLR start "entryRuleComparative"
    // InternalRelisTextual.g:443:1: entryRuleComparative returns [EObject current=null] : iv_ruleComparative= ruleComparative EOF ;
    public final EObject entryRuleComparative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparative = null;


        try {
            // InternalRelisTextual.g:443:52: (iv_ruleComparative= ruleComparative EOF )
            // InternalRelisTextual.g:444:2: iv_ruleComparative= ruleComparative EOF
            {
             newCompositeNode(grammarAccess.getComparativeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparative=ruleComparative();

            state._fsp--;

             current =iv_ruleComparative; 
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
    // $ANTLR end "entryRuleComparative"


    // $ANTLR start "ruleComparative"
    // InternalRelisTextual.g:450:1: ruleComparative returns [EObject current=null] : ( () otherlv_1= 'Comparative' otherlv_2= ':' ( ( (lv_stats_3_0= ruleCompStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleCompStats ) ) )* )? ) ;
    public final EObject ruleComparative() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_stats_3_0 = null;

        Enumerator lv_stats_5_0 = null;



        	enterRule();

        try {
            // InternalRelisTextual.g:456:2: ( ( () otherlv_1= 'Comparative' otherlv_2= ':' ( ( (lv_stats_3_0= ruleCompStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleCompStats ) ) )* )? ) )
            // InternalRelisTextual.g:457:2: ( () otherlv_1= 'Comparative' otherlv_2= ':' ( ( (lv_stats_3_0= ruleCompStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleCompStats ) ) )* )? )
            {
            // InternalRelisTextual.g:457:2: ( () otherlv_1= 'Comparative' otherlv_2= ':' ( ( (lv_stats_3_0= ruleCompStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleCompStats ) ) )* )? )
            // InternalRelisTextual.g:458:3: () otherlv_1= 'Comparative' otherlv_2= ':' ( ( (lv_stats_3_0= ruleCompStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleCompStats ) ) )* )?
            {
            // InternalRelisTextual.g:458:3: ()
            // InternalRelisTextual.g:459:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComparativeAccess().getComparativeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getComparativeAccess().getComparativeKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getComparativeAccess().getColonKeyword_2());
            		
            // InternalRelisTextual.g:473:3: ( ( (lv_stats_3_0= ruleCompStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleCompStats ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23||(LA10_0>=28 && LA10_0<=34)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRelisTextual.g:474:4: ( (lv_stats_3_0= ruleCompStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleCompStats ) ) )*
                    {
                    // InternalRelisTextual.g:474:4: ( (lv_stats_3_0= ruleCompStats ) )
                    // InternalRelisTextual.g:475:5: (lv_stats_3_0= ruleCompStats )
                    {
                    // InternalRelisTextual.g:475:5: (lv_stats_3_0= ruleCompStats )
                    // InternalRelisTextual.g:476:6: lv_stats_3_0= ruleCompStats
                    {

                    						newCompositeNode(grammarAccess.getComparativeAccess().getStatsCompStatsEnumRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_stats_3_0=ruleCompStats();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComparativeRule());
                    						}
                    						add(
                    							current,
                    							"stats",
                    							lv_stats_3_0,
                    							"geodes.sms.relis.RelisTextual.CompStats");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRelisTextual.g:493:4: (otherlv_4= ',' ( (lv_stats_5_0= ruleCompStats ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==18) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRelisTextual.g:494:5: otherlv_4= ',' ( (lv_stats_5_0= ruleCompStats ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getComparativeAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalRelisTextual.g:498:5: ( (lv_stats_5_0= ruleCompStats ) )
                    	    // InternalRelisTextual.g:499:6: (lv_stats_5_0= ruleCompStats )
                    	    {
                    	    // InternalRelisTextual.g:499:6: (lv_stats_5_0= ruleCompStats )
                    	    // InternalRelisTextual.g:500:7: lv_stats_5_0= ruleCompStats
                    	    {

                    	    							newCompositeNode(grammarAccess.getComparativeAccess().getStatsCompStatsEnumRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_stats_5_0=ruleCompStats();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getComparativeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"stats",
                    	    								lv_stats_5_0,
                    	    								"geodes.sms.relis.RelisTextual.CompStats");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


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
    // $ANTLR end "ruleComparative"


    // $ANTLR start "entryRuleEvolution"
    // InternalRelisTextual.g:523:1: entryRuleEvolution returns [EObject current=null] : iv_ruleEvolution= ruleEvolution EOF ;
    public final EObject entryRuleEvolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvolution = null;


        try {
            // InternalRelisTextual.g:523:50: (iv_ruleEvolution= ruleEvolution EOF )
            // InternalRelisTextual.g:524:2: iv_ruleEvolution= ruleEvolution EOF
            {
             newCompositeNode(grammarAccess.getEvolutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvolution=ruleEvolution();

            state._fsp--;

             current =iv_ruleEvolution; 
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
    // $ANTLR end "entryRuleEvolution"


    // $ANTLR start "ruleEvolution"
    // InternalRelisTextual.g:530:1: ruleEvolution returns [EObject current=null] : ( () otherlv_1= 'Evolution' otherlv_2= ':' ( ( (lv_stats_3_0= ruleEvoStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleEvoStats ) ) )* )? ) ;
    public final EObject ruleEvolution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_stats_3_0 = null;

        Enumerator lv_stats_5_0 = null;



        	enterRule();

        try {
            // InternalRelisTextual.g:536:2: ( ( () otherlv_1= 'Evolution' otherlv_2= ':' ( ( (lv_stats_3_0= ruleEvoStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleEvoStats ) ) )* )? ) )
            // InternalRelisTextual.g:537:2: ( () otherlv_1= 'Evolution' otherlv_2= ':' ( ( (lv_stats_3_0= ruleEvoStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleEvoStats ) ) )* )? )
            {
            // InternalRelisTextual.g:537:2: ( () otherlv_1= 'Evolution' otherlv_2= ':' ( ( (lv_stats_3_0= ruleEvoStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleEvoStats ) ) )* )? )
            // InternalRelisTextual.g:538:3: () otherlv_1= 'Evolution' otherlv_2= ':' ( ( (lv_stats_3_0= ruleEvoStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleEvoStats ) ) )* )?
            {
            // InternalRelisTextual.g:538:3: ()
            // InternalRelisTextual.g:539:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvolutionAccess().getEvolutionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getEvolutionAccess().getEvolutionKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getEvolutionAccess().getColonKeyword_2());
            		
            // InternalRelisTextual.g:553:3: ( ( (lv_stats_3_0= ruleEvoStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleEvoStats ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23||LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRelisTextual.g:554:4: ( (lv_stats_3_0= ruleEvoStats ) ) (otherlv_4= ',' ( (lv_stats_5_0= ruleEvoStats ) ) )*
                    {
                    // InternalRelisTextual.g:554:4: ( (lv_stats_3_0= ruleEvoStats ) )
                    // InternalRelisTextual.g:555:5: (lv_stats_3_0= ruleEvoStats )
                    {
                    // InternalRelisTextual.g:555:5: (lv_stats_3_0= ruleEvoStats )
                    // InternalRelisTextual.g:556:6: lv_stats_3_0= ruleEvoStats
                    {

                    						newCompositeNode(grammarAccess.getEvolutionAccess().getStatsEvoStatsEnumRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_stats_3_0=ruleEvoStats();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvolutionRule());
                    						}
                    						add(
                    							current,
                    							"stats",
                    							lv_stats_3_0,
                    							"geodes.sms.relis.RelisTextual.EvoStats");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRelisTextual.g:573:4: (otherlv_4= ',' ( (lv_stats_5_0= ruleEvoStats ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==18) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRelisTextual.g:574:5: otherlv_4= ',' ( (lv_stats_5_0= ruleEvoStats ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_17); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getEvolutionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalRelisTextual.g:578:5: ( (lv_stats_5_0= ruleEvoStats ) )
                    	    // InternalRelisTextual.g:579:6: (lv_stats_5_0= ruleEvoStats )
                    	    {
                    	    // InternalRelisTextual.g:579:6: (lv_stats_5_0= ruleEvoStats )
                    	    // InternalRelisTextual.g:580:7: lv_stats_5_0= ruleEvoStats
                    	    {

                    	    							newCompositeNode(grammarAccess.getEvolutionAccess().getStatsEvoStatsEnumRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_stats_5_0=ruleEvoStats();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEvolutionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"stats",
                    	    								lv_stats_5_0,
                    	    								"geodes.sms.relis.RelisTextual.EvoStats");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


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
    // $ANTLR end "ruleEvolution"


    // $ANTLR start "ruleType"
    // InternalRelisTextual.g:603:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'Continuous' ) | (enumLiteral_1= 'Nominal' ) | (enumLiteral_2= 'Comparative' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRelisTextual.g:609:2: ( ( (enumLiteral_0= 'Continuous' ) | (enumLiteral_1= 'Nominal' ) | (enumLiteral_2= 'Comparative' ) ) )
            // InternalRelisTextual.g:610:2: ( (enumLiteral_0= 'Continuous' ) | (enumLiteral_1= 'Nominal' ) | (enumLiteral_2= 'Comparative' ) )
            {
            // InternalRelisTextual.g:610:2: ( (enumLiteral_0= 'Continuous' ) | (enumLiteral_1= 'Nominal' ) | (enumLiteral_2= 'Comparative' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt13=1;
                }
                break;
            case 22:
                {
                alt13=2;
                }
                break;
            case 19:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalRelisTextual.g:611:3: (enumLiteral_0= 'Continuous' )
                    {
                    // InternalRelisTextual.g:611:3: (enumLiteral_0= 'Continuous' )
                    // InternalRelisTextual.g:612:4: enumLiteral_0= 'Continuous'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getContinuousEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getContinuousEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRelisTextual.g:619:3: (enumLiteral_1= 'Nominal' )
                    {
                    // InternalRelisTextual.g:619:3: (enumLiteral_1= 'Nominal' )
                    // InternalRelisTextual.g:620:4: enumLiteral_1= 'Nominal'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getNominalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getNominalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRelisTextual.g:627:3: (enumLiteral_2= 'Comparative' )
                    {
                    // InternalRelisTextual.g:627:3: (enumLiteral_2= 'Comparative' )
                    // InternalRelisTextual.g:628:4: enumLiteral_2= 'Comparative'
                    {
                    enumLiteral_2=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getComparativeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getComparativeEnumLiteralDeclaration_2());
                    			

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


    // $ANTLR start "ruleDescStats"
    // InternalRelisTextual.g:638:1: ruleDescStats returns [Enumerator current=null] : ( (enumLiteral_0= 'Frequency_tables' ) | (enumLiteral_1= 'Bar_plots' ) | (enumLiteral_2= 'Statistics' ) | (enumLiteral_3= 'Box_plots' ) | (enumLiteral_4= 'Violin_plots' ) ) ;
    public final Enumerator ruleDescStats() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRelisTextual.g:644:2: ( ( (enumLiteral_0= 'Frequency_tables' ) | (enumLiteral_1= 'Bar_plots' ) | (enumLiteral_2= 'Statistics' ) | (enumLiteral_3= 'Box_plots' ) | (enumLiteral_4= 'Violin_plots' ) ) )
            // InternalRelisTextual.g:645:2: ( (enumLiteral_0= 'Frequency_tables' ) | (enumLiteral_1= 'Bar_plots' ) | (enumLiteral_2= 'Statistics' ) | (enumLiteral_3= 'Box_plots' ) | (enumLiteral_4= 'Violin_plots' ) )
            {
            // InternalRelisTextual.g:645:2: ( (enumLiteral_0= 'Frequency_tables' ) | (enumLiteral_1= 'Bar_plots' ) | (enumLiteral_2= 'Statistics' ) | (enumLiteral_3= 'Box_plots' ) | (enumLiteral_4= 'Violin_plots' ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt14=1;
                }
                break;
            case 24:
                {
                alt14=2;
                }
                break;
            case 25:
                {
                alt14=3;
                }
                break;
            case 26:
                {
                alt14=4;
                }
                break;
            case 27:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalRelisTextual.g:646:3: (enumLiteral_0= 'Frequency_tables' )
                    {
                    // InternalRelisTextual.g:646:3: (enumLiteral_0= 'Frequency_tables' )
                    // InternalRelisTextual.g:647:4: enumLiteral_0= 'Frequency_tables'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getDescStatsAccess().getFrequency_tablesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDescStatsAccess().getFrequency_tablesEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRelisTextual.g:654:3: (enumLiteral_1= 'Bar_plots' )
                    {
                    // InternalRelisTextual.g:654:3: (enumLiteral_1= 'Bar_plots' )
                    // InternalRelisTextual.g:655:4: enumLiteral_1= 'Bar_plots'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getDescStatsAccess().getBar_plotsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDescStatsAccess().getBar_plotsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRelisTextual.g:662:3: (enumLiteral_2= 'Statistics' )
                    {
                    // InternalRelisTextual.g:662:3: (enumLiteral_2= 'Statistics' )
                    // InternalRelisTextual.g:663:4: enumLiteral_2= 'Statistics'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getDescStatsAccess().getStatisticsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDescStatsAccess().getStatisticsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRelisTextual.g:670:3: (enumLiteral_3= 'Box_plots' )
                    {
                    // InternalRelisTextual.g:670:3: (enumLiteral_3= 'Box_plots' )
                    // InternalRelisTextual.g:671:4: enumLiteral_3= 'Box_plots'
                    {
                    enumLiteral_3=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getDescStatsAccess().getBox_plotsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDescStatsAccess().getBox_plotsEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRelisTextual.g:678:3: (enumLiteral_4= 'Violin_plots' )
                    {
                    // InternalRelisTextual.g:678:3: (enumLiteral_4= 'Violin_plots' )
                    // InternalRelisTextual.g:679:4: enumLiteral_4= 'Violin_plots'
                    {
                    enumLiteral_4=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getDescStatsAccess().getViolin_plotsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDescStatsAccess().getViolin_plotsEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleDescStats"


    // $ANTLR start "ruleCompStats"
    // InternalRelisTextual.g:689:1: ruleCompStats returns [Enumerator current=null] : ( (enumLiteral_0= 'Frequency_tables' ) | (enumLiteral_1= 'Stacked_bar_plots' ) | (enumLiteral_2= 'Grouped_bar_plots' ) | (enumLiteral_3= 'Bubble_charts' ) | (enumLiteral_4= 'Fisher_exact_test' ) | (enumLiteral_5= 'Shapiro_Wilk_correlation_test' ) | (enumLiteral_6= 'Pearson_correlation_test' ) | (enumLiteral_7= 'Spearman_correlation_test' ) ) ;
    public final Enumerator ruleCompStats() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalRelisTextual.g:695:2: ( ( (enumLiteral_0= 'Frequency_tables' ) | (enumLiteral_1= 'Stacked_bar_plots' ) | (enumLiteral_2= 'Grouped_bar_plots' ) | (enumLiteral_3= 'Bubble_charts' ) | (enumLiteral_4= 'Fisher_exact_test' ) | (enumLiteral_5= 'Shapiro_Wilk_correlation_test' ) | (enumLiteral_6= 'Pearson_correlation_test' ) | (enumLiteral_7= 'Spearman_correlation_test' ) ) )
            // InternalRelisTextual.g:696:2: ( (enumLiteral_0= 'Frequency_tables' ) | (enumLiteral_1= 'Stacked_bar_plots' ) | (enumLiteral_2= 'Grouped_bar_plots' ) | (enumLiteral_3= 'Bubble_charts' ) | (enumLiteral_4= 'Fisher_exact_test' ) | (enumLiteral_5= 'Shapiro_Wilk_correlation_test' ) | (enumLiteral_6= 'Pearson_correlation_test' ) | (enumLiteral_7= 'Spearman_correlation_test' ) )
            {
            // InternalRelisTextual.g:696:2: ( (enumLiteral_0= 'Frequency_tables' ) | (enumLiteral_1= 'Stacked_bar_plots' ) | (enumLiteral_2= 'Grouped_bar_plots' ) | (enumLiteral_3= 'Bubble_charts' ) | (enumLiteral_4= 'Fisher_exact_test' ) | (enumLiteral_5= 'Shapiro_Wilk_correlation_test' ) | (enumLiteral_6= 'Pearson_correlation_test' ) | (enumLiteral_7= 'Spearman_correlation_test' ) )
            int alt15=8;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt15=1;
                }
                break;
            case 28:
                {
                alt15=2;
                }
                break;
            case 29:
                {
                alt15=3;
                }
                break;
            case 30:
                {
                alt15=4;
                }
                break;
            case 31:
                {
                alt15=5;
                }
                break;
            case 32:
                {
                alt15=6;
                }
                break;
            case 33:
                {
                alt15=7;
                }
                break;
            case 34:
                {
                alt15=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalRelisTextual.g:697:3: (enumLiteral_0= 'Frequency_tables' )
                    {
                    // InternalRelisTextual.g:697:3: (enumLiteral_0= 'Frequency_tables' )
                    // InternalRelisTextual.g:698:4: enumLiteral_0= 'Frequency_tables'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getCompStatsAccess().getFrequency_tablesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompStatsAccess().getFrequency_tablesEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRelisTextual.g:705:3: (enumLiteral_1= 'Stacked_bar_plots' )
                    {
                    // InternalRelisTextual.g:705:3: (enumLiteral_1= 'Stacked_bar_plots' )
                    // InternalRelisTextual.g:706:4: enumLiteral_1= 'Stacked_bar_plots'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getCompStatsAccess().getStacked_bar_plotsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompStatsAccess().getStacked_bar_plotsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRelisTextual.g:713:3: (enumLiteral_2= 'Grouped_bar_plots' )
                    {
                    // InternalRelisTextual.g:713:3: (enumLiteral_2= 'Grouped_bar_plots' )
                    // InternalRelisTextual.g:714:4: enumLiteral_2= 'Grouped_bar_plots'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getCompStatsAccess().getGrouped_bar_plotsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getCompStatsAccess().getGrouped_bar_plotsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRelisTextual.g:721:3: (enumLiteral_3= 'Bubble_charts' )
                    {
                    // InternalRelisTextual.g:721:3: (enumLiteral_3= 'Bubble_charts' )
                    // InternalRelisTextual.g:722:4: enumLiteral_3= 'Bubble_charts'
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getCompStatsAccess().getBubble_chartsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getCompStatsAccess().getBubble_chartsEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRelisTextual.g:729:3: (enumLiteral_4= 'Fisher_exact_test' )
                    {
                    // InternalRelisTextual.g:729:3: (enumLiteral_4= 'Fisher_exact_test' )
                    // InternalRelisTextual.g:730:4: enumLiteral_4= 'Fisher_exact_test'
                    {
                    enumLiteral_4=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getCompStatsAccess().getFisher_exact_testEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getCompStatsAccess().getFisher_exact_testEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalRelisTextual.g:737:3: (enumLiteral_5= 'Shapiro_Wilk_correlation_test' )
                    {
                    // InternalRelisTextual.g:737:3: (enumLiteral_5= 'Shapiro_Wilk_correlation_test' )
                    // InternalRelisTextual.g:738:4: enumLiteral_5= 'Shapiro_Wilk_correlation_test'
                    {
                    enumLiteral_5=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getCompStatsAccess().getShapiro_Wilk_correlation_testEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getCompStatsAccess().getShapiro_Wilk_correlation_testEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalRelisTextual.g:745:3: (enumLiteral_6= 'Pearson_correlation_test' )
                    {
                    // InternalRelisTextual.g:745:3: (enumLiteral_6= 'Pearson_correlation_test' )
                    // InternalRelisTextual.g:746:4: enumLiteral_6= 'Pearson_correlation_test'
                    {
                    enumLiteral_6=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getCompStatsAccess().getPearson_correlation_testEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getCompStatsAccess().getPearson_correlation_testEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalRelisTextual.g:753:3: (enumLiteral_7= 'Spearman_correlation_test' )
                    {
                    // InternalRelisTextual.g:753:3: (enumLiteral_7= 'Spearman_correlation_test' )
                    // InternalRelisTextual.g:754:4: enumLiteral_7= 'Spearman_correlation_test'
                    {
                    enumLiteral_7=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getCompStatsAccess().getSpearman_correlation_testEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getCompStatsAccess().getSpearman_correlation_testEnumLiteralDeclaration_7());
                    			

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
    // $ANTLR end "ruleCompStats"


    // $ANTLR start "ruleEvoStats"
    // InternalRelisTextual.g:764:1: ruleEvoStats returns [Enumerator current=null] : ( (enumLiteral_0= 'Frequency_tables' ) | (enumLiteral_1= 'Evolution_plots' ) ) ;
    public final Enumerator ruleEvoStats() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRelisTextual.g:770:2: ( ( (enumLiteral_0= 'Frequency_tables' ) | (enumLiteral_1= 'Evolution_plots' ) ) )
            // InternalRelisTextual.g:771:2: ( (enumLiteral_0= 'Frequency_tables' ) | (enumLiteral_1= 'Evolution_plots' ) )
            {
            // InternalRelisTextual.g:771:2: ( (enumLiteral_0= 'Frequency_tables' ) | (enumLiteral_1= 'Evolution_plots' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            else if ( (LA16_0==35) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalRelisTextual.g:772:3: (enumLiteral_0= 'Frequency_tables' )
                    {
                    // InternalRelisTextual.g:772:3: (enumLiteral_0= 'Frequency_tables' )
                    // InternalRelisTextual.g:773:4: enumLiteral_0= 'Frequency_tables'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getEvoStatsAccess().getFrequency_tablesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEvoStatsAccess().getFrequency_tablesEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRelisTextual.g:780:3: (enumLiteral_1= 'Evolution_plots' )
                    {
                    // InternalRelisTextual.g:780:3: (enumLiteral_1= 'Evolution_plots' )
                    // InternalRelisTextual.g:781:4: enumLiteral_1= 'Evolution_plots'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getEvoStatsAccess().getEvolution_plotsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEvoStatsAccess().getEvolution_plotsEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleEvoStats"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000680000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000192000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000190000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000F800002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000F800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000007F0800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000007F0800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800800000L});

}