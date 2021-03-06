/**
 */
package internship.moda.fig1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Socio Technical System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.SocioTechnicalSystem#getSoftware <em>Software</em>}</li>
 *   <li>{@link internship.moda.fig1.SocioTechnicalSystem#getOtherinterplay <em>Otherinterplay</em>}</li>
 *   <li>{@link internship.moda.fig1.SocioTechnicalSystem#getIncomingEnactment <em>Incoming Enactment</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getSocioTechnicalSystem()
 * @model
 * @generated
 */
public interface SocioTechnicalSystem extends ModaNode {
	/**
	 * Returns the value of the '<em><b>Software</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software</em>' containment reference.
	 * @see #setSoftware(Software)
	 * @see internship.moda.fig1.Fig1Package#getSocioTechnicalSystem_Software()
	 * @model containment="true"
	 * @generated
	 */
	Software getSoftware();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.SocioTechnicalSystem#getSoftware <em>Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software</em>' containment reference.
	 * @see #getSoftware()
	 * @generated
	 */
	void setSoftware(Software value);

	/**
	 * Returns the value of the '<em><b>Otherinterplay</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.OtherInterplay#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Otherinterplay</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otherinterplay</em>' reference.
	 * @see #setOtherinterplay(OtherInterplay)
	 * @see internship.moda.fig1.Fig1Package#getSocioTechnicalSystem_Otherinterplay()
	 * @see internship.moda.fig1.OtherInterplay#getSociotechnicalsystem
	 * @model opposite="sociotechnicalsystem"
	 * @generated
	 */
	OtherInterplay getOtherinterplay();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.SocioTechnicalSystem#getOtherinterplay <em>Otherinterplay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Otherinterplay</em>' reference.
	 * @see #getOtherinterplay()
	 * @generated
	 */
	void setOtherinterplay(OtherInterplay value);

	/**
	 * Returns the value of the '<em><b>Incoming Enactment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Enactment#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Enactment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Enactment</em>' reference.
	 * @see #setIncomingEnactment(Enactment)
	 * @see internship.moda.fig1.Fig1Package#getSocioTechnicalSystem_IncomingEnactment()
	 * @see internship.moda.fig1.Enactment#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	Enactment getIncomingEnactment();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.SocioTechnicalSystem#getIncomingEnactment <em>Incoming Enactment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Enactment</em>' reference.
	 * @see #getIncomingEnactment()
	 * @generated
	 */
	void setIncomingEnactment(Enactment value);

} // SocioTechnicalSystem
