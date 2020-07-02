/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.Data;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.MODA;
import internship.moda.fig1.ModaRelation;
import internship.moda.fig1.Model;
import internship.moda.fig1.ModelRole;
import internship.moda.fig1.SocioTechnicalSystem;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MODA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.MODAImpl#getSociotechnicalsystem <em>Sociotechnicalsystem</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.MODAImpl#getData <em>Data</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.MODAImpl#getModel <em>Model</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.MODAImpl#getModelrole <em>Modelrole</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.MODAImpl#getRelations <em>Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MODAImpl extends ModaNodeImpl implements MODA {
	/**
	 * The cached value of the '{@link #getSociotechnicalsystem() <em>Sociotechnicalsystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSociotechnicalsystem()
	 * @generated
	 * @ordered
	 */
	protected SocioTechnicalSystem sociotechnicalsystem;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected EList<Model> model;

	/**
	 * The cached value of the '{@link #getModelrole() <em>Modelrole</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelrole()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelRole> modelrole;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<ModaRelation> relations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MODAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fig1Package.Literals.MODA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocioTechnicalSystem getSociotechnicalsystem() {
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
					Fig1Package.MODA__SOCIOTECHNICALSYSTEM, oldSociotechnicalsystem, newSociotechnicalsystem);
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
						EOPPOSITE_FEATURE_BASE - Fig1Package.MODA__SOCIOTECHNICALSYSTEM, null, msgs);
			if (newSociotechnicalsystem != null)
				msgs = ((InternalEObject) newSociotechnicalsystem).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Fig1Package.MODA__SOCIOTECHNICALSYSTEM, null, msgs);
			msgs = basicSetSociotechnicalsystem(newSociotechnicalsystem, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.MODA__SOCIOTECHNICALSYSTEM,
					newSociotechnicalsystem, newSociotechnicalsystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this, Fig1Package.MODA__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Model> getModel() {
		if (model == null) {
			model = new EObjectContainmentEList<Model>(Model.class, this, Fig1Package.MODA__MODEL);
		}
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelRole> getModelrole() {
		if (modelrole == null) {
			modelrole = new EObjectContainmentEList<ModelRole>(ModelRole.class, this, Fig1Package.MODA__MODELROLE);
		}
		return modelrole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModaRelation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<ModaRelation>(ModaRelation.class, this,
					Fig1Package.MODA__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fig1Package.MODA__SOCIOTECHNICALSYSTEM:
			return basicSetSociotechnicalsystem(null, msgs);
		case Fig1Package.MODA__DATA:
			return ((InternalEList<?>) getData()).basicRemove(otherEnd, msgs);
		case Fig1Package.MODA__MODEL:
			return ((InternalEList<?>) getModel()).basicRemove(otherEnd, msgs);
		case Fig1Package.MODA__MODELROLE:
			return ((InternalEList<?>) getModelrole()).basicRemove(otherEnd, msgs);
		case Fig1Package.MODA__RELATIONS:
			return ((InternalEList<?>) getRelations()).basicRemove(otherEnd, msgs);
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
		case Fig1Package.MODA__SOCIOTECHNICALSYSTEM:
			return getSociotechnicalsystem();
		case Fig1Package.MODA__DATA:
			return getData();
		case Fig1Package.MODA__MODEL:
			return getModel();
		case Fig1Package.MODA__MODELROLE:
			return getModelrole();
		case Fig1Package.MODA__RELATIONS:
			return getRelations();
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
		case Fig1Package.MODA__SOCIOTECHNICALSYSTEM:
			setSociotechnicalsystem((SocioTechnicalSystem) newValue);
			return;
		case Fig1Package.MODA__DATA:
			getData().clear();
			getData().addAll((Collection<? extends Data>) newValue);
			return;
		case Fig1Package.MODA__MODEL:
			getModel().clear();
			getModel().addAll((Collection<? extends Model>) newValue);
			return;
		case Fig1Package.MODA__MODELROLE:
			getModelrole().clear();
			getModelrole().addAll((Collection<? extends ModelRole>) newValue);
			return;
		case Fig1Package.MODA__RELATIONS:
			getRelations().clear();
			getRelations().addAll((Collection<? extends ModaRelation>) newValue);
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
		case Fig1Package.MODA__SOCIOTECHNICALSYSTEM:
			setSociotechnicalsystem((SocioTechnicalSystem) null);
			return;
		case Fig1Package.MODA__DATA:
			getData().clear();
			return;
		case Fig1Package.MODA__MODEL:
			getModel().clear();
			return;
		case Fig1Package.MODA__MODELROLE:
			getModelrole().clear();
			return;
		case Fig1Package.MODA__RELATIONS:
			getRelations().clear();
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
		case Fig1Package.MODA__SOCIOTECHNICALSYSTEM:
			return sociotechnicalsystem != null;
		case Fig1Package.MODA__DATA:
			return data != null && !data.isEmpty();
		case Fig1Package.MODA__MODEL:
			return model != null && !model.isEmpty();
		case Fig1Package.MODA__MODELROLE:
			return modelrole != null && !modelrole.isEmpty();
		case Fig1Package.MODA__RELATIONS:
			return relations != null && !relations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MODAImpl
