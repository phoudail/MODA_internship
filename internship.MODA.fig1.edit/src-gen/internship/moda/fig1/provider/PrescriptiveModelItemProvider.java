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

			addEnactmentPropertyDescriptor(object);
			addRunningSoftwarePropertyDescriptor(object);
			addAnalysisResultPropertyDescriptor(object);
			addGenerationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Enactment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnactmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PrescriptiveModel_enactment_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PrescriptiveModel_enactment_feature",
								"_UI_PrescriptiveModel_type"),
						Fig1Package.Literals.PRESCRIPTIVE_MODEL__ENACTMENT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Running Software feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunningSoftwarePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PrescriptiveModel_runningSoftware_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PrescriptiveModel_runningSoftware_feature",
						"_UI_PrescriptiveModel_type"),
				Fig1Package.Literals.PRESCRIPTIVE_MODEL__RUNNING_SOFTWARE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Analysis Result feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAnalysisResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PrescriptiveModel_analysisResult_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PrescriptiveModel_analysisResult_feature",
								"_UI_PrescriptiveModel_type"),
						Fig1Package.Literals.PRESCRIPTIVE_MODEL__ANALYSIS_RESULT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Generation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PrescriptiveModel_generation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PrescriptiveModel_generation_feature",
								"_UI_PrescriptiveModel_type"),
						Fig1Package.Literals.PRESCRIPTIVE_MODEL__GENERATION, true, false, true, null, null, null));
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
