/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.ExternalData;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.SocioTechnicalSystem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.ExternalDataImpl#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalDataImpl extends DataImpl implements ExternalData {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fig1Package.Literals.EXTERNAL_DATA;
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
							Fig1Package.EXTERNAL_DATA__SOCIOTECHNICALSYSTEM, oldSociotechnicalsystem,
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
					Fig1Package.EXTERNAL_DATA__SOCIOTECHNICALSYSTEM, oldSociotechnicalsystem, newSociotechnicalsystem);
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
						Fig1Package.SOCIO_TECHNICAL_SYSTEM__EXTERNALDATA, SocioTechnicalSystem.class, msgs);
			if (newSociotechnicalsystem != null)
				msgs = ((InternalEObject) newSociotechnicalsystem).eInverseAdd(this,
						Fig1Package.SOCIO_TECHNICAL_SYSTEM__EXTERNALDATA, SocioTechnicalSystem.class, msgs);
			msgs = basicSetSociotechnicalsystem(newSociotechnicalsystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.EXTERNAL_DATA__SOCIOTECHNICALSYSTEM,
					newSociotechnicalsystem, newSociotechnicalsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fig1Package.EXTERNAL_DATA__SOCIOTECHNICALSYSTEM:
			if (sociotechnicalsystem != null)
				msgs = ((InternalEObject) sociotechnicalsystem).eInverseRemove(this,
						Fig1Package.SOCIO_TECHNICAL_SYSTEM__EXTERNALDATA, SocioTechnicalSystem.class, msgs);
			return basicSetSociotechnicalsystem((SocioTechnicalSystem) otherEnd, msgs);
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
		case Fig1Package.EXTERNAL_DATA__SOCIOTECHNICALSYSTEM:
			return basicSetSociotechnicalsystem(null, msgs);
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
		case Fig1Package.EXTERNAL_DATA__SOCIOTECHNICALSYSTEM:
			if (resolve)
				return getSociotechnicalsystem();
			return basicGetSociotechnicalsystem();
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
		case Fig1Package.EXTERNAL_DATA__SOCIOTECHNICALSYSTEM:
			setSociotechnicalsystem((SocioTechnicalSystem) newValue);
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
		case Fig1Package.EXTERNAL_DATA__SOCIOTECHNICALSYSTEM:
			setSociotechnicalsystem((SocioTechnicalSystem) null);
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
		case Fig1Package.EXTERNAL_DATA__SOCIOTECHNICALSYSTEM:
			return sociotechnicalsystem != null;
		}
		return super.eIsSet(featureID);
	}

} //ExternalDataImpl
