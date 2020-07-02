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
 *   <li>{@link internship.moda.fig1.PredictiveModel#getIncomingPreparation <em>Incoming Preparation</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getPredictiveModel()
 * @model
 * @generated
 */
public interface PredictiveModel extends ModelRole {
	/**
	 * Returns the value of the '<em><b>Incoming Preparation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Preparation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Preparation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Preparation</em>' reference.
	 * @see #setIncomingPreparation(Preparation)
	 * @see internship.moda.fig1.Fig1Package#getPredictiveModel_IncomingPreparation()
	 * @see internship.moda.fig1.Preparation#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	Preparation getIncomingPreparation();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.PredictiveModel#getIncomingPreparation <em>Incoming Preparation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Preparation</em>' reference.
	 * @see #getIncomingPreparation()
	 * @generated
	 */
	void setIncomingPreparation(Preparation value);

} // PredictiveModel
