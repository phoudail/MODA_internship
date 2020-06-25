/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.Data;
import internship.moda.fig1.DataTypes;
import internship.moda.fig1.DescriptiveModel;
import internship.moda.fig1.Fig1Factory;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.Model;
import internship.moda.fig1.ModelRole;
import internship.moda.fig1.NewEnum1;
import internship.moda.fig1.PredictiveModel;
import internship.moda.fig1.PrescriptiveModel;
import internship.moda.fig1.SocioTechnicalSystem;
import internship.moda.fig1.Software;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Fig1PackageImpl extends EPackageImpl implements Fig1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptiveModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predictiveModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prescriptiveModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass softwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socioTechnicalSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum newEnum1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see internship.moda.fig1.Fig1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Fig1PackageImpl() {
		super(eNS_URI, Fig1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Fig1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Fig1Package init() {
		if (isInited)
			return (Fig1Package) EPackage.Registry.INSTANCE.getEPackage(Fig1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredFig1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Fig1PackageImpl theFig1Package = registeredFig1Package instanceof Fig1PackageImpl
				? (Fig1PackageImpl) registeredFig1Package
				: new Fig1PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theFig1Package.createPackageContents();

		// Initialize created meta-data
		theFig1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFig1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Fig1Package.eNS_URI, theFig1Package);
		return theFig1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Software() {
		return (EReference) dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Sociotechnicalsystem() {
		return (EReference) dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Modelrole() {
		return (EReference) dataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getData_DataType() {
		return (EAttribute) dataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelRole() {
		return modelRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelRole_Name() {
		return (EAttribute) modelRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelRole_Model() {
		return (EReference) modelRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelRole_Data() {
		return (EReference) modelRoleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptiveModel() {
		return descriptiveModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDescriptiveModel_Predictivemodel() {
		return (EReference) descriptiveModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredictiveModel() {
		return predictiveModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredictiveModel_Prescriptivemodel() {
		return (EReference) predictiveModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredictiveModel_Descriptivemodel() {
		return (EReference) predictiveModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrescriptiveModel() {
		return prescriptiveModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescriptiveModel_Software() {
		return (EReference) prescriptiveModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescriptiveModel_Sociotechnicalsystem() {
		return (EReference) prescriptiveModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescriptiveModel_Predictivemodel() {
		return (EReference) prescriptiveModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescriptiveModel_Prescriptivemodel() {
		return (EReference) prescriptiveModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescriptiveModel_PrescriptivemodeleOpposite() {
		return (EReference) prescriptiveModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSoftware() {
		return softwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftware_State() {
		return (EAttribute) softwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSoftware_Name() {
		return (EAttribute) softwareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftware_Data() {
		return (EReference) softwareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftware_Prescriptivemodel() {
		return (EReference) softwareEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSocioTechnicalSystem() {
		return socioTechnicalSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSocioTechnicalSystem_Data() {
		return (EReference) socioTechnicalSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSocioTechnicalSystem_Prescriptivemodel() {
		return (EReference) socioTechnicalSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMODA() {
		return modaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMODA_Sociotechnicalsystem() {
		return (EReference) modaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMODA_Data() {
		return (EReference) modaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMODA_Software() {
		return (EReference) modaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMODA_Name() {
		return (EAttribute) modaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMODA_Model() {
		return (EReference) modaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMODA_Modelrole() {
		return (EReference) modaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Modelrole() {
		return (EReference) modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNewEnum1() {
		return newEnum1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataTypes() {
		return dataTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fig1Factory getFig1Factory() {
		return (Fig1Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		dataEClass = createEClass(DATA);
		createEReference(dataEClass, DATA__SOFTWARE);
		createEReference(dataEClass, DATA__SOCIOTECHNICALSYSTEM);
		createEReference(dataEClass, DATA__MODELROLE);
		createEAttribute(dataEClass, DATA__DATA_TYPE);

		modelRoleEClass = createEClass(MODEL_ROLE);
		createEAttribute(modelRoleEClass, MODEL_ROLE__NAME);
		createEReference(modelRoleEClass, MODEL_ROLE__MODEL);
		createEReference(modelRoleEClass, MODEL_ROLE__DATA);

		descriptiveModelEClass = createEClass(DESCRIPTIVE_MODEL);
		createEReference(descriptiveModelEClass, DESCRIPTIVE_MODEL__PREDICTIVEMODEL);

		predictiveModelEClass = createEClass(PREDICTIVE_MODEL);
		createEReference(predictiveModelEClass, PREDICTIVE_MODEL__PRESCRIPTIVEMODEL);
		createEReference(predictiveModelEClass, PREDICTIVE_MODEL__DESCRIPTIVEMODEL);

		prescriptiveModelEClass = createEClass(PRESCRIPTIVE_MODEL);
		createEReference(prescriptiveModelEClass, PRESCRIPTIVE_MODEL__SOFTWARE);
		createEReference(prescriptiveModelEClass, PRESCRIPTIVE_MODEL__SOCIOTECHNICALSYSTEM);
		createEReference(prescriptiveModelEClass, PRESCRIPTIVE_MODEL__PREDICTIVEMODEL);
		createEReference(prescriptiveModelEClass, PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODEL);
		createEReference(prescriptiveModelEClass, PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODELE_OPPOSITE);

		softwareEClass = createEClass(SOFTWARE);
		createEAttribute(softwareEClass, SOFTWARE__STATE);
		createEAttribute(softwareEClass, SOFTWARE__NAME);
		createEReference(softwareEClass, SOFTWARE__DATA);
		createEReference(softwareEClass, SOFTWARE__PRESCRIPTIVEMODEL);

		socioTechnicalSystemEClass = createEClass(SOCIO_TECHNICAL_SYSTEM);
		createEReference(socioTechnicalSystemEClass, SOCIO_TECHNICAL_SYSTEM__DATA);
		createEReference(socioTechnicalSystemEClass, SOCIO_TECHNICAL_SYSTEM__PRESCRIPTIVEMODEL);

		modaEClass = createEClass(MODA);
		createEReference(modaEClass, MODA__SOCIOTECHNICALSYSTEM);
		createEReference(modaEClass, MODA__DATA);
		createEReference(modaEClass, MODA__SOFTWARE);
		createEAttribute(modaEClass, MODA__NAME);
		createEReference(modaEClass, MODA__MODEL);
		createEReference(modaEClass, MODA__MODELROLE);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__MODELROLE);

		// Create enums
		newEnum1EEnum = createEEnum(NEW_ENUM1);
		dataTypesEEnum = createEEnum(DATA_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		descriptiveModelEClass.getESuperTypes().add(this.getModelRole());
		predictiveModelEClass.getESuperTypes().add(this.getModelRole());
		prescriptiveModelEClass.getESuperTypes().add(this.getModelRole());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_Software(), this.getSoftware(), this.getSoftware_Data(), "software", null, 0, 1,
				Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Sociotechnicalsystem(), this.getSocioTechnicalSystem(),
				this.getSocioTechnicalSystem_Data(), "sociotechnicalsystem", null, 0, 1, Data.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getData_Modelrole(), this.getModelRole(), this.getModelRole_Data(), "modelrole", null, 0, 1,
				Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getData_DataType(), this.getDataTypes(), "dataType", null, 0, 1, Data.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelRoleEClass, ModelRole.class, "ModelRole", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelRole.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelRole_Model(), this.getModel(), this.getModel_Modelrole(), "model", null, 1, 1,
				ModelRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelRole_Data(), this.getData(), this.getData_Modelrole(), "data", null, 0, -1,
				ModelRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptiveModelEClass, DescriptiveModel.class, "DescriptiveModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescriptiveModel_Predictivemodel(), this.getPredictiveModel(),
				this.getPredictiveModel_Descriptivemodel(), "predictivemodel", null, 0, 1, DescriptiveModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predictiveModelEClass, PredictiveModel.class, "PredictiveModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredictiveModel_Prescriptivemodel(), this.getPrescriptiveModel(),
				this.getPrescriptiveModel_Predictivemodel(), "prescriptivemodel", null, 0, 1, PredictiveModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredictiveModel_Descriptivemodel(), this.getDescriptiveModel(),
				this.getDescriptiveModel_Predictivemodel(), "descriptivemodel", null, 0, 1, PredictiveModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prescriptiveModelEClass, PrescriptiveModel.class, "PrescriptiveModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrescriptiveModel_Software(), this.getSoftware(), this.getSoftware_Prescriptivemodel(),
				"software", null, 0, 1, PrescriptiveModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrescriptiveModel_Sociotechnicalsystem(), this.getSocioTechnicalSystem(),
				this.getSocioTechnicalSystem_Prescriptivemodel(), "sociotechnicalsystem", null, 0, 1,
				PrescriptiveModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrescriptiveModel_Predictivemodel(), this.getPredictiveModel(),
				this.getPredictiveModel_Prescriptivemodel(), "predictivemodel", null, 0, 1, PrescriptiveModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrescriptiveModel_Prescriptivemodel(), this.getPrescriptiveModel(),
				this.getPrescriptiveModel_PrescriptivemodeleOpposite(), "prescriptivemodel", null, 0, 1,
				PrescriptiveModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrescriptiveModel_PrescriptivemodeleOpposite(), this.getPrescriptiveModel(),
				this.getPrescriptiveModel_Prescriptivemodel(), "prescriptivemodeleOpposite", null, 0, 1,
				PrescriptiveModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareEClass, Software.class, "Software", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSoftware_State(), ecorePackage.getEString(), "state", null, 0, 1, Software.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSoftware_Name(), ecorePackage.getEString(), "name", null, 0, 1, Software.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftware_Data(), this.getData(), this.getData_Software(), "data", null, 0, -1, Software.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftware_Prescriptivemodel(), this.getPrescriptiveModel(),
				this.getPrescriptiveModel_Software(), "prescriptivemodel", null, 0, 1, Software.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(socioTechnicalSystemEClass, SocioTechnicalSystem.class, "SocioTechnicalSystem", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSocioTechnicalSystem_Data(), this.getData(), this.getData_Sociotechnicalsystem(), "data",
				null, 0, -1, SocioTechnicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSocioTechnicalSystem_Prescriptivemodel(), this.getPrescriptiveModel(),
				this.getPrescriptiveModel_Sociotechnicalsystem(), "prescriptivemodel", null, 0, 1,
				SocioTechnicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modaEClass, internship.moda.fig1.MODA.class, "MODA", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMODA_Sociotechnicalsystem(), this.getSocioTechnicalSystem(), null, "sociotechnicalsystem",
				null, 0, 1, internship.moda.fig1.MODA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMODA_Data(), this.getData(), null, "data", null, 0, -1, internship.moda.fig1.MODA.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMODA_Software(), this.getSoftware(), null, "software", null, 0, 1,
				internship.moda.fig1.MODA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMODA_Name(), ecorePackage.getEString(), "name", null, 0, 1, internship.moda.fig1.MODA.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMODA_Model(), this.getModel(), null, "model", null, 0, -1, internship.moda.fig1.MODA.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMODA_Modelrole(), this.getModelRole(), null, "modelrole", null, 0, -1,
				internship.moda.fig1.MODA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Modelrole(), this.getModelRole(), this.getModelRole_Model(), "modelrole", null, 0, -1,
				Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(newEnum1EEnum, NewEnum1.class, "NewEnum1");

		initEEnum(dataTypesEEnum, DataTypes.class, "DataTypes");
		addEEnumLiteral(dataTypesEEnum, DataTypes.INPUT_DATA);
		addEEnumLiteral(dataTypesEEnum, DataTypes.OUTPUT_DATA);
		addEEnumLiteral(dataTypesEEnum, DataTypes.EXTERNAL_DATA);
		addEEnumLiteral(dataTypesEEnum, DataTypes.MEASURED_DATA);

		// Create resource
		createResource(eNS_URI);
	}

} //Fig1PackageImpl
