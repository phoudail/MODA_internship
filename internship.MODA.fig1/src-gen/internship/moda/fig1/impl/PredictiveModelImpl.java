/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.DescriptiveModel;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.PredictiveModel;

import internship.moda.fig1.PrescriptiveModel;
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
 *   <li>{@link internship.moda.fig1.impl.PredictiveModelImpl#getPrescriptivemodel <em>Prescriptivemodel</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.PredictiveModelImpl#getDescriptivemodel <em>Descriptivemodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredictiveModelImpl extends ModelRoleImpl implements PredictiveModel {
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
	public PrescriptiveModel getPrescriptivemodel() {
		if (prescriptivemodel != null && prescriptivemodel.eIsProxy()) {
			InternalEObject oldPrescriptivemodel = (InternalEObject) prescriptivemodel;
			prescriptivemodel = (PrescriptiveModel) eResolveProxy(oldPrescriptivemodel);
			if (prescriptivemodel != oldPrescriptivemodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.PREDICTIVE_MODEL__PRESCRIPTIVEMODEL, oldPrescriptivemodel, prescriptivemodel));
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
					Fig1Package.PREDICTIVE_MODEL__PRESCRIPTIVEMODEL, oldPrescriptivemodel, newPrescriptivemodel);
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
						Fig1Package.PRESCRIPTIVE_MODEL__PREDICTIVEMODEL, PrescriptiveModel.class, msgs);
			if (newPrescriptivemodel != null)
				msgs = ((InternalEObject) newPrescriptivemodel).eInverseAdd(this,
						Fig1Package.PRESCRIPTIVE_MODEL__PREDICTIVEMODEL, PrescriptiveModel.class, msgs);
			msgs = basicSetPrescriptivemodel(newPrescriptivemodel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.PREDICTIVE_MODEL__PRESCRIPTIVEMODEL,
					newPrescriptivemodel, newPrescriptivemodel));
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
	public NotificationChain basicSetDescriptivemodel(DescriptiveModel newDescriptivemodel, NotificationChain msgs) {
		DescriptiveModel oldDescriptivemodel = descriptivemodel;
		descriptivemodel = newDescriptivemodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.PREDICTIVE_MODEL__DESCRIPTIVEMODEL, oldDescriptivemodel, newDescriptivemodel);
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
	public void setDescriptivemodel(DescriptiveModel newDescriptivemodel) {
		if (newDescriptivemodel != descriptivemodel) {
			NotificationChain msgs = null;
			if (descriptivemodel != null)
				msgs = ((InternalEObject) descriptivemodel).eInverseRemove(this,
						Fig1Package.DESCRIPTIVE_MODEL__PREDICTIVEMODEL, DescriptiveModel.class, msgs);
			if (newDescriptivemodel != null)
				msgs = ((InternalEObject) newDescriptivemodel).eInverseAdd(this,
						Fig1Package.DESCRIPTIVE_MODEL__PREDICTIVEMODEL, DescriptiveModel.class, msgs);
			msgs = basicSetDescriptivemodel(newDescriptivemodel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.PREDICTIVE_MODEL__DESCRIPTIVEMODEL,
					newDescriptivemodel, newDescriptivemodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fig1Package.PREDICTIVE_MODEL__PRESCRIPTIVEMODEL:
			if (prescriptivemodel != null)
				msgs = ((InternalEObject) prescriptivemodel).eInverseRemove(this,
						Fig1Package.PRESCRIPTIVE_MODEL__PREDICTIVEMODEL, PrescriptiveModel.class, msgs);
			return basicSetPrescriptivemodel((PrescriptiveModel) otherEnd, msgs);
		case Fig1Package.PREDICTIVE_MODEL__DESCRIPTIVEMODEL:
			if (descriptivemodel != null)
				msgs = ((InternalEObject) descriptivemodel).eInverseRemove(this,
						Fig1Package.DESCRIPTIVE_MODEL__PREDICTIVEMODEL, DescriptiveModel.class, msgs);
			return basicSetDescriptivemodel((DescriptiveModel) otherEnd, msgs);
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
		case Fig1Package.PREDICTIVE_MODEL__PRESCRIPTIVEMODEL:
			return basicSetPrescriptivemodel(null, msgs);
		case Fig1Package.PREDICTIVE_MODEL__DESCRIPTIVEMODEL:
			return basicSetDescriptivemodel(null, msgs);
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
		case Fig1Package.PREDICTIVE_MODEL__PRESCRIPTIVEMODEL:
			if (resolve)
				return getPrescriptivemodel();
			return basicGetPrescriptivemodel();
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
		case Fig1Package.PREDICTIVE_MODEL__PRESCRIPTIVEMODEL:
			setPrescriptivemodel((PrescriptiveModel) newValue);
			return;
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
		case Fig1Package.PREDICTIVE_MODEL__PRESCRIPTIVEMODEL:
			setPrescriptivemodel((PrescriptiveModel) null);
			return;
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
		case Fig1Package.PREDICTIVE_MODEL__PRESCRIPTIVEMODEL:
			return prescriptivemodel != null;
		case Fig1Package.PREDICTIVE_MODEL__DESCRIPTIVEMODEL:
			return descriptivemodel != null;
		}
		return super.eIsSet(featureID);
	}

} //PredictiveModelImpl
