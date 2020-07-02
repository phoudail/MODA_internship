/**
 */
package internship.moda.fig1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.Data#getOtherinterplay <em>Otherinterplay</em>}</li>
 *   <li>{@link internship.moda.fig1.Data#getDatapurpose <em>Datapurpose</em>}</li>
 *   <li>{@link internship.moda.fig1.Data#getGeneralization <em>Generalization</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getData()
 * @model
 * @generated
 */
public interface Data extends ModaNode {
	/**
	 * Returns the value of the '<em><b>Otherinterplay</b></em>' reference list.
	 * The list contents are of type {@link internship.moda.fig1.OtherInterplay}.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.OtherInterplay#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Otherinterplay</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otherinterplay</em>' reference list.
	 * @see internship.moda.fig1.Fig1Package#getData_Otherinterplay()
	 * @see internship.moda.fig1.OtherInterplay#getData
	 * @model opposite="data"
	 * @generated
	 */
	EList<OtherInterplay> getOtherinterplay();

	/**
	 * Returns the value of the '<em><b>Datapurpose</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.DataPurpose#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datapurpose</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datapurpose</em>' reference.
	 * @see #setDatapurpose(DataPurpose)
	 * @see internship.moda.fig1.Fig1Package#getData_Datapurpose()
	 * @see internship.moda.fig1.DataPurpose#getData
	 * @model opposite="data"
	 * @generated
	 */
	DataPurpose getDatapurpose();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Data#getDatapurpose <em>Datapurpose</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datapurpose</em>' reference.
	 * @see #getDatapurpose()
	 * @generated
	 */
	void setDatapurpose(DataPurpose value);

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Generalization#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generalization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalization</em>' reference.
	 * @see #setGeneralization(Generalization)
	 * @see internship.moda.fig1.Fig1Package#getData_Generalization()
	 * @see internship.moda.fig1.Generalization#getSource
	 * @model opposite="source"
	 * @generated
	 */
	Generalization getGeneralization();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Data#getGeneralization <em>Generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generalization</em>' reference.
	 * @see #getGeneralization()
	 * @generated
	 */
	void setGeneralization(Generalization value);

} // Data
