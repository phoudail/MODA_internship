/**
 */
package internship.moda.fig1.provider;

import internship.moda.fig1.Fig1Factory;
import internship.moda.fig1.Fig1Package;
import internship.moda.fig1.MODA;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link internship.moda.fig1.MODA} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MODAItemProvider extends ModaNodeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MODAItemProvider(AdapterFactory adapterFactory) {
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

			addSociotechnicalsystemPropertyDescriptor(object);
			addDataPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sociotechnicalsystem feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSociotechnicalsystemPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MODA_sociotechnicalsystem_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MODA_sociotechnicalsystem_feature",
								"_UI_MODA_type"),
						Fig1Package.Literals.MODA__SOCIOTECHNICALSYSTEM, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Data feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_MODA_data_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_MODA_data_feature", "_UI_MODA_type"),
						Fig1Package.Literals.MODA__DATA, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Fig1Package.Literals.MODA__SOCIOTECHNICALSYSTEM);
			childrenFeatures.add(Fig1Package.Literals.MODA__DATA);
			childrenFeatures.add(Fig1Package.Literals.MODA__MODEL);
			childrenFeatures.add(Fig1Package.Literals.MODA__MODELROLE);
			childrenFeatures.add(Fig1Package.Literals.MODA__ABSTRACTRELATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns MODA.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MODA"));
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
		String label = ((MODA) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_MODA_type")
				: getString("_UI_MODA_type") + " " + label;
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

		switch (notification.getFeatureID(MODA.class)) {
		case Fig1Package.MODA__SOCIOTECHNICALSYSTEM:
		case Fig1Package.MODA__DATA:
		case Fig1Package.MODA__MODEL:
		case Fig1Package.MODA__MODELROLE:
		case Fig1Package.MODA__ABSTRACTRELATION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(Fig1Package.Literals.MODA__SOCIOTECHNICALSYSTEM,
				Fig1Factory.eINSTANCE.createSocioTechnicalSystem()));

		newChildDescriptors
				.add(createChildParameter(Fig1Package.Literals.MODA__DATA, Fig1Factory.eINSTANCE.createData()));

		newChildDescriptors
				.add(createChildParameter(Fig1Package.Literals.MODA__MODEL, Fig1Factory.eINSTANCE.createModel()));

		newChildDescriptors.add(createChildParameter(Fig1Package.Literals.MODA__MODELROLE,
				Fig1Factory.eINSTANCE.createDescriptiveModel()));

		newChildDescriptors.add(createChildParameter(Fig1Package.Literals.MODA__MODELROLE,
				Fig1Factory.eINSTANCE.createPredictiveModel()));

		newChildDescriptors.add(createChildParameter(Fig1Package.Literals.MODA__MODELROLE,
				Fig1Factory.eINSTANCE.createPrescriptiveModel()));

		newChildDescriptors.add(createChildParameter(Fig1Package.Literals.MODA__ABSTRACTRELATION,
				Fig1Factory.eINSTANCE.createOtherInterplay()));

		newChildDescriptors.add(createChildParameter(Fig1Package.Literals.MODA__ABSTRACTRELATION,
				Fig1Factory.eINSTANCE.createDataPurpose()));

		newChildDescriptors.add(createChildParameter(Fig1Package.Literals.MODA__ABSTRACTRELATION,
				Fig1Factory.eINSTANCE.createEnactment()));

		newChildDescriptors.add(createChildParameter(Fig1Package.Literals.MODA__ABSTRACTRELATION,
				Fig1Factory.eINSTANCE.createDeployment()));

		newChildDescriptors.add(createChildParameter(Fig1Package.Literals.MODA__ABSTRACTRELATION,
				Fig1Factory.eINSTANCE.createPreparation()));

		newChildDescriptors.add(createChildParameter(Fig1Package.Literals.MODA__ABSTRACTRELATION,
				Fig1Factory.eINSTANCE.createAnalysis()));

		newChildDescriptors.add(createChildParameter(Fig1Package.Literals.MODA__ABSTRACTRELATION,
				Fig1Factory.eINSTANCE.createGeneration()));

		newChildDescriptors.add(createChildParameter(Fig1Package.Literals.MODA__ABSTRACTRELATION,
				Fig1Factory.eINSTANCE.createGeneralization()));
	}

}
