/**
 */
package Relis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Desc Stats</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Relis.RelisPackage#getDescStats()
 * @model
 * @generated
 */
public enum DescStats implements Enumerator {
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
	 * The '<em><b>Bar plots</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAR_PLOTS_VALUE
	 * @generated
	 * @ordered
	 */
	BAR_PLOTS(1, "Bar_plots", "Bar_plots"),

	/**
	 * The '<em><b>Statistics</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATISTICS_VALUE
	 * @generated
	 * @ordered
	 */
	STATISTICS(2, "Statistics", "Statistics"),

	/**
	 * The '<em><b>Box plots</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOX_PLOTS_VALUE
	 * @generated
	 * @ordered
	 */
	BOX_PLOTS(3, "Box_plots", "Box_plots"),

	/**
	 * The '<em><b>Violin plots</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIOLIN_PLOTS_VALUE
	 * @generated
	 * @ordered
	 */
	VIOLIN_PLOTS(4, "Violin_plots", "Violin_plots");

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
	 * The '<em><b>Bar plots</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAR_PLOTS
	 * @model name="Bar_plots"
	 * @generated
	 * @ordered
	 */
	public static final int BAR_PLOTS_VALUE = 1;

	/**
	 * The '<em><b>Statistics</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATISTICS
	 * @model name="Statistics"
	 * @generated
	 * @ordered
	 */
	public static final int STATISTICS_VALUE = 2;

	/**
	 * The '<em><b>Box plots</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOX_PLOTS
	 * @model name="Box_plots"
	 * @generated
	 * @ordered
	 */
	public static final int BOX_PLOTS_VALUE = 3;

	/**
	 * The '<em><b>Violin plots</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIOLIN_PLOTS
	 * @model name="Violin_plots"
	 * @generated
	 * @ordered
	 */
	public static final int VIOLIN_PLOTS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Desc Stats</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DescStats[] VALUES_ARRAY =
		new DescStats[] {
			FREQUENCY_TABLES,
			BAR_PLOTS,
			STATISTICS,
			BOX_PLOTS,
			VIOLIN_PLOTS,
		};

	/**
	 * A public read-only list of all the '<em><b>Desc Stats</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DescStats> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Desc Stats</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DescStats get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DescStats result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Desc Stats</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DescStats getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DescStats result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Desc Stats</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DescStats get(int value) {
		switch (value) {
			case FREQUENCY_TABLES_VALUE: return FREQUENCY_TABLES;
			case BAR_PLOTS_VALUE: return BAR_PLOTS;
			case STATISTICS_VALUE: return STATISTICS;
			case BOX_PLOTS_VALUE: return BOX_PLOTS;
			case VIOLIN_PLOTS_VALUE: return VIOLIN_PLOTS;
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
	private DescStats(int value, String name, String literal) {
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
	
} //DescStats
