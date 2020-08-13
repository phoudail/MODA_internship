/**
 */
package internship.moda.fig1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MODA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.MODA#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}</li>
 *   <li>{@link internship.moda.fig1.MODA#getData <em>Data</em>}</li>
 *   <li>{@link internship.moda.fig1.MODA#getModel <em>Model</em>}</li>
 *   <li>{@link internship.moda.fig1.MODA#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getMODA()
 * @model
 * @generated
 */
public interface MODA extends ModaNode {
	/**
	 * Returns the value of the '<em><b>Sociotechnicalsystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sociotechnicalsystem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sociotechnicalsystem</em>' containment reference.
	 * @see #setSociotechnicalsystem(SocioTechnicalSystem)
	 * @see internship.moda.fig1.Fig1Package#getMODA_Sociotechnicalsystem()
	 * @model containment="true"
	 * @generated
	 */
	SocioTechnicalSystem getSociotechnicalsystem();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.MODA#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sociotechnicalsystem</em>' containment reference.
	 * @see #getSociotechnicalsystem()
	 * @generated
	 */
	void setSociotechnicalsystem(SocioTechnicalSystem value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link internship.moda.fig1.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see internship.moda.fig1.Fig1Package#getMODA_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference list.
	 * The list contents are of type {@link internship.moda.fig1.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference list.
	 * @see internship.moda.fig1.Fig1Package#getMODA_Model()
	 * @model containment="true"
	 * @generated
	 */
	EList<Model> getModel();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link internship.moda.fig1.ModaRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see internship.moda.fig1.Fig1Package#getMODA_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModaRelation> getRelations();

} // MODA
