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

} // Model
