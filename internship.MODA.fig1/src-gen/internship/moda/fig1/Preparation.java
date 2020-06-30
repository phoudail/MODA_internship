/**
 */
package internship.moda.fig1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preparation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.Preparation#getDescriptivemodel <em>Descriptivemodel</em>}</li>
 *   <li>{@link internship.moda.fig1.Preparation#getPredictivemodel <em>Predictivemodel</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getPreparation()
 * @model
 * @generated
 */
public interface Preparation extends ModaRelation {
	/**
	 * Returns the value of the '<em><b>Descriptivemodel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.DescriptiveModel#getPreparation <em>Preparation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptivemodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptivemodel</em>' reference.
	 * @see #setDescriptivemodel(DescriptiveModel)
	 * @see internship.moda.fig1.Fig1Package#getPreparation_Descriptivemodel()
	 * @see internship.moda.fig1.DescriptiveModel#getPreparation
	 * @model opposite="preparation"
	 * @generated
	 */
	DescriptiveModel getDescriptivemodel();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Preparation#getDescriptivemodel <em>Descriptivemodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptivemodel</em>' reference.
	 * @see #getDescriptivemodel()
	 * @generated
	 */
	void setDescriptivemodel(DescriptiveModel value);

	/**
	 * Returns the value of the '<em><b>Predictivemodel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.PredictiveModel#getPreparation <em>Preparation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predictivemodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predictivemodel</em>' reference.
	 * @see #setPredictivemodel(PredictiveModel)
	 * @see internship.moda.fig1.Fig1Package#getPreparation_Predictivemodel()
	 * @see internship.moda.fig1.PredictiveModel#getPreparation
	 * @model opposite="preparation"
	 * @generated
	 */
	PredictiveModel getPredictivemodel();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Preparation#getPredictivemodel <em>Predictivemodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predictivemodel</em>' reference.
	 * @see #getPredictivemodel()
	 * @generated
	 */
	void setPredictivemodel(PredictiveModel value);

} // Preparation
