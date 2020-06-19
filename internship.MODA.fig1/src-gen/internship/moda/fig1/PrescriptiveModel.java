/**
 */
package internship.moda.fig1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prescriptive Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.PrescriptiveModel#getSoftware <em>Software</em>}</li>
 *   <li>{@link internship.moda.fig1.PrescriptiveModel#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}</li>
 *   <li>{@link internship.moda.fig1.PrescriptiveModel#getPredictivemodel <em>Predictivemodel</em>}</li>
 *   <li>{@link internship.moda.fig1.PrescriptiveModel#getPrescriptivemodel <em>Prescriptivemodel</em>}</li>
 *   <li>{@link internship.moda.fig1.PrescriptiveModel#getPrescriptivemodeleOpposite <em>Prescriptivemodele Opposite</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getPrescriptiveModel()
 * @model
 * @generated
 */
public interface PrescriptiveModel extends ModelRole {
	/**
	 * Returns the value of the '<em><b>Software</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.Software#getPrescriptivemodel <em>Prescriptivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software</em>' reference.
	 * @see #setSoftware(Software)
	 * @see internship.moda.fig1.Fig1Package#getPrescriptiveModel_Software()
	 * @see internship.moda.fig1.Software#getPrescriptivemodel
	 * @model opposite="prescriptivemodel"
	 * @generated
	 */
	Software getSoftware();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.PrescriptiveModel#getSoftware <em>Software</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software</em>' reference.
	 * @see #getSoftware()
	 * @generated
	 */
	void setSoftware(Software value);

	/**
	 * Returns the value of the '<em><b>Sociotechnicalsystem</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.SocioTechnicalSystem#getPrescriptivemodel <em>Prescriptivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sociotechnicalsystem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sociotechnicalsystem</em>' reference.
	 * @see #setSociotechnicalsystem(SocioTechnicalSystem)
	 * @see internship.moda.fig1.Fig1Package#getPrescriptiveModel_Sociotechnicalsystem()
	 * @see internship.moda.fig1.SocioTechnicalSystem#getPrescriptivemodel
	 * @model opposite="prescriptivemodel"
	 * @generated
	 */
	SocioTechnicalSystem getSociotechnicalsystem();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.PrescriptiveModel#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sociotechnicalsystem</em>' reference.
	 * @see #getSociotechnicalsystem()
	 * @generated
	 */
	void setSociotechnicalsystem(SocioTechnicalSystem value);

	/**
	 * Returns the value of the '<em><b>Predictivemodel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.PredictiveModel#getPrescriptivemodel <em>Prescriptivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predictivemodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predictivemodel</em>' reference.
	 * @see #setPredictivemodel(PredictiveModel)
	 * @see internship.moda.fig1.Fig1Package#getPrescriptiveModel_Predictivemodel()
	 * @see internship.moda.fig1.PredictiveModel#getPrescriptivemodel
	 * @model opposite="prescriptivemodel"
	 * @generated
	 */
	PredictiveModel getPredictivemodel();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.PrescriptiveModel#getPredictivemodel <em>Predictivemodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predictivemodel</em>' reference.
	 * @see #getPredictivemodel()
	 * @generated
	 */
	void setPredictivemodel(PredictiveModel value);

	/**
	 * Returns the value of the '<em><b>Prescriptivemodel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.PrescriptiveModel#getPrescriptivemodeleOpposite <em>Prescriptivemodele Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriptivemodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriptivemodel</em>' reference.
	 * @see #setPrescriptivemodel(PrescriptiveModel)
	 * @see internship.moda.fig1.Fig1Package#getPrescriptiveModel_Prescriptivemodel()
	 * @see internship.moda.fig1.PrescriptiveModel#getPrescriptivemodeleOpposite
	 * @model opposite="prescriptivemodeleOpposite"
	 * @generated
	 */
	PrescriptiveModel getPrescriptivemodel();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.PrescriptiveModel#getPrescriptivemodel <em>Prescriptivemodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescriptivemodel</em>' reference.
	 * @see #getPrescriptivemodel()
	 * @generated
	 */
	void setPrescriptivemodel(PrescriptiveModel value);

	/**
	 * Returns the value of the '<em><b>Prescriptivemodele Opposite</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.PrescriptiveModel#getPrescriptivemodel <em>Prescriptivemodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriptivemodele Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriptivemodele Opposite</em>' reference.
	 * @see #setPrescriptivemodeleOpposite(PrescriptiveModel)
	 * @see internship.moda.fig1.Fig1Package#getPrescriptiveModel_PrescriptivemodeleOpposite()
	 * @see internship.moda.fig1.PrescriptiveModel#getPrescriptivemodel
	 * @model opposite="prescriptivemodel"
	 * @generated
	 */
	PrescriptiveModel getPrescriptivemodeleOpposite();

	/**
	 * Sets the value of the '{@link internship.moda.fig1.PrescriptiveModel#getPrescriptivemodeleOpposite <em>Prescriptivemodele Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescriptivemodele Opposite</em>' reference.
	 * @see #getPrescriptivemodeleOpposite()
	 * @generated
	 */
	void setPrescriptivemodeleOpposite(PrescriptiveModel value);

} // PrescriptiveModel
