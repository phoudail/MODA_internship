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
 *   <li>{@link internship.moda.fig1.SocioTechnicalSystem#getSoftware <em>Software</em>}</li>
 *   <li>{@link internship.moda.fig1.SocioTechnicalSystem#getExternaldata <em>Externaldata</em>}</li>
 *   <li>{@link internship.moda.fig1.SocioTechnicalSystem#getPrescriptivemodel <em>Prescriptivemodel</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getSocioTechnicalSystem()
 * @model
 * @generated
 */
public interface SocioTechnicalSystem extends EObject {
	/**
	 * Returns the value of the '<em><b>Software</b></em>' containment reference list.
	 * The list contents are of type {@link internship.moda.fig1.Software}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software</em>' containment reference list.
	 * @see internship.moda.fig1.Fig1Package#getSocioTechnicalSystem_Software()
	 * @model containment="true"
	 * @generated
	 */
	EList<Software> getSoftware();

	/**
	 * Returns the value of the '<em><b>Externaldata</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.ExternalData#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Externaldata</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externaldata</em>' reference.
	 * @see #setExternaldata(ExternalData)
	 * @see internship.moda.fig1.Fig1Package#getSocioTechnicalSystem_Externaldata()
	 * @see internship.moda.fig1.ExternalData#getSociotechnicalsystem
	 * @model opposite="sociotechnicalsystem"
	 * @generated
	 */
	ExternalData getExternaldata();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.SocioTechnicalSystem#getExternaldata <em>Externaldata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Externaldata</em>' reference.
	 * @see #getExternaldata()
	 * @generated
	 */
	void setExternaldata(ExternalData value);

	/**
	 * Returns the value of the '<em><b>Prescriptivemodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriptivemodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriptivemodel</em>' reference.
	 * @see #setPrescriptivemodel(PrescriptiveModel)
	 * @see internship.moda.fig1.Fig1Package#getSocioTechnicalSystem_Prescriptivemodel()
	 * @model
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

} // SocioTechnicalSystem
