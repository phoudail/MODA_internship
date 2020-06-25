/**
 */
package internship.moda.fig1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.Data#getSoftware <em>Software</em>}</li>
 *   <li>{@link internship.moda.fig1.Data#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}</li>
 *   <li>{@link internship.moda.fig1.Data#getModelrole <em>Modelrole</em>}</li>
 *   <li>{@link internship.moda.fig1.Data#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getData()
 * @model
 * @generated
 */
public interface Data extends EObject {
	/**
	 * Returns the value of the '<em><b>Software</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Software#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software</em>' reference.
	 * @see #setSoftware(Software)
	 * @see internship.moda.fig1.Fig1Package#getData_Software()
	 * @see internship.moda.fig1.Software#getData
	 * @model opposite="data"
	 * @generated
	 */
	Software getSoftware();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Data#getSoftware <em>Software</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software</em>' reference.
	 * @see #getSoftware()
	 * @generated
	 */
	void setSoftware(Software value);

	/**
	 * Returns the value of the '<em><b>Sociotechnicalsystem</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.SocioTechnicalSystem#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sociotechnicalsystem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sociotechnicalsystem</em>' reference.
	 * @see #setSociotechnicalsystem(SocioTechnicalSystem)
	 * @see internship.moda.fig1.Fig1Package#getData_Sociotechnicalsystem()
	 * @see internship.moda.fig1.SocioTechnicalSystem#getData
	 * @model opposite="data"
	 * @generated
	 */
	SocioTechnicalSystem getSociotechnicalsystem();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Data#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sociotechnicalsystem</em>' reference.
	 * @see #getSociotechnicalsystem()
	 * @generated
	 */
	void setSociotechnicalsystem(SocioTechnicalSystem value);

	/**
	 * Returns the value of the '<em><b>Modelrole</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.ModelRole#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modelrole</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modelrole</em>' reference.
	 * @see #setModelrole(ModelRole)
	 * @see internship.moda.fig1.Fig1Package#getData_Modelrole()
	 * @see internship.moda.fig1.ModelRole#getData
	 * @model opposite="data"
	 * @generated
	 */
	ModelRole getModelrole();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Data#getModelrole <em>Modelrole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modelrole</em>' reference.
	 * @see #getModelrole()
	 * @generated
	 */
	void setModelrole(ModelRole value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link internship.moda.fig1.DataTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see internship.moda.fig1.DataTypes
	 * @see #setDataType(DataTypes)
	 * @see internship.moda.fig1.Fig1Package#getData_DataType()
	 * @model
	 * @generated
	 */
	DataTypes getDataType();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.Data#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see internship.moda.fig1.DataTypes
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(DataTypes value);

} // Data
