/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.Generalization;
import internship.moda.fig1.Model;
import internship.moda.fig1.ModelRole;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.ModelRoleImpl#getModel <em>Model</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.ModelRoleImpl#getGeneralization <em>Generalization</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelRoleImpl extends ModaNodeImpl implements ModelRole {
	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected Model model;

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
	protected ModelRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fig1Package.Literals.MODEL_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject) model;
			model = (Model) eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.MODEL_ROLE__MODEL, oldModel,
							model));
			}
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(Model newModel, NotificationChain msgs) {
		Model oldModel = model;
		model = newModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.MODEL_ROLE__MODEL, oldModel, newModel);
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
	public void setModel(Model newModel) {
		if (newModel != model) {
			NotificationChain msgs = null;
			if (model != null)
				msgs = ((InternalEObject) model).eInverseRemove(this, Fig1Package.MODEL__MODELROLE, Model.class, msgs);
			if (newModel != null)
				msgs = ((InternalEObject) newModel).eInverseAdd(this, Fig1Package.MODEL__MODELROLE, Model.class, msgs);
			msgs = basicSetModel(newModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.MODEL_ROLE__MODEL, newModel, newModel));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.MODEL_ROLE__GENERALIZATION,
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
					Fig1Package.MODEL_ROLE__GENERALIZATION, oldGeneralization, newGeneralization);
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
				msgs = ((InternalEObject) generalization).eInverseRemove(this, Fig1Package.GENERALIZATION__MODELROLE,
						Generalization.class, msgs);
			if (newGeneralization != null)
				msgs = ((InternalEObject) newGeneralization).eInverseAdd(this, Fig1Package.GENERALIZATION__MODELROLE,
						Generalization.class, msgs);
			msgs = basicSetGeneralization(newGeneralization, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.MODEL_ROLE__GENERALIZATION,
					newGeneralization, newGeneralization));
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
		case Fig1Package.MODEL_ROLE__MODEL:
			if (model != null)
				msgs = ((InternalEObject) model).eInverseRemove(this, Fig1Package.MODEL__MODELROLE, Model.class, msgs);
			return basicSetModel((Model) otherEnd, msgs);
		case Fig1Package.MODEL_ROLE__GENERALIZATION:
			if (generalization != null)
				msgs = ((InternalEObject) generalization).eInverseRemove(this, Fig1Package.GENERALIZATION__MODELROLE,
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
		case Fig1Package.MODEL_ROLE__MODEL:
			return basicSetModel(null, msgs);
		case Fig1Package.MODEL_ROLE__GENERALIZATION:
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
		case Fig1Package.MODEL_ROLE__MODEL:
			if (resolve)
				return getModel();
			return basicGetModel();
		case Fig1Package.MODEL_ROLE__GENERALIZATION:
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
		case Fig1Package.MODEL_ROLE__MODEL:
			setModel((Model) newValue);
			return;
		case Fig1Package.MODEL_ROLE__GENERALIZATION:
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
		case Fig1Package.MODEL_ROLE__MODEL:
			setModel((Model) null);
			return;
		case Fig1Package.MODEL_ROLE__GENERALIZATION:
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
		case Fig1Package.MODEL_ROLE__MODEL:
			return model != null;
		case Fig1Package.MODEL_ROLE__GENERALIZATION:
			return generalization != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelRoleImpl
