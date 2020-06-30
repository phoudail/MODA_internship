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
 *   <li>{@link internship.moda.fig1.Software#getDeployedModel <em>Deployed Model</em>}</li>
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
	 * Returns the value of the '<em><b>Deployed Model</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Deployment#getSoftware <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deployed Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployed Model</em>' reference.
	 * @see #setDeployedModel(Deployment)
	 * @see internship.moda.fig1.Fig1Package#getSoftware_DeployedModel()
	 * @see internship.moda.fig1.Deployment#getSoftware
	 * @model opposite="software"
	 * @generated
	 */
	Deployment getDeployedModel();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Software#getDeployedModel <em>Deployed Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployed Model</em>' reference.
	 * @see #getDeployedModel()
	 * @generated
	 */
	void setDeployedModel(Deployment value);

} // Software
