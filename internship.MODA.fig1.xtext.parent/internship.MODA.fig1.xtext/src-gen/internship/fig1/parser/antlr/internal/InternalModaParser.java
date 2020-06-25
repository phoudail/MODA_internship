package internship.fig1.parser.antlr.internal;

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
import internship.fig1.services.ModaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MODA'", "'{'", "'sociotechnicalsystem'", "'data'", "','", "'}'", "'software'", "'model'", "'modelrole'", "'SocioTechnicalSystem'", "'('", "')'", "'prescriptivemodel'", "'Data'", "'dataType'", "'Software'", "'state'", "'Model'", "'PrescriptiveModel'", "'predictivemodel'", "'prescriptivemodeleOpposite'", "'PredictiveModel'", "'descriptivemodel'", "'DescriptiveModel'", "'InputData'", "'OutputData'", "'ExternalData'", "'MeasuredData'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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


        public InternalModaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalModaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalModaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalModa.g"; }



     	private ModaGrammarAccess grammarAccess;

        public InternalModaParser(TokenStream input, ModaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MODA";
       	}

       	@Override
       	protected ModaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMODA"
    // InternalModa.g:65:1: entryRuleMODA returns [EObject current=null] : iv_ruleMODA= ruleMODA EOF ;
    public final EObject entryRuleMODA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMODA = null;


        try {
            // InternalModa.g:65:45: (iv_ruleMODA= ruleMODA EOF )
            // InternalModa.g:66:2: iv_ruleMODA= ruleMODA EOF
            {
             newCompositeNode(grammarAccess.getMODARule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMODA=ruleMODA();

            state._fsp--;

             current =iv_ruleMODA; 
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
    // $ANTLR end "entryRuleMODA"


    // $ANTLR start "ruleMODA"
    // InternalModa.g:72:1: ruleMODA returns [EObject current=null] : ( () otherlv_1= 'MODA' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sociotechnicalsystem' ( (lv_sociotechnicalsystem_5_0= ruleSocioTechnicalSystem ) ) )? (otherlv_6= 'data' otherlv_7= '{' ( (lv_data_8_0= ruleData ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleData ) ) )* otherlv_11= '}' )? (otherlv_12= 'software' ( (lv_software_13_0= ruleSoftware ) ) )? (otherlv_14= 'model' otherlv_15= '{' ( (lv_model_16_0= ruleModel ) ) (otherlv_17= ',' ( (lv_model_18_0= ruleModel ) ) )* otherlv_19= '}' )? (otherlv_20= 'modelrole' otherlv_21= '{' ( (lv_modelrole_22_0= ruleModelRole ) ) (otherlv_23= ',' ( (lv_modelrole_24_0= ruleModelRole ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) ;
    public final EObject ruleMODA() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_sociotechnicalsystem_5_0 = null;

        EObject lv_data_8_0 = null;

        EObject lv_data_10_0 = null;

        EObject lv_software_13_0 = null;

        EObject lv_model_16_0 = null;

        EObject lv_model_18_0 = null;

        EObject lv_modelrole_22_0 = null;

        EObject lv_modelrole_24_0 = null;



        	enterRule();

        try {
            // InternalModa.g:78:2: ( ( () otherlv_1= 'MODA' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sociotechnicalsystem' ( (lv_sociotechnicalsystem_5_0= ruleSocioTechnicalSystem ) ) )? (otherlv_6= 'data' otherlv_7= '{' ( (lv_data_8_0= ruleData ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleData ) ) )* otherlv_11= '}' )? (otherlv_12= 'software' ( (lv_software_13_0= ruleSoftware ) ) )? (otherlv_14= 'model' otherlv_15= '{' ( (lv_model_16_0= ruleModel ) ) (otherlv_17= ',' ( (lv_model_18_0= ruleModel ) ) )* otherlv_19= '}' )? (otherlv_20= 'modelrole' otherlv_21= '{' ( (lv_modelrole_22_0= ruleModelRole ) ) (otherlv_23= ',' ( (lv_modelrole_24_0= ruleModelRole ) ) )* otherlv_25= '}' )? otherlv_26= '}' ) )
            // InternalModa.g:79:2: ( () otherlv_1= 'MODA' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sociotechnicalsystem' ( (lv_sociotechnicalsystem_5_0= ruleSocioTechnicalSystem ) ) )? (otherlv_6= 'data' otherlv_7= '{' ( (lv_data_8_0= ruleData ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleData ) ) )* otherlv_11= '}' )? (otherlv_12= 'software' ( (lv_software_13_0= ruleSoftware ) ) )? (otherlv_14= 'model' otherlv_15= '{' ( (lv_model_16_0= ruleModel ) ) (otherlv_17= ',' ( (lv_model_18_0= ruleModel ) ) )* otherlv_19= '}' )? (otherlv_20= 'modelrole' otherlv_21= '{' ( (lv_modelrole_22_0= ruleModelRole ) ) (otherlv_23= ',' ( (lv_modelrole_24_0= ruleModelRole ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            {
            // InternalModa.g:79:2: ( () otherlv_1= 'MODA' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sociotechnicalsystem' ( (lv_sociotechnicalsystem_5_0= ruleSocioTechnicalSystem ) ) )? (otherlv_6= 'data' otherlv_7= '{' ( (lv_data_8_0= ruleData ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleData ) ) )* otherlv_11= '}' )? (otherlv_12= 'software' ( (lv_software_13_0= ruleSoftware ) ) )? (otherlv_14= 'model' otherlv_15= '{' ( (lv_model_16_0= ruleModel ) ) (otherlv_17= ',' ( (lv_model_18_0= ruleModel ) ) )* otherlv_19= '}' )? (otherlv_20= 'modelrole' otherlv_21= '{' ( (lv_modelrole_22_0= ruleModelRole ) ) (otherlv_23= ',' ( (lv_modelrole_24_0= ruleModelRole ) ) )* otherlv_25= '}' )? otherlv_26= '}' )
            // InternalModa.g:80:3: () otherlv_1= 'MODA' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'sociotechnicalsystem' ( (lv_sociotechnicalsystem_5_0= ruleSocioTechnicalSystem ) ) )? (otherlv_6= 'data' otherlv_7= '{' ( (lv_data_8_0= ruleData ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleData ) ) )* otherlv_11= '}' )? (otherlv_12= 'software' ( (lv_software_13_0= ruleSoftware ) ) )? (otherlv_14= 'model' otherlv_15= '{' ( (lv_model_16_0= ruleModel ) ) (otherlv_17= ',' ( (lv_model_18_0= ruleModel ) ) )* otherlv_19= '}' )? (otherlv_20= 'modelrole' otherlv_21= '{' ( (lv_modelrole_22_0= ruleModelRole ) ) (otherlv_23= ',' ( (lv_modelrole_24_0= ruleModelRole ) ) )* otherlv_25= '}' )? otherlv_26= '}'
            {
            // InternalModa.g:80:3: ()
            // InternalModa.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMODAAccess().getMODAAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMODAAccess().getMODAKeyword_1());
            		
            // InternalModa.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModa.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalModa.g:92:4: (lv_name_2_0= ruleEString )
            // InternalModa.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMODAAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMODARule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"internship.fig1.Moda.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getMODAAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalModa.g:114:3: (otherlv_4= 'sociotechnicalsystem' ( (lv_sociotechnicalsystem_5_0= ruleSocioTechnicalSystem ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalModa.g:115:4: otherlv_4= 'sociotechnicalsystem' ( (lv_sociotechnicalsystem_5_0= ruleSocioTechnicalSystem ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getMODAAccess().getSociotechnicalsystemKeyword_4_0());
                    			
                    // InternalModa.g:119:4: ( (lv_sociotechnicalsystem_5_0= ruleSocioTechnicalSystem ) )
                    // InternalModa.g:120:5: (lv_sociotechnicalsystem_5_0= ruleSocioTechnicalSystem )
                    {
                    // InternalModa.g:120:5: (lv_sociotechnicalsystem_5_0= ruleSocioTechnicalSystem )
                    // InternalModa.g:121:6: lv_sociotechnicalsystem_5_0= ruleSocioTechnicalSystem
                    {

                    						newCompositeNode(grammarAccess.getMODAAccess().getSociotechnicalsystemSocioTechnicalSystemParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_sociotechnicalsystem_5_0=ruleSocioTechnicalSystem();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMODARule());
                    						}
                    						set(
                    							current,
                    							"sociotechnicalsystem",
                    							lv_sociotechnicalsystem_5_0,
                    							"internship.fig1.Moda.SocioTechnicalSystem");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModa.g:139:3: (otherlv_6= 'data' otherlv_7= '{' ( (lv_data_8_0= ruleData ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleData ) ) )* otherlv_11= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalModa.g:140:4: otherlv_6= 'data' otherlv_7= '{' ( (lv_data_8_0= ruleData ) ) (otherlv_9= ',' ( (lv_data_10_0= ruleData ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getMODAAccess().getDataKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getMODAAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalModa.g:148:4: ( (lv_data_8_0= ruleData ) )
                    // InternalModa.g:149:5: (lv_data_8_0= ruleData )
                    {
                    // InternalModa.g:149:5: (lv_data_8_0= ruleData )
                    // InternalModa.g:150:6: lv_data_8_0= ruleData
                    {

                    						newCompositeNode(grammarAccess.getMODAAccess().getDataDataParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_data_8_0=ruleData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMODARule());
                    						}
                    						add(
                    							current,
                    							"data",
                    							lv_data_8_0,
                    							"internship.fig1.Moda.Data");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModa.g:167:4: (otherlv_9= ',' ( (lv_data_10_0= ruleData ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalModa.g:168:5: otherlv_9= ',' ( (lv_data_10_0= ruleData ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getMODAAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalModa.g:172:5: ( (lv_data_10_0= ruleData ) )
                    	    // InternalModa.g:173:6: (lv_data_10_0= ruleData )
                    	    {
                    	    // InternalModa.g:173:6: (lv_data_10_0= ruleData )
                    	    // InternalModa.g:174:7: lv_data_10_0= ruleData
                    	    {

                    	    							newCompositeNode(grammarAccess.getMODAAccess().getDataDataParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_data_10_0=ruleData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMODARule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"data",
                    	    								lv_data_10_0,
                    	    								"internship.fig1.Moda.Data");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getMODAAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalModa.g:197:3: (otherlv_12= 'software' ( (lv_software_13_0= ruleSoftware ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalModa.g:198:4: otherlv_12= 'software' ( (lv_software_13_0= ruleSoftware ) )
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_12, grammarAccess.getMODAAccess().getSoftwareKeyword_6_0());
                    			
                    // InternalModa.g:202:4: ( (lv_software_13_0= ruleSoftware ) )
                    // InternalModa.g:203:5: (lv_software_13_0= ruleSoftware )
                    {
                    // InternalModa.g:203:5: (lv_software_13_0= ruleSoftware )
                    // InternalModa.g:204:6: lv_software_13_0= ruleSoftware
                    {

                    						newCompositeNode(grammarAccess.getMODAAccess().getSoftwareSoftwareParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_software_13_0=ruleSoftware();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMODARule());
                    						}
                    						set(
                    							current,
                    							"software",
                    							lv_software_13_0,
                    							"internship.fig1.Moda.Software");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModa.g:222:3: (otherlv_14= 'model' otherlv_15= '{' ( (lv_model_16_0= ruleModel ) ) (otherlv_17= ',' ( (lv_model_18_0= ruleModel ) ) )* otherlv_19= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalModa.g:223:4: otherlv_14= 'model' otherlv_15= '{' ( (lv_model_16_0= ruleModel ) ) (otherlv_17= ',' ( (lv_model_18_0= ruleModel ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getMODAAccess().getModelKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getMODAAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalModa.g:231:4: ( (lv_model_16_0= ruleModel ) )
                    // InternalModa.g:232:5: (lv_model_16_0= ruleModel )
                    {
                    // InternalModa.g:232:5: (lv_model_16_0= ruleModel )
                    // InternalModa.g:233:6: lv_model_16_0= ruleModel
                    {

                    						newCompositeNode(grammarAccess.getMODAAccess().getModelModelParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_model_16_0=ruleModel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMODARule());
                    						}
                    						add(
                    							current,
                    							"model",
                    							lv_model_16_0,
                    							"internship.fig1.Moda.Model");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModa.g:250:4: (otherlv_17= ',' ( (lv_model_18_0= ruleModel ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==15) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalModa.g:251:5: otherlv_17= ',' ( (lv_model_18_0= ruleModel ) )
                    	    {
                    	    otherlv_17=(Token)match(input,15,FOLLOW_13); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getMODAAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalModa.g:255:5: ( (lv_model_18_0= ruleModel ) )
                    	    // InternalModa.g:256:6: (lv_model_18_0= ruleModel )
                    	    {
                    	    // InternalModa.g:256:6: (lv_model_18_0= ruleModel )
                    	    // InternalModa.g:257:7: lv_model_18_0= ruleModel
                    	    {

                    	    							newCompositeNode(grammarAccess.getMODAAccess().getModelModelParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_model_18_0=ruleModel();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMODARule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"model",
                    	    								lv_model_18_0,
                    	    								"internship.fig1.Moda.Model");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,16,FOLLOW_14); 

                    				newLeafNode(otherlv_19, grammarAccess.getMODAAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalModa.g:280:3: (otherlv_20= 'modelrole' otherlv_21= '{' ( (lv_modelrole_22_0= ruleModelRole ) ) (otherlv_23= ',' ( (lv_modelrole_24_0= ruleModelRole ) ) )* otherlv_25= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalModa.g:281:4: otherlv_20= 'modelrole' otherlv_21= '{' ( (lv_modelrole_22_0= ruleModelRole ) ) (otherlv_23= ',' ( (lv_modelrole_24_0= ruleModelRole ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getMODAAccess().getModelroleKeyword_8_0());
                    			
                    otherlv_21=(Token)match(input,12,FOLLOW_15); 

                    				newLeafNode(otherlv_21, grammarAccess.getMODAAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalModa.g:289:4: ( (lv_modelrole_22_0= ruleModelRole ) )
                    // InternalModa.g:290:5: (lv_modelrole_22_0= ruleModelRole )
                    {
                    // InternalModa.g:290:5: (lv_modelrole_22_0= ruleModelRole )
                    // InternalModa.g:291:6: lv_modelrole_22_0= ruleModelRole
                    {

                    						newCompositeNode(grammarAccess.getMODAAccess().getModelroleModelRoleParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_modelrole_22_0=ruleModelRole();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMODARule());
                    						}
                    						add(
                    							current,
                    							"modelrole",
                    							lv_modelrole_22_0,
                    							"internship.fig1.Moda.ModelRole");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModa.g:308:4: (otherlv_23= ',' ( (lv_modelrole_24_0= ruleModelRole ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalModa.g:309:5: otherlv_23= ',' ( (lv_modelrole_24_0= ruleModelRole ) )
                    	    {
                    	    otherlv_23=(Token)match(input,15,FOLLOW_15); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getMODAAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalModa.g:313:5: ( (lv_modelrole_24_0= ruleModelRole ) )
                    	    // InternalModa.g:314:6: (lv_modelrole_24_0= ruleModelRole )
                    	    {
                    	    // InternalModa.g:314:6: (lv_modelrole_24_0= ruleModelRole )
                    	    // InternalModa.g:315:7: lv_modelrole_24_0= ruleModelRole
                    	    {

                    	    							newCompositeNode(grammarAccess.getMODAAccess().getModelroleModelRoleParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_modelrole_24_0=ruleModelRole();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMODARule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"modelrole",
                    	    								lv_modelrole_24_0,
                    	    								"internship.fig1.Moda.ModelRole");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,16,FOLLOW_16); 

                    				newLeafNode(otherlv_25, grammarAccess.getMODAAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_26=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getMODAAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleMODA"


    // $ANTLR start "entryRuleModelRole"
    // InternalModa.g:346:1: entryRuleModelRole returns [EObject current=null] : iv_ruleModelRole= ruleModelRole EOF ;
    public final EObject entryRuleModelRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelRole = null;


        try {
            // InternalModa.g:346:50: (iv_ruleModelRole= ruleModelRole EOF )
            // InternalModa.g:347:2: iv_ruleModelRole= ruleModelRole EOF
            {
             newCompositeNode(grammarAccess.getModelRoleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelRole=ruleModelRole();

            state._fsp--;

             current =iv_ruleModelRole; 
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
    // $ANTLR end "entryRuleModelRole"


    // $ANTLR start "ruleModelRole"
    // InternalModa.g:353:1: ruleModelRole returns [EObject current=null] : (this_DescriptiveModel_0= ruleDescriptiveModel | this_PredictiveModel_1= rulePredictiveModel | this_PrescriptiveModel_2= rulePrescriptiveModel ) ;
    public final EObject ruleModelRole() throws RecognitionException {
        EObject current = null;

        EObject this_DescriptiveModel_0 = null;

        EObject this_PredictiveModel_1 = null;

        EObject this_PrescriptiveModel_2 = null;



        	enterRule();

        try {
            // InternalModa.g:359:2: ( (this_DescriptiveModel_0= ruleDescriptiveModel | this_PredictiveModel_1= rulePredictiveModel | this_PrescriptiveModel_2= rulePrescriptiveModel ) )
            // InternalModa.g:360:2: (this_DescriptiveModel_0= ruleDescriptiveModel | this_PredictiveModel_1= rulePredictiveModel | this_PrescriptiveModel_2= rulePrescriptiveModel )
            {
            // InternalModa.g:360:2: (this_DescriptiveModel_0= ruleDescriptiveModel | this_PredictiveModel_1= rulePredictiveModel | this_PrescriptiveModel_2= rulePrescriptiveModel )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalModa.g:361:3: this_DescriptiveModel_0= ruleDescriptiveModel
                    {

                    			newCompositeNode(grammarAccess.getModelRoleAccess().getDescriptiveModelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DescriptiveModel_0=ruleDescriptiveModel();

                    state._fsp--;


                    			current = this_DescriptiveModel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalModa.g:370:3: this_PredictiveModel_1= rulePredictiveModel
                    {

                    			newCompositeNode(grammarAccess.getModelRoleAccess().getPredictiveModelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PredictiveModel_1=rulePredictiveModel();

                    state._fsp--;


                    			current = this_PredictiveModel_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalModa.g:379:3: this_PrescriptiveModel_2= rulePrescriptiveModel
                    {

                    			newCompositeNode(grammarAccess.getModelRoleAccess().getPrescriptiveModelParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrescriptiveModel_2=rulePrescriptiveModel();

                    state._fsp--;


                    			current = this_PrescriptiveModel_2;
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
    // $ANTLR end "ruleModelRole"


    // $ANTLR start "entryRuleSocioTechnicalSystem"
    // InternalModa.g:391:1: entryRuleSocioTechnicalSystem returns [EObject current=null] : iv_ruleSocioTechnicalSystem= ruleSocioTechnicalSystem EOF ;
    public final EObject entryRuleSocioTechnicalSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSocioTechnicalSystem = null;


        try {
            // InternalModa.g:391:61: (iv_ruleSocioTechnicalSystem= ruleSocioTechnicalSystem EOF )
            // InternalModa.g:392:2: iv_ruleSocioTechnicalSystem= ruleSocioTechnicalSystem EOF
            {
             newCompositeNode(grammarAccess.getSocioTechnicalSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSocioTechnicalSystem=ruleSocioTechnicalSystem();

            state._fsp--;

             current =iv_ruleSocioTechnicalSystem; 
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
    // $ANTLR end "entryRuleSocioTechnicalSystem"


    // $ANTLR start "ruleSocioTechnicalSystem"
    // InternalModa.g:398:1: ruleSocioTechnicalSystem returns [EObject current=null] : ( () otherlv_1= 'SocioTechnicalSystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'prescriptivemodel' ( ( ruleEString ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleSocioTechnicalSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalModa.g:404:2: ( ( () otherlv_1= 'SocioTechnicalSystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'prescriptivemodel' ( ( ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalModa.g:405:2: ( () otherlv_1= 'SocioTechnicalSystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'prescriptivemodel' ( ( ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalModa.g:405:2: ( () otherlv_1= 'SocioTechnicalSystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'prescriptivemodel' ( ( ruleEString ) ) )? otherlv_12= '}' )
            // InternalModa.g:406:3: () otherlv_1= 'SocioTechnicalSystem' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'prescriptivemodel' ( ( ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalModa.g:406:3: ()
            // InternalModa.g:407:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSocioTechnicalSystemAccess().getSocioTechnicalSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSocioTechnicalSystemAccess().getSocioTechnicalSystemKeyword_1());
            		
            // InternalModa.g:417:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModa.g:418:4: (lv_name_2_0= ruleEString )
            {
            // InternalModa.g:418:4: (lv_name_2_0= ruleEString )
            // InternalModa.g:419:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSocioTechnicalSystemAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSocioTechnicalSystemRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"internship.fig1.Moda.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getSocioTechnicalSystemAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalModa.g:440:3: (otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalModa.g:441:4: otherlv_4= 'data' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getSocioTechnicalSystemAccess().getDataKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSocioTechnicalSystemAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalModa.g:449:4: ( ( ruleEString ) )
                    // InternalModa.g:450:5: ( ruleEString )
                    {
                    // InternalModa.g:450:5: ( ruleEString )
                    // InternalModa.g:451:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSocioTechnicalSystemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSocioTechnicalSystemAccess().getDataDataCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModa.g:465:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalModa.g:466:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getSocioTechnicalSystemAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalModa.g:470:5: ( ( ruleEString ) )
                    	    // InternalModa.g:471:6: ( ruleEString )
                    	    {
                    	    // InternalModa.g:471:6: ( ruleEString )
                    	    // InternalModa.g:472:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSocioTechnicalSystemRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSocioTechnicalSystemAccess().getDataDataCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,22,FOLLOW_20); 

                    				newLeafNode(otherlv_9, grammarAccess.getSocioTechnicalSystemAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalModa.g:492:3: (otherlv_10= 'prescriptivemodel' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalModa.g:493:4: otherlv_10= 'prescriptivemodel' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getSocioTechnicalSystemAccess().getPrescriptivemodelKeyword_5_0());
                    			
                    // InternalModa.g:497:4: ( ( ruleEString ) )
                    // InternalModa.g:498:5: ( ruleEString )
                    {
                    // InternalModa.g:498:5: ( ruleEString )
                    // InternalModa.g:499:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSocioTechnicalSystemRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSocioTechnicalSystemAccess().getPrescriptivemodelPrescriptiveModelCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getSocioTechnicalSystemAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSocioTechnicalSystem"


    // $ANTLR start "entryRuleData"
    // InternalModa.g:522:1: entryRuleData returns [EObject current=null] : iv_ruleData= ruleData EOF ;
    public final EObject entryRuleData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleData = null;


        try {
            // InternalModa.g:522:45: (iv_ruleData= ruleData EOF )
            // InternalModa.g:523:2: iv_ruleData= ruleData EOF
            {
             newCompositeNode(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleData=ruleData();

            state._fsp--;

             current =iv_ruleData; 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalModa.g:529:1: ruleData returns [EObject current=null] : ( () otherlv_1= 'Data' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( (lv_dataType_5_0= ruleDataTypes ) ) )? (otherlv_6= 'software' ( ( ruleEString ) ) )? (otherlv_8= 'sociotechnicalsystem' ( ( ruleEString ) ) )? (otherlv_10= 'modelrole' ( ( ruleEString ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleData() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_dataType_5_0 = null;



        	enterRule();

        try {
            // InternalModa.g:535:2: ( ( () otherlv_1= 'Data' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( (lv_dataType_5_0= ruleDataTypes ) ) )? (otherlv_6= 'software' ( ( ruleEString ) ) )? (otherlv_8= 'sociotechnicalsystem' ( ( ruleEString ) ) )? (otherlv_10= 'modelrole' ( ( ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalModa.g:536:2: ( () otherlv_1= 'Data' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( (lv_dataType_5_0= ruleDataTypes ) ) )? (otherlv_6= 'software' ( ( ruleEString ) ) )? (otherlv_8= 'sociotechnicalsystem' ( ( ruleEString ) ) )? (otherlv_10= 'modelrole' ( ( ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalModa.g:536:2: ( () otherlv_1= 'Data' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( (lv_dataType_5_0= ruleDataTypes ) ) )? (otherlv_6= 'software' ( ( ruleEString ) ) )? (otherlv_8= 'sociotechnicalsystem' ( ( ruleEString ) ) )? (otherlv_10= 'modelrole' ( ( ruleEString ) ) )? otherlv_12= '}' )
            // InternalModa.g:537:3: () otherlv_1= 'Data' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'dataType' ( (lv_dataType_5_0= ruleDataTypes ) ) )? (otherlv_6= 'software' ( ( ruleEString ) ) )? (otherlv_8= 'sociotechnicalsystem' ( ( ruleEString ) ) )? (otherlv_10= 'modelrole' ( ( ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalModa.g:537:3: ()
            // InternalModa.g:538:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataAccess().getDataAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDataAccess().getDataKeyword_1());
            		
            // InternalModa.g:548:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModa.g:549:4: (lv_name_2_0= ruleEString )
            {
            // InternalModa.g:549:4: (lv_name_2_0= ruleEString )
            // InternalModa.g:550:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"internship.fig1.Moda.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalModa.g:571:3: (otherlv_4= 'dataType' ( (lv_dataType_5_0= ruleDataTypes ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalModa.g:572:4: otherlv_4= 'dataType' ( (lv_dataType_5_0= ruleDataTypes ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getDataAccess().getDataTypeKeyword_4_0());
                    			
                    // InternalModa.g:576:4: ( (lv_dataType_5_0= ruleDataTypes ) )
                    // InternalModa.g:577:5: (lv_dataType_5_0= ruleDataTypes )
                    {
                    // InternalModa.g:577:5: (lv_dataType_5_0= ruleDataTypes )
                    // InternalModa.g:578:6: lv_dataType_5_0= ruleDataTypes
                    {

                    						newCompositeNode(grammarAccess.getDataAccess().getDataTypeDataTypesEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_dataType_5_0=ruleDataTypes();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataRule());
                    						}
                    						set(
                    							current,
                    							"dataType",
                    							lv_dataType_5_0,
                    							"internship.fig1.Moda.DataTypes");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModa.g:596:3: (otherlv_6= 'software' ( ( ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalModa.g:597:4: otherlv_6= 'software' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getDataAccess().getSoftwareKeyword_5_0());
                    			
                    // InternalModa.g:601:4: ( ( ruleEString ) )
                    // InternalModa.g:602:5: ( ruleEString )
                    {
                    // InternalModa.g:602:5: ( ruleEString )
                    // InternalModa.g:603:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDataAccess().getSoftwareSoftwareCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModa.g:618:3: (otherlv_8= 'sociotechnicalsystem' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalModa.g:619:4: otherlv_8= 'sociotechnicalsystem' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getDataAccess().getSociotechnicalsystemKeyword_6_0());
                    			
                    // InternalModa.g:623:4: ( ( ruleEString ) )
                    // InternalModa.g:624:5: ( ruleEString )
                    {
                    // InternalModa.g:624:5: ( ruleEString )
                    // InternalModa.g:625:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDataAccess().getSociotechnicalsystemSocioTechnicalSystemCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModa.g:640:3: (otherlv_10= 'modelrole' ( ( ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalModa.g:641:4: otherlv_10= 'modelrole' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getDataAccess().getModelroleKeyword_7_0());
                    			
                    // InternalModa.g:645:4: ( ( ruleEString ) )
                    // InternalModa.g:646:5: ( ruleEString )
                    {
                    // InternalModa.g:646:5: ( ruleEString )
                    // InternalModa.g:647:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDataAccess().getModelroleModelRoleCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getDataAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleSoftware"
    // InternalModa.g:670:1: entryRuleSoftware returns [EObject current=null] : iv_ruleSoftware= ruleSoftware EOF ;
    public final EObject entryRuleSoftware() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftware = null;


        try {
            // InternalModa.g:670:49: (iv_ruleSoftware= ruleSoftware EOF )
            // InternalModa.g:671:2: iv_ruleSoftware= ruleSoftware EOF
            {
             newCompositeNode(grammarAccess.getSoftwareRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSoftware=ruleSoftware();

            state._fsp--;

             current =iv_ruleSoftware; 
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
    // $ANTLR end "entryRuleSoftware"


    // $ANTLR start "ruleSoftware"
    // InternalModa.g:677:1: ruleSoftware returns [EObject current=null] : ( () otherlv_1= 'Software' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'data' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'prescriptivemodel' ( ( ruleEString ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleSoftware() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_state_5_0 = null;



        	enterRule();

        try {
            // InternalModa.g:683:2: ( ( () otherlv_1= 'Software' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'data' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'prescriptivemodel' ( ( ruleEString ) ) )? otherlv_14= '}' ) )
            // InternalModa.g:684:2: ( () otherlv_1= 'Software' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'data' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'prescriptivemodel' ( ( ruleEString ) ) )? otherlv_14= '}' )
            {
            // InternalModa.g:684:2: ( () otherlv_1= 'Software' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'data' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'prescriptivemodel' ( ( ruleEString ) ) )? otherlv_14= '}' )
            // InternalModa.g:685:3: () otherlv_1= 'Software' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )? (otherlv_6= 'data' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'prescriptivemodel' ( ( ruleEString ) ) )? otherlv_14= '}'
            {
            // InternalModa.g:685:3: ()
            // InternalModa.g:686:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSoftwareAccess().getSoftwareAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSoftwareAccess().getSoftwareKeyword_1());
            		
            // InternalModa.g:696:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModa.g:697:4: (lv_name_2_0= ruleEString )
            {
            // InternalModa.g:697:4: (lv_name_2_0= ruleEString )
            // InternalModa.g:698:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSoftwareAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSoftwareRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"internship.fig1.Moda.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getSoftwareAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalModa.g:719:3: (otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalModa.g:720:4: otherlv_4= 'state' ( (lv_state_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getSoftwareAccess().getStateKeyword_4_0());
                    			
                    // InternalModa.g:724:4: ( (lv_state_5_0= ruleEString ) )
                    // InternalModa.g:725:5: (lv_state_5_0= ruleEString )
                    {
                    // InternalModa.g:725:5: (lv_state_5_0= ruleEString )
                    // InternalModa.g:726:6: lv_state_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSoftwareAccess().getStateEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_state_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSoftwareRule());
                    						}
                    						set(
                    							current,
                    							"state",
                    							lv_state_5_0,
                    							"internship.fig1.Moda.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModa.g:744:3: (otherlv_6= 'data' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==14) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalModa.g:745:4: otherlv_6= 'data' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getSoftwareAccess().getDataKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getSoftwareAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalModa.g:753:4: ( ( ruleEString ) )
                    // InternalModa.g:754:5: ( ruleEString )
                    {
                    // InternalModa.g:754:5: ( ruleEString )
                    // InternalModa.g:755:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSoftwareRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSoftwareAccess().getDataDataCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModa.g:769:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==15) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalModa.g:770:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getSoftwareAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalModa.g:774:5: ( ( ruleEString ) )
                    	    // InternalModa.g:775:6: ( ruleEString )
                    	    {
                    	    // InternalModa.g:775:6: ( ruleEString )
                    	    // InternalModa.g:776:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getSoftwareRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getSoftwareAccess().getDataDataCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,22,FOLLOW_20); 

                    				newLeafNode(otherlv_11, grammarAccess.getSoftwareAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalModa.g:796:3: (otherlv_12= 'prescriptivemodel' ( ( ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalModa.g:797:4: otherlv_12= 'prescriptivemodel' ( ( ruleEString ) )
                    {
                    otherlv_12=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getSoftwareAccess().getPrescriptivemodelKeyword_6_0());
                    			
                    // InternalModa.g:801:4: ( ( ruleEString ) )
                    // InternalModa.g:802:5: ( ruleEString )
                    {
                    // InternalModa.g:802:5: ( ruleEString )
                    // InternalModa.g:803:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSoftwareRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSoftwareAccess().getPrescriptivemodelPrescriptiveModelCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getSoftwareAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleSoftware"


    // $ANTLR start "entryRuleEString"
    // InternalModa.g:826:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalModa.g:826:47: (iv_ruleEString= ruleEString EOF )
            // InternalModa.g:827:2: iv_ruleEString= ruleEString EOF
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
    // InternalModa.g:833:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalModa.g:839:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalModa.g:840:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalModa.g:840:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalModa.g:841:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalModa.g:849:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleModel"
    // InternalModa.g:860:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalModa.g:860:46: (iv_ruleModel= ruleModel EOF )
            // InternalModa.g:861:2: iv_ruleModel= ruleModel EOF
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
    // InternalModa.g:867:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'modelrole' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalModa.g:873:2: ( ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'modelrole' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' ) )
            // InternalModa.g:874:2: ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'modelrole' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            {
            // InternalModa.g:874:2: ( () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'modelrole' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}' )
            // InternalModa.g:875:3: () otherlv_1= 'Model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'modelrole' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? otherlv_10= '}'
            {
            // InternalModa.g:875:3: ()
            // InternalModa.g:876:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
            		
            // InternalModa.g:886:3: ( (lv_name_2_0= ruleEString ) )
            // InternalModa.g:887:4: (lv_name_2_0= ruleEString )
            {
            // InternalModa.g:887:4: (lv_name_2_0= ruleEString )
            // InternalModa.g:888:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"internship.fig1.Moda.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalModa.g:909:3: (otherlv_4= 'modelrole' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalModa.g:910:4: otherlv_4= 'modelrole' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getModelroleKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalModa.g:918:4: ( ( ruleEString ) )
                    // InternalModa.g:919:5: ( ruleEString )
                    {
                    // InternalModa.g:919:5: ( ruleEString )
                    // InternalModa.g:920:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getModelAccess().getModelroleModelRoleCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModa.g:934:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==15) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalModa.g:935:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalModa.g:939:5: ( ( ruleEString ) )
                    	    // InternalModa.g:940:6: ( ruleEString )
                    	    {
                    	    // InternalModa.g:940:6: ( ruleEString )
                    	    // InternalModa.g:941:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getModelRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getModelAccess().getModelroleModelRoleCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getModelAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePrescriptiveModel"
    // InternalModa.g:969:1: entryRulePrescriptiveModel returns [EObject current=null] : iv_rulePrescriptiveModel= rulePrescriptiveModel EOF ;
    public final EObject entryRulePrescriptiveModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrescriptiveModel = null;


        try {
            // InternalModa.g:969:58: (iv_rulePrescriptiveModel= rulePrescriptiveModel EOF )
            // InternalModa.g:970:2: iv_rulePrescriptiveModel= rulePrescriptiveModel EOF
            {
             newCompositeNode(grammarAccess.getPrescriptiveModelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrescriptiveModel=rulePrescriptiveModel();

            state._fsp--;

             current =iv_rulePrescriptiveModel; 
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
    // $ANTLR end "entryRulePrescriptiveModel"


    // $ANTLR start "rulePrescriptiveModel"
    // InternalModa.g:976:1: rulePrescriptiveModel returns [EObject current=null] : (otherlv_0= 'PrescriptiveModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( ( ruleEString ) ) (otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'software' ( ( ruleEString ) ) )? (otherlv_13= 'sociotechnicalsystem' ( ( ruleEString ) ) )? (otherlv_15= 'predictivemodel' ( ( ruleEString ) ) )? (otherlv_17= 'prescriptivemodel' ( ( ruleEString ) ) )? (otherlv_19= 'prescriptivemodeleOpposite' ( ( ruleEString ) ) )? otherlv_21= '}' ) ;
    public final EObject rulePrescriptiveModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalModa.g:982:2: ( (otherlv_0= 'PrescriptiveModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( ( ruleEString ) ) (otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'software' ( ( ruleEString ) ) )? (otherlv_13= 'sociotechnicalsystem' ( ( ruleEString ) ) )? (otherlv_15= 'predictivemodel' ( ( ruleEString ) ) )? (otherlv_17= 'prescriptivemodel' ( ( ruleEString ) ) )? (otherlv_19= 'prescriptivemodeleOpposite' ( ( ruleEString ) ) )? otherlv_21= '}' ) )
            // InternalModa.g:983:2: (otherlv_0= 'PrescriptiveModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( ( ruleEString ) ) (otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'software' ( ( ruleEString ) ) )? (otherlv_13= 'sociotechnicalsystem' ( ( ruleEString ) ) )? (otherlv_15= 'predictivemodel' ( ( ruleEString ) ) )? (otherlv_17= 'prescriptivemodel' ( ( ruleEString ) ) )? (otherlv_19= 'prescriptivemodeleOpposite' ( ( ruleEString ) ) )? otherlv_21= '}' )
            {
            // InternalModa.g:983:2: (otherlv_0= 'PrescriptiveModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( ( ruleEString ) ) (otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'software' ( ( ruleEString ) ) )? (otherlv_13= 'sociotechnicalsystem' ( ( ruleEString ) ) )? (otherlv_15= 'predictivemodel' ( ( ruleEString ) ) )? (otherlv_17= 'prescriptivemodel' ( ( ruleEString ) ) )? (otherlv_19= 'prescriptivemodeleOpposite' ( ( ruleEString ) ) )? otherlv_21= '}' )
            // InternalModa.g:984:3: otherlv_0= 'PrescriptiveModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( ( ruleEString ) ) (otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'software' ( ( ruleEString ) ) )? (otherlv_13= 'sociotechnicalsystem' ( ( ruleEString ) ) )? (otherlv_15= 'predictivemodel' ( ( ruleEString ) ) )? (otherlv_17= 'prescriptivemodel' ( ( ruleEString ) ) )? (otherlv_19= 'prescriptivemodeleOpposite' ( ( ruleEString ) ) )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPrescriptiveModelAccess().getPrescriptiveModelKeyword_0());
            		
            // InternalModa.g:988:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModa.g:989:4: (lv_name_1_0= ruleEString )
            {
            // InternalModa.g:989:4: (lv_name_1_0= ruleEString )
            // InternalModa.g:990:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrescriptiveModelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrescriptiveModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"internship.fig1.Moda.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getPrescriptiveModelAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPrescriptiveModelAccess().getModelKeyword_3());
            		
            // InternalModa.g:1015:3: ( ( ruleEString ) )
            // InternalModa.g:1016:4: ( ruleEString )
            {
            // InternalModa.g:1016:4: ( ruleEString )
            // InternalModa.g:1017:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrescriptiveModelRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPrescriptiveModelAccess().getModelModelCrossReference_4_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModa.g:1031:3: (otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==14) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalModa.g:1032:4: otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrescriptiveModelAccess().getDataKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getPrescriptiveModelAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalModa.g:1040:4: ( ( ruleEString ) )
                    // InternalModa.g:1041:5: ( ruleEString )
                    {
                    // InternalModa.g:1041:5: ( ruleEString )
                    // InternalModa.g:1042:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrescriptiveModelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPrescriptiveModelAccess().getDataDataCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModa.g:1056:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==15) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalModa.g:1057:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getPrescriptiveModelAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalModa.g:1061:5: ( ( ruleEString ) )
                    	    // InternalModa.g:1062:6: ( ruleEString )
                    	    {
                    	    // InternalModa.g:1062:6: ( ruleEString )
                    	    // InternalModa.g:1063:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPrescriptiveModelRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPrescriptiveModelAccess().getDataDataCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,22,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getPrescriptiveModelAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalModa.g:1083:3: (otherlv_11= 'software' ( ( ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==17) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalModa.g:1084:4: otherlv_11= 'software' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getPrescriptiveModelAccess().getSoftwareKeyword_6_0());
                    			
                    // InternalModa.g:1088:4: ( ( ruleEString ) )
                    // InternalModa.g:1089:5: ( ruleEString )
                    {
                    // InternalModa.g:1089:5: ( ruleEString )
                    // InternalModa.g:1090:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrescriptiveModelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPrescriptiveModelAccess().getSoftwareSoftwareCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModa.g:1105:3: (otherlv_13= 'sociotechnicalsystem' ( ( ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==13) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalModa.g:1106:4: otherlv_13= 'sociotechnicalsystem' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getPrescriptiveModelAccess().getSociotechnicalsystemKeyword_7_0());
                    			
                    // InternalModa.g:1110:4: ( ( ruleEString ) )
                    // InternalModa.g:1111:5: ( ruleEString )
                    {
                    // InternalModa.g:1111:5: ( ruleEString )
                    // InternalModa.g:1112:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrescriptiveModelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPrescriptiveModelAccess().getSociotechnicalsystemSocioTechnicalSystemCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModa.g:1127:3: (otherlv_15= 'predictivemodel' ( ( ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalModa.g:1128:4: otherlv_15= 'predictivemodel' ( ( ruleEString ) )
                    {
                    otherlv_15=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getPrescriptiveModelAccess().getPredictivemodelKeyword_8_0());
                    			
                    // InternalModa.g:1132:4: ( ( ruleEString ) )
                    // InternalModa.g:1133:5: ( ruleEString )
                    {
                    // InternalModa.g:1133:5: ( ruleEString )
                    // InternalModa.g:1134:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrescriptiveModelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPrescriptiveModelAccess().getPredictivemodelPredictiveModelCrossReference_8_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModa.g:1149:3: (otherlv_17= 'prescriptivemodel' ( ( ruleEString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalModa.g:1150:4: otherlv_17= 'prescriptivemodel' ( ( ruleEString ) )
                    {
                    otherlv_17=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getPrescriptiveModelAccess().getPrescriptivemodelKeyword_9_0());
                    			
                    // InternalModa.g:1154:4: ( ( ruleEString ) )
                    // InternalModa.g:1155:5: ( ruleEString )
                    {
                    // InternalModa.g:1155:5: ( ruleEString )
                    // InternalModa.g:1156:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrescriptiveModelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPrescriptiveModelAccess().getPrescriptivemodelPrescriptiveModelCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModa.g:1171:3: (otherlv_19= 'prescriptivemodeleOpposite' ( ( ruleEString ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalModa.g:1172:4: otherlv_19= 'prescriptivemodeleOpposite' ( ( ruleEString ) )
                    {
                    otherlv_19=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getPrescriptiveModelAccess().getPrescriptivemodeleOppositeKeyword_10_0());
                    			
                    // InternalModa.g:1176:4: ( ( ruleEString ) )
                    // InternalModa.g:1177:5: ( ruleEString )
                    {
                    // InternalModa.g:1177:5: ( ruleEString )
                    // InternalModa.g:1178:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrescriptiveModelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPrescriptiveModelAccess().getPrescriptivemodeleOppositePrescriptiveModelCrossReference_10_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_21=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getPrescriptiveModelAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "rulePrescriptiveModel"


    // $ANTLR start "entryRulePredictiveModel"
    // InternalModa.g:1201:1: entryRulePredictiveModel returns [EObject current=null] : iv_rulePredictiveModel= rulePredictiveModel EOF ;
    public final EObject entryRulePredictiveModel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredictiveModel = null;


        try {
            // InternalModa.g:1201:56: (iv_rulePredictiveModel= rulePredictiveModel EOF )
            // InternalModa.g:1202:2: iv_rulePredictiveModel= rulePredictiveModel EOF
            {
             newCompositeNode(grammarAccess.getPredictiveModelRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredictiveModel=rulePredictiveModel();

            state._fsp--;

             current =iv_rulePredictiveModel; 
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
    // $ANTLR end "entryRulePredictiveModel"


    // $ANTLR start "rulePredictiveModel"
    // InternalModa.g:1208:1: rulePredictiveModel returns [EObject current=null] : (otherlv_0= 'PredictiveModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( ( ruleEString ) ) (otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'prescriptivemodel' ( ( ruleEString ) ) )? (otherlv_13= 'descriptivemodel' ( ( ruleEString ) ) )? otherlv_15= '}' ) ;
    public final EObject rulePredictiveModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalModa.g:1214:2: ( (otherlv_0= 'PredictiveModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( ( ruleEString ) ) (otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'prescriptivemodel' ( ( ruleEString ) ) )? (otherlv_13= 'descriptivemodel' ( ( ruleEString ) ) )? otherlv_15= '}' ) )
            // InternalModa.g:1215:2: (otherlv_0= 'PredictiveModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( ( ruleEString ) ) (otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'prescriptivemodel' ( ( ruleEString ) ) )? (otherlv_13= 'descriptivemodel' ( ( ruleEString ) ) )? otherlv_15= '}' )
            {
            // InternalModa.g:1215:2: (otherlv_0= 'PredictiveModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( ( ruleEString ) ) (otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'prescriptivemodel' ( ( ruleEString ) ) )? (otherlv_13= 'descriptivemodel' ( ( ruleEString ) ) )? otherlv_15= '}' )
            // InternalModa.g:1216:3: otherlv_0= 'PredictiveModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( ( ruleEString ) ) (otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'prescriptivemodel' ( ( ruleEString ) ) )? (otherlv_13= 'descriptivemodel' ( ( ruleEString ) ) )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPredictiveModelAccess().getPredictiveModelKeyword_0());
            		
            // InternalModa.g:1220:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModa.g:1221:4: (lv_name_1_0= ruleEString )
            {
            // InternalModa.g:1221:4: (lv_name_1_0= ruleEString )
            // InternalModa.g:1222:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPredictiveModelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPredictiveModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"internship.fig1.Moda.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getPredictiveModelAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPredictiveModelAccess().getModelKeyword_3());
            		
            // InternalModa.g:1247:3: ( ( ruleEString ) )
            // InternalModa.g:1248:4: ( ruleEString )
            {
            // InternalModa.g:1248:4: ( ruleEString )
            // InternalModa.g:1249:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPredictiveModelRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPredictiveModelAccess().getModelModelCrossReference_4_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModa.g:1263:3: (otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==14) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalModa.g:1264:4: otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getPredictiveModelAccess().getDataKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getPredictiveModelAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalModa.g:1272:4: ( ( ruleEString ) )
                    // InternalModa.g:1273:5: ( ruleEString )
                    {
                    // InternalModa.g:1273:5: ( ruleEString )
                    // InternalModa.g:1274:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredictiveModelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPredictiveModelAccess().getDataDataCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModa.g:1288:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==15) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalModa.g:1289:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getPredictiveModelAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalModa.g:1293:5: ( ( ruleEString ) )
                    	    // InternalModa.g:1294:6: ( ruleEString )
                    	    {
                    	    // InternalModa.g:1294:6: ( ruleEString )
                    	    // InternalModa.g:1295:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPredictiveModelRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPredictiveModelAccess().getDataDataCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,22,FOLLOW_34); 

                    				newLeafNode(otherlv_10, grammarAccess.getPredictiveModelAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalModa.g:1315:3: (otherlv_11= 'prescriptivemodel' ( ( ruleEString ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==23) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalModa.g:1316:4: otherlv_11= 'prescriptivemodel' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getPredictiveModelAccess().getPrescriptivemodelKeyword_6_0());
                    			
                    // InternalModa.g:1320:4: ( ( ruleEString ) )
                    // InternalModa.g:1321:5: ( ruleEString )
                    {
                    // InternalModa.g:1321:5: ( ruleEString )
                    // InternalModa.g:1322:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredictiveModelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPredictiveModelAccess().getPrescriptivemodelPrescriptiveModelCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalModa.g:1337:3: (otherlv_13= 'descriptivemodel' ( ( ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalModa.g:1338:4: otherlv_13= 'descriptivemodel' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getPredictiveModelAccess().getDescriptivemodelKeyword_7_0());
                    			
                    // InternalModa.g:1342:4: ( ( ruleEString ) )
                    // InternalModa.g:1343:5: ( ruleEString )
                    {
                    // InternalModa.g:1343:5: ( ruleEString )
                    // InternalModa.g:1344:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredictiveModelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPredictiveModelAccess().getDescriptivemodelDescriptiveModelCrossReference_7_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getPredictiveModelAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "rulePredictiveModel"


    // $ANTLR start "entryRuleDescriptiveModel"
    // InternalModa.g:1367:1: entryRuleDescriptiveModel returns [EObject current=null] : iv_ruleDescriptiveModel= ruleDescriptiveModel EOF ;
    public final EObject entryRuleDescriptiveModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptiveModel = null;


        try {
            // InternalModa.g:1367:57: (iv_ruleDescriptiveModel= ruleDescriptiveModel EOF )
            // InternalModa.g:1368:2: iv_ruleDescriptiveModel= ruleDescriptiveModel EOF
            {
             newCompositeNode(grammarAccess.getDescriptiveModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescriptiveModel=ruleDescriptiveModel();

            state._fsp--;

             current =iv_ruleDescriptiveModel; 
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
    // $ANTLR end "entryRuleDescriptiveModel"


    // $ANTLR start "ruleDescriptiveModel"
    // InternalModa.g:1374:1: ruleDescriptiveModel returns [EObject current=null] : (otherlv_0= 'DescriptiveModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( ( ruleEString ) ) (otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'predictivemodel' ( ( ruleEString ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleDescriptiveModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalModa.g:1380:2: ( (otherlv_0= 'DescriptiveModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( ( ruleEString ) ) (otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'predictivemodel' ( ( ruleEString ) ) )? otherlv_13= '}' ) )
            // InternalModa.g:1381:2: (otherlv_0= 'DescriptiveModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( ( ruleEString ) ) (otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'predictivemodel' ( ( ruleEString ) ) )? otherlv_13= '}' )
            {
            // InternalModa.g:1381:2: (otherlv_0= 'DescriptiveModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( ( ruleEString ) ) (otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'predictivemodel' ( ( ruleEString ) ) )? otherlv_13= '}' )
            // InternalModa.g:1382:3: otherlv_0= 'DescriptiveModel' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'model' ( ( ruleEString ) ) (otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'predictivemodel' ( ( ruleEString ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDescriptiveModelAccess().getDescriptiveModelKeyword_0());
            		
            // InternalModa.g:1386:3: ( (lv_name_1_0= ruleEString ) )
            // InternalModa.g:1387:4: (lv_name_1_0= ruleEString )
            {
            // InternalModa.g:1387:4: (lv_name_1_0= ruleEString )
            // InternalModa.g:1388:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDescriptiveModelAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDescriptiveModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"internship.fig1.Moda.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getDescriptiveModelAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDescriptiveModelAccess().getModelKeyword_3());
            		
            // InternalModa.g:1413:3: ( ( ruleEString ) )
            // InternalModa.g:1414:4: ( ruleEString )
            {
            // InternalModa.g:1414:4: ( ruleEString )
            // InternalModa.g:1415:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDescriptiveModelRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDescriptiveModelAccess().getModelModelCrossReference_4_0());
            				
            pushFollow(FOLLOW_36);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalModa.g:1429:3: (otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==14) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalModa.g:1430:4: otherlv_5= 'data' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getDescriptiveModelAccess().getDataKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getDescriptiveModelAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalModa.g:1438:4: ( ( ruleEString ) )
                    // InternalModa.g:1439:5: ( ruleEString )
                    {
                    // InternalModa.g:1439:5: ( ruleEString )
                    // InternalModa.g:1440:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDescriptiveModelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDescriptiveModelAccess().getDataDataCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalModa.g:1454:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==15) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalModa.g:1455:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getDescriptiveModelAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalModa.g:1459:5: ( ( ruleEString ) )
                    	    // InternalModa.g:1460:6: ( ruleEString )
                    	    {
                    	    // InternalModa.g:1460:6: ( ruleEString )
                    	    // InternalModa.g:1461:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDescriptiveModelRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDescriptiveModelAccess().getDataDataCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,22,FOLLOW_37); 

                    				newLeafNode(otherlv_10, grammarAccess.getDescriptiveModelAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalModa.g:1481:3: (otherlv_11= 'predictivemodel' ( ( ruleEString ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==30) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalModa.g:1482:4: otherlv_11= 'predictivemodel' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getDescriptiveModelAccess().getPredictivemodelKeyword_6_0());
                    			
                    // InternalModa.g:1486:4: ( ( ruleEString ) )
                    // InternalModa.g:1487:5: ( ruleEString )
                    {
                    // InternalModa.g:1487:5: ( ruleEString )
                    // InternalModa.g:1488:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDescriptiveModelRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDescriptiveModelAccess().getPredictivemodelPredictiveModelCrossReference_6_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getDescriptiveModelAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleDescriptiveModel"


    // $ANTLR start "ruleDataTypes"
    // InternalModa.g:1511:1: ruleDataTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'InputData' ) | (enumLiteral_1= 'OutputData' ) | (enumLiteral_2= 'ExternalData' ) | (enumLiteral_3= 'MeasuredData' ) ) ;
    public final Enumerator ruleDataTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalModa.g:1517:2: ( ( (enumLiteral_0= 'InputData' ) | (enumLiteral_1= 'OutputData' ) | (enumLiteral_2= 'ExternalData' ) | (enumLiteral_3= 'MeasuredData' ) ) )
            // InternalModa.g:1518:2: ( (enumLiteral_0= 'InputData' ) | (enumLiteral_1= 'OutputData' ) | (enumLiteral_2= 'ExternalData' ) | (enumLiteral_3= 'MeasuredData' ) )
            {
            // InternalModa.g:1518:2: ( (enumLiteral_0= 'InputData' ) | (enumLiteral_1= 'OutputData' ) | (enumLiteral_2= 'ExternalData' ) | (enumLiteral_3= 'MeasuredData' ) )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt38=1;
                }
                break;
            case 36:
                {
                alt38=2;
                }
                break;
            case 37:
                {
                alt38=3;
                }
                break;
            case 38:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalModa.g:1519:3: (enumLiteral_0= 'InputData' )
                    {
                    // InternalModa.g:1519:3: (enumLiteral_0= 'InputData' )
                    // InternalModa.g:1520:4: enumLiteral_0= 'InputData'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getDataTypesAccess().getInputDataEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypesAccess().getInputDataEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalModa.g:1527:3: (enumLiteral_1= 'OutputData' )
                    {
                    // InternalModa.g:1527:3: (enumLiteral_1= 'OutputData' )
                    // InternalModa.g:1528:4: enumLiteral_1= 'OutputData'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDataTypesAccess().getOutputDataEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypesAccess().getOutputDataEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalModa.g:1535:3: (enumLiteral_2= 'ExternalData' )
                    {
                    // InternalModa.g:1535:3: (enumLiteral_2= 'ExternalData' )
                    // InternalModa.g:1536:4: enumLiteral_2= 'ExternalData'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDataTypesAccess().getExternalDataEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypesAccess().getExternalDataEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalModa.g:1543:3: (enumLiteral_3= 'MeasuredData' )
                    {
                    // InternalModa.g:1543:3: (enumLiteral_3= 'MeasuredData' )
                    // InternalModa.g:1544:4: enumLiteral_3= 'MeasuredData'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getDataTypesAccess().getMeasuredDataEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypesAccess().getMeasuredDataEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleDataTypes"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000F6000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000F4000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000D0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000520000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000814000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000000020B2000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000007800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000000B2000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000092000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008814000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000C0836000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000C0832000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000C0812000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000C0810000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080810000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000200814000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200810000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000040014000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000040010000L});

}