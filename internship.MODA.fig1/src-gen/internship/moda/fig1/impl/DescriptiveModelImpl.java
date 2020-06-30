/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.DescriptiveModel;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.Preparation;
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
 *   <li>{@link internship.moda.fig1.impl.DescriptiveModelImpl#getPreparation <em>Preparation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DescriptiveModelImpl extends ModelRoleImpl implements DescriptiveModel {
	/**
	 * The cached value of the '{@link #getPreparation() <em>Preparation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreparation()
	 * @generated
	 * @ordered
	 */
	protected Preparation preparation;

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
	public Preparation getPreparation() {
		if (preparation != null && preparation.eIsProxy()) {
			InternalEObject oldPreparation = (InternalEObject) preparation;
			preparation = (Preparation) eResolveProxy(oldPreparation);
			if (preparation != oldPreparation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.DESCRIPTIVE_MODEL__PREPARATION, oldPreparation, preparation));
			}
		}
		return preparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preparation basicGetPreparation() {
		return preparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreparation(Preparation newPreparation, NotificationChain msgs) {
		Preparation oldPreparation = preparation;
		preparation = newPreparation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.DESCRIPTIVE_MODEL__PREPARATION, oldPreparation, newPreparation);
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
	public void setPreparation(Preparation newPreparation) {
		if (newPreparation != preparation) {
			NotificationChain msgs = null;
			if (preparation != null)
				msgs = ((InternalEObject) preparation).eInverseRemove(this, Fig1Package.PREPARATION__DESCRIPTIVEMODEL,
						Preparation.class, msgs);
			if (newPreparation != null)
				msgs = ((InternalEObject) newPreparation).eInverseAdd(this, Fig1Package.PREPARATION__DESCRIPTIVEMODEL,
						Preparation.class, msgs);
			msgs = basicSetPreparation(newPreparation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.DESCRIPTIVE_MODEL__PREPARATION,
					newPreparation, newPreparation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fig1Package.DESCRIPTIVE_MODEL__PREPARATION:
			if (preparation != null)
				msgs = ((InternalEObject) preparation).eInverseRemove(this, Fig1Package.PREPARATION__DESCRIPTIVEMODEL,
						Preparation.class, msgs);
			return basicSetPreparation((Preparation) otherEnd, msgs);
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
		case Fig1Package.DESCRIPTIVE_MODEL__PREPARATION:
			return basicSetPreparation(null, msgs);
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
		case Fig1Package.DESCRIPTIVE_MODEL__PREPARATION:
			if (resolve)
				return getPreparation();
			return basicGetPreparation();
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
		case Fig1Package.DESCRIPTIVE_MODEL__PREPARATION:
			setPreparation((Preparation) newValue);
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
		case Fig1Package.DESCRIPTIVE_MODEL__PREPARATION:
			setPreparation((Preparation) null);
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
		case Fig1Package.DESCRIPTIVE_MODEL__PREPARATION:
			return preparation != null;
		}
		return super.eIsSet(featureID);
	}

} //DescriptiveModelImpl
