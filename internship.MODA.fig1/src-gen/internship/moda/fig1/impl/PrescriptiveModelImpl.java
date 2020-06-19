/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.PredictiveModel;
import internship.moda.fig1.PrescriptiveModel;

import internship.moda.fig1.SocioTechnicalSystem;
import internship.moda.fig1.Software;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prescriptive Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.PrescriptiveModelImpl#getSoftware <em>Software</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.PrescriptiveModelImpl#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.PrescriptiveModelImpl#getPredictivemodel <em>Predictivemodel</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.PrescriptiveModelImpl#getPrescriptivemodel <em>Prescriptivemodel</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.PrescriptiveModelImpl#getPrescriptivemodeleOpposite <em>Prescriptivemodele Opposite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrescriptiveModelImpl extends ModelRoleImpl implements PrescriptiveModel {
	/**
	 * The cached value of the '{@link #getSoftware() <em>Software</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware()
	 * @generated
	 * @ordered
	 */
	protected Software software;
	/**
	 * The cached value of the '{@link #getSociotechnicalsystem() <em>Sociotechnicalsystem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSociotechnicalsystem()
	 * @generated
	 * @ordered
	 */
	protected SocioTechnicalSystem sociotechnicalsystem;
	/**
	 * The cached value of the '{@link #getPredictivemodel() <em>Predictivemodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredictivemodel()
	 * @generated
	 * @ordered
	 */
	protected PredictiveModel predictivemodel;
	/**
	 * The cached value of the '{@link #getPrescriptivemodel() <em>Prescriptivemodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptivemodel()
	 * @generated
	 * @ordered
	 */
	protected PrescriptiveModel prescriptivemodel;
	/**
	 * The cached value of the '{@link #getPrescriptivemodeleOpposite() <em>Prescriptivemodele Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptivemodeleOpposite()
	 * @generated
	 * @ordered
	 */
	protected PrescriptiveModel prescriptivemodeleOpposite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrescriptiveModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fig1Package.Literals.PRESCRIPTIVE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Software getSoftware() {
		if (software != null && software.eIsProxy()) {
			InternalEObject oldSoftware = (InternalEObject) software;
			software = (Software) eResolveProxy(oldSoftware);
			if (software != oldSoftware) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.PRESCRIPTIVE_MODEL__SOFTWARE,
							oldSoftware, software));
			}
		}
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Software basicGetSoftware() {
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftware(Software newSoftware, NotificationChain msgs) {
		Software oldSoftware = software;
		software = newSoftware;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.PRESCRIPTIVE_MODEL__SOFTWARE, oldSoftware, newSoftware);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftware(Software newSoftware) {
		if (newSoftware != software) {
			NotificationChain msgs = null;
			if (software != null)
				msgs = ((InternalEObject) software).eInverseRemove(this, Fig1Package.SOFTWARE__PRESCRIPTIVEMODEL,
						Software.class, msgs);
			if (newSoftware != null)
				msgs = ((InternalEObject) newSoftware).eInverseAdd(this, Fig1Package.SOFTWARE__PRESCRIPTIVEMODEL,
						Software.class, msgs);
			msgs = basicSetSoftware(newSoftware, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.PRESCRIPTIVE_MODEL__SOFTWARE, newSoftware,
					newSoftware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocioTechnicalSystem getSociotechnicalsystem() {
		if (sociotechnicalsystem != null && sociotechnicalsystem.eIsProxy()) {
			InternalEObject oldSociotechnicalsystem = (InternalEObject) sociotechnicalsystem;
			sociotechnicalsystem = (SocioTechnicalSystem) eResolveProxy(oldSociotechnicalsystem);
			if (sociotechnicalsystem != oldSociotechnicalsystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.PRESCRIPTIVE_MODEL__SOCIOTECHNICALSYSTEM, oldSociotechnicalsystem,
							sociotechnicalsystem));
			}
		}
		return sociotechnicalsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocioTechnicalSystem basicGetSociotechnicalsystem() {
		return sociotechnicalsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSociotechnicalsystem(SocioTechnicalSystem newSociotechnicalsystem,
			NotificationChain msgs) {
		SocioTechnicalSystem oldSociotechnicalsystem = sociotechnicalsystem;
		sociotechnicalsystem = newSociotechnicalsystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.PRESCRIPTIVE_MODEL__SOCIOTECHNICALSYSTEM, oldSociotechnicalsystem,
					newSociotechnicalsystem);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSociotechnicalsystem(SocioTechnicalSystem newSociotechnicalsystem) {
		if (newSociotechnicalsystem != sociotechnicalsystem) {
			NotificationChain msgs = null;
			if (sociotechnicalsystem != null)
				msgs = ((InternalEObject) sociotechnicalsystem).eInverseRemove(this,
						Fig1Package.SOCIO_TECHNICAL_SYSTEM__PRESCRIPTIVEMODEL, SocioTechnicalSystem.class, msgs);
			if (newSociotechnicalsystem != null)
				msgs = ((InternalEObject) newSociotechnicalsystem).eInverseAdd(this,
						Fig1Package.SOCIO_TECHNICAL_SYSTEM__PRESCRIPTIVEMODEL, SocioTechnicalSystem.class, msgs);
			msgs = basicSetSociotechnicalsystem(newSociotechnicalsystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.PRESCRIPTIVE_MODEL__SOCIOTECHNICALSYSTEM,
					newSociotechnicalsystem, newSociotechnicalsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredictiveModel getPredictivemodel() {
		if (predictivemodel != null && predictivemodel.eIsProxy()) {
			InternalEObject oldPredictivemodel = (InternalEObject) predictivemodel;
			predictivemodel = (PredictiveModel) eResolveProxy(oldPredictivemodel);
			if (predictivemodel != oldPredictivemodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.PRESCRIPTIVE_MODEL__PREDICTIVEMODEL, oldPredictivemodel, predictivemodel));
			}
		}
		return predictivemodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredictiveModel basicGetPredictivemodel() {
		return predictivemodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredictivemodel(PredictiveModel newPredictivemodel, NotificationChain msgs) {
		PredictiveModel oldPredictivemodel = predictivemodel;
		predictivemodel = newPredictivemodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.PRESCRIPTIVE_MODEL__PREDICTIVEMODEL, oldPredictivemodel, newPredictivemodel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredictivemodel(PredictiveModel newPredictivemodel) {
		if (newPredictivemodel != predictivemodel) {
			NotificationChain msgs = null;
			if (predictivemodel != null)
				msgs = ((InternalEObject) predictivemodel).eInverseRemove(this,
						Fig1Package.PREDICTIVE_MODEL__PRESCRIPTIVEMODEL, PredictiveModel.class, msgs);
			if (newPredictivemodel != null)
				msgs = ((InternalEObject) newPredictivemodel).eInverseAdd(this,
						Fig1Package.PREDICTIVE_MODEL__PRESCRIPTIVEMODEL, PredictiveModel.class, msgs);
			msgs = basicSetPredictivemodel(newPredictivemodel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.PRESCRIPTIVE_MODEL__PREDICTIVEMODEL,
					newPredictivemodel, newPredictivemodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriptiveModel getPrescriptivemodel() {
		if (prescriptivemodel != null && prescriptivemodel.eIsProxy()) {
			InternalEObject oldPrescriptivemodel = (InternalEObject) prescriptivemodel;
			prescriptivemodel = (PrescriptiveModel) eResolveProxy(oldPrescriptivemodel);
			if (prescriptivemodel != oldPrescriptivemodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODEL, oldPrescriptivemodel,
							prescriptivemodel));
			}
		}
		return prescriptivemodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriptiveModel basicGetPrescriptivemodel() {
		return prescriptivemodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescriptivemodel(PrescriptiveModel newPrescriptivemodel, NotificationChain msgs) {
		PrescriptiveModel oldPrescriptivemodel = prescriptivemodel;
		prescriptivemodel = newPrescriptivemodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODEL, oldPrescriptivemodel, newPrescriptivemodel);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescriptivemodel(PrescriptiveModel newPrescriptivemodel) {
		if (newPrescriptivemodel != prescriptivemodel) {
			NotificationChain msgs = null;
			if (prescriptivemodel != null)
				msgs = ((InternalEObject) prescriptivemodel).eInverseRemove(this,
						Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODELE_OPPOSITE, PrescriptiveModel.class, msgs);
			if (newPrescriptivemodel != null)
				msgs = ((InternalEObject) newPrescriptivemodel).eInverseAdd(this,
						Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODELE_OPPOSITE, PrescriptiveModel.class, msgs);
			msgs = basicSetPrescriptivemodel(newPrescriptivemodel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODEL,
					newPrescriptivemodel, newPrescriptivemodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriptiveModel getPrescriptivemodeleOpposite() {
		if (prescriptivemodeleOpposite != null && prescriptivemodeleOpposite.eIsProxy()) {
			InternalEObject oldPrescriptivemodeleOpposite = (InternalEObject) prescriptivemodeleOpposite;
			prescriptivemodeleOpposite = (PrescriptiveModel) eResolveProxy(oldPrescriptivemodeleOpposite);
			if (prescriptivemodeleOpposite != oldPrescriptivemodeleOpposite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODELE_OPPOSITE, oldPrescriptivemodeleOpposite,
							prescriptivemodeleOpposite));
			}
		}
		return prescriptivemodeleOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriptiveModel basicGetPrescriptivemodeleOpposite() {
		return prescriptivemodeleOpposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescriptivemodeleOpposite(PrescriptiveModel newPrescriptivemodeleOpposite,
			NotificationChain msgs) {
		PrescriptiveModel oldPrescriptivemodeleOpposite = prescriptivemodeleOpposite;
		prescriptivemodeleOpposite = newPrescriptivemodeleOpposite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODELE_OPPOSITE, oldPrescriptivemodeleOpposite,
					newPrescriptivemodeleOpposite);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescriptivemodeleOpposite(PrescriptiveModel newPrescriptivemodeleOpposite) {
		if (newPrescriptivemodeleOpposite != prescriptivemodeleOpposite) {
			NotificationChain msgs = null;
			if (prescriptivemodeleOpposite != null)
				msgs = ((InternalEObject) prescriptivemodeleOpposite).eInverseRemove(this,
						Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODEL, PrescriptiveModel.class, msgs);
			if (newPrescriptivemodeleOpposite != null)
				msgs = ((InternalEObject) newPrescriptivemodeleOpposite).eInverseAdd(this,
						Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODEL, PrescriptiveModel.class, msgs);
			msgs = basicSetPrescriptivemodeleOpposite(newPrescriptivemodeleOpposite, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODELE_OPPOSITE, newPrescriptivemodeleOpposite,
					newPrescriptivemodeleOpposite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fig1Package.PRESCRIPTIVE_MODEL__SOFTWARE:
			if (software != null)
				msgs = ((InternalEObject) software).eInverseRemove(this, Fig1Package.SOFTWARE__PRESCRIPTIVEMODEL,
						Software.class, msgs);
			return basicSetSoftware((Software) otherEnd, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__SOCIOTECHNICALSYSTEM:
			if (sociotechnicalsystem != null)
				msgs = ((InternalEObject) sociotechnicalsystem).eInverseRemove(this,
						Fig1Package.SOCIO_TECHNICAL_SYSTEM__PRESCRIPTIVEMODEL, SocioTechnicalSystem.class, msgs);
			return basicSetSociotechnicalsystem((SocioTechnicalSystem) otherEnd, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__PREDICTIVEMODEL:
			if (predictivemodel != null)
				msgs = ((InternalEObject) predictivemodel).eInverseRemove(this,
						Fig1Package.PREDICTIVE_MODEL__PRESCRIPTIVEMODEL, PredictiveModel.class, msgs);
			return basicSetPredictivemodel((PredictiveModel) otherEnd, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODEL:
			if (prescriptivemodel != null)
				msgs = ((InternalEObject) prescriptivemodel).eInverseRemove(this,
						Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODELE_OPPOSITE, PrescriptiveModel.class, msgs);
			return basicSetPrescriptivemodel((PrescriptiveModel) otherEnd, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODELE_OPPOSITE:
			if (prescriptivemodeleOpposite != null)
				msgs = ((InternalEObject) prescriptivemodeleOpposite).eInverseRemove(this,
						Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODEL, PrescriptiveModel.class, msgs);
			return basicSetPrescriptivemodeleOpposite((PrescriptiveModel) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fig1Package.PRESCRIPTIVE_MODEL__SOFTWARE:
			return basicSetSoftware(null, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__SOCIOTECHNICALSYSTEM:
			return basicSetSociotechnicalsystem(null, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__PREDICTIVEMODEL:
			return basicSetPredictivemodel(null, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODEL:
			return basicSetPrescriptivemodel(null, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODELE_OPPOSITE:
			return basicSetPrescriptivemodeleOpposite(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Fig1Package.PRESCRIPTIVE_MODEL__SOFTWARE:
			if (resolve)
				return getSoftware();
			return basicGetSoftware();
		case Fig1Package.PRESCRIPTIVE_MODEL__SOCIOTECHNICALSYSTEM:
			if (resolve)
				return getSociotechnicalsystem();
			return basicGetSociotechnicalsystem();
		case Fig1Package.PRESCRIPTIVE_MODEL__PREDICTIVEMODEL:
			if (resolve)
				return getPredictivemodel();
			return basicGetPredictivemodel();
		case Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODEL:
			if (resolve)
				return getPrescriptivemodel();
			return basicGetPrescriptivemodel();
		case Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODELE_OPPOSITE:
			if (resolve)
				return getPrescriptivemodeleOpposite();
			return basicGetPrescriptivemodeleOpposite();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Fig1Package.PRESCRIPTIVE_MODEL__SOFTWARE:
			setSoftware((Software) newValue);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__SOCIOTECHNICALSYSTEM:
			setSociotechnicalsystem((SocioTechnicalSystem) newValue);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__PREDICTIVEMODEL:
			setPredictivemodel((PredictiveModel) newValue);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODEL:
			setPrescriptivemodel((PrescriptiveModel) newValue);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODELE_OPPOSITE:
			setPrescriptivemodeleOpposite((PrescriptiveModel) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Fig1Package.PRESCRIPTIVE_MODEL__SOFTWARE:
			setSoftware((Software) null);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__SOCIOTECHNICALSYSTEM:
			setSociotechnicalsystem((SocioTechnicalSystem) null);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__PREDICTIVEMODEL:
			setPredictivemodel((PredictiveModel) null);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODEL:
			setPrescriptivemodel((PrescriptiveModel) null);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODELE_OPPOSITE:
			setPrescriptivemodeleOpposite((PrescriptiveModel) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Fig1Package.PRESCRIPTIVE_MODEL__SOFTWARE:
			return software != null;
		case Fig1Package.PRESCRIPTIVE_MODEL__SOCIOTECHNICALSYSTEM:
			return sociotechnicalsystem != null;
		case Fig1Package.PRESCRIPTIVE_MODEL__PREDICTIVEMODEL:
			return predictivemodel != null;
		case Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODEL:
			return prescriptivemodel != null;
		case Fig1Package.PRESCRIPTIVE_MODEL__PRESCRIPTIVEMODELE_OPPOSITE:
			return prescriptivemodeleOpposite != null;
		}
		return super.eIsSet(featureID);
	}

} //PrescriptiveModelImpl
