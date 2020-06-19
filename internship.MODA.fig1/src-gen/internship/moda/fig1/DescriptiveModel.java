/**
 */
package internship.moda.fig1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptive Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.DescriptiveModel#getPredictivemodel <em>Predictivemodel</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getDescriptiveModel()
 * @model
 * @generated
 */
public interface DescriptiveModel extends ModelRole {
	/**
	 * Returns the value of the '<em><b>Predictivemodel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.PredictiveModel#getDescriptivemodel <em>Descriptivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predictivemodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predictivemodel</em>' reference.
	 * @see #setPredictivemodel(PredictiveModel)
	 * @see internship.moda.fig1.Fig1Package#getDescriptiveModel_Predictivemodel()
	 * @see internship.moda.fig1.PredictiveModel#getDescriptivemodel
	 * @model opposite="descriptivemodel"
	 * @generated
	 */
	PredictiveModel getPredictivemodel();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.DescriptiveModel#getPredictivemodel <em>Predictivemodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predictivemodel</em>' reference.
	 * @see #getPredictivemodel()
	 * @generated
	 */
	void setPredictivemodel(PredictiveModel value);

} // DescriptiveModel
