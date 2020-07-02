/**
 */
package internship.moda.fig1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prescriptive Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.PrescriptiveModel#getOutgoingEnactment <em>Outgoing Enactment</em>}</li>
 *   <li>{@link internship.moda.fig1.PrescriptiveModel#getOutgoingDeployment <em>Outgoing Deployment</em>}</li>
 *   <li>{@link internship.moda.fig1.PrescriptiveModel#getIncomingAnalysis <em>Incoming Analysis</em>}</li>
 *   <li>{@link internship.moda.fig1.PrescriptiveModel#getOutgoingGeneration <em>Outgoing Generation</em>}</li>
 *   <li>{@link internship.moda.fig1.PrescriptiveModel#getIncomingGeneration <em>Incoming Generation</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getPrescriptiveModel()
 * @model
 * @generated
 */
public interface PrescriptiveModel extends ModelRole {
	/**
	 * Returns the value of the '<em><b>Outgoing Enactment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Enactment#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Enactment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Enactment</em>' reference.
	 * @see #setOutgoingEnactment(Enactment)
	 * @see internship.moda.fig1.Fig1Package#getPrescriptiveModel_OutgoingEnactment()
	 * @see internship.moda.fig1.Enactment#getSource
	 * @model opposite="source"
	 * @generated
	 */
	Enactment getOutgoingEnactment();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.PrescriptiveModel#getOutgoingEnactment <em>Outgoing Enactment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Enactment</em>' reference.
	 * @see #getOutgoingEnactment()
	 * @generated
	 */
	void setOutgoingEnactment(Enactment value);

	/**
	 * Returns the value of the '<em><b>Outgoing Deployment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Deployment#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Deployment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Deployment</em>' reference.
	 * @see #setOutgoingDeployment(Deployment)
	 * @see internship.moda.fig1.Fig1Package#getPrescriptiveModel_OutgoingDeployment()
	 * @see internship.moda.fig1.Deployment#getSource
	 * @model opposite="source"
	 * @generated
	 */
	Deployment getOutgoingDeployment();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.PrescriptiveModel#getOutgoingDeployment <em>Outgoing Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Deployment</em>' reference.
	 * @see #getOutgoingDeployment()
	 * @generated
	 */
	void setOutgoingDeployment(Deployment value);

	/**
	 * Returns the value of the '<em><b>Incoming Analysis</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Analysis#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Analysis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Analysis</em>' reference.
	 * @see #setIncomingAnalysis(Analysis)
	 * @see internship.moda.fig1.Fig1Package#getPrescriptiveModel_IncomingAnalysis()
	 * @see internship.moda.fig1.Analysis#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	Analysis getIncomingAnalysis();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.PrescriptiveModel#getIncomingAnalysis <em>Incoming Analysis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Analysis</em>' reference.
	 * @see #getIncomingAnalysis()
	 * @generated
	 */
	void setIncomingAnalysis(Analysis value);

	/**
	 * Returns the value of the '<em><b>Outgoing Generation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Generation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Generation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Generation</em>' reference.
	 * @see #setOutgoingGeneration(Generation)
	 * @see internship.moda.fig1.Fig1Package#getPrescriptiveModel_OutgoingGeneration()
	 * @see internship.moda.fig1.Generation#getSource
	 * @model opposite="source"
	 * @generated
	 */
	Generation getOutgoingGeneration();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.PrescriptiveModel#getOutgoingGeneration <em>Outgoing Generation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Generation</em>' reference.
	 * @see #getOutgoingGeneration()
	 * @generated
	 */
	void setOutgoingGeneration(Generation value);

	/**
	 * Returns the value of the '<em><b>Incoming Generation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Generation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Generation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Generation</em>' reference.
	 * @see #setIncomingGeneration(Generation)
	 * @see internship.moda.fig1.Fig1Package#getPrescriptiveModel_IncomingGeneration()
	 * @see internship.moda.fig1.Generation#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	Generation getIncomingGeneration();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.PrescriptiveModel#getIncomingGeneration <em>Incoming Generation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Generation</em>' reference.
	 * @see #getIncomingGeneration()
	 * @generated
	 */
	void setIncomingGeneration(Generation value);

} // PrescriptiveModel
