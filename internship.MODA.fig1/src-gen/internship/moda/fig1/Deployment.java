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
 *   <li>{@link internship.moda.fig1.Deployment#getSoftware <em>Software</em>}</li>
 *   <li>{@link internship.moda.fig1.Deployment#getPrescriptivemodel <em>Prescriptivemodel</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getDeployment()
 * @model
 * @generated
 */
public interface Deployment extends ModaRelation {
	/**
	 * Returns the value of the '<em><b>Software</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Software#getDeployedModel <em>Deployed Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software</em>' reference.
	 * @see #setSoftware(Software)
	 * @see internship.moda.fig1.Fig1Package#getDeployment_Software()
	 * @see internship.moda.fig1.Software#getDeployedModel
	 * @model opposite="deployedModel"
	 * @generated
	 */
	Software getSoftware();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Deployment#getSoftware <em>Software</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software</em>' reference.
	 * @see #getSoftware()
	 * @generated
	 */
	void setSoftware(Software value);

	/**
	 * Returns the value of the '<em><b>Prescriptivemodel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.PrescriptiveModel#getRunningSoftware <em>Running Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriptivemodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriptivemodel</em>' reference.
	 * @see #setPrescriptivemodel(PrescriptiveModel)
	 * @see internship.moda.fig1.Fig1Package#getDeployment_Prescriptivemodel()
	 * @see internship.moda.fig1.PrescriptiveModel#getRunningSoftware
	 * @model opposite="runningSoftware"
	 * @generated
	 */
	PrescriptiveModel getPrescriptivemodel();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Deployment#getPrescriptivemodel <em>Prescriptivemodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescriptivemodel</em>' reference.
	 * @see #getPrescriptivemodel()
	 * @generated
	 */
	void setPrescriptivemodel(PrescriptiveModel value);

} // Deployment
