/**
 */
package internship.moda.fig1.provider;

import internship.moda.fig1.Fig1Package;

import internship.moda.fig1.Model;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link internship.moda.fig1.Model} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProvider extends ModaNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIncomingPreparationPropertyDescriptor(object);
			addIncomingGeneralizationPropertyDescriptor(object);
			addIncomingAnalysisPropertyDescriptor(object);
			addOutgoingDeploymentPropertyDescriptor(object);
			addOutgoingGenerationPropertyDescriptor(object);
			addIncomingGenerationPropertyDescriptor(object);
			addOutgoingEnactmentPropertyDescriptor(object);
			addPrescriptiveModelPropertyDescriptor(object);
			addPredictiveModelPropertyDescriptor(object);
			addDescriptiveModelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Incoming Preparation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingPreparationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Model_incomingPreparation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Model_incomingPreparation_feature",
								"_UI_Model_type"),
						Fig1Package.Literals.MODEL__INCOMING_PREPARATION, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Incoming Generalization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingGeneralizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Model_incomingGeneralization_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Model_incomingGeneralization_feature",
								"_UI_Model_type"),
						Fig1Package.Literals.MODEL__INCOMING_GENERALIZATION, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Incoming Analysis feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingAnalysisPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Model_incomingAnalysis_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Model_incomingAnalysis_feature",
								"_UI_Model_type"),
						Fig1Package.Literals.MODEL__INCOMING_ANALYSIS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Outgoing Deployment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingDeploymentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Model_outgoingDeployment_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Model_outgoingDeployment_feature",
								"_UI_Model_type"),
						Fig1Package.Literals.MODEL__OUTGOING_DEPLOYMENT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Outgoing Generation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingGenerationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Model_outgoingGeneration_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Model_outgoingGeneration_feature",
								"_UI_Model_type"),
						Fig1Package.Literals.MODEL__OUTGOING_GENERATION, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Incoming Generation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingGenerationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Model_incomingGeneration_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Model_incomingGeneration_feature",
								"_UI_Model_type"),
						Fig1Package.Literals.MODEL__INCOMING_GENERATION, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Outgoing Enactment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingEnactmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Model_outgoingEnactment_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Model_outgoingEnactment_feature",
								"_UI_Model_type"),
						Fig1Package.Literals.MODEL__OUTGOING_ENACTMENT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Prescriptive Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPrescriptiveModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Model_prescriptiveModel_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Model_prescriptiveModel_feature",
								"_UI_Model_type"),
						Fig1Package.Literals.MODEL__PRESCRIPTIVE_MODEL, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Predictive Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPredictiveModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Model_predictiveModel_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Model_predictiveModel_feature",
								"_UI_Model_type"),
						Fig1Package.Literals.MODEL__PREDICTIVE_MODEL, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Descriptive Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptiveModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Model_descriptiveModel_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Model_descriptiveModel_feature",
								"_UI_Model_type"),
						Fig1Package.Literals.MODEL__DESCRIPTIVE_MODEL, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns Model.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Model"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Model) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Model_type")
				: getString("_UI_Model_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Model.class)) {
		case Fig1Package.MODEL__PRESCRIPTIVE_MODEL:
		case Fig1Package.MODEL__PREDICTIVE_MODEL:
		case Fig1Package.MODEL__DESCRIPTIVE_MODEL:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
