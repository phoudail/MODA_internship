/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.Analysis;
import internship.moda.fig1.Deployment;
import internship.moda.fig1.Enactment;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.Generation;
import internship.moda.fig1.PrescriptiveModel;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prescriptive Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.PrescriptiveModelImpl#getOutgoingEnactment <em>Outgoing Enactment</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.PrescriptiveModelImpl#getOutgoingDeployment <em>Outgoing Deployment</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.PrescriptiveModelImpl#getIncomingAnalysis <em>Incoming Analysis</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.PrescriptiveModelImpl#getOutgoingGeneration <em>Outgoing Generation</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.PrescriptiveModelImpl#getIncomingGeneration <em>Incoming Generation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrescriptiveModelImpl extends ModelRoleImpl implements PrescriptiveModel {
	/**
	 * The cached value of the '{@link #getOutgoingEnactment() <em>Outgoing Enactment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingEnactment()
	 * @generated
	 * @ordered
	 */
	protected Enactment outgoingEnactment;

	/**
	 * The cached value of the '{@link #getOutgoingDeployment() <em>Outgoing Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingDeployment()
	 * @generated
	 * @ordered
	 */
	protected Deployment outgoingDeployment;

	/**
	 * The cached value of the '{@link #getIncomingAnalysis() <em>Incoming Analysis</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingAnalysis()
	 * @generated
	 * @ordered
	 */
	protected Analysis incomingAnalysis;

	/**
	 * The cached value of the '{@link #getOutgoingGeneration() <em>Outgoing Generation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingGeneration()
	 * @generated
	 * @ordered
	 */
	protected Generation outgoingGeneration;

	/**
	 * The cached value of the '{@link #getIncomingGeneration() <em>Incoming Generation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingGeneration()
	 * @generated
	 * @ordered
	 */
	protected Generation incomingGeneration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrescriptiveModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fig1Package.Literals.PRESCRIPTIVE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enactment getOutgoingEnactment() {
		if (outgoingEnactment != null && outgoingEnactment.eIsProxy()) {
			InternalEObject oldOutgoingEnactment = (InternalEObject) outgoingEnactment;
			outgoingEnactment = (Enactment) eResolveProxy(oldOutgoingEnactment);
			if (outgoingEnactment != oldOutgoingEnactment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_ENACTMENT, oldOutgoingEnactment,
							outgoingEnactment));
			}
		}
		return outgoingEnactment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enactment basicGetOutgoingEnactment() {
		return outgoingEnactment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoingEnactment(Enactment newOutgoingEnactment, NotificationChain msgs) {
		Enactment oldOutgoingEnactment = outgoingEnactment;
		outgoingEnactment = newOutgoingEnactment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_ENACTMENT, oldOutgoingEnactment, newOutgoingEnactment);
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
	public void setOutgoingEnactment(Enactment newOutgoingEnactment) {
		if (newOutgoingEnactment != outgoingEnactment) {
			NotificationChain msgs = null;
			if (outgoingEnactment != null)
				msgs = ((InternalEObject) outgoingEnactment).eInverseRemove(this, Fig1Package.ENACTMENT__SOURCE,
						Enactment.class, msgs);
			if (newOutgoingEnactment != null)
				msgs = ((InternalEObject) newOutgoingEnactment).eInverseAdd(this, Fig1Package.ENACTMENT__SOURCE,
						Enactment.class, msgs);
			msgs = basicSetOutgoingEnactment(newOutgoingEnactment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_ENACTMENT,
					newOutgoingEnactment, newOutgoingEnactment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getOutgoingDeployment() {
		if (outgoingDeployment != null && outgoingDeployment.eIsProxy()) {
			InternalEObject oldOutgoingDeployment = (InternalEObject) outgoingDeployment;
			outgoingDeployment = (Deployment) eResolveProxy(oldOutgoingDeployment);
			if (outgoingDeployment != oldOutgoingDeployment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_DEPLOYMENT, oldOutgoingDeployment,
							outgoingDeployment));
			}
		}
		return outgoingDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment basicGetOutgoingDeployment() {
		return outgoingDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoingDeployment(Deployment newOutgoingDeployment, NotificationChain msgs) {
		Deployment oldOutgoingDeployment = outgoingDeployment;
		outgoingDeployment = newOutgoingDeployment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_DEPLOYMENT, oldOutgoingDeployment, newOutgoingDeployment);
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
	public void setOutgoingDeployment(Deployment newOutgoingDeployment) {
		if (newOutgoingDeployment != outgoingDeployment) {
			NotificationChain msgs = null;
			if (outgoingDeployment != null)
				msgs = ((InternalEObject) outgoingDeployment).eInverseRemove(this, Fig1Package.DEPLOYMENT__SOURCE,
						Deployment.class, msgs);
			if (newOutgoingDeployment != null)
				msgs = ((InternalEObject) newOutgoingDeployment).eInverseAdd(this, Fig1Package.DEPLOYMENT__SOURCE,
						Deployment.class, msgs);
			msgs = basicSetOutgoingDeployment(newOutgoingDeployment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_DEPLOYMENT,
					newOutgoingDeployment, newOutgoingDeployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analysis getIncomingAnalysis() {
		if (incomingAnalysis != null && incomingAnalysis.eIsProxy()) {
			InternalEObject oldIncomingAnalysis = (InternalEObject) incomingAnalysis;
			incomingAnalysis = (Analysis) eResolveProxy(oldIncomingAnalysis);
			if (incomingAnalysis != oldIncomingAnalysis) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.PRESCRIPTIVE_MODEL__INCOMING_ANALYSIS, oldIncomingAnalysis, incomingAnalysis));
			}
		}
		return incomingAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analysis basicGetIncomingAnalysis() {
		return incomingAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingAnalysis(Analysis newIncomingAnalysis, NotificationChain msgs) {
		Analysis oldIncomingAnalysis = incomingAnalysis;
		incomingAnalysis = newIncomingAnalysis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.PRESCRIPTIVE_MODEL__INCOMING_ANALYSIS, oldIncomingAnalysis, newIncomingAnalysis);
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
	public void setIncomingAnalysis(Analysis newIncomingAnalysis) {
		if (newIncomingAnalysis != incomingAnalysis) {
			NotificationChain msgs = null;
			if (incomingAnalysis != null)
				msgs = ((InternalEObject) incomingAnalysis).eInverseRemove(this, Fig1Package.ANALYSIS__TARGET,
						Analysis.class, msgs);
			if (newIncomingAnalysis != null)
				msgs = ((InternalEObject) newIncomingAnalysis).eInverseAdd(this, Fig1Package.ANALYSIS__TARGET,
						Analysis.class, msgs);
			msgs = basicSetIncomingAnalysis(newIncomingAnalysis, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.PRESCRIPTIVE_MODEL__INCOMING_ANALYSIS,
					newIncomingAnalysis, newIncomingAnalysis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generation getOutgoingGeneration() {
		if (outgoingGeneration != null && outgoingGeneration.eIsProxy()) {
			InternalEObject oldOutgoingGeneration = (InternalEObject) outgoingGeneration;
			outgoingGeneration = (Generation) eResolveProxy(oldOutgoingGeneration);
			if (outgoingGeneration != oldOutgoingGeneration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_GENERATION, oldOutgoingGeneration,
							outgoingGeneration));
			}
		}
		return outgoingGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generation basicGetOutgoingGeneration() {
		return outgoingGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutgoingGeneration(Generation newOutgoingGeneration, NotificationChain msgs) {
		Generation oldOutgoingGeneration = outgoingGeneration;
		outgoingGeneration = newOutgoingGeneration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_GENERATION, oldOutgoingGeneration, newOutgoingGeneration);
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
	public void setOutgoingGeneration(Generation newOutgoingGeneration) {
		if (newOutgoingGeneration != outgoingGeneration) {
			NotificationChain msgs = null;
			if (outgoingGeneration != null)
				msgs = ((InternalEObject) outgoingGeneration).eInverseRemove(this, Fig1Package.GENERATION__SOURCE,
						Generation.class, msgs);
			if (newOutgoingGeneration != null)
				msgs = ((InternalEObject) newOutgoingGeneration).eInverseAdd(this, Fig1Package.GENERATION__SOURCE,
						Generation.class, msgs);
			msgs = basicSetOutgoingGeneration(newOutgoingGeneration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_GENERATION,
					newOutgoingGeneration, newOutgoingGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generation getIncomingGeneration() {
		if (incomingGeneration != null && incomingGeneration.eIsProxy()) {
			InternalEObject oldIncomingGeneration = (InternalEObject) incomingGeneration;
			incomingGeneration = (Generation) eResolveProxy(oldIncomingGeneration);
			if (incomingGeneration != oldIncomingGeneration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.PRESCRIPTIVE_MODEL__INCOMING_GENERATION, oldIncomingGeneration,
							incomingGeneration));
			}
		}
		return incomingGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generation basicGetIncomingGeneration() {
		return incomingGeneration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingGeneration(Generation newIncomingGeneration, NotificationChain msgs) {
		Generation oldIncomingGeneration = incomingGeneration;
		incomingGeneration = newIncomingGeneration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.PRESCRIPTIVE_MODEL__INCOMING_GENERATION, oldIncomingGeneration, newIncomingGeneration);
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
	public void setIncomingGeneration(Generation newIncomingGeneration) {
		if (newIncomingGeneration != incomingGeneration) {
			NotificationChain msgs = null;
			if (incomingGeneration != null)
				msgs = ((InternalEObject) incomingGeneration).eInverseRemove(this, Fig1Package.GENERATION__TARGET,
						Generation.class, msgs);
			if (newIncomingGeneration != null)
				msgs = ((InternalEObject) newIncomingGeneration).eInverseAdd(this, Fig1Package.GENERATION__TARGET,
						Generation.class, msgs);
			msgs = basicSetIncomingGeneration(newIncomingGeneration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.PRESCRIPTIVE_MODEL__INCOMING_GENERATION,
					newIncomingGeneration, newIncomingGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_ENACTMENT:
			if (outgoingEnactment != null)
				msgs = ((InternalEObject) outgoingEnactment).eInverseRemove(this, Fig1Package.ENACTMENT__SOURCE,
						Enactment.class, msgs);
			return basicSetOutgoingEnactment((Enactment) otherEnd, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_DEPLOYMENT:
			if (outgoingDeployment != null)
				msgs = ((InternalEObject) outgoingDeployment).eInverseRemove(this, Fig1Package.DEPLOYMENT__SOURCE,
						Deployment.class, msgs);
			return basicSetOutgoingDeployment((Deployment) otherEnd, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__INCOMING_ANALYSIS:
			if (incomingAnalysis != null)
				msgs = ((InternalEObject) incomingAnalysis).eInverseRemove(this, Fig1Package.ANALYSIS__TARGET,
						Analysis.class, msgs);
			return basicSetIncomingAnalysis((Analysis) otherEnd, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_GENERATION:
			if (outgoingGeneration != null)
				msgs = ((InternalEObject) outgoingGeneration).eInverseRemove(this, Fig1Package.GENERATION__SOURCE,
						Generation.class, msgs);
			return basicSetOutgoingGeneration((Generation) otherEnd, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__INCOMING_GENERATION:
			if (incomingGeneration != null)
				msgs = ((InternalEObject) incomingGeneration).eInverseRemove(this, Fig1Package.GENERATION__TARGET,
						Generation.class, msgs);
			return basicSetIncomingGeneration((Generation) otherEnd, msgs);
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
		case Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_ENACTMENT:
			return basicSetOutgoingEnactment(null, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_DEPLOYMENT:
			return basicSetOutgoingDeployment(null, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__INCOMING_ANALYSIS:
			return basicSetIncomingAnalysis(null, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_GENERATION:
			return basicSetOutgoingGeneration(null, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__INCOMING_GENERATION:
			return basicSetIncomingGeneration(null, msgs);
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
		case Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_ENACTMENT:
			if (resolve)
				return getOutgoingEnactment();
			return basicGetOutgoingEnactment();
		case Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_DEPLOYMENT:
			if (resolve)
				return getOutgoingDeployment();
			return basicGetOutgoingDeployment();
		case Fig1Package.PRESCRIPTIVE_MODEL__INCOMING_ANALYSIS:
			if (resolve)
				return getIncomingAnalysis();
			return basicGetIncomingAnalysis();
		case Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_GENERATION:
			if (resolve)
				return getOutgoingGeneration();
			return basicGetOutgoingGeneration();
		case Fig1Package.PRESCRIPTIVE_MODEL__INCOMING_GENERATION:
			if (resolve)
				return getIncomingGeneration();
			return basicGetIncomingGeneration();
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
		case Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_ENACTMENT:
			setOutgoingEnactment((Enactment) newValue);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_DEPLOYMENT:
			setOutgoingDeployment((Deployment) newValue);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__INCOMING_ANALYSIS:
			setIncomingAnalysis((Analysis) newValue);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_GENERATION:
			setOutgoingGeneration((Generation) newValue);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__INCOMING_GENERATION:
			setIncomingGeneration((Generation) newValue);
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
		case Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_ENACTMENT:
			setOutgoingEnactment((Enactment) null);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_DEPLOYMENT:
			setOutgoingDeployment((Deployment) null);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__INCOMING_ANALYSIS:
			setIncomingAnalysis((Analysis) null);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_GENERATION:
			setOutgoingGeneration((Generation) null);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__INCOMING_GENERATION:
			setIncomingGeneration((Generation) null);
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
		case Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_ENACTMENT:
			return outgoingEnactment != null;
		case Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_DEPLOYMENT:
			return outgoingDeployment != null;
		case Fig1Package.PRESCRIPTIVE_MODEL__INCOMING_ANALYSIS:
			return incomingAnalysis != null;
		case Fig1Package.PRESCRIPTIVE_MODEL__OUTGOING_GENERATION:
			return outgoingGeneration != null;
		case Fig1Package.PRESCRIPTIVE_MODEL__INCOMING_GENERATION:
			return incomingGeneration != null;
		}
		return super.eIsSet(featureID);
	}

} //PrescriptiveModelImpl
