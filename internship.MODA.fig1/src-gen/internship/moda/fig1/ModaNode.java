/**
 */
package internship.moda.fig1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Moda Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.ModaNode#getOutgoingAnalysis <em>Outgoing Analysis</em>}</li>
 *   <li>{@link internship.moda.fig1.ModaNode#getOutgoingPreparation <em>Outgoing Preparation</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getModaNode()
 * @model abstract="true"
 * @generated
 */
public interface ModaNode extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing Analysis</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Analysis#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Analysis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Analysis</em>' reference.
	 * @see #setOutgoingAnalysis(Analysis)
	 * @see internship.moda.fig1.Fig1Package#getModaNode_OutgoingAnalysis()
	 * @see internship.moda.fig1.Analysis#getSource
	 * @model opposite="source"
	 * @generated
	 */
	Analysis getOutgoingAnalysis();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.ModaNode#getOutgoingAnalysis <em>Outgoing Analysis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Analysis</em>' reference.
	 * @see #getOutgoingAnalysis()
	 * @generated
	 */
	void setOutgoingAnalysis(Analysis value);

	/**
	 * Returns the value of the '<em><b>Outgoing Preparation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Preparation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Preparation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Preparation</em>' reference.
	 * @see #setOutgoingPreparation(Preparation)
	 * @see internship.moda.fig1.Fig1Package#getModaNode_OutgoingPreparation()
	 * @see internship.moda.fig1.Preparation#getSource
	 * @model opposite="source"
	 * @generated
	 */
	Preparation getOutgoingPreparation();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.ModaNode#getOutgoingPreparation <em>Outgoing Preparation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outgoing Preparation</em>' reference.
	 * @see #getOutgoingPreparation()
	 * @generated
	 */
	void setOutgoingPreparation(Preparation value);

} // ModaNode
