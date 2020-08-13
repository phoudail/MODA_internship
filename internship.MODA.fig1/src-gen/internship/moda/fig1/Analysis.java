/**
 */
package internship.moda.fig1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.Analysis#getTarget <em>Target</em>}</li>
 *   <li>{@link internship.moda.fig1.Analysis#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getAnalysis()
 * @model
 * @generated
 */
public interface Analysis extends ModaRelation {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Model#getIncomingAnalysis <em>Incoming Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Model)
	 * @see internship.moda.fig1.Fig1Package#getAnalysis_Target()
	 * @see internship.moda.fig1.Model#getIncomingAnalysis
	 * @model opposite="incomingAnalysis"
	 * @generated
	 */
	Model getTarget();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Analysis#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Model value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.ModaNode#getOutgoingAnalysis <em>Outgoing Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ModaNode)
	 * @see internship.moda.fig1.Fig1Package#getAnalysis_Source()
	 * @see internship.moda.fig1.ModaNode#getOutgoingAnalysis
	 * @model opposite="outgoingAnalysis"
	 * @generated
	 */
	ModaNode getSource();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Analysis#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ModaNode value);

} // Analysis
