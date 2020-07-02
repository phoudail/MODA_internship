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
 *   <li>{@link internship.moda.fig1.impl.SoftwareImpl#getIincomingDeployment <em>Iincoming Deployment</em>}</li>
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
	 * The cached value of the '{@link #getIincomingDeployment() <em>Iincoming Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIincomingDeployment()
	 * @generated
	 * @ordered
	 */
	protected Deployment iincomingDeployment;

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
	public Deployment getIincomingDeployment() {
		if (iincomingDeployment != null && iincomingDeployment.eIsProxy()) {
			InternalEObject oldIincomingDeployment = (InternalEObject) iincomingDeployment;
			iincomingDeployment = (Deployment) eResolveProxy(oldIincomingDeployment);
			if (iincomingDeployment != oldIincomingDeployment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.SOFTWARE__IINCOMING_DEPLOYMENT, oldIincomingDeployment, iincomingDeployment));
			}
		}
		return iincomingDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment basicGetIincomingDeployment() {
		return iincomingDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIincomingDeployment(Deployment newIincomingDeployment, NotificationChain msgs) {
		Deployment oldIincomingDeployment = iincomingDeployment;
		iincomingDeployment = newIincomingDeployment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.SOFTWARE__IINCOMING_DEPLOYMENT, oldIincomingDeployment, newIincomingDeployment);
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
	public void setIincomingDeployment(Deployment newIincomingDeployment) {
		if (newIincomingDeployment != iincomingDeployment) {
			NotificationChain msgs = null;
			if (iincomingDeployment != null)
				msgs = ((InternalEObject) iincomingDeployment).eInverseRemove(this, Fig1Package.DEPLOYMENT__TARGET,
						Deployment.class, msgs);
			if (newIincomingDeployment != null)
				msgs = ((InternalEObject) newIincomingDeployment).eInverseAdd(this, Fig1Package.DEPLOYMENT__TARGET,
						Deployment.class, msgs);
			msgs = basicSetIincomingDeployment(newIincomingDeployment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.SOFTWARE__IINCOMING_DEPLOYMENT,
					newIincomingDeployment, newIincomingDeployment));
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
		case Fig1Package.SOFTWARE__IINCOMING_DEPLOYMENT:
			if (iincomingDeployment != null)
				msgs = ((InternalEObject) iincomingDeployment).eInverseRemove(this, Fig1Package.DEPLOYMENT__TARGET,
						Deployment.class, msgs);
			return basicSetIincomingDeployment((Deployment) otherEnd, msgs);
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
		case Fig1Package.SOFTWARE__IINCOMING_DEPLOYMENT:
			return basicSetIincomingDeployment(null, msgs);
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
		case Fig1Package.SOFTWARE__IINCOMING_DEPLOYMENT:
			if (resolve)
				return getIincomingDeployment();
			return basicGetIincomingDeployment();
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
		case Fig1Package.SOFTWARE__IINCOMING_DEPLOYMENT:
			setIincomingDeployment((Deployment) newValue);
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
		case Fig1Package.SOFTWARE__IINCOMING_DEPLOYMENT:
			setIincomingDeployment((Deployment) null);
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
		case Fig1Package.SOFTWARE__IINCOMING_DEPLOYMENT:
			return iincomingDeployment != null;
		}
		return super.eIsSet(featureID);
	}

} //SoftwareImpl
