/**
 */
package internship.moda.fig1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptive Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.DescriptiveModel#getIncomingGeneralization <em>Incoming Generalization</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getDescriptiveModel()
 * @model
 * @generated
 */
public interface DescriptiveModel extends ModelRole {
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
	 * @see internship.moda.fig1.Fig1Package#getDescriptiveModel_IncomingGeneralization()
	 * @see internship.moda.fig1.Generalization#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	Generalization getIncomingGeneralization();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.DescriptiveModel#getIncomingGeneralization <em>Incoming Generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Generalization</em>' reference.
	 * @see #getIncomingGeneralization()
	 * @generated
	 */
	void setIncomingGeneralization(Generalization value);

} // DescriptiveModel
