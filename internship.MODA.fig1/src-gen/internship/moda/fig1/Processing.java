/**
 */
package internship.moda.fig1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.Processing#getData <em>Data</em>}</li>
 *   <li>{@link internship.moda.fig1.Processing#getSoftware <em>Software</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getProcessing()
 * @model
 * @generated
 */
public interface Processing extends AbstractRelation {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference list.
	 * The list contents are of type {@link internship.moda.fig1.Data}.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Data#getProcessing <em>Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference list.
	 * @see internship.moda.fig1.Fig1Package#getProcessing_Data()
	 * @see internship.moda.fig1.Data#getProcessing
	 * @model opposite="processing" required="true"
	 * @generated
	 */
	EList<Data> getData();

	/**
	 * Returns the value of the '<em><b>Software</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Software#getProcessing <em>Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software</em>' reference.
	 * @see #setSoftware(Software)
	 * @see internship.moda.fig1.Fig1Package#getProcessing_Software()
	 * @see internship.moda.fig1.Software#getProcessing
	 * @model opposite="processing" required="true"
	 * @generated
	 */
	Software getSoftware();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Processing#getSoftware <em>Software</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software</em>' reference.
	 * @see #getSoftware()
	 * @generated
	 */
	void setSoftware(Software value);

} // Processing
