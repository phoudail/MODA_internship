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
 *   <li>{@link internship.moda.fig1.impl.PrescriptiveModelImpl#getEnactment <em>Enactment</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.PrescriptiveModelImpl#getRunningSoftware <em>Running Software</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.PrescriptiveModelImpl#getAnalysisResult <em>Analysis Result</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.PrescriptiveModelImpl#getGeneration <em>Generation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrescriptiveModelImpl extends ModelRoleImpl implements PrescriptiveModel {
	/**
	 * The cached value of the '{@link #getEnactment() <em>Enactment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnactment()
	 * @generated
	 * @ordered
	 */
	protected Enactment enactment;

	/**
	 * The cached value of the '{@link #getRunningSoftware() <em>Running Software</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunningSoftware()
	 * @generated
	 * @ordered
	 */
	protected Deployment runningSoftware;

	/**
	 * The cached value of the '{@link #getAnalysisResult() <em>Analysis Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalysisResult()
	 * @generated
	 * @ordered
	 */
	protected Analysis analysisResult;

	/**
	 * The cached value of the '{@link #getGeneration() <em>Generation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneration()
	 * @generated
	 * @ordered
	 */
	protected Generation generation;

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
	public Enactment getEnactment() {
		if (enactment != null && enactment.eIsProxy()) {
			InternalEObject oldEnactment = (InternalEObject) enactment;
			enactment = (Enactment) eResolveProxy(oldEnactment);
			if (enactment != oldEnactment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.PRESCRIPTIVE_MODEL__ENACTMENT,
							oldEnactment, enactment));
			}
		}
		return enactment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enactment basicGetEnactment() {
		return enactment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnactment(Enactment newEnactment, NotificationChain msgs) {
		Enactment oldEnactment = enactment;
		enactment = newEnactment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.PRESCRIPTIVE_MODEL__ENACTMENT, oldEnactment, newEnactment);
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
	public void setEnactment(Enactment newEnactment) {
		if (newEnactment != enactment) {
			NotificationChain msgs = null;
			if (enactment != null)
				msgs = ((InternalEObject) enactment).eInverseRemove(this, Fig1Package.ENACTMENT__PRESCRIPTIVEMODEL,
						Enactment.class, msgs);
			if (newEnactment != null)
				msgs = ((InternalEObject) newEnactment).eInverseAdd(this, Fig1Package.ENACTMENT__PRESCRIPTIVEMODEL,
						Enactment.class, msgs);
			msgs = basicSetEnactment(newEnactment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.PRESCRIPTIVE_MODEL__ENACTMENT,
					newEnactment, newEnactment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getRunningSoftware() {
		if (runningSoftware != null && runningSoftware.eIsProxy()) {
			InternalEObject oldRunningSoftware = (InternalEObject) runningSoftware;
			runningSoftware = (Deployment) eResolveProxy(oldRunningSoftware);
			if (runningSoftware != oldRunningSoftware) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.PRESCRIPTIVE_MODEL__RUNNING_SOFTWARE, oldRunningSoftware, runningSoftware));
			}
		}
		return runningSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment basicGetRunningSoftware() {
		return runningSoftware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRunningSoftware(Deployment newRunningSoftware, NotificationChain msgs) {
		Deployment oldRunningSoftware = runningSoftware;
		runningSoftware = newRunningSoftware;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.PRESCRIPTIVE_MODEL__RUNNING_SOFTWARE, oldRunningSoftware, newRunningSoftware);
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
	public void setRunningSoftware(Deployment newRunningSoftware) {
		if (newRunningSoftware != runningSoftware) {
			NotificationChain msgs = null;
			if (runningSoftware != null)
				msgs = ((InternalEObject) runningSoftware).eInverseRemove(this,
						Fig1Package.DEPLOYMENT__PRESCRIPTIVEMODEL, Deployment.class, msgs);
			if (newRunningSoftware != null)
				msgs = ((InternalEObject) newRunningSoftware).eInverseAdd(this,
						Fig1Package.DEPLOYMENT__PRESCRIPTIVEMODEL, Deployment.class, msgs);
			msgs = basicSetRunningSoftware(newRunningSoftware, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.PRESCRIPTIVE_MODEL__RUNNING_SOFTWARE,
					newRunningSoftware, newRunningSoftware));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analysis getAnalysisResult() {
		if (analysisResult != null && analysisResult.eIsProxy()) {
			InternalEObject oldAnalysisResult = (InternalEObject) analysisResult;
			analysisResult = (Analysis) eResolveProxy(oldAnalysisResult);
			if (analysisResult != oldAnalysisResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.PRESCRIPTIVE_MODEL__ANALYSIS_RESULT, oldAnalysisResult, analysisResult));
			}
		}
		return analysisResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Analysis basicGetAnalysisResult() {
		return analysisResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnalysisResult(Analysis newAnalysisResult, NotificationChain msgs) {
		Analysis oldAnalysisResult = analysisResult;
		analysisResult = newAnalysisResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.PRESCRIPTIVE_MODEL__ANALYSIS_RESULT, oldAnalysisResult, newAnalysisResult);
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
	public void setAnalysisResult(Analysis newAnalysisResult) {
		if (newAnalysisResult != analysisResult) {
			NotificationChain msgs = null;
			if (analysisResult != null)
				msgs = ((InternalEObject) analysisResult).eInverseRemove(this, Fig1Package.ANALYSIS__PRESCRIPTIVEMODEL,
						Analysis.class, msgs);
			if (newAnalysisResult != null)
				msgs = ((InternalEObject) newAnalysisResult).eInverseAdd(this, Fig1Package.ANALYSIS__PRESCRIPTIVEMODEL,
						Analysis.class, msgs);
			msgs = basicSetAnalysisResult(newAnalysisResult, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.PRESCRIPTIVE_MODEL__ANALYSIS_RESULT,
					newAnalysisResult, newAnalysisResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generation getGeneration() {
		if (generation != null && generation.eIsProxy()) {
			InternalEObject oldGeneration = (InternalEObject) generation;
			generation = (Generation) eResolveProxy(oldGeneration);
			if (generation != oldGeneration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.PRESCRIPTIVE_MODEL__GENERATION, oldGeneration, generation));
			}
		}
		return generation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generation basicGetGeneration() {
		return generation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneration(Generation newGeneration, NotificationChain msgs) {
		Generation oldGeneration = generation;
		generation = newGeneration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.PRESCRIPTIVE_MODEL__GENERATION, oldGeneration, newGeneration);
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
	public void setGeneration(Generation newGeneration) {
		if (newGeneration != generation) {
			NotificationChain msgs = null;
			if (generation != null)
				msgs = ((InternalEObject) generation).eInverseRemove(this, Fig1Package.GENERATION__PRESCRIPTIVEMODEL,
						Generation.class, msgs);
			if (newGeneration != null)
				msgs = ((InternalEObject) newGeneration).eInverseAdd(this, Fig1Package.GENERATION__PRESCRIPTIVEMODEL,
						Generation.class, msgs);
			msgs = basicSetGeneration(newGeneration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.PRESCRIPTIVE_MODEL__GENERATION,
					newGeneration, newGeneration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Fig1Package.PRESCRIPTIVE_MODEL__ENACTMENT:
			if (enactment != null)
				msgs = ((InternalEObject) enactment).eInverseRemove(this, Fig1Package.ENACTMENT__PRESCRIPTIVEMODEL,
						Enactment.class, msgs);
			return basicSetEnactment((Enactment) otherEnd, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__RUNNING_SOFTWARE:
			if (runningSoftware != null)
				msgs = ((InternalEObject) runningSoftware).eInverseRemove(this,
						Fig1Package.DEPLOYMENT__PRESCRIPTIVEMODEL, Deployment.class, msgs);
			return basicSetRunningSoftware((Deployment) otherEnd, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__ANALYSIS_RESULT:
			if (analysisResult != null)
				msgs = ((InternalEObject) analysisResult).eInverseRemove(this, Fig1Package.ANALYSIS__PRESCRIPTIVEMODEL,
						Analysis.class, msgs);
			return basicSetAnalysisResult((Analysis) otherEnd, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__GENERATION:
			if (generation != null)
				msgs = ((InternalEObject) generation).eInverseRemove(this, Fig1Package.GENERATION__PRESCRIPTIVEMODEL,
						Generation.class, msgs);
			return basicSetGeneration((Generation) otherEnd, msgs);
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
		case Fig1Package.PRESCRIPTIVE_MODEL__ENACTMENT:
			return basicSetEnactment(null, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__RUNNING_SOFTWARE:
			return basicSetRunningSoftware(null, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__ANALYSIS_RESULT:
			return basicSetAnalysisResult(null, msgs);
		case Fig1Package.PRESCRIPTIVE_MODEL__GENERATION:
			return basicSetGeneration(null, msgs);
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
		case Fig1Package.PRESCRIPTIVE_MODEL__ENACTMENT:
			if (resolve)
				return getEnactment();
			return basicGetEnactment();
		case Fig1Package.PRESCRIPTIVE_MODEL__RUNNING_SOFTWARE:
			if (resolve)
				return getRunningSoftware();
			return basicGetRunningSoftware();
		case Fig1Package.PRESCRIPTIVE_MODEL__ANALYSIS_RESULT:
			if (resolve)
				return getAnalysisResult();
			return basicGetAnalysisResult();
		case Fig1Package.PRESCRIPTIVE_MODEL__GENERATION:
			if (resolve)
				return getGeneration();
			return basicGetGeneration();
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
		case Fig1Package.PRESCRIPTIVE_MODEL__ENACTMENT:
			setEnactment((Enactment) newValue);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__RUNNING_SOFTWARE:
			setRunningSoftware((Deployment) newValue);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__ANALYSIS_RESULT:
			setAnalysisResult((Analysis) newValue);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__GENERATION:
			setGeneration((Generation) newValue);
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
		case Fig1Package.PRESCRIPTIVE_MODEL__ENACTMENT:
			setEnactment((Enactment) null);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__RUNNING_SOFTWARE:
			setRunningSoftware((Deployment) null);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__ANALYSIS_RESULT:
			setAnalysisResult((Analysis) null);
			return;
		case Fig1Package.PRESCRIPTIVE_MODEL__GENERATION:
			setGeneration((Generation) null);
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
		case Fig1Package.PRESCRIPTIVE_MODEL__ENACTMENT:
			return enactment != null;
		case Fig1Package.PRESCRIPTIVE_MODEL__RUNNING_SOFTWARE:
			return runningSoftware != null;
		case Fig1Package.PRESCRIPTIVE_MODEL__ANALYSIS_RESULT:
			return analysisResult != null;
		case Fig1Package.PRESCRIPTIVE_MODEL__GENERATION:
			return generation != null;
		}
		return super.eIsSet(featureID);
	}

} //PrescriptiveModelImpl
