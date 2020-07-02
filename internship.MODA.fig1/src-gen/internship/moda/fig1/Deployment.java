/**
 */
package internship.moda.fig1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.Deployment#getTarget <em>Target</em>}</li>
 *   <li>{@link internship.moda.fig1.Deployment#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends ModaRelation {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Software#getIincomingDeployment <em>Iincoming Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Software)
	 * @see internship.moda.fig1.Fig1Package#getDeployment_Target()
	 * @see internship.moda.fig1.Software#getIincomingDeployment
	 * @model opposite="iincomingDeployment"
	 * @generated
	 */
	Software getTarget();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Deployment#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Software value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.PrescriptiveModel#getOutgoingDeployment <em>Outgoing Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(PrescriptiveModel)
	 * @see internship.moda.fig1.Fig1Package#getDeployment_Source()
	 * @see internship.moda.fig1.PrescriptiveModel#getOutgoingDeployment
	 * @model opposite="outgoingDeployment"
	 * @generated
	 */
	PrescriptiveModel getSource();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Deployment#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(PrescriptiveModel value);

} // Deployment
