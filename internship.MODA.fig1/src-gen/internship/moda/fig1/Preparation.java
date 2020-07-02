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
 *   <li>{@link internship.moda.fig1.Preparation#getTarget <em>Target</em>}</li>
 *   <li>{@link internship.moda.fig1.Preparation#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getPreparation()
 * @model
 * @generated
 */
public interface Preparation extends ModaRelation {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.PredictiveModel#getIncomingPreparation <em>Incoming Preparation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(PredictiveModel)
	 * @see internship.moda.fig1.Fig1Package#getPreparation_Target()
	 * @see internship.moda.fig1.PredictiveModel#getIncomingPreparation
	 * @model opposite="incomingPreparation"
	 * @generated
	 */
	PredictiveModel getTarget();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Preparation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(PredictiveModel value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.ModaNode#getOutgoingPreparation <em>Outgoing Preparation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ModaNode)
	 * @see internship.moda.fig1.Fig1Package#getPreparation_Source()
	 * @see internship.moda.fig1.ModaNode#getOutgoingPreparation
	 * @model opposite="outgoingPreparation"
	 * @generated
	 */
	ModaNode getSource();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Preparation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ModaNode value);

} // Preparation
