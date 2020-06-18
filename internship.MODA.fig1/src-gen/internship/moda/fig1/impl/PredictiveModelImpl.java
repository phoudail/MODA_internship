/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.DescriptiveModel;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.PredictiveModel;

import org.eclipse.emf.common.notify.Notification;

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
 *   <li>{@link internship.moda.fig1.impl.PredictiveModelImpl#getDescriptivemodel <em>Descriptivemodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredictiveModelImpl extends ModelImpl implements PredictiveModel {
	/**
	 * The cached value of the '{@link #getDescriptivemodel() <em>Descriptivemodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptivemodel()
	 * @generated
	 * @ordered
	 */
	protected DescriptiveModel descriptivemodel;

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
	public DescriptiveModel getDescriptivemodel() {
		if (descriptivemodel != null && descriptivemodel.eIsProxy()) {
			InternalEObject oldDescriptivemodel = (InternalEObject) descriptivemodel;
			descriptivemodel = (DescriptiveModel) eResolveProxy(oldDescriptivemodel);
			if (descriptivemodel != oldDescriptivemodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.PREDICTIVE_MODEL__DESCRIPTIVEMODEL, oldDescriptivemodel, descriptivemodel));
			}
		}
		return descriptivemodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptiveModel basicGetDescriptivemodel() {
		return descriptivemodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptivemodel(DescriptiveModel newDescriptivemodel) {
		DescriptiveModel oldDescriptivemodel = descriptivemodel;
		descriptivemodel = newDescriptivemodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.PREDICTIVE_MODEL__DESCRIPTIVEMODEL,
					oldDescriptivemodel, descriptivemodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Fig1Package.PREDICTIVE_MODEL__DESCRIPTIVEMODEL:
			if (resolve)
				return getDescriptivemodel();
			return basicGetDescriptivemodel();
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
		case Fig1Package.PREDICTIVE_MODEL__DESCRIPTIVEMODEL:
			setDescriptivemodel((DescriptiveModel) newValue);
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
		case Fig1Package.PREDICTIVE_MODEL__DESCRIPTIVEMODEL:
			setDescriptivemodel((DescriptiveModel) null);
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
		case Fig1Package.PREDICTIVE_MODEL__DESCRIPTIVEMODEL:
			return descriptivemodel != null;
		}
		return super.eIsSet(featureID);
	}

} //PredictiveModelImpl
