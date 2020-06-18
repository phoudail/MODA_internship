/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.ExternalData;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.PrescriptiveModel;
import internship.moda.fig1.SocioTechnicalSystem;
import internship.moda.fig1.Software;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Socio Technical System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.SocioTechnicalSystemImpl#getSoftware <em>Software</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.SocioTechnicalSystemImpl#getExternaldata <em>Externaldata</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.SocioTechnicalSystemImpl#getPrescriptivemodel <em>Prescriptivemodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SocioTechnicalSystemImpl extends MinimalEObjectImpl.Container implements SocioTechnicalSystem {
	/**
	 * The cached value of the '{@link #getSoftware() <em>Software</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftware()
	 * @generated
	 * @ordered
	 */
	protected EList<Software> software;

	/**
	 * The cached value of the '{@link #getExternaldata() <em>Externaldata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternaldata()
	 * @generated
	 * @ordered
	 */
	protected ExternalData externaldata;

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
	protected SocioTechnicalSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fig1Package.Literals.SOCIO_TECHNICAL_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Software> getSoftware() {
		if (software == null) {
			software = new EObjectContainmentEList<Software>(Software.class, this,
					Fig1Package.SOCIO_TECHNICAL_SYSTEM__SOFTWARE);
		}
		return software;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalData getExternaldata() {
		if (externaldata != null && externaldata.eIsProxy()) {
			InternalEObject oldExternaldata = (InternalEObject) externaldata;
			externaldata = (ExternalData) eResolveProxy(oldExternaldata);
			if (externaldata != oldExternaldata) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.SOCIO_TECHNICAL_SYSTEM__EXTERNALDATA, oldExternaldata, externaldata));
			}
		}
		return externaldata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalData basicGetExternaldata() {
		return externaldata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternaldata(ExternalData newExternaldata, NotificationChain msgs) {
		ExternalData oldExternaldata = externaldata;
		externaldata = newExternaldata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.SOCIO_TECHNICAL_SYSTEM__EXTERNALDATA, oldExternaldata, newExternaldata);
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
	public void setExternaldata(ExternalData newExternaldata) {
		if (newExternaldata != externaldata) {
			NotificationChain msgs = null;
			if (externaldata != null)
				msgs = ((InternalEObject) externaldata).eInverseRemove(this,
						Fig1Package.EXTERNAL_DATA__SOCIOTECHNICALSYSTEM, ExternalData.class, msgs);
			if (newExternaldata != null)
				msgs = ((InternalEObject) newExternaldata).eInverseAdd(this,
						Fig1Package.EXTERNAL_DATA__SOCIOTECHNICALSYSTEM, ExternalData.class, msgs);
			msgs = basicSetExternaldata(newExternaldata, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.SOCIO_TECHNICAL_SYSTEM__EXTERNALDATA,
					newExternaldata, newExternaldata));
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
							Fig1Package.SOCIO_TECHNICAL_SYSTEM__PRESCRIPTIVEMODEL, oldPrescriptivemodel,
							prescriptivemodel));
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
	public void setPrescriptivemodel(PrescriptiveModel newPrescriptivemodel) {
		PrescriptiveModel oldPrescriptivemodel = prescriptivemodel;
		prescriptivemodel = newPrescriptivemodel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.SOCIO_TECHNICAL_SYSTEM__PRESCRIPTIVEMODEL,
					oldPrescriptivemodel, prescriptivemodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__EXTERNALDATA:
			if (externaldata != null)
				msgs = ((InternalEObject) externaldata).eInverseRemove(this,
						Fig1Package.EXTERNAL_DATA__SOCIOTECHNICALSYSTEM, ExternalData.class, msgs);
			return basicSetExternaldata((ExternalData) otherEnd, msgs);
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
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__SOFTWARE:
			return ((InternalEList<?>) getSoftware()).basicRemove(otherEnd, msgs);
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__EXTERNALDATA:
			return basicSetExternaldata(null, msgs);
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
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__SOFTWARE:
			return getSoftware();
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__EXTERNALDATA:
			if (resolve)
				return getExternaldata();
			return basicGetExternaldata();
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__PRESCRIPTIVEMODEL:
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
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__SOFTWARE:
			getSoftware().clear();
			getSoftware().addAll((Collection<? extends Software>) newValue);
			return;
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__EXTERNALDATA:
			setExternaldata((ExternalData) newValue);
			return;
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__PRESCRIPTIVEMODEL:
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
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__SOFTWARE:
			getSoftware().clear();
			return;
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__EXTERNALDATA:
			setExternaldata((ExternalData) null);
			return;
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__PRESCRIPTIVEMODEL:
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
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__SOFTWARE:
			return software != null && !software.isEmpty();
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__EXTERNALDATA:
			return externaldata != null;
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM__PRESCRIPTIVEMODEL:
			return prescriptivemodel != null;
		}
		return super.eIsSet(featureID);
	}

} //SocioTechnicalSystemImpl
