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
 *   <li>{@link internship.moda.fig1.ModaNode#getAnalysis <em>Analysis</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getModaNode()
 * @model abstract="true"
 * @generated
 */
public interface ModaNode extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Analysis</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Analysis#getModanode <em>Modanode</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Analysis</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis</em>' reference.
	 * @see #setAnalysis(Analysis)
	 * @see internship.moda.fig1.Fig1Package#getModaNode_Analysis()
	 * @see internship.moda.fig1.Analysis#getModanode
	 * @model opposite="modanode"
	 * @generated
	 */
	Analysis getAnalysis();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.ModaNode#getAnalysis <em>Analysis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis</em>' reference.
	 * @see #getAnalysis()
	 * @generated
	 */
	void setAnalysis(Analysis value);

} // ModaNode
