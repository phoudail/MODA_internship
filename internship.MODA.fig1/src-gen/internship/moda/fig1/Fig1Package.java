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
	 * The feature id for the '<em><b>Sociotechnicalsystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA__SOCIOTECHNICALSYSTEM = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA__DATA = 1;

	/**
	 * The feature id for the '<em><b>Software</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA__SOFTWARE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA__NAME = 3;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA__MODEL = 4;

	/**
	 * The feature id for the '<em><b>Modelrole</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA__MODELROLE = 5;

	/**
	 * The number of structural features of the '<em>MODA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>MODA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODA_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Software</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SOFTWARE = 2;

	/**
	 * The feature id for the '<em><b>Sociotechnicalsystem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__SOCIOTECHNICALSYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Modelrole</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__MODELROLE = 4;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROLE__MODEL = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROLE__DATA = 2;

	/**
	 * The number of structural features of the '<em>Model Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Model Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ROLE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_MODEL__NAME = MODEL_ROLE__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_MODEL__MODEL = MODEL_ROLE__MODEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_MODEL__DATA = MODEL_ROLE__DATA;

	/**
	 * The feature id for the '<em><b>Predictivemodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_MODEL__PREDICTIVEMODEL = MODEL_ROLE_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_MODEL__MODEL = MODEL_ROLE__MODEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_MODEL__DATA = MODEL_ROLE__DATA;

	/**
	 * The feature id for the '<em><b>Prescriptivemodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_MODEL__PRESCRIPTIVEMODEL = MODEL_ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Descriptivemodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_MODEL__DESCRIPTIVEMODEL = MODEL_ROLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Predictive Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICTIVE_MODEL_FEATURE_COUNT = MODEL_ROLE_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL__MODEL = MODEL_ROLE__MODEL;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL__DATA = MODEL_ROLE__DATA;

	/**
	 * The feature id for the '<em><b>Software</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL__SOFTWARE = MODEL_ROLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sociotechnicalsystem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL__SOCIOTECHNICALSYSTEM = MODEL_ROLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Predictivemodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL__PREDICTIVEMODEL = MODEL_ROLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Prescriptivemodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODEL = MODEL_ROLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Prescriptivemodele Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODELE_OPPOSITE = MODEL_ROLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Prescriptive Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL_FEATURE_COUNT = MODEL_ROLE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Prescriptive Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTIVE_MODEL_OPERATION_COUNT = MODEL_ROLE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__STATE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__DATA = 2;

	/**
	 * The feature id for the '<em><b>Prescriptivemodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE__PRESCRIPTIVEMODEL = 3;

	/**
	 * The number of structural features of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Software</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFTWARE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIO_TECHNICAL_SYSTEM__DATA = 0;

	/**
	 * The feature id for the '<em><b>Prescriptivemodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIO_TECHNICAL_SYSTEM__PRESCRIPTIVEMODEL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIO_TECHNICAL_SYSTEM__NAME = 2;

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
	 * The meta object id for the '{@link internship.moda.fig1.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.impl.ModelImpl
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 8;

	/**
	 * The feature id for the '<em><b>Modelrole</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__MODELROLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link internship.moda.fig1.DataTypes <em>Data Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see internship.moda.fig1.DataTypes
	 * @see internship.moda.fig1.impl.Fig1PackageImpl#getDataTypes()
	 * @generated
	 */
	int DATA_TYPES = 9;

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
	 * Returns the meta object for the attribute '{@link internship.moda.fig1.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see internship.moda.fig1.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.Data#getSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Software</em>'.
	 * @see internship.moda.fig1.Data#getSoftware()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Software();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.Data#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sociotechnicalsystem</em>'.
	 * @see internship.moda.fig1.Data#getSociotechnicalsystem()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Sociotechnicalsystem();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.Data#getModelrole <em>Modelrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Modelrole</em>'.
	 * @see internship.moda.fig1.Data#getModelrole()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Modelrole();

	/**
	 * Returns the meta object for the attribute '{@link internship.moda.fig1.Data#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see internship.moda.fig1.Data#getDataType()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_DataType();

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
	 * Returns the meta object for the attribute '{@link internship.moda.fig1.ModelRole#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see internship.moda.fig1.ModelRole#getName()
	 * @see #getModelRole()
	 * @generated
	 */
	EAttribute getModelRole_Name();

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
	 * Returns the meta object for the reference list '{@link internship.moda.fig1.ModelRole#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data</em>'.
	 * @see internship.moda.fig1.ModelRole#getData()
	 * @see #getModelRole()
	 * @generated
	 */
	EReference getModelRole_Data();

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
	 * Returns the meta object for the reference '{@link internship.moda.fig1.DescriptiveModel#getPredictivemodel <em>Predictivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predictivemodel</em>'.
	 * @see internship.moda.fig1.DescriptiveModel#getPredictivemodel()
	 * @see #getDescriptiveModel()
	 * @generated
	 */
	EReference getDescriptiveModel_Predictivemodel();

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
	 * Returns the meta object for the reference '{@link internship.moda.fig1.PredictiveModel#getPrescriptivemodel <em>Prescriptivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prescriptivemodel</em>'.
	 * @see internship.moda.fig1.PredictiveModel#getPrescriptivemodel()
	 * @see #getPredictiveModel()
	 * @generated
	 */
	EReference getPredictiveModel_Prescriptivemodel();

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
	 * Returns the meta object for the reference '{@link internship.moda.fig1.PrescriptiveModel#getSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Software</em>'.
	 * @see internship.moda.fig1.PrescriptiveModel#getSoftware()
	 * @see #getPrescriptiveModel()
	 * @generated
	 */
	EReference getPrescriptiveModel_Software();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.PrescriptiveModel#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sociotechnicalsystem</em>'.
	 * @see internship.moda.fig1.PrescriptiveModel#getSociotechnicalsystem()
	 * @see #getPrescriptiveModel()
	 * @generated
	 */
	EReference getPrescriptiveModel_Sociotechnicalsystem();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.PrescriptiveModel#getPredictivemodel <em>Predictivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Predictivemodel</em>'.
	 * @see internship.moda.fig1.PrescriptiveModel#getPredictivemodel()
	 * @see #getPrescriptiveModel()
	 * @generated
	 */
	EReference getPrescriptiveModel_Predictivemodel();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.PrescriptiveModel#getPrescriptivemodel <em>Prescriptivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prescriptivemodel</em>'.
	 * @see internship.moda.fig1.PrescriptiveModel#getPrescriptivemodel()
	 * @see #getPrescriptiveModel()
	 * @generated
	 */
	EReference getPrescriptiveModel_Prescriptivemodel();

	/**
	 * Returns the meta object for the reference '{@link internship.moda.fig1.PrescriptiveModel#getPrescriptivemodeleOpposite <em>Prescriptivemodele Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Prescriptivemodele Opposite</em>'.
	 * @see internship.moda.fig1.PrescriptiveModel#getPrescriptivemodeleOpposite()
	 * @see #getPrescriptiveModel()
	 * @generated
	 */
	EReference getPrescriptiveModel_PrescriptivemodeleOpposite();

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
	 * Returns the meta object for the attribute '{@link internship.moda.fig1.Software#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see internship.moda.fig1.Software#getName()
	 * @see #getSoftware()
	 * @generated
	 */
	EAttribute getSoftware_Name();

	/**
	 * Returns the meta object for the reference list '{@link internship.moda.fig1.Software#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data</em>'.
	 * @see internship.moda.fig1.Software#getData()
	 * @see #getSoftware()
	 * @generated
	 */
	EReference getSoftware_Data();

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
	 * Returns the meta object for class '{@link internship.moda.fig1.SocioTechnicalSystem <em>Socio Technical System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Socio Technical System</em>'.
	 * @see internship.moda.fig1.SocioTechnicalSystem
	 * @generated
	 */
	EClass getSocioTechnicalSystem();

	/**
	 * Returns the meta object for the reference list '{@link internship.moda.fig1.SocioTechnicalSystem#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data</em>'.
	 * @see internship.moda.fig1.SocioTechnicalSystem#getData()
	 * @see #getSocioTechnicalSystem()
	 * @generated
	 */
	EReference getSocioTechnicalSystem_Data();

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
	 * Returns the meta object for the attribute '{@link internship.moda.fig1.SocioTechnicalSystem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see internship.moda.fig1.SocioTechnicalSystem#getName()
	 * @see #getSocioTechnicalSystem()
	 * @generated
	 */
	EAttribute getSocioTechnicalSystem_Name();

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
	 * Returns the meta object for the containment reference '{@link internship.moda.fig1.MODA#getSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software</em>'.
	 * @see internship.moda.fig1.MODA#getSoftware()
	 * @see #getMODA()
	 * @generated
	 */
	EReference getMODA_Software();

	/**
	 * Returns the meta object for the attribute '{@link internship.moda.fig1.MODA#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see internship.moda.fig1.MODA#getName()
	 * @see #getMODA()
	 * @generated
	 */
	EAttribute getMODA_Name();

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
	 * Returns the meta object for enum '{@link internship.moda.fig1.DataTypes <em>Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Types</em>'.
	 * @see internship.moda.fig1.DataTypes
	 * @generated
	 */
	EEnum getDataTypes();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NAME = eINSTANCE.getData_Name();

		/**
		 * The meta object literal for the '<em><b>Software</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__SOFTWARE = eINSTANCE.getData_Software();

		/**
		 * The meta object literal for the '<em><b>Sociotechnicalsystem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__SOCIOTECHNICALSYSTEM = eINSTANCE.getData_Sociotechnicalsystem();

		/**
		 * The meta object literal for the '<em><b>Modelrole</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__MODELROLE = eINSTANCE.getData_Modelrole();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__DATA_TYPE = eINSTANCE.getData_DataType();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_ROLE__NAME = eINSTANCE.getModelRole_Name();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ROLE__MODEL = eINSTANCE.getModelRole_Model();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ROLE__DATA = eINSTANCE.getModelRole_Data();

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
		 * The meta object literal for the '<em><b>Predictivemodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTIVE_MODEL__PREDICTIVEMODEL = eINSTANCE.getDescriptiveModel_Predictivemodel();

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
		 * The meta object literal for the '<em><b>Prescriptivemodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREDICTIVE_MODEL__PRESCRIPTIVEMODEL = eINSTANCE.getPredictiveModel_Prescriptivemodel();

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
		 * The meta object literal for the '<em><b>Software</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIPTIVE_MODEL__SOFTWARE = eINSTANCE.getPrescriptiveModel_Software();

		/**
		 * The meta object literal for the '<em><b>Sociotechnicalsystem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIPTIVE_MODEL__SOCIOTECHNICALSYSTEM = eINSTANCE.getPrescriptiveModel_Sociotechnicalsystem();

		/**
		 * The meta object literal for the '<em><b>Predictivemodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIPTIVE_MODEL__PREDICTIVEMODEL = eINSTANCE.getPrescriptiveModel_Predictivemodel();

		/**
		 * The meta object literal for the '<em><b>Prescriptivemodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODEL = eINSTANCE.getPrescriptiveModel_Prescriptivemodel();

		/**
		 * The meta object literal for the '<em><b>Prescriptivemodele Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODELE_OPPOSITE = eINSTANCE
				.getPrescriptiveModel_PrescriptivemodeleOpposite();

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
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE__STATE = eINSTANCE.getSoftware_State();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFTWARE__NAME = eINSTANCE.getSoftware_Name();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__DATA = eINSTANCE.getSoftware_Data();

		/**
		 * The meta object literal for the '<em><b>Prescriptivemodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOFTWARE__PRESCRIPTIVEMODEL = eINSTANCE.getSoftware_Prescriptivemodel();

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
		 * The meta object literal for the '<em><b>Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIO_TECHNICAL_SYSTEM__DATA = eINSTANCE.getSocioTechnicalSystem_Data();

		/**
		 * The meta object literal for the '<em><b>Prescriptivemodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOCIO_TECHNICAL_SYSTEM__PRESCRIPTIVEMODEL = eINSTANCE.getSocioTechnicalSystem_Prescriptivemodel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOCIO_TECHNICAL_SYSTEM__NAME = eINSTANCE.getSocioTechnicalSystem_Name();

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
		 * The meta object literal for the '<em><b>Software</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODA__SOFTWARE = eINSTANCE.getMODA_Software();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODA__NAME = eINSTANCE.getMODA_Name();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '{@link internship.moda.fig1.DataTypes <em>Data Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see internship.moda.fig1.DataTypes
		 * @see internship.moda.fig1.impl.Fig1PackageImpl#getDataTypes()
		 * @generated
		 */
		EEnum DATA_TYPES = eINSTANCE.getDataTypes();

	}

} //Fig1Package
