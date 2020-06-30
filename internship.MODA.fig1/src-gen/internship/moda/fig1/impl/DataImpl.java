/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.Data;
import internship.moda.fig1.DataPurpose;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.Generalization;
import internship.moda.fig1.OtherInterplay;
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
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.DataImpl#getOtherinterplay <em>Otherinterplay</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.DataImpl#getProcessing <em>Processing</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.DataImpl#getGeneralization <em>Generalization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataImpl extends ModaNodeImpl implements Data {
	/**
	 * The cached value of the '{@link #getOtherinterplay() <em>Otherinterplay</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherinterplay()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherInterplay> otherinterplay;

	/**
	 * The cached value of the '{@link #getProcessing() <em>Processing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessing()
	 * @generated
	 * @ordered
	 */
	protected DataPurpose processing;

	/**
	 * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization()
	 * @generated
	 * @ordered
	 */
	protected Generalization generalization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fig1Package.Literals.DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherInterplay> getOtherinterplay() {
		if (otherinterplay == null) {
			otherinterplay = new EObjectWithInverseResolvingEList.ManyInverse<OtherInterplay>(OtherInterplay.class,
					this, Fig1Package.DATA__OTHERINTERPLAY, Fig1Package.OTHER_INTERPLAY__DATA);
		}
		return otherinterplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPurpose getProcessing() {
		if (processing != null && processing.eIsProxy()) {
			InternalEObject oldProcessing = (InternalEObject) processing;
			processing = (DataPurpose) eResolveProxy(oldProcessing);
			if (processing != oldProcessing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.DATA__PROCESSING,
							oldProcessing, processing));
			}
		}
		return processing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPurpose basicGetProcessing() {
		return processing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessing(DataPurpose newProcessing, NotificationChain msgs) {
		DataPurpose oldProcessing = processing;
		processing = newProcessing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fig1Package.DATA__PROCESSING,
					oldProcessing, newProcessing);
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
	public void setProcessing(DataPurpose newProcessing) {
		if (newProcessing != processing) {
			NotificationChain msgs = null;
			if (processing != null)
				msgs = ((InternalEObject) processing).eInverseRemove(this, Fig1Package.DATA_PURPOSE__DATA,
						DataPurpose.class, msgs);
			if (newProcessing != null)
				msgs = ((InternalEObject) newProcessing).eInverseAdd(this, Fig1Package.DATA_PURPOSE__DATA,
						DataPurpose.class, msgs);
			msgs = basicSetProcessing(newProcessing, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.DATA__PROCESSING, newProcessing,
					newProcessing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization getGeneralization() {
		if (generalization != null && generalization.eIsProxy()) {
			InternalEObject oldGeneralization = (InternalEObject) generalization;
			generalization = (Generalization) eResolveProxy(oldGeneralization);
			if (generalization != oldGeneralization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.DATA__GENERALIZATION,
							oldGeneralization, generalization));
			}
		}
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization basicGetGeneralization() {
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralization(Generalization newGeneralization, NotificationChain msgs) {
		Generalization oldGeneralization = generalization;
		generalization = newGeneralization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.DATA__GENERALIZATION, oldGeneralization, newGeneralization);
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
	public void setGeneralization(Generalization newGeneralization) {
		if (newGeneralization != generalization) {
			NotificationChain msgs = null;
			if (generalization != null)
				msgs = ((InternalEObject) generalization).eInverseRemove(this, Fig1Package.GENERALIZATION__DATA,
						Generalization.class, msgs);
			if (newGeneralization != null)
				msgs = ((InternalEObject) newGeneralization).eInverseAdd(this, Fig1Package.GENERALIZATION__DATA,
						Generalization.class, msgs);
			msgs = basicSetGeneralization(newGeneralization, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.DATA__GENERALIZATION, newGeneralization,
					newGeneralization));
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
		case Fig1Package.DATA__OTHERINTERPLAY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOtherinterplay()).basicAdd(otherEnd, msgs);
		case Fig1Package.DATA__PROCESSING:
			if (processing != null)
				msgs = ((InternalEObject) processing).eInverseRemove(this, Fig1Package.DATA_PURPOSE__DATA,
						DataPurpose.class, msgs);
			return basicSetProcessing((DataPurpose) otherEnd, msgs);
		case Fig1Package.DATA__GENERALIZATION:
			if (generalization != null)
				msgs = ((InternalEObject) generalization).eInverseRemove(this, Fig1Package.GENERALIZATION__DATA,
						Generalization.class, msgs);
			return basicSetGeneralization((Generalization) otherEnd, msgs);
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
		case Fig1Package.DATA__OTHERINTERPLAY:
			return ((InternalEList<?>) getOtherinterplay()).basicRemove(otherEnd, msgs);
		case Fig1Package.DATA__PROCESSING:
			return basicSetProcessing(null, msgs);
		case Fig1Package.DATA__GENERALIZATION:
			return basicSetGeneralization(null, msgs);
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
		case Fig1Package.DATA__OTHERINTERPLAY:
			return getOtherinterplay();
		case Fig1Package.DATA__PROCESSING:
			if (resolve)
				return getProcessing();
			return basicGetProcessing();
		case Fig1Package.DATA__GENERALIZATION:
			if (resolve)
				return getGeneralization();
			return basicGetGeneralization();
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
		case Fig1Package.DATA__OTHERINTERPLAY:
			getOtherinterplay().clear();
			getOtherinterplay().addAll((Collection<? extends OtherInterplay>) newValue);
			return;
		case Fig1Package.DATA__PROCESSING:
			setProcessing((DataPurpose) newValue);
			return;
		case Fig1Package.DATA__GENERALIZATION:
			setGeneralization((Generalization) newValue);
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
		case Fig1Package.DATA__OTHERINTERPLAY:
			getOtherinterplay().clear();
			return;
		case Fig1Package.DATA__PROCESSING:
			setProcessing((DataPurpose) null);
			return;
		case Fig1Package.DATA__GENERALIZATION:
			setGeneralization((Generalization) null);
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
		case Fig1Package.DATA__OTHERINTERPLAY:
			return otherinterplay != null && !otherinterplay.isEmpty();
		case Fig1Package.DATA__PROCESSING:
			return processing != null;
		case Fig1Package.DATA__GENERALIZATION:
			return generalization != null;
		}
		return super.eIsSet(featureID);
	}

} //DataImpl
