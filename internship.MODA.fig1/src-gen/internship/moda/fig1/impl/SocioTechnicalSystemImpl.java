/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.Enactment;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.OtherInterplay;
import internship.moda.fig1.SocioTechnicalSystem;

import internship.moda.fig1.Software;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Socio Technical System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.SocioTechnicalSystemImpl#getSoftware <em>Software</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.SocioTechnicalSystemImpl#getOtherinterplay <em>Otherinterplay</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.SocioTechnicalSystemImpl#getEnactment <em>Enactment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SocioTechnicalSystemImpl extends ModaNodeImpl implements SocioTechnicalSystem {
	/**
	 * The cached value of the '{@link #getSoftware() <em>Software</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware()
	 * @generated
	 * @ordered
	 */
	protected Software software;

	/**
	 * The cached value of the '{@link #getOtherinterplay() <em>Otherinterplay</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherinterplay()
	 * @generated
	 * @ordered
	 */
	protected OtherInterplay otherinterplay;

	/**
	 * The cached value of the '{@link #getEnactment() <em>Enactment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnactment()
	 * @generated
	 * @ordered
	 */
	protected Enactment enactment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SocioTechnicalSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fig1Package.Literals.SOCIO_TECHNICAL_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Software getSoftware() {
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
					Fig1Package.SOCIO_TECHNICAL_SYSTEM__SOFTWARE, oldSoftware, newSoftware);
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
				msgs = ((InternalEObject) software).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Fig1Package.SOCIO_TECHNICAL_SYSTEM__SOFTWARE, null, msgs);
			if (newSoftware != null)
				msgs = ((InternalEObject) newSoftware).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Fig1Package.SOCIO_TECHNICAL_SYSTEM__SOFTWARE, null, msgs);
			msgs = basicSetSoftware(newSoftware, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.SOCIO_TECHNICAL_SYSTEM__SOFTWARE,
					newSoftware, newSoftware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherInterplay getOtherinterplay() {
		if (otherinterplay != null && otherinterplay.eIsProxy()) {
			InternalEObject oldOtherinterplay = (InternalEObject) otherinterplay;
			otherinterplay = (OtherInterplay) eResolveProxy(oldOtherinterplay);
			if (otherinterplay != oldOtherinterplay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.SOCIO_TECHNICAL_SYSTEM__OTHERINTERPLAY, oldOtherinterplay, otherinterplay));
			}
		}
		return otherinterplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherInterplay basicGetOtherinterplay() {
		return otherinterplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOtherinterplay(OtherInterplay newOtherinterplay, NotificationChain msgs) {
		OtherInterplay oldOtherinterplay = otherinterplay;
		otherinterplay = newOtherinterplay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.SOCIO_TECHNICAL_SYSTEM__OTHERINTERPLAY, oldOtherinterplay, newOtherinterplay);
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
	public void setOtherinterplay(OtherInterplay newOtherinterplay) {
		if (newOtherinterplay != otherinterplay) {
			NotificationChain msgs = null;
			if (otherinterplay != null)
				msgs = ((InternalEObject) otherinterplay).eInverseRemove(this,
						Fig1Package.OTHER_INTERPLAY__SOCIOTECHNICALSYSTEM, OtherInterplay.class, msgs);
			if (newOtherinterplay != null)
				msgs = ((InternalEObject) newOtherinterplay).eInverseAdd(this,
						Fig1Package.OTHER_INTERPLAY__SOCIOTECHNICALSYSTEM, OtherInterplay.class, msgs);
			msgs = basicSetOtherinterplay(newOtherinterplay, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.SOCIO_TECHNICAL_SYSTEM__OTHERINTERPLAY,
					newOtherinterplay, newOtherinterplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enactment getEnactment() {
		if (enactment != null && enactment.eIsProxy()) {
			InternalEObject oldEnactment = (InternalEObject) enactment;
			enactment = (Enactment) eResolveProxy(oldEnactment);
			if (enactment != oldEnactment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.SOCIO_TECHNICAL_SYSTEM__ENACTMENT, oldEnactment, enactment));
			}
		}
		return enactment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enactment basicGetEnactment() {
		return enactment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnactment(Enactment newEnactment, NotificationChain msgs) {
		Enactment oldEnactment = enactment;
		enactment = newEnactment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.SOCIO_TECHNICAL_SYSTEM__ENACTMENT, oldEnactment, newEnactment);
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
	public void setEnactment(Enactment newEnactment) {
		if (newEnactment != enactment) {
			NotificationChain msgs = null;
			if (enactment != null)
				msgs = ((InternalEObject) enactment).eInverseRemove(this, Fig1Package.ENACTMENT__SOCIOTECHNICALSYSTEM,
						Enactment.class, msgs);
			if (newEnactment != null)
				msgs = ((InternalEObject) newEnactment).eInverseAdd(this, Fig1Package.ENACTMENT__SOCIOTECHNICALSYSTEM,
						Enactment.class, msgs);
			msgs = basicSetEnactment(newEnactment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.SOCIO_TECHNICAL_SYSTEM__ENACTMENT,
					newEnactment, newEnactment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__OTHERINTERPLAY:
			if (otherinterplay != null)
				msgs = ((InternalEObject) otherinterplay).eInverseRemove(this,
						Fig1Package.OTHER_INTERPLAY__SOCIOTECHNICALSYSTEM, OtherInterplay.class, msgs);
			return basicSetOtherinterplay((OtherInterplay) otherEnd, msgs);
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__ENACTMENT:
			if (enactment != null)
				msgs = ((InternalEObject) enactment).eInverseRemove(this, Fig1Package.ENACTMENT__SOCIOTECHNICALSYSTEM,
						Enactment.class, msgs);
			return basicSetEnactment((Enactment) otherEnd, msgs);
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
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__SOFTWARE:
			return basicSetSoftware(null, msgs);
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__OTHERINTERPLAY:
			return basicSetOtherinterplay(null, msgs);
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__ENACTMENT:
			return basicSetEnactment(null, msgs);
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
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__SOFTWARE:
			return getSoftware();
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__OTHERINTERPLAY:
			if (resolve)
				return getOtherinterplay();
			return basicGetOtherinterplay();
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__ENACTMENT:
			if (resolve)
				return getEnactment();
			return basicGetEnactment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__SOFTWARE:
			setSoftware((Software) newValue);
			return;
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__OTHERINTERPLAY:
			setOtherinterplay((OtherInterplay) newValue);
			return;
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__ENACTMENT:
			setEnactment((Enactment) newValue);
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
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__SOFTWARE:
			setSoftware((Software) null);
			return;
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__OTHERINTERPLAY:
			setOtherinterplay((OtherInterplay) null);
			return;
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__ENACTMENT:
			setEnactment((Enactment) null);
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
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__SOFTWARE:
			return software != null;
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__OTHERINTERPLAY:
			return otherinterplay != null;
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__ENACTMENT:
			return enactment != null;
		}
		return super.eIsSet(featureID);
	}

} //SocioTechnicalSystemImpl
