/**
 */
package internship.moda.fig1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predictive Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.PredictiveModel#getPrescriptivemodel <em>Prescriptivemodel</em>}</li>
 *   <li>{@link internship.moda.fig1.PredictiveModel#getDescriptivemodel <em>Descriptivemodel</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getPredictiveModel()
 * @model
 * @generated
 */
public interface PredictiveModel extends ModelRole {
	/**
	 * Returns the value of the '<em><b>Prescriptivemodel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.PrescriptiveModel#getPredictivemodel <em>Predictivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriptivemodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriptivemodel</em>' reference.
	 * @see #setPrescriptivemodel(PrescriptiveModel)
	 * @see internship.moda.fig1.Fig1Package#getPredictiveModel_Prescriptivemodel()
	 * @see internship.moda.fig1.PrescriptiveModel#getPredictivemodel
	 * @model opposite="predictivemodel"
	 * @generated
	 */
	PrescriptiveModel getPrescriptivemodel();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.PredictiveModel#getPrescriptivemodel <em>Prescriptivemodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescriptivemodel</em>' reference.
	 * @see #getPrescriptivemodel()
	 * @generated
	 */
	void setPrescriptivemodel(PrescriptiveModel value);

	/**
	 * Returns the value of the '<em><b>Descriptivemodel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.DescriptiveModel#getPredictivemodel <em>Predictivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptivemodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptivemodel</em>' reference.
	 * @see #setDescriptivemodel(DescriptiveModel)
	 * @see internship.moda.fig1.Fig1Package#getPredictiveModel_Descriptivemodel()
	 * @see internship.moda.fig1.DescriptiveModel#getPredictivemodel
	 * @model opposite="predictivemodel"
	 * @generated
	 */
	DescriptiveModel getDescriptivemodel();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.PredictiveModel#getDescriptivemodel <em>Descriptivemodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptivemodel</em>' reference.
	 * @see #getDescriptivemodel()
	 * @generated
	 */
	void setDescriptivemodel(DescriptiveModel value);

} // PredictiveModel
