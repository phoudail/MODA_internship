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
 *   <li>{@link internship.moda.fig1.Enactment#getPrescriptivemodel <em>Prescriptivemodel</em>}</li>
 *   <li>{@link internship.moda.fig1.Enactment#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getEnactment()
 * @model
 * @generated
 */
public interface Enactment extends ModaRelation {
	/**
	 * Returns the value of the '<em><b>Prescriptivemodel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.PrescriptiveModel#getEnactment <em>Enactment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriptivemodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriptivemodel</em>' reference.
	 * @see #setPrescriptivemodel(PrescriptiveModel)
	 * @see internship.moda.fig1.Fig1Package#getEnactment_Prescriptivemodel()
	 * @see internship.moda.fig1.PrescriptiveModel#getEnactment
	 * @model opposite="enactment"
	 * @generated
	 */
	PrescriptiveModel getPrescriptivemodel();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Enactment#getPrescriptivemodel <em>Prescriptivemodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescriptivemodel</em>' reference.
	 * @see #getPrescriptivemodel()
	 * @generated
	 */
	void setPrescriptivemodel(PrescriptiveModel value);

	/**
	 * Returns the value of the '<em><b>Sociotechnicalsystem</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.SocioTechnicalSystem#getEnactment <em>Enactment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sociotechnicalsystem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sociotechnicalsystem</em>' reference.
	 * @see #setSociotechnicalsystem(SocioTechnicalSystem)
	 * @see internship.moda.fig1.Fig1Package#getEnactment_Sociotechnicalsystem()
	 * @see internship.moda.fig1.SocioTechnicalSystem#getEnactment
	 * @model opposite="enactment"
	 * @generated
	 */
	SocioTechnicalSystem getSociotechnicalsystem();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Enactment#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sociotechnicalsystem</em>' reference.
	 * @see #getSociotechnicalsystem()
	 * @generated
	 */
	void setSociotechnicalsystem(SocioTechnicalSystem value);

} // Enactment
