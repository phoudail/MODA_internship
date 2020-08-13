/**
 */
package internship.moda.fig1.util;

import internship.moda.fig1.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see internship.moda.fig1.Fig1Package
 * @generated
 */
public class Fig1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Fig1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fig1Switch() {
		if (modelPackage == null) {
			modelPackage = Fig1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Fig1Package.MODA: {
			MODA moda = (MODA) theEObject;
			T result = caseMODA(moda);
			if (result == null)
				result = caseModaNode(moda);
			if (result == null)
				result = caseNamedElement(moda);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fig1Package.DATA: {
			Data data = (Data) theEObject;
			T result = caseData(data);
			if (result == null)
				result = caseModaNode(data);
			if (result == null)
				result = caseNamedElement(data);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fig1Package.SOFTWARE: {
			Software software = (Software) theEObject;
			T result = caseSoftware(software);
			if (result == null)
				result = caseModaNode(software);
			if (result == null)
				result = caseNamedElement(software);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fig1Package.SOCIO_TECHNICAL_SYSTEM: {
			SocioTechnicalSystem socioTechnicalSystem = (SocioTechnicalSystem) theEObject;
			T result = caseSocioTechnicalSystem(socioTechnicalSystem);
			if (result == null)
				result = caseModaNode(socioTechnicalSystem);
			if (result == null)
				result = caseNamedElement(socioTechnicalSystem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fig1Package.MODEL: {
			Model model = (Model) theEObject;
			T result = caseModel(model);
			if (result == null)
				result = caseModaNode(model);
			if (result == null)
				result = caseNamedElement(model);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fig1Package.MODA_NODE: {
			ModaNode modaNode = (ModaNode) theEObject;
			T result = caseModaNode(modaNode);
			if (result == null)
				result = caseNamedElement(modaNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fig1Package.MODA_RELATION: {
			ModaRelation modaRelation = (ModaRelation) theEObject;
			T result = caseModaRelation(modaRelation);
			if (result == null)
				result = caseNamedElement(modaRelation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fig1Package.OTHER_INTERPLAY: {
			OtherInterplay otherInterplay = (OtherInterplay) theEObject;
			T result = caseOtherInterplay(otherInterplay);
			if (result == null)
				result = caseModaRelation(otherInterplay);
			if (result == null)
				result = caseNamedElement(otherInterplay);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fig1Package.DATA_PURPOSE: {
			DataPurpose dataPurpose = (DataPurpose) theEObject;
			T result = caseDataPurpose(dataPurpose);
			if (result == null)
				result = caseModaRelation(dataPurpose);
			if (result == null)
				result = caseNamedElement(dataPurpose);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fig1Package.ENACTMENT: {
			Enactment enactment = (Enactment) theEObject;
			T result = caseEnactment(enactment);
			if (result == null)
				result = caseModaRelation(enactment);
			if (result == null)
				result = caseNamedElement(enactment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fig1Package.DEPLOYMENT: {
			Deployment deployment = (Deployment) theEObject;
			T result = caseDeployment(deployment);
			if (result == null)
				result = caseModaRelation(deployment);
			if (result == null)
				result = caseNamedElement(deployment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fig1Package.PREPARATION: {
			Preparation preparation = (Preparation) theEObject;
			T result = casePreparation(preparation);
			if (result == null)
				result = caseModaRelation(preparation);
			if (result == null)
				result = caseNamedElement(preparation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fig1Package.ANALYSIS: {
			Analysis analysis = (Analysis) theEObject;
			T result = caseAnalysis(analysis);
			if (result == null)
				result = caseModaRelation(analysis);
			if (result == null)
				result = caseNamedElement(analysis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fig1Package.GENERATION: {
			Generation generation = (Generation) theEObject;
			T result = caseGeneration(generation);
			if (result == null)
				result = caseModaRelation(generation);
			if (result == null)
				result = caseNamedElement(generation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fig1Package.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Fig1Package.GENERALIZATION: {
			Generalization generalization = (Generalization) theEObject;
			T result = caseGeneralization(generalization);
			if (result == null)
				result = caseModaRelation(generalization);
			if (result == null)
				result = caseNamedElement(generalization);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Software</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Software</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftware(Software object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Socio Technical System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Socio Technical System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocioTechnicalSystem(SocioTechnicalSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MODA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MODA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMODA(MODA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moda Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moda Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModaNode(ModaNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Moda Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Moda Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModaRelation(ModaRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Other Interplay</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Other Interplay</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtherInterplay(OtherInterplay object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Purpose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Purpose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPurpose(DataPurpose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enactment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enactment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnactment(Enactment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeployment(Deployment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preparation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preparation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreparation(Preparation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Analysis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Analysis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnalysis(Analysis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneration(Generation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralization(Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Fig1Switch
