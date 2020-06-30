/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.Data;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.Generalization;
import internship.moda.fig1.ModelRole;

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
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.GeneralizationImpl#getData <em>Data</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.GeneralizationImpl#getModelrole <em>Modelrole</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizationImpl extends ModaRelationImpl implements Generalization {
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
	 * The cached value of the '{@link #getModelrole() <em>Modelrole</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelrole()
	 * @generated
	 * @ordered
	 */
	protected ModelRole modelrole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fig1Package.Literals.GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectWithInverseResolvingEList<Data>(Data.class, this, Fig1Package.GENERALIZATION__DATA,
					Fig1Package.DATA__GENERALIZATION);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRole getModelrole() {
		if (modelrole != null && modelrole.eIsProxy()) {
			InternalEObject oldModelrole = (InternalEObject) modelrole;
			modelrole = (ModelRole) eResolveProxy(oldModelrole);
			if (modelrole != oldModelrole) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.GENERALIZATION__MODELROLE,
							oldModelrole, modelrole));
			}
		}
		return modelrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRole basicGetModelrole() {
		return modelrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelrole(ModelRole newModelrole, NotificationChain msgs) {
		ModelRole oldModelrole = modelrole;
		modelrole = newModelrole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.GENERALIZATION__MODELROLE, oldModelrole, newModelrole);
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
	public void setModelrole(ModelRole newModelrole) {
		if (newModelrole != modelrole) {
			NotificationChain msgs = null;
			if (modelrole != null)
				msgs = ((InternalEObject) modelrole).eInverseRemove(this, Fig1Package.MODEL_ROLE__GENERALIZATION,
						ModelRole.class, msgs);
			if (newModelrole != null)
				msgs = ((InternalEObject) newModelrole).eInverseAdd(this, Fig1Package.MODEL_ROLE__GENERALIZATION,
						ModelRole.class, msgs);
			msgs = basicSetModelrole(newModelrole, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.GENERALIZATION__MODELROLE, newModelrole,
					newModelrole));
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
		case Fig1Package.GENERALIZATION__DATA:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getData()).basicAdd(otherEnd, msgs);
		case Fig1Package.GENERALIZATION__MODELROLE:
			if (modelrole != null)
				msgs = ((InternalEObject) modelrole).eInverseRemove(this, Fig1Package.MODEL_ROLE__GENERALIZATION,
						ModelRole.class, msgs);
			return basicSetModelrole((ModelRole) otherEnd, msgs);
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
		case Fig1Package.GENERALIZATION__DATA:
			return ((InternalEList<?>) getData()).basicRemove(otherEnd, msgs);
		case Fig1Package.GENERALIZATION__MODELROLE:
			return basicSetModelrole(null, msgs);
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
		case Fig1Package.GENERALIZATION__DATA:
			return getData();
		case Fig1Package.GENERALIZATION__MODELROLE:
			if (resolve)
				return getModelrole();
			return basicGetModelrole();
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
		case Fig1Package.GENERALIZATION__DATA:
			getData().clear();
			getData().addAll((Collection<? extends Data>) newValue);
			return;
		case Fig1Package.GENERALIZATION__MODELROLE:
			setModelrole((ModelRole) newValue);
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
		case Fig1Package.GENERALIZATION__DATA:
			getData().clear();
			return;
		case Fig1Package.GENERALIZATION__MODELROLE:
			setModelrole((ModelRole) null);
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
		case Fig1Package.GENERALIZATION__DATA:
			return data != null && !data.isEmpty();
		case Fig1Package.GENERALIZATION__MODELROLE:
			return modelrole != null;
		}
		return super.eIsSet(featureID);
	}

} //GeneralizationImpl
