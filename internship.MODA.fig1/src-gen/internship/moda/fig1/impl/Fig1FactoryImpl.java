/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Fig1FactoryImpl extends EFactoryImpl implements Fig1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Fig1Factory init() {
		try {
			Fig1Factory theFig1Factory = (Fig1Factory) EPackage.Registry.INSTANCE.getEFactory(Fig1Package.eNS_URI);
			if (theFig1Factory != null) {
				return theFig1Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Fig1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fig1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Fig1Package.MODA:
			return createMODA();
		case Fig1Package.DATA:
			return createData();
		case Fig1Package.SOFTWARE:
			return createSoftware();
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM:
			return createSocioTechnicalSystem();
		case Fig1Package.MODEL:
			return createModel();
		case Fig1Package.OTHER_INTERPLAY:
			return createOtherInterplay();
		case Fig1Package.DATA_PURPOSE:
			return createDataPurpose();
		case Fig1Package.ENACTMENT:
			return createEnactment();
		case Fig1Package.DEPLOYMENT:
			return createDeployment();
		case Fig1Package.PREPARATION:
			return createPreparation();
		case Fig1Package.ANALYSIS:
			return createAnalysis();
		case Fig1Package.GENERATION:
			return createGeneration();
		case Fig1Package.GENERALIZATION:
			return createGeneralization();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Fig1Package.DATA_KIND:
			return createDataKindFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Fig1Package.DATA_KIND:
			return convertDataKindToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data createData() {
		DataImpl data = new DataImpl();
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Software createSoftware() {
		SoftwareImpl software = new SoftwareImpl();
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocioTechnicalSystem createSocioTechnicalSystem() {
		SocioTechnicalSystemImpl socioTechnicalSystem = new SocioTechnicalSystemImpl();
		return socioTechnicalSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MODA createMODA() {
		MODAImpl moda = new MODAImpl();
		return moda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherInterplay createOtherInterplay() {
		OtherInterplayImpl otherInterplay = new OtherInterplayImpl();
		return otherInterplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPurpose createDataPurpose() {
		DataPurposeImpl dataPurpose = new DataPurposeImpl();
		return dataPurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enactment createEnactment() {
		EnactmentImpl enactment = new EnactmentImpl();
		return enactment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preparation createPreparation() {
		PreparationImpl preparation = new PreparationImpl();
		return preparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analysis createAnalysis() {
		AnalysisImpl analysis = new AnalysisImpl();
		return analysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generation createGeneration() {
		GenerationImpl generation = new GenerationImpl();
		return generation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization createGeneralization() {
		GeneralizationImpl generalization = new GeneralizationImpl();
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataKind createDataKindFromString(EDataType eDataType, String initialValue) {
		DataKind result = DataKind.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fig1Package getFig1Package() {
		return (Fig1Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Fig1Package getPackage() {
		return Fig1Package.eINSTANCE;
	}

} //Fig1FactoryImpl
