/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.PredictiveModel;
import internship.moda.fig1.Preparation;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Predictive Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.PredictiveModelImpl#getIncomingPreparation <em>Incoming Preparation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredictiveModelImpl extends ModelRoleImpl implements PredictiveModel {
	/**
	 * The cached value of the '{@link #getIncomingPreparation() <em>Incoming Preparation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingPreparation()
	 * @generated
	 * @ordered
	 */
	protected Preparation incomingPreparation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PredictiveModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fig1Package.Literals.PREDICTIVE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preparation getIncomingPreparation() {
		if (incomingPreparation != null && incomingPreparation.eIsProxy()) {
			InternalEObject oldIncomingPreparation = (InternalEObject) incomingPreparation;
			incomingPreparation = (Preparation) eResolveProxy(oldIncomingPreparation);
			if (incomingPreparation != oldIncomingPreparation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.PREDICTIVE_MODEL__INCOMING_PREPARATION, oldIncomingPreparation,
							incomingPreparation));
			}
		}
		return incomingPreparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preparation basicGetIncomingPreparation() {
		return incomingPreparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingPreparation(Preparation newIncomingPreparation, NotificationChain msgs) {
		Preparation oldIncomingPreparation = incomingPreparation;
		incomingPreparation = newIncomingPreparation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.PREDICTIVE_MODEL__INCOMING_PREPARATION, oldIncomingPreparation, newIncomingPreparation);
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
	public void setIncomingPreparation(Preparation newIncomingPreparation) {
		if (newIncomingPreparation != incomingPreparation) {
			NotificationChain msgs = null;
			if (incomingPreparation != null)
				msgs = ((InternalEObject) incomingPreparation).eInverseRemove(this, Fig1Package.PREPARATION__TARGET,
						Preparation.class, msgs);
			if (newIncomingPreparation != null)
				msgs = ((InternalEObject) newIncomingPreparation).eInverseAdd(this, Fig1Package.PREPARATION__TARGET,
						Preparation.class, msgs);
			msgs = basicSetIncomingPreparation(newIncomingPreparation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.PREDICTIVE_MODEL__INCOMING_PREPARATION,
					newIncomingPreparation, newIncomingPreparation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fig1Package.PREDICTIVE_MODEL__INCOMING_PREPARATION:
			if (incomingPreparation != null)
				msgs = ((InternalEObject) incomingPreparation).eInverseRemove(this, Fig1Package.PREPARATION__TARGET,
						Preparation.class, msgs);
			return basicSetIncomingPreparation((Preparation) otherEnd, msgs);
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
		case Fig1Package.PREDICTIVE_MODEL__INCOMING_PREPARATION:
			return basicSetIncomingPreparation(null, msgs);
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
		case Fig1Package.PREDICTIVE_MODEL__INCOMING_PREPARATION:
			if (resolve)
				return getIncomingPreparation();
			return basicGetIncomingPreparation();
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
		case Fig1Package.PREDICTIVE_MODEL__INCOMING_PREPARATION:
			setIncomingPreparation((Preparation) newValue);
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
		case Fig1Package.PREDICTIVE_MODEL__INCOMING_PREPARATION:
			setIncomingPreparation((Preparation) null);
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
		case Fig1Package.PREDICTIVE_MODEL__INCOMING_PREPARATION:
			return incomingPreparation != null;
		}
		return super.eIsSet(featureID);
	}

} //PredictiveModelImpl
