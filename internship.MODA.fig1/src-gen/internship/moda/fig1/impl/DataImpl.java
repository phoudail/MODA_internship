/**
 */
package internship.moda.fig1.impl;

import internship.moda.fig1.Data;
import internship.moda.fig1.DataPurpose;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.Generalization;
import internship.moda.fig1.OtherInterplay;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.impl.DataImpl#getOtherinterplay <em>Otherinterplay</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.DataImpl#getDatapurpose <em>Datapurpose</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.DataImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.DataImpl#isInputData <em>Input Data</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.DataImpl#isOutputData <em>Output Data</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.DataImpl#isExternalData <em>External Data</em>}</li>
 *   <li>{@link internship.moda.fig1.impl.DataImpl#isMeasuredData <em>Measured Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataImpl extends ModaNodeImpl implements Data {
	/**
	 * The cached value of the '{@link #getOtherinterplay() <em>Otherinterplay</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherinterplay()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherInterplay> otherinterplay;

	/**
	 * The cached value of the '{@link #getDatapurpose() <em>Datapurpose</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatapurpose()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPurpose> datapurpose;

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
	 * The default value of the '{@link #isInputData() <em>Input Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInputData()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INPUT_DATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInputData() <em>Input Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInputData()
	 * @generated
	 * @ordered
	 */
	protected boolean inputData = INPUT_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #isOutputData() <em>Output Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutputData()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTPUT_DATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOutputData() <em>Output Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutputData()
	 * @generated
	 * @ordered
	 */
	protected boolean outputData = OUTPUT_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #isExternalData() <em>External Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternalData()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_DATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternalData() <em>External Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternalData()
	 * @generated
	 * @ordered
	 */
	protected boolean externalData = EXTERNAL_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #isMeasuredData() <em>Measured Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMeasuredData()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MEASURED_DATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMeasuredData() <em>Measured Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMeasuredData()
	 * @generated
	 * @ordered
	 */
	protected boolean measuredData = MEASURED_DATA_EDEFAULT;

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
	public EList<OtherInterplay> getOtherinterplay() {
		if (otherinterplay == null) {
			otherinterplay = new EObjectWithInverseResolvingEList.ManyInverse<OtherInterplay>(OtherInterplay.class,
					this, Fig1Package.DATA__OTHERINTERPLAY, Fig1Package.OTHER_INTERPLAY__DATA);
		}
		return otherinterplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataPurpose> getDatapurpose() {
		if (datapurpose == null) {
			datapurpose = new EObjectWithInverseResolvingEList<DataPurpose>(DataPurpose.class, this,
					Fig1Package.DATA__DATAPURPOSE, Fig1Package.DATA_PURPOSE__DATA);
		}
		return datapurpose;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fig1Package.DATA__GENERALIZATION,
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
					Fig1Package.DATA__GENERALIZATION, oldGeneralization, newGeneralization);
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
				msgs = ((InternalEObject) generalization).eInverseRemove(this, Fig1Package.GENERALIZATION__SOURCE,
						Generalization.class, msgs);
			if (newGeneralization != null)
				msgs = ((InternalEObject) newGeneralization).eInverseAdd(this, Fig1Package.GENERALIZATION__SOURCE,
						Generalization.class, msgs);
			msgs = basicSetGeneralization(newGeneralization, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.DATA__GENERALIZATION, newGeneralization,
					newGeneralization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInputData() {
		return inputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputData(boolean newInputData) {
		boolean oldInputData = inputData;
		inputData = newInputData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.DATA__INPUT_DATA, oldInputData,
					inputData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutputData() {
		return outputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputData(boolean newOutputData) {
		boolean oldOutputData = outputData;
		outputData = newOutputData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.DATA__OUTPUT_DATA, oldOutputData,
					outputData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExternalData() {
		return externalData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalData(boolean newExternalData) {
		boolean oldExternalData = externalData;
		externalData = newExternalData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.DATA__EXTERNAL_DATA, oldExternalData,
					externalData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMeasuredData() {
		return measuredData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasuredData(boolean newMeasuredData) {
		boolean oldMeasuredData = measuredData;
		measuredData = newMeasuredData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fig1Package.DATA__MEASURED_DATA, oldMeasuredData,
					measuredData));
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
		case Fig1Package.DATA__OTHERINTERPLAY:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOtherinterplay()).basicAdd(otherEnd, msgs);
		case Fig1Package.DATA__DATAPURPOSE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDatapurpose()).basicAdd(otherEnd, msgs);
		case Fig1Package.DATA__GENERALIZATION:
			if (generalization != null)
				msgs = ((InternalEObject) generalization).eInverseRemove(this, Fig1Package.GENERALIZATION__SOURCE,
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
		case Fig1Package.DATA__OTHERINTERPLAY:
			return ((InternalEList<?>) getOtherinterplay()).basicRemove(otherEnd, msgs);
		case Fig1Package.DATA__DATAPURPOSE:
			return ((InternalEList<?>) getDatapurpose()).basicRemove(otherEnd, msgs);
		case Fig1Package.DATA__GENERALIZATION:
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
		case Fig1Package.DATA__OTHERINTERPLAY:
			return getOtherinterplay();
		case Fig1Package.DATA__DATAPURPOSE:
			return getDatapurpose();
		case Fig1Package.DATA__GENERALIZATION:
			if (resolve)
				return getGeneralization();
			return basicGetGeneralization();
		case Fig1Package.DATA__INPUT_DATA:
			return isInputData();
		case Fig1Package.DATA__OUTPUT_DATA:
			return isOutputData();
		case Fig1Package.DATA__EXTERNAL_DATA:
			return isExternalData();
		case Fig1Package.DATA__MEASURED_DATA:
			return isMeasuredData();
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
		case Fig1Package.DATA__OTHERINTERPLAY:
			getOtherinterplay().clear();
			getOtherinterplay().addAll((Collection<? extends OtherInterplay>) newValue);
			return;
		case Fig1Package.DATA__DATAPURPOSE:
			getDatapurpose().clear();
			getDatapurpose().addAll((Collection<? extends DataPurpose>) newValue);
			return;
		case Fig1Package.DATA__GENERALIZATION:
			setGeneralization((Generalization) newValue);
			return;
		case Fig1Package.DATA__INPUT_DATA:
			setInputData((Boolean) newValue);
			return;
		case Fig1Package.DATA__OUTPUT_DATA:
			setOutputData((Boolean) newValue);
			return;
		case Fig1Package.DATA__EXTERNAL_DATA:
			setExternalData((Boolean) newValue);
			return;
		case Fig1Package.DATA__MEASURED_DATA:
			setMeasuredData((Boolean) newValue);
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
		case Fig1Package.DATA__OTHERINTERPLAY:
			getOtherinterplay().clear();
			return;
		case Fig1Package.DATA__DATAPURPOSE:
			getDatapurpose().clear();
			return;
		case Fig1Package.DATA__GENERALIZATION:
			setGeneralization((Generalization) null);
			return;
		case Fig1Package.DATA__INPUT_DATA:
			setInputData(INPUT_DATA_EDEFAULT);
			return;
		case Fig1Package.DATA__OUTPUT_DATA:
			setOutputData(OUTPUT_DATA_EDEFAULT);
			return;
		case Fig1Package.DATA__EXTERNAL_DATA:
			setExternalData(EXTERNAL_DATA_EDEFAULT);
			return;
		case Fig1Package.DATA__MEASURED_DATA:
			setMeasuredData(MEASURED_DATA_EDEFAULT);
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
		case Fig1Package.DATA__OTHERINTERPLAY:
			return otherinterplay != null && !otherinterplay.isEmpty();
		case Fig1Package.DATA__DATAPURPOSE:
			return datapurpose != null && !datapurpose.isEmpty();
		case Fig1Package.DATA__GENERALIZATION:
			return generalization != null;
		case Fig1Package.DATA__INPUT_DATA:
			return inputData != INPUT_DATA_EDEFAULT;
		case Fig1Package.DATA__OUTPUT_DATA:
			return outputData != OUTPUT_DATA_EDEFAULT;
		case Fig1Package.DATA__EXTERNAL_DATA:
			return externalData != EXTERNAL_DATA_EDEFAULT;
		case Fig1Package.DATA__MEASURED_DATA:
			return measuredData != MEASURED_DATA_EDEFAULT;
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
		result.append(" (inputData: ");
		result.append(inputData);
		result.append(", outputData: ");
		result.append(outputData);
		result.append(", externalData: ");
		result.append(externalData);
		result.append(", measuredData: ");
		result.append(measuredData);
		result.append(')');
		return result.toString();
	}

} //DataImpl
