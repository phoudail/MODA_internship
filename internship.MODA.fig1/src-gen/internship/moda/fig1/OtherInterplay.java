/**
 */
package internship.moda.fig1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Other Interplay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.OtherInterplay#getData <em>Data</em>}</li>
 *   <li>{@link internship.moda.fig1.OtherInterplay#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getOtherInterplay()
 * @model
 * @generated
 */
public interface OtherInterplay extends ModaRelation {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference list.
	 * The list contents are of type {@link internship.moda.fig1.Data}.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Data#getOtherinterplay <em>Otherinterplay</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference list.
	 * @see internship.moda.fig1.Fig1Package#getOtherInterplay_Data()
	 * @see internship.moda.fig1.Data#getOtherinterplay
	 * @model opposite="otherinterplay" required="true"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Sociotechnicalsystem</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.SocioTechnicalSystem#getOtherinterplay <em>Otherinterplay</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sociotechnicalsystem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sociotechnicalsystem</em>' reference.
	 * @see #setSociotechnicalsystem(SocioTechnicalSystem)
	 * @see internship.moda.fig1.Fig1Package#getOtherInterplay_Sociotechnicalsystem()
	 * @see internship.moda.fig1.SocioTechnicalSystem#getOtherinterplay
	 * @model opposite="otherinterplay"
	 * @generated
	 */
	SocioTechnicalSystem getSociotechnicalsystem();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.OtherInterplay#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sociotechnicalsystem</em>' reference.
	 * @see #getSociotechnicalsystem()
	 * @generated
	 */
	void setSociotechnicalsystem(SocioTechnicalSystem value);

} // OtherInterplay
