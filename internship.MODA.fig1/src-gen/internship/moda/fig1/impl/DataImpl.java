/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.Data;
import internship.moda.fig1.DataTypes;
import internship.moda.fig1.Fig1Package;

import internship.moda.fig1.ModelRole;
import internship.moda.fig1.SocioTechnicalSystem;
import internship.moda.fig1.Software;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.DataImpl#getSoftware <em>Software</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.DataImpl#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.DataImpl#getModelrole <em>Modelrole</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.DataImpl#getDataType <em>Data Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataImpl extends MinimalEObjectImpl.Container implements Data {
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
	 * The cached value of the '{@link #getSociotechnicalsystem() <em>Sociotechnicalsystem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSociotechnicalsystem()
	 * @generated
	 * @ordered
	 */
	protected SocioTechnicalSystem sociotechnicalsystem;
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
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final DataTypes DATA_TYPE_EDEFAULT = DataTypes.INPUT_DATA;
	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected DataTypes dataType = DATA_TYPE_EDEFAULT;

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
	public Software getSoftware() {
		if (software != null && software.eIsProxy()) {
			InternalEObject oldSoftware = (InternalEObject) software;
			software = (Software) eResolveProxy(oldSoftware);
			if (software != oldSoftware) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.DATA__SOFTWARE, oldSoftware,
							software));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fig1Package.DATA__SOFTWARE,
					oldSoftware, newSoftware);
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
				msgs = ((InternalEObject) software).eInverseRemove(this, Fig1Package.SOFTWARE__DATA, Software.class,
						msgs);
			if (newSoftware != null)
				msgs = ((InternalEObject) newSoftware).eInverseAdd(this, Fig1Package.SOFTWARE__DATA, Software.class,
						msgs);
			msgs = basicSetSoftware(newSoftware, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.DATA__SOFTWARE, newSoftware,
					newSoftware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocioTechnicalSystem getSociotechnicalsystem() {
		if (sociotechnicalsystem != null && sociotechnicalsystem.eIsProxy()) {
			InternalEObject oldSociotechnicalsystem = (InternalEObject) sociotechnicalsystem;
			sociotechnicalsystem = (SocioTechnicalSystem) eResolveProxy(oldSociotechnicalsystem);
			if (sociotechnicalsystem != oldSociotechnicalsystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.DATA__SOCIOTECHNICALSYSTEM,
							oldSociotechnicalsystem, sociotechnicalsystem));
			}
		}
		return sociotechnicalsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocioTechnicalSystem basicGetSociotechnicalsystem() {
		return sociotechnicalsystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSociotechnicalsystem(SocioTechnicalSystem newSociotechnicalsystem,
			NotificationChain msgs) {
		SocioTechnicalSystem oldSociotechnicalsystem = sociotechnicalsystem;
		sociotechnicalsystem = newSociotechnicalsystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.DATA__SOCIOTECHNICALSYSTEM, oldSociotechnicalsystem, newSociotechnicalsystem);
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
	public void setSociotechnicalsystem(SocioTechnicalSystem newSociotechnicalsystem) {
		if (newSociotechnicalsystem != sociotechnicalsystem) {
			NotificationChain msgs = null;
			if (sociotechnicalsystem != null)
				msgs = ((InternalEObject) sociotechnicalsystem).eInverseRemove(this,
						Fig1Package.SOCIO_TECHNICAL_SYSTEM__DATA, SocioTechnicalSystem.class, msgs);
			if (newSociotechnicalsystem != null)
				msgs = ((InternalEObject) newSociotechnicalsystem).eInverseAdd(this,
						Fig1Package.SOCIO_TECHNICAL_SYSTEM__DATA, SocioTechnicalSystem.class, msgs);
			msgs = basicSetSociotechnicalsystem(newSociotechnicalsystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.DATA__SOCIOTECHNICALSYSTEM,
					newSociotechnicalsystem, newSociotechnicalsystem));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.DATA__MODELROLE, oldModelrole,
							modelrole));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Fig1Package.DATA__MODELROLE,
					oldModelrole, newModelrole);
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
				msgs = ((InternalEObject) modelrole).eInverseRemove(this, Fig1Package.MODEL_ROLE__DATA, ModelRole.class,
						msgs);
			if (newModelrole != null)
				msgs = ((InternalEObject) newModelrole).eInverseAdd(this, Fig1Package.MODEL_ROLE__DATA, ModelRole.class,
						msgs);
			msgs = basicSetModelrole(newModelrole, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.DATA__MODELROLE, newModelrole,
					newModelrole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypes getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(DataTypes newDataType) {
		DataTypes oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.DATA__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fig1Package.DATA__SOFTWARE:
			if (software != null)
				msgs = ((InternalEObject) software).eInverseRemove(this, Fig1Package.SOFTWARE__DATA, Software.class,
						msgs);
			return basicSetSoftware((Software) otherEnd, msgs);
		case Fig1Package.DATA__SOCIOTECHNICALSYSTEM:
			if (sociotechnicalsystem != null)
				msgs = ((InternalEObject) sociotechnicalsystem).eInverseRemove(this,
						Fig1Package.SOCIO_TECHNICAL_SYSTEM__DATA, SocioTechnicalSystem.class, msgs);
			return basicSetSociotechnicalsystem((SocioTechnicalSystem) otherEnd, msgs);
		case Fig1Package.DATA__MODELROLE:
			if (modelrole != null)
				msgs = ((InternalEObject) modelrole).eInverseRemove(this, Fig1Package.MODEL_ROLE__DATA, ModelRole.class,
						msgs);
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
		case Fig1Package.DATA__SOFTWARE:
			return basicSetSoftware(null, msgs);
		case Fig1Package.DATA__SOCIOTECHNICALSYSTEM:
			return basicSetSociotechnicalsystem(null, msgs);
		case Fig1Package.DATA__MODELROLE:
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
		case Fig1Package.DATA__SOFTWARE:
			if (resolve)
				return getSoftware();
			return basicGetSoftware();
		case Fig1Package.DATA__SOCIOTECHNICALSYSTEM:
			if (resolve)
				return getSociotechnicalsystem();
			return basicGetSociotechnicalsystem();
		case Fig1Package.DATA__MODELROLE:
			if (resolve)
				return getModelrole();
			return basicGetModelrole();
		case Fig1Package.DATA__DATA_TYPE:
			return getDataType();
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
		case Fig1Package.DATA__SOFTWARE:
			setSoftware((Software) newValue);
			return;
		case Fig1Package.DATA__SOCIOTECHNICALSYSTEM:
			setSociotechnicalsystem((SocioTechnicalSystem) newValue);
			return;
		case Fig1Package.DATA__MODELROLE:
			setModelrole((ModelRole) newValue);
			return;
		case Fig1Package.DATA__DATA_TYPE:
			setDataType((DataTypes) newValue);
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
		case Fig1Package.DATA__SOFTWARE:
			setSoftware((Software) null);
			return;
		case Fig1Package.DATA__SOCIOTECHNICALSYSTEM:
			setSociotechnicalsystem((SocioTechnicalSystem) null);
			return;
		case Fig1Package.DATA__MODELROLE:
			setModelrole((ModelRole) null);
			return;
		case Fig1Package.DATA__DATA_TYPE:
			setDataType(DATA_TYPE_EDEFAULT);
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
		case Fig1Package.DATA__SOFTWARE:
			return software != null;
		case Fig1Package.DATA__SOCIOTECHNICALSYSTEM:
			return sociotechnicalsystem != null;
		case Fig1Package.DATA__MODELROLE:
			return modelrole != null;
		case Fig1Package.DATA__DATA_TYPE:
			return dataType != DATA_TYPE_EDEFAULT;
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
		result.append(" (dataType: ");
		result.append(dataType);
		result.append(')');
		return result.toString();
	}

} //DataImpl
