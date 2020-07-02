/**
 */
package internship.moda.fig1.provider;

import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.PrescriptiveModel;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link internship.moda.fig1.PrescriptiveModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PrescriptiveModelItemProvider extends ModelRoleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriptiveModelItemProvider(AdapterFactory adapterFactory) {
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

			addOutgoingEnactmentPropertyDescriptor(object);
			addOutgoingDeploymentPropertyDescriptor(object);
			addIncomingAnalysisPropertyDescriptor(object);
			addOutgoingGenerationPropertyDescriptor(object);
			addIncomingGenerationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Outgoing Enactment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingEnactmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PrescriptiveModel_outgoingEnactment_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PrescriptiveModel_outgoingEnactment_feature",
						"_UI_PrescriptiveModel_type"),
				Fig1Package.Literals.PRESCRIPTIVE_MODEL__OUTGOING_ENACTMENT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Outgoing Deployment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingDeploymentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PrescriptiveModel_outgoingDeployment_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PrescriptiveModel_outgoingDeployment_feature",
						"_UI_PrescriptiveModel_type"),
				Fig1Package.Literals.PRESCRIPTIVE_MODEL__OUTGOING_DEPLOYMENT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Incoming Analysis feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingAnalysisPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PrescriptiveModel_incomingAnalysis_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PrescriptiveModel_incomingAnalysis_feature",
						"_UI_PrescriptiveModel_type"),
				Fig1Package.Literals.PRESCRIPTIVE_MODEL__INCOMING_ANALYSIS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Outgoing Generation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutgoingGenerationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PrescriptiveModel_outgoingGeneration_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PrescriptiveModel_outgoingGeneration_feature",
						"_UI_PrescriptiveModel_type"),
				Fig1Package.Literals.PRESCRIPTIVE_MODEL__OUTGOING_GENERATION, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Incoming Generation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIncomingGenerationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PrescriptiveModel_incomingGeneration_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PrescriptiveModel_incomingGeneration_feature",
						"_UI_PrescriptiveModel_type"),
				Fig1Package.Literals.PRESCRIPTIVE_MODEL__INCOMING_GENERATION, true, false, true, null, null, null));
	}

	/**
	 * This returns PrescriptiveModel.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PrescriptiveModel"));
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
		String label = ((PrescriptiveModel) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_PrescriptiveModel_type")
				: getString("_UI_PrescriptiveModel_type") + " " + label;
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
