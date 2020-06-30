/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.DataPurpose;
import internship.moda.fig1.Deployment;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.Software;

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
 * An implementation of the model object '<em><b>Software</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.SoftwareImpl#getProcessing <em>Processing</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.SoftwareImpl#getDeployedModel <em>Deployed Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareImpl extends ModaNodeImpl implements Software {
	/**
	 * The cached value of the '{@link #getProcessing() <em>Processing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessing()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPurpose> processing;

	/**
	 * The cached value of the '{@link #getDeployedModel() <em>Deployed Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployedModel()
	 * @generated
	 * @ordered
	 */
	protected Deployment deployedModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoftwareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fig1Package.Literals.SOFTWARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPurpose> getProcessing() {
		if (processing == null) {
			processing = new EObjectWithInverseResolvingEList<DataPurpose>(DataPurpose.class, this,
					Fig1Package.SOFTWARE__PROCESSING, Fig1Package.DATA_PURPOSE__SOFTWARE);
		}
		return processing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployedModel() {
		if (deployedModel != null && deployedModel.eIsProxy()) {
			InternalEObject oldDeployedModel = (InternalEObject) deployedModel;
			deployedModel = (Deployment) eResolveProxy(oldDeployedModel);
			if (deployedModel != oldDeployedModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.SOFTWARE__DEPLOYED_MODEL,
							oldDeployedModel, deployedModel));
			}
		}
		return deployedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment basicGetDeployedModel() {
		return deployedModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployedModel(Deployment newDeployedModel, NotificationChain msgs) {
		Deployment oldDeployedModel = deployedModel;
		deployedModel = newDeployedModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.SOFTWARE__DEPLOYED_MODEL, oldDeployedModel, newDeployedModel);
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
	public void setDeployedModel(Deployment newDeployedModel) {
		if (newDeployedModel != deployedModel) {
			NotificationChain msgs = null;
			if (deployedModel != null)
				msgs = ((InternalEObject) deployedModel).eInverseRemove(this, Fig1Package.DEPLOYMENT__SOFTWARE,
						Deployment.class, msgs);
			if (newDeployedModel != null)
				msgs = ((InternalEObject) newDeployedModel).eInverseAdd(this, Fig1Package.DEPLOYMENT__SOFTWARE,
						Deployment.class, msgs);
			msgs = basicSetDeployedModel(newDeployedModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.SOFTWARE__DEPLOYED_MODEL,
					newDeployedModel, newDeployedModel));
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
		case Fig1Package.SOFTWARE__PROCESSING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getProcessing()).basicAdd(otherEnd, msgs);
		case Fig1Package.SOFTWARE__DEPLOYED_MODEL:
			if (deployedModel != null)
				msgs = ((InternalEObject) deployedModel).eInverseRemove(this, Fig1Package.DEPLOYMENT__SOFTWARE,
						Deployment.class, msgs);
			return basicSetDeployedModel((Deployment) otherEnd, msgs);
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
		case Fig1Package.SOFTWARE__PROCESSING:
			return ((InternalEList<?>) getProcessing()).basicRemove(otherEnd, msgs);
		case Fig1Package.SOFTWARE__DEPLOYED_MODEL:
			return basicSetDeployedModel(null, msgs);
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
		case Fig1Package.SOFTWARE__PROCESSING:
			return getProcessing();
		case Fig1Package.SOFTWARE__DEPLOYED_MODEL:
			if (resolve)
				return getDeployedModel();
			return basicGetDeployedModel();
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
		case Fig1Package.SOFTWARE__PROCESSING:
			getProcessing().clear();
			getProcessing().addAll((Collection<? extends DataPurpose>) newValue);
			return;
		case Fig1Package.SOFTWARE__DEPLOYED_MODEL:
			setDeployedModel((Deployment) newValue);
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
		case Fig1Package.SOFTWARE__PROCESSING:
			getProcessing().clear();
			return;
		case Fig1Package.SOFTWARE__DEPLOYED_MODEL:
			setDeployedModel((Deployment) null);
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
		case Fig1Package.SOFTWARE__PROCESSING:
			return processing != null && !processing.isEmpty();
		case Fig1Package.SOFTWARE__DEPLOYED_MODEL:
			return deployedModel != null;
		}
		return super.eIsSet(featureID);
	}

} //SoftwareImpl
