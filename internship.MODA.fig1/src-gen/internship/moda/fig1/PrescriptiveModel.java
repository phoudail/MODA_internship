/**
 */
package internship.moda.fig1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prescriptive Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.PrescriptiveModel#getEnactment <em>Enactment</em>}</li>
 *   <li>{@link internship.moda.fig1.PrescriptiveModel#getRunningSoftware <em>Running Software</em>}</li>
 *   <li>{@link internship.moda.fig1.PrescriptiveModel#getAnalysisResult <em>Analysis Result</em>}</li>
 *   <li>{@link internship.moda.fig1.PrescriptiveModel#getGeneration <em>Generation</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getPrescriptiveModel()
 * @model
 * @generated
 */
public interface PrescriptiveModel extends ModelRole {
	/**
	 * Returns the value of the '<em><b>Enactment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Enactment#getPrescriptivemodel <em>Prescriptivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enactment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enactment</em>' reference.
	 * @see #setEnactment(Enactment)
	 * @see internship.moda.fig1.Fig1Package#getPrescriptiveModel_Enactment()
	 * @see internship.moda.fig1.Enactment#getPrescriptivemodel
	 * @model opposite="prescriptivemodel"
	 * @generated
	 */
	Enactment getEnactment();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.PrescriptiveModel#getEnactment <em>Enactment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enactment</em>' reference.
	 * @see #getEnactment()
	 * @generated
	 */
	void setEnactment(Enactment value);

	/**
	 * Returns the value of the '<em><b>Running Software</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Deployment#getPrescriptivemodel <em>Prescriptivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Running Software</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Running Software</em>' reference.
	 * @see #setRunningSoftware(Deployment)
	 * @see internship.moda.fig1.Fig1Package#getPrescriptiveModel_RunningSoftware()
	 * @see internship.moda.fig1.Deployment#getPrescriptivemodel
	 * @model opposite="prescriptivemodel"
	 * @generated
	 */
	Deployment getRunningSoftware();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.PrescriptiveModel#getRunningSoftware <em>Running Software</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running Software</em>' reference.
	 * @see #getRunningSoftware()
	 * @generated
	 */
	void setRunningSoftware(Deployment value);

	/**
	 * Returns the value of the '<em><b>Analysis Result</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Analysis#getPrescriptivemodel <em>Prescriptivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Result</em>' reference.
	 * @see #setAnalysisResult(Analysis)
	 * @see internship.moda.fig1.Fig1Package#getPrescriptiveModel_AnalysisResult()
	 * @see internship.moda.fig1.Analysis#getPrescriptivemodel
	 * @model opposite="prescriptivemodel"
	 * @generated
	 */
	Analysis getAnalysisResult();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.PrescriptiveModel#getAnalysisResult <em>Analysis Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Result</em>' reference.
	 * @see #getAnalysisResult()
	 * @generated
	 */
	void setAnalysisResult(Analysis value);

	/**
	 * Returns the value of the '<em><b>Generation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Generation#getPrescriptivemodel <em>Prescriptivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation</em>' reference.
	 * @see #setGeneration(Generation)
	 * @see internship.moda.fig1.Fig1Package#getPrescriptiveModel_Generation()
	 * @see internship.moda.fig1.Generation#getPrescriptivemodel
	 * @model opposite="prescriptivemodel"
	 * @generated
	 */
	Generation getGeneration();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.PrescriptiveModel#getGeneration <em>Generation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation</em>' reference.
	 * @see #getGeneration()
	 * @generated
	 */
	void setGeneration(Generation value);

} // PrescriptiveModel
