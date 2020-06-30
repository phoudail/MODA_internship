/**
 */
package internship.moda.fig1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	String eNS_URI = "http://www.irisa.fr/MODA/fig1";

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
	 * The meta object id for the '{@link internship.moda.fig1.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.NamedElementImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.ModaNodeImpl <em>Moda Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.ModaNodeImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getModaNode()
	 * @generated
	 */
	int MODA_NODE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_NODE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_NODE__ANALYSIS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Moda Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_NODE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Moda Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_NODE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.DataImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getData()
	 * @generated
	 */
	int DATA = 1;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.ModelRoleImpl <em>Model Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.ModelRoleImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getModelRole()
	 * @generated
	 */
	int MODEL_ROLE = 2;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.DescriptiveModelImpl <em>Descriptive Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.DescriptiveModelImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getDescriptiveModel()
	 * @generated
	 */
	int DESCRIPTIVE_MODEL = 3;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.PredictiveModelImpl <em>Predictive Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.PredictiveModelImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getPredictiveModel()
	 * @generated
	 */
	int PREDICTIVE_MODEL = 4;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.PrescriptiveModelImpl <em>Prescriptive Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.PrescriptiveModelImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getPrescriptiveModel()
	 * @generated
	 */
	int PRESCRIPTIVE_MODEL = 5;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.SoftwareImpl <em>Software</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.SoftwareImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getSoftware()
	 * @generated
	 */
	int SOFTWARE = 6;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.SocioTechnicalSystemImpl <em>Socio Technical System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.SocioTechnicalSystemImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getSocioTechnicalSystem()
	 * @generated
	 */
	int SOCIO_TECHNICAL_SYSTEM = 7;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.MODAImpl <em>MODA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.MODAImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getMODA()
	 * @generated
	 */
	int MODA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA__NAME = MODA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA__ANALYSIS = MODA_NODE__ANALYSIS;

	/**
	 * The feature id for the '<em><b>Sociotechnicalsystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA__SOCIOTECHNICALSYSTEM = MODA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA__DATA = MODA_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA__MODEL = MODA_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Modelrole</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA__MODELROLE = MODA_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Abstractrelation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA__ABSTRACTRELATION = MODA_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>MODA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_FEATURE_COUNT = MODA_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>MODA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_OPERATION_COUNT = MODA_NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = MODA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ANALYSIS = MODA_NODE__ANALYSIS;

	/**
	 * The feature id for the '<em><b>Otherinterplay</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__OTHERINTERPLAY = MODA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PROCESSING = MODA_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__GENERALIZATION = MODA_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = MODA_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = MODA_NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROLE__NAME = MODA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROLE__ANALYSIS = MODA_NODE__ANALYSIS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROLE__MODEL = MODA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROLE__GENERALIZATION = MODA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROLE_FEATURE_COUNT = MODA_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROLE_OPERATION_COUNT = MODA_NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_MODEL__NAME = MODEL_ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_MODEL__ANALYSIS = MODEL_ROLE__ANALYSIS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_MODEL__MODEL = MODEL_ROLE__MODEL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_MODEL__GENERALIZATION = MODEL_ROLE__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Preparation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_MODEL__PREPARATION = MODEL_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Descriptive Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_MODEL_FEATURE_COUNT = MODEL_ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Descriptive Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_MODEL_OPERATION_COUNT = MODEL_ROLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_MODEL__NAME = MODEL_ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_MODEL__ANALYSIS = MODEL_ROLE__ANALYSIS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_MODEL__MODEL = MODEL_ROLE__MODEL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_MODEL__GENERALIZATION = MODEL_ROLE__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Preparation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_MODEL__PREPARATION = MODEL_ROLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predictive Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_MODEL_FEATURE_COUNT = MODEL_ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Predictive Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_MODEL_OPERATION_COUNT = MODEL_ROLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL__NAME = MODEL_ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL__ANALYSIS = MODEL_ROLE__ANALYSIS;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL__MODEL = MODEL_ROLE__MODEL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL__GENERALIZATION = MODEL_ROLE__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL__ENACTMENT = MODEL_ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Running Software</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL__RUNNING_SOFTWARE = MODEL_ROLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Analysis Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL__ANALYSIS_RESULT = MODEL_ROLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL__GENERATION = MODEL_ROLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Prescriptive Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL_FEATURE_COUNT = MODEL_ROLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Prescriptive Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL_OPERATION_COUNT = MODEL_ROLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__NAME = MODA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__ANALYSIS = MODA_NODE__ANALYSIS;

	/**
	 * The feature id for the '<em><b>Processing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__PROCESSING = MODA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Deployed Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__DEPLOYED_MODEL = MODA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_FEATURE_COUNT = MODA_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_OPERATION_COUNT = MODA_NODE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIO_TECHNICAL_SYSTEM__NAME = MODA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIO_TECHNICAL_SYSTEM__ANALYSIS = MODA_NODE__ANALYSIS;

	/**
	 * The feature id for the '<em><b>Software</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIO_TECHNICAL_SYSTEM__SOFTWARE = MODA_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Otherinterplay</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIO_TECHNICAL_SYSTEM__OTHERINTERPLAY = MODA_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Enactment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIO_TECHNICAL_SYSTEM__ENACTMENT = MODA_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Socio Technical System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIO_TECHNICAL_SYSTEM_FEATURE_COUNT = MODA_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Socio Technical System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIO_TECHNICAL_SYSTEM_OPERATION_COUNT = MODA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.ModelImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = MODA_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Analysis</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ANALYSIS = MODA_NODE__ANALYSIS;

	/**
	 * The feature id for the '<em><b>Modelrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODELROLE = MODA_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = MODA_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = MODA_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.ModaRelationImpl <em>Moda Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.ModaRelationImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getModaRelation()
	 * @generated
	 */
	int MODA_RELATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_RELATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Moda Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_RELATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Moda Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_RELATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.OtherInterplayImpl <em>Other Interplay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.OtherInterplayImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getOtherInterplay()
	 * @generated
	 */
	int OTHER_INTERPLAY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_INTERPLAY__NAME = MODA_RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_INTERPLAY__DATA = MODA_RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sociotechnicalsystem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_INTERPLAY__SOCIOTECHNICALSYSTEM = MODA_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Other Interplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_INTERPLAY_FEATURE_COUNT = MODA_RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Other Interplay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHER_INTERPLAY_OPERATION_COUNT = MODA_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.DataPurposeImpl <em>Data Purpose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.DataPurposeImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getDataPurpose()
	 * @generated
	 */
	int DATA_PURPOSE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PURPOSE__NAME = MODA_RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PURPOSE__DATA = MODA_RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Software</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PURPOSE__SOFTWARE = MODA_RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PURPOSE__DATA_KIND = MODA_RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PURPOSE_FEATURE_COUNT = MODA_RELATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Purpose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PURPOSE_OPERATION_COUNT = MODA_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.EnactmentImpl <em>Enactment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.EnactmentImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getEnactment()
	 * @generated
	 */
	int ENACTMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENACTMENT__NAME = MODA_RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Prescriptivemodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENACTMENT__PRESCRIPTIVEMODEL = MODA_RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sociotechnicalsystem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENACTMENT__SOCIOTECHNICALSYSTEM = MODA_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enactment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENACTMENT_FEATURE_COUNT = MODA_RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enactment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENACTMENT_OPERATION_COUNT = MODA_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.DeploymentImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__NAME = MODA_RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Software</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__SOFTWARE = MODA_RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prescriptivemodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__PRESCRIPTIVEMODEL = MODA_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = MODA_RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = MODA_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.PreparationImpl <em>Preparation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.PreparationImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getPreparation()
	 * @generated
	 */
	int PREPARATION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARATION__NAME = MODA_RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Descriptivemodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARATION__DESCRIPTIVEMODEL = MODA_RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predictivemodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARATION__PREDICTIVEMODEL = MODA_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Preparation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARATION_FEATURE_COUNT = MODA_RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Preparation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREPARATION_OPERATION_COUNT = MODA_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.AnalysisImpl <em>Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.AnalysisImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getAnalysis()
	 * @generated
	 */
	int ANALYSIS = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__NAME = MODA_RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Prescriptivemodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__PRESCRIPTIVEMODEL = MODA_RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modanode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS__MODANODE = MODA_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_FEATURE_COUNT = MODA_RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_OPERATION_COUNT = MODA_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.GenerationImpl <em>Generation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.GenerationImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getGeneration()
	 * @generated
	 */
	int GENERATION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION__NAME = MODA_RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Prescriptivemodel</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION__PRESCRIPTIVEMODEL = MODA_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_FEATURE_COUNT = MODA_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATION_OPERATION_COUNT = MODA_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.GeneralizationImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__NAME = MODA_RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__DATA = MODA_RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Modelrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__MODELROLE = MODA_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = MODA_RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_OPERATION_COUNT = MODA_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.DataKind <em>Data Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.DataKind
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getDataKind()
	 * @generated
	 */
	int DATA_KIND = 20;

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
	 * Returns the meta object for the reference list '{@link internship.moda.fig1.Data#getOtherinterplay <em>Otherinterplay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Otherinterplay</em>'.
	 * @see internship.moda.fig1.Data#getOtherinterplay()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Otherinterplay();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.Data#getProcessing <em>Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processing</em>'.
	 * @see internship.moda.fig1.Data#getProcessing()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Processing();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.Data#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generalization</em>'.
	 * @see internship.moda.fig1.Data#getGeneralization()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Generalization();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.ModelRole <em>Model Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Role</em>'.
	 * @see internship.moda.fig1.ModelRole
	 * @generated
	 */
	EClass getModelRole();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.ModelRole#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see internship.moda.fig1.ModelRole#getModel()
	 * @see #getModelRole()
	 * @generated
	 */
	EReference getModelRole_Model();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.ModelRole#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generalization</em>'.
	 * @see internship.moda.fig1.ModelRole#getGeneralization()
	 * @see #getModelRole()
	 * @generated
	 */
	EReference getModelRole_Generalization();

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
	 * Returns the meta object for the reference '{@link internship.moda.fig1.DescriptiveModel#getPreparation <em>Preparation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Preparation</em>'.
	 * @see internship.moda.fig1.DescriptiveModel#getPreparation()
	 * @see #getDescriptiveModel()
	 * @generated
	 */
	EReference getDescriptiveModel_Preparation();

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
	 * Returns the meta object for the reference '{@link internship.moda.fig1.PredictiveModel#getPreparation <em>Preparation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Preparation</em>'.
	 * @see internship.moda.fig1.PredictiveModel#getPreparation()
	 * @see #getPredictiveModel()
	 * @generated
	 */
	EReference getPredictiveModel_Preparation();

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
	 * Returns the meta object for the reference '{@link internship.moda.fig1.PrescriptiveModel#getEnactment <em>Enactment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enactment</em>'.
	 * @see internship.moda.fig1.PrescriptiveModel#getEnactment()
	 * @see #getPrescriptiveModel()
	 * @generated
	 */
	EReference getPrescriptiveModel_Enactment();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.PrescriptiveModel#getRunningSoftware <em>Running Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Running Software</em>'.
	 * @see internship.moda.fig1.PrescriptiveModel#getRunningSoftware()
	 * @see #getPrescriptiveModel()
	 * @generated
	 */
	EReference getPrescriptiveModel_RunningSoftware();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.PrescriptiveModel#getAnalysisResult <em>Analysis Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analysis Result</em>'.
	 * @see internship.moda.fig1.PrescriptiveModel#getAnalysisResult()
	 * @see #getPrescriptiveModel()
	 * @generated
	 */
	EReference getPrescriptiveModel_AnalysisResult();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.PrescriptiveModel#getGeneration <em>Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generation</em>'.
	 * @see internship.moda.fig1.PrescriptiveModel#getGeneration()
	 * @see #getPrescriptiveModel()
	 * @generated
	 */
	EReference getPrescriptiveModel_Generation();

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
	 * Returns the meta object for the reference list '{@link internship.moda.fig1.Software#getProcessing <em>Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processing</em>'.
	 * @see internship.moda.fig1.Software#getProcessing()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_Processing();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.Software#getDeployedModel <em>Deployed Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Deployed Model</em>'.
	 * @see internship.moda.fig1.Software#getDeployedModel()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_DeployedModel();

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
	 * Returns the meta object for the containment reference '{@link internship.moda.fig1.SocioTechnicalSystem#getSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software</em>'.
	 * @see internship.moda.fig1.SocioTechnicalSystem#getSoftware()
	 * @see #getSocioTechnicalSystem()
	 * @generated
	 */
	EReference getSocioTechnicalSystem_Software();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.SocioTechnicalSystem#getOtherinterplay <em>Otherinterplay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Otherinterplay</em>'.
	 * @see internship.moda.fig1.SocioTechnicalSystem#getOtherinterplay()
	 * @see #getSocioTechnicalSystem()
	 * @generated
	 */
	EReference getSocioTechnicalSystem_Otherinterplay();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.SocioTechnicalSystem#getEnactment <em>Enactment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enactment</em>'.
	 * @see internship.moda.fig1.SocioTechnicalSystem#getEnactment()
	 * @see #getSocioTechnicalSystem()
	 * @generated
	 */
	EReference getSocioTechnicalSystem_Enactment();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.MODA <em>MODA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MODA</em>'.
	 * @see internship.moda.fig1.MODA
	 * @generated
	 */
	EClass getMODA();

	/**
	 * Returns the meta object for the containment reference '{@link internship.moda.fig1.MODA#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sociotechnicalsystem</em>'.
	 * @see internship.moda.fig1.MODA#getSociotechnicalsystem()
	 * @see #getMODA()
	 * @generated
	 */
	EReference getMODA_Sociotechnicalsystem();

	/**
	 * Returns the meta object for the containment reference list '{@link internship.moda.fig1.MODA#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see internship.moda.fig1.MODA#getData()
	 * @see #getMODA()
	 * @generated
	 */
	EReference getMODA_Data();

	/**
	 * Returns the meta object for the containment reference list '{@link internship.moda.fig1.MODA#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model</em>'.
	 * @see internship.moda.fig1.MODA#getModel()
	 * @see #getMODA()
	 * @generated
	 */
	EReference getMODA_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link internship.moda.fig1.MODA#getModelrole <em>Modelrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modelrole</em>'.
	 * @see internship.moda.fig1.MODA#getModelrole()
	 * @see #getMODA()
	 * @generated
	 */
	EReference getMODA_Modelrole();

	/**
	 * Returns the meta object for the containment reference list '{@link internship.moda.fig1.MODA#getAbstractrelation <em>Abstractrelation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstractrelation</em>'.
	 * @see internship.moda.fig1.MODA#getAbstractrelation()
	 * @see #getMODA()
	 * @generated
	 */
	EReference getMODA_Abstractrelation();

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
	 * Returns the meta object for the reference list '{@link internship.moda.fig1.Model#getModelrole <em>Modelrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Modelrole</em>'.
	 * @see internship.moda.fig1.Model#getModelrole()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Modelrole();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.ModaNode <em>Moda Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moda Node</em>'.
	 * @see internship.moda.fig1.ModaNode
	 * @generated
	 */
	EClass getModaNode();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.ModaNode#getAnalysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analysis</em>'.
	 * @see internship.moda.fig1.ModaNode#getAnalysis()
	 * @see #getModaNode()
	 * @generated
	 */
	EReference getModaNode_Analysis();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.ModaRelation <em>Moda Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moda Relation</em>'.
	 * @see internship.moda.fig1.ModaRelation
	 * @generated
	 */
	EClass getModaRelation();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.OtherInterplay <em>Other Interplay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Other Interplay</em>'.
	 * @see internship.moda.fig1.OtherInterplay
	 * @generated
	 */
	EClass getOtherInterplay();

	/**
	 * Returns the meta object for the reference list '{@link internship.moda.fig1.OtherInterplay#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data</em>'.
	 * @see internship.moda.fig1.OtherInterplay#getData()
	 * @see #getOtherInterplay()
	 * @generated
	 */
	EReference getOtherInterplay_Data();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.OtherInterplay#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sociotechnicalsystem</em>'.
	 * @see internship.moda.fig1.OtherInterplay#getSociotechnicalsystem()
	 * @see #getOtherInterplay()
	 * @generated
	 */
	EReference getOtherInterplay_Sociotechnicalsystem();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.DataPurpose <em>Data Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Purpose</em>'.
	 * @see internship.moda.fig1.DataPurpose
	 * @generated
	 */
	EClass getDataPurpose();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.DataPurpose#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data</em>'.
	 * @see internship.moda.fig1.DataPurpose#getData()
	 * @see #getDataPurpose()
	 * @generated
	 */
	EReference getDataPurpose_Data();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.DataPurpose#getSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Software</em>'.
	 * @see internship.moda.fig1.DataPurpose#getSoftware()
	 * @see #getDataPurpose()
	 * @generated
	 */
	EReference getDataPurpose_Software();

	/**
	 * Returns the meta object for the attribute '{@link internship.moda.fig1.DataPurpose#getDataKind <em>Data Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Kind</em>'.
	 * @see internship.moda.fig1.DataPurpose#getDataKind()
	 * @see #getDataPurpose()
	 * @generated
	 */
	EAttribute getDataPurpose_DataKind();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.Enactment <em>Enactment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enactment</em>'.
	 * @see internship.moda.fig1.Enactment
	 * @generated
	 */
	EClass getEnactment();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.Enactment#getPrescriptivemodel <em>Prescriptivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prescriptivemodel</em>'.
	 * @see internship.moda.fig1.Enactment#getPrescriptivemodel()
	 * @see #getEnactment()
	 * @generated
	 */
	EReference getEnactment_Prescriptivemodel();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.Enactment#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sociotechnicalsystem</em>'.
	 * @see internship.moda.fig1.Enactment#getSociotechnicalsystem()
	 * @see #getEnactment()
	 * @generated
	 */
	EReference getEnactment_Sociotechnicalsystem();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see internship.moda.fig1.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.Deployment#getSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Software</em>'.
	 * @see internship.moda.fig1.Deployment#getSoftware()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Software();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.Deployment#getPrescriptivemodel <em>Prescriptivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prescriptivemodel</em>'.
	 * @see internship.moda.fig1.Deployment#getPrescriptivemodel()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Prescriptivemodel();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.Preparation <em>Preparation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preparation</em>'.
	 * @see internship.moda.fig1.Preparation
	 * @generated
	 */
	EClass getPreparation();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.Preparation#getDescriptivemodel <em>Descriptivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Descriptivemodel</em>'.
	 * @see internship.moda.fig1.Preparation#getDescriptivemodel()
	 * @see #getPreparation()
	 * @generated
	 */
	EReference getPreparation_Descriptivemodel();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.Preparation#getPredictivemodel <em>Predictivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predictivemodel</em>'.
	 * @see internship.moda.fig1.Preparation#getPredictivemodel()
	 * @see #getPreparation()
	 * @generated
	 */
	EReference getPreparation_Predictivemodel();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.Analysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis</em>'.
	 * @see internship.moda.fig1.Analysis
	 * @generated
	 */
	EClass getAnalysis();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.Analysis#getPrescriptivemodel <em>Prescriptivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prescriptivemodel</em>'.
	 * @see internship.moda.fig1.Analysis#getPrescriptivemodel()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Prescriptivemodel();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.Analysis#getModanode <em>Modanode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modanode</em>'.
	 * @see internship.moda.fig1.Analysis#getModanode()
	 * @see #getAnalysis()
	 * @generated
	 */
	EReference getAnalysis_Modanode();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.Generation <em>Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generation</em>'.
	 * @see internship.moda.fig1.Generation
	 * @generated
	 */
	EClass getGeneration();

	/**
	 * Returns the meta object for the reference list '{@link internship.moda.fig1.Generation#getPrescriptivemodel <em>Prescriptivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Prescriptivemodel</em>'.
	 * @see internship.moda.fig1.Generation#getPrescriptivemodel()
	 * @see #getGeneration()
	 * @generated
	 */
	EReference getGeneration_Prescriptivemodel();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see internship.moda.fig1.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link internship.moda.fig1.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see internship.moda.fig1.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link internship.moda.fig1.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see internship.moda.fig1.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for the reference list '{@link internship.moda.fig1.Generalization#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data</em>'.
	 * @see internship.moda.fig1.Generalization#getData()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Data();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.Generalization#getModelrole <em>Modelrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modelrole</em>'.
	 * @see internship.moda.fig1.Generalization#getModelrole()
	 * @see #getGeneralization()
	 * @generated
	 */
	EReference getGeneralization_Modelrole();

	/**
	 * Returns the meta object for enum '{@link internship.moda.fig1.DataKind <em>Data Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Kind</em>'.
	 * @see internship.moda.fig1.DataKind
	 * @generated
	 */
	EEnum getDataKind();

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
		 * The meta object literal for the '<em><b>Otherinterplay</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__OTHERINTERPLAY = eINSTANCE.getData_Otherinterplay();

		/**
		 * The meta object literal for the '<em><b>Processing</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__PROCESSING = eINSTANCE.getData_Processing();

		/**
		 * The meta object literal for the '<em><b>Generalization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__GENERALIZATION = eINSTANCE.getData_Generalization();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.ModelRoleImpl <em>Model Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.ModelRoleImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getModelRole()
		 * @generated
		 */
		EClass MODEL_ROLE = eINSTANCE.getModelRole();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ROLE__MODEL = eINSTANCE.getModelRole_Model();

		/**
		 * The meta object literal for the '<em><b>Generalization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ROLE__GENERALIZATION = eINSTANCE.getModelRole_Generalization();

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
		 * The meta object literal for the '<em><b>Preparation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTIVE_MODEL__PREPARATION = eINSTANCE.getDescriptiveModel_Preparation();

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
		 * The meta object literal for the '<em><b>Preparation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICTIVE_MODEL__PREPARATION = eINSTANCE.getPredictiveModel_Preparation();

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
		 * The meta object literal for the '<em><b>Enactment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIPTIVE_MODEL__ENACTMENT = eINSTANCE.getPrescriptiveModel_Enactment();

		/**
		 * The meta object literal for the '<em><b>Running Software</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIPTIVE_MODEL__RUNNING_SOFTWARE = eINSTANCE.getPrescriptiveModel_RunningSoftware();

		/**
		 * The meta object literal for the '<em><b>Analysis Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIPTIVE_MODEL__ANALYSIS_RESULT = eINSTANCE.getPrescriptiveModel_AnalysisResult();

		/**
		 * The meta object literal for the '<em><b>Generation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIPTIVE_MODEL__GENERATION = eINSTANCE.getPrescriptiveModel_Generation();

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
		 * The meta object literal for the '<em><b>Processing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__PROCESSING = eINSTANCE.getSoftware_Processing();

		/**
		 * The meta object literal for the '<em><b>Deployed Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__DEPLOYED_MODEL = eINSTANCE.getSoftware_DeployedModel();

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
		 * The meta object literal for the '<em><b>Software</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIO_TECHNICAL_SYSTEM__SOFTWARE = eINSTANCE.getSocioTechnicalSystem_Software();

		/**
		 * The meta object literal for the '<em><b>Otherinterplay</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIO_TECHNICAL_SYSTEM__OTHERINTERPLAY = eINSTANCE.getSocioTechnicalSystem_Otherinterplay();

		/**
		 * The meta object literal for the '<em><b>Enactment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIO_TECHNICAL_SYSTEM__ENACTMENT = eINSTANCE.getSocioTechnicalSystem_Enactment();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.MODAImpl <em>MODA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.MODAImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getMODA()
		 * @generated
		 */
		EClass MODA = eINSTANCE.getMODA();

		/**
		 * The meta object literal for the '<em><b>Sociotechnicalsystem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODA__SOCIOTECHNICALSYSTEM = eINSTANCE.getMODA_Sociotechnicalsystem();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODA__DATA = eINSTANCE.getMODA_Data();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODA__MODEL = eINSTANCE.getMODA_Model();

		/**
		 * The meta object literal for the '<em><b>Modelrole</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODA__MODELROLE = eINSTANCE.getMODA_Modelrole();

		/**
		 * The meta object literal for the '<em><b>Abstractrelation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODA__ABSTRACTRELATION = eINSTANCE.getMODA_Abstractrelation();

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
		 * The meta object literal for the '<em><b>Modelrole</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__MODELROLE = eINSTANCE.getModel_Modelrole();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.ModaNodeImpl <em>Moda Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.ModaNodeImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getModaNode()
		 * @generated
		 */
		EClass MODA_NODE = eINSTANCE.getModaNode();

		/**
		 * The meta object literal for the '<em><b>Analysis</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODA_NODE__ANALYSIS = eINSTANCE.getModaNode_Analysis();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.ModaRelationImpl <em>Moda Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.ModaRelationImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getModaRelation()
		 * @generated
		 */
		EClass MODA_RELATION = eINSTANCE.getModaRelation();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.OtherInterplayImpl <em>Other Interplay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.OtherInterplayImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getOtherInterplay()
		 * @generated
		 */
		EClass OTHER_INTERPLAY = eINSTANCE.getOtherInterplay();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OTHER_INTERPLAY__DATA = eINSTANCE.getOtherInterplay_Data();

		/**
		 * The meta object literal for the '<em><b>Sociotechnicalsystem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OTHER_INTERPLAY__SOCIOTECHNICALSYSTEM = eINSTANCE.getOtherInterplay_Sociotechnicalsystem();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.DataPurposeImpl <em>Data Purpose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.DataPurposeImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getDataPurpose()
		 * @generated
		 */
		EClass DATA_PURPOSE = eINSTANCE.getDataPurpose();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PURPOSE__DATA = eINSTANCE.getDataPurpose_Data();

		/**
		 * The meta object literal for the '<em><b>Software</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PURPOSE__SOFTWARE = eINSTANCE.getDataPurpose_Software();

		/**
		 * The meta object literal for the '<em><b>Data Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_PURPOSE__DATA_KIND = eINSTANCE.getDataPurpose_DataKind();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.EnactmentImpl <em>Enactment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.EnactmentImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getEnactment()
		 * @generated
		 */
		EClass ENACTMENT = eINSTANCE.getEnactment();

		/**
		 * The meta object literal for the '<em><b>Prescriptivemodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENACTMENT__PRESCRIPTIVEMODEL = eINSTANCE.getEnactment_Prescriptivemodel();

		/**
		 * The meta object literal for the '<em><b>Sociotechnicalsystem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENACTMENT__SOCIOTECHNICALSYSTEM = eINSTANCE.getEnactment_Sociotechnicalsystem();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.DeploymentImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Software</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__SOFTWARE = eINSTANCE.getDeployment_Software();

		/**
		 * The meta object literal for the '<em><b>Prescriptivemodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__PRESCRIPTIVEMODEL = eINSTANCE.getDeployment_Prescriptivemodel();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.PreparationImpl <em>Preparation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.PreparationImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getPreparation()
		 * @generated
		 */
		EClass PREPARATION = eINSTANCE.getPreparation();

		/**
		 * The meta object literal for the '<em><b>Descriptivemodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREPARATION__DESCRIPTIVEMODEL = eINSTANCE.getPreparation_Descriptivemodel();

		/**
		 * The meta object literal for the '<em><b>Predictivemodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREPARATION__PREDICTIVEMODEL = eINSTANCE.getPreparation_Predictivemodel();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.AnalysisImpl <em>Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.AnalysisImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getAnalysis()
		 * @generated
		 */
		EClass ANALYSIS = eINSTANCE.getAnalysis();

		/**
		 * The meta object literal for the '<em><b>Prescriptivemodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__PRESCRIPTIVEMODEL = eINSTANCE.getAnalysis_Prescriptivemodel();

		/**
		 * The meta object literal for the '<em><b>Modanode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANALYSIS__MODANODE = eINSTANCE.getAnalysis_Modanode();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.GenerationImpl <em>Generation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.GenerationImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getGeneration()
		 * @generated
		 */
		EClass GENERATION = eINSTANCE.getGeneration();

		/**
		 * The meta object literal for the '<em><b>Prescriptivemodel</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATION__PRESCRIPTIVEMODEL = eINSTANCE.getGeneration_Prescriptivemodel();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.NamedElementImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.impl.GeneralizationImpl
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__DATA = eINSTANCE.getGeneralization_Data();

		/**
		 * The meta object literal for the '<em><b>Modelrole</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERALIZATION__MODELROLE = eINSTANCE.getGeneralization_Modelrole();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.DataKind <em>Data Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.DataKind
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getDataKind()
		 * @generated
		 */
		EEnum DATA_KIND = eINSTANCE.getDataKind();

	}

} //Fig1Package
