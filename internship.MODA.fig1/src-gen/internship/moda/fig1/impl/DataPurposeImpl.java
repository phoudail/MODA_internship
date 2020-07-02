/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.Data;
import internship.moda.fig1.DataKind;
import internship.moda.fig1.DataPurpose;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.Software;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Purpose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.DataPurposeImpl#getData <em>Data</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.DataPurposeImpl#getSoftware <em>Software</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.DataPurposeImpl#getDataKind <em>Data Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataPurposeImpl extends ModaRelationImpl implements DataPurpose {
	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected Data data;

	/**
	 * The cached value of the '{@link #getSoftware() <em>Software</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware()
	 * @generated
	 * @ordered
	 */
	protected Software software;

	/**
	 * The default value of the '{@link #getDataKind() <em>Data Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataKind()
	 * @generated
	 * @ordered
	 */
	protected static final DataKind DATA_KIND_EDEFAULT = DataKind.INPUT_DATA;

	/**
	 * The cached value of the '{@link #getDataKind() <em>Data Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataKind()
	 * @generated
	 * @ordered
	 */
	protected DataKind dataKind = DATA_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPurposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fig1Package.Literals.DATA_PURPOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data getData() {
		if (data != null && data.eIsProxy()) {
			InternalEObject oldData = (InternalEObject) data;
			data = (Data) eResolveProxy(oldData);
			if (data != oldData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.DATA_PURPOSE__DATA, oldData,
							data));
			}
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Data basicGetData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetData(Data newData, NotificationChain msgs) {
		Data oldData = data;
		data = newData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.DATA_PURPOSE__DATA, oldData, newData);
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
	public void setData(Data newData) {
		if (newData != data) {
			NotificationChain msgs = null;
			if (data != null)
				msgs = ((InternalEObject) data).eInverseRemove(this, Fig1Package.DATA__DATAPURPOSE, Data.class, msgs);
			if (newData != null)
				msgs = ((InternalEObject) newData).eInverseAdd(this, Fig1Package.DATA__DATAPURPOSE, Data.class, msgs);
			msgs = basicSetData(newData, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.DATA_PURPOSE__DATA, newData, newData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Software getSoftware() {
		if (software != null && software.eIsProxy()) {
			InternalEObject oldSoftware = (InternalEObject) software;
			software = (Software) eResolveProxy(oldSoftware);
			if (software != oldSoftware) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.DATA_PURPOSE__SOFTWARE,
							oldSoftware, software));
			}
		}
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Software basicGetSoftware() {
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftware(Software newSoftware, NotificationChain msgs) {
		Software oldSoftware = software;
		software = newSoftware;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.DATA_PURPOSE__SOFTWARE, oldSoftware, newSoftware);
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
	public void setSoftware(Software newSoftware) {
		if (newSoftware != software) {
			NotificationChain msgs = null;
			if (software != null)
				msgs = ((InternalEObject) software).eInverseRemove(this, Fig1Package.SOFTWARE__PROCESSING,
						Software.class, msgs);
			if (newSoftware != null)
				msgs = ((InternalEObject) newSoftware).eInverseAdd(this, Fig1Package.SOFTWARE__PROCESSING,
						Software.class, msgs);
			msgs = basicSetSoftware(newSoftware, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.DATA_PURPOSE__SOFTWARE, newSoftware,
					newSoftware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataKind getDataKind() {
		return dataKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataKind(DataKind newDataKind) {
		DataKind oldDataKind = dataKind;
		dataKind = newDataKind == null ? DATA_KIND_EDEFAULT : newDataKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.DATA_PURPOSE__DATA_KIND, oldDataKind,
					dataKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fig1Package.DATA_PURPOSE__DATA:
			if (data != null)
				msgs = ((InternalEObject) data).eInverseRemove(this, Fig1Package.DATA__DATAPURPOSE, Data.class, msgs);
			return basicSetData((Data) otherEnd, msgs);
		case Fig1Package.DATA_PURPOSE__SOFTWARE:
			if (software != null)
				msgs = ((InternalEObject) software).eInverseRemove(this, Fig1Package.SOFTWARE__PROCESSING,
						Software.class, msgs);
			return basicSetSoftware((Software) otherEnd, msgs);
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
		case Fig1Package.DATA_PURPOSE__DATA:
			return basicSetData(null, msgs);
		case Fig1Package.DATA_PURPOSE__SOFTWARE:
			return basicSetSoftware(null, msgs);
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
		case Fig1Package.DATA_PURPOSE__DATA:
			if (resolve)
				return getData();
			return basicGetData();
		case Fig1Package.DATA_PURPOSE__SOFTWARE:
			if (resolve)
				return getSoftware();
			return basicGetSoftware();
		case Fig1Package.DATA_PURPOSE__DATA_KIND:
			return getDataKind();
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
		case Fig1Package.DATA_PURPOSE__DATA:
			setData((Data) newValue);
			return;
		case Fig1Package.DATA_PURPOSE__SOFTWARE:
			setSoftware((Software) newValue);
			return;
		case Fig1Package.DATA_PURPOSE__DATA_KIND:
			setDataKind((DataKind) newValue);
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
		case Fig1Package.DATA_PURPOSE__DATA:
			setData((Data) null);
			return;
		case Fig1Package.DATA_PURPOSE__SOFTWARE:
			setSoftware((Software) null);
			return;
		case Fig1Package.DATA_PURPOSE__DATA_KIND:
			setDataKind(DATA_KIND_EDEFAULT);
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
		case Fig1Package.DATA_PURPOSE__DATA:
			return data != null;
		case Fig1Package.DATA_PURPOSE__SOFTWARE:
			return software != null;
		case Fig1Package.DATA_PURPOSE__DATA_KIND:
			return dataKind != DATA_KIND_EDEFAULT;
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
		result.append(" (dataKind: ");
		result.append(dataKind);
		result.append(')');
		return result.toString();
	}

} //DataPurposeImpl
