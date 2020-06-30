/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.DescriptiveModel;
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
 * An implementation of the model object '<em><b>Preparation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.PreparationImpl#getDescriptivemodel <em>Descriptivemodel</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.PreparationImpl#getPredictivemodel <em>Predictivemodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PreparationImpl extends ModaRelationImpl implements Preparation {
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
	 * The cached value of the '{@link #getPredictivemodel() <em>Predictivemodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredictivemodel()
	 * @generated
	 * @ordered
	 */
	protected PredictiveModel predictivemodel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreparationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fig1Package.Literals.PREPARATION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.PREPARATION__DESCRIPTIVEMODEL,
							oldDescriptivemodel, descriptivemodel));
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
					Fig1Package.PREPARATION__DESCRIPTIVEMODEL, oldDescriptivemodel, newDescriptivemodel);
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
						Fig1Package.DESCRIPTIVE_MODEL__PREPARATION, DescriptiveModel.class, msgs);
			if (newDescriptivemodel != null)
				msgs = ((InternalEObject) newDescriptivemodel).eInverseAdd(this,
						Fig1Package.DESCRIPTIVE_MODEL__PREPARATION, DescriptiveModel.class, msgs);
			msgs = basicSetDescriptivemodel(newDescriptivemodel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.PREPARATION__DESCRIPTIVEMODEL,
					newDescriptivemodel, newDescriptivemodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredictiveModel getPredictivemodel() {
		if (predictivemodel != null && predictivemodel.eIsProxy()) {
			InternalEObject oldPredictivemodel = (InternalEObject) predictivemodel;
			predictivemodel = (PredictiveModel) eResolveProxy(oldPredictivemodel);
			if (predictivemodel != oldPredictivemodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.PREPARATION__PREDICTIVEMODEL,
							oldPredictivemodel, predictivemodel));
			}
		}
		return predictivemodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredictiveModel basicGetPredictivemodel() {
		return predictivemodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredictivemodel(PredictiveModel newPredictivemodel, NotificationChain msgs) {
		PredictiveModel oldPredictivemodel = predictivemodel;
		predictivemodel = newPredictivemodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.PREPARATION__PREDICTIVEMODEL, oldPredictivemodel, newPredictivemodel);
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
	public void setPredictivemodel(PredictiveModel newPredictivemodel) {
		if (newPredictivemodel != predictivemodel) {
			NotificationChain msgs = null;
			if (predictivemodel != null)
				msgs = ((InternalEObject) predictivemodel).eInverseRemove(this,
						Fig1Package.PREDICTIVE_MODEL__PREPARATION, PredictiveModel.class, msgs);
			if (newPredictivemodel != null)
				msgs = ((InternalEObject) newPredictivemodel).eInverseAdd(this,
						Fig1Package.PREDICTIVE_MODEL__PREPARATION, PredictiveModel.class, msgs);
			msgs = basicSetPredictivemodel(newPredictivemodel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.PREPARATION__PREDICTIVEMODEL,
					newPredictivemodel, newPredictivemodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fig1Package.PREPARATION__DESCRIPTIVEMODEL:
			if (descriptivemodel != null)
				msgs = ((InternalEObject) descriptivemodel).eInverseRemove(this,
						Fig1Package.DESCRIPTIVE_MODEL__PREPARATION, DescriptiveModel.class, msgs);
			return basicSetDescriptivemodel((DescriptiveModel) otherEnd, msgs);
		case Fig1Package.PREPARATION__PREDICTIVEMODEL:
			if (predictivemodel != null)
				msgs = ((InternalEObject) predictivemodel).eInverseRemove(this,
						Fig1Package.PREDICTIVE_MODEL__PREPARATION, PredictiveModel.class, msgs);
			return basicSetPredictivemodel((PredictiveModel) otherEnd, msgs);
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
		case Fig1Package.PREPARATION__DESCRIPTIVEMODEL:
			return basicSetDescriptivemodel(null, msgs);
		case Fig1Package.PREPARATION__PREDICTIVEMODEL:
			return basicSetPredictivemodel(null, msgs);
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
		case Fig1Package.PREPARATION__DESCRIPTIVEMODEL:
			if (resolve)
				return getDescriptivemodel();
			return basicGetDescriptivemodel();
		case Fig1Package.PREPARATION__PREDICTIVEMODEL:
			if (resolve)
				return getPredictivemodel();
			return basicGetPredictivemodel();
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
		case Fig1Package.PREPARATION__DESCRIPTIVEMODEL:
			setDescriptivemodel((DescriptiveModel) newValue);
			return;
		case Fig1Package.PREPARATION__PREDICTIVEMODEL:
			setPredictivemodel((PredictiveModel) newValue);
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
		case Fig1Package.PREPARATION__DESCRIPTIVEMODEL:
			setDescriptivemodel((DescriptiveModel) null);
			return;
		case Fig1Package.PREPARATION__PREDICTIVEMODEL:
			setPredictivemodel((PredictiveModel) null);
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
		case Fig1Package.PREPARATION__DESCRIPTIVEMODEL:
			return descriptivemodel != null;
		case Fig1Package.PREPARATION__PREDICTIVEMODEL:
			return predictivemodel != null;
		}
		return super.eIsSet(featureID);
	}

} //PreparationImpl
