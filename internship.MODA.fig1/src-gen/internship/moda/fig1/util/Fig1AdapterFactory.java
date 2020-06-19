/**
 */
package internship.moda.fig1.util;

import internship.moda.fig1.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see internship.moda.fig1.Fig1Package
 * @generated
 */
public class Fig1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Fig1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fig1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Fig1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Fig1Switch<Adapter> modelSwitch = new Fig1Switch<Adapter>() {
		@Override
		public Adapter caseData(Data object) {
			return createDataAdapter();
		}

		@Override
		public Adapter caseModelRole(ModelRole object) {
			return createModelRoleAdapter();
		}

		@Override
		public Adapter caseDescriptiveModel(DescriptiveModel object) {
			return createDescriptiveModelAdapter();
		}

		@Override
		public Adapter casePredictiveModel(PredictiveModel object) {
			return createPredictiveModelAdapter();
		}

		@Override
		public Adapter casePrescriptiveModel(PrescriptiveModel object) {
			return createPrescriptiveModelAdapter();
		}

		@Override
		public Adapter caseSoftware(Software object) {
			return createSoftwareAdapter();
		}

		@Override
		public Adapter caseSocioTechnicalSystem(SocioTechnicalSystem object) {
			return createSocioTechnicalSystemAdapter();
		}

		@Override
		public Adapter caseMODA(MODA object) {
			return createMODAAdapter();
		}

		@Override
		public Adapter caseModel(Model object) {
			return createModelAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link internship.moda.fig1.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see internship.moda.fig1.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link internship.moda.fig1.ModelRole <em>Model Role</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see internship.moda.fig1.ModelRole
	 * @generated
	 */
	public Adapter createModelRoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link internship.moda.fig1.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see internship.moda.fig1.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link internship.moda.fig1.DescriptiveModel <em>Descriptive Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see internship.moda.fig1.DescriptiveModel
	 * @generated
	 */
	public Adapter createDescriptiveModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link internship.moda.fig1.PredictiveModel <em>Predictive Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see internship.moda.fig1.PredictiveModel
	 * @generated
	 */
	public Adapter createPredictiveModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link internship.moda.fig1.PrescriptiveModel <em>Prescriptive Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see internship.moda.fig1.PrescriptiveModel
	 * @generated
	 */
	public Adapter createPrescriptiveModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link internship.moda.fig1.Software <em>Software</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see internship.moda.fig1.Software
	 * @generated
	 */
	public Adapter createSoftwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link internship.moda.fig1.SocioTechnicalSystem <em>Socio Technical System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see internship.moda.fig1.SocioTechnicalSystem
	 * @generated
	 */
	public Adapter createSocioTechnicalSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link internship.moda.fig1.MODA <em>MODA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see internship.moda.fig1.MODA
	 * @generated
	 */
	public Adapter createMODAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Fig1AdapterFactory
