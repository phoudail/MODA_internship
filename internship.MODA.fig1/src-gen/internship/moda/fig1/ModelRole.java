/**
 */
package internship.moda.fig1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.ModelRole#getName <em>Name</em>}</li>
 *   <li>{@link internship.moda.fig1.ModelRole#getModel <em>Model</em>}</li>
 *   <li>{@link internship.moda.fig1.ModelRole#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getModelRole()
 * @model abstract="true"
 * @generated
 */
public interface ModelRole extends EObject {
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
	 * @see internship.moda.fig1.Fig1Package#getModelRole_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.ModelRole#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @model opposite="modelrole" required="true"
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
	 * Returns the value of the '<em><b>Data</b></em>' reference list.
	 * The list contents are of type {@link internship.moda.fig1.Data}.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Data#getModelrole <em>Modelrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference list.
	 * @see internship.moda.fig1.Fig1Package#getModelRole_Data()
	 * @see internship.moda.fig1.Data#getModelrole
	 * @model opposite="modelrole"
	 * @generated
	 */
	EList<Data> getData();

} // ModelRole
