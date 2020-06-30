/**
 */
package internship.moda.fig1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link internship.moda.fig1.Generation#getPrescriptivemodel <em>Prescriptivemodel</em>}</li>
 * </ul>
 *
 * @see internship.moda.fig1.Fig1Package#getGeneration()
 * @model
 * @generated
 */
public interface Generation extends ModaRelation {
	/**
	 * Returns the value of the '<em><b>Prescriptivemodel</b></em>' reference list.
	 * The list contents are of type {@link internship.moda.fig1.PrescriptiveModel}.
	 * It is bidirectional and its opposite is '{@link internship.moda.fig1.PrescriptiveModel#getGeneration <em>Generation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriptivemodel</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriptivemodel</em>' reference list.
	 * @see internship.moda.fig1.Fig1Package#getGeneration_Prescriptivemodel()
	 * @see internship.moda.fig1.PrescriptiveModel#getGeneration
	 * @model opposite="generation" upper="2"
	 * @generated
	 */
	EList<PrescriptiveModel> getPrescriptivemodel();

} // Generation
