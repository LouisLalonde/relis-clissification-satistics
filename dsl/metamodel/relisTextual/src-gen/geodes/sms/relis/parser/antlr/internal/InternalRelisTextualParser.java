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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RelisRoot'", "'{'", "'variable'", "','", "'}'", "'Variable'", "'statistic'", "'Descriptive'", "'type'", "'Comparative'", "'Evolution'", "'Continuous'", "'Nominal'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
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
    // InternalRelisTextual.g:72:1: ruleRelisRoot returns [EObject current=null] : ( () otherlv_1= 'RelisRoot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleRelisRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_variable_6_0 = null;

        EObject lv_variable_8_0 = null;



        	enterRule();

        try {
            // InternalRelisTextual.g:78:2: ( ( () otherlv_1= 'RelisRoot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalRelisTextual.g:79:2: ( () otherlv_1= 'RelisRoot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalRelisTextual.g:79:2: ( () otherlv_1= 'RelisRoot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalRelisTextual.g:80:3: () otherlv_1= 'RelisRoot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalRelisTextual.g:80:3: ()
            // InternalRelisTextual.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelisRootAccess().getRelisRootAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRelisRootAccess().getRelisRootKeyword_1());
            		
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
            		
            // InternalRelisTextual.g:114:3: (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRelisTextual.g:115:4: otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelisRootAccess().getVariableKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getRelisRootAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRelisTextual.g:123:4: ( (lv_variable_6_0= ruleVariable ) )
                    // InternalRelisTextual.g:124:5: (lv_variable_6_0= ruleVariable )
                    {
                    // InternalRelisTextual.g:124:5: (lv_variable_6_0= ruleVariable )
                    // InternalRelisTextual.g:125:6: lv_variable_6_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getRelisRootAccess().getVariableVariableParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_variable_6_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelisRootRule());
                    						}
                    						add(
                    							current,
                    							"variable",
                    							lv_variable_6_0,
                    							"geodes.sms.relis.RelisTextual.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRelisTextual.g:142:4: (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRelisTextual.g:143:5: otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRelisRootAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRelisTextual.g:147:5: ( (lv_variable_8_0= ruleVariable ) )
                    	    // InternalRelisTextual.g:148:6: (lv_variable_8_0= ruleVariable )
                    	    {
                    	    // InternalRelisTextual.g:148:6: (lv_variable_8_0= ruleVariable )
                    	    // InternalRelisTextual.g:149:7: lv_variable_8_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelisRootAccess().getVariableVariableParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_variable_8_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelisRootRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variable",
                    	    								lv_variable_8_0,
                    	    								"geodes.sms.relis.RelisTextual.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getRelisRootAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getRelisRootAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalRelisTextual.g:180:1: entryRuleStatistic returns [EObject current=null] : iv_ruleStatistic= ruleStatistic EOF ;
    public final EObject entryRuleStatistic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatistic = null;


        try {
            // InternalRelisTextual.g:180:50: (iv_ruleStatistic= ruleStatistic EOF )
            // InternalRelisTextual.g:181:2: iv_ruleStatistic= ruleStatistic EOF
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
    // InternalRelisTextual.g:187:1: ruleStatistic returns [EObject current=null] : (this_Descriptive_0= ruleDescriptive | this_Comparative_1= ruleComparative | this_Evolution_2= ruleEvolution ) ;
    public final EObject ruleStatistic() throws RecognitionException {
        EObject current = null;

        EObject this_Descriptive_0 = null;

        EObject this_Comparative_1 = null;

        EObject this_Evolution_2 = null;



        	enterRule();

        try {
            // InternalRelisTextual.g:193:2: ( (this_Descriptive_0= ruleDescriptive | this_Comparative_1= ruleComparative | this_Evolution_2= ruleEvolution ) )
            // InternalRelisTextual.g:194:2: (this_Descriptive_0= ruleDescriptive | this_Comparative_1= ruleComparative | this_Evolution_2= ruleEvolution )
            {
            // InternalRelisTextual.g:194:2: (this_Descriptive_0= ruleDescriptive | this_Comparative_1= ruleComparative | this_Evolution_2= ruleEvolution )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 21:
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
                    // InternalRelisTextual.g:195:3: this_Descriptive_0= ruleDescriptive
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
                    // InternalRelisTextual.g:204:3: this_Comparative_1= ruleComparative
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
                    // InternalRelisTextual.g:213:3: this_Evolution_2= ruleEvolution
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
    // InternalRelisTextual.g:225:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalRelisTextual.g:225:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalRelisTextual.g:226:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalRelisTextual.g:232:1: ruleVariable returns [EObject current=null] : ( () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statistic' otherlv_5= '{' ( (lv_statistic_6_0= ruleStatistic ) ) (otherlv_7= ',' ( (lv_statistic_8_0= ruleStatistic ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_statistic_6_0 = null;

        EObject lv_statistic_8_0 = null;



        	enterRule();

        try {
            // InternalRelisTextual.g:238:2: ( ( () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statistic' otherlv_5= '{' ( (lv_statistic_6_0= ruleStatistic ) ) (otherlv_7= ',' ( (lv_statistic_8_0= ruleStatistic ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalRelisTextual.g:239:2: ( () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statistic' otherlv_5= '{' ( (lv_statistic_6_0= ruleStatistic ) ) (otherlv_7= ',' ( (lv_statistic_8_0= ruleStatistic ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalRelisTextual.g:239:2: ( () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statistic' otherlv_5= '{' ( (lv_statistic_6_0= ruleStatistic ) ) (otherlv_7= ',' ( (lv_statistic_8_0= ruleStatistic ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalRelisTextual.g:240:3: () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'statistic' otherlv_5= '{' ( (lv_statistic_6_0= ruleStatistic ) ) (otherlv_7= ',' ( (lv_statistic_8_0= ruleStatistic ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalRelisTextual.g:240:3: ()
            // InternalRelisTextual.g:241:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getVariableKeyword_1());
            		
            // InternalRelisTextual.g:251:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRelisTextual.g:252:4: (lv_name_2_0= ruleEString )
            {
            // InternalRelisTextual.g:252:4: (lv_name_2_0= ruleEString )
            // InternalRelisTextual.g:253:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRelisTextual.g:274:3: (otherlv_4= 'statistic' otherlv_5= '{' ( (lv_statistic_6_0= ruleStatistic ) ) (otherlv_7= ',' ( (lv_statistic_8_0= ruleStatistic ) ) )* otherlv_9= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRelisTextual.g:275:4: otherlv_4= 'statistic' otherlv_5= '{' ( (lv_statistic_6_0= ruleStatistic ) ) (otherlv_7= ',' ( (lv_statistic_8_0= ruleStatistic ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getStatisticKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRelisTextual.g:283:4: ( (lv_statistic_6_0= ruleStatistic ) )
                    // InternalRelisTextual.g:284:5: (lv_statistic_6_0= ruleStatistic )
                    {
                    // InternalRelisTextual.g:284:5: (lv_statistic_6_0= ruleStatistic )
                    // InternalRelisTextual.g:285:6: lv_statistic_6_0= ruleStatistic
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getStatisticStatisticParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_statistic_6_0=ruleStatistic();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						add(
                    							current,
                    							"statistic",
                    							lv_statistic_6_0,
                    							"geodes.sms.relis.RelisTextual.Statistic");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRelisTextual.g:302:4: (otherlv_7= ',' ( (lv_statistic_8_0= ruleStatistic ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRelisTextual.g:303:5: otherlv_7= ',' ( (lv_statistic_8_0= ruleStatistic ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRelisTextual.g:307:5: ( (lv_statistic_8_0= ruleStatistic ) )
                    	    // InternalRelisTextual.g:308:6: (lv_statistic_8_0= ruleStatistic )
                    	    {
                    	    // InternalRelisTextual.g:308:6: (lv_statistic_8_0= ruleStatistic )
                    	    // InternalRelisTextual.g:309:7: lv_statistic_8_0= ruleStatistic
                    	    {

                    	    							newCompositeNode(grammarAccess.getVariableAccess().getStatisticStatisticParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_statistic_8_0=ruleStatistic();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVariableRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"statistic",
                    	    								lv_statistic_8_0,
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

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalRelisTextual.g:340:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRelisTextual.g:340:47: (iv_ruleEString= ruleEString EOF )
            // InternalRelisTextual.g:341:2: iv_ruleEString= ruleEString EOF
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
    // InternalRelisTextual.g:347:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRelisTextual.g:353:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRelisTextual.g:354:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRelisTextual.g:354:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalRelisTextual.g:355:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRelisTextual.g:363:3: this_ID_1= RULE_ID
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
    // InternalRelisTextual.g:374:1: entryRuleDescriptive returns [EObject current=null] : iv_ruleDescriptive= ruleDescriptive EOF ;
    public final EObject entryRuleDescriptive() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptive = null;


        try {
            // InternalRelisTextual.g:374:52: (iv_ruleDescriptive= ruleDescriptive EOF )
            // InternalRelisTextual.g:375:2: iv_ruleDescriptive= ruleDescriptive EOF
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
    // InternalRelisTextual.g:381:1: ruleDescriptive returns [EObject current=null] : ( () otherlv_1= 'Descriptive' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleType ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleDescriptive() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalRelisTextual.g:387:2: ( ( () otherlv_1= 'Descriptive' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleType ) ) )? otherlv_6= '}' ) )
            // InternalRelisTextual.g:388:2: ( () otherlv_1= 'Descriptive' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleType ) ) )? otherlv_6= '}' )
            {
            // InternalRelisTextual.g:388:2: ( () otherlv_1= 'Descriptive' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleType ) ) )? otherlv_6= '}' )
            // InternalRelisTextual.g:389:3: () otherlv_1= 'Descriptive' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleType ) ) )? otherlv_6= '}'
            {
            // InternalRelisTextual.g:389:3: ()
            // InternalRelisTextual.g:390:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDescriptiveAccess().getDescriptiveAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDescriptiveAccess().getDescriptiveKeyword_1());
            		
            // InternalRelisTextual.g:400:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRelisTextual.g:401:4: (lv_name_2_0= ruleEString )
            {
            // InternalRelisTextual.g:401:4: (lv_name_2_0= ruleEString )
            // InternalRelisTextual.g:402:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDescriptiveAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDescriptiveRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"geodes.sms.relis.RelisTextual.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getDescriptiveAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRelisTextual.g:423:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleType ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRelisTextual.g:424:4: otherlv_4= 'type' ( (lv_type_5_0= ruleType ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getDescriptiveAccess().getTypeKeyword_4_0());
                    			
                    // InternalRelisTextual.g:428:4: ( (lv_type_5_0= ruleType ) )
                    // InternalRelisTextual.g:429:5: (lv_type_5_0= ruleType )
                    {
                    // InternalRelisTextual.g:429:5: (lv_type_5_0= ruleType )
                    // InternalRelisTextual.g:430:6: lv_type_5_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getDescriptiveAccess().getTypeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_type_5_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDescriptiveRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"geodes.sms.relis.RelisTextual.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDescriptiveAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalRelisTextual.g:456:1: entryRuleComparative returns [EObject current=null] : iv_ruleComparative= ruleComparative EOF ;
    public final EObject entryRuleComparative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparative = null;


        try {
            // InternalRelisTextual.g:456:52: (iv_ruleComparative= ruleComparative EOF )
            // InternalRelisTextual.g:457:2: iv_ruleComparative= ruleComparative EOF
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
    // InternalRelisTextual.g:463:1: ruleComparative returns [EObject current=null] : ( () otherlv_1= 'Comparative' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleType ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleComparative() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalRelisTextual.g:469:2: ( ( () otherlv_1= 'Comparative' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleType ) ) )? otherlv_6= '}' ) )
            // InternalRelisTextual.g:470:2: ( () otherlv_1= 'Comparative' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleType ) ) )? otherlv_6= '}' )
            {
            // InternalRelisTextual.g:470:2: ( () otherlv_1= 'Comparative' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleType ) ) )? otherlv_6= '}' )
            // InternalRelisTextual.g:471:3: () otherlv_1= 'Comparative' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleType ) ) )? otherlv_6= '}'
            {
            // InternalRelisTextual.g:471:3: ()
            // InternalRelisTextual.g:472:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComparativeAccess().getComparativeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getComparativeAccess().getComparativeKeyword_1());
            		
            // InternalRelisTextual.g:482:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRelisTextual.g:483:4: (lv_name_2_0= ruleEString )
            {
            // InternalRelisTextual.g:483:4: (lv_name_2_0= ruleEString )
            // InternalRelisTextual.g:484:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComparativeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparativeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"geodes.sms.relis.RelisTextual.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getComparativeAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRelisTextual.g:505:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleType ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRelisTextual.g:506:4: otherlv_4= 'type' ( (lv_type_5_0= ruleType ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getComparativeAccess().getTypeKeyword_4_0());
                    			
                    // InternalRelisTextual.g:510:4: ( (lv_type_5_0= ruleType ) )
                    // InternalRelisTextual.g:511:5: (lv_type_5_0= ruleType )
                    {
                    // InternalRelisTextual.g:511:5: (lv_type_5_0= ruleType )
                    // InternalRelisTextual.g:512:6: lv_type_5_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getComparativeAccess().getTypeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_type_5_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComparativeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"geodes.sms.relis.RelisTextual.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComparativeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalRelisTextual.g:538:1: entryRuleEvolution returns [EObject current=null] : iv_ruleEvolution= ruleEvolution EOF ;
    public final EObject entryRuleEvolution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvolution = null;


        try {
            // InternalRelisTextual.g:538:50: (iv_ruleEvolution= ruleEvolution EOF )
            // InternalRelisTextual.g:539:2: iv_ruleEvolution= ruleEvolution EOF
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
    // InternalRelisTextual.g:545:1: ruleEvolution returns [EObject current=null] : ( () otherlv_1= 'Evolution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleType ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleEvolution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalRelisTextual.g:551:2: ( ( () otherlv_1= 'Evolution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleType ) ) )? otherlv_6= '}' ) )
            // InternalRelisTextual.g:552:2: ( () otherlv_1= 'Evolution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleType ) ) )? otherlv_6= '}' )
            {
            // InternalRelisTextual.g:552:2: ( () otherlv_1= 'Evolution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleType ) ) )? otherlv_6= '}' )
            // InternalRelisTextual.g:553:3: () otherlv_1= 'Evolution' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleType ) ) )? otherlv_6= '}'
            {
            // InternalRelisTextual.g:553:3: ()
            // InternalRelisTextual.g:554:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEvolutionAccess().getEvolutionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEvolutionAccess().getEvolutionKeyword_1());
            		
            // InternalRelisTextual.g:564:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRelisTextual.g:565:4: (lv_name_2_0= ruleEString )
            {
            // InternalRelisTextual.g:565:4: (lv_name_2_0= ruleEString )
            // InternalRelisTextual.g:566:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEvolutionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEvolutionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"geodes.sms.relis.RelisTextual.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getEvolutionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRelisTextual.g:587:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleType ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRelisTextual.g:588:4: otherlv_4= 'type' ( (lv_type_5_0= ruleType ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getEvolutionAccess().getTypeKeyword_4_0());
                    			
                    // InternalRelisTextual.g:592:4: ( (lv_type_5_0= ruleType ) )
                    // InternalRelisTextual.g:593:5: (lv_type_5_0= ruleType )
                    {
                    // InternalRelisTextual.g:593:5: (lv_type_5_0= ruleType )
                    // InternalRelisTextual.g:594:6: lv_type_5_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getEvolutionAccess().getTypeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_type_5_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEvolutionRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"geodes.sms.relis.RelisTextual.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEvolutionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalRelisTextual.g:620:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'Continuous' ) | (enumLiteral_1= 'Nominal' ) | (enumLiteral_2= 'Comparative' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRelisTextual.g:626:2: ( ( (enumLiteral_0= 'Continuous' ) | (enumLiteral_1= 'Nominal' ) | (enumLiteral_2= 'Comparative' ) ) )
            // InternalRelisTextual.g:627:2: ( (enumLiteral_0= 'Continuous' ) | (enumLiteral_1= 'Nominal' ) | (enumLiteral_2= 'Comparative' ) )
            {
            // InternalRelisTextual.g:627:2: ( (enumLiteral_0= 'Continuous' ) | (enumLiteral_1= 'Nominal' ) | (enumLiteral_2= 'Comparative' ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt10=1;
                }
                break;
            case 23:
                {
                alt10=2;
                }
                break;
            case 20:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRelisTextual.g:628:3: (enumLiteral_0= 'Continuous' )
                    {
                    // InternalRelisTextual.g:628:3: (enumLiteral_0= 'Continuous' )
                    // InternalRelisTextual.g:629:4: enumLiteral_0= 'Continuous'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getContinuousEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getContinuousEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRelisTextual.g:636:3: (enumLiteral_1= 'Nominal' )
                    {
                    // InternalRelisTextual.g:636:3: (enumLiteral_1= 'Nominal' )
                    // InternalRelisTextual.g:637:4: enumLiteral_1= 'Nominal'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getNominalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getNominalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRelisTextual.g:644:3: (enumLiteral_2= 'Comparative' )
                    {
                    // InternalRelisTextual.g:644:3: (enumLiteral_2= 'Comparative' )
                    // InternalRelisTextual.g:645:4: enumLiteral_2= 'Comparative'
                    {
                    enumLiteral_2=(Token)match(input,20,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000D00000L});

}