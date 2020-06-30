/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.Analysis;
import internship.moda.fig1.Data;
import internship.moda.fig1.DataKind;
import internship.moda.fig1.DataPurpose;
import internship.moda.fig1.Deployment;
import internship.moda.fig1.DescriptiveModel;
import internship.moda.fig1.Enactment;
import internship.moda.fig1.Fig1Factory;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.Generalization;
import internship.moda.fig1.Generation;
import internship.moda.fig1.ModaNode;
import internship.moda.fig1.ModaRelation;
import internship.moda.fig1.Model;
import internship.moda.fig1.ModelRole;
import internship.moda.fig1.NamedElement;
import internship.moda.fig1.OtherInterplay;
import internship.moda.fig1.PredictiveModel;
import internship.moda.fig1.Preparation;
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
	private EClass modaNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modaRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otherInterplayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPurposeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enactmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preparationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass analysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataKindEEnum = null;

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
	public EReference getData_Otherinterplay() {
		return (EReference) dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Processing() {
		return (EReference) dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getData_Generalization() {
		return (EReference) dataEClass.getEStructuralFeatures().get(2);
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
	public EReference getModelRole_Model() {
		return (EReference) modelRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelRole_Generalization() {
		return (EReference) modelRoleEClass.getEStructuralFeatures().get(1);
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
	public EReference getDescriptiveModel_Preparation() {
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
	public EReference getPredictiveModel_Preparation() {
		return (EReference) predictiveModelEClass.getEStructuralFeatures().get(0);
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
	public EReference getPrescriptiveModel_Enactment() {
		return (EReference) prescriptiveModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescriptiveModel_RunningSoftware() {
		return (EReference) prescriptiveModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescriptiveModel_AnalysisResult() {
		return (EReference) prescriptiveModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescriptiveModel_Generation() {
		return (EReference) prescriptiveModelEClass.getEStructuralFeatures().get(3);
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
	public EReference getSoftware_Processing() {
		return (EReference) softwareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSoftware_DeployedModel() {
		return (EReference) softwareEClass.getEStructuralFeatures().get(1);
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
	public EReference getSocioTechnicalSystem_Software() {
		return (EReference) socioTechnicalSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSocioTechnicalSystem_Otherinterplay() {
		return (EReference) socioTechnicalSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSocioTechnicalSystem_Enactment() {
		return (EReference) socioTechnicalSystemEClass.getEStructuralFeatures().get(2);
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
	public EReference getMODA_Model() {
		return (EReference) modaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMODA_Modelrole() {
		return (EReference) modaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMODA_Abstractrelation() {
		return (EReference) modaEClass.getEStructuralFeatures().get(4);
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
	public EClass getModaNode() {
		return modaNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModaNode_Analysis() {
		return (EReference) modaNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModaRelation() {
		return modaRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtherInterplay() {
		return otherInterplayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherInterplay_Data() {
		return (EReference) otherInterplayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtherInterplay_Sociotechnicalsystem() {
		return (EReference) otherInterplayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPurpose() {
		return dataPurposeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPurpose_Data() {
		return (EReference) dataPurposeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPurpose_Software() {
		return (EReference) dataPurposeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataPurpose_DataKind() {
		return (EAttribute) dataPurposeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnactment() {
		return enactmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnactment_Prescriptivemodel() {
		return (EReference) enactmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnactment_Sociotechnicalsystem() {
		return (EReference) enactmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Software() {
		return (EReference) deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Prescriptivemodel() {
		return (EReference) deploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreparation() {
		return preparationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreparation_Descriptivemodel() {
		return (EReference) preparationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreparation_Predictivemodel() {
		return (EReference) preparationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnalysis() {
		return analysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysis_Prescriptivemodel() {
		return (EReference) analysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnalysis_Modanode() {
		return (EReference) analysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneration() {
		return generationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneration_Prescriptivemodel() {
		return (EReference) generationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Data() {
		return (EReference) generalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Modelrole() {
		return (EReference) generalizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataKind() {
		return dataKindEEnum;
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
		modaEClass = createEClass(MODA);
		createEReference(modaEClass, MODA__SOCIOTECHNICALSYSTEM);
		createEReference(modaEClass, MODA__DATA);
		createEReference(modaEClass, MODA__MODEL);
		createEReference(modaEClass, MODA__MODELROLE);
		createEReference(modaEClass, MODA__ABSTRACTRELATION);

		dataEClass = createEClass(DATA);
		createEReference(dataEClass, DATA__OTHERINTERPLAY);
		createEReference(dataEClass, DATA__PROCESSING);
		createEReference(dataEClass, DATA__GENERALIZATION);

		modelRoleEClass = createEClass(MODEL_ROLE);
		createEReference(modelRoleEClass, MODEL_ROLE__MODEL);
		createEReference(modelRoleEClass, MODEL_ROLE__GENERALIZATION);

		descriptiveModelEClass = createEClass(DESCRIPTIVE_MODEL);
		createEReference(descriptiveModelEClass, DESCRIPTIVE_MODEL__PREPARATION);

		predictiveModelEClass = createEClass(PREDICTIVE_MODEL);
		createEReference(predictiveModelEClass, PREDICTIVE_MODEL__PREPARATION);

		prescriptiveModelEClass = createEClass(PRESCRIPTIVE_MODEL);
		createEReference(prescriptiveModelEClass, PRESCRIPTIVE_MODEL__ENACTMENT);
		createEReference(prescriptiveModelEClass, PRESCRIPTIVE_MODEL__RUNNING_SOFTWARE);
		createEReference(prescriptiveModelEClass, PRESCRIPTIVE_MODEL__ANALYSIS_RESULT);
		createEReference(prescriptiveModelEClass, PRESCRIPTIVE_MODEL__GENERATION);

		softwareEClass = createEClass(SOFTWARE);
		createEReference(softwareEClass, SOFTWARE__PROCESSING);
		createEReference(softwareEClass, SOFTWARE__DEPLOYED_MODEL);

		socioTechnicalSystemEClass = createEClass(SOCIO_TECHNICAL_SYSTEM);
		createEReference(socioTechnicalSystemEClass, SOCIO_TECHNICAL_SYSTEM__SOFTWARE);
		createEReference(socioTechnicalSystemEClass, SOCIO_TECHNICAL_SYSTEM__OTHERINTERPLAY);
		createEReference(socioTechnicalSystemEClass, SOCIO_TECHNICAL_SYSTEM__ENACTMENT);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__MODELROLE);

		modaNodeEClass = createEClass(MODA_NODE);
		createEReference(modaNodeEClass, MODA_NODE__ANALYSIS);

		modaRelationEClass = createEClass(MODA_RELATION);

		otherInterplayEClass = createEClass(OTHER_INTERPLAY);
		createEReference(otherInterplayEClass, OTHER_INTERPLAY__DATA);
		createEReference(otherInterplayEClass, OTHER_INTERPLAY__SOCIOTECHNICALSYSTEM);

		dataPurposeEClass = createEClass(DATA_PURPOSE);
		createEReference(dataPurposeEClass, DATA_PURPOSE__DATA);
		createEReference(dataPurposeEClass, DATA_PURPOSE__SOFTWARE);
		createEAttribute(dataPurposeEClass, DATA_PURPOSE__DATA_KIND);

		enactmentEClass = createEClass(ENACTMENT);
		createEReference(enactmentEClass, ENACTMENT__PRESCRIPTIVEMODEL);
		createEReference(enactmentEClass, ENACTMENT__SOCIOTECHNICALSYSTEM);

		deploymentEClass = createEClass(DEPLOYMENT);
		createEReference(deploymentEClass, DEPLOYMENT__SOFTWARE);
		createEReference(deploymentEClass, DEPLOYMENT__PRESCRIPTIVEMODEL);

		preparationEClass = createEClass(PREPARATION);
		createEReference(preparationEClass, PREPARATION__DESCRIPTIVEMODEL);
		createEReference(preparationEClass, PREPARATION__PREDICTIVEMODEL);

		analysisEClass = createEClass(ANALYSIS);
		createEReference(analysisEClass, ANALYSIS__PRESCRIPTIVEMODEL);
		createEReference(analysisEClass, ANALYSIS__MODANODE);

		generationEClass = createEClass(GENERATION);
		createEReference(generationEClass, GENERATION__PRESCRIPTIVEMODEL);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		generalizationEClass = createEClass(GENERALIZATION);
		createEReference(generalizationEClass, GENERALIZATION__DATA);
		createEReference(generalizationEClass, GENERALIZATION__MODELROLE);

		// Create enums
		dataKindEEnum = createEEnum(DATA_KIND);
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
		modaEClass.getESuperTypes().add(this.getModaNode());
		dataEClass.getESuperTypes().add(this.getModaNode());
		modelRoleEClass.getESuperTypes().add(this.getModaNode());
		descriptiveModelEClass.getESuperTypes().add(this.getModelRole());
		predictiveModelEClass.getESuperTypes().add(this.getModelRole());
		prescriptiveModelEClass.getESuperTypes().add(this.getModelRole());
		softwareEClass.getESuperTypes().add(this.getModaNode());
		socioTechnicalSystemEClass.getESuperTypes().add(this.getModaNode());
		modelEClass.getESuperTypes().add(this.getModaNode());
		modaNodeEClass.getESuperTypes().add(this.getNamedElement());
		modaRelationEClass.getESuperTypes().add(this.getNamedElement());
		otherInterplayEClass.getESuperTypes().add(this.getModaRelation());
		dataPurposeEClass.getESuperTypes().add(this.getModaRelation());
		enactmentEClass.getESuperTypes().add(this.getModaRelation());
		deploymentEClass.getESuperTypes().add(this.getModaRelation());
		preparationEClass.getESuperTypes().add(this.getModaRelation());
		analysisEClass.getESuperTypes().add(this.getModaRelation());
		generationEClass.getESuperTypes().add(this.getModaRelation());
		generalizationEClass.getESuperTypes().add(this.getModaRelation());

		// Initialize classes, features, and operations; add parameters
		initEClass(modaEClass, internship.moda.fig1.MODA.class, "MODA", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMODA_Sociotechnicalsystem(), this.getSocioTechnicalSystem(), null, "sociotechnicalsystem",
				null, 0, 1, internship.moda.fig1.MODA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMODA_Data(), this.getData(), null, "data", null, 0, -1, internship.moda.fig1.MODA.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMODA_Model(), this.getModel(), null, "model", null, 0, -1, internship.moda.fig1.MODA.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMODA_Modelrole(), this.getModelRole(), null, "modelrole", null, 0, -1,
				internship.moda.fig1.MODA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMODA_Abstractrelation(), this.getModaRelation(), null, "abstractrelation", null, 0, -1,
				internship.moda.fig1.MODA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getData_Otherinterplay(), this.getOtherInterplay(), this.getOtherInterplay_Data(),
				"otherinterplay", null, 0, -1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Processing(), this.getDataPurpose(), this.getDataPurpose_Data(), "processing", null, 0,
				1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Generalization(), this.getGeneralization(), this.getGeneralization_Data(),
				"generalization", null, 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelRoleEClass, ModelRole.class, "ModelRole", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelRole_Model(), this.getModel(), this.getModel_Modelrole(), "model", null, 0, 1,
				ModelRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelRole_Generalization(), this.getGeneralization(), this.getGeneralization_Modelrole(),
				"generalization", null, 0, 1, ModelRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptiveModelEClass, DescriptiveModel.class, "DescriptiveModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDescriptiveModel_Preparation(), this.getPreparation(), this.getPreparation_Descriptivemodel(),
				"preparation", null, 0, 1, DescriptiveModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predictiveModelEClass, PredictiveModel.class, "PredictiveModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPredictiveModel_Preparation(), this.getPreparation(), this.getPreparation_Predictivemodel(),
				"preparation", null, 0, 1, PredictiveModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prescriptiveModelEClass, PrescriptiveModel.class, "PrescriptiveModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrescriptiveModel_Enactment(), this.getEnactment(), this.getEnactment_Prescriptivemodel(),
				"enactment", null, 0, 1, PrescriptiveModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrescriptiveModel_RunningSoftware(), this.getDeployment(),
				this.getDeployment_Prescriptivemodel(), "runningSoftware", null, 0, 1, PrescriptiveModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrescriptiveModel_AnalysisResult(), this.getAnalysis(), this.getAnalysis_Prescriptivemodel(),
				"analysisResult", null, 0, 1, PrescriptiveModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrescriptiveModel_Generation(), this.getGeneration(), this.getGeneration_Prescriptivemodel(),
				"generation", null, 0, 1, PrescriptiveModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(softwareEClass, Software.class, "Software", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSoftware_Processing(), this.getDataPurpose(), this.getDataPurpose_Software(), "processing",
				null, 0, -1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSoftware_DeployedModel(), this.getDeployment(), this.getDeployment_Software(),
				"deployedModel", null, 0, 1, Software.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(socioTechnicalSystemEClass, SocioTechnicalSystem.class, "SocioTechnicalSystem", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSocioTechnicalSystem_Software(), this.getSoftware(), null, "software", null, 0, 1,
				SocioTechnicalSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSocioTechnicalSystem_Otherinterplay(), this.getOtherInterplay(),
				this.getOtherInterplay_Sociotechnicalsystem(), "otherinterplay", null, 0, 1, SocioTechnicalSystem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSocioTechnicalSystem_Enactment(), this.getEnactment(),
				this.getEnactment_Sociotechnicalsystem(), "enactment", null, 0, 1, SocioTechnicalSystem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Modelrole(), this.getModelRole(), this.getModelRole_Model(), "modelrole", null, 0, -1,
				Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modaNodeEClass, ModaNode.class, "ModaNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModaNode_Analysis(), this.getAnalysis(), this.getAnalysis_Modanode(), "analysis", null, 0, 1,
				ModaNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modaRelationEClass, ModaRelation.class, "ModaRelation", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(otherInterplayEClass, OtherInterplay.class, "OtherInterplay", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOtherInterplay_Data(), this.getData(), this.getData_Otherinterplay(), "data", null, 1, -1,
				OtherInterplay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOtherInterplay_Sociotechnicalsystem(), this.getSocioTechnicalSystem(),
				this.getSocioTechnicalSystem_Otherinterplay(), "sociotechnicalsystem", null, 0, 1, OtherInterplay.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataPurposeEClass, DataPurpose.class, "DataPurpose", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPurpose_Data(), this.getData(), this.getData_Processing(), "data", null, 0, 1,
				DataPurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataPurpose_Software(), this.getSoftware(), this.getSoftware_Processing(), "software", null,
				0, 1, DataPurpose.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataPurpose_DataKind(), this.getDataKind(), "dataKind", null, 0, 1, DataPurpose.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enactmentEClass, Enactment.class, "Enactment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnactment_Prescriptivemodel(), this.getPrescriptiveModel(),
				this.getPrescriptiveModel_Enactment(), "prescriptivemodel", null, 0, 1, Enactment.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEnactment_Sociotechnicalsystem(), this.getSocioTechnicalSystem(),
				this.getSocioTechnicalSystem_Enactment(), "sociotechnicalsystem", null, 0, 1, Enactment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployment_Software(), this.getSoftware(), this.getSoftware_DeployedModel(), "software", null,
				0, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_Prescriptivemodel(), this.getPrescriptiveModel(),
				this.getPrescriptiveModel_RunningSoftware(), "prescriptivemodel", null, 0, 1, Deployment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preparationEClass, Preparation.class, "Preparation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPreparation_Descriptivemodel(), this.getDescriptiveModel(),
				this.getDescriptiveModel_Preparation(), "descriptivemodel", null, 0, 1, Preparation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPreparation_Predictivemodel(), this.getPredictiveModel(),
				this.getPredictiveModel_Preparation(), "predictivemodel", null, 0, 1, Preparation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(analysisEClass, Analysis.class, "Analysis", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnalysis_Prescriptivemodel(), this.getPrescriptiveModel(),
				this.getPrescriptiveModel_AnalysisResult(), "prescriptivemodel", null, 0, 1, Analysis.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnalysis_Modanode(), this.getModaNode(), this.getModaNode_Analysis(), "modanode", null, 0, 1,
				Analysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generationEClass, Generation.class, "Generation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneration_Prescriptivemodel(), this.getPrescriptiveModel(),
				this.getPrescriptiveModel_Generation(), "prescriptivemodel", null, 0, 2, Generation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralization_Data(), this.getData(), this.getData_Generalization(), "data", null, 0, -1,
				Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneralization_Modelrole(), this.getModelRole(), this.getModelRole_Generalization(),
				"modelrole", null, 0, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(dataKindEEnum, DataKind.class, "DataKind");
		addEEnumLiteral(dataKindEEnum, DataKind.INPUT_DATA);
		addEEnumLiteral(dataKindEEnum, DataKind.OUTPUT_DATA);
		addEEnumLiteral(dataKindEEnum, DataKind.EXTERNAL_DATA);
		addEEnumLiteral(dataKindEEnum, DataKind.MEASURED_DATA);

		// Create resource
		createResource(eNS_URI);
	}

} //Fig1PackageImpl
