/**
 */
package internship.moda.fig1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.Software#getProcessing <em>Processing</em>}</li>
 *   <li>{@link internship.moda.fig1.Software#getIincomingDeployment <em>Iincoming Deployment</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getSoftware()
 * @model
 * @generated
 */
public interface Software extends ModaNode {
	/**
	 * Returns the value of the '<em><b>Processing</b></em>' reference list.
	 * The list contents are of type {@link internship.moda.fig1.DataPurpose}.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.DataPurpose#getSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing</em>' reference list.
	 * @see internship.moda.fig1.Fig1Package#getSoftware_Processing()
	 * @see internship.moda.fig1.DataPurpose#getSoftware
	 * @model opposite="software"
	 * @generated
	 */
	EList<DataPurpose> getProcessing();

	/**
	 * Returns the value of the '<em><b>Iincoming Deployment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Deployment#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iincoming Deployment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iincoming Deployment</em>' reference.
	 * @see #setIincomingDeployment(Deployment)
	 * @see internship.moda.fig1.Fig1Package#getSoftware_IincomingDeployment()
	 * @see internship.moda.fig1.Deployment#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	Deployment getIincomingDeployment();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Software#getIincomingDeployment <em>Iincoming Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iincoming Deployment</em>' reference.
	 * @see #getIincomingDeployment()
	 * @generated
	 */
	void setIincomingDeployment(Deployment value);

} // Software
