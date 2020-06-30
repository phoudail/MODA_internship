/**
 */
package internship.moda.fig1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see internship.moda.fig1.Fig1Package#getDataKind()
 * @model
 * @generated
 */
public enum DataKind implements Enumerator {
	/**
	 * The '<em><b>Input Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	INPUT_DATA(0, "InputData", "InputData"),

	/**
	 * The '<em><b>Output Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPUT_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	OUTPUT_DATA(1, "OutputData", "OutputData"),

	/**
	 * The '<em><b>External Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	EXTERNAL_DATA(2, "ExternalData", "ExternalData"),

	/**
	 * The '<em><b>Measured Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASURED_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	MEASURED_DATA(3, "MeasuredData", "MeasuredData");

	/**
	 * The '<em><b>Input Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Input Data</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INPUT_DATA
	 * @model name="InputData"
	 * @generated
	 * @ordered
	 */
	public static final int INPUT_DATA_VALUE = 0;

	/**
	 * The '<em><b>Output Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Output Data</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUTPUT_DATA
	 * @model name="OutputData"
	 * @generated
	 * @ordered
	 */
	public static final int OUTPUT_DATA_VALUE = 1;

	/**
	 * The '<em><b>External Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>External Data</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_DATA
	 * @model name="ExternalData"
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL_DATA_VALUE = 2;

	/**
	 * The '<em><b>Measured Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Measured Data</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEASURED_DATA
	 * @model name="MeasuredData"
	 * @generated
	 * @ordered
	 */
	public static final int MEASURED_DATA_VALUE = 3;

	/**
	 * An array of all the '<em><b>Data Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataKind[] VALUES_ARRAY = new DataKind[] { INPUT_DATA, OUTPUT_DATA, EXTERNAL_DATA,
			MEASURED_DATA, };

	/**
	 * A public read-only list of all the '<em><b>Data Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataKind get(int value) {
		switch (value) {
		case INPUT_DATA_VALUE:
			return INPUT_DATA;
		case OUTPUT_DATA_VALUE:
			return OUTPUT_DATA;
		case EXTERNAL_DATA_VALUE:
			return EXTERNAL_DATA;
		case MEASURED_DATA_VALUE:
			return MEASURED_DATA;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DataKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //DataKind
