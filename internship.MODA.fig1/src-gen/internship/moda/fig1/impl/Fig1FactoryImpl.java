/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.*;

import org.eclipse.emf.ecore.EClass;
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
		case Fig1Package.INPUT_DATA:
			return createInputData();
		case Fig1Package.OUTPUT_DATA:
			return createOutputData();
		case Fig1Package.MEASURED_DATA:
			return createMeasuredData();
		case Fig1Package.EXTERNAL_DATA:
			return createExternalData();
		case Fig1Package.DESCRIPTIVE_MODEL:
			return createDescriptiveModel();
		case Fig1Package.PREDICTIVE_MODEL:
			return createPredictiveModel();
		case Fig1Package.PRESCRIPTIVE_MODEL:
			return createPrescriptiveModel();
		case Fig1Package.SOFTWARE:
			return createSoftware();
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM:
			return createSocioTechnicalSystem();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputData createInputData() {
		InputDataImpl inputData = new InputDataImpl();
		return inputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputData createOutputData() {
		OutputDataImpl outputData = new OutputDataImpl();
		return outputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredData createMeasuredData() {
		MeasuredDataImpl measuredData = new MeasuredDataImpl();
		return measuredData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalData createExternalData() {
		ExternalDataImpl externalData = new ExternalDataImpl();
		return externalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptiveModel createDescriptiveModel() {
		DescriptiveModelImpl descriptiveModel = new DescriptiveModelImpl();
		return descriptiveModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredictiveModel createPredictiveModel() {
		PredictiveModelImpl predictiveModel = new PredictiveModelImpl();
		return predictiveModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriptiveModel createPrescriptiveModel() {
		PrescriptiveModelImpl prescriptiveModel = new PrescriptiveModelImpl();
		return prescriptiveModel;
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
