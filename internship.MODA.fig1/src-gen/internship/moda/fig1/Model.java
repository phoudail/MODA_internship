/**
 */
package internship.moda.fig1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.Model#getModelrole <em>Modelrole</em>}</li>
 *   <li>{@link internship.moda.fig1.Model#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Modelrole</b></em>' reference list.
	 * The list contents are of type {@link internship.moda.fig1.ModelRole}.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.ModelRole#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelrole</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelrole</em>' reference list.
	 * @see internship.moda.fig1.Fig1Package#getModel_Modelrole()
	 * @see internship.moda.fig1.ModelRole#getModel
	 * @model opposite="model"
	 * @generated
	 */
	EList<ModelRole> getModelrole();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see internship.moda.fig1.Fig1Package#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Model
