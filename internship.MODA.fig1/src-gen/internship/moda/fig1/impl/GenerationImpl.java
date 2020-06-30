/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.Generation;
import internship.moda.fig1.PrescriptiveModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.GenerationImpl#getPrescriptivemodel <em>Prescriptivemodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenerationImpl extends ModaRelationImpl implements Generation {
	/**
	 * The cached value of the '{@link #getPrescriptivemodel() <em>Prescriptivemodel</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptivemodel()
	 * @generated
	 * @ordered
	 */
	protected EList<PrescriptiveModel> prescriptivemodel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fig1Package.Literals.GENERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrescriptiveModel> getPrescriptivemodel() {
		if (prescriptivemodel == null) {
			prescriptivemodel = new EObjectWithInverseResolvingEList<PrescriptiveModel>(PrescriptiveModel.class, this,
					Fig1Package.GENERATION__PRESCRIPTIVEMODEL, Fig1Package.PRESCRIPTIVE_MODEL__GENERATION);
		}
		return prescriptivemodel;
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
		case Fig1Package.GENERATION__PRESCRIPTIVEMODEL:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPrescriptivemodel()).basicAdd(otherEnd,
					msgs);
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
		case Fig1Package.GENERATION__PRESCRIPTIVEMODEL:
			return ((InternalEList<?>) getPrescriptivemodel()).basicRemove(otherEnd, msgs);
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
		case Fig1Package.GENERATION__PRESCRIPTIVEMODEL:
			return getPrescriptivemodel();
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
		case Fig1Package.GENERATION__PRESCRIPTIVEMODEL:
			getPrescriptivemodel().clear();
			getPrescriptivemodel().addAll((Collection<? extends PrescriptiveModel>) newValue);
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
		case Fig1Package.GENERATION__PRESCRIPTIVEMODEL:
			getPrescriptivemodel().clear();
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
		case Fig1Package.GENERATION__PRESCRIPTIVEMODEL:
			return prescriptivemodel != null && !prescriptivemodel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenerationImpl
