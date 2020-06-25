/**
 */
package internship.moda.fig1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Socio Technical System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.SocioTechnicalSystem#getData <em>Data</em>}</li>
 *   <li>{@link internship.moda.fig1.SocioTechnicalSystem#getPrescriptivemodel <em>Prescriptivemodel</em>}</li>
 *   <li>{@link internship.moda.fig1.SocioTechnicalSystem#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getSocioTechnicalSystem()
 * @model
 * @generated
 */
public interface SocioTechnicalSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference list.
	 * The list contents are of type {@link internship.moda.fig1.Data}.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Data#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference list.
	 * @see internship.moda.fig1.Fig1Package#getSocioTechnicalSystem_Data()
	 * @see internship.moda.fig1.Data#getSociotechnicalsystem
	 * @model opposite="sociotechnicalsystem"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Prescriptivemodel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.PrescriptiveModel#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriptivemodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriptivemodel</em>' reference.
	 * @see #setPrescriptivemodel(PrescriptiveModel)
	 * @see internship.moda.fig1.Fig1Package#getSocioTechnicalSystem_Prescriptivemodel()
	 * @see internship.moda.fig1.PrescriptiveModel#getSociotechnicalsystem
	 * @model opposite="sociotechnicalsystem"
	 * @generated
	 */
	PrescriptiveModel getPrescriptivemodel();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.SocioTechnicalSystem#getPrescriptivemodel <em>Prescriptivemodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescriptivemodel</em>' reference.
	 * @see #getPrescriptivemodel()
	 * @generated
	 */
	void setPrescriptivemodel(PrescriptiveModel value);

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
	 * @see internship.moda.fig1.Fig1Package#getSocioTechnicalSystem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.SocioTechnicalSystem#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SocioTechnicalSystem
