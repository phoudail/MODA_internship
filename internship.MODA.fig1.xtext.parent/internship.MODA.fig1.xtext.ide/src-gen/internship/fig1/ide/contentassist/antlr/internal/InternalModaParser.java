package internship.fig1.ide.contentassist.antlr.internal;

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
import internship.fig1.services.ModaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'InputData'", "'OutputData'", "'ExternalData'", "'MeasuredData'", "'MODA'", "'{'", "'}'", "'sociotechnicalsystem'", "'data'", "','", "'software'", "'model'", "'modelrole'", "'SocioTechnicalSystem'", "'('", "')'", "'prescriptivemodel'", "'Data'", "'dataType'", "'Software'", "'state'", "'Model'", "'PrescriptiveModel'", "'predictivemodel'", "'prescriptivemodeleOpposite'", "'PredictiveModel'", "'descriptivemodel'", "'DescriptiveModel'"
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

    	public void setGrammarAccess(ModaGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMODA"
    // InternalModa.g:53:1: entryRuleMODA : ruleMODA EOF ;
    public final void entryRuleMODA() throws RecognitionException {
        try {
            // InternalModa.g:54:1: ( ruleMODA EOF )
            // InternalModa.g:55:1: ruleMODA EOF
            {
             before(grammarAccess.getMODARule()); 
            pushFollow(FOLLOW_1);
            ruleMODA();

            state._fsp--;

             after(grammarAccess.getMODARule()); 
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
    // $ANTLR end "entryRuleMODA"


    // $ANTLR start "ruleMODA"
    // InternalModa.g:62:1: ruleMODA : ( ( rule__MODA__Group__0 ) ) ;
    public final void ruleMODA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:66:2: ( ( ( rule__MODA__Group__0 ) ) )
            // InternalModa.g:67:2: ( ( rule__MODA__Group__0 ) )
            {
            // InternalModa.g:67:2: ( ( rule__MODA__Group__0 ) )
            // InternalModa.g:68:3: ( rule__MODA__Group__0 )
            {
             before(grammarAccess.getMODAAccess().getGroup()); 
            // InternalModa.g:69:3: ( rule__MODA__Group__0 )
            // InternalModa.g:69:4: rule__MODA__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MODA__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMODAAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMODA"


    // $ANTLR start "entryRuleModelRole"
    // InternalModa.g:78:1: entryRuleModelRole : ruleModelRole EOF ;
    public final void entryRuleModelRole() throws RecognitionException {
        try {
            // InternalModa.g:79:1: ( ruleModelRole EOF )
            // InternalModa.g:80:1: ruleModelRole EOF
            {
             before(grammarAccess.getModelRoleRule()); 
            pushFollow(FOLLOW_1);
            ruleModelRole();

            state._fsp--;

             after(grammarAccess.getModelRoleRule()); 
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
    // $ANTLR end "entryRuleModelRole"


    // $ANTLR start "ruleModelRole"
    // InternalModa.g:87:1: ruleModelRole : ( ( rule__ModelRole__Alternatives ) ) ;
    public final void ruleModelRole() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:91:2: ( ( ( rule__ModelRole__Alternatives ) ) )
            // InternalModa.g:92:2: ( ( rule__ModelRole__Alternatives ) )
            {
            // InternalModa.g:92:2: ( ( rule__ModelRole__Alternatives ) )
            // InternalModa.g:93:3: ( rule__ModelRole__Alternatives )
            {
             before(grammarAccess.getModelRoleAccess().getAlternatives()); 
            // InternalModa.g:94:3: ( rule__ModelRole__Alternatives )
            // InternalModa.g:94:4: rule__ModelRole__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ModelRole__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelRoleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelRole"


    // $ANTLR start "entryRuleSocioTechnicalSystem"
    // InternalModa.g:103:1: entryRuleSocioTechnicalSystem : ruleSocioTechnicalSystem EOF ;
    public final void entryRuleSocioTechnicalSystem() throws RecognitionException {
        try {
            // InternalModa.g:104:1: ( ruleSocioTechnicalSystem EOF )
            // InternalModa.g:105:1: ruleSocioTechnicalSystem EOF
            {
             before(grammarAccess.getSocioTechnicalSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleSocioTechnicalSystem();

            state._fsp--;

             after(grammarAccess.getSocioTechnicalSystemRule()); 
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
    // $ANTLR end "entryRuleSocioTechnicalSystem"


    // $ANTLR start "ruleSocioTechnicalSystem"
    // InternalModa.g:112:1: ruleSocioTechnicalSystem : ( ( rule__SocioTechnicalSystem__Group__0 ) ) ;
    public final void ruleSocioTechnicalSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:116:2: ( ( ( rule__SocioTechnicalSystem__Group__0 ) ) )
            // InternalModa.g:117:2: ( ( rule__SocioTechnicalSystem__Group__0 ) )
            {
            // InternalModa.g:117:2: ( ( rule__SocioTechnicalSystem__Group__0 ) )
            // InternalModa.g:118:3: ( rule__SocioTechnicalSystem__Group__0 )
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getGroup()); 
            // InternalModa.g:119:3: ( rule__SocioTechnicalSystem__Group__0 )
            // InternalModa.g:119:4: rule__SocioTechnicalSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSocioTechnicalSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSocioTechnicalSystem"


    // $ANTLR start "entryRuleData"
    // InternalModa.g:128:1: entryRuleData : ruleData EOF ;
    public final void entryRuleData() throws RecognitionException {
        try {
            // InternalModa.g:129:1: ( ruleData EOF )
            // InternalModa.g:130:1: ruleData EOF
            {
             before(grammarAccess.getDataRule()); 
            pushFollow(FOLLOW_1);
            ruleData();

            state._fsp--;

             after(grammarAccess.getDataRule()); 
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
    // $ANTLR end "entryRuleData"


    // $ANTLR start "ruleData"
    // InternalModa.g:137:1: ruleData : ( ( rule__Data__Group__0 ) ) ;
    public final void ruleData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:141:2: ( ( ( rule__Data__Group__0 ) ) )
            // InternalModa.g:142:2: ( ( rule__Data__Group__0 ) )
            {
            // InternalModa.g:142:2: ( ( rule__Data__Group__0 ) )
            // InternalModa.g:143:3: ( rule__Data__Group__0 )
            {
             before(grammarAccess.getDataAccess().getGroup()); 
            // InternalModa.g:144:3: ( rule__Data__Group__0 )
            // InternalModa.g:144:4: rule__Data__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleData"


    // $ANTLR start "entryRuleSoftware"
    // InternalModa.g:153:1: entryRuleSoftware : ruleSoftware EOF ;
    public final void entryRuleSoftware() throws RecognitionException {
        try {
            // InternalModa.g:154:1: ( ruleSoftware EOF )
            // InternalModa.g:155:1: ruleSoftware EOF
            {
             before(grammarAccess.getSoftwareRule()); 
            pushFollow(FOLLOW_1);
            ruleSoftware();

            state._fsp--;

             after(grammarAccess.getSoftwareRule()); 
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
    // $ANTLR end "entryRuleSoftware"


    // $ANTLR start "ruleSoftware"
    // InternalModa.g:162:1: ruleSoftware : ( ( rule__Software__Group__0 ) ) ;
    public final void ruleSoftware() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:166:2: ( ( ( rule__Software__Group__0 ) ) )
            // InternalModa.g:167:2: ( ( rule__Software__Group__0 ) )
            {
            // InternalModa.g:167:2: ( ( rule__Software__Group__0 ) )
            // InternalModa.g:168:3: ( rule__Software__Group__0 )
            {
             before(grammarAccess.getSoftwareAccess().getGroup()); 
            // InternalModa.g:169:3: ( rule__Software__Group__0 )
            // InternalModa.g:169:4: rule__Software__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Software__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSoftwareAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSoftware"


    // $ANTLR start "entryRuleEString"
    // InternalModa.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalModa.g:179:1: ( ruleEString EOF )
            // InternalModa.g:180:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalModa.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalModa.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalModa.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalModa.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalModa.g:194:3: ( rule__EString__Alternatives )
            // InternalModa.g:194:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleModel"
    // InternalModa.g:203:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalModa.g:204:1: ( ruleModel EOF )
            // InternalModa.g:205:1: ruleModel EOF
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
    // InternalModa.g:212:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:216:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalModa.g:217:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalModa.g:217:2: ( ( rule__Model__Group__0 ) )
            // InternalModa.g:218:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalModa.g:219:3: ( rule__Model__Group__0 )
            // InternalModa.g:219:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePrescriptiveModel"
    // InternalModa.g:228:1: entryRulePrescriptiveModel : rulePrescriptiveModel EOF ;
    public final void entryRulePrescriptiveModel() throws RecognitionException {
        try {
            // InternalModa.g:229:1: ( rulePrescriptiveModel EOF )
            // InternalModa.g:230:1: rulePrescriptiveModel EOF
            {
             before(grammarAccess.getPrescriptiveModelRule()); 
            pushFollow(FOLLOW_1);
            rulePrescriptiveModel();

            state._fsp--;

             after(grammarAccess.getPrescriptiveModelRule()); 
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
    // $ANTLR end "entryRulePrescriptiveModel"


    // $ANTLR start "rulePrescriptiveModel"
    // InternalModa.g:237:1: rulePrescriptiveModel : ( ( rule__PrescriptiveModel__Group__0 ) ) ;
    public final void rulePrescriptiveModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:241:2: ( ( ( rule__PrescriptiveModel__Group__0 ) ) )
            // InternalModa.g:242:2: ( ( rule__PrescriptiveModel__Group__0 ) )
            {
            // InternalModa.g:242:2: ( ( rule__PrescriptiveModel__Group__0 ) )
            // InternalModa.g:243:3: ( rule__PrescriptiveModel__Group__0 )
            {
             before(grammarAccess.getPrescriptiveModelAccess().getGroup()); 
            // InternalModa.g:244:3: ( rule__PrescriptiveModel__Group__0 )
            // InternalModa.g:244:4: rule__PrescriptiveModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrescriptiveModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrescriptiveModel"


    // $ANTLR start "entryRulePredictiveModel"
    // InternalModa.g:253:1: entryRulePredictiveModel : rulePredictiveModel EOF ;
    public final void entryRulePredictiveModel() throws RecognitionException {
        try {
            // InternalModa.g:254:1: ( rulePredictiveModel EOF )
            // InternalModa.g:255:1: rulePredictiveModel EOF
            {
             before(grammarAccess.getPredictiveModelRule()); 
            pushFollow(FOLLOW_1);
            rulePredictiveModel();

            state._fsp--;

             after(grammarAccess.getPredictiveModelRule()); 
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
    // $ANTLR end "entryRulePredictiveModel"


    // $ANTLR start "rulePredictiveModel"
    // InternalModa.g:262:1: rulePredictiveModel : ( ( rule__PredictiveModel__Group__0 ) ) ;
    public final void rulePredictiveModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:266:2: ( ( ( rule__PredictiveModel__Group__0 ) ) )
            // InternalModa.g:267:2: ( ( rule__PredictiveModel__Group__0 ) )
            {
            // InternalModa.g:267:2: ( ( rule__PredictiveModel__Group__0 ) )
            // InternalModa.g:268:3: ( rule__PredictiveModel__Group__0 )
            {
             before(grammarAccess.getPredictiveModelAccess().getGroup()); 
            // InternalModa.g:269:3: ( rule__PredictiveModel__Group__0 )
            // InternalModa.g:269:4: rule__PredictiveModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredictiveModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredictiveModel"


    // $ANTLR start "entryRuleDescriptiveModel"
    // InternalModa.g:278:1: entryRuleDescriptiveModel : ruleDescriptiveModel EOF ;
    public final void entryRuleDescriptiveModel() throws RecognitionException {
        try {
            // InternalModa.g:279:1: ( ruleDescriptiveModel EOF )
            // InternalModa.g:280:1: ruleDescriptiveModel EOF
            {
             before(grammarAccess.getDescriptiveModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDescriptiveModel();

            state._fsp--;

             after(grammarAccess.getDescriptiveModelRule()); 
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
    // $ANTLR end "entryRuleDescriptiveModel"


    // $ANTLR start "ruleDescriptiveModel"
    // InternalModa.g:287:1: ruleDescriptiveModel : ( ( rule__DescriptiveModel__Group__0 ) ) ;
    public final void ruleDescriptiveModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:291:2: ( ( ( rule__DescriptiveModel__Group__0 ) ) )
            // InternalModa.g:292:2: ( ( rule__DescriptiveModel__Group__0 ) )
            {
            // InternalModa.g:292:2: ( ( rule__DescriptiveModel__Group__0 ) )
            // InternalModa.g:293:3: ( rule__DescriptiveModel__Group__0 )
            {
             before(grammarAccess.getDescriptiveModelAccess().getGroup()); 
            // InternalModa.g:294:3: ( rule__DescriptiveModel__Group__0 )
            // InternalModa.g:294:4: rule__DescriptiveModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDescriptiveModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescriptiveModel"


    // $ANTLR start "ruleDataTypes"
    // InternalModa.g:303:1: ruleDataTypes : ( ( rule__DataTypes__Alternatives ) ) ;
    public final void ruleDataTypes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:307:1: ( ( ( rule__DataTypes__Alternatives ) ) )
            // InternalModa.g:308:2: ( ( rule__DataTypes__Alternatives ) )
            {
            // InternalModa.g:308:2: ( ( rule__DataTypes__Alternatives ) )
            // InternalModa.g:309:3: ( rule__DataTypes__Alternatives )
            {
             before(grammarAccess.getDataTypesAccess().getAlternatives()); 
            // InternalModa.g:310:3: ( rule__DataTypes__Alternatives )
            // InternalModa.g:310:4: rule__DataTypes__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataTypes__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataTypes"


    // $ANTLR start "rule__ModelRole__Alternatives"
    // InternalModa.g:318:1: rule__ModelRole__Alternatives : ( ( ruleDescriptiveModel ) | ( rulePredictiveModel ) | ( rulePrescriptiveModel ) );
    public final void rule__ModelRole__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:322:1: ( ( ruleDescriptiveModel ) | ( rulePredictiveModel ) | ( rulePrescriptiveModel ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt1=1;
                }
                break;
            case 36:
                {
                alt1=2;
                }
                break;
            case 33:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalModa.g:323:2: ( ruleDescriptiveModel )
                    {
                    // InternalModa.g:323:2: ( ruleDescriptiveModel )
                    // InternalModa.g:324:3: ruleDescriptiveModel
                    {
                     before(grammarAccess.getModelRoleAccess().getDescriptiveModelParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDescriptiveModel();

                    state._fsp--;

                     after(grammarAccess.getModelRoleAccess().getDescriptiveModelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModa.g:329:2: ( rulePredictiveModel )
                    {
                    // InternalModa.g:329:2: ( rulePredictiveModel )
                    // InternalModa.g:330:3: rulePredictiveModel
                    {
                     before(grammarAccess.getModelRoleAccess().getPredictiveModelParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePredictiveModel();

                    state._fsp--;

                     after(grammarAccess.getModelRoleAccess().getPredictiveModelParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalModa.g:335:2: ( rulePrescriptiveModel )
                    {
                    // InternalModa.g:335:2: ( rulePrescriptiveModel )
                    // InternalModa.g:336:3: rulePrescriptiveModel
                    {
                     before(grammarAccess.getModelRoleAccess().getPrescriptiveModelParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePrescriptiveModel();

                    state._fsp--;

                     after(grammarAccess.getModelRoleAccess().getPrescriptiveModelParserRuleCall_2()); 

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
    // $ANTLR end "rule__ModelRole__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalModa.g:345:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:349:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalModa.g:350:2: ( RULE_STRING )
                    {
                    // InternalModa.g:350:2: ( RULE_STRING )
                    // InternalModa.g:351:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModa.g:356:2: ( RULE_ID )
                    {
                    // InternalModa.g:356:2: ( RULE_ID )
                    // InternalModa.g:357:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__DataTypes__Alternatives"
    // InternalModa.g:366:1: rule__DataTypes__Alternatives : ( ( ( 'InputData' ) ) | ( ( 'OutputData' ) ) | ( ( 'ExternalData' ) ) | ( ( 'MeasuredData' ) ) );
    public final void rule__DataTypes__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:370:1: ( ( ( 'InputData' ) ) | ( ( 'OutputData' ) ) | ( ( 'ExternalData' ) ) | ( ( 'MeasuredData' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
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
                    // InternalModa.g:371:2: ( ( 'InputData' ) )
                    {
                    // InternalModa.g:371:2: ( ( 'InputData' ) )
                    // InternalModa.g:372:3: ( 'InputData' )
                    {
                     before(grammarAccess.getDataTypesAccess().getInputDataEnumLiteralDeclaration_0()); 
                    // InternalModa.g:373:3: ( 'InputData' )
                    // InternalModa.g:373:4: 'InputData'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypesAccess().getInputDataEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalModa.g:377:2: ( ( 'OutputData' ) )
                    {
                    // InternalModa.g:377:2: ( ( 'OutputData' ) )
                    // InternalModa.g:378:3: ( 'OutputData' )
                    {
                     before(grammarAccess.getDataTypesAccess().getOutputDataEnumLiteralDeclaration_1()); 
                    // InternalModa.g:379:3: ( 'OutputData' )
                    // InternalModa.g:379:4: 'OutputData'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypesAccess().getOutputDataEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalModa.g:383:2: ( ( 'ExternalData' ) )
                    {
                    // InternalModa.g:383:2: ( ( 'ExternalData' ) )
                    // InternalModa.g:384:3: ( 'ExternalData' )
                    {
                     before(grammarAccess.getDataTypesAccess().getExternalDataEnumLiteralDeclaration_2()); 
                    // InternalModa.g:385:3: ( 'ExternalData' )
                    // InternalModa.g:385:4: 'ExternalData'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypesAccess().getExternalDataEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalModa.g:389:2: ( ( 'MeasuredData' ) )
                    {
                    // InternalModa.g:389:2: ( ( 'MeasuredData' ) )
                    // InternalModa.g:390:3: ( 'MeasuredData' )
                    {
                     before(grammarAccess.getDataTypesAccess().getMeasuredDataEnumLiteralDeclaration_3()); 
                    // InternalModa.g:391:3: ( 'MeasuredData' )
                    // InternalModa.g:391:4: 'MeasuredData'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataTypesAccess().getMeasuredDataEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__DataTypes__Alternatives"


    // $ANTLR start "rule__MODA__Group__0"
    // InternalModa.g:399:1: rule__MODA__Group__0 : rule__MODA__Group__0__Impl rule__MODA__Group__1 ;
    public final void rule__MODA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:403:1: ( rule__MODA__Group__0__Impl rule__MODA__Group__1 )
            // InternalModa.g:404:2: rule__MODA__Group__0__Impl rule__MODA__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MODA__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group__1();

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
    // $ANTLR end "rule__MODA__Group__0"


    // $ANTLR start "rule__MODA__Group__0__Impl"
    // InternalModa.g:411:1: rule__MODA__Group__0__Impl : ( () ) ;
    public final void rule__MODA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:415:1: ( ( () ) )
            // InternalModa.g:416:1: ( () )
            {
            // InternalModa.g:416:1: ( () )
            // InternalModa.g:417:2: ()
            {
             before(grammarAccess.getMODAAccess().getMODAAction_0()); 
            // InternalModa.g:418:2: ()
            // InternalModa.g:418:3: 
            {
            }

             after(grammarAccess.getMODAAccess().getMODAAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group__0__Impl"


    // $ANTLR start "rule__MODA__Group__1"
    // InternalModa.g:426:1: rule__MODA__Group__1 : rule__MODA__Group__1__Impl rule__MODA__Group__2 ;
    public final void rule__MODA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:430:1: ( rule__MODA__Group__1__Impl rule__MODA__Group__2 )
            // InternalModa.g:431:2: rule__MODA__Group__1__Impl rule__MODA__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MODA__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group__2();

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
    // $ANTLR end "rule__MODA__Group__1"


    // $ANTLR start "rule__MODA__Group__1__Impl"
    // InternalModa.g:438:1: rule__MODA__Group__1__Impl : ( 'MODA' ) ;
    public final void rule__MODA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:442:1: ( ( 'MODA' ) )
            // InternalModa.g:443:1: ( 'MODA' )
            {
            // InternalModa.g:443:1: ( 'MODA' )
            // InternalModa.g:444:2: 'MODA'
            {
             before(grammarAccess.getMODAAccess().getMODAKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMODAAccess().getMODAKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group__1__Impl"


    // $ANTLR start "rule__MODA__Group__2"
    // InternalModa.g:453:1: rule__MODA__Group__2 : rule__MODA__Group__2__Impl rule__MODA__Group__3 ;
    public final void rule__MODA__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:457:1: ( rule__MODA__Group__2__Impl rule__MODA__Group__3 )
            // InternalModa.g:458:2: rule__MODA__Group__2__Impl rule__MODA__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MODA__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group__3();

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
    // $ANTLR end "rule__MODA__Group__2"


    // $ANTLR start "rule__MODA__Group__2__Impl"
    // InternalModa.g:465:1: rule__MODA__Group__2__Impl : ( ( rule__MODA__NameAssignment_2 ) ) ;
    public final void rule__MODA__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:469:1: ( ( ( rule__MODA__NameAssignment_2 ) ) )
            // InternalModa.g:470:1: ( ( rule__MODA__NameAssignment_2 ) )
            {
            // InternalModa.g:470:1: ( ( rule__MODA__NameAssignment_2 ) )
            // InternalModa.g:471:2: ( rule__MODA__NameAssignment_2 )
            {
             before(grammarAccess.getMODAAccess().getNameAssignment_2()); 
            // InternalModa.g:472:2: ( rule__MODA__NameAssignment_2 )
            // InternalModa.g:472:3: rule__MODA__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MODA__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMODAAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group__2__Impl"


    // $ANTLR start "rule__MODA__Group__3"
    // InternalModa.g:480:1: rule__MODA__Group__3 : rule__MODA__Group__3__Impl rule__MODA__Group__4 ;
    public final void rule__MODA__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:484:1: ( rule__MODA__Group__3__Impl rule__MODA__Group__4 )
            // InternalModa.g:485:2: rule__MODA__Group__3__Impl rule__MODA__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__MODA__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group__4();

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
    // $ANTLR end "rule__MODA__Group__3"


    // $ANTLR start "rule__MODA__Group__3__Impl"
    // InternalModa.g:492:1: rule__MODA__Group__3__Impl : ( '{' ) ;
    public final void rule__MODA__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:496:1: ( ( '{' ) )
            // InternalModa.g:497:1: ( '{' )
            {
            // InternalModa.g:497:1: ( '{' )
            // InternalModa.g:498:2: '{'
            {
             before(grammarAccess.getMODAAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMODAAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group__3__Impl"


    // $ANTLR start "rule__MODA__Group__4"
    // InternalModa.g:507:1: rule__MODA__Group__4 : rule__MODA__Group__4__Impl rule__MODA__Group__5 ;
    public final void rule__MODA__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:511:1: ( rule__MODA__Group__4__Impl rule__MODA__Group__5 )
            // InternalModa.g:512:2: rule__MODA__Group__4__Impl rule__MODA__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__MODA__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group__5();

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
    // $ANTLR end "rule__MODA__Group__4"


    // $ANTLR start "rule__MODA__Group__4__Impl"
    // InternalModa.g:519:1: rule__MODA__Group__4__Impl : ( ( rule__MODA__Group_4__0 )? ) ;
    public final void rule__MODA__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:523:1: ( ( ( rule__MODA__Group_4__0 )? ) )
            // InternalModa.g:524:1: ( ( rule__MODA__Group_4__0 )? )
            {
            // InternalModa.g:524:1: ( ( rule__MODA__Group_4__0 )? )
            // InternalModa.g:525:2: ( rule__MODA__Group_4__0 )?
            {
             before(grammarAccess.getMODAAccess().getGroup_4()); 
            // InternalModa.g:526:2: ( rule__MODA__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalModa.g:526:3: rule__MODA__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MODA__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMODAAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group__4__Impl"


    // $ANTLR start "rule__MODA__Group__5"
    // InternalModa.g:534:1: rule__MODA__Group__5 : rule__MODA__Group__5__Impl rule__MODA__Group__6 ;
    public final void rule__MODA__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:538:1: ( rule__MODA__Group__5__Impl rule__MODA__Group__6 )
            // InternalModa.g:539:2: rule__MODA__Group__5__Impl rule__MODA__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__MODA__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group__6();

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
    // $ANTLR end "rule__MODA__Group__5"


    // $ANTLR start "rule__MODA__Group__5__Impl"
    // InternalModa.g:546:1: rule__MODA__Group__5__Impl : ( ( rule__MODA__Group_5__0 )? ) ;
    public final void rule__MODA__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:550:1: ( ( ( rule__MODA__Group_5__0 )? ) )
            // InternalModa.g:551:1: ( ( rule__MODA__Group_5__0 )? )
            {
            // InternalModa.g:551:1: ( ( rule__MODA__Group_5__0 )? )
            // InternalModa.g:552:2: ( rule__MODA__Group_5__0 )?
            {
             before(grammarAccess.getMODAAccess().getGroup_5()); 
            // InternalModa.g:553:2: ( rule__MODA__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalModa.g:553:3: rule__MODA__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MODA__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMODAAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group__5__Impl"


    // $ANTLR start "rule__MODA__Group__6"
    // InternalModa.g:561:1: rule__MODA__Group__6 : rule__MODA__Group__6__Impl rule__MODA__Group__7 ;
    public final void rule__MODA__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:565:1: ( rule__MODA__Group__6__Impl rule__MODA__Group__7 )
            // InternalModa.g:566:2: rule__MODA__Group__6__Impl rule__MODA__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__MODA__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group__7();

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
    // $ANTLR end "rule__MODA__Group__6"


    // $ANTLR start "rule__MODA__Group__6__Impl"
    // InternalModa.g:573:1: rule__MODA__Group__6__Impl : ( ( rule__MODA__Group_6__0 )? ) ;
    public final void rule__MODA__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:577:1: ( ( ( rule__MODA__Group_6__0 )? ) )
            // InternalModa.g:578:1: ( ( rule__MODA__Group_6__0 )? )
            {
            // InternalModa.g:578:1: ( ( rule__MODA__Group_6__0 )? )
            // InternalModa.g:579:2: ( rule__MODA__Group_6__0 )?
            {
             before(grammarAccess.getMODAAccess().getGroup_6()); 
            // InternalModa.g:580:2: ( rule__MODA__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalModa.g:580:3: rule__MODA__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MODA__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMODAAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group__6__Impl"


    // $ANTLR start "rule__MODA__Group__7"
    // InternalModa.g:588:1: rule__MODA__Group__7 : rule__MODA__Group__7__Impl rule__MODA__Group__8 ;
    public final void rule__MODA__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:592:1: ( rule__MODA__Group__7__Impl rule__MODA__Group__8 )
            // InternalModa.g:593:2: rule__MODA__Group__7__Impl rule__MODA__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__MODA__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group__8();

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
    // $ANTLR end "rule__MODA__Group__7"


    // $ANTLR start "rule__MODA__Group__7__Impl"
    // InternalModa.g:600:1: rule__MODA__Group__7__Impl : ( ( rule__MODA__Group_7__0 )? ) ;
    public final void rule__MODA__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:604:1: ( ( ( rule__MODA__Group_7__0 )? ) )
            // InternalModa.g:605:1: ( ( rule__MODA__Group_7__0 )? )
            {
            // InternalModa.g:605:1: ( ( rule__MODA__Group_7__0 )? )
            // InternalModa.g:606:2: ( rule__MODA__Group_7__0 )?
            {
             before(grammarAccess.getMODAAccess().getGroup_7()); 
            // InternalModa.g:607:2: ( rule__MODA__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalModa.g:607:3: rule__MODA__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MODA__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMODAAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group__7__Impl"


    // $ANTLR start "rule__MODA__Group__8"
    // InternalModa.g:615:1: rule__MODA__Group__8 : rule__MODA__Group__8__Impl rule__MODA__Group__9 ;
    public final void rule__MODA__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:619:1: ( rule__MODA__Group__8__Impl rule__MODA__Group__9 )
            // InternalModa.g:620:2: rule__MODA__Group__8__Impl rule__MODA__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__MODA__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group__9();

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
    // $ANTLR end "rule__MODA__Group__8"


    // $ANTLR start "rule__MODA__Group__8__Impl"
    // InternalModa.g:627:1: rule__MODA__Group__8__Impl : ( ( rule__MODA__Group_8__0 )? ) ;
    public final void rule__MODA__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:631:1: ( ( ( rule__MODA__Group_8__0 )? ) )
            // InternalModa.g:632:1: ( ( rule__MODA__Group_8__0 )? )
            {
            // InternalModa.g:632:1: ( ( rule__MODA__Group_8__0 )? )
            // InternalModa.g:633:2: ( rule__MODA__Group_8__0 )?
            {
             before(grammarAccess.getMODAAccess().getGroup_8()); 
            // InternalModa.g:634:2: ( rule__MODA__Group_8__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalModa.g:634:3: rule__MODA__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MODA__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMODAAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group__8__Impl"


    // $ANTLR start "rule__MODA__Group__9"
    // InternalModa.g:642:1: rule__MODA__Group__9 : rule__MODA__Group__9__Impl ;
    public final void rule__MODA__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:646:1: ( rule__MODA__Group__9__Impl )
            // InternalModa.g:647:2: rule__MODA__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODA__Group__9__Impl();

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
    // $ANTLR end "rule__MODA__Group__9"


    // $ANTLR start "rule__MODA__Group__9__Impl"
    // InternalModa.g:653:1: rule__MODA__Group__9__Impl : ( '}' ) ;
    public final void rule__MODA__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:657:1: ( ( '}' ) )
            // InternalModa.g:658:1: ( '}' )
            {
            // InternalModa.g:658:1: ( '}' )
            // InternalModa.g:659:2: '}'
            {
             before(grammarAccess.getMODAAccess().getRightCurlyBracketKeyword_9()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMODAAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group__9__Impl"


    // $ANTLR start "rule__MODA__Group_4__0"
    // InternalModa.g:669:1: rule__MODA__Group_4__0 : rule__MODA__Group_4__0__Impl rule__MODA__Group_4__1 ;
    public final void rule__MODA__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:673:1: ( rule__MODA__Group_4__0__Impl rule__MODA__Group_4__1 )
            // InternalModa.g:674:2: rule__MODA__Group_4__0__Impl rule__MODA__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__MODA__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group_4__1();

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
    // $ANTLR end "rule__MODA__Group_4__0"


    // $ANTLR start "rule__MODA__Group_4__0__Impl"
    // InternalModa.g:681:1: rule__MODA__Group_4__0__Impl : ( 'sociotechnicalsystem' ) ;
    public final void rule__MODA__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:685:1: ( ( 'sociotechnicalsystem' ) )
            // InternalModa.g:686:1: ( 'sociotechnicalsystem' )
            {
            // InternalModa.g:686:1: ( 'sociotechnicalsystem' )
            // InternalModa.g:687:2: 'sociotechnicalsystem'
            {
             before(grammarAccess.getMODAAccess().getSociotechnicalsystemKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMODAAccess().getSociotechnicalsystemKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_4__0__Impl"


    // $ANTLR start "rule__MODA__Group_4__1"
    // InternalModa.g:696:1: rule__MODA__Group_4__1 : rule__MODA__Group_4__1__Impl ;
    public final void rule__MODA__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:700:1: ( rule__MODA__Group_4__1__Impl )
            // InternalModa.g:701:2: rule__MODA__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODA__Group_4__1__Impl();

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
    // $ANTLR end "rule__MODA__Group_4__1"


    // $ANTLR start "rule__MODA__Group_4__1__Impl"
    // InternalModa.g:707:1: rule__MODA__Group_4__1__Impl : ( ( rule__MODA__SociotechnicalsystemAssignment_4_1 ) ) ;
    public final void rule__MODA__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:711:1: ( ( ( rule__MODA__SociotechnicalsystemAssignment_4_1 ) ) )
            // InternalModa.g:712:1: ( ( rule__MODA__SociotechnicalsystemAssignment_4_1 ) )
            {
            // InternalModa.g:712:1: ( ( rule__MODA__SociotechnicalsystemAssignment_4_1 ) )
            // InternalModa.g:713:2: ( rule__MODA__SociotechnicalsystemAssignment_4_1 )
            {
             before(grammarAccess.getMODAAccess().getSociotechnicalsystemAssignment_4_1()); 
            // InternalModa.g:714:2: ( rule__MODA__SociotechnicalsystemAssignment_4_1 )
            // InternalModa.g:714:3: rule__MODA__SociotechnicalsystemAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MODA__SociotechnicalsystemAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMODAAccess().getSociotechnicalsystemAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_4__1__Impl"


    // $ANTLR start "rule__MODA__Group_5__0"
    // InternalModa.g:723:1: rule__MODA__Group_5__0 : rule__MODA__Group_5__0__Impl rule__MODA__Group_5__1 ;
    public final void rule__MODA__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:727:1: ( rule__MODA__Group_5__0__Impl rule__MODA__Group_5__1 )
            // InternalModa.g:728:2: rule__MODA__Group_5__0__Impl rule__MODA__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__MODA__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group_5__1();

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
    // $ANTLR end "rule__MODA__Group_5__0"


    // $ANTLR start "rule__MODA__Group_5__0__Impl"
    // InternalModa.g:735:1: rule__MODA__Group_5__0__Impl : ( 'data' ) ;
    public final void rule__MODA__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:739:1: ( ( 'data' ) )
            // InternalModa.g:740:1: ( 'data' )
            {
            // InternalModa.g:740:1: ( 'data' )
            // InternalModa.g:741:2: 'data'
            {
             before(grammarAccess.getMODAAccess().getDataKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMODAAccess().getDataKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_5__0__Impl"


    // $ANTLR start "rule__MODA__Group_5__1"
    // InternalModa.g:750:1: rule__MODA__Group_5__1 : rule__MODA__Group_5__1__Impl rule__MODA__Group_5__2 ;
    public final void rule__MODA__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:754:1: ( rule__MODA__Group_5__1__Impl rule__MODA__Group_5__2 )
            // InternalModa.g:755:2: rule__MODA__Group_5__1__Impl rule__MODA__Group_5__2
            {
            pushFollow(FOLLOW_8);
            rule__MODA__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group_5__2();

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
    // $ANTLR end "rule__MODA__Group_5__1"


    // $ANTLR start "rule__MODA__Group_5__1__Impl"
    // InternalModa.g:762:1: rule__MODA__Group_5__1__Impl : ( '{' ) ;
    public final void rule__MODA__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:766:1: ( ( '{' ) )
            // InternalModa.g:767:1: ( '{' )
            {
            // InternalModa.g:767:1: ( '{' )
            // InternalModa.g:768:2: '{'
            {
             before(grammarAccess.getMODAAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMODAAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_5__1__Impl"


    // $ANTLR start "rule__MODA__Group_5__2"
    // InternalModa.g:777:1: rule__MODA__Group_5__2 : rule__MODA__Group_5__2__Impl rule__MODA__Group_5__3 ;
    public final void rule__MODA__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:781:1: ( rule__MODA__Group_5__2__Impl rule__MODA__Group_5__3 )
            // InternalModa.g:782:2: rule__MODA__Group_5__2__Impl rule__MODA__Group_5__3
            {
            pushFollow(FOLLOW_9);
            rule__MODA__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group_5__3();

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
    // $ANTLR end "rule__MODA__Group_5__2"


    // $ANTLR start "rule__MODA__Group_5__2__Impl"
    // InternalModa.g:789:1: rule__MODA__Group_5__2__Impl : ( ( rule__MODA__DataAssignment_5_2 ) ) ;
    public final void rule__MODA__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:793:1: ( ( ( rule__MODA__DataAssignment_5_2 ) ) )
            // InternalModa.g:794:1: ( ( rule__MODA__DataAssignment_5_2 ) )
            {
            // InternalModa.g:794:1: ( ( rule__MODA__DataAssignment_5_2 ) )
            // InternalModa.g:795:2: ( rule__MODA__DataAssignment_5_2 )
            {
             before(grammarAccess.getMODAAccess().getDataAssignment_5_2()); 
            // InternalModa.g:796:2: ( rule__MODA__DataAssignment_5_2 )
            // InternalModa.g:796:3: rule__MODA__DataAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__MODA__DataAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getMODAAccess().getDataAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_5__2__Impl"


    // $ANTLR start "rule__MODA__Group_5__3"
    // InternalModa.g:804:1: rule__MODA__Group_5__3 : rule__MODA__Group_5__3__Impl rule__MODA__Group_5__4 ;
    public final void rule__MODA__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:808:1: ( rule__MODA__Group_5__3__Impl rule__MODA__Group_5__4 )
            // InternalModa.g:809:2: rule__MODA__Group_5__3__Impl rule__MODA__Group_5__4
            {
            pushFollow(FOLLOW_9);
            rule__MODA__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group_5__4();

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
    // $ANTLR end "rule__MODA__Group_5__3"


    // $ANTLR start "rule__MODA__Group_5__3__Impl"
    // InternalModa.g:816:1: rule__MODA__Group_5__3__Impl : ( ( rule__MODA__Group_5_3__0 )* ) ;
    public final void rule__MODA__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:820:1: ( ( ( rule__MODA__Group_5_3__0 )* ) )
            // InternalModa.g:821:1: ( ( rule__MODA__Group_5_3__0 )* )
            {
            // InternalModa.g:821:1: ( ( rule__MODA__Group_5_3__0 )* )
            // InternalModa.g:822:2: ( rule__MODA__Group_5_3__0 )*
            {
             before(grammarAccess.getMODAAccess().getGroup_5_3()); 
            // InternalModa.g:823:2: ( rule__MODA__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalModa.g:823:3: rule__MODA__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MODA__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMODAAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_5__3__Impl"


    // $ANTLR start "rule__MODA__Group_5__4"
    // InternalModa.g:831:1: rule__MODA__Group_5__4 : rule__MODA__Group_5__4__Impl ;
    public final void rule__MODA__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:835:1: ( rule__MODA__Group_5__4__Impl )
            // InternalModa.g:836:2: rule__MODA__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODA__Group_5__4__Impl();

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
    // $ANTLR end "rule__MODA__Group_5__4"


    // $ANTLR start "rule__MODA__Group_5__4__Impl"
    // InternalModa.g:842:1: rule__MODA__Group_5__4__Impl : ( '}' ) ;
    public final void rule__MODA__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:846:1: ( ( '}' ) )
            // InternalModa.g:847:1: ( '}' )
            {
            // InternalModa.g:847:1: ( '}' )
            // InternalModa.g:848:2: '}'
            {
             before(grammarAccess.getMODAAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMODAAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_5__4__Impl"


    // $ANTLR start "rule__MODA__Group_5_3__0"
    // InternalModa.g:858:1: rule__MODA__Group_5_3__0 : rule__MODA__Group_5_3__0__Impl rule__MODA__Group_5_3__1 ;
    public final void rule__MODA__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:862:1: ( rule__MODA__Group_5_3__0__Impl rule__MODA__Group_5_3__1 )
            // InternalModa.g:863:2: rule__MODA__Group_5_3__0__Impl rule__MODA__Group_5_3__1
            {
            pushFollow(FOLLOW_8);
            rule__MODA__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group_5_3__1();

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
    // $ANTLR end "rule__MODA__Group_5_3__0"


    // $ANTLR start "rule__MODA__Group_5_3__0__Impl"
    // InternalModa.g:870:1: rule__MODA__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__MODA__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:874:1: ( ( ',' ) )
            // InternalModa.g:875:1: ( ',' )
            {
            // InternalModa.g:875:1: ( ',' )
            // InternalModa.g:876:2: ','
            {
             before(grammarAccess.getMODAAccess().getCommaKeyword_5_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMODAAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_5_3__0__Impl"


    // $ANTLR start "rule__MODA__Group_5_3__1"
    // InternalModa.g:885:1: rule__MODA__Group_5_3__1 : rule__MODA__Group_5_3__1__Impl ;
    public final void rule__MODA__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:889:1: ( rule__MODA__Group_5_3__1__Impl )
            // InternalModa.g:890:2: rule__MODA__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODA__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__MODA__Group_5_3__1"


    // $ANTLR start "rule__MODA__Group_5_3__1__Impl"
    // InternalModa.g:896:1: rule__MODA__Group_5_3__1__Impl : ( ( rule__MODA__DataAssignment_5_3_1 ) ) ;
    public final void rule__MODA__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:900:1: ( ( ( rule__MODA__DataAssignment_5_3_1 ) ) )
            // InternalModa.g:901:1: ( ( rule__MODA__DataAssignment_5_3_1 ) )
            {
            // InternalModa.g:901:1: ( ( rule__MODA__DataAssignment_5_3_1 ) )
            // InternalModa.g:902:2: ( rule__MODA__DataAssignment_5_3_1 )
            {
             before(grammarAccess.getMODAAccess().getDataAssignment_5_3_1()); 
            // InternalModa.g:903:2: ( rule__MODA__DataAssignment_5_3_1 )
            // InternalModa.g:903:3: rule__MODA__DataAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MODA__DataAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMODAAccess().getDataAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_5_3__1__Impl"


    // $ANTLR start "rule__MODA__Group_6__0"
    // InternalModa.g:912:1: rule__MODA__Group_6__0 : rule__MODA__Group_6__0__Impl rule__MODA__Group_6__1 ;
    public final void rule__MODA__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:916:1: ( rule__MODA__Group_6__0__Impl rule__MODA__Group_6__1 )
            // InternalModa.g:917:2: rule__MODA__Group_6__0__Impl rule__MODA__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__MODA__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group_6__1();

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
    // $ANTLR end "rule__MODA__Group_6__0"


    // $ANTLR start "rule__MODA__Group_6__0__Impl"
    // InternalModa.g:924:1: rule__MODA__Group_6__0__Impl : ( 'software' ) ;
    public final void rule__MODA__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:928:1: ( ( 'software' ) )
            // InternalModa.g:929:1: ( 'software' )
            {
            // InternalModa.g:929:1: ( 'software' )
            // InternalModa.g:930:2: 'software'
            {
             before(grammarAccess.getMODAAccess().getSoftwareKeyword_6_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMODAAccess().getSoftwareKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_6__0__Impl"


    // $ANTLR start "rule__MODA__Group_6__1"
    // InternalModa.g:939:1: rule__MODA__Group_6__1 : rule__MODA__Group_6__1__Impl ;
    public final void rule__MODA__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:943:1: ( rule__MODA__Group_6__1__Impl )
            // InternalModa.g:944:2: rule__MODA__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODA__Group_6__1__Impl();

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
    // $ANTLR end "rule__MODA__Group_6__1"


    // $ANTLR start "rule__MODA__Group_6__1__Impl"
    // InternalModa.g:950:1: rule__MODA__Group_6__1__Impl : ( ( rule__MODA__SoftwareAssignment_6_1 ) ) ;
    public final void rule__MODA__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:954:1: ( ( ( rule__MODA__SoftwareAssignment_6_1 ) ) )
            // InternalModa.g:955:1: ( ( rule__MODA__SoftwareAssignment_6_1 ) )
            {
            // InternalModa.g:955:1: ( ( rule__MODA__SoftwareAssignment_6_1 ) )
            // InternalModa.g:956:2: ( rule__MODA__SoftwareAssignment_6_1 )
            {
             before(grammarAccess.getMODAAccess().getSoftwareAssignment_6_1()); 
            // InternalModa.g:957:2: ( rule__MODA__SoftwareAssignment_6_1 )
            // InternalModa.g:957:3: rule__MODA__SoftwareAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__MODA__SoftwareAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMODAAccess().getSoftwareAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_6__1__Impl"


    // $ANTLR start "rule__MODA__Group_7__0"
    // InternalModa.g:966:1: rule__MODA__Group_7__0 : rule__MODA__Group_7__0__Impl rule__MODA__Group_7__1 ;
    public final void rule__MODA__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:970:1: ( rule__MODA__Group_7__0__Impl rule__MODA__Group_7__1 )
            // InternalModa.g:971:2: rule__MODA__Group_7__0__Impl rule__MODA__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__MODA__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group_7__1();

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
    // $ANTLR end "rule__MODA__Group_7__0"


    // $ANTLR start "rule__MODA__Group_7__0__Impl"
    // InternalModa.g:978:1: rule__MODA__Group_7__0__Impl : ( 'model' ) ;
    public final void rule__MODA__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:982:1: ( ( 'model' ) )
            // InternalModa.g:983:1: ( 'model' )
            {
            // InternalModa.g:983:1: ( 'model' )
            // InternalModa.g:984:2: 'model'
            {
             before(grammarAccess.getMODAAccess().getModelKeyword_7_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMODAAccess().getModelKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_7__0__Impl"


    // $ANTLR start "rule__MODA__Group_7__1"
    // InternalModa.g:993:1: rule__MODA__Group_7__1 : rule__MODA__Group_7__1__Impl rule__MODA__Group_7__2 ;
    public final void rule__MODA__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:997:1: ( rule__MODA__Group_7__1__Impl rule__MODA__Group_7__2 )
            // InternalModa.g:998:2: rule__MODA__Group_7__1__Impl rule__MODA__Group_7__2
            {
            pushFollow(FOLLOW_12);
            rule__MODA__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group_7__2();

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
    // $ANTLR end "rule__MODA__Group_7__1"


    // $ANTLR start "rule__MODA__Group_7__1__Impl"
    // InternalModa.g:1005:1: rule__MODA__Group_7__1__Impl : ( '{' ) ;
    public final void rule__MODA__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1009:1: ( ( '{' ) )
            // InternalModa.g:1010:1: ( '{' )
            {
            // InternalModa.g:1010:1: ( '{' )
            // InternalModa.g:1011:2: '{'
            {
             before(grammarAccess.getMODAAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMODAAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_7__1__Impl"


    // $ANTLR start "rule__MODA__Group_7__2"
    // InternalModa.g:1020:1: rule__MODA__Group_7__2 : rule__MODA__Group_7__2__Impl rule__MODA__Group_7__3 ;
    public final void rule__MODA__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1024:1: ( rule__MODA__Group_7__2__Impl rule__MODA__Group_7__3 )
            // InternalModa.g:1025:2: rule__MODA__Group_7__2__Impl rule__MODA__Group_7__3
            {
            pushFollow(FOLLOW_9);
            rule__MODA__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group_7__3();

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
    // $ANTLR end "rule__MODA__Group_7__2"


    // $ANTLR start "rule__MODA__Group_7__2__Impl"
    // InternalModa.g:1032:1: rule__MODA__Group_7__2__Impl : ( ( rule__MODA__ModelAssignment_7_2 ) ) ;
    public final void rule__MODA__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1036:1: ( ( ( rule__MODA__ModelAssignment_7_2 ) ) )
            // InternalModa.g:1037:1: ( ( rule__MODA__ModelAssignment_7_2 ) )
            {
            // InternalModa.g:1037:1: ( ( rule__MODA__ModelAssignment_7_2 ) )
            // InternalModa.g:1038:2: ( rule__MODA__ModelAssignment_7_2 )
            {
             before(grammarAccess.getMODAAccess().getModelAssignment_7_2()); 
            // InternalModa.g:1039:2: ( rule__MODA__ModelAssignment_7_2 )
            // InternalModa.g:1039:3: rule__MODA__ModelAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__MODA__ModelAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getMODAAccess().getModelAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_7__2__Impl"


    // $ANTLR start "rule__MODA__Group_7__3"
    // InternalModa.g:1047:1: rule__MODA__Group_7__3 : rule__MODA__Group_7__3__Impl rule__MODA__Group_7__4 ;
    public final void rule__MODA__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1051:1: ( rule__MODA__Group_7__3__Impl rule__MODA__Group_7__4 )
            // InternalModa.g:1052:2: rule__MODA__Group_7__3__Impl rule__MODA__Group_7__4
            {
            pushFollow(FOLLOW_9);
            rule__MODA__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group_7__4();

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
    // $ANTLR end "rule__MODA__Group_7__3"


    // $ANTLR start "rule__MODA__Group_7__3__Impl"
    // InternalModa.g:1059:1: rule__MODA__Group_7__3__Impl : ( ( rule__MODA__Group_7_3__0 )* ) ;
    public final void rule__MODA__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1063:1: ( ( ( rule__MODA__Group_7_3__0 )* ) )
            // InternalModa.g:1064:1: ( ( rule__MODA__Group_7_3__0 )* )
            {
            // InternalModa.g:1064:1: ( ( rule__MODA__Group_7_3__0 )* )
            // InternalModa.g:1065:2: ( rule__MODA__Group_7_3__0 )*
            {
             before(grammarAccess.getMODAAccess().getGroup_7_3()); 
            // InternalModa.g:1066:2: ( rule__MODA__Group_7_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalModa.g:1066:3: rule__MODA__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MODA__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getMODAAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_7__3__Impl"


    // $ANTLR start "rule__MODA__Group_7__4"
    // InternalModa.g:1074:1: rule__MODA__Group_7__4 : rule__MODA__Group_7__4__Impl ;
    public final void rule__MODA__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1078:1: ( rule__MODA__Group_7__4__Impl )
            // InternalModa.g:1079:2: rule__MODA__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODA__Group_7__4__Impl();

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
    // $ANTLR end "rule__MODA__Group_7__4"


    // $ANTLR start "rule__MODA__Group_7__4__Impl"
    // InternalModa.g:1085:1: rule__MODA__Group_7__4__Impl : ( '}' ) ;
    public final void rule__MODA__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1089:1: ( ( '}' ) )
            // InternalModa.g:1090:1: ( '}' )
            {
            // InternalModa.g:1090:1: ( '}' )
            // InternalModa.g:1091:2: '}'
            {
             before(grammarAccess.getMODAAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMODAAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_7__4__Impl"


    // $ANTLR start "rule__MODA__Group_7_3__0"
    // InternalModa.g:1101:1: rule__MODA__Group_7_3__0 : rule__MODA__Group_7_3__0__Impl rule__MODA__Group_7_3__1 ;
    public final void rule__MODA__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1105:1: ( rule__MODA__Group_7_3__0__Impl rule__MODA__Group_7_3__1 )
            // InternalModa.g:1106:2: rule__MODA__Group_7_3__0__Impl rule__MODA__Group_7_3__1
            {
            pushFollow(FOLLOW_12);
            rule__MODA__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group_7_3__1();

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
    // $ANTLR end "rule__MODA__Group_7_3__0"


    // $ANTLR start "rule__MODA__Group_7_3__0__Impl"
    // InternalModa.g:1113:1: rule__MODA__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__MODA__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1117:1: ( ( ',' ) )
            // InternalModa.g:1118:1: ( ',' )
            {
            // InternalModa.g:1118:1: ( ',' )
            // InternalModa.g:1119:2: ','
            {
             before(grammarAccess.getMODAAccess().getCommaKeyword_7_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMODAAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_7_3__0__Impl"


    // $ANTLR start "rule__MODA__Group_7_3__1"
    // InternalModa.g:1128:1: rule__MODA__Group_7_3__1 : rule__MODA__Group_7_3__1__Impl ;
    public final void rule__MODA__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1132:1: ( rule__MODA__Group_7_3__1__Impl )
            // InternalModa.g:1133:2: rule__MODA__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODA__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__MODA__Group_7_3__1"


    // $ANTLR start "rule__MODA__Group_7_3__1__Impl"
    // InternalModa.g:1139:1: rule__MODA__Group_7_3__1__Impl : ( ( rule__MODA__ModelAssignment_7_3_1 ) ) ;
    public final void rule__MODA__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1143:1: ( ( ( rule__MODA__ModelAssignment_7_3_1 ) ) )
            // InternalModa.g:1144:1: ( ( rule__MODA__ModelAssignment_7_3_1 ) )
            {
            // InternalModa.g:1144:1: ( ( rule__MODA__ModelAssignment_7_3_1 ) )
            // InternalModa.g:1145:2: ( rule__MODA__ModelAssignment_7_3_1 )
            {
             before(grammarAccess.getMODAAccess().getModelAssignment_7_3_1()); 
            // InternalModa.g:1146:2: ( rule__MODA__ModelAssignment_7_3_1 )
            // InternalModa.g:1146:3: rule__MODA__ModelAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MODA__ModelAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMODAAccess().getModelAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_7_3__1__Impl"


    // $ANTLR start "rule__MODA__Group_8__0"
    // InternalModa.g:1155:1: rule__MODA__Group_8__0 : rule__MODA__Group_8__0__Impl rule__MODA__Group_8__1 ;
    public final void rule__MODA__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1159:1: ( rule__MODA__Group_8__0__Impl rule__MODA__Group_8__1 )
            // InternalModa.g:1160:2: rule__MODA__Group_8__0__Impl rule__MODA__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__MODA__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group_8__1();

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
    // $ANTLR end "rule__MODA__Group_8__0"


    // $ANTLR start "rule__MODA__Group_8__0__Impl"
    // InternalModa.g:1167:1: rule__MODA__Group_8__0__Impl : ( 'modelrole' ) ;
    public final void rule__MODA__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1171:1: ( ( 'modelrole' ) )
            // InternalModa.g:1172:1: ( 'modelrole' )
            {
            // InternalModa.g:1172:1: ( 'modelrole' )
            // InternalModa.g:1173:2: 'modelrole'
            {
             before(grammarAccess.getMODAAccess().getModelroleKeyword_8_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMODAAccess().getModelroleKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_8__0__Impl"


    // $ANTLR start "rule__MODA__Group_8__1"
    // InternalModa.g:1182:1: rule__MODA__Group_8__1 : rule__MODA__Group_8__1__Impl rule__MODA__Group_8__2 ;
    public final void rule__MODA__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1186:1: ( rule__MODA__Group_8__1__Impl rule__MODA__Group_8__2 )
            // InternalModa.g:1187:2: rule__MODA__Group_8__1__Impl rule__MODA__Group_8__2
            {
            pushFollow(FOLLOW_13);
            rule__MODA__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group_8__2();

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
    // $ANTLR end "rule__MODA__Group_8__1"


    // $ANTLR start "rule__MODA__Group_8__1__Impl"
    // InternalModa.g:1194:1: rule__MODA__Group_8__1__Impl : ( '{' ) ;
    public final void rule__MODA__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1198:1: ( ( '{' ) )
            // InternalModa.g:1199:1: ( '{' )
            {
            // InternalModa.g:1199:1: ( '{' )
            // InternalModa.g:1200:2: '{'
            {
             before(grammarAccess.getMODAAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMODAAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_8__1__Impl"


    // $ANTLR start "rule__MODA__Group_8__2"
    // InternalModa.g:1209:1: rule__MODA__Group_8__2 : rule__MODA__Group_8__2__Impl rule__MODA__Group_8__3 ;
    public final void rule__MODA__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1213:1: ( rule__MODA__Group_8__2__Impl rule__MODA__Group_8__3 )
            // InternalModa.g:1214:2: rule__MODA__Group_8__2__Impl rule__MODA__Group_8__3
            {
            pushFollow(FOLLOW_9);
            rule__MODA__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group_8__3();

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
    // $ANTLR end "rule__MODA__Group_8__2"


    // $ANTLR start "rule__MODA__Group_8__2__Impl"
    // InternalModa.g:1221:1: rule__MODA__Group_8__2__Impl : ( ( rule__MODA__ModelroleAssignment_8_2 ) ) ;
    public final void rule__MODA__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1225:1: ( ( ( rule__MODA__ModelroleAssignment_8_2 ) ) )
            // InternalModa.g:1226:1: ( ( rule__MODA__ModelroleAssignment_8_2 ) )
            {
            // InternalModa.g:1226:1: ( ( rule__MODA__ModelroleAssignment_8_2 ) )
            // InternalModa.g:1227:2: ( rule__MODA__ModelroleAssignment_8_2 )
            {
             before(grammarAccess.getMODAAccess().getModelroleAssignment_8_2()); 
            // InternalModa.g:1228:2: ( rule__MODA__ModelroleAssignment_8_2 )
            // InternalModa.g:1228:3: rule__MODA__ModelroleAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__MODA__ModelroleAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getMODAAccess().getModelroleAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_8__2__Impl"


    // $ANTLR start "rule__MODA__Group_8__3"
    // InternalModa.g:1236:1: rule__MODA__Group_8__3 : rule__MODA__Group_8__3__Impl rule__MODA__Group_8__4 ;
    public final void rule__MODA__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1240:1: ( rule__MODA__Group_8__3__Impl rule__MODA__Group_8__4 )
            // InternalModa.g:1241:2: rule__MODA__Group_8__3__Impl rule__MODA__Group_8__4
            {
            pushFollow(FOLLOW_9);
            rule__MODA__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group_8__4();

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
    // $ANTLR end "rule__MODA__Group_8__3"


    // $ANTLR start "rule__MODA__Group_8__3__Impl"
    // InternalModa.g:1248:1: rule__MODA__Group_8__3__Impl : ( ( rule__MODA__Group_8_3__0 )* ) ;
    public final void rule__MODA__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1252:1: ( ( ( rule__MODA__Group_8_3__0 )* ) )
            // InternalModa.g:1253:1: ( ( rule__MODA__Group_8_3__0 )* )
            {
            // InternalModa.g:1253:1: ( ( rule__MODA__Group_8_3__0 )* )
            // InternalModa.g:1254:2: ( rule__MODA__Group_8_3__0 )*
            {
             before(grammarAccess.getMODAAccess().getGroup_8_3()); 
            // InternalModa.g:1255:2: ( rule__MODA__Group_8_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalModa.g:1255:3: rule__MODA__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MODA__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getMODAAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_8__3__Impl"


    // $ANTLR start "rule__MODA__Group_8__4"
    // InternalModa.g:1263:1: rule__MODA__Group_8__4 : rule__MODA__Group_8__4__Impl ;
    public final void rule__MODA__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1267:1: ( rule__MODA__Group_8__4__Impl )
            // InternalModa.g:1268:2: rule__MODA__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODA__Group_8__4__Impl();

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
    // $ANTLR end "rule__MODA__Group_8__4"


    // $ANTLR start "rule__MODA__Group_8__4__Impl"
    // InternalModa.g:1274:1: rule__MODA__Group_8__4__Impl : ( '}' ) ;
    public final void rule__MODA__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1278:1: ( ( '}' ) )
            // InternalModa.g:1279:1: ( '}' )
            {
            // InternalModa.g:1279:1: ( '}' )
            // InternalModa.g:1280:2: '}'
            {
             before(grammarAccess.getMODAAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMODAAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_8__4__Impl"


    // $ANTLR start "rule__MODA__Group_8_3__0"
    // InternalModa.g:1290:1: rule__MODA__Group_8_3__0 : rule__MODA__Group_8_3__0__Impl rule__MODA__Group_8_3__1 ;
    public final void rule__MODA__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1294:1: ( rule__MODA__Group_8_3__0__Impl rule__MODA__Group_8_3__1 )
            // InternalModa.g:1295:2: rule__MODA__Group_8_3__0__Impl rule__MODA__Group_8_3__1
            {
            pushFollow(FOLLOW_13);
            rule__MODA__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MODA__Group_8_3__1();

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
    // $ANTLR end "rule__MODA__Group_8_3__0"


    // $ANTLR start "rule__MODA__Group_8_3__0__Impl"
    // InternalModa.g:1302:1: rule__MODA__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__MODA__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1306:1: ( ( ',' ) )
            // InternalModa.g:1307:1: ( ',' )
            {
            // InternalModa.g:1307:1: ( ',' )
            // InternalModa.g:1308:2: ','
            {
             before(grammarAccess.getMODAAccess().getCommaKeyword_8_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMODAAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_8_3__0__Impl"


    // $ANTLR start "rule__MODA__Group_8_3__1"
    // InternalModa.g:1317:1: rule__MODA__Group_8_3__1 : rule__MODA__Group_8_3__1__Impl ;
    public final void rule__MODA__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1321:1: ( rule__MODA__Group_8_3__1__Impl )
            // InternalModa.g:1322:2: rule__MODA__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MODA__Group_8_3__1__Impl();

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
    // $ANTLR end "rule__MODA__Group_8_3__1"


    // $ANTLR start "rule__MODA__Group_8_3__1__Impl"
    // InternalModa.g:1328:1: rule__MODA__Group_8_3__1__Impl : ( ( rule__MODA__ModelroleAssignment_8_3_1 ) ) ;
    public final void rule__MODA__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1332:1: ( ( ( rule__MODA__ModelroleAssignment_8_3_1 ) ) )
            // InternalModa.g:1333:1: ( ( rule__MODA__ModelroleAssignment_8_3_1 ) )
            {
            // InternalModa.g:1333:1: ( ( rule__MODA__ModelroleAssignment_8_3_1 ) )
            // InternalModa.g:1334:2: ( rule__MODA__ModelroleAssignment_8_3_1 )
            {
             before(grammarAccess.getMODAAccess().getModelroleAssignment_8_3_1()); 
            // InternalModa.g:1335:2: ( rule__MODA__ModelroleAssignment_8_3_1 )
            // InternalModa.g:1335:3: rule__MODA__ModelroleAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MODA__ModelroleAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMODAAccess().getModelroleAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__Group_8_3__1__Impl"


    // $ANTLR start "rule__SocioTechnicalSystem__Group__0"
    // InternalModa.g:1344:1: rule__SocioTechnicalSystem__Group__0 : rule__SocioTechnicalSystem__Group__0__Impl rule__SocioTechnicalSystem__Group__1 ;
    public final void rule__SocioTechnicalSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1348:1: ( rule__SocioTechnicalSystem__Group__0__Impl rule__SocioTechnicalSystem__Group__1 )
            // InternalModa.g:1349:2: rule__SocioTechnicalSystem__Group__0__Impl rule__SocioTechnicalSystem__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SocioTechnicalSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__Group__1();

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
    // $ANTLR end "rule__SocioTechnicalSystem__Group__0"


    // $ANTLR start "rule__SocioTechnicalSystem__Group__0__Impl"
    // InternalModa.g:1356:1: rule__SocioTechnicalSystem__Group__0__Impl : ( () ) ;
    public final void rule__SocioTechnicalSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1360:1: ( ( () ) )
            // InternalModa.g:1361:1: ( () )
            {
            // InternalModa.g:1361:1: ( () )
            // InternalModa.g:1362:2: ()
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getSocioTechnicalSystemAction_0()); 
            // InternalModa.g:1363:2: ()
            // InternalModa.g:1363:3: 
            {
            }

             after(grammarAccess.getSocioTechnicalSystemAccess().getSocioTechnicalSystemAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocioTechnicalSystem__Group__0__Impl"


    // $ANTLR start "rule__SocioTechnicalSystem__Group__1"
    // InternalModa.g:1371:1: rule__SocioTechnicalSystem__Group__1 : rule__SocioTechnicalSystem__Group__1__Impl rule__SocioTechnicalSystem__Group__2 ;
    public final void rule__SocioTechnicalSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1375:1: ( rule__SocioTechnicalSystem__Group__1__Impl rule__SocioTechnicalSystem__Group__2 )
            // InternalModa.g:1376:2: rule__SocioTechnicalSystem__Group__1__Impl rule__SocioTechnicalSystem__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SocioTechnicalSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__Group__2();

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
    // $ANTLR end "rule__SocioTechnicalSystem__Group__1"


    // $ANTLR start "rule__SocioTechnicalSystem__Group__1__Impl"
    // InternalModa.g:1383:1: rule__SocioTechnicalSystem__Group__1__Impl : ( 'SocioTechnicalSystem' ) ;
    public final void rule__SocioTechnicalSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1387:1: ( ( 'SocioTechnicalSystem' ) )
            // InternalModa.g:1388:1: ( 'SocioTechnicalSystem' )
            {
            // InternalModa.g:1388:1: ( 'SocioTechnicalSystem' )
            // InternalModa.g:1389:2: 'SocioTechnicalSystem'
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getSocioTechnicalSystemKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSocioTechnicalSystemAccess().getSocioTechnicalSystemKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocioTechnicalSystem__Group__1__Impl"


    // $ANTLR start "rule__SocioTechnicalSystem__Group__2"
    // InternalModa.g:1398:1: rule__SocioTechnicalSystem__Group__2 : rule__SocioTechnicalSystem__Group__2__Impl rule__SocioTechnicalSystem__Group__3 ;
    public final void rule__SocioTechnicalSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1402:1: ( rule__SocioTechnicalSystem__Group__2__Impl rule__SocioTechnicalSystem__Group__3 )
            // InternalModa.g:1403:2: rule__SocioTechnicalSystem__Group__2__Impl rule__SocioTechnicalSystem__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SocioTechnicalSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__Group__3();

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
    // $ANTLR end "rule__SocioTechnicalSystem__Group__2"


    // $ANTLR start "rule__SocioTechnicalSystem__Group__2__Impl"
    // InternalModa.g:1410:1: rule__SocioTechnicalSystem__Group__2__Impl : ( ( rule__SocioTechnicalSystem__NameAssignment_2 ) ) ;
    public final void rule__SocioTechnicalSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1414:1: ( ( ( rule__SocioTechnicalSystem__NameAssignment_2 ) ) )
            // InternalModa.g:1415:1: ( ( rule__SocioTechnicalSystem__NameAssignment_2 ) )
            {
            // InternalModa.g:1415:1: ( ( rule__SocioTechnicalSystem__NameAssignment_2 ) )
            // InternalModa.g:1416:2: ( rule__SocioTechnicalSystem__NameAssignment_2 )
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getNameAssignment_2()); 
            // InternalModa.g:1417:2: ( rule__SocioTechnicalSystem__NameAssignment_2 )
            // InternalModa.g:1417:3: rule__SocioTechnicalSystem__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSocioTechnicalSystemAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocioTechnicalSystem__Group__2__Impl"


    // $ANTLR start "rule__SocioTechnicalSystem__Group__3"
    // InternalModa.g:1425:1: rule__SocioTechnicalSystem__Group__3 : rule__SocioTechnicalSystem__Group__3__Impl rule__SocioTechnicalSystem__Group__4 ;
    public final void rule__SocioTechnicalSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1429:1: ( rule__SocioTechnicalSystem__Group__3__Impl rule__SocioTechnicalSystem__Group__4 )
            // InternalModa.g:1430:2: rule__SocioTechnicalSystem__Group__3__Impl rule__SocioTechnicalSystem__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__SocioTechnicalSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__Group__4();

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
    // $ANTLR end "rule__SocioTechnicalSystem__Group__3"


    // $ANTLR start "rule__SocioTechnicalSystem__Group__3__Impl"
    // InternalModa.g:1437:1: rule__SocioTechnicalSystem__Group__3__Impl : ( '{' ) ;
    public final void rule__SocioTechnicalSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1441:1: ( ( '{' ) )
            // InternalModa.g:1442:1: ( '{' )
            {
            // InternalModa.g:1442:1: ( '{' )
            // InternalModa.g:1443:2: '{'
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSocioTechnicalSystemAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocioTechnicalSystem__Group__3__Impl"


    // $ANTLR start "rule__SocioTechnicalSystem__Group__4"
    // InternalModa.g:1452:1: rule__SocioTechnicalSystem__Group__4 : rule__SocioTechnicalSystem__Group__4__Impl rule__SocioTechnicalSystem__Group__5 ;
    public final void rule__SocioTechnicalSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1456:1: ( rule__SocioTechnicalSystem__Group__4__Impl rule__SocioTechnicalSystem__Group__5 )
            // InternalModa.g:1457:2: rule__SocioTechnicalSystem__Group__4__Impl rule__SocioTechnicalSystem__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__SocioTechnicalSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__Group__5();

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
    // $ANTLR end "rule__SocioTechnicalSystem__Group__4"


    // $ANTLR start "rule__SocioTechnicalSystem__Group__4__Impl"
    // InternalModa.g:1464:1: rule__SocioTechnicalSystem__Group__4__Impl : ( ( rule__SocioTechnicalSystem__Group_4__0 )? ) ;
    public final void rule__SocioTechnicalSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1468:1: ( ( ( rule__SocioTechnicalSystem__Group_4__0 )? ) )
            // InternalModa.g:1469:1: ( ( rule__SocioTechnicalSystem__Group_4__0 )? )
            {
            // InternalModa.g:1469:1: ( ( rule__SocioTechnicalSystem__Group_4__0 )? )
            // InternalModa.g:1470:2: ( rule__SocioTechnicalSystem__Group_4__0 )?
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getGroup_4()); 
            // InternalModa.g:1471:2: ( rule__SocioTechnicalSystem__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalModa.g:1471:3: rule__SocioTechnicalSystem__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SocioTechnicalSystem__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSocioTechnicalSystemAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocioTechnicalSystem__Group__4__Impl"


    // $ANTLR start "rule__SocioTechnicalSystem__Group__5"
    // InternalModa.g:1479:1: rule__SocioTechnicalSystem__Group__5 : rule__SocioTechnicalSystem__Group__5__Impl rule__SocioTechnicalSystem__Group__6 ;
    public final void rule__SocioTechnicalSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1483:1: ( rule__SocioTechnicalSystem__Group__5__Impl rule__SocioTechnicalSystem__Group__6 )
            // InternalModa.g:1484:2: rule__SocioTechnicalSystem__Group__5__Impl rule__SocioTechnicalSystem__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__SocioTechnicalSystem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__Group__6();

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
    // $ANTLR end "rule__SocioTechnicalSystem__Group__5"


    // $ANTLR start "rule__SocioTechnicalSystem__Group__5__Impl"
    // InternalModa.g:1491:1: rule__SocioTechnicalSystem__Group__5__Impl : ( ( rule__SocioTechnicalSystem__Group_5__0 )? ) ;
    public final void rule__SocioTechnicalSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1495:1: ( ( ( rule__SocioTechnicalSystem__Group_5__0 )? ) )
            // InternalModa.g:1496:1: ( ( rule__SocioTechnicalSystem__Group_5__0 )? )
            {
            // InternalModa.g:1496:1: ( ( rule__SocioTechnicalSystem__Group_5__0 )? )
            // InternalModa.g:1497:2: ( rule__SocioTechnicalSystem__Group_5__0 )?
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getGroup_5()); 
            // InternalModa.g:1498:2: ( rule__SocioTechnicalSystem__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalModa.g:1498:3: rule__SocioTechnicalSystem__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SocioTechnicalSystem__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSocioTechnicalSystemAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocioTechnicalSystem__Group__5__Impl"


    // $ANTLR start "rule__SocioTechnicalSystem__Group__6"
    // InternalModa.g:1506:1: rule__SocioTechnicalSystem__Group__6 : rule__SocioTechnicalSystem__Group__6__Impl ;
    public final void rule__SocioTechnicalSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1510:1: ( rule__SocioTechnicalSystem__Group__6__Impl )
            // InternalModa.g:1511:2: rule__SocioTechnicalSystem__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__Group__6__Impl();

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
    // $ANTLR end "rule__SocioTechnicalSystem__Group__6"


    // $ANTLR start "rule__SocioTechnicalSystem__Group__6__Impl"
    // InternalModa.g:1517:1: rule__SocioTechnicalSystem__Group__6__Impl : ( '}' ) ;
    public final void rule__SocioTechnicalSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1521:1: ( ( '}' ) )
            // InternalModa.g:1522:1: ( '}' )
            {
            // InternalModa.g:1522:1: ( '}' )
            // InternalModa.g:1523:2: '}'
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getRightCurlyBracketKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSocioTechnicalSystemAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocioTechnicalSystem__Group__6__Impl"


    // $ANTLR start "rule__SocioTechnicalSystem__Group_4__0"
    // InternalModa.g:1533:1: rule__SocioTechnicalSystem__Group_4__0 : rule__SocioTechnicalSystem__Group_4__0__Impl rule__SocioTechnicalSystem__Group_4__1 ;
    public final void rule__SocioTechnicalSystem__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1537:1: ( rule__SocioTechnicalSystem__Group_4__0__Impl rule__SocioTechnicalSystem__Group_4__1 )
            // InternalModa.g:1538:2: rule__SocioTechnicalSystem__Group_4__0__Impl rule__SocioTechnicalSystem__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__SocioTechnicalSystem__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__Group_4__1();

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
    // $ANTLR end "rule__SocioTechnicalSystem__Group_4__0"


    // $ANTLR start "rule__SocioTechnicalSystem__Group_4__0__Impl"
    // InternalModa.g:1545:1: rule__SocioTechnicalSystem__Group_4__0__Impl : ( 'data' ) ;
    public final void rule__SocioTechnicalSystem__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1549:1: ( ( 'data' ) )
            // InternalModa.g:1550:1: ( 'data' )
            {
            // InternalModa.g:1550:1: ( 'data' )
            // InternalModa.g:1551:2: 'data'
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getDataKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSocioTechnicalSystemAccess().getDataKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocioTechnicalSystem__Group_4__0__Impl"


    // $ANTLR start "rule__SocioTechnicalSystem__Group_4__1"
    // InternalModa.g:1560:1: rule__SocioTechnicalSystem__Group_4__1 : rule__SocioTechnicalSystem__Group_4__1__Impl rule__SocioTechnicalSystem__Group_4__2 ;
    public final void rule__SocioTechnicalSystem__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1564:1: ( rule__SocioTechnicalSystem__Group_4__1__Impl rule__SocioTechnicalSystem__Group_4__2 )
            // InternalModa.g:1565:2: rule__SocioTechnicalSystem__Group_4__1__Impl rule__SocioTechnicalSystem__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__SocioTechnicalSystem__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__Group_4__2();

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
    // $ANTLR end "rule__SocioTechnicalSystem__Group_4__1"


    // $ANTLR start "rule__SocioTechnicalSystem__Group_4__1__Impl"
    // InternalModa.g:1572:1: rule__SocioTechnicalSystem__Group_4__1__Impl : ( '(' ) ;
    public final void rule__SocioTechnicalSystem__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1576:1: ( ( '(' ) )
            // InternalModa.g:1577:1: ( '(' )
            {
            // InternalModa.g:1577:1: ( '(' )
            // InternalModa.g:1578:2: '('
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSocioTechnicalSystemAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocioTechnicalSystem__Group_4__1__Impl"


    // $ANTLR start "rule__SocioTechnicalSystem__Group_4__2"
    // InternalModa.g:1587:1: rule__SocioTechnicalSystem__Group_4__2 : rule__SocioTechnicalSystem__Group_4__2__Impl rule__SocioTechnicalSystem__Group_4__3 ;
    public final void rule__SocioTechnicalSystem__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1591:1: ( rule__SocioTechnicalSystem__Group_4__2__Impl rule__SocioTechnicalSystem__Group_4__3 )
            // InternalModa.g:1592:2: rule__SocioTechnicalSystem__Group_4__2__Impl rule__SocioTechnicalSystem__Group_4__3
            {
            pushFollow(FOLLOW_16);
            rule__SocioTechnicalSystem__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__Group_4__3();

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
    // $ANTLR end "rule__SocioTechnicalSystem__Group_4__2"


    // $ANTLR start "rule__SocioTechnicalSystem__Group_4__2__Impl"
    // InternalModa.g:1599:1: rule__SocioTechnicalSystem__Group_4__2__Impl : ( ( rule__SocioTechnicalSystem__DataAssignment_4_2 ) ) ;
    public final void rule__SocioTechnicalSystem__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1603:1: ( ( ( rule__SocioTechnicalSystem__DataAssignment_4_2 ) ) )
            // InternalModa.g:1604:1: ( ( rule__SocioTechnicalSystem__DataAssignment_4_2 ) )
            {
            // InternalModa.g:1604:1: ( ( rule__SocioTechnicalSystem__DataAssignment_4_2 ) )
            // InternalModa.g:1605:2: ( rule__SocioTechnicalSystem__DataAssignment_4_2 )
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getDataAssignment_4_2()); 
            // InternalModa.g:1606:2: ( rule__SocioTechnicalSystem__DataAssignment_4_2 )
            // InternalModa.g:1606:3: rule__SocioTechnicalSystem__DataAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__DataAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSocioTechnicalSystemAccess().getDataAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocioTechnicalSystem__Group_4__2__Impl"


    // $ANTLR start "rule__SocioTechnicalSystem__Group_4__3"
    // InternalModa.g:1614:1: rule__SocioTechnicalSystem__Group_4__3 : rule__SocioTechnicalSystem__Group_4__3__Impl rule__SocioTechnicalSystem__Group_4__4 ;
    public final void rule__SocioTechnicalSystem__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1618:1: ( rule__SocioTechnicalSystem__Group_4__3__Impl rule__SocioTechnicalSystem__Group_4__4 )
            // InternalModa.g:1619:2: rule__SocioTechnicalSystem__Group_4__3__Impl rule__SocioTechnicalSystem__Group_4__4
            {
            pushFollow(FOLLOW_16);
            rule__SocioTechnicalSystem__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__Group_4__4();

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
    // $ANTLR end "rule__SocioTechnicalSystem__Group_4__3"


    // $ANTLR start "rule__SocioTechnicalSystem__Group_4__3__Impl"
    // InternalModa.g:1626:1: rule__SocioTechnicalSystem__Group_4__3__Impl : ( ( rule__SocioTechnicalSystem__Group_4_3__0 )* ) ;
    public final void rule__SocioTechnicalSystem__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1630:1: ( ( ( rule__SocioTechnicalSystem__Group_4_3__0 )* ) )
            // InternalModa.g:1631:1: ( ( rule__SocioTechnicalSystem__Group_4_3__0 )* )
            {
            // InternalModa.g:1631:1: ( ( rule__SocioTechnicalSystem__Group_4_3__0 )* )
            // InternalModa.g:1632:2: ( rule__SocioTechnicalSystem__Group_4_3__0 )*
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getGroup_4_3()); 
            // InternalModa.g:1633:2: ( rule__SocioTechnicalSystem__Group_4_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalModa.g:1633:3: rule__SocioTechnicalSystem__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SocioTechnicalSystem__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSocioTechnicalSystemAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocioTechnicalSystem__Group_4__3__Impl"


    // $ANTLR start "rule__SocioTechnicalSystem__Group_4__4"
    // InternalModa.g:1641:1: rule__SocioTechnicalSystem__Group_4__4 : rule__SocioTechnicalSystem__Group_4__4__Impl ;
    public final void rule__SocioTechnicalSystem__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1645:1: ( rule__SocioTechnicalSystem__Group_4__4__Impl )
            // InternalModa.g:1646:2: rule__SocioTechnicalSystem__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__Group_4__4__Impl();

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
    // $ANTLR end "rule__SocioTechnicalSystem__Group_4__4"


    // $ANTLR start "rule__SocioTechnicalSystem__Group_4__4__Impl"
    // InternalModa.g:1652:1: rule__SocioTechnicalSystem__Group_4__4__Impl : ( ')' ) ;
    public final void rule__SocioTechnicalSystem__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1656:1: ( ( ')' ) )
            // InternalModa.g:1657:1: ( ')' )
            {
            // InternalModa.g:1657:1: ( ')' )
            // InternalModa.g:1658:2: ')'
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getRightParenthesisKeyword_4_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSocioTechnicalSystemAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocioTechnicalSystem__Group_4__4__Impl"


    // $ANTLR start "rule__SocioTechnicalSystem__Group_4_3__0"
    // InternalModa.g:1668:1: rule__SocioTechnicalSystem__Group_4_3__0 : rule__SocioTechnicalSystem__Group_4_3__0__Impl rule__SocioTechnicalSystem__Group_4_3__1 ;
    public final void rule__SocioTechnicalSystem__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1672:1: ( rule__SocioTechnicalSystem__Group_4_3__0__Impl rule__SocioTechnicalSystem__Group_4_3__1 )
            // InternalModa.g:1673:2: rule__SocioTechnicalSystem__Group_4_3__0__Impl rule__SocioTechnicalSystem__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__SocioTechnicalSystem__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__Group_4_3__1();

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
    // $ANTLR end "rule__SocioTechnicalSystem__Group_4_3__0"


    // $ANTLR start "rule__SocioTechnicalSystem__Group_4_3__0__Impl"
    // InternalModa.g:1680:1: rule__SocioTechnicalSystem__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__SocioTechnicalSystem__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1684:1: ( ( ',' ) )
            // InternalModa.g:1685:1: ( ',' )
            {
            // InternalModa.g:1685:1: ( ',' )
            // InternalModa.g:1686:2: ','
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getCommaKeyword_4_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSocioTechnicalSystemAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocioTechnicalSystem__Group_4_3__0__Impl"


    // $ANTLR start "rule__SocioTechnicalSystem__Group_4_3__1"
    // InternalModa.g:1695:1: rule__SocioTechnicalSystem__Group_4_3__1 : rule__SocioTechnicalSystem__Group_4_3__1__Impl ;
    public final void rule__SocioTechnicalSystem__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1699:1: ( rule__SocioTechnicalSystem__Group_4_3__1__Impl )
            // InternalModa.g:1700:2: rule__SocioTechnicalSystem__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__SocioTechnicalSystem__Group_4_3__1"


    // $ANTLR start "rule__SocioTechnicalSystem__Group_4_3__1__Impl"
    // InternalModa.g:1706:1: rule__SocioTechnicalSystem__Group_4_3__1__Impl : ( ( rule__SocioTechnicalSystem__DataAssignment_4_3_1 ) ) ;
    public final void rule__SocioTechnicalSystem__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1710:1: ( ( ( rule__SocioTechnicalSystem__DataAssignment_4_3_1 ) ) )
            // InternalModa.g:1711:1: ( ( rule__SocioTechnicalSystem__DataAssignment_4_3_1 ) )
            {
            // InternalModa.g:1711:1: ( ( rule__SocioTechnicalSystem__DataAssignment_4_3_1 ) )
            // InternalModa.g:1712:2: ( rule__SocioTechnicalSystem__DataAssignment_4_3_1 )
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getDataAssignment_4_3_1()); 
            // InternalModa.g:1713:2: ( rule__SocioTechnicalSystem__DataAssignment_4_3_1 )
            // InternalModa.g:1713:3: rule__SocioTechnicalSystem__DataAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__DataAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSocioTechnicalSystemAccess().getDataAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocioTechnicalSystem__Group_4_3__1__Impl"


    // $ANTLR start "rule__SocioTechnicalSystem__Group_5__0"
    // InternalModa.g:1722:1: rule__SocioTechnicalSystem__Group_5__0 : rule__SocioTechnicalSystem__Group_5__0__Impl rule__SocioTechnicalSystem__Group_5__1 ;
    public final void rule__SocioTechnicalSystem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1726:1: ( rule__SocioTechnicalSystem__Group_5__0__Impl rule__SocioTechnicalSystem__Group_5__1 )
            // InternalModa.g:1727:2: rule__SocioTechnicalSystem__Group_5__0__Impl rule__SocioTechnicalSystem__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__SocioTechnicalSystem__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__Group_5__1();

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
    // $ANTLR end "rule__SocioTechnicalSystem__Group_5__0"


    // $ANTLR start "rule__SocioTechnicalSystem__Group_5__0__Impl"
    // InternalModa.g:1734:1: rule__SocioTechnicalSystem__Group_5__0__Impl : ( 'prescriptivemodel' ) ;
    public final void rule__SocioTechnicalSystem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1738:1: ( ( 'prescriptivemodel' ) )
            // InternalModa.g:1739:1: ( 'prescriptivemodel' )
            {
            // InternalModa.g:1739:1: ( 'prescriptivemodel' )
            // InternalModa.g:1740:2: 'prescriptivemodel'
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getPrescriptivemodelKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSocioTechnicalSystemAccess().getPrescriptivemodelKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocioTechnicalSystem__Group_5__0__Impl"


    // $ANTLR start "rule__SocioTechnicalSystem__Group_5__1"
    // InternalModa.g:1749:1: rule__SocioTechnicalSystem__Group_5__1 : rule__SocioTechnicalSystem__Group_5__1__Impl ;
    public final void rule__SocioTechnicalSystem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1753:1: ( rule__SocioTechnicalSystem__Group_5__1__Impl )
            // InternalModa.g:1754:2: rule__SocioTechnicalSystem__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__Group_5__1__Impl();

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
    // $ANTLR end "rule__SocioTechnicalSystem__Group_5__1"


    // $ANTLR start "rule__SocioTechnicalSystem__Group_5__1__Impl"
    // InternalModa.g:1760:1: rule__SocioTechnicalSystem__Group_5__1__Impl : ( ( rule__SocioTechnicalSystem__PrescriptivemodelAssignment_5_1 ) ) ;
    public final void rule__SocioTechnicalSystem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1764:1: ( ( ( rule__SocioTechnicalSystem__PrescriptivemodelAssignment_5_1 ) ) )
            // InternalModa.g:1765:1: ( ( rule__SocioTechnicalSystem__PrescriptivemodelAssignment_5_1 ) )
            {
            // InternalModa.g:1765:1: ( ( rule__SocioTechnicalSystem__PrescriptivemodelAssignment_5_1 ) )
            // InternalModa.g:1766:2: ( rule__SocioTechnicalSystem__PrescriptivemodelAssignment_5_1 )
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getPrescriptivemodelAssignment_5_1()); 
            // InternalModa.g:1767:2: ( rule__SocioTechnicalSystem__PrescriptivemodelAssignment_5_1 )
            // InternalModa.g:1767:3: rule__SocioTechnicalSystem__PrescriptivemodelAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SocioTechnicalSystem__PrescriptivemodelAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSocioTechnicalSystemAccess().getPrescriptivemodelAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocioTechnicalSystem__Group_5__1__Impl"


    // $ANTLR start "rule__Data__Group__0"
    // InternalModa.g:1776:1: rule__Data__Group__0 : rule__Data__Group__0__Impl rule__Data__Group__1 ;
    public final void rule__Data__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1780:1: ( rule__Data__Group__0__Impl rule__Data__Group__1 )
            // InternalModa.g:1781:2: rule__Data__Group__0__Impl rule__Data__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Data__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__1();

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
    // $ANTLR end "rule__Data__Group__0"


    // $ANTLR start "rule__Data__Group__0__Impl"
    // InternalModa.g:1788:1: rule__Data__Group__0__Impl : ( () ) ;
    public final void rule__Data__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1792:1: ( ( () ) )
            // InternalModa.g:1793:1: ( () )
            {
            // InternalModa.g:1793:1: ( () )
            // InternalModa.g:1794:2: ()
            {
             before(grammarAccess.getDataAccess().getDataAction_0()); 
            // InternalModa.g:1795:2: ()
            // InternalModa.g:1795:3: 
            {
            }

             after(grammarAccess.getDataAccess().getDataAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__0__Impl"


    // $ANTLR start "rule__Data__Group__1"
    // InternalModa.g:1803:1: rule__Data__Group__1 : rule__Data__Group__1__Impl rule__Data__Group__2 ;
    public final void rule__Data__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1807:1: ( rule__Data__Group__1__Impl rule__Data__Group__2 )
            // InternalModa.g:1808:2: rule__Data__Group__1__Impl rule__Data__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Data__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__2();

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
    // $ANTLR end "rule__Data__Group__1"


    // $ANTLR start "rule__Data__Group__1__Impl"
    // InternalModa.g:1815:1: rule__Data__Group__1__Impl : ( 'Data' ) ;
    public final void rule__Data__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1819:1: ( ( 'Data' ) )
            // InternalModa.g:1820:1: ( 'Data' )
            {
            // InternalModa.g:1820:1: ( 'Data' )
            // InternalModa.g:1821:2: 'Data'
            {
             before(grammarAccess.getDataAccess().getDataKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getDataKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__1__Impl"


    // $ANTLR start "rule__Data__Group__2"
    // InternalModa.g:1830:1: rule__Data__Group__2 : rule__Data__Group__2__Impl rule__Data__Group__3 ;
    public final void rule__Data__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1834:1: ( rule__Data__Group__2__Impl rule__Data__Group__3 )
            // InternalModa.g:1835:2: rule__Data__Group__2__Impl rule__Data__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Data__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__3();

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
    // $ANTLR end "rule__Data__Group__2"


    // $ANTLR start "rule__Data__Group__2__Impl"
    // InternalModa.g:1842:1: rule__Data__Group__2__Impl : ( ( rule__Data__NameAssignment_2 ) ) ;
    public final void rule__Data__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1846:1: ( ( ( rule__Data__NameAssignment_2 ) ) )
            // InternalModa.g:1847:1: ( ( rule__Data__NameAssignment_2 ) )
            {
            // InternalModa.g:1847:1: ( ( rule__Data__NameAssignment_2 ) )
            // InternalModa.g:1848:2: ( rule__Data__NameAssignment_2 )
            {
             before(grammarAccess.getDataAccess().getNameAssignment_2()); 
            // InternalModa.g:1849:2: ( rule__Data__NameAssignment_2 )
            // InternalModa.g:1849:3: rule__Data__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Data__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__2__Impl"


    // $ANTLR start "rule__Data__Group__3"
    // InternalModa.g:1857:1: rule__Data__Group__3 : rule__Data__Group__3__Impl rule__Data__Group__4 ;
    public final void rule__Data__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1861:1: ( rule__Data__Group__3__Impl rule__Data__Group__4 )
            // InternalModa.g:1862:2: rule__Data__Group__3__Impl rule__Data__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Data__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__4();

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
    // $ANTLR end "rule__Data__Group__3"


    // $ANTLR start "rule__Data__Group__3__Impl"
    // InternalModa.g:1869:1: rule__Data__Group__3__Impl : ( '{' ) ;
    public final void rule__Data__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1873:1: ( ( '{' ) )
            // InternalModa.g:1874:1: ( '{' )
            {
            // InternalModa.g:1874:1: ( '{' )
            // InternalModa.g:1875:2: '{'
            {
             before(grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__3__Impl"


    // $ANTLR start "rule__Data__Group__4"
    // InternalModa.g:1884:1: rule__Data__Group__4 : rule__Data__Group__4__Impl rule__Data__Group__5 ;
    public final void rule__Data__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1888:1: ( rule__Data__Group__4__Impl rule__Data__Group__5 )
            // InternalModa.g:1889:2: rule__Data__Group__4__Impl rule__Data__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Data__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__5();

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
    // $ANTLR end "rule__Data__Group__4"


    // $ANTLR start "rule__Data__Group__4__Impl"
    // InternalModa.g:1896:1: rule__Data__Group__4__Impl : ( ( rule__Data__Group_4__0 )? ) ;
    public final void rule__Data__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1900:1: ( ( ( rule__Data__Group_4__0 )? ) )
            // InternalModa.g:1901:1: ( ( rule__Data__Group_4__0 )? )
            {
            // InternalModa.g:1901:1: ( ( rule__Data__Group_4__0 )? )
            // InternalModa.g:1902:2: ( rule__Data__Group_4__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_4()); 
            // InternalModa.g:1903:2: ( rule__Data__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalModa.g:1903:3: rule__Data__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Data__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__4__Impl"


    // $ANTLR start "rule__Data__Group__5"
    // InternalModa.g:1911:1: rule__Data__Group__5 : rule__Data__Group__5__Impl rule__Data__Group__6 ;
    public final void rule__Data__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1915:1: ( rule__Data__Group__5__Impl rule__Data__Group__6 )
            // InternalModa.g:1916:2: rule__Data__Group__5__Impl rule__Data__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Data__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__6();

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
    // $ANTLR end "rule__Data__Group__5"


    // $ANTLR start "rule__Data__Group__5__Impl"
    // InternalModa.g:1923:1: rule__Data__Group__5__Impl : ( ( rule__Data__Group_5__0 )? ) ;
    public final void rule__Data__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1927:1: ( ( ( rule__Data__Group_5__0 )? ) )
            // InternalModa.g:1928:1: ( ( rule__Data__Group_5__0 )? )
            {
            // InternalModa.g:1928:1: ( ( rule__Data__Group_5__0 )? )
            // InternalModa.g:1929:2: ( rule__Data__Group_5__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_5()); 
            // InternalModa.g:1930:2: ( rule__Data__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalModa.g:1930:3: rule__Data__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Data__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__5__Impl"


    // $ANTLR start "rule__Data__Group__6"
    // InternalModa.g:1938:1: rule__Data__Group__6 : rule__Data__Group__6__Impl rule__Data__Group__7 ;
    public final void rule__Data__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1942:1: ( rule__Data__Group__6__Impl rule__Data__Group__7 )
            // InternalModa.g:1943:2: rule__Data__Group__6__Impl rule__Data__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__Data__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__7();

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
    // $ANTLR end "rule__Data__Group__6"


    // $ANTLR start "rule__Data__Group__6__Impl"
    // InternalModa.g:1950:1: rule__Data__Group__6__Impl : ( ( rule__Data__Group_6__0 )? ) ;
    public final void rule__Data__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1954:1: ( ( ( rule__Data__Group_6__0 )? ) )
            // InternalModa.g:1955:1: ( ( rule__Data__Group_6__0 )? )
            {
            // InternalModa.g:1955:1: ( ( rule__Data__Group_6__0 )? )
            // InternalModa.g:1956:2: ( rule__Data__Group_6__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_6()); 
            // InternalModa.g:1957:2: ( rule__Data__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==18) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalModa.g:1957:3: rule__Data__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Data__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__6__Impl"


    // $ANTLR start "rule__Data__Group__7"
    // InternalModa.g:1965:1: rule__Data__Group__7 : rule__Data__Group__7__Impl rule__Data__Group__8 ;
    public final void rule__Data__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1969:1: ( rule__Data__Group__7__Impl rule__Data__Group__8 )
            // InternalModa.g:1970:2: rule__Data__Group__7__Impl rule__Data__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__Data__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group__8();

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
    // $ANTLR end "rule__Data__Group__7"


    // $ANTLR start "rule__Data__Group__7__Impl"
    // InternalModa.g:1977:1: rule__Data__Group__7__Impl : ( ( rule__Data__Group_7__0 )? ) ;
    public final void rule__Data__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1981:1: ( ( ( rule__Data__Group_7__0 )? ) )
            // InternalModa.g:1982:1: ( ( rule__Data__Group_7__0 )? )
            {
            // InternalModa.g:1982:1: ( ( rule__Data__Group_7__0 )? )
            // InternalModa.g:1983:2: ( rule__Data__Group_7__0 )?
            {
             before(grammarAccess.getDataAccess().getGroup_7()); 
            // InternalModa.g:1984:2: ( rule__Data__Group_7__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalModa.g:1984:3: rule__Data__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Data__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__7__Impl"


    // $ANTLR start "rule__Data__Group__8"
    // InternalModa.g:1992:1: rule__Data__Group__8 : rule__Data__Group__8__Impl ;
    public final void rule__Data__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:1996:1: ( rule__Data__Group__8__Impl )
            // InternalModa.g:1997:2: rule__Data__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group__8__Impl();

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
    // $ANTLR end "rule__Data__Group__8"


    // $ANTLR start "rule__Data__Group__8__Impl"
    // InternalModa.g:2003:1: rule__Data__Group__8__Impl : ( '}' ) ;
    public final void rule__Data__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2007:1: ( ( '}' ) )
            // InternalModa.g:2008:1: ( '}' )
            {
            // InternalModa.g:2008:1: ( '}' )
            // InternalModa.g:2009:2: '}'
            {
             before(grammarAccess.getDataAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group__8__Impl"


    // $ANTLR start "rule__Data__Group_4__0"
    // InternalModa.g:2019:1: rule__Data__Group_4__0 : rule__Data__Group_4__0__Impl rule__Data__Group_4__1 ;
    public final void rule__Data__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2023:1: ( rule__Data__Group_4__0__Impl rule__Data__Group_4__1 )
            // InternalModa.g:2024:2: rule__Data__Group_4__0__Impl rule__Data__Group_4__1
            {
            pushFollow(FOLLOW_18);
            rule__Data__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_4__1();

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
    // $ANTLR end "rule__Data__Group_4__0"


    // $ANTLR start "rule__Data__Group_4__0__Impl"
    // InternalModa.g:2031:1: rule__Data__Group_4__0__Impl : ( 'dataType' ) ;
    public final void rule__Data__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2035:1: ( ( 'dataType' ) )
            // InternalModa.g:2036:1: ( 'dataType' )
            {
            // InternalModa.g:2036:1: ( 'dataType' )
            // InternalModa.g:2037:2: 'dataType'
            {
             before(grammarAccess.getDataAccess().getDataTypeKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getDataTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_4__0__Impl"


    // $ANTLR start "rule__Data__Group_4__1"
    // InternalModa.g:2046:1: rule__Data__Group_4__1 : rule__Data__Group_4__1__Impl ;
    public final void rule__Data__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2050:1: ( rule__Data__Group_4__1__Impl )
            // InternalModa.g:2051:2: rule__Data__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group_4__1__Impl();

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
    // $ANTLR end "rule__Data__Group_4__1"


    // $ANTLR start "rule__Data__Group_4__1__Impl"
    // InternalModa.g:2057:1: rule__Data__Group_4__1__Impl : ( ( rule__Data__DataTypeAssignment_4_1 ) ) ;
    public final void rule__Data__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2061:1: ( ( ( rule__Data__DataTypeAssignment_4_1 ) ) )
            // InternalModa.g:2062:1: ( ( rule__Data__DataTypeAssignment_4_1 ) )
            {
            // InternalModa.g:2062:1: ( ( rule__Data__DataTypeAssignment_4_1 ) )
            // InternalModa.g:2063:2: ( rule__Data__DataTypeAssignment_4_1 )
            {
             before(grammarAccess.getDataAccess().getDataTypeAssignment_4_1()); 
            // InternalModa.g:2064:2: ( rule__Data__DataTypeAssignment_4_1 )
            // InternalModa.g:2064:3: rule__Data__DataTypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Data__DataTypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getDataTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_4__1__Impl"


    // $ANTLR start "rule__Data__Group_5__0"
    // InternalModa.g:2073:1: rule__Data__Group_5__0 : rule__Data__Group_5__0__Impl rule__Data__Group_5__1 ;
    public final void rule__Data__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2077:1: ( rule__Data__Group_5__0__Impl rule__Data__Group_5__1 )
            // InternalModa.g:2078:2: rule__Data__Group_5__0__Impl rule__Data__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Data__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_5__1();

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
    // $ANTLR end "rule__Data__Group_5__0"


    // $ANTLR start "rule__Data__Group_5__0__Impl"
    // InternalModa.g:2085:1: rule__Data__Group_5__0__Impl : ( 'software' ) ;
    public final void rule__Data__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2089:1: ( ( 'software' ) )
            // InternalModa.g:2090:1: ( 'software' )
            {
            // InternalModa.g:2090:1: ( 'software' )
            // InternalModa.g:2091:2: 'software'
            {
             before(grammarAccess.getDataAccess().getSoftwareKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getSoftwareKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_5__0__Impl"


    // $ANTLR start "rule__Data__Group_5__1"
    // InternalModa.g:2100:1: rule__Data__Group_5__1 : rule__Data__Group_5__1__Impl ;
    public final void rule__Data__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2104:1: ( rule__Data__Group_5__1__Impl )
            // InternalModa.g:2105:2: rule__Data__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group_5__1__Impl();

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
    // $ANTLR end "rule__Data__Group_5__1"


    // $ANTLR start "rule__Data__Group_5__1__Impl"
    // InternalModa.g:2111:1: rule__Data__Group_5__1__Impl : ( ( rule__Data__SoftwareAssignment_5_1 ) ) ;
    public final void rule__Data__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2115:1: ( ( ( rule__Data__SoftwareAssignment_5_1 ) ) )
            // InternalModa.g:2116:1: ( ( rule__Data__SoftwareAssignment_5_1 ) )
            {
            // InternalModa.g:2116:1: ( ( rule__Data__SoftwareAssignment_5_1 ) )
            // InternalModa.g:2117:2: ( rule__Data__SoftwareAssignment_5_1 )
            {
             before(grammarAccess.getDataAccess().getSoftwareAssignment_5_1()); 
            // InternalModa.g:2118:2: ( rule__Data__SoftwareAssignment_5_1 )
            // InternalModa.g:2118:3: rule__Data__SoftwareAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Data__SoftwareAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getSoftwareAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_5__1__Impl"


    // $ANTLR start "rule__Data__Group_6__0"
    // InternalModa.g:2127:1: rule__Data__Group_6__0 : rule__Data__Group_6__0__Impl rule__Data__Group_6__1 ;
    public final void rule__Data__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2131:1: ( rule__Data__Group_6__0__Impl rule__Data__Group_6__1 )
            // InternalModa.g:2132:2: rule__Data__Group_6__0__Impl rule__Data__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Data__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_6__1();

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
    // $ANTLR end "rule__Data__Group_6__0"


    // $ANTLR start "rule__Data__Group_6__0__Impl"
    // InternalModa.g:2139:1: rule__Data__Group_6__0__Impl : ( 'sociotechnicalsystem' ) ;
    public final void rule__Data__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2143:1: ( ( 'sociotechnicalsystem' ) )
            // InternalModa.g:2144:1: ( 'sociotechnicalsystem' )
            {
            // InternalModa.g:2144:1: ( 'sociotechnicalsystem' )
            // InternalModa.g:2145:2: 'sociotechnicalsystem'
            {
             before(grammarAccess.getDataAccess().getSociotechnicalsystemKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getSociotechnicalsystemKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_6__0__Impl"


    // $ANTLR start "rule__Data__Group_6__1"
    // InternalModa.g:2154:1: rule__Data__Group_6__1 : rule__Data__Group_6__1__Impl ;
    public final void rule__Data__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2158:1: ( rule__Data__Group_6__1__Impl )
            // InternalModa.g:2159:2: rule__Data__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group_6__1__Impl();

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
    // $ANTLR end "rule__Data__Group_6__1"


    // $ANTLR start "rule__Data__Group_6__1__Impl"
    // InternalModa.g:2165:1: rule__Data__Group_6__1__Impl : ( ( rule__Data__SociotechnicalsystemAssignment_6_1 ) ) ;
    public final void rule__Data__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2169:1: ( ( ( rule__Data__SociotechnicalsystemAssignment_6_1 ) ) )
            // InternalModa.g:2170:1: ( ( rule__Data__SociotechnicalsystemAssignment_6_1 ) )
            {
            // InternalModa.g:2170:1: ( ( rule__Data__SociotechnicalsystemAssignment_6_1 ) )
            // InternalModa.g:2171:2: ( rule__Data__SociotechnicalsystemAssignment_6_1 )
            {
             before(grammarAccess.getDataAccess().getSociotechnicalsystemAssignment_6_1()); 
            // InternalModa.g:2172:2: ( rule__Data__SociotechnicalsystemAssignment_6_1 )
            // InternalModa.g:2172:3: rule__Data__SociotechnicalsystemAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Data__SociotechnicalsystemAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getSociotechnicalsystemAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_6__1__Impl"


    // $ANTLR start "rule__Data__Group_7__0"
    // InternalModa.g:2181:1: rule__Data__Group_7__0 : rule__Data__Group_7__0__Impl rule__Data__Group_7__1 ;
    public final void rule__Data__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2185:1: ( rule__Data__Group_7__0__Impl rule__Data__Group_7__1 )
            // InternalModa.g:2186:2: rule__Data__Group_7__0__Impl rule__Data__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Data__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Data__Group_7__1();

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
    // $ANTLR end "rule__Data__Group_7__0"


    // $ANTLR start "rule__Data__Group_7__0__Impl"
    // InternalModa.g:2193:1: rule__Data__Group_7__0__Impl : ( 'modelrole' ) ;
    public final void rule__Data__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2197:1: ( ( 'modelrole' ) )
            // InternalModa.g:2198:1: ( 'modelrole' )
            {
            // InternalModa.g:2198:1: ( 'modelrole' )
            // InternalModa.g:2199:2: 'modelrole'
            {
             before(grammarAccess.getDataAccess().getModelroleKeyword_7_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDataAccess().getModelroleKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_7__0__Impl"


    // $ANTLR start "rule__Data__Group_7__1"
    // InternalModa.g:2208:1: rule__Data__Group_7__1 : rule__Data__Group_7__1__Impl ;
    public final void rule__Data__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2212:1: ( rule__Data__Group_7__1__Impl )
            // InternalModa.g:2213:2: rule__Data__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Data__Group_7__1__Impl();

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
    // $ANTLR end "rule__Data__Group_7__1"


    // $ANTLR start "rule__Data__Group_7__1__Impl"
    // InternalModa.g:2219:1: rule__Data__Group_7__1__Impl : ( ( rule__Data__ModelroleAssignment_7_1 ) ) ;
    public final void rule__Data__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2223:1: ( ( ( rule__Data__ModelroleAssignment_7_1 ) ) )
            // InternalModa.g:2224:1: ( ( rule__Data__ModelroleAssignment_7_1 ) )
            {
            // InternalModa.g:2224:1: ( ( rule__Data__ModelroleAssignment_7_1 ) )
            // InternalModa.g:2225:2: ( rule__Data__ModelroleAssignment_7_1 )
            {
             before(grammarAccess.getDataAccess().getModelroleAssignment_7_1()); 
            // InternalModa.g:2226:2: ( rule__Data__ModelroleAssignment_7_1 )
            // InternalModa.g:2226:3: rule__Data__ModelroleAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Data__ModelroleAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDataAccess().getModelroleAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__Group_7__1__Impl"


    // $ANTLR start "rule__Software__Group__0"
    // InternalModa.g:2235:1: rule__Software__Group__0 : rule__Software__Group__0__Impl rule__Software__Group__1 ;
    public final void rule__Software__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2239:1: ( rule__Software__Group__0__Impl rule__Software__Group__1 )
            // InternalModa.g:2240:2: rule__Software__Group__0__Impl rule__Software__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Software__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Software__Group__1();

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
    // $ANTLR end "rule__Software__Group__0"


    // $ANTLR start "rule__Software__Group__0__Impl"
    // InternalModa.g:2247:1: rule__Software__Group__0__Impl : ( () ) ;
    public final void rule__Software__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2251:1: ( ( () ) )
            // InternalModa.g:2252:1: ( () )
            {
            // InternalModa.g:2252:1: ( () )
            // InternalModa.g:2253:2: ()
            {
             before(grammarAccess.getSoftwareAccess().getSoftwareAction_0()); 
            // InternalModa.g:2254:2: ()
            // InternalModa.g:2254:3: 
            {
            }

             after(grammarAccess.getSoftwareAccess().getSoftwareAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__0__Impl"


    // $ANTLR start "rule__Software__Group__1"
    // InternalModa.g:2262:1: rule__Software__Group__1 : rule__Software__Group__1__Impl rule__Software__Group__2 ;
    public final void rule__Software__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2266:1: ( rule__Software__Group__1__Impl rule__Software__Group__2 )
            // InternalModa.g:2267:2: rule__Software__Group__1__Impl rule__Software__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Software__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Software__Group__2();

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
    // $ANTLR end "rule__Software__Group__1"


    // $ANTLR start "rule__Software__Group__1__Impl"
    // InternalModa.g:2274:1: rule__Software__Group__1__Impl : ( 'Software' ) ;
    public final void rule__Software__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2278:1: ( ( 'Software' ) )
            // InternalModa.g:2279:1: ( 'Software' )
            {
            // InternalModa.g:2279:1: ( 'Software' )
            // InternalModa.g:2280:2: 'Software'
            {
             before(grammarAccess.getSoftwareAccess().getSoftwareKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSoftwareAccess().getSoftwareKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__1__Impl"


    // $ANTLR start "rule__Software__Group__2"
    // InternalModa.g:2289:1: rule__Software__Group__2 : rule__Software__Group__2__Impl rule__Software__Group__3 ;
    public final void rule__Software__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2293:1: ( rule__Software__Group__2__Impl rule__Software__Group__3 )
            // InternalModa.g:2294:2: rule__Software__Group__2__Impl rule__Software__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Software__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Software__Group__3();

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
    // $ANTLR end "rule__Software__Group__2"


    // $ANTLR start "rule__Software__Group__2__Impl"
    // InternalModa.g:2301:1: rule__Software__Group__2__Impl : ( ( rule__Software__NameAssignment_2 ) ) ;
    public final void rule__Software__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2305:1: ( ( ( rule__Software__NameAssignment_2 ) ) )
            // InternalModa.g:2306:1: ( ( rule__Software__NameAssignment_2 ) )
            {
            // InternalModa.g:2306:1: ( ( rule__Software__NameAssignment_2 ) )
            // InternalModa.g:2307:2: ( rule__Software__NameAssignment_2 )
            {
             before(grammarAccess.getSoftwareAccess().getNameAssignment_2()); 
            // InternalModa.g:2308:2: ( rule__Software__NameAssignment_2 )
            // InternalModa.g:2308:3: rule__Software__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Software__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSoftwareAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__2__Impl"


    // $ANTLR start "rule__Software__Group__3"
    // InternalModa.g:2316:1: rule__Software__Group__3 : rule__Software__Group__3__Impl rule__Software__Group__4 ;
    public final void rule__Software__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2320:1: ( rule__Software__Group__3__Impl rule__Software__Group__4 )
            // InternalModa.g:2321:2: rule__Software__Group__3__Impl rule__Software__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Software__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Software__Group__4();

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
    // $ANTLR end "rule__Software__Group__3"


    // $ANTLR start "rule__Software__Group__3__Impl"
    // InternalModa.g:2328:1: rule__Software__Group__3__Impl : ( '{' ) ;
    public final void rule__Software__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2332:1: ( ( '{' ) )
            // InternalModa.g:2333:1: ( '{' )
            {
            // InternalModa.g:2333:1: ( '{' )
            // InternalModa.g:2334:2: '{'
            {
             before(grammarAccess.getSoftwareAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSoftwareAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__3__Impl"


    // $ANTLR start "rule__Software__Group__4"
    // InternalModa.g:2343:1: rule__Software__Group__4 : rule__Software__Group__4__Impl rule__Software__Group__5 ;
    public final void rule__Software__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2347:1: ( rule__Software__Group__4__Impl rule__Software__Group__5 )
            // InternalModa.g:2348:2: rule__Software__Group__4__Impl rule__Software__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Software__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Software__Group__5();

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
    // $ANTLR end "rule__Software__Group__4"


    // $ANTLR start "rule__Software__Group__4__Impl"
    // InternalModa.g:2355:1: rule__Software__Group__4__Impl : ( ( rule__Software__Group_4__0 )? ) ;
    public final void rule__Software__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2359:1: ( ( ( rule__Software__Group_4__0 )? ) )
            // InternalModa.g:2360:1: ( ( rule__Software__Group_4__0 )? )
            {
            // InternalModa.g:2360:1: ( ( rule__Software__Group_4__0 )? )
            // InternalModa.g:2361:2: ( rule__Software__Group_4__0 )?
            {
             before(grammarAccess.getSoftwareAccess().getGroup_4()); 
            // InternalModa.g:2362:2: ( rule__Software__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalModa.g:2362:3: rule__Software__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Software__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSoftwareAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__4__Impl"


    // $ANTLR start "rule__Software__Group__5"
    // InternalModa.g:2370:1: rule__Software__Group__5 : rule__Software__Group__5__Impl rule__Software__Group__6 ;
    public final void rule__Software__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2374:1: ( rule__Software__Group__5__Impl rule__Software__Group__6 )
            // InternalModa.g:2375:2: rule__Software__Group__5__Impl rule__Software__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Software__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Software__Group__6();

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
    // $ANTLR end "rule__Software__Group__5"


    // $ANTLR start "rule__Software__Group__5__Impl"
    // InternalModa.g:2382:1: rule__Software__Group__5__Impl : ( ( rule__Software__Group_5__0 )? ) ;
    public final void rule__Software__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2386:1: ( ( ( rule__Software__Group_5__0 )? ) )
            // InternalModa.g:2387:1: ( ( rule__Software__Group_5__0 )? )
            {
            // InternalModa.g:2387:1: ( ( rule__Software__Group_5__0 )? )
            // InternalModa.g:2388:2: ( rule__Software__Group_5__0 )?
            {
             before(grammarAccess.getSoftwareAccess().getGroup_5()); 
            // InternalModa.g:2389:2: ( rule__Software__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==19) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalModa.g:2389:3: rule__Software__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Software__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSoftwareAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__5__Impl"


    // $ANTLR start "rule__Software__Group__6"
    // InternalModa.g:2397:1: rule__Software__Group__6 : rule__Software__Group__6__Impl rule__Software__Group__7 ;
    public final void rule__Software__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2401:1: ( rule__Software__Group__6__Impl rule__Software__Group__7 )
            // InternalModa.g:2402:2: rule__Software__Group__6__Impl rule__Software__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Software__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Software__Group__7();

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
    // $ANTLR end "rule__Software__Group__6"


    // $ANTLR start "rule__Software__Group__6__Impl"
    // InternalModa.g:2409:1: rule__Software__Group__6__Impl : ( ( rule__Software__Group_6__0 )? ) ;
    public final void rule__Software__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2413:1: ( ( ( rule__Software__Group_6__0 )? ) )
            // InternalModa.g:2414:1: ( ( rule__Software__Group_6__0 )? )
            {
            // InternalModa.g:2414:1: ( ( rule__Software__Group_6__0 )? )
            // InternalModa.g:2415:2: ( rule__Software__Group_6__0 )?
            {
             before(grammarAccess.getSoftwareAccess().getGroup_6()); 
            // InternalModa.g:2416:2: ( rule__Software__Group_6__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalModa.g:2416:3: rule__Software__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Software__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSoftwareAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__6__Impl"


    // $ANTLR start "rule__Software__Group__7"
    // InternalModa.g:2424:1: rule__Software__Group__7 : rule__Software__Group__7__Impl ;
    public final void rule__Software__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2428:1: ( rule__Software__Group__7__Impl )
            // InternalModa.g:2429:2: rule__Software__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Software__Group__7__Impl();

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
    // $ANTLR end "rule__Software__Group__7"


    // $ANTLR start "rule__Software__Group__7__Impl"
    // InternalModa.g:2435:1: rule__Software__Group__7__Impl : ( '}' ) ;
    public final void rule__Software__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2439:1: ( ( '}' ) )
            // InternalModa.g:2440:1: ( '}' )
            {
            // InternalModa.g:2440:1: ( '}' )
            // InternalModa.g:2441:2: '}'
            {
             before(grammarAccess.getSoftwareAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSoftwareAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group__7__Impl"


    // $ANTLR start "rule__Software__Group_4__0"
    // InternalModa.g:2451:1: rule__Software__Group_4__0 : rule__Software__Group_4__0__Impl rule__Software__Group_4__1 ;
    public final void rule__Software__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2455:1: ( rule__Software__Group_4__0__Impl rule__Software__Group_4__1 )
            // InternalModa.g:2456:2: rule__Software__Group_4__0__Impl rule__Software__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Software__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Software__Group_4__1();

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
    // $ANTLR end "rule__Software__Group_4__0"


    // $ANTLR start "rule__Software__Group_4__0__Impl"
    // InternalModa.g:2463:1: rule__Software__Group_4__0__Impl : ( 'state' ) ;
    public final void rule__Software__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2467:1: ( ( 'state' ) )
            // InternalModa.g:2468:1: ( 'state' )
            {
            // InternalModa.g:2468:1: ( 'state' )
            // InternalModa.g:2469:2: 'state'
            {
             before(grammarAccess.getSoftwareAccess().getStateKeyword_4_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSoftwareAccess().getStateKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_4__0__Impl"


    // $ANTLR start "rule__Software__Group_4__1"
    // InternalModa.g:2478:1: rule__Software__Group_4__1 : rule__Software__Group_4__1__Impl ;
    public final void rule__Software__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2482:1: ( rule__Software__Group_4__1__Impl )
            // InternalModa.g:2483:2: rule__Software__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Software__Group_4__1__Impl();

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
    // $ANTLR end "rule__Software__Group_4__1"


    // $ANTLR start "rule__Software__Group_4__1__Impl"
    // InternalModa.g:2489:1: rule__Software__Group_4__1__Impl : ( ( rule__Software__StateAssignment_4_1 ) ) ;
    public final void rule__Software__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2493:1: ( ( ( rule__Software__StateAssignment_4_1 ) ) )
            // InternalModa.g:2494:1: ( ( rule__Software__StateAssignment_4_1 ) )
            {
            // InternalModa.g:2494:1: ( ( rule__Software__StateAssignment_4_1 ) )
            // InternalModa.g:2495:2: ( rule__Software__StateAssignment_4_1 )
            {
             before(grammarAccess.getSoftwareAccess().getStateAssignment_4_1()); 
            // InternalModa.g:2496:2: ( rule__Software__StateAssignment_4_1 )
            // InternalModa.g:2496:3: rule__Software__StateAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Software__StateAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSoftwareAccess().getStateAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_4__1__Impl"


    // $ANTLR start "rule__Software__Group_5__0"
    // InternalModa.g:2505:1: rule__Software__Group_5__0 : rule__Software__Group_5__0__Impl rule__Software__Group_5__1 ;
    public final void rule__Software__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2509:1: ( rule__Software__Group_5__0__Impl rule__Software__Group_5__1 )
            // InternalModa.g:2510:2: rule__Software__Group_5__0__Impl rule__Software__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__Software__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Software__Group_5__1();

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
    // $ANTLR end "rule__Software__Group_5__0"


    // $ANTLR start "rule__Software__Group_5__0__Impl"
    // InternalModa.g:2517:1: rule__Software__Group_5__0__Impl : ( 'data' ) ;
    public final void rule__Software__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2521:1: ( ( 'data' ) )
            // InternalModa.g:2522:1: ( 'data' )
            {
            // InternalModa.g:2522:1: ( 'data' )
            // InternalModa.g:2523:2: 'data'
            {
             before(grammarAccess.getSoftwareAccess().getDataKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSoftwareAccess().getDataKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_5__0__Impl"


    // $ANTLR start "rule__Software__Group_5__1"
    // InternalModa.g:2532:1: rule__Software__Group_5__1 : rule__Software__Group_5__1__Impl rule__Software__Group_5__2 ;
    public final void rule__Software__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2536:1: ( rule__Software__Group_5__1__Impl rule__Software__Group_5__2 )
            // InternalModa.g:2537:2: rule__Software__Group_5__1__Impl rule__Software__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__Software__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Software__Group_5__2();

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
    // $ANTLR end "rule__Software__Group_5__1"


    // $ANTLR start "rule__Software__Group_5__1__Impl"
    // InternalModa.g:2544:1: rule__Software__Group_5__1__Impl : ( '(' ) ;
    public final void rule__Software__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2548:1: ( ( '(' ) )
            // InternalModa.g:2549:1: ( '(' )
            {
            // InternalModa.g:2549:1: ( '(' )
            // InternalModa.g:2550:2: '('
            {
             before(grammarAccess.getSoftwareAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSoftwareAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_5__1__Impl"


    // $ANTLR start "rule__Software__Group_5__2"
    // InternalModa.g:2559:1: rule__Software__Group_5__2 : rule__Software__Group_5__2__Impl rule__Software__Group_5__3 ;
    public final void rule__Software__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2563:1: ( rule__Software__Group_5__2__Impl rule__Software__Group_5__3 )
            // InternalModa.g:2564:2: rule__Software__Group_5__2__Impl rule__Software__Group_5__3
            {
            pushFollow(FOLLOW_16);
            rule__Software__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Software__Group_5__3();

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
    // $ANTLR end "rule__Software__Group_5__2"


    // $ANTLR start "rule__Software__Group_5__2__Impl"
    // InternalModa.g:2571:1: rule__Software__Group_5__2__Impl : ( ( rule__Software__DataAssignment_5_2 ) ) ;
    public final void rule__Software__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2575:1: ( ( ( rule__Software__DataAssignment_5_2 ) ) )
            // InternalModa.g:2576:1: ( ( rule__Software__DataAssignment_5_2 ) )
            {
            // InternalModa.g:2576:1: ( ( rule__Software__DataAssignment_5_2 ) )
            // InternalModa.g:2577:2: ( rule__Software__DataAssignment_5_2 )
            {
             before(grammarAccess.getSoftwareAccess().getDataAssignment_5_2()); 
            // InternalModa.g:2578:2: ( rule__Software__DataAssignment_5_2 )
            // InternalModa.g:2578:3: rule__Software__DataAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Software__DataAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getSoftwareAccess().getDataAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_5__2__Impl"


    // $ANTLR start "rule__Software__Group_5__3"
    // InternalModa.g:2586:1: rule__Software__Group_5__3 : rule__Software__Group_5__3__Impl rule__Software__Group_5__4 ;
    public final void rule__Software__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2590:1: ( rule__Software__Group_5__3__Impl rule__Software__Group_5__4 )
            // InternalModa.g:2591:2: rule__Software__Group_5__3__Impl rule__Software__Group_5__4
            {
            pushFollow(FOLLOW_16);
            rule__Software__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Software__Group_5__4();

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
    // $ANTLR end "rule__Software__Group_5__3"


    // $ANTLR start "rule__Software__Group_5__3__Impl"
    // InternalModa.g:2598:1: rule__Software__Group_5__3__Impl : ( ( rule__Software__Group_5_3__0 )* ) ;
    public final void rule__Software__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2602:1: ( ( ( rule__Software__Group_5_3__0 )* ) )
            // InternalModa.g:2603:1: ( ( rule__Software__Group_5_3__0 )* )
            {
            // InternalModa.g:2603:1: ( ( rule__Software__Group_5_3__0 )* )
            // InternalModa.g:2604:2: ( rule__Software__Group_5_3__0 )*
            {
             before(grammarAccess.getSoftwareAccess().getGroup_5_3()); 
            // InternalModa.g:2605:2: ( rule__Software__Group_5_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalModa.g:2605:3: rule__Software__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Software__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSoftwareAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_5__3__Impl"


    // $ANTLR start "rule__Software__Group_5__4"
    // InternalModa.g:2613:1: rule__Software__Group_5__4 : rule__Software__Group_5__4__Impl ;
    public final void rule__Software__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2617:1: ( rule__Software__Group_5__4__Impl )
            // InternalModa.g:2618:2: rule__Software__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Software__Group_5__4__Impl();

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
    // $ANTLR end "rule__Software__Group_5__4"


    // $ANTLR start "rule__Software__Group_5__4__Impl"
    // InternalModa.g:2624:1: rule__Software__Group_5__4__Impl : ( ')' ) ;
    public final void rule__Software__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2628:1: ( ( ')' ) )
            // InternalModa.g:2629:1: ( ')' )
            {
            // InternalModa.g:2629:1: ( ')' )
            // InternalModa.g:2630:2: ')'
            {
             before(grammarAccess.getSoftwareAccess().getRightParenthesisKeyword_5_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSoftwareAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_5__4__Impl"


    // $ANTLR start "rule__Software__Group_5_3__0"
    // InternalModa.g:2640:1: rule__Software__Group_5_3__0 : rule__Software__Group_5_3__0__Impl rule__Software__Group_5_3__1 ;
    public final void rule__Software__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2644:1: ( rule__Software__Group_5_3__0__Impl rule__Software__Group_5_3__1 )
            // InternalModa.g:2645:2: rule__Software__Group_5_3__0__Impl rule__Software__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Software__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Software__Group_5_3__1();

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
    // $ANTLR end "rule__Software__Group_5_3__0"


    // $ANTLR start "rule__Software__Group_5_3__0__Impl"
    // InternalModa.g:2652:1: rule__Software__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Software__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2656:1: ( ( ',' ) )
            // InternalModa.g:2657:1: ( ',' )
            {
            // InternalModa.g:2657:1: ( ',' )
            // InternalModa.g:2658:2: ','
            {
             before(grammarAccess.getSoftwareAccess().getCommaKeyword_5_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSoftwareAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_5_3__0__Impl"


    // $ANTLR start "rule__Software__Group_5_3__1"
    // InternalModa.g:2667:1: rule__Software__Group_5_3__1 : rule__Software__Group_5_3__1__Impl ;
    public final void rule__Software__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2671:1: ( rule__Software__Group_5_3__1__Impl )
            // InternalModa.g:2672:2: rule__Software__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Software__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Software__Group_5_3__1"


    // $ANTLR start "rule__Software__Group_5_3__1__Impl"
    // InternalModa.g:2678:1: rule__Software__Group_5_3__1__Impl : ( ( rule__Software__DataAssignment_5_3_1 ) ) ;
    public final void rule__Software__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2682:1: ( ( ( rule__Software__DataAssignment_5_3_1 ) ) )
            // InternalModa.g:2683:1: ( ( rule__Software__DataAssignment_5_3_1 ) )
            {
            // InternalModa.g:2683:1: ( ( rule__Software__DataAssignment_5_3_1 ) )
            // InternalModa.g:2684:2: ( rule__Software__DataAssignment_5_3_1 )
            {
             before(grammarAccess.getSoftwareAccess().getDataAssignment_5_3_1()); 
            // InternalModa.g:2685:2: ( rule__Software__DataAssignment_5_3_1 )
            // InternalModa.g:2685:3: rule__Software__DataAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Software__DataAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSoftwareAccess().getDataAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_5_3__1__Impl"


    // $ANTLR start "rule__Software__Group_6__0"
    // InternalModa.g:2694:1: rule__Software__Group_6__0 : rule__Software__Group_6__0__Impl rule__Software__Group_6__1 ;
    public final void rule__Software__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2698:1: ( rule__Software__Group_6__0__Impl rule__Software__Group_6__1 )
            // InternalModa.g:2699:2: rule__Software__Group_6__0__Impl rule__Software__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Software__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Software__Group_6__1();

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
    // $ANTLR end "rule__Software__Group_6__0"


    // $ANTLR start "rule__Software__Group_6__0__Impl"
    // InternalModa.g:2706:1: rule__Software__Group_6__0__Impl : ( 'prescriptivemodel' ) ;
    public final void rule__Software__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2710:1: ( ( 'prescriptivemodel' ) )
            // InternalModa.g:2711:1: ( 'prescriptivemodel' )
            {
            // InternalModa.g:2711:1: ( 'prescriptivemodel' )
            // InternalModa.g:2712:2: 'prescriptivemodel'
            {
             before(grammarAccess.getSoftwareAccess().getPrescriptivemodelKeyword_6_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSoftwareAccess().getPrescriptivemodelKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_6__0__Impl"


    // $ANTLR start "rule__Software__Group_6__1"
    // InternalModa.g:2721:1: rule__Software__Group_6__1 : rule__Software__Group_6__1__Impl ;
    public final void rule__Software__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2725:1: ( rule__Software__Group_6__1__Impl )
            // InternalModa.g:2726:2: rule__Software__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Software__Group_6__1__Impl();

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
    // $ANTLR end "rule__Software__Group_6__1"


    // $ANTLR start "rule__Software__Group_6__1__Impl"
    // InternalModa.g:2732:1: rule__Software__Group_6__1__Impl : ( ( rule__Software__PrescriptivemodelAssignment_6_1 ) ) ;
    public final void rule__Software__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2736:1: ( ( ( rule__Software__PrescriptivemodelAssignment_6_1 ) ) )
            // InternalModa.g:2737:1: ( ( rule__Software__PrescriptivemodelAssignment_6_1 ) )
            {
            // InternalModa.g:2737:1: ( ( rule__Software__PrescriptivemodelAssignment_6_1 ) )
            // InternalModa.g:2738:2: ( rule__Software__PrescriptivemodelAssignment_6_1 )
            {
             before(grammarAccess.getSoftwareAccess().getPrescriptivemodelAssignment_6_1()); 
            // InternalModa.g:2739:2: ( rule__Software__PrescriptivemodelAssignment_6_1 )
            // InternalModa.g:2739:3: rule__Software__PrescriptivemodelAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Software__PrescriptivemodelAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSoftwareAccess().getPrescriptivemodelAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__Group_6__1__Impl"


    // $ANTLR start "rule__Model__Group__0"
    // InternalModa.g:2748:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2752:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalModa.g:2753:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalModa.g:2760:1: rule__Model__Group__0__Impl : ( () ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2764:1: ( ( () ) )
            // InternalModa.g:2765:1: ( () )
            {
            // InternalModa.g:2765:1: ( () )
            // InternalModa.g:2766:2: ()
            {
             before(grammarAccess.getModelAccess().getModelAction_0()); 
            // InternalModa.g:2767:2: ()
            // InternalModa.g:2767:3: 
            {
            }

             after(grammarAccess.getModelAccess().getModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalModa.g:2775:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2779:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalModa.g:2780:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalModa.g:2787:1: rule__Model__Group__1__Impl : ( 'Model' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2791:1: ( ( 'Model' ) )
            // InternalModa.g:2792:1: ( 'Model' )
            {
            // InternalModa.g:2792:1: ( 'Model' )
            // InternalModa.g:2793:2: 'Model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalModa.g:2802:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2806:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalModa.g:2807:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalModa.g:2814:1: rule__Model__Group__2__Impl : ( ( rule__Model__NameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2818:1: ( ( ( rule__Model__NameAssignment_2 ) ) )
            // InternalModa.g:2819:1: ( ( rule__Model__NameAssignment_2 ) )
            {
            // InternalModa.g:2819:1: ( ( rule__Model__NameAssignment_2 ) )
            // InternalModa.g:2820:2: ( rule__Model__NameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_2()); 
            // InternalModa.g:2821:2: ( rule__Model__NameAssignment_2 )
            // InternalModa.g:2821:3: rule__Model__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalModa.g:2829:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2833:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalModa.g:2834:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalModa.g:2841:1: rule__Model__Group__3__Impl : ( '{' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2845:1: ( ( '{' ) )
            // InternalModa.g:2846:1: ( '{' )
            {
            // InternalModa.g:2846:1: ( '{' )
            // InternalModa.g:2847:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalModa.g:2856:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2860:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalModa.g:2861:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalModa.g:2868:1: rule__Model__Group__4__Impl : ( ( rule__Model__Group_4__0 )? ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2872:1: ( ( ( rule__Model__Group_4__0 )? ) )
            // InternalModa.g:2873:1: ( ( rule__Model__Group_4__0 )? )
            {
            // InternalModa.g:2873:1: ( ( rule__Model__Group_4__0 )? )
            // InternalModa.g:2874:2: ( rule__Model__Group_4__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_4()); 
            // InternalModa.g:2875:2: ( rule__Model__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalModa.g:2875:3: rule__Model__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalModa.g:2883:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2887:1: ( rule__Model__Group__5__Impl )
            // InternalModa.g:2888:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__5__Impl();

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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalModa.g:2894:1: rule__Model__Group__5__Impl : ( '}' ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2898:1: ( ( '}' ) )
            // InternalModa.g:2899:1: ( '}' )
            {
            // InternalModa.g:2899:1: ( '}' )
            // InternalModa.g:2900:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group_4__0"
    // InternalModa.g:2910:1: rule__Model__Group_4__0 : rule__Model__Group_4__0__Impl rule__Model__Group_4__1 ;
    public final void rule__Model__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2914:1: ( rule__Model__Group_4__0__Impl rule__Model__Group_4__1 )
            // InternalModa.g:2915:2: rule__Model__Group_4__0__Impl rule__Model__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Model__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_4__1();

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
    // $ANTLR end "rule__Model__Group_4__0"


    // $ANTLR start "rule__Model__Group_4__0__Impl"
    // InternalModa.g:2922:1: rule__Model__Group_4__0__Impl : ( 'modelrole' ) ;
    public final void rule__Model__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2926:1: ( ( 'modelrole' ) )
            // InternalModa.g:2927:1: ( 'modelrole' )
            {
            // InternalModa.g:2927:1: ( 'modelrole' )
            // InternalModa.g:2928:2: 'modelrole'
            {
             before(grammarAccess.getModelAccess().getModelroleKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelroleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__0__Impl"


    // $ANTLR start "rule__Model__Group_4__1"
    // InternalModa.g:2937:1: rule__Model__Group_4__1 : rule__Model__Group_4__1__Impl rule__Model__Group_4__2 ;
    public final void rule__Model__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2941:1: ( rule__Model__Group_4__1__Impl rule__Model__Group_4__2 )
            // InternalModa.g:2942:2: rule__Model__Group_4__1__Impl rule__Model__Group_4__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_4__2();

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
    // $ANTLR end "rule__Model__Group_4__1"


    // $ANTLR start "rule__Model__Group_4__1__Impl"
    // InternalModa.g:2949:1: rule__Model__Group_4__1__Impl : ( '(' ) ;
    public final void rule__Model__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2953:1: ( ( '(' ) )
            // InternalModa.g:2954:1: ( '(' )
            {
            // InternalModa.g:2954:1: ( '(' )
            // InternalModa.g:2955:2: '('
            {
             before(grammarAccess.getModelAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__1__Impl"


    // $ANTLR start "rule__Model__Group_4__2"
    // InternalModa.g:2964:1: rule__Model__Group_4__2 : rule__Model__Group_4__2__Impl rule__Model__Group_4__3 ;
    public final void rule__Model__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2968:1: ( rule__Model__Group_4__2__Impl rule__Model__Group_4__3 )
            // InternalModa.g:2969:2: rule__Model__Group_4__2__Impl rule__Model__Group_4__3
            {
            pushFollow(FOLLOW_16);
            rule__Model__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_4__3();

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
    // $ANTLR end "rule__Model__Group_4__2"


    // $ANTLR start "rule__Model__Group_4__2__Impl"
    // InternalModa.g:2976:1: rule__Model__Group_4__2__Impl : ( ( rule__Model__ModelroleAssignment_4_2 ) ) ;
    public final void rule__Model__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2980:1: ( ( ( rule__Model__ModelroleAssignment_4_2 ) ) )
            // InternalModa.g:2981:1: ( ( rule__Model__ModelroleAssignment_4_2 ) )
            {
            // InternalModa.g:2981:1: ( ( rule__Model__ModelroleAssignment_4_2 ) )
            // InternalModa.g:2982:2: ( rule__Model__ModelroleAssignment_4_2 )
            {
             before(grammarAccess.getModelAccess().getModelroleAssignment_4_2()); 
            // InternalModa.g:2983:2: ( rule__Model__ModelroleAssignment_4_2 )
            // InternalModa.g:2983:3: rule__Model__ModelroleAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__ModelroleAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getModelroleAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__2__Impl"


    // $ANTLR start "rule__Model__Group_4__3"
    // InternalModa.g:2991:1: rule__Model__Group_4__3 : rule__Model__Group_4__3__Impl rule__Model__Group_4__4 ;
    public final void rule__Model__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:2995:1: ( rule__Model__Group_4__3__Impl rule__Model__Group_4__4 )
            // InternalModa.g:2996:2: rule__Model__Group_4__3__Impl rule__Model__Group_4__4
            {
            pushFollow(FOLLOW_16);
            rule__Model__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_4__4();

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
    // $ANTLR end "rule__Model__Group_4__3"


    // $ANTLR start "rule__Model__Group_4__3__Impl"
    // InternalModa.g:3003:1: rule__Model__Group_4__3__Impl : ( ( rule__Model__Group_4_3__0 )* ) ;
    public final void rule__Model__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3007:1: ( ( ( rule__Model__Group_4_3__0 )* ) )
            // InternalModa.g:3008:1: ( ( rule__Model__Group_4_3__0 )* )
            {
            // InternalModa.g:3008:1: ( ( rule__Model__Group_4_3__0 )* )
            // InternalModa.g:3009:2: ( rule__Model__Group_4_3__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_4_3()); 
            // InternalModa.g:3010:2: ( rule__Model__Group_4_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==20) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalModa.g:3010:3: rule__Model__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Model__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__3__Impl"


    // $ANTLR start "rule__Model__Group_4__4"
    // InternalModa.g:3018:1: rule__Model__Group_4__4 : rule__Model__Group_4__4__Impl ;
    public final void rule__Model__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3022:1: ( rule__Model__Group_4__4__Impl )
            // InternalModa.g:3023:2: rule__Model__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_4__4__Impl();

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
    // $ANTLR end "rule__Model__Group_4__4"


    // $ANTLR start "rule__Model__Group_4__4__Impl"
    // InternalModa.g:3029:1: rule__Model__Group_4__4__Impl : ( ')' ) ;
    public final void rule__Model__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3033:1: ( ( ')' ) )
            // InternalModa.g:3034:1: ( ')' )
            {
            // InternalModa.g:3034:1: ( ')' )
            // InternalModa.g:3035:2: ')'
            {
             before(grammarAccess.getModelAccess().getRightParenthesisKeyword_4_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightParenthesisKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4__4__Impl"


    // $ANTLR start "rule__Model__Group_4_3__0"
    // InternalModa.g:3045:1: rule__Model__Group_4_3__0 : rule__Model__Group_4_3__0__Impl rule__Model__Group_4_3__1 ;
    public final void rule__Model__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3049:1: ( rule__Model__Group_4_3__0__Impl rule__Model__Group_4_3__1 )
            // InternalModa.g:3050:2: rule__Model__Group_4_3__0__Impl rule__Model__Group_4_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_4_3__1();

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
    // $ANTLR end "rule__Model__Group_4_3__0"


    // $ANTLR start "rule__Model__Group_4_3__0__Impl"
    // InternalModa.g:3057:1: rule__Model__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3061:1: ( ( ',' ) )
            // InternalModa.g:3062:1: ( ',' )
            {
            // InternalModa.g:3062:1: ( ',' )
            // InternalModa.g:3063:2: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_4_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4_3__0__Impl"


    // $ANTLR start "rule__Model__Group_4_3__1"
    // InternalModa.g:3072:1: rule__Model__Group_4_3__1 : rule__Model__Group_4_3__1__Impl ;
    public final void rule__Model__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3076:1: ( rule__Model__Group_4_3__1__Impl )
            // InternalModa.g:3077:2: rule__Model__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Model__Group_4_3__1"


    // $ANTLR start "rule__Model__Group_4_3__1__Impl"
    // InternalModa.g:3083:1: rule__Model__Group_4_3__1__Impl : ( ( rule__Model__ModelroleAssignment_4_3_1 ) ) ;
    public final void rule__Model__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3087:1: ( ( ( rule__Model__ModelroleAssignment_4_3_1 ) ) )
            // InternalModa.g:3088:1: ( ( rule__Model__ModelroleAssignment_4_3_1 ) )
            {
            // InternalModa.g:3088:1: ( ( rule__Model__ModelroleAssignment_4_3_1 ) )
            // InternalModa.g:3089:2: ( rule__Model__ModelroleAssignment_4_3_1 )
            {
             before(grammarAccess.getModelAccess().getModelroleAssignment_4_3_1()); 
            // InternalModa.g:3090:2: ( rule__Model__ModelroleAssignment_4_3_1 )
            // InternalModa.g:3090:3: rule__Model__ModelroleAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__ModelroleAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getModelroleAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_4_3__1__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group__0"
    // InternalModa.g:3099:1: rule__PrescriptiveModel__Group__0 : rule__PrescriptiveModel__Group__0__Impl rule__PrescriptiveModel__Group__1 ;
    public final void rule__PrescriptiveModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3103:1: ( rule__PrescriptiveModel__Group__0__Impl rule__PrescriptiveModel__Group__1 )
            // InternalModa.g:3104:2: rule__PrescriptiveModel__Group__0__Impl rule__PrescriptiveModel__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PrescriptiveModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group__1();

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
    // $ANTLR end "rule__PrescriptiveModel__Group__0"


    // $ANTLR start "rule__PrescriptiveModel__Group__0__Impl"
    // InternalModa.g:3111:1: rule__PrescriptiveModel__Group__0__Impl : ( 'PrescriptiveModel' ) ;
    public final void rule__PrescriptiveModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3115:1: ( ( 'PrescriptiveModel' ) )
            // InternalModa.g:3116:1: ( 'PrescriptiveModel' )
            {
            // InternalModa.g:3116:1: ( 'PrescriptiveModel' )
            // InternalModa.g:3117:2: 'PrescriptiveModel'
            {
             before(grammarAccess.getPrescriptiveModelAccess().getPrescriptiveModelKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPrescriptiveModelAccess().getPrescriptiveModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group__0__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group__1"
    // InternalModa.g:3126:1: rule__PrescriptiveModel__Group__1 : rule__PrescriptiveModel__Group__1__Impl rule__PrescriptiveModel__Group__2 ;
    public final void rule__PrescriptiveModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3130:1: ( rule__PrescriptiveModel__Group__1__Impl rule__PrescriptiveModel__Group__2 )
            // InternalModa.g:3131:2: rule__PrescriptiveModel__Group__1__Impl rule__PrescriptiveModel__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PrescriptiveModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group__2();

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
    // $ANTLR end "rule__PrescriptiveModel__Group__1"


    // $ANTLR start "rule__PrescriptiveModel__Group__1__Impl"
    // InternalModa.g:3138:1: rule__PrescriptiveModel__Group__1__Impl : ( ( rule__PrescriptiveModel__NameAssignment_1 ) ) ;
    public final void rule__PrescriptiveModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3142:1: ( ( ( rule__PrescriptiveModel__NameAssignment_1 ) ) )
            // InternalModa.g:3143:1: ( ( rule__PrescriptiveModel__NameAssignment_1 ) )
            {
            // InternalModa.g:3143:1: ( ( rule__PrescriptiveModel__NameAssignment_1 ) )
            // InternalModa.g:3144:2: ( rule__PrescriptiveModel__NameAssignment_1 )
            {
             before(grammarAccess.getPrescriptiveModelAccess().getNameAssignment_1()); 
            // InternalModa.g:3145:2: ( rule__PrescriptiveModel__NameAssignment_1 )
            // InternalModa.g:3145:3: rule__PrescriptiveModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrescriptiveModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group__1__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group__2"
    // InternalModa.g:3153:1: rule__PrescriptiveModel__Group__2 : rule__PrescriptiveModel__Group__2__Impl rule__PrescriptiveModel__Group__3 ;
    public final void rule__PrescriptiveModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3157:1: ( rule__PrescriptiveModel__Group__2__Impl rule__PrescriptiveModel__Group__3 )
            // InternalModa.g:3158:2: rule__PrescriptiveModel__Group__2__Impl rule__PrescriptiveModel__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__PrescriptiveModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group__3();

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
    // $ANTLR end "rule__PrescriptiveModel__Group__2"


    // $ANTLR start "rule__PrescriptiveModel__Group__2__Impl"
    // InternalModa.g:3165:1: rule__PrescriptiveModel__Group__2__Impl : ( '{' ) ;
    public final void rule__PrescriptiveModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3169:1: ( ( '{' ) )
            // InternalModa.g:3170:1: ( '{' )
            {
            // InternalModa.g:3170:1: ( '{' )
            // InternalModa.g:3171:2: '{'
            {
             before(grammarAccess.getPrescriptiveModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPrescriptiveModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group__2__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group__3"
    // InternalModa.g:3180:1: rule__PrescriptiveModel__Group__3 : rule__PrescriptiveModel__Group__3__Impl rule__PrescriptiveModel__Group__4 ;
    public final void rule__PrescriptiveModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3184:1: ( rule__PrescriptiveModel__Group__3__Impl rule__PrescriptiveModel__Group__4 )
            // InternalModa.g:3185:2: rule__PrescriptiveModel__Group__3__Impl rule__PrescriptiveModel__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__PrescriptiveModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group__4();

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
    // $ANTLR end "rule__PrescriptiveModel__Group__3"


    // $ANTLR start "rule__PrescriptiveModel__Group__3__Impl"
    // InternalModa.g:3192:1: rule__PrescriptiveModel__Group__3__Impl : ( 'model' ) ;
    public final void rule__PrescriptiveModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3196:1: ( ( 'model' ) )
            // InternalModa.g:3197:1: ( 'model' )
            {
            // InternalModa.g:3197:1: ( 'model' )
            // InternalModa.g:3198:2: 'model'
            {
             before(grammarAccess.getPrescriptiveModelAccess().getModelKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPrescriptiveModelAccess().getModelKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group__3__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group__4"
    // InternalModa.g:3207:1: rule__PrescriptiveModel__Group__4 : rule__PrescriptiveModel__Group__4__Impl rule__PrescriptiveModel__Group__5 ;
    public final void rule__PrescriptiveModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3211:1: ( rule__PrescriptiveModel__Group__4__Impl rule__PrescriptiveModel__Group__5 )
            // InternalModa.g:3212:2: rule__PrescriptiveModel__Group__4__Impl rule__PrescriptiveModel__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__PrescriptiveModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group__5();

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
    // $ANTLR end "rule__PrescriptiveModel__Group__4"


    // $ANTLR start "rule__PrescriptiveModel__Group__4__Impl"
    // InternalModa.g:3219:1: rule__PrescriptiveModel__Group__4__Impl : ( ( rule__PrescriptiveModel__ModelAssignment_4 ) ) ;
    public final void rule__PrescriptiveModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3223:1: ( ( ( rule__PrescriptiveModel__ModelAssignment_4 ) ) )
            // InternalModa.g:3224:1: ( ( rule__PrescriptiveModel__ModelAssignment_4 ) )
            {
            // InternalModa.g:3224:1: ( ( rule__PrescriptiveModel__ModelAssignment_4 ) )
            // InternalModa.g:3225:2: ( rule__PrescriptiveModel__ModelAssignment_4 )
            {
             before(grammarAccess.getPrescriptiveModelAccess().getModelAssignment_4()); 
            // InternalModa.g:3226:2: ( rule__PrescriptiveModel__ModelAssignment_4 )
            // InternalModa.g:3226:3: rule__PrescriptiveModel__ModelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__ModelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPrescriptiveModelAccess().getModelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group__4__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group__5"
    // InternalModa.g:3234:1: rule__PrescriptiveModel__Group__5 : rule__PrescriptiveModel__Group__5__Impl rule__PrescriptiveModel__Group__6 ;
    public final void rule__PrescriptiveModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3238:1: ( rule__PrescriptiveModel__Group__5__Impl rule__PrescriptiveModel__Group__6 )
            // InternalModa.g:3239:2: rule__PrescriptiveModel__Group__5__Impl rule__PrescriptiveModel__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__PrescriptiveModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group__6();

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
    // $ANTLR end "rule__PrescriptiveModel__Group__5"


    // $ANTLR start "rule__PrescriptiveModel__Group__5__Impl"
    // InternalModa.g:3246:1: rule__PrescriptiveModel__Group__5__Impl : ( ( rule__PrescriptiveModel__Group_5__0 )? ) ;
    public final void rule__PrescriptiveModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3250:1: ( ( ( rule__PrescriptiveModel__Group_5__0 )? ) )
            // InternalModa.g:3251:1: ( ( rule__PrescriptiveModel__Group_5__0 )? )
            {
            // InternalModa.g:3251:1: ( ( rule__PrescriptiveModel__Group_5__0 )? )
            // InternalModa.g:3252:2: ( rule__PrescriptiveModel__Group_5__0 )?
            {
             before(grammarAccess.getPrescriptiveModelAccess().getGroup_5()); 
            // InternalModa.g:3253:2: ( rule__PrescriptiveModel__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==19) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalModa.g:3253:3: rule__PrescriptiveModel__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrescriptiveModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrescriptiveModelAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group__5__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group__6"
    // InternalModa.g:3261:1: rule__PrescriptiveModel__Group__6 : rule__PrescriptiveModel__Group__6__Impl rule__PrescriptiveModel__Group__7 ;
    public final void rule__PrescriptiveModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3265:1: ( rule__PrescriptiveModel__Group__6__Impl rule__PrescriptiveModel__Group__7 )
            // InternalModa.g:3266:2: rule__PrescriptiveModel__Group__6__Impl rule__PrescriptiveModel__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__PrescriptiveModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group__7();

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
    // $ANTLR end "rule__PrescriptiveModel__Group__6"


    // $ANTLR start "rule__PrescriptiveModel__Group__6__Impl"
    // InternalModa.g:3273:1: rule__PrescriptiveModel__Group__6__Impl : ( ( rule__PrescriptiveModel__Group_6__0 )? ) ;
    public final void rule__PrescriptiveModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3277:1: ( ( ( rule__PrescriptiveModel__Group_6__0 )? ) )
            // InternalModa.g:3278:1: ( ( rule__PrescriptiveModel__Group_6__0 )? )
            {
            // InternalModa.g:3278:1: ( ( rule__PrescriptiveModel__Group_6__0 )? )
            // InternalModa.g:3279:2: ( rule__PrescriptiveModel__Group_6__0 )?
            {
             before(grammarAccess.getPrescriptiveModelAccess().getGroup_6()); 
            // InternalModa.g:3280:2: ( rule__PrescriptiveModel__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==21) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalModa.g:3280:3: rule__PrescriptiveModel__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrescriptiveModel__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrescriptiveModelAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group__6__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group__7"
    // InternalModa.g:3288:1: rule__PrescriptiveModel__Group__7 : rule__PrescriptiveModel__Group__7__Impl rule__PrescriptiveModel__Group__8 ;
    public final void rule__PrescriptiveModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3292:1: ( rule__PrescriptiveModel__Group__7__Impl rule__PrescriptiveModel__Group__8 )
            // InternalModa.g:3293:2: rule__PrescriptiveModel__Group__7__Impl rule__PrescriptiveModel__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__PrescriptiveModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group__8();

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
    // $ANTLR end "rule__PrescriptiveModel__Group__7"


    // $ANTLR start "rule__PrescriptiveModel__Group__7__Impl"
    // InternalModa.g:3300:1: rule__PrescriptiveModel__Group__7__Impl : ( ( rule__PrescriptiveModel__Group_7__0 )? ) ;
    public final void rule__PrescriptiveModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3304:1: ( ( ( rule__PrescriptiveModel__Group_7__0 )? ) )
            // InternalModa.g:3305:1: ( ( rule__PrescriptiveModel__Group_7__0 )? )
            {
            // InternalModa.g:3305:1: ( ( rule__PrescriptiveModel__Group_7__0 )? )
            // InternalModa.g:3306:2: ( rule__PrescriptiveModel__Group_7__0 )?
            {
             before(grammarAccess.getPrescriptiveModelAccess().getGroup_7()); 
            // InternalModa.g:3307:2: ( rule__PrescriptiveModel__Group_7__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==18) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalModa.g:3307:3: rule__PrescriptiveModel__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrescriptiveModel__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrescriptiveModelAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group__7__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group__8"
    // InternalModa.g:3315:1: rule__PrescriptiveModel__Group__8 : rule__PrescriptiveModel__Group__8__Impl rule__PrescriptiveModel__Group__9 ;
    public final void rule__PrescriptiveModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3319:1: ( rule__PrescriptiveModel__Group__8__Impl rule__PrescriptiveModel__Group__9 )
            // InternalModa.g:3320:2: rule__PrescriptiveModel__Group__8__Impl rule__PrescriptiveModel__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__PrescriptiveModel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group__9();

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
    // $ANTLR end "rule__PrescriptiveModel__Group__8"


    // $ANTLR start "rule__PrescriptiveModel__Group__8__Impl"
    // InternalModa.g:3327:1: rule__PrescriptiveModel__Group__8__Impl : ( ( rule__PrescriptiveModel__Group_8__0 )? ) ;
    public final void rule__PrescriptiveModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3331:1: ( ( ( rule__PrescriptiveModel__Group_8__0 )? ) )
            // InternalModa.g:3332:1: ( ( rule__PrescriptiveModel__Group_8__0 )? )
            {
            // InternalModa.g:3332:1: ( ( rule__PrescriptiveModel__Group_8__0 )? )
            // InternalModa.g:3333:2: ( rule__PrescriptiveModel__Group_8__0 )?
            {
             before(grammarAccess.getPrescriptiveModelAccess().getGroup_8()); 
            // InternalModa.g:3334:2: ( rule__PrescriptiveModel__Group_8__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalModa.g:3334:3: rule__PrescriptiveModel__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrescriptiveModel__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrescriptiveModelAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group__8__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group__9"
    // InternalModa.g:3342:1: rule__PrescriptiveModel__Group__9 : rule__PrescriptiveModel__Group__9__Impl rule__PrescriptiveModel__Group__10 ;
    public final void rule__PrescriptiveModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3346:1: ( rule__PrescriptiveModel__Group__9__Impl rule__PrescriptiveModel__Group__10 )
            // InternalModa.g:3347:2: rule__PrescriptiveModel__Group__9__Impl rule__PrescriptiveModel__Group__10
            {
            pushFollow(FOLLOW_22);
            rule__PrescriptiveModel__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group__10();

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
    // $ANTLR end "rule__PrescriptiveModel__Group__9"


    // $ANTLR start "rule__PrescriptiveModel__Group__9__Impl"
    // InternalModa.g:3354:1: rule__PrescriptiveModel__Group__9__Impl : ( ( rule__PrescriptiveModel__Group_9__0 )? ) ;
    public final void rule__PrescriptiveModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3358:1: ( ( ( rule__PrescriptiveModel__Group_9__0 )? ) )
            // InternalModa.g:3359:1: ( ( rule__PrescriptiveModel__Group_9__0 )? )
            {
            // InternalModa.g:3359:1: ( ( rule__PrescriptiveModel__Group_9__0 )? )
            // InternalModa.g:3360:2: ( rule__PrescriptiveModel__Group_9__0 )?
            {
             before(grammarAccess.getPrescriptiveModelAccess().getGroup_9()); 
            // InternalModa.g:3361:2: ( rule__PrescriptiveModel__Group_9__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==27) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalModa.g:3361:3: rule__PrescriptiveModel__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrescriptiveModel__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrescriptiveModelAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group__9__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group__10"
    // InternalModa.g:3369:1: rule__PrescriptiveModel__Group__10 : rule__PrescriptiveModel__Group__10__Impl rule__PrescriptiveModel__Group__11 ;
    public final void rule__PrescriptiveModel__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3373:1: ( rule__PrescriptiveModel__Group__10__Impl rule__PrescriptiveModel__Group__11 )
            // InternalModa.g:3374:2: rule__PrescriptiveModel__Group__10__Impl rule__PrescriptiveModel__Group__11
            {
            pushFollow(FOLLOW_22);
            rule__PrescriptiveModel__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group__11();

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
    // $ANTLR end "rule__PrescriptiveModel__Group__10"


    // $ANTLR start "rule__PrescriptiveModel__Group__10__Impl"
    // InternalModa.g:3381:1: rule__PrescriptiveModel__Group__10__Impl : ( ( rule__PrescriptiveModel__Group_10__0 )? ) ;
    public final void rule__PrescriptiveModel__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3385:1: ( ( ( rule__PrescriptiveModel__Group_10__0 )? ) )
            // InternalModa.g:3386:1: ( ( rule__PrescriptiveModel__Group_10__0 )? )
            {
            // InternalModa.g:3386:1: ( ( rule__PrescriptiveModel__Group_10__0 )? )
            // InternalModa.g:3387:2: ( rule__PrescriptiveModel__Group_10__0 )?
            {
             before(grammarAccess.getPrescriptiveModelAccess().getGroup_10()); 
            // InternalModa.g:3388:2: ( rule__PrescriptiveModel__Group_10__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalModa.g:3388:3: rule__PrescriptiveModel__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrescriptiveModel__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrescriptiveModelAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group__10__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group__11"
    // InternalModa.g:3396:1: rule__PrescriptiveModel__Group__11 : rule__PrescriptiveModel__Group__11__Impl ;
    public final void rule__PrescriptiveModel__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3400:1: ( rule__PrescriptiveModel__Group__11__Impl )
            // InternalModa.g:3401:2: rule__PrescriptiveModel__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group__11__Impl();

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
    // $ANTLR end "rule__PrescriptiveModel__Group__11"


    // $ANTLR start "rule__PrescriptiveModel__Group__11__Impl"
    // InternalModa.g:3407:1: rule__PrescriptiveModel__Group__11__Impl : ( '}' ) ;
    public final void rule__PrescriptiveModel__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3411:1: ( ( '}' ) )
            // InternalModa.g:3412:1: ( '}' )
            {
            // InternalModa.g:3412:1: ( '}' )
            // InternalModa.g:3413:2: '}'
            {
             before(grammarAccess.getPrescriptiveModelAccess().getRightCurlyBracketKeyword_11()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPrescriptiveModelAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group__11__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group_5__0"
    // InternalModa.g:3423:1: rule__PrescriptiveModel__Group_5__0 : rule__PrescriptiveModel__Group_5__0__Impl rule__PrescriptiveModel__Group_5__1 ;
    public final void rule__PrescriptiveModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3427:1: ( rule__PrescriptiveModel__Group_5__0__Impl rule__PrescriptiveModel__Group_5__1 )
            // InternalModa.g:3428:2: rule__PrescriptiveModel__Group_5__0__Impl rule__PrescriptiveModel__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__PrescriptiveModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group_5__1();

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
    // $ANTLR end "rule__PrescriptiveModel__Group_5__0"


    // $ANTLR start "rule__PrescriptiveModel__Group_5__0__Impl"
    // InternalModa.g:3435:1: rule__PrescriptiveModel__Group_5__0__Impl : ( 'data' ) ;
    public final void rule__PrescriptiveModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3439:1: ( ( 'data' ) )
            // InternalModa.g:3440:1: ( 'data' )
            {
            // InternalModa.g:3440:1: ( 'data' )
            // InternalModa.g:3441:2: 'data'
            {
             before(grammarAccess.getPrescriptiveModelAccess().getDataKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPrescriptiveModelAccess().getDataKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group_5__0__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group_5__1"
    // InternalModa.g:3450:1: rule__PrescriptiveModel__Group_5__1 : rule__PrescriptiveModel__Group_5__1__Impl rule__PrescriptiveModel__Group_5__2 ;
    public final void rule__PrescriptiveModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3454:1: ( rule__PrescriptiveModel__Group_5__1__Impl rule__PrescriptiveModel__Group_5__2 )
            // InternalModa.g:3455:2: rule__PrescriptiveModel__Group_5__1__Impl rule__PrescriptiveModel__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__PrescriptiveModel__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group_5__2();

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
    // $ANTLR end "rule__PrescriptiveModel__Group_5__1"


    // $ANTLR start "rule__PrescriptiveModel__Group_5__1__Impl"
    // InternalModa.g:3462:1: rule__PrescriptiveModel__Group_5__1__Impl : ( '(' ) ;
    public final void rule__PrescriptiveModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3466:1: ( ( '(' ) )
            // InternalModa.g:3467:1: ( '(' )
            {
            // InternalModa.g:3467:1: ( '(' )
            // InternalModa.g:3468:2: '('
            {
             before(grammarAccess.getPrescriptiveModelAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPrescriptiveModelAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group_5__1__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group_5__2"
    // InternalModa.g:3477:1: rule__PrescriptiveModel__Group_5__2 : rule__PrescriptiveModel__Group_5__2__Impl rule__PrescriptiveModel__Group_5__3 ;
    public final void rule__PrescriptiveModel__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3481:1: ( rule__PrescriptiveModel__Group_5__2__Impl rule__PrescriptiveModel__Group_5__3 )
            // InternalModa.g:3482:2: rule__PrescriptiveModel__Group_5__2__Impl rule__PrescriptiveModel__Group_5__3
            {
            pushFollow(FOLLOW_16);
            rule__PrescriptiveModel__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group_5__3();

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
    // $ANTLR end "rule__PrescriptiveModel__Group_5__2"


    // $ANTLR start "rule__PrescriptiveModel__Group_5__2__Impl"
    // InternalModa.g:3489:1: rule__PrescriptiveModel__Group_5__2__Impl : ( ( rule__PrescriptiveModel__DataAssignment_5_2 ) ) ;
    public final void rule__PrescriptiveModel__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3493:1: ( ( ( rule__PrescriptiveModel__DataAssignment_5_2 ) ) )
            // InternalModa.g:3494:1: ( ( rule__PrescriptiveModel__DataAssignment_5_2 ) )
            {
            // InternalModa.g:3494:1: ( ( rule__PrescriptiveModel__DataAssignment_5_2 ) )
            // InternalModa.g:3495:2: ( rule__PrescriptiveModel__DataAssignment_5_2 )
            {
             before(grammarAccess.getPrescriptiveModelAccess().getDataAssignment_5_2()); 
            // InternalModa.g:3496:2: ( rule__PrescriptiveModel__DataAssignment_5_2 )
            // InternalModa.g:3496:3: rule__PrescriptiveModel__DataAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__DataAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getPrescriptiveModelAccess().getDataAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group_5__2__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group_5__3"
    // InternalModa.g:3504:1: rule__PrescriptiveModel__Group_5__3 : rule__PrescriptiveModel__Group_5__3__Impl rule__PrescriptiveModel__Group_5__4 ;
    public final void rule__PrescriptiveModel__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3508:1: ( rule__PrescriptiveModel__Group_5__3__Impl rule__PrescriptiveModel__Group_5__4 )
            // InternalModa.g:3509:2: rule__PrescriptiveModel__Group_5__3__Impl rule__PrescriptiveModel__Group_5__4
            {
            pushFollow(FOLLOW_16);
            rule__PrescriptiveModel__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group_5__4();

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
    // $ANTLR end "rule__PrescriptiveModel__Group_5__3"


    // $ANTLR start "rule__PrescriptiveModel__Group_5__3__Impl"
    // InternalModa.g:3516:1: rule__PrescriptiveModel__Group_5__3__Impl : ( ( rule__PrescriptiveModel__Group_5_3__0 )* ) ;
    public final void rule__PrescriptiveModel__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3520:1: ( ( ( rule__PrescriptiveModel__Group_5_3__0 )* ) )
            // InternalModa.g:3521:1: ( ( rule__PrescriptiveModel__Group_5_3__0 )* )
            {
            // InternalModa.g:3521:1: ( ( rule__PrescriptiveModel__Group_5_3__0 )* )
            // InternalModa.g:3522:2: ( rule__PrescriptiveModel__Group_5_3__0 )*
            {
             before(grammarAccess.getPrescriptiveModelAccess().getGroup_5_3()); 
            // InternalModa.g:3523:2: ( rule__PrescriptiveModel__Group_5_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==20) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalModa.g:3523:3: rule__PrescriptiveModel__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PrescriptiveModel__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getPrescriptiveModelAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group_5__3__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group_5__4"
    // InternalModa.g:3531:1: rule__PrescriptiveModel__Group_5__4 : rule__PrescriptiveModel__Group_5__4__Impl ;
    public final void rule__PrescriptiveModel__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3535:1: ( rule__PrescriptiveModel__Group_5__4__Impl )
            // InternalModa.g:3536:2: rule__PrescriptiveModel__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group_5__4__Impl();

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
    // $ANTLR end "rule__PrescriptiveModel__Group_5__4"


    // $ANTLR start "rule__PrescriptiveModel__Group_5__4__Impl"
    // InternalModa.g:3542:1: rule__PrescriptiveModel__Group_5__4__Impl : ( ')' ) ;
    public final void rule__PrescriptiveModel__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3546:1: ( ( ')' ) )
            // InternalModa.g:3547:1: ( ')' )
            {
            // InternalModa.g:3547:1: ( ')' )
            // InternalModa.g:3548:2: ')'
            {
             before(grammarAccess.getPrescriptiveModelAccess().getRightParenthesisKeyword_5_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPrescriptiveModelAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group_5__4__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group_5_3__0"
    // InternalModa.g:3558:1: rule__PrescriptiveModel__Group_5_3__0 : rule__PrescriptiveModel__Group_5_3__0__Impl rule__PrescriptiveModel__Group_5_3__1 ;
    public final void rule__PrescriptiveModel__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3562:1: ( rule__PrescriptiveModel__Group_5_3__0__Impl rule__PrescriptiveModel__Group_5_3__1 )
            // InternalModa.g:3563:2: rule__PrescriptiveModel__Group_5_3__0__Impl rule__PrescriptiveModel__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__PrescriptiveModel__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group_5_3__1();

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
    // $ANTLR end "rule__PrescriptiveModel__Group_5_3__0"


    // $ANTLR start "rule__PrescriptiveModel__Group_5_3__0__Impl"
    // InternalModa.g:3570:1: rule__PrescriptiveModel__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__PrescriptiveModel__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3574:1: ( ( ',' ) )
            // InternalModa.g:3575:1: ( ',' )
            {
            // InternalModa.g:3575:1: ( ',' )
            // InternalModa.g:3576:2: ','
            {
             before(grammarAccess.getPrescriptiveModelAccess().getCommaKeyword_5_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPrescriptiveModelAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group_5_3__0__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group_5_3__1"
    // InternalModa.g:3585:1: rule__PrescriptiveModel__Group_5_3__1 : rule__PrescriptiveModel__Group_5_3__1__Impl ;
    public final void rule__PrescriptiveModel__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3589:1: ( rule__PrescriptiveModel__Group_5_3__1__Impl )
            // InternalModa.g:3590:2: rule__PrescriptiveModel__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__PrescriptiveModel__Group_5_3__1"


    // $ANTLR start "rule__PrescriptiveModel__Group_5_3__1__Impl"
    // InternalModa.g:3596:1: rule__PrescriptiveModel__Group_5_3__1__Impl : ( ( rule__PrescriptiveModel__DataAssignment_5_3_1 ) ) ;
    public final void rule__PrescriptiveModel__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3600:1: ( ( ( rule__PrescriptiveModel__DataAssignment_5_3_1 ) ) )
            // InternalModa.g:3601:1: ( ( rule__PrescriptiveModel__DataAssignment_5_3_1 ) )
            {
            // InternalModa.g:3601:1: ( ( rule__PrescriptiveModel__DataAssignment_5_3_1 ) )
            // InternalModa.g:3602:2: ( rule__PrescriptiveModel__DataAssignment_5_3_1 )
            {
             before(grammarAccess.getPrescriptiveModelAccess().getDataAssignment_5_3_1()); 
            // InternalModa.g:3603:2: ( rule__PrescriptiveModel__DataAssignment_5_3_1 )
            // InternalModa.g:3603:3: rule__PrescriptiveModel__DataAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__DataAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrescriptiveModelAccess().getDataAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group_5_3__1__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group_6__0"
    // InternalModa.g:3612:1: rule__PrescriptiveModel__Group_6__0 : rule__PrescriptiveModel__Group_6__0__Impl rule__PrescriptiveModel__Group_6__1 ;
    public final void rule__PrescriptiveModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3616:1: ( rule__PrescriptiveModel__Group_6__0__Impl rule__PrescriptiveModel__Group_6__1 )
            // InternalModa.g:3617:2: rule__PrescriptiveModel__Group_6__0__Impl rule__PrescriptiveModel__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__PrescriptiveModel__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group_6__1();

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
    // $ANTLR end "rule__PrescriptiveModel__Group_6__0"


    // $ANTLR start "rule__PrescriptiveModel__Group_6__0__Impl"
    // InternalModa.g:3624:1: rule__PrescriptiveModel__Group_6__0__Impl : ( 'software' ) ;
    public final void rule__PrescriptiveModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3628:1: ( ( 'software' ) )
            // InternalModa.g:3629:1: ( 'software' )
            {
            // InternalModa.g:3629:1: ( 'software' )
            // InternalModa.g:3630:2: 'software'
            {
             before(grammarAccess.getPrescriptiveModelAccess().getSoftwareKeyword_6_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPrescriptiveModelAccess().getSoftwareKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group_6__0__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group_6__1"
    // InternalModa.g:3639:1: rule__PrescriptiveModel__Group_6__1 : rule__PrescriptiveModel__Group_6__1__Impl ;
    public final void rule__PrescriptiveModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3643:1: ( rule__PrescriptiveModel__Group_6__1__Impl )
            // InternalModa.g:3644:2: rule__PrescriptiveModel__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group_6__1__Impl();

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
    // $ANTLR end "rule__PrescriptiveModel__Group_6__1"


    // $ANTLR start "rule__PrescriptiveModel__Group_6__1__Impl"
    // InternalModa.g:3650:1: rule__PrescriptiveModel__Group_6__1__Impl : ( ( rule__PrescriptiveModel__SoftwareAssignment_6_1 ) ) ;
    public final void rule__PrescriptiveModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3654:1: ( ( ( rule__PrescriptiveModel__SoftwareAssignment_6_1 ) ) )
            // InternalModa.g:3655:1: ( ( rule__PrescriptiveModel__SoftwareAssignment_6_1 ) )
            {
            // InternalModa.g:3655:1: ( ( rule__PrescriptiveModel__SoftwareAssignment_6_1 ) )
            // InternalModa.g:3656:2: ( rule__PrescriptiveModel__SoftwareAssignment_6_1 )
            {
             before(grammarAccess.getPrescriptiveModelAccess().getSoftwareAssignment_6_1()); 
            // InternalModa.g:3657:2: ( rule__PrescriptiveModel__SoftwareAssignment_6_1 )
            // InternalModa.g:3657:3: rule__PrescriptiveModel__SoftwareAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__SoftwareAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPrescriptiveModelAccess().getSoftwareAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group_6__1__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group_7__0"
    // InternalModa.g:3666:1: rule__PrescriptiveModel__Group_7__0 : rule__PrescriptiveModel__Group_7__0__Impl rule__PrescriptiveModel__Group_7__1 ;
    public final void rule__PrescriptiveModel__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3670:1: ( rule__PrescriptiveModel__Group_7__0__Impl rule__PrescriptiveModel__Group_7__1 )
            // InternalModa.g:3671:2: rule__PrescriptiveModel__Group_7__0__Impl rule__PrescriptiveModel__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__PrescriptiveModel__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group_7__1();

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
    // $ANTLR end "rule__PrescriptiveModel__Group_7__0"


    // $ANTLR start "rule__PrescriptiveModel__Group_7__0__Impl"
    // InternalModa.g:3678:1: rule__PrescriptiveModel__Group_7__0__Impl : ( 'sociotechnicalsystem' ) ;
    public final void rule__PrescriptiveModel__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3682:1: ( ( 'sociotechnicalsystem' ) )
            // InternalModa.g:3683:1: ( 'sociotechnicalsystem' )
            {
            // InternalModa.g:3683:1: ( 'sociotechnicalsystem' )
            // InternalModa.g:3684:2: 'sociotechnicalsystem'
            {
             before(grammarAccess.getPrescriptiveModelAccess().getSociotechnicalsystemKeyword_7_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPrescriptiveModelAccess().getSociotechnicalsystemKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group_7__0__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group_7__1"
    // InternalModa.g:3693:1: rule__PrescriptiveModel__Group_7__1 : rule__PrescriptiveModel__Group_7__1__Impl ;
    public final void rule__PrescriptiveModel__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3697:1: ( rule__PrescriptiveModel__Group_7__1__Impl )
            // InternalModa.g:3698:2: rule__PrescriptiveModel__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group_7__1__Impl();

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
    // $ANTLR end "rule__PrescriptiveModel__Group_7__1"


    // $ANTLR start "rule__PrescriptiveModel__Group_7__1__Impl"
    // InternalModa.g:3704:1: rule__PrescriptiveModel__Group_7__1__Impl : ( ( rule__PrescriptiveModel__SociotechnicalsystemAssignment_7_1 ) ) ;
    public final void rule__PrescriptiveModel__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3708:1: ( ( ( rule__PrescriptiveModel__SociotechnicalsystemAssignment_7_1 ) ) )
            // InternalModa.g:3709:1: ( ( rule__PrescriptiveModel__SociotechnicalsystemAssignment_7_1 ) )
            {
            // InternalModa.g:3709:1: ( ( rule__PrescriptiveModel__SociotechnicalsystemAssignment_7_1 ) )
            // InternalModa.g:3710:2: ( rule__PrescriptiveModel__SociotechnicalsystemAssignment_7_1 )
            {
             before(grammarAccess.getPrescriptiveModelAccess().getSociotechnicalsystemAssignment_7_1()); 
            // InternalModa.g:3711:2: ( rule__PrescriptiveModel__SociotechnicalsystemAssignment_7_1 )
            // InternalModa.g:3711:3: rule__PrescriptiveModel__SociotechnicalsystemAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__SociotechnicalsystemAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPrescriptiveModelAccess().getSociotechnicalsystemAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group_7__1__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group_8__0"
    // InternalModa.g:3720:1: rule__PrescriptiveModel__Group_8__0 : rule__PrescriptiveModel__Group_8__0__Impl rule__PrescriptiveModel__Group_8__1 ;
    public final void rule__PrescriptiveModel__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3724:1: ( rule__PrescriptiveModel__Group_8__0__Impl rule__PrescriptiveModel__Group_8__1 )
            // InternalModa.g:3725:2: rule__PrescriptiveModel__Group_8__0__Impl rule__PrescriptiveModel__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__PrescriptiveModel__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group_8__1();

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
    // $ANTLR end "rule__PrescriptiveModel__Group_8__0"


    // $ANTLR start "rule__PrescriptiveModel__Group_8__0__Impl"
    // InternalModa.g:3732:1: rule__PrescriptiveModel__Group_8__0__Impl : ( 'predictivemodel' ) ;
    public final void rule__PrescriptiveModel__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3736:1: ( ( 'predictivemodel' ) )
            // InternalModa.g:3737:1: ( 'predictivemodel' )
            {
            // InternalModa.g:3737:1: ( 'predictivemodel' )
            // InternalModa.g:3738:2: 'predictivemodel'
            {
             before(grammarAccess.getPrescriptiveModelAccess().getPredictivemodelKeyword_8_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPrescriptiveModelAccess().getPredictivemodelKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group_8__0__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group_8__1"
    // InternalModa.g:3747:1: rule__PrescriptiveModel__Group_8__1 : rule__PrescriptiveModel__Group_8__1__Impl ;
    public final void rule__PrescriptiveModel__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3751:1: ( rule__PrescriptiveModel__Group_8__1__Impl )
            // InternalModa.g:3752:2: rule__PrescriptiveModel__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group_8__1__Impl();

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
    // $ANTLR end "rule__PrescriptiveModel__Group_8__1"


    // $ANTLR start "rule__PrescriptiveModel__Group_8__1__Impl"
    // InternalModa.g:3758:1: rule__PrescriptiveModel__Group_8__1__Impl : ( ( rule__PrescriptiveModel__PredictivemodelAssignment_8_1 ) ) ;
    public final void rule__PrescriptiveModel__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3762:1: ( ( ( rule__PrescriptiveModel__PredictivemodelAssignment_8_1 ) ) )
            // InternalModa.g:3763:1: ( ( rule__PrescriptiveModel__PredictivemodelAssignment_8_1 ) )
            {
            // InternalModa.g:3763:1: ( ( rule__PrescriptiveModel__PredictivemodelAssignment_8_1 ) )
            // InternalModa.g:3764:2: ( rule__PrescriptiveModel__PredictivemodelAssignment_8_1 )
            {
             before(grammarAccess.getPrescriptiveModelAccess().getPredictivemodelAssignment_8_1()); 
            // InternalModa.g:3765:2: ( rule__PrescriptiveModel__PredictivemodelAssignment_8_1 )
            // InternalModa.g:3765:3: rule__PrescriptiveModel__PredictivemodelAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__PredictivemodelAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPrescriptiveModelAccess().getPredictivemodelAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group_8__1__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group_9__0"
    // InternalModa.g:3774:1: rule__PrescriptiveModel__Group_9__0 : rule__PrescriptiveModel__Group_9__0__Impl rule__PrescriptiveModel__Group_9__1 ;
    public final void rule__PrescriptiveModel__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3778:1: ( rule__PrescriptiveModel__Group_9__0__Impl rule__PrescriptiveModel__Group_9__1 )
            // InternalModa.g:3779:2: rule__PrescriptiveModel__Group_9__0__Impl rule__PrescriptiveModel__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__PrescriptiveModel__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group_9__1();

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
    // $ANTLR end "rule__PrescriptiveModel__Group_9__0"


    // $ANTLR start "rule__PrescriptiveModel__Group_9__0__Impl"
    // InternalModa.g:3786:1: rule__PrescriptiveModel__Group_9__0__Impl : ( 'prescriptivemodel' ) ;
    public final void rule__PrescriptiveModel__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3790:1: ( ( 'prescriptivemodel' ) )
            // InternalModa.g:3791:1: ( 'prescriptivemodel' )
            {
            // InternalModa.g:3791:1: ( 'prescriptivemodel' )
            // InternalModa.g:3792:2: 'prescriptivemodel'
            {
             before(grammarAccess.getPrescriptiveModelAccess().getPrescriptivemodelKeyword_9_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPrescriptiveModelAccess().getPrescriptivemodelKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group_9__0__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group_9__1"
    // InternalModa.g:3801:1: rule__PrescriptiveModel__Group_9__1 : rule__PrescriptiveModel__Group_9__1__Impl ;
    public final void rule__PrescriptiveModel__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3805:1: ( rule__PrescriptiveModel__Group_9__1__Impl )
            // InternalModa.g:3806:2: rule__PrescriptiveModel__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group_9__1__Impl();

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
    // $ANTLR end "rule__PrescriptiveModel__Group_9__1"


    // $ANTLR start "rule__PrescriptiveModel__Group_9__1__Impl"
    // InternalModa.g:3812:1: rule__PrescriptiveModel__Group_9__1__Impl : ( ( rule__PrescriptiveModel__PrescriptivemodelAssignment_9_1 ) ) ;
    public final void rule__PrescriptiveModel__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3816:1: ( ( ( rule__PrescriptiveModel__PrescriptivemodelAssignment_9_1 ) ) )
            // InternalModa.g:3817:1: ( ( rule__PrescriptiveModel__PrescriptivemodelAssignment_9_1 ) )
            {
            // InternalModa.g:3817:1: ( ( rule__PrescriptiveModel__PrescriptivemodelAssignment_9_1 ) )
            // InternalModa.g:3818:2: ( rule__PrescriptiveModel__PrescriptivemodelAssignment_9_1 )
            {
             before(grammarAccess.getPrescriptiveModelAccess().getPrescriptivemodelAssignment_9_1()); 
            // InternalModa.g:3819:2: ( rule__PrescriptiveModel__PrescriptivemodelAssignment_9_1 )
            // InternalModa.g:3819:3: rule__PrescriptiveModel__PrescriptivemodelAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__PrescriptivemodelAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getPrescriptiveModelAccess().getPrescriptivemodelAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group_9__1__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group_10__0"
    // InternalModa.g:3828:1: rule__PrescriptiveModel__Group_10__0 : rule__PrescriptiveModel__Group_10__0__Impl rule__PrescriptiveModel__Group_10__1 ;
    public final void rule__PrescriptiveModel__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3832:1: ( rule__PrescriptiveModel__Group_10__0__Impl rule__PrescriptiveModel__Group_10__1 )
            // InternalModa.g:3833:2: rule__PrescriptiveModel__Group_10__0__Impl rule__PrescriptiveModel__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__PrescriptiveModel__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group_10__1();

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
    // $ANTLR end "rule__PrescriptiveModel__Group_10__0"


    // $ANTLR start "rule__PrescriptiveModel__Group_10__0__Impl"
    // InternalModa.g:3840:1: rule__PrescriptiveModel__Group_10__0__Impl : ( 'prescriptivemodeleOpposite' ) ;
    public final void rule__PrescriptiveModel__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3844:1: ( ( 'prescriptivemodeleOpposite' ) )
            // InternalModa.g:3845:1: ( 'prescriptivemodeleOpposite' )
            {
            // InternalModa.g:3845:1: ( 'prescriptivemodeleOpposite' )
            // InternalModa.g:3846:2: 'prescriptivemodeleOpposite'
            {
             before(grammarAccess.getPrescriptiveModelAccess().getPrescriptivemodeleOppositeKeyword_10_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPrescriptiveModelAccess().getPrescriptivemodeleOppositeKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group_10__0__Impl"


    // $ANTLR start "rule__PrescriptiveModel__Group_10__1"
    // InternalModa.g:3855:1: rule__PrescriptiveModel__Group_10__1 : rule__PrescriptiveModel__Group_10__1__Impl ;
    public final void rule__PrescriptiveModel__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3859:1: ( rule__PrescriptiveModel__Group_10__1__Impl )
            // InternalModa.g:3860:2: rule__PrescriptiveModel__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__Group_10__1__Impl();

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
    // $ANTLR end "rule__PrescriptiveModel__Group_10__1"


    // $ANTLR start "rule__PrescriptiveModel__Group_10__1__Impl"
    // InternalModa.g:3866:1: rule__PrescriptiveModel__Group_10__1__Impl : ( ( rule__PrescriptiveModel__PrescriptivemodeleOppositeAssignment_10_1 ) ) ;
    public final void rule__PrescriptiveModel__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3870:1: ( ( ( rule__PrescriptiveModel__PrescriptivemodeleOppositeAssignment_10_1 ) ) )
            // InternalModa.g:3871:1: ( ( rule__PrescriptiveModel__PrescriptivemodeleOppositeAssignment_10_1 ) )
            {
            // InternalModa.g:3871:1: ( ( rule__PrescriptiveModel__PrescriptivemodeleOppositeAssignment_10_1 ) )
            // InternalModa.g:3872:2: ( rule__PrescriptiveModel__PrescriptivemodeleOppositeAssignment_10_1 )
            {
             before(grammarAccess.getPrescriptiveModelAccess().getPrescriptivemodeleOppositeAssignment_10_1()); 
            // InternalModa.g:3873:2: ( rule__PrescriptiveModel__PrescriptivemodeleOppositeAssignment_10_1 )
            // InternalModa.g:3873:3: rule__PrescriptiveModel__PrescriptivemodeleOppositeAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__PrescriptiveModel__PrescriptivemodeleOppositeAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getPrescriptiveModelAccess().getPrescriptivemodeleOppositeAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__Group_10__1__Impl"


    // $ANTLR start "rule__PredictiveModel__Group__0"
    // InternalModa.g:3882:1: rule__PredictiveModel__Group__0 : rule__PredictiveModel__Group__0__Impl rule__PredictiveModel__Group__1 ;
    public final void rule__PredictiveModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3886:1: ( rule__PredictiveModel__Group__0__Impl rule__PredictiveModel__Group__1 )
            // InternalModa.g:3887:2: rule__PredictiveModel__Group__0__Impl rule__PredictiveModel__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PredictiveModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group__1();

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
    // $ANTLR end "rule__PredictiveModel__Group__0"


    // $ANTLR start "rule__PredictiveModel__Group__0__Impl"
    // InternalModa.g:3894:1: rule__PredictiveModel__Group__0__Impl : ( 'PredictiveModel' ) ;
    public final void rule__PredictiveModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3898:1: ( ( 'PredictiveModel' ) )
            // InternalModa.g:3899:1: ( 'PredictiveModel' )
            {
            // InternalModa.g:3899:1: ( 'PredictiveModel' )
            // InternalModa.g:3900:2: 'PredictiveModel'
            {
             before(grammarAccess.getPredictiveModelAccess().getPredictiveModelKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPredictiveModelAccess().getPredictiveModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__Group__0__Impl"


    // $ANTLR start "rule__PredictiveModel__Group__1"
    // InternalModa.g:3909:1: rule__PredictiveModel__Group__1 : rule__PredictiveModel__Group__1__Impl rule__PredictiveModel__Group__2 ;
    public final void rule__PredictiveModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3913:1: ( rule__PredictiveModel__Group__1__Impl rule__PredictiveModel__Group__2 )
            // InternalModa.g:3914:2: rule__PredictiveModel__Group__1__Impl rule__PredictiveModel__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PredictiveModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group__2();

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
    // $ANTLR end "rule__PredictiveModel__Group__1"


    // $ANTLR start "rule__PredictiveModel__Group__1__Impl"
    // InternalModa.g:3921:1: rule__PredictiveModel__Group__1__Impl : ( ( rule__PredictiveModel__NameAssignment_1 ) ) ;
    public final void rule__PredictiveModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3925:1: ( ( ( rule__PredictiveModel__NameAssignment_1 ) ) )
            // InternalModa.g:3926:1: ( ( rule__PredictiveModel__NameAssignment_1 ) )
            {
            // InternalModa.g:3926:1: ( ( rule__PredictiveModel__NameAssignment_1 ) )
            // InternalModa.g:3927:2: ( rule__PredictiveModel__NameAssignment_1 )
            {
             before(grammarAccess.getPredictiveModelAccess().getNameAssignment_1()); 
            // InternalModa.g:3928:2: ( rule__PredictiveModel__NameAssignment_1 )
            // InternalModa.g:3928:3: rule__PredictiveModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPredictiveModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__Group__1__Impl"


    // $ANTLR start "rule__PredictiveModel__Group__2"
    // InternalModa.g:3936:1: rule__PredictiveModel__Group__2 : rule__PredictiveModel__Group__2__Impl rule__PredictiveModel__Group__3 ;
    public final void rule__PredictiveModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3940:1: ( rule__PredictiveModel__Group__2__Impl rule__PredictiveModel__Group__3 )
            // InternalModa.g:3941:2: rule__PredictiveModel__Group__2__Impl rule__PredictiveModel__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__PredictiveModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group__3();

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
    // $ANTLR end "rule__PredictiveModel__Group__2"


    // $ANTLR start "rule__PredictiveModel__Group__2__Impl"
    // InternalModa.g:3948:1: rule__PredictiveModel__Group__2__Impl : ( '{' ) ;
    public final void rule__PredictiveModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3952:1: ( ( '{' ) )
            // InternalModa.g:3953:1: ( '{' )
            {
            // InternalModa.g:3953:1: ( '{' )
            // InternalModa.g:3954:2: '{'
            {
             before(grammarAccess.getPredictiveModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPredictiveModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__Group__2__Impl"


    // $ANTLR start "rule__PredictiveModel__Group__3"
    // InternalModa.g:3963:1: rule__PredictiveModel__Group__3 : rule__PredictiveModel__Group__3__Impl rule__PredictiveModel__Group__4 ;
    public final void rule__PredictiveModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3967:1: ( rule__PredictiveModel__Group__3__Impl rule__PredictiveModel__Group__4 )
            // InternalModa.g:3968:2: rule__PredictiveModel__Group__3__Impl rule__PredictiveModel__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__PredictiveModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group__4();

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
    // $ANTLR end "rule__PredictiveModel__Group__3"


    // $ANTLR start "rule__PredictiveModel__Group__3__Impl"
    // InternalModa.g:3975:1: rule__PredictiveModel__Group__3__Impl : ( 'model' ) ;
    public final void rule__PredictiveModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3979:1: ( ( 'model' ) )
            // InternalModa.g:3980:1: ( 'model' )
            {
            // InternalModa.g:3980:1: ( 'model' )
            // InternalModa.g:3981:2: 'model'
            {
             before(grammarAccess.getPredictiveModelAccess().getModelKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPredictiveModelAccess().getModelKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__Group__3__Impl"


    // $ANTLR start "rule__PredictiveModel__Group__4"
    // InternalModa.g:3990:1: rule__PredictiveModel__Group__4 : rule__PredictiveModel__Group__4__Impl rule__PredictiveModel__Group__5 ;
    public final void rule__PredictiveModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:3994:1: ( rule__PredictiveModel__Group__4__Impl rule__PredictiveModel__Group__5 )
            // InternalModa.g:3995:2: rule__PredictiveModel__Group__4__Impl rule__PredictiveModel__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__PredictiveModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group__5();

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
    // $ANTLR end "rule__PredictiveModel__Group__4"


    // $ANTLR start "rule__PredictiveModel__Group__4__Impl"
    // InternalModa.g:4002:1: rule__PredictiveModel__Group__4__Impl : ( ( rule__PredictiveModel__ModelAssignment_4 ) ) ;
    public final void rule__PredictiveModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4006:1: ( ( ( rule__PredictiveModel__ModelAssignment_4 ) ) )
            // InternalModa.g:4007:1: ( ( rule__PredictiveModel__ModelAssignment_4 ) )
            {
            // InternalModa.g:4007:1: ( ( rule__PredictiveModel__ModelAssignment_4 ) )
            // InternalModa.g:4008:2: ( rule__PredictiveModel__ModelAssignment_4 )
            {
             before(grammarAccess.getPredictiveModelAccess().getModelAssignment_4()); 
            // InternalModa.g:4009:2: ( rule__PredictiveModel__ModelAssignment_4 )
            // InternalModa.g:4009:3: rule__PredictiveModel__ModelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveModel__ModelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPredictiveModelAccess().getModelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__Group__4__Impl"


    // $ANTLR start "rule__PredictiveModel__Group__5"
    // InternalModa.g:4017:1: rule__PredictiveModel__Group__5 : rule__PredictiveModel__Group__5__Impl rule__PredictiveModel__Group__6 ;
    public final void rule__PredictiveModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4021:1: ( rule__PredictiveModel__Group__5__Impl rule__PredictiveModel__Group__6 )
            // InternalModa.g:4022:2: rule__PredictiveModel__Group__5__Impl rule__PredictiveModel__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__PredictiveModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group__6();

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
    // $ANTLR end "rule__PredictiveModel__Group__5"


    // $ANTLR start "rule__PredictiveModel__Group__5__Impl"
    // InternalModa.g:4029:1: rule__PredictiveModel__Group__5__Impl : ( ( rule__PredictiveModel__Group_5__0 )? ) ;
    public final void rule__PredictiveModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4033:1: ( ( ( rule__PredictiveModel__Group_5__0 )? ) )
            // InternalModa.g:4034:1: ( ( rule__PredictiveModel__Group_5__0 )? )
            {
            // InternalModa.g:4034:1: ( ( rule__PredictiveModel__Group_5__0 )? )
            // InternalModa.g:4035:2: ( rule__PredictiveModel__Group_5__0 )?
            {
             before(grammarAccess.getPredictiveModelAccess().getGroup_5()); 
            // InternalModa.g:4036:2: ( rule__PredictiveModel__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==19) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalModa.g:4036:3: rule__PredictiveModel__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PredictiveModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPredictiveModelAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__Group__5__Impl"


    // $ANTLR start "rule__PredictiveModel__Group__6"
    // InternalModa.g:4044:1: rule__PredictiveModel__Group__6 : rule__PredictiveModel__Group__6__Impl rule__PredictiveModel__Group__7 ;
    public final void rule__PredictiveModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4048:1: ( rule__PredictiveModel__Group__6__Impl rule__PredictiveModel__Group__7 )
            // InternalModa.g:4049:2: rule__PredictiveModel__Group__6__Impl rule__PredictiveModel__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__PredictiveModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group__7();

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
    // $ANTLR end "rule__PredictiveModel__Group__6"


    // $ANTLR start "rule__PredictiveModel__Group__6__Impl"
    // InternalModa.g:4056:1: rule__PredictiveModel__Group__6__Impl : ( ( rule__PredictiveModel__Group_6__0 )? ) ;
    public final void rule__PredictiveModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4060:1: ( ( ( rule__PredictiveModel__Group_6__0 )? ) )
            // InternalModa.g:4061:1: ( ( rule__PredictiveModel__Group_6__0 )? )
            {
            // InternalModa.g:4061:1: ( ( rule__PredictiveModel__Group_6__0 )? )
            // InternalModa.g:4062:2: ( rule__PredictiveModel__Group_6__0 )?
            {
             before(grammarAccess.getPredictiveModelAccess().getGroup_6()); 
            // InternalModa.g:4063:2: ( rule__PredictiveModel__Group_6__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==27) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalModa.g:4063:3: rule__PredictiveModel__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PredictiveModel__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPredictiveModelAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__Group__6__Impl"


    // $ANTLR start "rule__PredictiveModel__Group__7"
    // InternalModa.g:4071:1: rule__PredictiveModel__Group__7 : rule__PredictiveModel__Group__7__Impl rule__PredictiveModel__Group__8 ;
    public final void rule__PredictiveModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4075:1: ( rule__PredictiveModel__Group__7__Impl rule__PredictiveModel__Group__8 )
            // InternalModa.g:4076:2: rule__PredictiveModel__Group__7__Impl rule__PredictiveModel__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__PredictiveModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group__8();

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
    // $ANTLR end "rule__PredictiveModel__Group__7"


    // $ANTLR start "rule__PredictiveModel__Group__7__Impl"
    // InternalModa.g:4083:1: rule__PredictiveModel__Group__7__Impl : ( ( rule__PredictiveModel__Group_7__0 )? ) ;
    public final void rule__PredictiveModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4087:1: ( ( ( rule__PredictiveModel__Group_7__0 )? ) )
            // InternalModa.g:4088:1: ( ( rule__PredictiveModel__Group_7__0 )? )
            {
            // InternalModa.g:4088:1: ( ( rule__PredictiveModel__Group_7__0 )? )
            // InternalModa.g:4089:2: ( rule__PredictiveModel__Group_7__0 )?
            {
             before(grammarAccess.getPredictiveModelAccess().getGroup_7()); 
            // InternalModa.g:4090:2: ( rule__PredictiveModel__Group_7__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalModa.g:4090:3: rule__PredictiveModel__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PredictiveModel__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPredictiveModelAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__Group__7__Impl"


    // $ANTLR start "rule__PredictiveModel__Group__8"
    // InternalModa.g:4098:1: rule__PredictiveModel__Group__8 : rule__PredictiveModel__Group__8__Impl ;
    public final void rule__PredictiveModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4102:1: ( rule__PredictiveModel__Group__8__Impl )
            // InternalModa.g:4103:2: rule__PredictiveModel__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group__8__Impl();

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
    // $ANTLR end "rule__PredictiveModel__Group__8"


    // $ANTLR start "rule__PredictiveModel__Group__8__Impl"
    // InternalModa.g:4109:1: rule__PredictiveModel__Group__8__Impl : ( '}' ) ;
    public final void rule__PredictiveModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4113:1: ( ( '}' ) )
            // InternalModa.g:4114:1: ( '}' )
            {
            // InternalModa.g:4114:1: ( '}' )
            // InternalModa.g:4115:2: '}'
            {
             before(grammarAccess.getPredictiveModelAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPredictiveModelAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__Group__8__Impl"


    // $ANTLR start "rule__PredictiveModel__Group_5__0"
    // InternalModa.g:4125:1: rule__PredictiveModel__Group_5__0 : rule__PredictiveModel__Group_5__0__Impl rule__PredictiveModel__Group_5__1 ;
    public final void rule__PredictiveModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4129:1: ( rule__PredictiveModel__Group_5__0__Impl rule__PredictiveModel__Group_5__1 )
            // InternalModa.g:4130:2: rule__PredictiveModel__Group_5__0__Impl rule__PredictiveModel__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__PredictiveModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group_5__1();

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
    // $ANTLR end "rule__PredictiveModel__Group_5__0"


    // $ANTLR start "rule__PredictiveModel__Group_5__0__Impl"
    // InternalModa.g:4137:1: rule__PredictiveModel__Group_5__0__Impl : ( 'data' ) ;
    public final void rule__PredictiveModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4141:1: ( ( 'data' ) )
            // InternalModa.g:4142:1: ( 'data' )
            {
            // InternalModa.g:4142:1: ( 'data' )
            // InternalModa.g:4143:2: 'data'
            {
             before(grammarAccess.getPredictiveModelAccess().getDataKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPredictiveModelAccess().getDataKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__Group_5__0__Impl"


    // $ANTLR start "rule__PredictiveModel__Group_5__1"
    // InternalModa.g:4152:1: rule__PredictiveModel__Group_5__1 : rule__PredictiveModel__Group_5__1__Impl rule__PredictiveModel__Group_5__2 ;
    public final void rule__PredictiveModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4156:1: ( rule__PredictiveModel__Group_5__1__Impl rule__PredictiveModel__Group_5__2 )
            // InternalModa.g:4157:2: rule__PredictiveModel__Group_5__1__Impl rule__PredictiveModel__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__PredictiveModel__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group_5__2();

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
    // $ANTLR end "rule__PredictiveModel__Group_5__1"


    // $ANTLR start "rule__PredictiveModel__Group_5__1__Impl"
    // InternalModa.g:4164:1: rule__PredictiveModel__Group_5__1__Impl : ( '(' ) ;
    public final void rule__PredictiveModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4168:1: ( ( '(' ) )
            // InternalModa.g:4169:1: ( '(' )
            {
            // InternalModa.g:4169:1: ( '(' )
            // InternalModa.g:4170:2: '('
            {
             before(grammarAccess.getPredictiveModelAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPredictiveModelAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__Group_5__1__Impl"


    // $ANTLR start "rule__PredictiveModel__Group_5__2"
    // InternalModa.g:4179:1: rule__PredictiveModel__Group_5__2 : rule__PredictiveModel__Group_5__2__Impl rule__PredictiveModel__Group_5__3 ;
    public final void rule__PredictiveModel__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4183:1: ( rule__PredictiveModel__Group_5__2__Impl rule__PredictiveModel__Group_5__3 )
            // InternalModa.g:4184:2: rule__PredictiveModel__Group_5__2__Impl rule__PredictiveModel__Group_5__3
            {
            pushFollow(FOLLOW_16);
            rule__PredictiveModel__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group_5__3();

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
    // $ANTLR end "rule__PredictiveModel__Group_5__2"


    // $ANTLR start "rule__PredictiveModel__Group_5__2__Impl"
    // InternalModa.g:4191:1: rule__PredictiveModel__Group_5__2__Impl : ( ( rule__PredictiveModel__DataAssignment_5_2 ) ) ;
    public final void rule__PredictiveModel__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4195:1: ( ( ( rule__PredictiveModel__DataAssignment_5_2 ) ) )
            // InternalModa.g:4196:1: ( ( rule__PredictiveModel__DataAssignment_5_2 ) )
            {
            // InternalModa.g:4196:1: ( ( rule__PredictiveModel__DataAssignment_5_2 ) )
            // InternalModa.g:4197:2: ( rule__PredictiveModel__DataAssignment_5_2 )
            {
             before(grammarAccess.getPredictiveModelAccess().getDataAssignment_5_2()); 
            // InternalModa.g:4198:2: ( rule__PredictiveModel__DataAssignment_5_2 )
            // InternalModa.g:4198:3: rule__PredictiveModel__DataAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveModel__DataAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getPredictiveModelAccess().getDataAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__Group_5__2__Impl"


    // $ANTLR start "rule__PredictiveModel__Group_5__3"
    // InternalModa.g:4206:1: rule__PredictiveModel__Group_5__3 : rule__PredictiveModel__Group_5__3__Impl rule__PredictiveModel__Group_5__4 ;
    public final void rule__PredictiveModel__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4210:1: ( rule__PredictiveModel__Group_5__3__Impl rule__PredictiveModel__Group_5__4 )
            // InternalModa.g:4211:2: rule__PredictiveModel__Group_5__3__Impl rule__PredictiveModel__Group_5__4
            {
            pushFollow(FOLLOW_16);
            rule__PredictiveModel__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group_5__4();

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
    // $ANTLR end "rule__PredictiveModel__Group_5__3"


    // $ANTLR start "rule__PredictiveModel__Group_5__3__Impl"
    // InternalModa.g:4218:1: rule__PredictiveModel__Group_5__3__Impl : ( ( rule__PredictiveModel__Group_5_3__0 )* ) ;
    public final void rule__PredictiveModel__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4222:1: ( ( ( rule__PredictiveModel__Group_5_3__0 )* ) )
            // InternalModa.g:4223:1: ( ( rule__PredictiveModel__Group_5_3__0 )* )
            {
            // InternalModa.g:4223:1: ( ( rule__PredictiveModel__Group_5_3__0 )* )
            // InternalModa.g:4224:2: ( rule__PredictiveModel__Group_5_3__0 )*
            {
             before(grammarAccess.getPredictiveModelAccess().getGroup_5_3()); 
            // InternalModa.g:4225:2: ( rule__PredictiveModel__Group_5_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==20) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalModa.g:4225:3: rule__PredictiveModel__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PredictiveModel__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getPredictiveModelAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__Group_5__3__Impl"


    // $ANTLR start "rule__PredictiveModel__Group_5__4"
    // InternalModa.g:4233:1: rule__PredictiveModel__Group_5__4 : rule__PredictiveModel__Group_5__4__Impl ;
    public final void rule__PredictiveModel__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4237:1: ( rule__PredictiveModel__Group_5__4__Impl )
            // InternalModa.g:4238:2: rule__PredictiveModel__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group_5__4__Impl();

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
    // $ANTLR end "rule__PredictiveModel__Group_5__4"


    // $ANTLR start "rule__PredictiveModel__Group_5__4__Impl"
    // InternalModa.g:4244:1: rule__PredictiveModel__Group_5__4__Impl : ( ')' ) ;
    public final void rule__PredictiveModel__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4248:1: ( ( ')' ) )
            // InternalModa.g:4249:1: ( ')' )
            {
            // InternalModa.g:4249:1: ( ')' )
            // InternalModa.g:4250:2: ')'
            {
             before(grammarAccess.getPredictiveModelAccess().getRightParenthesisKeyword_5_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPredictiveModelAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__Group_5__4__Impl"


    // $ANTLR start "rule__PredictiveModel__Group_5_3__0"
    // InternalModa.g:4260:1: rule__PredictiveModel__Group_5_3__0 : rule__PredictiveModel__Group_5_3__0__Impl rule__PredictiveModel__Group_5_3__1 ;
    public final void rule__PredictiveModel__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4264:1: ( rule__PredictiveModel__Group_5_3__0__Impl rule__PredictiveModel__Group_5_3__1 )
            // InternalModa.g:4265:2: rule__PredictiveModel__Group_5_3__0__Impl rule__PredictiveModel__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__PredictiveModel__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group_5_3__1();

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
    // $ANTLR end "rule__PredictiveModel__Group_5_3__0"


    // $ANTLR start "rule__PredictiveModel__Group_5_3__0__Impl"
    // InternalModa.g:4272:1: rule__PredictiveModel__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__PredictiveModel__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4276:1: ( ( ',' ) )
            // InternalModa.g:4277:1: ( ',' )
            {
            // InternalModa.g:4277:1: ( ',' )
            // InternalModa.g:4278:2: ','
            {
             before(grammarAccess.getPredictiveModelAccess().getCommaKeyword_5_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPredictiveModelAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__Group_5_3__0__Impl"


    // $ANTLR start "rule__PredictiveModel__Group_5_3__1"
    // InternalModa.g:4287:1: rule__PredictiveModel__Group_5_3__1 : rule__PredictiveModel__Group_5_3__1__Impl ;
    public final void rule__PredictiveModel__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4291:1: ( rule__PredictiveModel__Group_5_3__1__Impl )
            // InternalModa.g:4292:2: rule__PredictiveModel__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__PredictiveModel__Group_5_3__1"


    // $ANTLR start "rule__PredictiveModel__Group_5_3__1__Impl"
    // InternalModa.g:4298:1: rule__PredictiveModel__Group_5_3__1__Impl : ( ( rule__PredictiveModel__DataAssignment_5_3_1 ) ) ;
    public final void rule__PredictiveModel__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4302:1: ( ( ( rule__PredictiveModel__DataAssignment_5_3_1 ) ) )
            // InternalModa.g:4303:1: ( ( rule__PredictiveModel__DataAssignment_5_3_1 ) )
            {
            // InternalModa.g:4303:1: ( ( rule__PredictiveModel__DataAssignment_5_3_1 ) )
            // InternalModa.g:4304:2: ( rule__PredictiveModel__DataAssignment_5_3_1 )
            {
             before(grammarAccess.getPredictiveModelAccess().getDataAssignment_5_3_1()); 
            // InternalModa.g:4305:2: ( rule__PredictiveModel__DataAssignment_5_3_1 )
            // InternalModa.g:4305:3: rule__PredictiveModel__DataAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveModel__DataAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPredictiveModelAccess().getDataAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__Group_5_3__1__Impl"


    // $ANTLR start "rule__PredictiveModel__Group_6__0"
    // InternalModa.g:4314:1: rule__PredictiveModel__Group_6__0 : rule__PredictiveModel__Group_6__0__Impl rule__PredictiveModel__Group_6__1 ;
    public final void rule__PredictiveModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4318:1: ( rule__PredictiveModel__Group_6__0__Impl rule__PredictiveModel__Group_6__1 )
            // InternalModa.g:4319:2: rule__PredictiveModel__Group_6__0__Impl rule__PredictiveModel__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__PredictiveModel__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group_6__1();

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
    // $ANTLR end "rule__PredictiveModel__Group_6__0"


    // $ANTLR start "rule__PredictiveModel__Group_6__0__Impl"
    // InternalModa.g:4326:1: rule__PredictiveModel__Group_6__0__Impl : ( 'prescriptivemodel' ) ;
    public final void rule__PredictiveModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4330:1: ( ( 'prescriptivemodel' ) )
            // InternalModa.g:4331:1: ( 'prescriptivemodel' )
            {
            // InternalModa.g:4331:1: ( 'prescriptivemodel' )
            // InternalModa.g:4332:2: 'prescriptivemodel'
            {
             before(grammarAccess.getPredictiveModelAccess().getPrescriptivemodelKeyword_6_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPredictiveModelAccess().getPrescriptivemodelKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__Group_6__0__Impl"


    // $ANTLR start "rule__PredictiveModel__Group_6__1"
    // InternalModa.g:4341:1: rule__PredictiveModel__Group_6__1 : rule__PredictiveModel__Group_6__1__Impl ;
    public final void rule__PredictiveModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4345:1: ( rule__PredictiveModel__Group_6__1__Impl )
            // InternalModa.g:4346:2: rule__PredictiveModel__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group_6__1__Impl();

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
    // $ANTLR end "rule__PredictiveModel__Group_6__1"


    // $ANTLR start "rule__PredictiveModel__Group_6__1__Impl"
    // InternalModa.g:4352:1: rule__PredictiveModel__Group_6__1__Impl : ( ( rule__PredictiveModel__PrescriptivemodelAssignment_6_1 ) ) ;
    public final void rule__PredictiveModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4356:1: ( ( ( rule__PredictiveModel__PrescriptivemodelAssignment_6_1 ) ) )
            // InternalModa.g:4357:1: ( ( rule__PredictiveModel__PrescriptivemodelAssignment_6_1 ) )
            {
            // InternalModa.g:4357:1: ( ( rule__PredictiveModel__PrescriptivemodelAssignment_6_1 ) )
            // InternalModa.g:4358:2: ( rule__PredictiveModel__PrescriptivemodelAssignment_6_1 )
            {
             before(grammarAccess.getPredictiveModelAccess().getPrescriptivemodelAssignment_6_1()); 
            // InternalModa.g:4359:2: ( rule__PredictiveModel__PrescriptivemodelAssignment_6_1 )
            // InternalModa.g:4359:3: rule__PredictiveModel__PrescriptivemodelAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveModel__PrescriptivemodelAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPredictiveModelAccess().getPrescriptivemodelAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__Group_6__1__Impl"


    // $ANTLR start "rule__PredictiveModel__Group_7__0"
    // InternalModa.g:4368:1: rule__PredictiveModel__Group_7__0 : rule__PredictiveModel__Group_7__0__Impl rule__PredictiveModel__Group_7__1 ;
    public final void rule__PredictiveModel__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4372:1: ( rule__PredictiveModel__Group_7__0__Impl rule__PredictiveModel__Group_7__1 )
            // InternalModa.g:4373:2: rule__PredictiveModel__Group_7__0__Impl rule__PredictiveModel__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__PredictiveModel__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group_7__1();

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
    // $ANTLR end "rule__PredictiveModel__Group_7__0"


    // $ANTLR start "rule__PredictiveModel__Group_7__0__Impl"
    // InternalModa.g:4380:1: rule__PredictiveModel__Group_7__0__Impl : ( 'descriptivemodel' ) ;
    public final void rule__PredictiveModel__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4384:1: ( ( 'descriptivemodel' ) )
            // InternalModa.g:4385:1: ( 'descriptivemodel' )
            {
            // InternalModa.g:4385:1: ( 'descriptivemodel' )
            // InternalModa.g:4386:2: 'descriptivemodel'
            {
             before(grammarAccess.getPredictiveModelAccess().getDescriptivemodelKeyword_7_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPredictiveModelAccess().getDescriptivemodelKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__Group_7__0__Impl"


    // $ANTLR start "rule__PredictiveModel__Group_7__1"
    // InternalModa.g:4395:1: rule__PredictiveModel__Group_7__1 : rule__PredictiveModel__Group_7__1__Impl ;
    public final void rule__PredictiveModel__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4399:1: ( rule__PredictiveModel__Group_7__1__Impl )
            // InternalModa.g:4400:2: rule__PredictiveModel__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveModel__Group_7__1__Impl();

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
    // $ANTLR end "rule__PredictiveModel__Group_7__1"


    // $ANTLR start "rule__PredictiveModel__Group_7__1__Impl"
    // InternalModa.g:4406:1: rule__PredictiveModel__Group_7__1__Impl : ( ( rule__PredictiveModel__DescriptivemodelAssignment_7_1 ) ) ;
    public final void rule__PredictiveModel__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4410:1: ( ( ( rule__PredictiveModel__DescriptivemodelAssignment_7_1 ) ) )
            // InternalModa.g:4411:1: ( ( rule__PredictiveModel__DescriptivemodelAssignment_7_1 ) )
            {
            // InternalModa.g:4411:1: ( ( rule__PredictiveModel__DescriptivemodelAssignment_7_1 ) )
            // InternalModa.g:4412:2: ( rule__PredictiveModel__DescriptivemodelAssignment_7_1 )
            {
             before(grammarAccess.getPredictiveModelAccess().getDescriptivemodelAssignment_7_1()); 
            // InternalModa.g:4413:2: ( rule__PredictiveModel__DescriptivemodelAssignment_7_1 )
            // InternalModa.g:4413:3: rule__PredictiveModel__DescriptivemodelAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__PredictiveModel__DescriptivemodelAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPredictiveModelAccess().getDescriptivemodelAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__Group_7__1__Impl"


    // $ANTLR start "rule__DescriptiveModel__Group__0"
    // InternalModa.g:4422:1: rule__DescriptiveModel__Group__0 : rule__DescriptiveModel__Group__0__Impl rule__DescriptiveModel__Group__1 ;
    public final void rule__DescriptiveModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4426:1: ( rule__DescriptiveModel__Group__0__Impl rule__DescriptiveModel__Group__1 )
            // InternalModa.g:4427:2: rule__DescriptiveModel__Group__0__Impl rule__DescriptiveModel__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DescriptiveModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__Group__1();

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
    // $ANTLR end "rule__DescriptiveModel__Group__0"


    // $ANTLR start "rule__DescriptiveModel__Group__0__Impl"
    // InternalModa.g:4434:1: rule__DescriptiveModel__Group__0__Impl : ( 'DescriptiveModel' ) ;
    public final void rule__DescriptiveModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4438:1: ( ( 'DescriptiveModel' ) )
            // InternalModa.g:4439:1: ( 'DescriptiveModel' )
            {
            // InternalModa.g:4439:1: ( 'DescriptiveModel' )
            // InternalModa.g:4440:2: 'DescriptiveModel'
            {
             before(grammarAccess.getDescriptiveModelAccess().getDescriptiveModelKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDescriptiveModelAccess().getDescriptiveModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__Group__0__Impl"


    // $ANTLR start "rule__DescriptiveModel__Group__1"
    // InternalModa.g:4449:1: rule__DescriptiveModel__Group__1 : rule__DescriptiveModel__Group__1__Impl rule__DescriptiveModel__Group__2 ;
    public final void rule__DescriptiveModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4453:1: ( rule__DescriptiveModel__Group__1__Impl rule__DescriptiveModel__Group__2 )
            // InternalModa.g:4454:2: rule__DescriptiveModel__Group__1__Impl rule__DescriptiveModel__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DescriptiveModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__Group__2();

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
    // $ANTLR end "rule__DescriptiveModel__Group__1"


    // $ANTLR start "rule__DescriptiveModel__Group__1__Impl"
    // InternalModa.g:4461:1: rule__DescriptiveModel__Group__1__Impl : ( ( rule__DescriptiveModel__NameAssignment_1 ) ) ;
    public final void rule__DescriptiveModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4465:1: ( ( ( rule__DescriptiveModel__NameAssignment_1 ) ) )
            // InternalModa.g:4466:1: ( ( rule__DescriptiveModel__NameAssignment_1 ) )
            {
            // InternalModa.g:4466:1: ( ( rule__DescriptiveModel__NameAssignment_1 ) )
            // InternalModa.g:4467:2: ( rule__DescriptiveModel__NameAssignment_1 )
            {
             before(grammarAccess.getDescriptiveModelAccess().getNameAssignment_1()); 
            // InternalModa.g:4468:2: ( rule__DescriptiveModel__NameAssignment_1 )
            // InternalModa.g:4468:3: rule__DescriptiveModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDescriptiveModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__Group__1__Impl"


    // $ANTLR start "rule__DescriptiveModel__Group__2"
    // InternalModa.g:4476:1: rule__DescriptiveModel__Group__2 : rule__DescriptiveModel__Group__2__Impl rule__DescriptiveModel__Group__3 ;
    public final void rule__DescriptiveModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4480:1: ( rule__DescriptiveModel__Group__2__Impl rule__DescriptiveModel__Group__3 )
            // InternalModa.g:4481:2: rule__DescriptiveModel__Group__2__Impl rule__DescriptiveModel__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__DescriptiveModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__Group__3();

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
    // $ANTLR end "rule__DescriptiveModel__Group__2"


    // $ANTLR start "rule__DescriptiveModel__Group__2__Impl"
    // InternalModa.g:4488:1: rule__DescriptiveModel__Group__2__Impl : ( '{' ) ;
    public final void rule__DescriptiveModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4492:1: ( ( '{' ) )
            // InternalModa.g:4493:1: ( '{' )
            {
            // InternalModa.g:4493:1: ( '{' )
            // InternalModa.g:4494:2: '{'
            {
             before(grammarAccess.getDescriptiveModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDescriptiveModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__Group__2__Impl"


    // $ANTLR start "rule__DescriptiveModel__Group__3"
    // InternalModa.g:4503:1: rule__DescriptiveModel__Group__3 : rule__DescriptiveModel__Group__3__Impl rule__DescriptiveModel__Group__4 ;
    public final void rule__DescriptiveModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4507:1: ( rule__DescriptiveModel__Group__3__Impl rule__DescriptiveModel__Group__4 )
            // InternalModa.g:4508:2: rule__DescriptiveModel__Group__3__Impl rule__DescriptiveModel__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__DescriptiveModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__Group__4();

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
    // $ANTLR end "rule__DescriptiveModel__Group__3"


    // $ANTLR start "rule__DescriptiveModel__Group__3__Impl"
    // InternalModa.g:4515:1: rule__DescriptiveModel__Group__3__Impl : ( 'model' ) ;
    public final void rule__DescriptiveModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4519:1: ( ( 'model' ) )
            // InternalModa.g:4520:1: ( 'model' )
            {
            // InternalModa.g:4520:1: ( 'model' )
            // InternalModa.g:4521:2: 'model'
            {
             before(grammarAccess.getDescriptiveModelAccess().getModelKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDescriptiveModelAccess().getModelKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__Group__3__Impl"


    // $ANTLR start "rule__DescriptiveModel__Group__4"
    // InternalModa.g:4530:1: rule__DescriptiveModel__Group__4 : rule__DescriptiveModel__Group__4__Impl rule__DescriptiveModel__Group__5 ;
    public final void rule__DescriptiveModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4534:1: ( rule__DescriptiveModel__Group__4__Impl rule__DescriptiveModel__Group__5 )
            // InternalModa.g:4535:2: rule__DescriptiveModel__Group__4__Impl rule__DescriptiveModel__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__DescriptiveModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__Group__5();

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
    // $ANTLR end "rule__DescriptiveModel__Group__4"


    // $ANTLR start "rule__DescriptiveModel__Group__4__Impl"
    // InternalModa.g:4542:1: rule__DescriptiveModel__Group__4__Impl : ( ( rule__DescriptiveModel__ModelAssignment_4 ) ) ;
    public final void rule__DescriptiveModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4546:1: ( ( ( rule__DescriptiveModel__ModelAssignment_4 ) ) )
            // InternalModa.g:4547:1: ( ( rule__DescriptiveModel__ModelAssignment_4 ) )
            {
            // InternalModa.g:4547:1: ( ( rule__DescriptiveModel__ModelAssignment_4 ) )
            // InternalModa.g:4548:2: ( rule__DescriptiveModel__ModelAssignment_4 )
            {
             before(grammarAccess.getDescriptiveModelAccess().getModelAssignment_4()); 
            // InternalModa.g:4549:2: ( rule__DescriptiveModel__ModelAssignment_4 )
            // InternalModa.g:4549:3: rule__DescriptiveModel__ModelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__ModelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDescriptiveModelAccess().getModelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__Group__4__Impl"


    // $ANTLR start "rule__DescriptiveModel__Group__5"
    // InternalModa.g:4557:1: rule__DescriptiveModel__Group__5 : rule__DescriptiveModel__Group__5__Impl rule__DescriptiveModel__Group__6 ;
    public final void rule__DescriptiveModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4561:1: ( rule__DescriptiveModel__Group__5__Impl rule__DescriptiveModel__Group__6 )
            // InternalModa.g:4562:2: rule__DescriptiveModel__Group__5__Impl rule__DescriptiveModel__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__DescriptiveModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__Group__6();

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
    // $ANTLR end "rule__DescriptiveModel__Group__5"


    // $ANTLR start "rule__DescriptiveModel__Group__5__Impl"
    // InternalModa.g:4569:1: rule__DescriptiveModel__Group__5__Impl : ( ( rule__DescriptiveModel__Group_5__0 )? ) ;
    public final void rule__DescriptiveModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4573:1: ( ( ( rule__DescriptiveModel__Group_5__0 )? ) )
            // InternalModa.g:4574:1: ( ( rule__DescriptiveModel__Group_5__0 )? )
            {
            // InternalModa.g:4574:1: ( ( rule__DescriptiveModel__Group_5__0 )? )
            // InternalModa.g:4575:2: ( rule__DescriptiveModel__Group_5__0 )?
            {
             before(grammarAccess.getDescriptiveModelAccess().getGroup_5()); 
            // InternalModa.g:4576:2: ( rule__DescriptiveModel__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==19) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalModa.g:4576:3: rule__DescriptiveModel__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DescriptiveModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDescriptiveModelAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__Group__5__Impl"


    // $ANTLR start "rule__DescriptiveModel__Group__6"
    // InternalModa.g:4584:1: rule__DescriptiveModel__Group__6 : rule__DescriptiveModel__Group__6__Impl rule__DescriptiveModel__Group__7 ;
    public final void rule__DescriptiveModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4588:1: ( rule__DescriptiveModel__Group__6__Impl rule__DescriptiveModel__Group__7 )
            // InternalModa.g:4589:2: rule__DescriptiveModel__Group__6__Impl rule__DescriptiveModel__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__DescriptiveModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__Group__7();

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
    // $ANTLR end "rule__DescriptiveModel__Group__6"


    // $ANTLR start "rule__DescriptiveModel__Group__6__Impl"
    // InternalModa.g:4596:1: rule__DescriptiveModel__Group__6__Impl : ( ( rule__DescriptiveModel__Group_6__0 )? ) ;
    public final void rule__DescriptiveModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4600:1: ( ( ( rule__DescriptiveModel__Group_6__0 )? ) )
            // InternalModa.g:4601:1: ( ( rule__DescriptiveModel__Group_6__0 )? )
            {
            // InternalModa.g:4601:1: ( ( rule__DescriptiveModel__Group_6__0 )? )
            // InternalModa.g:4602:2: ( rule__DescriptiveModel__Group_6__0 )?
            {
             before(grammarAccess.getDescriptiveModelAccess().getGroup_6()); 
            // InternalModa.g:4603:2: ( rule__DescriptiveModel__Group_6__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalModa.g:4603:3: rule__DescriptiveModel__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DescriptiveModel__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDescriptiveModelAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__Group__6__Impl"


    // $ANTLR start "rule__DescriptiveModel__Group__7"
    // InternalModa.g:4611:1: rule__DescriptiveModel__Group__7 : rule__DescriptiveModel__Group__7__Impl ;
    public final void rule__DescriptiveModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4615:1: ( rule__DescriptiveModel__Group__7__Impl )
            // InternalModa.g:4616:2: rule__DescriptiveModel__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__Group__7__Impl();

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
    // $ANTLR end "rule__DescriptiveModel__Group__7"


    // $ANTLR start "rule__DescriptiveModel__Group__7__Impl"
    // InternalModa.g:4622:1: rule__DescriptiveModel__Group__7__Impl : ( '}' ) ;
    public final void rule__DescriptiveModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4626:1: ( ( '}' ) )
            // InternalModa.g:4627:1: ( '}' )
            {
            // InternalModa.g:4627:1: ( '}' )
            // InternalModa.g:4628:2: '}'
            {
             before(grammarAccess.getDescriptiveModelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDescriptiveModelAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__Group__7__Impl"


    // $ANTLR start "rule__DescriptiveModel__Group_5__0"
    // InternalModa.g:4638:1: rule__DescriptiveModel__Group_5__0 : rule__DescriptiveModel__Group_5__0__Impl rule__DescriptiveModel__Group_5__1 ;
    public final void rule__DescriptiveModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4642:1: ( rule__DescriptiveModel__Group_5__0__Impl rule__DescriptiveModel__Group_5__1 )
            // InternalModa.g:4643:2: rule__DescriptiveModel__Group_5__0__Impl rule__DescriptiveModel__Group_5__1
            {
            pushFollow(FOLLOW_15);
            rule__DescriptiveModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__Group_5__1();

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
    // $ANTLR end "rule__DescriptiveModel__Group_5__0"


    // $ANTLR start "rule__DescriptiveModel__Group_5__0__Impl"
    // InternalModa.g:4650:1: rule__DescriptiveModel__Group_5__0__Impl : ( 'data' ) ;
    public final void rule__DescriptiveModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4654:1: ( ( 'data' ) )
            // InternalModa.g:4655:1: ( 'data' )
            {
            // InternalModa.g:4655:1: ( 'data' )
            // InternalModa.g:4656:2: 'data'
            {
             before(grammarAccess.getDescriptiveModelAccess().getDataKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDescriptiveModelAccess().getDataKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__Group_5__0__Impl"


    // $ANTLR start "rule__DescriptiveModel__Group_5__1"
    // InternalModa.g:4665:1: rule__DescriptiveModel__Group_5__1 : rule__DescriptiveModel__Group_5__1__Impl rule__DescriptiveModel__Group_5__2 ;
    public final void rule__DescriptiveModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4669:1: ( rule__DescriptiveModel__Group_5__1__Impl rule__DescriptiveModel__Group_5__2 )
            // InternalModa.g:4670:2: rule__DescriptiveModel__Group_5__1__Impl rule__DescriptiveModel__Group_5__2
            {
            pushFollow(FOLLOW_4);
            rule__DescriptiveModel__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__Group_5__2();

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
    // $ANTLR end "rule__DescriptiveModel__Group_5__1"


    // $ANTLR start "rule__DescriptiveModel__Group_5__1__Impl"
    // InternalModa.g:4677:1: rule__DescriptiveModel__Group_5__1__Impl : ( '(' ) ;
    public final void rule__DescriptiveModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4681:1: ( ( '(' ) )
            // InternalModa.g:4682:1: ( '(' )
            {
            // InternalModa.g:4682:1: ( '(' )
            // InternalModa.g:4683:2: '('
            {
             before(grammarAccess.getDescriptiveModelAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDescriptiveModelAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__Group_5__1__Impl"


    // $ANTLR start "rule__DescriptiveModel__Group_5__2"
    // InternalModa.g:4692:1: rule__DescriptiveModel__Group_5__2 : rule__DescriptiveModel__Group_5__2__Impl rule__DescriptiveModel__Group_5__3 ;
    public final void rule__DescriptiveModel__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4696:1: ( rule__DescriptiveModel__Group_5__2__Impl rule__DescriptiveModel__Group_5__3 )
            // InternalModa.g:4697:2: rule__DescriptiveModel__Group_5__2__Impl rule__DescriptiveModel__Group_5__3
            {
            pushFollow(FOLLOW_16);
            rule__DescriptiveModel__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__Group_5__3();

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
    // $ANTLR end "rule__DescriptiveModel__Group_5__2"


    // $ANTLR start "rule__DescriptiveModel__Group_5__2__Impl"
    // InternalModa.g:4704:1: rule__DescriptiveModel__Group_5__2__Impl : ( ( rule__DescriptiveModel__DataAssignment_5_2 ) ) ;
    public final void rule__DescriptiveModel__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4708:1: ( ( ( rule__DescriptiveModel__DataAssignment_5_2 ) ) )
            // InternalModa.g:4709:1: ( ( rule__DescriptiveModel__DataAssignment_5_2 ) )
            {
            // InternalModa.g:4709:1: ( ( rule__DescriptiveModel__DataAssignment_5_2 ) )
            // InternalModa.g:4710:2: ( rule__DescriptiveModel__DataAssignment_5_2 )
            {
             before(grammarAccess.getDescriptiveModelAccess().getDataAssignment_5_2()); 
            // InternalModa.g:4711:2: ( rule__DescriptiveModel__DataAssignment_5_2 )
            // InternalModa.g:4711:3: rule__DescriptiveModel__DataAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__DataAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getDescriptiveModelAccess().getDataAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__Group_5__2__Impl"


    // $ANTLR start "rule__DescriptiveModel__Group_5__3"
    // InternalModa.g:4719:1: rule__DescriptiveModel__Group_5__3 : rule__DescriptiveModel__Group_5__3__Impl rule__DescriptiveModel__Group_5__4 ;
    public final void rule__DescriptiveModel__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4723:1: ( rule__DescriptiveModel__Group_5__3__Impl rule__DescriptiveModel__Group_5__4 )
            // InternalModa.g:4724:2: rule__DescriptiveModel__Group_5__3__Impl rule__DescriptiveModel__Group_5__4
            {
            pushFollow(FOLLOW_16);
            rule__DescriptiveModel__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__Group_5__4();

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
    // $ANTLR end "rule__DescriptiveModel__Group_5__3"


    // $ANTLR start "rule__DescriptiveModel__Group_5__3__Impl"
    // InternalModa.g:4731:1: rule__DescriptiveModel__Group_5__3__Impl : ( ( rule__DescriptiveModel__Group_5_3__0 )* ) ;
    public final void rule__DescriptiveModel__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4735:1: ( ( ( rule__DescriptiveModel__Group_5_3__0 )* ) )
            // InternalModa.g:4736:1: ( ( rule__DescriptiveModel__Group_5_3__0 )* )
            {
            // InternalModa.g:4736:1: ( ( rule__DescriptiveModel__Group_5_3__0 )* )
            // InternalModa.g:4737:2: ( rule__DescriptiveModel__Group_5_3__0 )*
            {
             before(grammarAccess.getDescriptiveModelAccess().getGroup_5_3()); 
            // InternalModa.g:4738:2: ( rule__DescriptiveModel__Group_5_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==20) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalModa.g:4738:3: rule__DescriptiveModel__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__DescriptiveModel__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getDescriptiveModelAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__Group_5__3__Impl"


    // $ANTLR start "rule__DescriptiveModel__Group_5__4"
    // InternalModa.g:4746:1: rule__DescriptiveModel__Group_5__4 : rule__DescriptiveModel__Group_5__4__Impl ;
    public final void rule__DescriptiveModel__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4750:1: ( rule__DescriptiveModel__Group_5__4__Impl )
            // InternalModa.g:4751:2: rule__DescriptiveModel__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__Group_5__4__Impl();

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
    // $ANTLR end "rule__DescriptiveModel__Group_5__4"


    // $ANTLR start "rule__DescriptiveModel__Group_5__4__Impl"
    // InternalModa.g:4757:1: rule__DescriptiveModel__Group_5__4__Impl : ( ')' ) ;
    public final void rule__DescriptiveModel__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4761:1: ( ( ')' ) )
            // InternalModa.g:4762:1: ( ')' )
            {
            // InternalModa.g:4762:1: ( ')' )
            // InternalModa.g:4763:2: ')'
            {
             before(grammarAccess.getDescriptiveModelAccess().getRightParenthesisKeyword_5_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDescriptiveModelAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__Group_5__4__Impl"


    // $ANTLR start "rule__DescriptiveModel__Group_5_3__0"
    // InternalModa.g:4773:1: rule__DescriptiveModel__Group_5_3__0 : rule__DescriptiveModel__Group_5_3__0__Impl rule__DescriptiveModel__Group_5_3__1 ;
    public final void rule__DescriptiveModel__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4777:1: ( rule__DescriptiveModel__Group_5_3__0__Impl rule__DescriptiveModel__Group_5_3__1 )
            // InternalModa.g:4778:2: rule__DescriptiveModel__Group_5_3__0__Impl rule__DescriptiveModel__Group_5_3__1
            {
            pushFollow(FOLLOW_4);
            rule__DescriptiveModel__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__Group_5_3__1();

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
    // $ANTLR end "rule__DescriptiveModel__Group_5_3__0"


    // $ANTLR start "rule__DescriptiveModel__Group_5_3__0__Impl"
    // InternalModa.g:4785:1: rule__DescriptiveModel__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__DescriptiveModel__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4789:1: ( ( ',' ) )
            // InternalModa.g:4790:1: ( ',' )
            {
            // InternalModa.g:4790:1: ( ',' )
            // InternalModa.g:4791:2: ','
            {
             before(grammarAccess.getDescriptiveModelAccess().getCommaKeyword_5_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDescriptiveModelAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__Group_5_3__0__Impl"


    // $ANTLR start "rule__DescriptiveModel__Group_5_3__1"
    // InternalModa.g:4800:1: rule__DescriptiveModel__Group_5_3__1 : rule__DescriptiveModel__Group_5_3__1__Impl ;
    public final void rule__DescriptiveModel__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4804:1: ( rule__DescriptiveModel__Group_5_3__1__Impl )
            // InternalModa.g:4805:2: rule__DescriptiveModel__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__DescriptiveModel__Group_5_3__1"


    // $ANTLR start "rule__DescriptiveModel__Group_5_3__1__Impl"
    // InternalModa.g:4811:1: rule__DescriptiveModel__Group_5_3__1__Impl : ( ( rule__DescriptiveModel__DataAssignment_5_3_1 ) ) ;
    public final void rule__DescriptiveModel__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4815:1: ( ( ( rule__DescriptiveModel__DataAssignment_5_3_1 ) ) )
            // InternalModa.g:4816:1: ( ( rule__DescriptiveModel__DataAssignment_5_3_1 ) )
            {
            // InternalModa.g:4816:1: ( ( rule__DescriptiveModel__DataAssignment_5_3_1 ) )
            // InternalModa.g:4817:2: ( rule__DescriptiveModel__DataAssignment_5_3_1 )
            {
             before(grammarAccess.getDescriptiveModelAccess().getDataAssignment_5_3_1()); 
            // InternalModa.g:4818:2: ( rule__DescriptiveModel__DataAssignment_5_3_1 )
            // InternalModa.g:4818:3: rule__DescriptiveModel__DataAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__DataAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDescriptiveModelAccess().getDataAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__Group_5_3__1__Impl"


    // $ANTLR start "rule__DescriptiveModel__Group_6__0"
    // InternalModa.g:4827:1: rule__DescriptiveModel__Group_6__0 : rule__DescriptiveModel__Group_6__0__Impl rule__DescriptiveModel__Group_6__1 ;
    public final void rule__DescriptiveModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4831:1: ( rule__DescriptiveModel__Group_6__0__Impl rule__DescriptiveModel__Group_6__1 )
            // InternalModa.g:4832:2: rule__DescriptiveModel__Group_6__0__Impl rule__DescriptiveModel__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__DescriptiveModel__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__Group_6__1();

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
    // $ANTLR end "rule__DescriptiveModel__Group_6__0"


    // $ANTLR start "rule__DescriptiveModel__Group_6__0__Impl"
    // InternalModa.g:4839:1: rule__DescriptiveModel__Group_6__0__Impl : ( 'predictivemodel' ) ;
    public final void rule__DescriptiveModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4843:1: ( ( 'predictivemodel' ) )
            // InternalModa.g:4844:1: ( 'predictivemodel' )
            {
            // InternalModa.g:4844:1: ( 'predictivemodel' )
            // InternalModa.g:4845:2: 'predictivemodel'
            {
             before(grammarAccess.getDescriptiveModelAccess().getPredictivemodelKeyword_6_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDescriptiveModelAccess().getPredictivemodelKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__Group_6__0__Impl"


    // $ANTLR start "rule__DescriptiveModel__Group_6__1"
    // InternalModa.g:4854:1: rule__DescriptiveModel__Group_6__1 : rule__DescriptiveModel__Group_6__1__Impl ;
    public final void rule__DescriptiveModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4858:1: ( rule__DescriptiveModel__Group_6__1__Impl )
            // InternalModa.g:4859:2: rule__DescriptiveModel__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__Group_6__1__Impl();

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
    // $ANTLR end "rule__DescriptiveModel__Group_6__1"


    // $ANTLR start "rule__DescriptiveModel__Group_6__1__Impl"
    // InternalModa.g:4865:1: rule__DescriptiveModel__Group_6__1__Impl : ( ( rule__DescriptiveModel__PredictivemodelAssignment_6_1 ) ) ;
    public final void rule__DescriptiveModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4869:1: ( ( ( rule__DescriptiveModel__PredictivemodelAssignment_6_1 ) ) )
            // InternalModa.g:4870:1: ( ( rule__DescriptiveModel__PredictivemodelAssignment_6_1 ) )
            {
            // InternalModa.g:4870:1: ( ( rule__DescriptiveModel__PredictivemodelAssignment_6_1 ) )
            // InternalModa.g:4871:2: ( rule__DescriptiveModel__PredictivemodelAssignment_6_1 )
            {
             before(grammarAccess.getDescriptiveModelAccess().getPredictivemodelAssignment_6_1()); 
            // InternalModa.g:4872:2: ( rule__DescriptiveModel__PredictivemodelAssignment_6_1 )
            // InternalModa.g:4872:3: rule__DescriptiveModel__PredictivemodelAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__DescriptiveModel__PredictivemodelAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDescriptiveModelAccess().getPredictivemodelAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__Group_6__1__Impl"


    // $ANTLR start "rule__MODA__NameAssignment_2"
    // InternalModa.g:4881:1: rule__MODA__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__MODA__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4885:1: ( ( ruleEString ) )
            // InternalModa.g:4886:2: ( ruleEString )
            {
            // InternalModa.g:4886:2: ( ruleEString )
            // InternalModa.g:4887:3: ruleEString
            {
             before(grammarAccess.getMODAAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMODAAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__NameAssignment_2"


    // $ANTLR start "rule__MODA__SociotechnicalsystemAssignment_4_1"
    // InternalModa.g:4896:1: rule__MODA__SociotechnicalsystemAssignment_4_1 : ( ruleSocioTechnicalSystem ) ;
    public final void rule__MODA__SociotechnicalsystemAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4900:1: ( ( ruleSocioTechnicalSystem ) )
            // InternalModa.g:4901:2: ( ruleSocioTechnicalSystem )
            {
            // InternalModa.g:4901:2: ( ruleSocioTechnicalSystem )
            // InternalModa.g:4902:3: ruleSocioTechnicalSystem
            {
             before(grammarAccess.getMODAAccess().getSociotechnicalsystemSocioTechnicalSystemParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSocioTechnicalSystem();

            state._fsp--;

             after(grammarAccess.getMODAAccess().getSociotechnicalsystemSocioTechnicalSystemParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__SociotechnicalsystemAssignment_4_1"


    // $ANTLR start "rule__MODA__DataAssignment_5_2"
    // InternalModa.g:4911:1: rule__MODA__DataAssignment_5_2 : ( ruleData ) ;
    public final void rule__MODA__DataAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4915:1: ( ( ruleData ) )
            // InternalModa.g:4916:2: ( ruleData )
            {
            // InternalModa.g:4916:2: ( ruleData )
            // InternalModa.g:4917:3: ruleData
            {
             before(grammarAccess.getMODAAccess().getDataDataParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getMODAAccess().getDataDataParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__DataAssignment_5_2"


    // $ANTLR start "rule__MODA__DataAssignment_5_3_1"
    // InternalModa.g:4926:1: rule__MODA__DataAssignment_5_3_1 : ( ruleData ) ;
    public final void rule__MODA__DataAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4930:1: ( ( ruleData ) )
            // InternalModa.g:4931:2: ( ruleData )
            {
            // InternalModa.g:4931:2: ( ruleData )
            // InternalModa.g:4932:3: ruleData
            {
             before(grammarAccess.getMODAAccess().getDataDataParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleData();

            state._fsp--;

             after(grammarAccess.getMODAAccess().getDataDataParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__DataAssignment_5_3_1"


    // $ANTLR start "rule__MODA__SoftwareAssignment_6_1"
    // InternalModa.g:4941:1: rule__MODA__SoftwareAssignment_6_1 : ( ruleSoftware ) ;
    public final void rule__MODA__SoftwareAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4945:1: ( ( ruleSoftware ) )
            // InternalModa.g:4946:2: ( ruleSoftware )
            {
            // InternalModa.g:4946:2: ( ruleSoftware )
            // InternalModa.g:4947:3: ruleSoftware
            {
             before(grammarAccess.getMODAAccess().getSoftwareSoftwareParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSoftware();

            state._fsp--;

             after(grammarAccess.getMODAAccess().getSoftwareSoftwareParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__SoftwareAssignment_6_1"


    // $ANTLR start "rule__MODA__ModelAssignment_7_2"
    // InternalModa.g:4956:1: rule__MODA__ModelAssignment_7_2 : ( ruleModel ) ;
    public final void rule__MODA__ModelAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4960:1: ( ( ruleModel ) )
            // InternalModa.g:4961:2: ( ruleModel )
            {
            // InternalModa.g:4961:2: ( ruleModel )
            // InternalModa.g:4962:3: ruleModel
            {
             before(grammarAccess.getMODAAccess().getModelModelParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getMODAAccess().getModelModelParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__ModelAssignment_7_2"


    // $ANTLR start "rule__MODA__ModelAssignment_7_3_1"
    // InternalModa.g:4971:1: rule__MODA__ModelAssignment_7_3_1 : ( ruleModel ) ;
    public final void rule__MODA__ModelAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4975:1: ( ( ruleModel ) )
            // InternalModa.g:4976:2: ( ruleModel )
            {
            // InternalModa.g:4976:2: ( ruleModel )
            // InternalModa.g:4977:3: ruleModel
            {
             before(grammarAccess.getMODAAccess().getModelModelParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getMODAAccess().getModelModelParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__ModelAssignment_7_3_1"


    // $ANTLR start "rule__MODA__ModelroleAssignment_8_2"
    // InternalModa.g:4986:1: rule__MODA__ModelroleAssignment_8_2 : ( ruleModelRole ) ;
    public final void rule__MODA__ModelroleAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:4990:1: ( ( ruleModelRole ) )
            // InternalModa.g:4991:2: ( ruleModelRole )
            {
            // InternalModa.g:4991:2: ( ruleModelRole )
            // InternalModa.g:4992:3: ruleModelRole
            {
             before(grammarAccess.getMODAAccess().getModelroleModelRoleParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleModelRole();

            state._fsp--;

             after(grammarAccess.getMODAAccess().getModelroleModelRoleParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__ModelroleAssignment_8_2"


    // $ANTLR start "rule__MODA__ModelroleAssignment_8_3_1"
    // InternalModa.g:5001:1: rule__MODA__ModelroleAssignment_8_3_1 : ( ruleModelRole ) ;
    public final void rule__MODA__ModelroleAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5005:1: ( ( ruleModelRole ) )
            // InternalModa.g:5006:2: ( ruleModelRole )
            {
            // InternalModa.g:5006:2: ( ruleModelRole )
            // InternalModa.g:5007:3: ruleModelRole
            {
             before(grammarAccess.getMODAAccess().getModelroleModelRoleParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModelRole();

            state._fsp--;

             after(grammarAccess.getMODAAccess().getModelroleModelRoleParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODA__ModelroleAssignment_8_3_1"


    // $ANTLR start "rule__SocioTechnicalSystem__NameAssignment_2"
    // InternalModa.g:5016:1: rule__SocioTechnicalSystem__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SocioTechnicalSystem__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5020:1: ( ( ruleEString ) )
            // InternalModa.g:5021:2: ( ruleEString )
            {
            // InternalModa.g:5021:2: ( ruleEString )
            // InternalModa.g:5022:3: ruleEString
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSocioTechnicalSystemAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocioTechnicalSystem__NameAssignment_2"


    // $ANTLR start "rule__SocioTechnicalSystem__DataAssignment_4_2"
    // InternalModa.g:5031:1: rule__SocioTechnicalSystem__DataAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__SocioTechnicalSystem__DataAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5035:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5036:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5036:2: ( ( ruleEString ) )
            // InternalModa.g:5037:3: ( ruleEString )
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getDataDataCrossReference_4_2_0()); 
            // InternalModa.g:5038:3: ( ruleEString )
            // InternalModa.g:5039:4: ruleEString
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getDataDataEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSocioTechnicalSystemAccess().getDataDataEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getSocioTechnicalSystemAccess().getDataDataCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocioTechnicalSystem__DataAssignment_4_2"


    // $ANTLR start "rule__SocioTechnicalSystem__DataAssignment_4_3_1"
    // InternalModa.g:5050:1: rule__SocioTechnicalSystem__DataAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__SocioTechnicalSystem__DataAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5054:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5055:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5055:2: ( ( ruleEString ) )
            // InternalModa.g:5056:3: ( ruleEString )
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getDataDataCrossReference_4_3_1_0()); 
            // InternalModa.g:5057:3: ( ruleEString )
            // InternalModa.g:5058:4: ruleEString
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getDataDataEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSocioTechnicalSystemAccess().getDataDataEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getSocioTechnicalSystemAccess().getDataDataCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocioTechnicalSystem__DataAssignment_4_3_1"


    // $ANTLR start "rule__SocioTechnicalSystem__PrescriptivemodelAssignment_5_1"
    // InternalModa.g:5069:1: rule__SocioTechnicalSystem__PrescriptivemodelAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__SocioTechnicalSystem__PrescriptivemodelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5073:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5074:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5074:2: ( ( ruleEString ) )
            // InternalModa.g:5075:3: ( ruleEString )
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getPrescriptivemodelPrescriptiveModelCrossReference_5_1_0()); 
            // InternalModa.g:5076:3: ( ruleEString )
            // InternalModa.g:5077:4: ruleEString
            {
             before(grammarAccess.getSocioTechnicalSystemAccess().getPrescriptivemodelPrescriptiveModelEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSocioTechnicalSystemAccess().getPrescriptivemodelPrescriptiveModelEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getSocioTechnicalSystemAccess().getPrescriptivemodelPrescriptiveModelCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SocioTechnicalSystem__PrescriptivemodelAssignment_5_1"


    // $ANTLR start "rule__Data__NameAssignment_2"
    // InternalModa.g:5088:1: rule__Data__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Data__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5092:1: ( ( ruleEString ) )
            // InternalModa.g:5093:2: ( ruleEString )
            {
            // InternalModa.g:5093:2: ( ruleEString )
            // InternalModa.g:5094:3: ruleEString
            {
             before(grammarAccess.getDataAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__NameAssignment_2"


    // $ANTLR start "rule__Data__DataTypeAssignment_4_1"
    // InternalModa.g:5103:1: rule__Data__DataTypeAssignment_4_1 : ( ruleDataTypes ) ;
    public final void rule__Data__DataTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5107:1: ( ( ruleDataTypes ) )
            // InternalModa.g:5108:2: ( ruleDataTypes )
            {
            // InternalModa.g:5108:2: ( ruleDataTypes )
            // InternalModa.g:5109:3: ruleDataTypes
            {
             before(grammarAccess.getDataAccess().getDataTypeDataTypesEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataTypes();

            state._fsp--;

             after(grammarAccess.getDataAccess().getDataTypeDataTypesEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__DataTypeAssignment_4_1"


    // $ANTLR start "rule__Data__SoftwareAssignment_5_1"
    // InternalModa.g:5118:1: rule__Data__SoftwareAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Data__SoftwareAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5122:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5123:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5123:2: ( ( ruleEString ) )
            // InternalModa.g:5124:3: ( ruleEString )
            {
             before(grammarAccess.getDataAccess().getSoftwareSoftwareCrossReference_5_1_0()); 
            // InternalModa.g:5125:3: ( ruleEString )
            // InternalModa.g:5126:4: ruleEString
            {
             before(grammarAccess.getDataAccess().getSoftwareSoftwareEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataAccess().getSoftwareSoftwareEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getDataAccess().getSoftwareSoftwareCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__SoftwareAssignment_5_1"


    // $ANTLR start "rule__Data__SociotechnicalsystemAssignment_6_1"
    // InternalModa.g:5137:1: rule__Data__SociotechnicalsystemAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Data__SociotechnicalsystemAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5141:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5142:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5142:2: ( ( ruleEString ) )
            // InternalModa.g:5143:3: ( ruleEString )
            {
             before(grammarAccess.getDataAccess().getSociotechnicalsystemSocioTechnicalSystemCrossReference_6_1_0()); 
            // InternalModa.g:5144:3: ( ruleEString )
            // InternalModa.g:5145:4: ruleEString
            {
             before(grammarAccess.getDataAccess().getSociotechnicalsystemSocioTechnicalSystemEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataAccess().getSociotechnicalsystemSocioTechnicalSystemEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getDataAccess().getSociotechnicalsystemSocioTechnicalSystemCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__SociotechnicalsystemAssignment_6_1"


    // $ANTLR start "rule__Data__ModelroleAssignment_7_1"
    // InternalModa.g:5156:1: rule__Data__ModelroleAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Data__ModelroleAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5160:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5161:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5161:2: ( ( ruleEString ) )
            // InternalModa.g:5162:3: ( ruleEString )
            {
             before(grammarAccess.getDataAccess().getModelroleModelRoleCrossReference_7_1_0()); 
            // InternalModa.g:5163:3: ( ruleEString )
            // InternalModa.g:5164:4: ruleEString
            {
             before(grammarAccess.getDataAccess().getModelroleModelRoleEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataAccess().getModelroleModelRoleEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getDataAccess().getModelroleModelRoleCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Data__ModelroleAssignment_7_1"


    // $ANTLR start "rule__Software__NameAssignment_2"
    // InternalModa.g:5175:1: rule__Software__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Software__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5179:1: ( ( ruleEString ) )
            // InternalModa.g:5180:2: ( ruleEString )
            {
            // InternalModa.g:5180:2: ( ruleEString )
            // InternalModa.g:5181:3: ruleEString
            {
             before(grammarAccess.getSoftwareAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSoftwareAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__NameAssignment_2"


    // $ANTLR start "rule__Software__StateAssignment_4_1"
    // InternalModa.g:5190:1: rule__Software__StateAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Software__StateAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5194:1: ( ( ruleEString ) )
            // InternalModa.g:5195:2: ( ruleEString )
            {
            // InternalModa.g:5195:2: ( ruleEString )
            // InternalModa.g:5196:3: ruleEString
            {
             before(grammarAccess.getSoftwareAccess().getStateEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSoftwareAccess().getStateEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__StateAssignment_4_1"


    // $ANTLR start "rule__Software__DataAssignment_5_2"
    // InternalModa.g:5205:1: rule__Software__DataAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__Software__DataAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5209:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5210:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5210:2: ( ( ruleEString ) )
            // InternalModa.g:5211:3: ( ruleEString )
            {
             before(grammarAccess.getSoftwareAccess().getDataDataCrossReference_5_2_0()); 
            // InternalModa.g:5212:3: ( ruleEString )
            // InternalModa.g:5213:4: ruleEString
            {
             before(grammarAccess.getSoftwareAccess().getDataDataEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSoftwareAccess().getDataDataEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getSoftwareAccess().getDataDataCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__DataAssignment_5_2"


    // $ANTLR start "rule__Software__DataAssignment_5_3_1"
    // InternalModa.g:5224:1: rule__Software__DataAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Software__DataAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5228:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5229:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5229:2: ( ( ruleEString ) )
            // InternalModa.g:5230:3: ( ruleEString )
            {
             before(grammarAccess.getSoftwareAccess().getDataDataCrossReference_5_3_1_0()); 
            // InternalModa.g:5231:3: ( ruleEString )
            // InternalModa.g:5232:4: ruleEString
            {
             before(grammarAccess.getSoftwareAccess().getDataDataEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSoftwareAccess().getDataDataEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getSoftwareAccess().getDataDataCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__DataAssignment_5_3_1"


    // $ANTLR start "rule__Software__PrescriptivemodelAssignment_6_1"
    // InternalModa.g:5243:1: rule__Software__PrescriptivemodelAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__Software__PrescriptivemodelAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5247:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5248:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5248:2: ( ( ruleEString ) )
            // InternalModa.g:5249:3: ( ruleEString )
            {
             before(grammarAccess.getSoftwareAccess().getPrescriptivemodelPrescriptiveModelCrossReference_6_1_0()); 
            // InternalModa.g:5250:3: ( ruleEString )
            // InternalModa.g:5251:4: ruleEString
            {
             before(grammarAccess.getSoftwareAccess().getPrescriptivemodelPrescriptiveModelEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSoftwareAccess().getPrescriptivemodelPrescriptiveModelEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getSoftwareAccess().getPrescriptivemodelPrescriptiveModelCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Software__PrescriptivemodelAssignment_6_1"


    // $ANTLR start "rule__Model__NameAssignment_2"
    // InternalModa.g:5262:1: rule__Model__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Model__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5266:1: ( ( ruleEString ) )
            // InternalModa.g:5267:2: ( ruleEString )
            {
            // InternalModa.g:5267:2: ( ruleEString )
            // InternalModa.g:5268:3: ruleEString
            {
             before(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModelAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__NameAssignment_2"


    // $ANTLR start "rule__Model__ModelroleAssignment_4_2"
    // InternalModa.g:5277:1: rule__Model__ModelroleAssignment_4_2 : ( ( ruleEString ) ) ;
    public final void rule__Model__ModelroleAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5281:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5282:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5282:2: ( ( ruleEString ) )
            // InternalModa.g:5283:3: ( ruleEString )
            {
             before(grammarAccess.getModelAccess().getModelroleModelRoleCrossReference_4_2_0()); 
            // InternalModa.g:5284:3: ( ruleEString )
            // InternalModa.g:5285:4: ruleEString
            {
             before(grammarAccess.getModelAccess().getModelroleModelRoleEStringParserRuleCall_4_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModelAccess().getModelroleModelRoleEStringParserRuleCall_4_2_0_1()); 

            }

             after(grammarAccess.getModelAccess().getModelroleModelRoleCrossReference_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ModelroleAssignment_4_2"


    // $ANTLR start "rule__Model__ModelroleAssignment_4_3_1"
    // InternalModa.g:5296:1: rule__Model__ModelroleAssignment_4_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Model__ModelroleAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5300:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5301:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5301:2: ( ( ruleEString ) )
            // InternalModa.g:5302:3: ( ruleEString )
            {
             before(grammarAccess.getModelAccess().getModelroleModelRoleCrossReference_4_3_1_0()); 
            // InternalModa.g:5303:3: ( ruleEString )
            // InternalModa.g:5304:4: ruleEString
            {
             before(grammarAccess.getModelAccess().getModelroleModelRoleEStringParserRuleCall_4_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getModelAccess().getModelroleModelRoleEStringParserRuleCall_4_3_1_0_1()); 

            }

             after(grammarAccess.getModelAccess().getModelroleModelRoleCrossReference_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ModelroleAssignment_4_3_1"


    // $ANTLR start "rule__PrescriptiveModel__NameAssignment_1"
    // InternalModa.g:5315:1: rule__PrescriptiveModel__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PrescriptiveModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5319:1: ( ( ruleEString ) )
            // InternalModa.g:5320:2: ( ruleEString )
            {
            // InternalModa.g:5320:2: ( ruleEString )
            // InternalModa.g:5321:3: ruleEString
            {
             before(grammarAccess.getPrescriptiveModelAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrescriptiveModelAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__NameAssignment_1"


    // $ANTLR start "rule__PrescriptiveModel__ModelAssignment_4"
    // InternalModa.g:5330:1: rule__PrescriptiveModel__ModelAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__PrescriptiveModel__ModelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5334:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5335:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5335:2: ( ( ruleEString ) )
            // InternalModa.g:5336:3: ( ruleEString )
            {
             before(grammarAccess.getPrescriptiveModelAccess().getModelModelCrossReference_4_0()); 
            // InternalModa.g:5337:3: ( ruleEString )
            // InternalModa.g:5338:4: ruleEString
            {
             before(grammarAccess.getPrescriptiveModelAccess().getModelModelEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrescriptiveModelAccess().getModelModelEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getPrescriptiveModelAccess().getModelModelCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__ModelAssignment_4"


    // $ANTLR start "rule__PrescriptiveModel__DataAssignment_5_2"
    // InternalModa.g:5349:1: rule__PrescriptiveModel__DataAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__PrescriptiveModel__DataAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5353:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5354:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5354:2: ( ( ruleEString ) )
            // InternalModa.g:5355:3: ( ruleEString )
            {
             before(grammarAccess.getPrescriptiveModelAccess().getDataDataCrossReference_5_2_0()); 
            // InternalModa.g:5356:3: ( ruleEString )
            // InternalModa.g:5357:4: ruleEString
            {
             before(grammarAccess.getPrescriptiveModelAccess().getDataDataEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrescriptiveModelAccess().getDataDataEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getPrescriptiveModelAccess().getDataDataCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__DataAssignment_5_2"


    // $ANTLR start "rule__PrescriptiveModel__DataAssignment_5_3_1"
    // InternalModa.g:5368:1: rule__PrescriptiveModel__DataAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__PrescriptiveModel__DataAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5372:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5373:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5373:2: ( ( ruleEString ) )
            // InternalModa.g:5374:3: ( ruleEString )
            {
             before(grammarAccess.getPrescriptiveModelAccess().getDataDataCrossReference_5_3_1_0()); 
            // InternalModa.g:5375:3: ( ruleEString )
            // InternalModa.g:5376:4: ruleEString
            {
             before(grammarAccess.getPrescriptiveModelAccess().getDataDataEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrescriptiveModelAccess().getDataDataEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getPrescriptiveModelAccess().getDataDataCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__DataAssignment_5_3_1"


    // $ANTLR start "rule__PrescriptiveModel__SoftwareAssignment_6_1"
    // InternalModa.g:5387:1: rule__PrescriptiveModel__SoftwareAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__PrescriptiveModel__SoftwareAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5391:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5392:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5392:2: ( ( ruleEString ) )
            // InternalModa.g:5393:3: ( ruleEString )
            {
             before(grammarAccess.getPrescriptiveModelAccess().getSoftwareSoftwareCrossReference_6_1_0()); 
            // InternalModa.g:5394:3: ( ruleEString )
            // InternalModa.g:5395:4: ruleEString
            {
             before(grammarAccess.getPrescriptiveModelAccess().getSoftwareSoftwareEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrescriptiveModelAccess().getSoftwareSoftwareEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getPrescriptiveModelAccess().getSoftwareSoftwareCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__SoftwareAssignment_6_1"


    // $ANTLR start "rule__PrescriptiveModel__SociotechnicalsystemAssignment_7_1"
    // InternalModa.g:5406:1: rule__PrescriptiveModel__SociotechnicalsystemAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__PrescriptiveModel__SociotechnicalsystemAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5410:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5411:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5411:2: ( ( ruleEString ) )
            // InternalModa.g:5412:3: ( ruleEString )
            {
             before(grammarAccess.getPrescriptiveModelAccess().getSociotechnicalsystemSocioTechnicalSystemCrossReference_7_1_0()); 
            // InternalModa.g:5413:3: ( ruleEString )
            // InternalModa.g:5414:4: ruleEString
            {
             before(grammarAccess.getPrescriptiveModelAccess().getSociotechnicalsystemSocioTechnicalSystemEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrescriptiveModelAccess().getSociotechnicalsystemSocioTechnicalSystemEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getPrescriptiveModelAccess().getSociotechnicalsystemSocioTechnicalSystemCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__SociotechnicalsystemAssignment_7_1"


    // $ANTLR start "rule__PrescriptiveModel__PredictivemodelAssignment_8_1"
    // InternalModa.g:5425:1: rule__PrescriptiveModel__PredictivemodelAssignment_8_1 : ( ( ruleEString ) ) ;
    public final void rule__PrescriptiveModel__PredictivemodelAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5429:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5430:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5430:2: ( ( ruleEString ) )
            // InternalModa.g:5431:3: ( ruleEString )
            {
             before(grammarAccess.getPrescriptiveModelAccess().getPredictivemodelPredictiveModelCrossReference_8_1_0()); 
            // InternalModa.g:5432:3: ( ruleEString )
            // InternalModa.g:5433:4: ruleEString
            {
             before(grammarAccess.getPrescriptiveModelAccess().getPredictivemodelPredictiveModelEStringParserRuleCall_8_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrescriptiveModelAccess().getPredictivemodelPredictiveModelEStringParserRuleCall_8_1_0_1()); 

            }

             after(grammarAccess.getPrescriptiveModelAccess().getPredictivemodelPredictiveModelCrossReference_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__PredictivemodelAssignment_8_1"


    // $ANTLR start "rule__PrescriptiveModel__PrescriptivemodelAssignment_9_1"
    // InternalModa.g:5444:1: rule__PrescriptiveModel__PrescriptivemodelAssignment_9_1 : ( ( ruleEString ) ) ;
    public final void rule__PrescriptiveModel__PrescriptivemodelAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5448:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5449:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5449:2: ( ( ruleEString ) )
            // InternalModa.g:5450:3: ( ruleEString )
            {
             before(grammarAccess.getPrescriptiveModelAccess().getPrescriptivemodelPrescriptiveModelCrossReference_9_1_0()); 
            // InternalModa.g:5451:3: ( ruleEString )
            // InternalModa.g:5452:4: ruleEString
            {
             before(grammarAccess.getPrescriptiveModelAccess().getPrescriptivemodelPrescriptiveModelEStringParserRuleCall_9_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrescriptiveModelAccess().getPrescriptivemodelPrescriptiveModelEStringParserRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getPrescriptiveModelAccess().getPrescriptivemodelPrescriptiveModelCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__PrescriptivemodelAssignment_9_1"


    // $ANTLR start "rule__PrescriptiveModel__PrescriptivemodeleOppositeAssignment_10_1"
    // InternalModa.g:5463:1: rule__PrescriptiveModel__PrescriptivemodeleOppositeAssignment_10_1 : ( ( ruleEString ) ) ;
    public final void rule__PrescriptiveModel__PrescriptivemodeleOppositeAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5467:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5468:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5468:2: ( ( ruleEString ) )
            // InternalModa.g:5469:3: ( ruleEString )
            {
             before(grammarAccess.getPrescriptiveModelAccess().getPrescriptivemodeleOppositePrescriptiveModelCrossReference_10_1_0()); 
            // InternalModa.g:5470:3: ( ruleEString )
            // InternalModa.g:5471:4: ruleEString
            {
             before(grammarAccess.getPrescriptiveModelAccess().getPrescriptivemodeleOppositePrescriptiveModelEStringParserRuleCall_10_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrescriptiveModelAccess().getPrescriptivemodeleOppositePrescriptiveModelEStringParserRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getPrescriptiveModelAccess().getPrescriptivemodeleOppositePrescriptiveModelCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrescriptiveModel__PrescriptivemodeleOppositeAssignment_10_1"


    // $ANTLR start "rule__PredictiveModel__NameAssignment_1"
    // InternalModa.g:5482:1: rule__PredictiveModel__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PredictiveModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5486:1: ( ( ruleEString ) )
            // InternalModa.g:5487:2: ( ruleEString )
            {
            // InternalModa.g:5487:2: ( ruleEString )
            // InternalModa.g:5488:3: ruleEString
            {
             before(grammarAccess.getPredictiveModelAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPredictiveModelAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__NameAssignment_1"


    // $ANTLR start "rule__PredictiveModel__ModelAssignment_4"
    // InternalModa.g:5497:1: rule__PredictiveModel__ModelAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__PredictiveModel__ModelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5501:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5502:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5502:2: ( ( ruleEString ) )
            // InternalModa.g:5503:3: ( ruleEString )
            {
             before(grammarAccess.getPredictiveModelAccess().getModelModelCrossReference_4_0()); 
            // InternalModa.g:5504:3: ( ruleEString )
            // InternalModa.g:5505:4: ruleEString
            {
             before(grammarAccess.getPredictiveModelAccess().getModelModelEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPredictiveModelAccess().getModelModelEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getPredictiveModelAccess().getModelModelCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__ModelAssignment_4"


    // $ANTLR start "rule__PredictiveModel__DataAssignment_5_2"
    // InternalModa.g:5516:1: rule__PredictiveModel__DataAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__PredictiveModel__DataAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5520:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5521:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5521:2: ( ( ruleEString ) )
            // InternalModa.g:5522:3: ( ruleEString )
            {
             before(grammarAccess.getPredictiveModelAccess().getDataDataCrossReference_5_2_0()); 
            // InternalModa.g:5523:3: ( ruleEString )
            // InternalModa.g:5524:4: ruleEString
            {
             before(grammarAccess.getPredictiveModelAccess().getDataDataEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPredictiveModelAccess().getDataDataEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getPredictiveModelAccess().getDataDataCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__DataAssignment_5_2"


    // $ANTLR start "rule__PredictiveModel__DataAssignment_5_3_1"
    // InternalModa.g:5535:1: rule__PredictiveModel__DataAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__PredictiveModel__DataAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5539:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5540:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5540:2: ( ( ruleEString ) )
            // InternalModa.g:5541:3: ( ruleEString )
            {
             before(grammarAccess.getPredictiveModelAccess().getDataDataCrossReference_5_3_1_0()); 
            // InternalModa.g:5542:3: ( ruleEString )
            // InternalModa.g:5543:4: ruleEString
            {
             before(grammarAccess.getPredictiveModelAccess().getDataDataEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPredictiveModelAccess().getDataDataEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getPredictiveModelAccess().getDataDataCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__DataAssignment_5_3_1"


    // $ANTLR start "rule__PredictiveModel__PrescriptivemodelAssignment_6_1"
    // InternalModa.g:5554:1: rule__PredictiveModel__PrescriptivemodelAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__PredictiveModel__PrescriptivemodelAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5558:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5559:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5559:2: ( ( ruleEString ) )
            // InternalModa.g:5560:3: ( ruleEString )
            {
             before(grammarAccess.getPredictiveModelAccess().getPrescriptivemodelPrescriptiveModelCrossReference_6_1_0()); 
            // InternalModa.g:5561:3: ( ruleEString )
            // InternalModa.g:5562:4: ruleEString
            {
             before(grammarAccess.getPredictiveModelAccess().getPrescriptivemodelPrescriptiveModelEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPredictiveModelAccess().getPrescriptivemodelPrescriptiveModelEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getPredictiveModelAccess().getPrescriptivemodelPrescriptiveModelCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__PrescriptivemodelAssignment_6_1"


    // $ANTLR start "rule__PredictiveModel__DescriptivemodelAssignment_7_1"
    // InternalModa.g:5573:1: rule__PredictiveModel__DescriptivemodelAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__PredictiveModel__DescriptivemodelAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5577:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5578:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5578:2: ( ( ruleEString ) )
            // InternalModa.g:5579:3: ( ruleEString )
            {
             before(grammarAccess.getPredictiveModelAccess().getDescriptivemodelDescriptiveModelCrossReference_7_1_0()); 
            // InternalModa.g:5580:3: ( ruleEString )
            // InternalModa.g:5581:4: ruleEString
            {
             before(grammarAccess.getPredictiveModelAccess().getDescriptivemodelDescriptiveModelEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPredictiveModelAccess().getDescriptivemodelDescriptiveModelEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getPredictiveModelAccess().getDescriptivemodelDescriptiveModelCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PredictiveModel__DescriptivemodelAssignment_7_1"


    // $ANTLR start "rule__DescriptiveModel__NameAssignment_1"
    // InternalModa.g:5592:1: rule__DescriptiveModel__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DescriptiveModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5596:1: ( ( ruleEString ) )
            // InternalModa.g:5597:2: ( ruleEString )
            {
            // InternalModa.g:5597:2: ( ruleEString )
            // InternalModa.g:5598:3: ruleEString
            {
             before(grammarAccess.getDescriptiveModelAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDescriptiveModelAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__NameAssignment_1"


    // $ANTLR start "rule__DescriptiveModel__ModelAssignment_4"
    // InternalModa.g:5607:1: rule__DescriptiveModel__ModelAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__DescriptiveModel__ModelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5611:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5612:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5612:2: ( ( ruleEString ) )
            // InternalModa.g:5613:3: ( ruleEString )
            {
             before(grammarAccess.getDescriptiveModelAccess().getModelModelCrossReference_4_0()); 
            // InternalModa.g:5614:3: ( ruleEString )
            // InternalModa.g:5615:4: ruleEString
            {
             before(grammarAccess.getDescriptiveModelAccess().getModelModelEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDescriptiveModelAccess().getModelModelEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDescriptiveModelAccess().getModelModelCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__ModelAssignment_4"


    // $ANTLR start "rule__DescriptiveModel__DataAssignment_5_2"
    // InternalModa.g:5626:1: rule__DescriptiveModel__DataAssignment_5_2 : ( ( ruleEString ) ) ;
    public final void rule__DescriptiveModel__DataAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5630:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5631:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5631:2: ( ( ruleEString ) )
            // InternalModa.g:5632:3: ( ruleEString )
            {
             before(grammarAccess.getDescriptiveModelAccess().getDataDataCrossReference_5_2_0()); 
            // InternalModa.g:5633:3: ( ruleEString )
            // InternalModa.g:5634:4: ruleEString
            {
             before(grammarAccess.getDescriptiveModelAccess().getDataDataEStringParserRuleCall_5_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDescriptiveModelAccess().getDataDataEStringParserRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getDescriptiveModelAccess().getDataDataCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__DataAssignment_5_2"


    // $ANTLR start "rule__DescriptiveModel__DataAssignment_5_3_1"
    // InternalModa.g:5645:1: rule__DescriptiveModel__DataAssignment_5_3_1 : ( ( ruleEString ) ) ;
    public final void rule__DescriptiveModel__DataAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5649:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5650:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5650:2: ( ( ruleEString ) )
            // InternalModa.g:5651:3: ( ruleEString )
            {
             before(grammarAccess.getDescriptiveModelAccess().getDataDataCrossReference_5_3_1_0()); 
            // InternalModa.g:5652:3: ( ruleEString )
            // InternalModa.g:5653:4: ruleEString
            {
             before(grammarAccess.getDescriptiveModelAccess().getDataDataEStringParserRuleCall_5_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDescriptiveModelAccess().getDataDataEStringParserRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getDescriptiveModelAccess().getDataDataCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__DataAssignment_5_3_1"


    // $ANTLR start "rule__DescriptiveModel__PredictivemodelAssignment_6_1"
    // InternalModa.g:5664:1: rule__DescriptiveModel__PredictivemodelAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__DescriptiveModel__PredictivemodelAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModa.g:5668:1: ( ( ( ruleEString ) ) )
            // InternalModa.g:5669:2: ( ( ruleEString ) )
            {
            // InternalModa.g:5669:2: ( ( ruleEString ) )
            // InternalModa.g:5670:3: ( ruleEString )
            {
             before(grammarAccess.getDescriptiveModelAccess().getPredictivemodelPredictiveModelCrossReference_6_1_0()); 
            // InternalModa.g:5671:3: ( ruleEString )
            // InternalModa.g:5672:4: ruleEString
            {
             before(grammarAccess.getDescriptiveModelAccess().getPredictivemodelPredictiveModelEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDescriptiveModelAccess().getPredictivemodelPredictiveModelEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getDescriptiveModelAccess().getPredictivemodelPredictiveModelCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescriptiveModel__PredictivemodelAssignment_6_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000EE0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000005200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000080A0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020A60000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000880A0000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000C082E0000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000020080A0000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000004000A0000L});

}