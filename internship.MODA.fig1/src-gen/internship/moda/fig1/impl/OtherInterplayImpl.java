/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.Data;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.OtherInterplay;
import internship.moda.fig1.SocioTechnicalSystem;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Other Interplay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.OtherInterplayImpl#getData <em>Data</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.OtherInterplayImpl#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OtherInterplayImpl extends ModaRelationImpl implements OtherInterplay {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

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
	protected OtherInterplayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fig1Package.Literals.OTHER_INTERPLAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectWithInverseResolvingEList.ManyInverse<Data>(Data.class, this,
					Fig1Package.OTHER_INTERPLAY__DATA, Fig1Package.DATA__OTHERINTERPLAY);
		}
		return data;
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
							Fig1Package.OTHER_INTERPLAY__SOCIOTECHNICALSYSTEM, oldSociotechnicalsystem,
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
					Fig1Package.OTHER_INTERPLAY__SOCIOTECHNICALSYSTEM, oldSociotechnicalsystem,
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
						Fig1Package.SOCIO_TECHNICAL_SYSTEM__OTHERINTERPLAY, SocioTechnicalSystem.class, msgs);
			if (newSociotechnicalsystem != null)
				msgs = ((InternalEObject) newSociotechnicalsystem).eInverseAdd(this,
						Fig1Package.SOCIO_TECHNICAL_SYSTEM__OTHERINTERPLAY, SocioTechnicalSystem.class, msgs);
			msgs = basicSetSociotechnicalsystem(newSociotechnicalsystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.OTHER_INTERPLAY__SOCIOTECHNICALSYSTEM,
					newSociotechnicalsystem, newSociotechnicalsystem));
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
		case Fig1Package.OTHER_INTERPLAY__DATA:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getData()).basicAdd(otherEnd, msgs);
		case Fig1Package.OTHER_INTERPLAY__SOCIOTECHNICALSYSTEM:
			if (sociotechnicalsystem != null)
				msgs = ((InternalEObject) sociotechnicalsystem).eInverseRemove(this,
						Fig1Package.SOCIO_TECHNICAL_SYSTEM__OTHERINTERPLAY, SocioTechnicalSystem.class, msgs);
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
		case Fig1Package.OTHER_INTERPLAY__DATA:
			return ((InternalEList<?>) getData()).basicRemove(otherEnd, msgs);
		case Fig1Package.OTHER_INTERPLAY__SOCIOTECHNICALSYSTEM:
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
		case Fig1Package.OTHER_INTERPLAY__DATA:
			return getData();
		case Fig1Package.OTHER_INTERPLAY__SOCIOTECHNICALSYSTEM:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Fig1Package.OTHER_INTERPLAY__DATA:
			getData().clear();
			getData().addAll((Collection<? extends Data>) newValue);
			return;
		case Fig1Package.OTHER_INTERPLAY__SOCIOTECHNICALSYSTEM:
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
		case Fig1Package.OTHER_INTERPLAY__DATA:
			getData().clear();
			return;
		case Fig1Package.OTHER_INTERPLAY__SOCIOTECHNICALSYSTEM:
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
		case Fig1Package.OTHER_INTERPLAY__DATA:
			return data != null && !data.isEmpty();
		case Fig1Package.OTHER_INTERPLAY__SOCIOTECHNICALSYSTEM:
			return sociotechnicalsystem != null;
		}
		return super.eIsSet(featureID);
	}

} //OtherInterplayImpl
