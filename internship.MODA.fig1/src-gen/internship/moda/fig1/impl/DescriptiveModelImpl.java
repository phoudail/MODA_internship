/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.DescriptiveModel;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.Generalization;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Descriptive Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.DescriptiveModelImpl#getIncomingGeneralization <em>Incoming Generalization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescriptiveModelImpl extends ModelRoleImpl implements DescriptiveModel {
	/**
	 * The cached value of the '{@link #getIncomingGeneralization() <em>Incoming Generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingGeneralization()
	 * @generated
	 * @ordered
	 */
	protected Generalization incomingGeneralization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptiveModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fig1Package.Literals.DESCRIPTIVE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization getIncomingGeneralization() {
		if (incomingGeneralization != null && incomingGeneralization.eIsProxy()) {
			InternalEObject oldIncomingGeneralization = (InternalEObject) incomingGeneralization;
			incomingGeneralization = (Generalization) eResolveProxy(oldIncomingGeneralization);
			if (incomingGeneralization != oldIncomingGeneralization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.DESCRIPTIVE_MODEL__INCOMING_GENERALIZATION, oldIncomingGeneralization,
							incomingGeneralization));
			}
		}
		return incomingGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization basicGetIncomingGeneralization() {
		return incomingGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingGeneralization(Generalization newIncomingGeneralization,
			NotificationChain msgs) {
		Generalization oldIncomingGeneralization = incomingGeneralization;
		incomingGeneralization = newIncomingGeneralization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.DESCRIPTIVE_MODEL__INCOMING_GENERALIZATION, oldIncomingGeneralization,
					newIncomingGeneralization);
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
	public void setIncomingGeneralization(Generalization newIncomingGeneralization) {
		if (newIncomingGeneralization != incomingGeneralization) {
			NotificationChain msgs = null;
			if (incomingGeneralization != null)
				msgs = ((InternalEObject) incomingGeneralization).eInverseRemove(this,
						Fig1Package.GENERALIZATION__TARGET, Generalization.class, msgs);
			if (newIncomingGeneralization != null)
				msgs = ((InternalEObject) newIncomingGeneralization).eInverseAdd(this,
						Fig1Package.GENERALIZATION__TARGET, Generalization.class, msgs);
			msgs = basicSetIncomingGeneralization(newIncomingGeneralization, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Fig1Package.DESCRIPTIVE_MODEL__INCOMING_GENERALIZATION, newIncomingGeneralization,
					newIncomingGeneralization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fig1Package.DESCRIPTIVE_MODEL__INCOMING_GENERALIZATION:
			if (incomingGeneralization != null)
				msgs = ((InternalEObject) incomingGeneralization).eInverseRemove(this,
						Fig1Package.GENERALIZATION__TARGET, Generalization.class, msgs);
			return basicSetIncomingGeneralization((Generalization) otherEnd, msgs);
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
		case Fig1Package.DESCRIPTIVE_MODEL__INCOMING_GENERALIZATION:
			return basicSetIncomingGeneralization(null, msgs);
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
		case Fig1Package.DESCRIPTIVE_MODEL__INCOMING_GENERALIZATION:
			if (resolve)
				return getIncomingGeneralization();
			return basicGetIncomingGeneralization();
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
		case Fig1Package.DESCRIPTIVE_MODEL__INCOMING_GENERALIZATION:
			setIncomingGeneralization((Generalization) newValue);
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
		case Fig1Package.DESCRIPTIVE_MODEL__INCOMING_GENERALIZATION:
			setIncomingGeneralization((Generalization) null);
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
		case Fig1Package.DESCRIPTIVE_MODEL__INCOMING_GENERALIZATION:
			return incomingGeneralization != null;
		}
		return super.eIsSet(featureID);
	}

} //DescriptiveModelImpl
