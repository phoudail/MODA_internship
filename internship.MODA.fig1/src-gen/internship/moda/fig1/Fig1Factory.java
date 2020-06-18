/**
 */
package internship.moda.fig1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see internship.moda.fig1.Fig1Package
 * @generated
 */
public interface Fig1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Fig1Factory eINSTANCE = internship.moda.fig1.impl.Fig1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Input Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Data</em>'.
	 * @generated
	 */
	InputData createInputData();

	/**
	 * Returns a new object of class '<em>Output Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Data</em>'.
	 * @generated
	 */
	OutputData createOutputData();

	/**
	 * Returns a new object of class '<em>Measured Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measured Data</em>'.
	 * @generated
	 */
	MeasuredData createMeasuredData();

	/**
	 * Returns a new object of class '<em>External Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Data</em>'.
	 * @generated
	 */
	ExternalData createExternalData();

	/**
	 * Returns a new object of class '<em>Descriptive Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Descriptive Model</em>'.
	 * @generated
	 */
	DescriptiveModel createDescriptiveModel();

	/**
	 * Returns a new object of class '<em>Predictive Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predictive Model</em>'.
	 * @generated
	 */
	PredictiveModel createPredictiveModel();

	/**
	 * Returns a new object of class '<em>Prescriptive Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prescriptive Model</em>'.
	 * @generated
	 */
	PrescriptiveModel createPrescriptiveModel();

	/**
	 * Returns a new object of class '<em>Software</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Software</em>'.
	 * @generated
	 */
	Software createSoftware();

	/**
	 * Returns a new object of class '<em>Socio Technical System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Socio Technical System</em>'.
	 * @generated
	 */
	SocioTechnicalSystem createSocioTechnicalSystem();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Fig1Package getFig1Package();

} //Fig1Factory