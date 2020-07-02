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
 *   <li>{@link internship.moda.fig1.impl.SocioTechnicalSystemImpl#getIncomingEnactment <em>Incoming Enactment</em>}</li>
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
	 * The cached value of the '{@link #getIncomingEnactment() <em>Incoming Enactment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingEnactment()
	 * @generated
	 * @ordered
	 */
	protected Enactment incomingEnactment;

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
	public Enactment getIncomingEnactment() {
		if (incomingEnactment != null && incomingEnactment.eIsProxy()) {
			InternalEObject oldIncomingEnactment = (InternalEObject) incomingEnactment;
			incomingEnactment = (Enactment) eResolveProxy(oldIncomingEnactment);
			if (incomingEnactment != oldIncomingEnactment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.SOCIO_TECHNICAL_SYSTEM__INCOMING_ENACTMENT, oldIncomingEnactment,
							incomingEnactment));
			}
		}
		return incomingEnactment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enactment basicGetIncomingEnactment() {
		return incomingEnactment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingEnactment(Enactment newIncomingEnactment, NotificationChain msgs) {
		Enactment oldIncomingEnactment = incomingEnactment;
		incomingEnactment = newIncomingEnactment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.SOCIO_TECHNICAL_SYSTEM__INCOMING_ENACTMENT, oldIncomingEnactment, newIncomingEnactment);
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
	public void setIncomingEnactment(Enactment newIncomingEnactment) {
		if (newIncomingEnactment != incomingEnactment) {
			NotificationChain msgs = null;
			if (incomingEnactment != null)
				msgs = ((InternalEObject) incomingEnactment).eInverseRemove(this, Fig1Package.ENACTMENT__TARGET,
						Enactment.class, msgs);
			if (newIncomingEnactment != null)
				msgs = ((InternalEObject) newIncomingEnactment).eInverseAdd(this, Fig1Package.ENACTMENT__TARGET,
						Enactment.class, msgs);
			msgs = basicSetIncomingEnactment(newIncomingEnactment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Fig1Package.SOCIO_TECHNICAL_SYSTEM__INCOMING_ENACTMENT, newIncomingEnactment,
					newIncomingEnactment));
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
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__INCOMING_ENACTMENT:
			if (incomingEnactment != null)
				msgs = ((InternalEObject) incomingEnactment).eInverseRemove(this, Fig1Package.ENACTMENT__TARGET,
						Enactment.class, msgs);
			return basicSetIncomingEnactment((Enactment) otherEnd, msgs);
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
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__INCOMING_ENACTMENT:
			return basicSetIncomingEnactment(null, msgs);
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
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__INCOMING_ENACTMENT:
			if (resolve)
				return getIncomingEnactment();
			return basicGetIncomingEnactment();
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
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__INCOMING_ENACTMENT:
			setIncomingEnactment((Enactment) newValue);
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
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__INCOMING_ENACTMENT:
			setIncomingEnactment((Enactment) null);
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
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__INCOMING_ENACTMENT:
			return incomingEnactment != null;
		}
		return super.eIsSet(featureID);
	}

} //SocioTechnicalSystemImpl
