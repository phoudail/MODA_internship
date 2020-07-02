/**
 */
package internship.moda.fig1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.Generation#getSource <em>Source</em>}</li>
 *   <li>{@link internship.moda.fig1.Generation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getGeneration()
 * @model
 * @generated
 */
public interface Generation extends ModaRelation {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.PrescriptiveModel#getOutgoingGeneration <em>Outgoing Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(PrescriptiveModel)
	 * @see internship.moda.fig1.Fig1Package#getGeneration_Source()
	 * @see internship.moda.fig1.PrescriptiveModel#getOutgoingGeneration
	 * @model opposite="outgoingGeneration"
	 * @generated
	 */
	PrescriptiveModel getSource();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Generation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PrescriptiveModel value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.PrescriptiveModel#getIncomingGeneration <em>Incoming Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(PrescriptiveModel)
	 * @see internship.moda.fig1.Fig1Package#getGeneration_Target()
	 * @see internship.moda.fig1.PrescriptiveModel#getIncomingGeneration
	 * @model opposite="incomingGeneration"
	 * @generated
	 */
	PrescriptiveModel getTarget();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Generation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(PrescriptiveModel value);

} // Generation
