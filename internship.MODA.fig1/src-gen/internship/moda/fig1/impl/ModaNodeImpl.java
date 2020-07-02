/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.Analysis;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.ModaNode;

import internship.moda.fig1.Preparation;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Moda Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.ModaNodeImpl#getOutgoingAnalysis <em>Outgoing Analysis</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.ModaNodeImpl#getOutgoingPreparation <em>Outgoing Preparation</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModaNodeImpl extends NamedElementImpl implements ModaNode {
	/**
	 * The cached value of the '{@link #getOutgoingAnalysis() <em>Outgoing Analysis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingAnalysis()
	 * @generated
	 * @ordered
	 */
	protected Analysis outgoingAnalysis;
	/**
	 * The cached value of the '{@link #getOutgoingPreparation() <em>Outgoing Preparation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingPreparation()
	 * @generated
	 * @ordered
	 */
	protected Preparation outgoingPreparation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModaNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fig1Package.Literals.MODA_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analysis getOutgoingAnalysis() {
		if (outgoingAnalysis != null && outgoingAnalysis.eIsProxy()) {
			InternalEObject oldOutgoingAnalysis = (InternalEObject) outgoingAnalysis;
			outgoingAnalysis = (Analysis) eResolveProxy(oldOutgoingAnalysis);
			if (outgoingAnalysis != oldOutgoingAnalysis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.MODA_NODE__OUTGOING_ANALYSIS,
							oldOutgoingAnalysis, outgoingAnalysis));
			}
		}
		return outgoingAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analysis basicGetOutgoingAnalysis() {
		return outgoingAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoingAnalysis(Analysis newOutgoingAnalysis, NotificationChain msgs) {
		Analysis oldOutgoingAnalysis = outgoingAnalysis;
		outgoingAnalysis = newOutgoingAnalysis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.MODA_NODE__OUTGOING_ANALYSIS, oldOutgoingAnalysis, newOutgoingAnalysis);
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
	public void setOutgoingAnalysis(Analysis newOutgoingAnalysis) {
		if (newOutgoingAnalysis != outgoingAnalysis) {
			NotificationChain msgs = null;
			if (outgoingAnalysis != null)
				msgs = ((InternalEObject) outgoingAnalysis).eInverseRemove(this, Fig1Package.ANALYSIS__SOURCE,
						Analysis.class, msgs);
			if (newOutgoingAnalysis != null)
				msgs = ((InternalEObject) newOutgoingAnalysis).eInverseAdd(this, Fig1Package.ANALYSIS__SOURCE,
						Analysis.class, msgs);
			msgs = basicSetOutgoingAnalysis(newOutgoingAnalysis, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.MODA_NODE__OUTGOING_ANALYSIS,
					newOutgoingAnalysis, newOutgoingAnalysis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preparation getOutgoingPreparation() {
		if (outgoingPreparation != null && outgoingPreparation.eIsProxy()) {
			InternalEObject oldOutgoingPreparation = (InternalEObject) outgoingPreparation;
			outgoingPreparation = (Preparation) eResolveProxy(oldOutgoingPreparation);
			if (outgoingPreparation != oldOutgoingPreparation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.MODA_NODE__OUTGOING_PREPARATION, oldOutgoingPreparation, outgoingPreparation));
			}
		}
		return outgoingPreparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preparation basicGetOutgoingPreparation() {
		return outgoingPreparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoingPreparation(Preparation newOutgoingPreparation, NotificationChain msgs) {
		Preparation oldOutgoingPreparation = outgoingPreparation;
		outgoingPreparation = newOutgoingPreparation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.MODA_NODE__OUTGOING_PREPARATION, oldOutgoingPreparation, newOutgoingPreparation);
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
	public void setOutgoingPreparation(Preparation newOutgoingPreparation) {
		if (newOutgoingPreparation != outgoingPreparation) {
			NotificationChain msgs = null;
			if (outgoingPreparation != null)
				msgs = ((InternalEObject) outgoingPreparation).eInverseRemove(this, Fig1Package.PREPARATION__SOURCE,
						Preparation.class, msgs);
			if (newOutgoingPreparation != null)
				msgs = ((InternalEObject) newOutgoingPreparation).eInverseAdd(this, Fig1Package.PREPARATION__SOURCE,
						Preparation.class, msgs);
			msgs = basicSetOutgoingPreparation(newOutgoingPreparation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.MODA_NODE__OUTGOING_PREPARATION,
					newOutgoingPreparation, newOutgoingPreparation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fig1Package.MODA_NODE__OUTGOING_ANALYSIS:
			if (outgoingAnalysis != null)
				msgs = ((InternalEObject) outgoingAnalysis).eInverseRemove(this, Fig1Package.ANALYSIS__SOURCE,
						Analysis.class, msgs);
			return basicSetOutgoingAnalysis((Analysis) otherEnd, msgs);
		case Fig1Package.MODA_NODE__OUTGOING_PREPARATION:
			if (outgoingPreparation != null)
				msgs = ((InternalEObject) outgoingPreparation).eInverseRemove(this, Fig1Package.PREPARATION__SOURCE,
						Preparation.class, msgs);
			return basicSetOutgoingPreparation((Preparation) otherEnd, msgs);
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
		case Fig1Package.MODA_NODE__OUTGOING_ANALYSIS:
			return basicSetOutgoingAnalysis(null, msgs);
		case Fig1Package.MODA_NODE__OUTGOING_PREPARATION:
			return basicSetOutgoingPreparation(null, msgs);
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
		case Fig1Package.MODA_NODE__OUTGOING_ANALYSIS:
			if (resolve)
				return getOutgoingAnalysis();
			return basicGetOutgoingAnalysis();
		case Fig1Package.MODA_NODE__OUTGOING_PREPARATION:
			if (resolve)
				return getOutgoingPreparation();
			return basicGetOutgoingPreparation();
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
		case Fig1Package.MODA_NODE__OUTGOING_ANALYSIS:
			setOutgoingAnalysis((Analysis) newValue);
			return;
		case Fig1Package.MODA_NODE__OUTGOING_PREPARATION:
			setOutgoingPreparation((Preparation) newValue);
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
		case Fig1Package.MODA_NODE__OUTGOING_ANALYSIS:
			setOutgoingAnalysis((Analysis) null);
			return;
		case Fig1Package.MODA_NODE__OUTGOING_PREPARATION:
			setOutgoingPreparation((Preparation) null);
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
		case Fig1Package.MODA_NODE__OUTGOING_ANALYSIS:
			return outgoingAnalysis != null;
		case Fig1Package.MODA_NODE__OUTGOING_PREPARATION:
			return outgoingPreparation != null;
		}
		return super.eIsSet(featureID);
	}

} //ModaNodeImpl
