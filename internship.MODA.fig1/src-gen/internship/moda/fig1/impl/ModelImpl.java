/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.Analysis;
import internship.moda.fig1.Deployment;
import internship.moda.fig1.Enactment;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.Generalization;
import internship.moda.fig1.Generation;
import internship.moda.fig1.Model;
import internship.moda.fig1.Preparation;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.ModelImpl#getIncomingPreparation <em>Incoming Preparation</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.ModelImpl#getIncomingGeneralization <em>Incoming Generalization</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.ModelImpl#getIncomingAnalysis <em>Incoming Analysis</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.ModelImpl#getOutgoingDeployment <em>Outgoing Deployment</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.ModelImpl#getOutgoingGeneration <em>Outgoing Generation</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.ModelImpl#getIncomingGeneration <em>Incoming Generation</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.ModelImpl#getOutgoingEnactment <em>Outgoing Enactment</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.ModelImpl#isPrescriptiveModel <em>Prescriptive Model</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.ModelImpl#isPredictiveModel <em>Predictive Model</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.ModelImpl#isDescriptiveModel <em>Descriptive Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends ModaNodeImpl implements Model {
	/**
	 * The cached value of the '{@link #getIncomingPreparation() <em>Incoming Preparation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingPreparation()
	 * @generated
	 * @ordered
	 */
	protected Preparation incomingPreparation;
	/**
	 * The cached value of the '{@link #getIncomingGeneralization() <em>Incoming Generalization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingGeneralization()
	 * @generated
	 * @ordered
	 */
	protected Generalization incomingGeneralization;
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
	 * The cached value of the '{@link #getOutgoingDeployment() <em>Outgoing Deployment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingDeployment()
	 * @generated
	 * @ordered
	 */
	protected Deployment outgoingDeployment;
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
	 * The cached value of the '{@link #getOutgoingEnactment() <em>Outgoing Enactment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingEnactment()
	 * @generated
	 * @ordered
	 */
	protected Enactment outgoingEnactment;
	/**
	 * The default value of the '{@link #isPrescriptiveModel() <em>Prescriptive Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrescriptiveModel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRESCRIPTIVE_MODEL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isPrescriptiveModel() <em>Prescriptive Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrescriptiveModel()
	 * @generated
	 * @ordered
	 */
	protected boolean prescriptiveModel = PRESCRIPTIVE_MODEL_EDEFAULT;
	/**
	 * The default value of the '{@link #isPredictiveModel() <em>Predictive Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPredictiveModel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREDICTIVE_MODEL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isPredictiveModel() <em>Predictive Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPredictiveModel()
	 * @generated
	 * @ordered
	 */
	protected boolean predictiveModel = PREDICTIVE_MODEL_EDEFAULT;
	/**
	 * The default value of the '{@link #isDescriptiveModel() <em>Descriptive Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDescriptiveModel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DESCRIPTIVE_MODEL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isDescriptiveModel() <em>Descriptive Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDescriptiveModel()
	 * @generated
	 * @ordered
	 */
	protected boolean descriptiveModel = DESCRIPTIVE_MODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fig1Package.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preparation getIncomingPreparation() {
		if (incomingPreparation != null && incomingPreparation.eIsProxy()) {
			InternalEObject oldIncomingPreparation = (InternalEObject) incomingPreparation;
			incomingPreparation = (Preparation) eResolveProxy(oldIncomingPreparation);
			if (incomingPreparation != oldIncomingPreparation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.MODEL__INCOMING_PREPARATION,
							oldIncomingPreparation, incomingPreparation));
			}
		}
		return incomingPreparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Preparation basicGetIncomingPreparation() {
		return incomingPreparation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingPreparation(Preparation newIncomingPreparation, NotificationChain msgs) {
		Preparation oldIncomingPreparation = incomingPreparation;
		incomingPreparation = newIncomingPreparation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.MODEL__INCOMING_PREPARATION, oldIncomingPreparation, newIncomingPreparation);
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
	public void setIncomingPreparation(Preparation newIncomingPreparation) {
		if (newIncomingPreparation != incomingPreparation) {
			NotificationChain msgs = null;
			if (incomingPreparation != null)
				msgs = ((InternalEObject) incomingPreparation).eInverseRemove(this, Fig1Package.PREPARATION__TARGET,
						Preparation.class, msgs);
			if (newIncomingPreparation != null)
				msgs = ((InternalEObject) newIncomingPreparation).eInverseAdd(this, Fig1Package.PREPARATION__TARGET,
						Preparation.class, msgs);
			msgs = basicSetIncomingPreparation(newIncomingPreparation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.MODEL__INCOMING_PREPARATION,
					newIncomingPreparation, newIncomingPreparation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization getIncomingGeneralization() {
		if (incomingGeneralization != null && incomingGeneralization.eIsProxy()) {
			InternalEObject oldIncomingGeneralization = (InternalEObject) incomingGeneralization;
			incomingGeneralization = (Generalization) eResolveProxy(oldIncomingGeneralization);
			if (incomingGeneralization != oldIncomingGeneralization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Fig1Package.MODEL__INCOMING_GENERALIZATION, oldIncomingGeneralization,
							incomingGeneralization));
			}
		}
		return incomingGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generalization basicGetIncomingGeneralization() {
		return incomingGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingGeneralization(Generalization newIncomingGeneralization,
			NotificationChain msgs) {
		Generalization oldIncomingGeneralization = incomingGeneralization;
		incomingGeneralization = newIncomingGeneralization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Fig1Package.MODEL__INCOMING_GENERALIZATION, oldIncomingGeneralization, newIncomingGeneralization);
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
	public void setIncomingGeneralization(Generalization newIncomingGeneralization) {
		if (newIncomingGeneralization != incomingGeneralization) {
			NotificationChain msgs = null;
			if (incomingGeneralization != null)
				msgs = ((InternalEObject) incomingGeneralization).eInverseRemove(this,
						Fig1Package.GENERALIZATION__TARGET, Generalization.class, msgs);
			if (newIncomingGeneralization != null)
				msgs = ((InternalEObject) newIncomingGeneralization).eInverseAdd(this,
						Fig1Package.GENERALIZATION__TARGET, Generalization.class, msgs);
			msgs = basicSetIncomingGeneralization(newIncomingGeneralization, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.MODEL__INCOMING_GENERALIZATION,
					newIncomingGeneralization, newIncomingGeneralization));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.MODEL__INCOMING_ANALYSIS,
							oldIncomingAnalysis, incomingAnalysis));
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
					Fig1Package.MODEL__INCOMING_ANALYSIS, oldIncomingAnalysis, newIncomingAnalysis);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.MODEL__INCOMING_ANALYSIS,
					newIncomingAnalysis, newIncomingAnalysis));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.MODEL__OUTGOING_DEPLOYMENT,
							oldOutgoingDeployment, outgoingDeployment));
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
					Fig1Package.MODEL__OUTGOING_DEPLOYMENT, oldOutgoingDeployment, newOutgoingDeployment);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.MODEL__OUTGOING_DEPLOYMENT,
					newOutgoingDeployment, newOutgoingDeployment));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.MODEL__OUTGOING_GENERATION,
							oldOutgoingGeneration, outgoingGeneration));
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
					Fig1Package.MODEL__OUTGOING_GENERATION, oldOutgoingGeneration, newOutgoingGeneration);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.MODEL__OUTGOING_GENERATION,
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.MODEL__INCOMING_GENERATION,
							oldIncomingGeneration, incomingGeneration));
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
					Fig1Package.MODEL__INCOMING_GENERATION, oldIncomingGeneration, newIncomingGeneration);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.MODEL__INCOMING_GENERATION,
					newIncomingGeneration, newIncomingGeneration));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.MODEL__OUTGOING_ENACTMENT,
							oldOutgoingEnactment, outgoingEnactment));
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
					Fig1Package.MODEL__OUTGOING_ENACTMENT, oldOutgoingEnactment, newOutgoingEnactment);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.MODEL__OUTGOING_ENACTMENT,
					newOutgoingEnactment, newOutgoingEnactment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrescriptiveModel() {
		return prescriptiveModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescriptiveModel(boolean newPrescriptiveModel) {
		boolean oldPrescriptiveModel = prescriptiveModel;
		prescriptiveModel = newPrescriptiveModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.MODEL__PRESCRIPTIVE_MODEL,
					oldPrescriptiveModel, prescriptiveModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPredictiveModel() {
		return predictiveModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredictiveModel(boolean newPredictiveModel) {
		boolean oldPredictiveModel = predictiveModel;
		predictiveModel = newPredictiveModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.MODEL__PREDICTIVE_MODEL,
					oldPredictiveModel, predictiveModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDescriptiveModel() {
		return descriptiveModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptiveModel(boolean newDescriptiveModel) {
		boolean oldDescriptiveModel = descriptiveModel;
		descriptiveModel = newDescriptiveModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.MODEL__DESCRIPTIVE_MODEL,
					oldDescriptiveModel, descriptiveModel));
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
		case Fig1Package.MODEL__INCOMING_PREPARATION:
			if (incomingPreparation != null)
				msgs = ((InternalEObject) incomingPreparation).eInverseRemove(this, Fig1Package.PREPARATION__TARGET,
						Preparation.class, msgs);
			return basicSetIncomingPreparation((Preparation) otherEnd, msgs);
		case Fig1Package.MODEL__INCOMING_GENERALIZATION:
			if (incomingGeneralization != null)
				msgs = ((InternalEObject) incomingGeneralization).eInverseRemove(this,
						Fig1Package.GENERALIZATION__TARGET, Generalization.class, msgs);
			return basicSetIncomingGeneralization((Generalization) otherEnd, msgs);
		case Fig1Package.MODEL__INCOMING_ANALYSIS:
			if (incomingAnalysis != null)
				msgs = ((InternalEObject) incomingAnalysis).eInverseRemove(this, Fig1Package.ANALYSIS__TARGET,
						Analysis.class, msgs);
			return basicSetIncomingAnalysis((Analysis) otherEnd, msgs);
		case Fig1Package.MODEL__OUTGOING_DEPLOYMENT:
			if (outgoingDeployment != null)
				msgs = ((InternalEObject) outgoingDeployment).eInverseRemove(this, Fig1Package.DEPLOYMENT__SOURCE,
						Deployment.class, msgs);
			return basicSetOutgoingDeployment((Deployment) otherEnd, msgs);
		case Fig1Package.MODEL__OUTGOING_GENERATION:
			if (outgoingGeneration != null)
				msgs = ((InternalEObject) outgoingGeneration).eInverseRemove(this, Fig1Package.GENERATION__SOURCE,
						Generation.class, msgs);
			return basicSetOutgoingGeneration((Generation) otherEnd, msgs);
		case Fig1Package.MODEL__INCOMING_GENERATION:
			if (incomingGeneration != null)
				msgs = ((InternalEObject) incomingGeneration).eInverseRemove(this, Fig1Package.GENERATION__TARGET,
						Generation.class, msgs);
			return basicSetIncomingGeneration((Generation) otherEnd, msgs);
		case Fig1Package.MODEL__OUTGOING_ENACTMENT:
			if (outgoingEnactment != null)
				msgs = ((InternalEObject) outgoingEnactment).eInverseRemove(this, Fig1Package.ENACTMENT__SOURCE,
						Enactment.class, msgs);
			return basicSetOutgoingEnactment((Enactment) otherEnd, msgs);
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
		case Fig1Package.MODEL__INCOMING_PREPARATION:
			return basicSetIncomingPreparation(null, msgs);
		case Fig1Package.MODEL__INCOMING_GENERALIZATION:
			return basicSetIncomingGeneralization(null, msgs);
		case Fig1Package.MODEL__INCOMING_ANALYSIS:
			return basicSetIncomingAnalysis(null, msgs);
		case Fig1Package.MODEL__OUTGOING_DEPLOYMENT:
			return basicSetOutgoingDeployment(null, msgs);
		case Fig1Package.MODEL__OUTGOING_GENERATION:
			return basicSetOutgoingGeneration(null, msgs);
		case Fig1Package.MODEL__INCOMING_GENERATION:
			return basicSetIncomingGeneration(null, msgs);
		case Fig1Package.MODEL__OUTGOING_ENACTMENT:
			return basicSetOutgoingEnactment(null, msgs);
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
		case Fig1Package.MODEL__INCOMING_PREPARATION:
			if (resolve)
				return getIncomingPreparation();
			return basicGetIncomingPreparation();
		case Fig1Package.MODEL__INCOMING_GENERALIZATION:
			if (resolve)
				return getIncomingGeneralization();
			return basicGetIncomingGeneralization();
		case Fig1Package.MODEL__INCOMING_ANALYSIS:
			if (resolve)
				return getIncomingAnalysis();
			return basicGetIncomingAnalysis();
		case Fig1Package.MODEL__OUTGOING_DEPLOYMENT:
			if (resolve)
				return getOutgoingDeployment();
			return basicGetOutgoingDeployment();
		case Fig1Package.MODEL__OUTGOING_GENERATION:
			if (resolve)
				return getOutgoingGeneration();
			return basicGetOutgoingGeneration();
		case Fig1Package.MODEL__INCOMING_GENERATION:
			if (resolve)
				return getIncomingGeneration();
			return basicGetIncomingGeneration();
		case Fig1Package.MODEL__OUTGOING_ENACTMENT:
			if (resolve)
				return getOutgoingEnactment();
			return basicGetOutgoingEnactment();
		case Fig1Package.MODEL__PRESCRIPTIVE_MODEL:
			return isPrescriptiveModel();
		case Fig1Package.MODEL__PREDICTIVE_MODEL:
			return isPredictiveModel();
		case Fig1Package.MODEL__DESCRIPTIVE_MODEL:
			return isDescriptiveModel();
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
		case Fig1Package.MODEL__INCOMING_PREPARATION:
			setIncomingPreparation((Preparation) newValue);
			return;
		case Fig1Package.MODEL__INCOMING_GENERALIZATION:
			setIncomingGeneralization((Generalization) newValue);
			return;
		case Fig1Package.MODEL__INCOMING_ANALYSIS:
			setIncomingAnalysis((Analysis) newValue);
			return;
		case Fig1Package.MODEL__OUTGOING_DEPLOYMENT:
			setOutgoingDeployment((Deployment) newValue);
			return;
		case Fig1Package.MODEL__OUTGOING_GENERATION:
			setOutgoingGeneration((Generation) newValue);
			return;
		case Fig1Package.MODEL__INCOMING_GENERATION:
			setIncomingGeneration((Generation) newValue);
			return;
		case Fig1Package.MODEL__OUTGOING_ENACTMENT:
			setOutgoingEnactment((Enactment) newValue);
			return;
		case Fig1Package.MODEL__PRESCRIPTIVE_MODEL:
			setPrescriptiveModel((Boolean) newValue);
			return;
		case Fig1Package.MODEL__PREDICTIVE_MODEL:
			setPredictiveModel((Boolean) newValue);
			return;
		case Fig1Package.MODEL__DESCRIPTIVE_MODEL:
			setDescriptiveModel((Boolean) newValue);
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
		case Fig1Package.MODEL__INCOMING_PREPARATION:
			setIncomingPreparation((Preparation) null);
			return;
		case Fig1Package.MODEL__INCOMING_GENERALIZATION:
			setIncomingGeneralization((Generalization) null);
			return;
		case Fig1Package.MODEL__INCOMING_ANALYSIS:
			setIncomingAnalysis((Analysis) null);
			return;
		case Fig1Package.MODEL__OUTGOING_DEPLOYMENT:
			setOutgoingDeployment((Deployment) null);
			return;
		case Fig1Package.MODEL__OUTGOING_GENERATION:
			setOutgoingGeneration((Generation) null);
			return;
		case Fig1Package.MODEL__INCOMING_GENERATION:
			setIncomingGeneration((Generation) null);
			return;
		case Fig1Package.MODEL__OUTGOING_ENACTMENT:
			setOutgoingEnactment((Enactment) null);
			return;
		case Fig1Package.MODEL__PRESCRIPTIVE_MODEL:
			setPrescriptiveModel(PRESCRIPTIVE_MODEL_EDEFAULT);
			return;
		case Fig1Package.MODEL__PREDICTIVE_MODEL:
			setPredictiveModel(PREDICTIVE_MODEL_EDEFAULT);
			return;
		case Fig1Package.MODEL__DESCRIPTIVE_MODEL:
			setDescriptiveModel(DESCRIPTIVE_MODEL_EDEFAULT);
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
		case Fig1Package.MODEL__INCOMING_PREPARATION:
			return incomingPreparation != null;
		case Fig1Package.MODEL__INCOMING_GENERALIZATION:
			return incomingGeneralization != null;
		case Fig1Package.MODEL__INCOMING_ANALYSIS:
			return incomingAnalysis != null;
		case Fig1Package.MODEL__OUTGOING_DEPLOYMENT:
			return outgoingDeployment != null;
		case Fig1Package.MODEL__OUTGOING_GENERATION:
			return outgoingGeneration != null;
		case Fig1Package.MODEL__INCOMING_GENERATION:
			return incomingGeneration != null;
		case Fig1Package.MODEL__OUTGOING_ENACTMENT:
			return outgoingEnactment != null;
		case Fig1Package.MODEL__PRESCRIPTIVE_MODEL:
			return prescriptiveModel != PRESCRIPTIVE_MODEL_EDEFAULT;
		case Fig1Package.MODEL__PREDICTIVE_MODEL:
			return predictiveModel != PREDICTIVE_MODEL_EDEFAULT;
		case Fig1Package.MODEL__DESCRIPTIVE_MODEL:
			return descriptiveModel != DESCRIPTIVE_MODEL_EDEFAULT;
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
		result.append(" (prescriptiveModel: ");
		result.append(prescriptiveModel);
		result.append(", predictiveModel: ");
		result.append(predictiveModel);
		result.append(", descriptiveModel: ");
		result.append(descriptiveModel);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
