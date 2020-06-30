/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.Analysis;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.ModaNode;
import internship.moda.fig1.PrescriptiveModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.AnalysisImpl#getPrescriptivemodel <em>Prescriptivemodel</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.AnalysisImpl#getModanode <em>Modanode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisImpl extends ModaRelationImpl implements Analysis {
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
	 * The cached value of the '{@link #getModanode() <em>Modanode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModanode()
	 * @generated
	 * @ordered
	 */
	protected ModaNode modanode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fig1Package.Literals.ANALYSIS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.ANALYSIS__PRESCRIPTIVEMODEL,
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
					Fig1Package.ANALYSIS__PRESCRIPTIVEMODEL, oldPrescriptivemodel, newPrescriptivemodel);
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
						Fig1Package.PRESCRIPTIVE_MODEL__ANALYSIS_RESULT, PrescriptiveModel.class, msgs);
			if (newPrescriptivemodel != null)
				msgs = ((InternalEObject) newPrescriptivemodel).eInverseAdd(this,
						Fig1Package.PRESCRIPTIVE_MODEL__ANALYSIS_RESULT, PrescriptiveModel.class, msgs);
			msgs = basicSetPrescriptivemodel(newPrescriptivemodel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.ANALYSIS__PRESCRIPTIVEMODEL,
					newPrescriptivemodel, newPrescriptivemodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModaNode getModanode() {
		if (modanode != null && modanode.eIsProxy()) {
			InternalEObject oldModanode = (InternalEObject) modanode;
			modanode = (ModaNode) eResolveProxy(oldModanode);
			if (modanode != oldModanode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.ANALYSIS__MODANODE,
							oldModanode, modanode));
			}
		}
		return modanode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModaNode basicGetModanode() {
		return modanode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModanode(ModaNode newModanode, NotificationChain msgs) {
		ModaNode oldModanode = modanode;
		modanode = newModanode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.ANALYSIS__MODANODE, oldModanode, newModanode);
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
	public void setModanode(ModaNode newModanode) {
		if (newModanode != modanode) {
			NotificationChain msgs = null;
			if (modanode != null)
				msgs = ((InternalEObject) modanode).eInverseRemove(this, Fig1Package.MODA_NODE__ANALYSIS,
						ModaNode.class, msgs);
			if (newModanode != null)
				msgs = ((InternalEObject) newModanode).eInverseAdd(this, Fig1Package.MODA_NODE__ANALYSIS,
						ModaNode.class, msgs);
			msgs = basicSetModanode(newModanode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.ANALYSIS__MODANODE, newModanode,
					newModanode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fig1Package.ANALYSIS__PRESCRIPTIVEMODEL:
			if (prescriptivemodel != null)
				msgs = ((InternalEObject) prescriptivemodel).eInverseRemove(this,
						Fig1Package.PRESCRIPTIVE_MODEL__ANALYSIS_RESULT, PrescriptiveModel.class, msgs);
			return basicSetPrescriptivemodel((PrescriptiveModel) otherEnd, msgs);
		case Fig1Package.ANALYSIS__MODANODE:
			if (modanode != null)
				msgs = ((InternalEObject) modanode).eInverseRemove(this, Fig1Package.MODA_NODE__ANALYSIS,
						ModaNode.class, msgs);
			return basicSetModanode((ModaNode) otherEnd, msgs);
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
		case Fig1Package.ANALYSIS__PRESCRIPTIVEMODEL:
			return basicSetPrescriptivemodel(null, msgs);
		case Fig1Package.ANALYSIS__MODANODE:
			return basicSetModanode(null, msgs);
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
		case Fig1Package.ANALYSIS__PRESCRIPTIVEMODEL:
			if (resolve)
				return getPrescriptivemodel();
			return basicGetPrescriptivemodel();
		case Fig1Package.ANALYSIS__MODANODE:
			if (resolve)
				return getModanode();
			return basicGetModanode();
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
		case Fig1Package.ANALYSIS__PRESCRIPTIVEMODEL:
			setPrescriptivemodel((PrescriptiveModel) newValue);
			return;
		case Fig1Package.ANALYSIS__MODANODE:
			setModanode((ModaNode) newValue);
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
		case Fig1Package.ANALYSIS__PRESCRIPTIVEMODEL:
			setPrescriptivemodel((PrescriptiveModel) null);
			return;
		case Fig1Package.ANALYSIS__MODANODE:
			setModanode((ModaNode) null);
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
		case Fig1Package.ANALYSIS__PRESCRIPTIVEMODEL:
			return prescriptivemodel != null;
		case Fig1Package.ANALYSIS__MODANODE:
			return modanode != null;
		}
		return super.eIsSet(featureID);
	}

} //AnalysisImpl
