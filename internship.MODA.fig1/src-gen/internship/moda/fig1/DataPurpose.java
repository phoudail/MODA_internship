/**
 */
package internship.moda.fig1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Purpose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.DataPurpose#getData <em>Data</em>}</li>
 *   <li>{@link internship.moda.fig1.DataPurpose#getSoftware <em>Software</em>}</li>
 *   <li>{@link internship.moda.fig1.DataPurpose#getDataKind <em>Data Kind</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getDataPurpose()
 * @model
 * @generated
 */
public interface DataPurpose extends ModaRelation {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Data#getProcessing <em>Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' reference.
	 * @see #setData(Data)
	 * @see internship.moda.fig1.Fig1Package#getDataPurpose_Data()
	 * @see internship.moda.fig1.Data#getProcessing
	 * @model opposite="processing"
	 * @generated
	 */
	Data getData();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.DataPurpose#getData <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' reference.
	 * @see #getData()
	 * @generated
	 */
	void setData(Data value);

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
	 * @see internship.moda.fig1.Fig1Package#getDataPurpose_Software()
	 * @see internship.moda.fig1.Software#getProcessing
	 * @model opposite="processing"
	 * @generated
	 */
	Software getSoftware();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.DataPurpose#getSoftware <em>Software</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software</em>' reference.
	 * @see #getSoftware()
	 * @generated
	 */
	void setSoftware(Software value);

	/**
	 * Returns the value of the '<em><b>Data Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link internship.moda.fig1.DataKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Kind</em>' attribute.
	 * @see internship.moda.fig1.DataKind
	 * @see #setDataKind(DataKind)
	 * @see internship.moda.fig1.Fig1Package#getDataPurpose_DataKind()
	 * @model
	 * @generated
	 */
	DataKind getDataKind();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.DataPurpose#getDataKind <em>Data Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Kind</em>' attribute.
	 * @see internship.moda.fig1.DataKind
	 * @see #getDataKind()
	 * @generated
	 */
	void setDataKind(DataKind value);

} // DataPurpose
