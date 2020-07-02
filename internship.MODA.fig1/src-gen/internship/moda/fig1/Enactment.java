/**
 */
package internship.moda.fig1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enactment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.Enactment#getSource <em>Source</em>}</li>
 *   <li>{@link internship.moda.fig1.Enactment#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getEnactment()
 * @model
 * @generated
 */
public interface Enactment extends ModaRelation {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.PrescriptiveModel#getOutgoingEnactment <em>Outgoing Enactment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(PrescriptiveModel)
	 * @see internship.moda.fig1.Fig1Package#getEnactment_Source()
	 * @see internship.moda.fig1.PrescriptiveModel#getOutgoingEnactment
	 * @model opposite="outgoingEnactment"
	 * @generated
	 */
	PrescriptiveModel getSource();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Enactment#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PrescriptiveModel value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.SocioTechnicalSystem#getIncomingEnactment <em>Incoming Enactment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SocioTechnicalSystem)
	 * @see internship.moda.fig1.Fig1Package#getEnactment_Target()
	 * @see internship.moda.fig1.SocioTechnicalSystem#getIncomingEnactment
	 * @model opposite="incomingEnactment"
	 * @generated
	 */
	SocioTechnicalSystem getTarget();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Enactment#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SocioTechnicalSystem value);

} // Enactment
