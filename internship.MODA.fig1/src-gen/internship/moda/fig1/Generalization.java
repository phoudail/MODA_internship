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
 *   <li>{@link internship.moda.fig1.Generalization#getSource <em>Source</em>}</li>
 *   <li>{@link internship.moda.fig1.Generalization#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getGeneralization()
 * @model
 * @generated
 */
public interface Generalization extends ModaRelation {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link internship.moda.fig1.Data}.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Data#getGeneralization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see internship.moda.fig1.Fig1Package#getGeneralization_Source()
	 * @see internship.moda.fig1.Data#getGeneralization
	 * @model opposite="generalization"
	 * @generated
	 */
	EList<Data> getSource();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.DescriptiveModel#getIncomingGeneralization <em>Incoming Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(DescriptiveModel)
	 * @see internship.moda.fig1.Fig1Package#getGeneralization_Target()
	 * @see internship.moda.fig1.DescriptiveModel#getIncomingGeneralization
	 * @model opposite="incomingGeneralization"
	 * @generated
	 */
	DescriptiveModel getTarget();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Generalization#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(DescriptiveModel value);

} // Generalization
