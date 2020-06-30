/**
 */
package internship.moda.fig1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.ModelRole#getModel <em>Model</em>}</li>
 *   <li>{@link internship.moda.fig1.ModelRole#getGeneralization <em>Generalization</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getModelRole()
 * @model abstract="true"
 * @generated
 */
public interface ModelRole extends ModaNode {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Model#getModelrole <em>Modelrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(Model)
	 * @see internship.moda.fig1.Fig1Package#getModelRole_Model()
	 * @see internship.moda.fig1.Model#getModelrole
	 * @model opposite="modelrole"
	 * @generated
	 */
	Model getModel();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.ModelRole#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(Model value);

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Generalization#getModelrole <em>Modelrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization</em>' reference.
	 * @see #setGeneralization(Generalization)
	 * @see internship.moda.fig1.Fig1Package#getModelRole_Generalization()
	 * @see internship.moda.fig1.Generalization#getModelrole
	 * @model opposite="modelrole"
	 * @generated
	 */
	Generalization getGeneralization();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.ModelRole#getGeneralization <em>Generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generalization</em>' reference.
	 * @see #getGeneralization()
	 * @generated
	 */
	void setGeneralization(Generalization value);

} // ModelRole
