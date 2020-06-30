/**
 */
package internship.moda.fig1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.Generalization#getData <em>Data</em>}</li>
 *   <li>{@link internship.moda.fig1.Generalization#getModelrole <em>Modelrole</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends ModaRelation {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference list.
	 * The list contents are of type {@link internship.moda.fig1.Data}.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Data#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference list.
	 * @see internship.moda.fig1.Fig1Package#getGeneralization_Data()
	 * @see internship.moda.fig1.Data#getGeneralization
	 * @model opposite="generalization"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Modelrole</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.ModelRole#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelrole</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelrole</em>' reference.
	 * @see #setModelrole(ModelRole)
	 * @see internship.moda.fig1.Fig1Package#getGeneralization_Modelrole()
	 * @see internship.moda.fig1.ModelRole#getGeneralization
	 * @model opposite="generalization"
	 * @generated
	 */
	ModelRole getModelrole();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Generalization#getModelrole <em>Modelrole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modelrole</em>' reference.
	 * @see #getModelrole()
	 * @generated
	 */
	void setModelrole(ModelRole value);

} // Generalization
