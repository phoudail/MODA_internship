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
 *   <li>{@link internship.moda.fig1.Analysis#getPrescriptivemodel <em>Prescriptivemodel</em>}</li>
 *   <li>{@link internship.moda.fig1.Analysis#getModanode <em>Modanode</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getAnalysis()
 * @model
 * @generated
 */
public interface Analysis extends ModaRelation {
	/**
	 * Returns the value of the '<em><b>Prescriptivemodel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.PrescriptiveModel#getAnalysisResult <em>Analysis Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriptivemodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriptivemodel</em>' reference.
	 * @see #setPrescriptivemodel(PrescriptiveModel)
	 * @see internship.moda.fig1.Fig1Package#getAnalysis_Prescriptivemodel()
	 * @see internship.moda.fig1.PrescriptiveModel#getAnalysisResult
	 * @model opposite="analysisResult"
	 * @generated
	 */
	PrescriptiveModel getPrescriptivemodel();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Analysis#getPrescriptivemodel <em>Prescriptivemodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescriptivemodel</em>' reference.
	 * @see #getPrescriptivemodel()
	 * @generated
	 */
	void setPrescriptivemodel(PrescriptiveModel value);

	/**
	 * Returns the value of the '<em><b>Modanode</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.ModaNode#getAnalysis <em>Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modanode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modanode</em>' reference.
	 * @see #setModanode(ModaNode)
	 * @see internship.moda.fig1.Fig1Package#getAnalysis_Modanode()
	 * @see internship.moda.fig1.ModaNode#getAnalysis
	 * @model opposite="analysis"
	 * @generated
	 */
	ModaNode getModanode();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Analysis#getModanode <em>Modanode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modanode</em>' reference.
	 * @see #getModanode()
	 * @generated
	 */
	void setModanode(ModaNode value);

} // Analysis
