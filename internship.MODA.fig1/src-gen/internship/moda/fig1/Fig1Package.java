/**
 */
package internship.moda.fig1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see internship.moda.fig1.Fig1Factory
 * @model kind="package"
 * @generated
 */
public interface Fig1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fig1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/fig1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fig1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Fig1Package eINSTANCE = internship.moda.fig1.impl.Fig1PackageImpl.init();

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.DataImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getData()
	 * @generated
	 */
	int DATA = 0;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.InputDataImpl <em>Input Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.InputDataImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getInputData()
	 * @generated
	 */
	int INPUT_DATA = 1;

	/**
	 * The number of structural features of the '<em>Input Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Input Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.OutputDataImpl <em>Output Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.OutputDataImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getOutputData()
	 * @generated
	 */
	int OUTPUT_DATA = 2;

	/**
	 * The feature id for the '<em><b>Software</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA__SOFTWARE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Output Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.MeasuredDataImpl <em>Measured Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.MeasuredDataImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getMeasuredData()
	 * @generated
	 */
	int MEASURED_DATA = 3;

	/**
	 * The feature id for the '<em><b>Software</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_DATA__SOFTWARE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Measured Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Measured Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.ExternalDataImpl <em>External Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.ExternalDataImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getExternalData()
	 * @generated
	 */
	int EXTERNAL_DATA = 4;

	/**
	 * The feature id for the '<em><b>Sociotechnicalsystem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA__SOCIOTECHNICALSYSTEM = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>External Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.ModelImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.DescriptiveModelImpl <em>Descriptive Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.DescriptiveModelImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getDescriptiveModel()
	 * @generated
	 */
	int DESCRIPTIVE_MODEL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_MODEL__NAME = MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_MODEL__DATA = MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Descriptive Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Descriptive Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_MODEL_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.PredictiveModelImpl <em>Predictive Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.PredictiveModelImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getPredictiveModel()
	 * @generated
	 */
	int PREDICTIVE_MODEL = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_MODEL__NAME = MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Descriptivemodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_MODEL__DESCRIPTIVEMODEL = MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predictive Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Predictive Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_MODEL_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.PrescriptiveModelImpl <em>Prescriptive Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.PrescriptiveModelImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getPrescriptiveModel()
	 * @generated
	 */
	int PRESCRIPTIVE_MODEL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL__NAME = MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL__MODEL = MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Prescriptive Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Prescriptive Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL_OPERATION_COUNT = MODEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.SoftwareImpl <em>Software</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.SoftwareImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getSoftware()
	 * @generated
	 */
	int SOFTWARE = 9;

	/**
	 * The feature id for the '<em><b>Prescriptivemodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__PRESCRIPTIVEMODEL = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__STATE = 1;

	/**
	 * The feature id for the '<em><b>Inputdata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__INPUTDATA = 2;

	/**
	 * The number of structural features of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.SocioTechnicalSystemImpl <em>Socio Technical System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.SocioTechnicalSystemImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getSocioTechnicalSystem()
	 * @generated
	 */
	int SOCIO_TECHNICAL_SYSTEM = 10;

	/**
	 * The feature id for the '<em><b>Software</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIO_TECHNICAL_SYSTEM__SOFTWARE = 0;

	/**
	 * The feature id for the '<em><b>Externaldata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIO_TECHNICAL_SYSTEM__EXTERNALDATA = 1;

	/**
	 * The feature id for the '<em><b>Prescriptivemodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIO_TECHNICAL_SYSTEM__PRESCRIPTIVEMODEL = 2;

	/**
	 * The number of structural features of the '<em>Socio Technical System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIO_TECHNICAL_SYSTEM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Socio Technical System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIO_TECHNICAL_SYSTEM_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see internship.moda.fig1.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.InputData <em>Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Data</em>'.
	 * @see internship.moda.fig1.InputData
	 * @generated
	 */
	EClass getInputData();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.OutputData <em>Output Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Data</em>'.
	 * @see internship.moda.fig1.OutputData
	 * @generated
	 */
	EClass getOutputData();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.OutputData#getSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Software</em>'.
	 * @see internship.moda.fig1.OutputData#getSoftware()
	 * @see #getOutputData()
	 * @generated
	 */
	EReference getOutputData_Software();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.MeasuredData <em>Measured Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measured Data</em>'.
	 * @see internship.moda.fig1.MeasuredData
	 * @generated
	 */
	EClass getMeasuredData();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.MeasuredData#getSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Software</em>'.
	 * @see internship.moda.fig1.MeasuredData#getSoftware()
	 * @see #getMeasuredData()
	 * @generated
	 */
	EReference getMeasuredData_Software();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.ExternalData <em>External Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Data</em>'.
	 * @see internship.moda.fig1.ExternalData
	 * @generated
	 */
	EClass getExternalData();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.ExternalData#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sociotechnicalsystem</em>'.
	 * @see internship.moda.fig1.ExternalData#getSociotechnicalsystem()
	 * @see #getExternalData()
	 * @generated
	 */
	EReference getExternalData_Sociotechnicalsystem();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see internship.moda.fig1.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link internship.moda.fig1.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see internship.moda.fig1.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.DescriptiveModel <em>Descriptive Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptive Model</em>'.
	 * @see internship.moda.fig1.DescriptiveModel
	 * @generated
	 */
	EClass getDescriptiveModel();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.DescriptiveModel#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see internship.moda.fig1.DescriptiveModel#getData()
	 * @see #getDescriptiveModel()
	 * @generated
	 */
	EReference getDescriptiveModel_Data();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.PredictiveModel <em>Predictive Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predictive Model</em>'.
	 * @see internship.moda.fig1.PredictiveModel
	 * @generated
	 */
	EClass getPredictiveModel();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.PredictiveModel#getDescriptivemodel <em>Descriptivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Descriptivemodel</em>'.
	 * @see internship.moda.fig1.PredictiveModel#getDescriptivemodel()
	 * @see #getPredictiveModel()
	 * @generated
	 */
	EReference getPredictiveModel_Descriptivemodel();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.PrescriptiveModel <em>Prescriptive Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prescriptive Model</em>'.
	 * @see internship.moda.fig1.PrescriptiveModel
	 * @generated
	 */
	EClass getPrescriptiveModel();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.PrescriptiveModel#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see internship.moda.fig1.PrescriptiveModel#getModel()
	 * @see #getPrescriptiveModel()
	 * @generated
	 */
	EReference getPrescriptiveModel_Model();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.Software <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Software</em>'.
	 * @see internship.moda.fig1.Software
	 * @generated
	 */
	EClass getSoftware();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.Software#getPrescriptivemodel <em>Prescriptivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prescriptivemodel</em>'.
	 * @see internship.moda.fig1.Software#getPrescriptivemodel()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_Prescriptivemodel();

	/**
	 * Returns the meta object for the attribute '{@link internship.moda.fig1.Software#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see internship.moda.fig1.Software#getState()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_State();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.Software#getInputdata <em>Inputdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inputdata</em>'.
	 * @see internship.moda.fig1.Software#getInputdata()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_Inputdata();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.SocioTechnicalSystem <em>Socio Technical System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Socio Technical System</em>'.
	 * @see internship.moda.fig1.SocioTechnicalSystem
	 * @generated
	 */
	EClass getSocioTechnicalSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link internship.moda.fig1.SocioTechnicalSystem#getSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Software</em>'.
	 * @see internship.moda.fig1.SocioTechnicalSystem#getSoftware()
	 * @see #getSocioTechnicalSystem()
	 * @generated
	 */
	EReference getSocioTechnicalSystem_Software();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.SocioTechnicalSystem#getExternaldata <em>Externaldata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Externaldata</em>'.
	 * @see internship.moda.fig1.SocioTechnicalSystem#getExternaldata()
	 * @see #getSocioTechnicalSystem()
	 * @generated
	 */
	EReference getSocioTechnicalSystem_Externaldata();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.SocioTechnicalSystem#getPrescriptivemodel <em>Prescriptivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prescriptivemodel</em>'.
	 * @see internship.moda.fig1.SocioTechnicalSystem#getPrescriptivemodel()
	 * @see #getSocioTechnicalSystem()
	 * @generated
	 */
	EReference getSocioTechnicalSystem_Prescriptivemodel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Fig1Factory getFig1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.DataImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.InputDataImpl <em>Input Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.InputDataImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getInputData()
		 * @generated
		 */
		EClass INPUT_DATA = eINSTANCE.getInputData();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.OutputDataImpl <em>Output Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.OutputDataImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getOutputData()
		 * @generated
		 */
		EClass OUTPUT_DATA = eINSTANCE.getOutputData();

		/**
		 * The meta object literal for the '<em><b>Software</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_DATA__SOFTWARE = eINSTANCE.getOutputData_Software();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.MeasuredDataImpl <em>Measured Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.MeasuredDataImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getMeasuredData()
		 * @generated
		 */
		EClass MEASURED_DATA = eINSTANCE.getMeasuredData();

		/**
		 * The meta object literal for the '<em><b>Software</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURED_DATA__SOFTWARE = eINSTANCE.getMeasuredData_Software();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.ExternalDataImpl <em>External Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.ExternalDataImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getExternalData()
		 * @generated
		 */
		EClass EXTERNAL_DATA = eINSTANCE.getExternalData();

		/**
		 * The meta object literal for the '<em><b>Sociotechnicalsystem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_DATA__SOCIOTECHNICALSYSTEM = eINSTANCE.getExternalData_Sociotechnicalsystem();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.ModelImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.DescriptiveModelImpl <em>Descriptive Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.DescriptiveModelImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getDescriptiveModel()
		 * @generated
		 */
		EClass DESCRIPTIVE_MODEL = eINSTANCE.getDescriptiveModel();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTIVE_MODEL__DATA = eINSTANCE.getDescriptiveModel_Data();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.PredictiveModelImpl <em>Predictive Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.PredictiveModelImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getPredictiveModel()
		 * @generated
		 */
		EClass PREDICTIVE_MODEL = eINSTANCE.getPredictiveModel();

		/**
		 * The meta object literal for the '<em><b>Descriptivemodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICTIVE_MODEL__DESCRIPTIVEMODEL = eINSTANCE.getPredictiveModel_Descriptivemodel();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.PrescriptiveModelImpl <em>Prescriptive Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.PrescriptiveModelImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getPrescriptiveModel()
		 * @generated
		 */
		EClass PRESCRIPTIVE_MODEL = eINSTANCE.getPrescriptiveModel();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIPTIVE_MODEL__MODEL = eINSTANCE.getPrescriptiveModel_Model();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.SoftwareImpl <em>Software</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.SoftwareImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getSoftware()
		 * @generated
		 */
		EClass SOFTWARE = eINSTANCE.getSoftware();

		/**
		 * The meta object literal for the '<em><b>Prescriptivemodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__PRESCRIPTIVEMODEL = eINSTANCE.getSoftware_Prescriptivemodel();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE__STATE = eINSTANCE.getSoftware_State();

		/**
		 * The meta object literal for the '<em><b>Inputdata</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__INPUTDATA = eINSTANCE.getSoftware_Inputdata();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.SocioTechnicalSystemImpl <em>Socio Technical System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.SocioTechnicalSystemImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getSocioTechnicalSystem()
		 * @generated
		 */
		EClass SOCIO_TECHNICAL_SYSTEM = eINSTANCE.getSocioTechnicalSystem();

		/**
		 * The meta object literal for the '<em><b>Software</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIO_TECHNICAL_SYSTEM__SOFTWARE = eINSTANCE.getSocioTechnicalSystem_Software();

		/**
		 * The meta object literal for the '<em><b>Externaldata</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIO_TECHNICAL_SYSTEM__EXTERNALDATA = eINSTANCE.getSocioTechnicalSystem_Externaldata();

		/**
		 * The meta object literal for the '<em><b>Prescriptivemodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIO_TECHNICAL_SYSTEM__PRESCRIPTIVEMODEL = eINSTANCE.getSocioTechnicalSystem_Prescriptivemodel();

	}

} //Fig1Package
