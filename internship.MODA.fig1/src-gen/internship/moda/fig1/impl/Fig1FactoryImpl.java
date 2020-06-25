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
		case Fig1Package.MODEL:
			return createModel();
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
		case Fig1Package.DATA_TYPES:
			return createDataTypesFromString(eDataType, initialValue);
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
		case Fig1Package.DATA_TYPES:
			return convertDataTypesToString(eDataType, instanceValue);
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
	public DataTypes createDataTypesFromString(EDataType eDataType, String initialValue) {
		DataTypes result = DataTypes.get(initialValue);
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
	public String convertDataTypesToString(EDataType eDataType, Object instanceValue) {
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
