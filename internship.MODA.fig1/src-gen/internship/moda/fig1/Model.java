/**
 */
package internship.moda.fig1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.Model#getIncomingPreparation <em>Incoming Preparation</em>}</li>
 *   <li>{@link internship.moda.fig1.Model#getIncomingGeneralization <em>Incoming Generalization</em>}</li>
 *   <li>{@link internship.moda.fig1.Model#getIncomingAnalysis <em>Incoming Analysis</em>}</li>
 *   <li>{@link internship.moda.fig1.Model#getOutgoingDeployment <em>Outgoing Deployment</em>}</li>
 *   <li>{@link internship.moda.fig1.Model#getOutgoingGeneration <em>Outgoing Generation</em>}</li>
 *   <li>{@link internship.moda.fig1.Model#getIncomingGeneration <em>Incoming Generation</em>}</li>
 *   <li>{@link internship.moda.fig1.Model#getOutgoingEnactment <em>Outgoing Enactment</em>}</li>
 *   <li>{@link internship.moda.fig1.Model#isPrescriptiveModel <em>Prescriptive Model</em>}</li>
 *   <li>{@link internship.moda.fig1.Model#isPredictiveModel <em>Predictive Model</em>}</li>
 *   <li>{@link internship.moda.fig1.Model#isDescriptiveModel <em>Descriptive Model</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getModel()
 * @model
 * @generated
 */
public interface Model extends ModaNode {
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
	 * @see internship.moda.fig1.Fig1Package#getModel_IncomingPreparation()
	 * @see internship.moda.fig1.Preparation#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	Preparation getIncomingPreparation();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Model#getIncomingPreparation <em>Incoming Preparation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Preparation</em>' reference.
	 * @see #getIncomingPreparation()
	 * @generated
	 */
	void setIncomingPreparation(Preparation value);

	/**
	 * Returns the value of the '<em><b>Incoming Generalization</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Generalization#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Generalization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Generalization</em>' reference.
	 * @see #setIncomingGeneralization(Generalization)
	 * @see internship.moda.fig1.Fig1Package#getModel_IncomingGeneralization()
	 * @see internship.moda.fig1.Generalization#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	Generalization getIncomingGeneralization();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Model#getIncomingGeneralization <em>Incoming Generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Generalization</em>' reference.
	 * @see #getIncomingGeneralization()
	 * @generated
	 */
	void setIncomingGeneralization(Generalization value);

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
	 * @see internship.moda.fig1.Fig1Package#getModel_IncomingAnalysis()
	 * @see internship.moda.fig1.Analysis#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	Analysis getIncomingAnalysis();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Model#getIncomingAnalysis <em>Incoming Analysis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Analysis</em>' reference.
	 * @see #getIncomingAnalysis()
	 * @generated
	 */
	void setIncomingAnalysis(Analysis value);

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
	 * @see internship.moda.fig1.Fig1Package#getModel_OutgoingDeployment()
	 * @see internship.moda.fig1.Deployment#getSource
	 * @model opposite="source"
	 * @generated
	 */
	Deployment getOutgoingDeployment();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Model#getOutgoingDeployment <em>Outgoing Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Deployment</em>' reference.
	 * @see #getOutgoingDeployment()
	 * @generated
	 */
	void setOutgoingDeployment(Deployment value);

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
	 * @see internship.moda.fig1.Fig1Package#getModel_OutgoingGeneration()
	 * @see internship.moda.fig1.Generation#getSource
	 * @model opposite="source"
	 * @generated
	 */
	Generation getOutgoingGeneration();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Model#getOutgoingGeneration <em>Outgoing Generation</em>}' reference.
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
	 * @see internship.moda.fig1.Fig1Package#getModel_IncomingGeneration()
	 * @see internship.moda.fig1.Generation#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	Generation getIncomingGeneration();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Model#getIncomingGeneration <em>Incoming Generation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Generation</em>' reference.
	 * @see #getIncomingGeneration()
	 * @generated
	 */
	void setIncomingGeneration(Generation value);

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
	 * @see internship.moda.fig1.Fig1Package#getModel_OutgoingEnactment()
	 * @see internship.moda.fig1.Enactment#getSource
	 * @model opposite="source"
	 * @generated
	 */
	Enactment getOutgoingEnactment();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Model#getOutgoingEnactment <em>Outgoing Enactment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Enactment</em>' reference.
	 * @see #getOutgoingEnactment()
	 * @generated
	 */
	void setOutgoingEnactment(Enactment value);

	/**
	 * Returns the value of the '<em><b>Prescriptive Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriptive Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriptive Model</em>' attribute.
	 * @see #setPrescriptiveModel(boolean)
	 * @see internship.moda.fig1.Fig1Package#getModel_PrescriptiveModel()
	 * @model
	 * @generated
	 */
	boolean isPrescriptiveModel();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Model#isPrescriptiveModel <em>Prescriptive Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescriptive Model</em>' attribute.
	 * @see #isPrescriptiveModel()
	 * @generated
	 */
	void setPrescriptiveModel(boolean value);

	/**
	 * Returns the value of the '<em><b>Predictive Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predictive Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predictive Model</em>' attribute.
	 * @see #setPredictiveModel(boolean)
	 * @see internship.moda.fig1.Fig1Package#getModel_PredictiveModel()
	 * @model
	 * @generated
	 */
	boolean isPredictiveModel();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Model#isPredictiveModel <em>Predictive Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predictive Model</em>' attribute.
	 * @see #isPredictiveModel()
	 * @generated
	 */
	void setPredictiveModel(boolean value);

	/**
	 * Returns the value of the '<em><b>Descriptive Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptive Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptive Model</em>' attribute.
	 * @see #setDescriptiveModel(boolean)
	 * @see internship.moda.fig1.Fig1Package#getModel_DescriptiveModel()
	 * @model
	 * @generated
	 */
	boolean isDescriptiveModel();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Model#isDescriptiveModel <em>Descriptive Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptive Model</em>' attribute.
	 * @see #isDescriptiveModel()
	 * @generated
	 */
	void setDescriptiveModel(boolean value);

} // Model
