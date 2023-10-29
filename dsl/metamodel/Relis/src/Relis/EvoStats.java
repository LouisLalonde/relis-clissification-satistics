/**
 */
package Relis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Evo Stats</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Relis.RelisPackage#getEvoStats()
 * @model
 * @generated
 */
public enum EvoStats implements Enumerator {
	/**
	 * The '<em><b>Frequency tables</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREQUENCY_TABLES_VALUE
	 * @generated
	 * @ordered
	 */
	FREQUENCY_TABLES(0, "Frequency_tables", "Frequency_tables"),

	/**
	 * The '<em><b>Evolution plots</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVOLUTION_PLOTS_VALUE
	 * @generated
	 * @ordered
	 */
	EVOLUTION_PLOTS(1, "Evolution_plots", "Evolution_plots");

	/**
	 * The '<em><b>Frequency tables</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FREQUENCY_TABLES
	 * @model name="Frequency_tables"
	 * @generated
	 * @ordered
	 */
	public static final int FREQUENCY_TABLES_VALUE = 0;

	/**
	 * The '<em><b>Evolution plots</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVOLUTION_PLOTS
	 * @model name="Evolution_plots"
	 * @generated
	 * @ordered
	 */
	public static final int EVOLUTION_PLOTS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Evo Stats</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EvoStats[] VALUES_ARRAY =
		new EvoStats[] {
			FREQUENCY_TABLES,
			EVOLUTION_PLOTS,
		};

	/**
	 * A public read-only list of all the '<em><b>Evo Stats</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EvoStats> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Evo Stats</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvoStats get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvoStats result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evo Stats</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvoStats getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvoStats result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evo Stats</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static EvoStats get(int value) {
		switch (value) {
			case FREQUENCY_TABLES_VALUE: return FREQUENCY_TABLES;
			case EVOLUTION_PLOTS_VALUE: return EVOLUTION_PLOTS;
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
	private EvoStats(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //EvoStats
