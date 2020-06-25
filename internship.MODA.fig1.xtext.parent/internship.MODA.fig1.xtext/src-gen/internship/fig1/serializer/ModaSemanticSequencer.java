/*
 * generated by Xtext 2.14.0
 */
package internship.fig1.serializer;

import com.google.inject.Inject;
import internship.fig1.services.ModaGrammarAccess;
import internship.moda.fig1.Data;
import internship.moda.fig1.DescriptiveModel;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.MODA;
import internship.moda.fig1.Model;
import internship.moda.fig1.PredictiveModel;
import internship.moda.fig1.PrescriptiveModel;
import internship.moda.fig1.SocioTechnicalSystem;
import internship.moda.fig1.Software;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class ModaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ModaGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Fig1Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Fig1Package.DATA:
				sequence_Data(context, (Data) semanticObject); 
				return; 
			case Fig1Package.DESCRIPTIVE_MODEL:
				sequence_DescriptiveModel(context, (DescriptiveModel) semanticObject); 
				return; 
			case Fig1Package.MODA:
				sequence_MODA(context, (MODA) semanticObject); 
				return; 
			case Fig1Package.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case Fig1Package.PREDICTIVE_MODEL:
				sequence_PredictiveModel(context, (PredictiveModel) semanticObject); 
				return; 
			case Fig1Package.PRESCRIPTIVE_MODEL:
				sequence_PrescriptiveModel(context, (PrescriptiveModel) semanticObject); 
				return; 
			case Fig1Package.SOCIO_TECHNICAL_SYSTEM:
				sequence_SocioTechnicalSystem(context, (SocioTechnicalSystem) semanticObject); 
				return; 
			case Fig1Package.SOFTWARE:
				sequence_Software(context, (Software) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Data returns Data
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         dataType=DataTypes? 
	 *         software=[Software|EString]? 
	 *         sociotechnicalsystem=[SocioTechnicalSystem|EString]? 
	 *         modelrole=[ModelRole|EString]?
	 *     )
	 */
	protected void sequence_Data(ISerializationContext context, Data semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelRole returns DescriptiveModel
	 *     DescriptiveModel returns DescriptiveModel
	 *
	 * Constraint:
	 *     (name=EString model=[Model|EString] (data+=[Data|EString] data+=[Data|EString]*)? predictivemodel=[PredictiveModel|EString]?)
	 */
	protected void sequence_DescriptiveModel(ISerializationContext context, DescriptiveModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MODA returns MODA
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         sociotechnicalsystem=SocioTechnicalSystem? 
	 *         (data+=Data data+=Data*)? 
	 *         software=Software? 
	 *         (model+=Model model+=Model*)? 
	 *         (modelrole+=ModelRole modelrole+=ModelRole*)?
	 *     )
	 */
	protected void sequence_MODA(ISerializationContext context, MODA semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (name=EString (modelrole+=[ModelRole|EString] modelrole+=[ModelRole|EString]*)?)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelRole returns PredictiveModel
	 *     PredictiveModel returns PredictiveModel
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         model=[Model|EString] 
	 *         (data+=[Data|EString] data+=[Data|EString]*)? 
	 *         prescriptivemodel=[PrescriptiveModel|EString]? 
	 *         descriptivemodel=[DescriptiveModel|EString]?
	 *     )
	 */
	protected void sequence_PredictiveModel(ISerializationContext context, PredictiveModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ModelRole returns PrescriptiveModel
	 *     PrescriptiveModel returns PrescriptiveModel
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         model=[Model|EString] 
	 *         (data+=[Data|EString] data+=[Data|EString]*)? 
	 *         software=[Software|EString]? 
	 *         sociotechnicalsystem=[SocioTechnicalSystem|EString]? 
	 *         predictivemodel=[PredictiveModel|EString]? 
	 *         prescriptivemodel=[PrescriptiveModel|EString]? 
	 *         prescriptivemodeleOpposite=[PrescriptiveModel|EString]?
	 *     )
	 */
	protected void sequence_PrescriptiveModel(ISerializationContext context, PrescriptiveModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SocioTechnicalSystem returns SocioTechnicalSystem
	 *
	 * Constraint:
	 *     (name=EString (data+=[Data|EString] data+=[Data|EString]*)? prescriptivemodel=[PrescriptiveModel|EString]?)
	 */
	protected void sequence_SocioTechnicalSystem(ISerializationContext context, SocioTechnicalSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Software returns Software
	 *
	 * Constraint:
	 *     (name=EString state=EString? (data+=[Data|EString] data+=[Data|EString]*)? prescriptivemodel=[PrescriptiveModel|EString]?)
	 */
	protected void sequence_Software(ISerializationContext context, Software semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}