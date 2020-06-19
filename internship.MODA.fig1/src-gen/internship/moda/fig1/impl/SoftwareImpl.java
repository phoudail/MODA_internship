/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.Data;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.PrescriptiveModel;
import internship.moda.fig1.Software;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
 *   <li>{@link internship.moda.fig1.impl.SoftwareImpl#getState <em>State</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.SoftwareImpl#getName <em>Name</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.SoftwareImpl#getData <em>Data</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.SoftwareImpl#getPrescriptivemodel <em>Prescriptivemodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareImpl extends MinimalEObjectImpl.Container implements Software {
	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getPrescriptivemodel() <em>Prescriptivemodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptivemodel()
	 * @generated
	 * @ordered
	 */
	protected PrescriptiveModel prescriptivemodel;

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
	public PrescriptiveModel getPrescriptivemodel() {
		if (prescriptivemodel != null && prescriptivemodel.eIsProxy()) {
			InternalEObject oldPrescriptivemodel = (InternalEObject) prescriptivemodel;
			prescriptivemodel = (PrescriptiveModel) eResolveProxy(oldPrescriptivemodel);
			if (prescriptivemodel != oldPrescriptivemodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.SOFTWARE__PRESCRIPTIVEMODEL,
							oldPrescriptivemodel, prescriptivemodel));
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
					Fig1Package.SOFTWARE__PRESCRIPTIVEMODEL, oldPrescriptivemodel, newPrescriptivemodel);
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
						Fig1Package.PRESCRIPTIVE_MODEL__SOFTWARE, PrescriptiveModel.class, msgs);
			if (newPrescriptivemodel != null)
				msgs = ((InternalEObject) newPrescriptivemodel).eInverseAdd(this,
						Fig1Package.PRESCRIPTIVE_MODEL__SOFTWARE, PrescriptiveModel.class, msgs);
			msgs = basicSetPrescriptivemodel(newPrescriptivemodel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.SOFTWARE__PRESCRIPTIVEMODEL,
					newPrescriptivemodel, newPrescriptivemodel));
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
		case Fig1Package.SOFTWARE__DATA:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getData()).basicAdd(otherEnd, msgs);
		case Fig1Package.SOFTWARE__PRESCRIPTIVEMODEL:
			if (prescriptivemodel != null)
				msgs = ((InternalEObject) prescriptivemodel).eInverseRemove(this,
						Fig1Package.PRESCRIPTIVE_MODEL__SOFTWARE, PrescriptiveModel.class, msgs);
			return basicSetPrescriptivemodel((PrescriptiveModel) otherEnd, msgs);
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
		case Fig1Package.SOFTWARE__DATA:
			return ((InternalEList<?>) getData()).basicRemove(otherEnd, msgs);
		case Fig1Package.SOFTWARE__PRESCRIPTIVEMODEL:
			return basicSetPrescriptivemodel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.SOFTWARE__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.SOFTWARE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectWithInverseResolvingEList<Data>(Data.class, this, Fig1Package.SOFTWARE__DATA,
					Fig1Package.DATA__SOFTWARE);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Fig1Package.SOFTWARE__STATE:
			return getState();
		case Fig1Package.SOFTWARE__NAME:
			return getName();
		case Fig1Package.SOFTWARE__DATA:
			return getData();
		case Fig1Package.SOFTWARE__PRESCRIPTIVEMODEL:
			if (resolve)
				return getPrescriptivemodel();
			return basicGetPrescriptivemodel();
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
		case Fig1Package.SOFTWARE__STATE:
			setState((String) newValue);
			return;
		case Fig1Package.SOFTWARE__NAME:
			setName((String) newValue);
			return;
		case Fig1Package.SOFTWARE__DATA:
			getData().clear();
			getData().addAll((Collection<? extends Data>) newValue);
			return;
		case Fig1Package.SOFTWARE__PRESCRIPTIVEMODEL:
			setPrescriptivemodel((PrescriptiveModel) newValue);
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
		case Fig1Package.SOFTWARE__STATE:
			setState(STATE_EDEFAULT);
			return;
		case Fig1Package.SOFTWARE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Fig1Package.SOFTWARE__DATA:
			getData().clear();
			return;
		case Fig1Package.SOFTWARE__PRESCRIPTIVEMODEL:
			setPrescriptivemodel((PrescriptiveModel) null);
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
		case Fig1Package.SOFTWARE__STATE:
			return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
		case Fig1Package.SOFTWARE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Fig1Package.SOFTWARE__DATA:
			return data != null && !data.isEmpty();
		case Fig1Package.SOFTWARE__PRESCRIPTIVEMODEL:
			return prescriptivemodel != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (state: ");
		result.append(state);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SoftwareImpl
