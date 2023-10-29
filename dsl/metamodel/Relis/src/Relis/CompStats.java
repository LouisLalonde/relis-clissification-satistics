/**
 */
package Relis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Comp Stats</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Relis.RelisPackage#getCompStats()
 * @model
 * @generated
 */
public enum CompStats implements Enumerator {
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
	 * The '<em><b>Stacked bar plots</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STACKED_BAR_PLOTS_VALUE
	 * @generated
	 * @ordered
	 */
	STACKED_BAR_PLOTS(1, "Stacked_bar_plots", "Stacked_bar_plots"),

	/**
	 * The '<em><b>Grouped bar plots</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUPED_BAR_PLOTS_VALUE
	 * @generated
	 * @ordered
	 */
	GROUPED_BAR_PLOTS(2, "Grouped_bar_plots", "Grouped_bar_plots"),

	/**
	 * The '<em><b>Bubble charts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUBBLE_CHARTS_VALUE
	 * @generated
	 * @ordered
	 */
	BUBBLE_CHARTS(3, "Bubble_charts", "Bubble_charts"),

	/**
	 * The '<em><b>Fisher exact test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FISHER_EXACT_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	FISHER_EXACT_TEST(4, "Fisher_exact_test", "Fisher_exact_test"),

	/**
	 * The '<em><b>Shapiro Wilk correlation test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHAPIRO_WILK_CORRELATION_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	SHAPIRO_WILK_CORRELATION_TEST(5, "Shapiro_Wilk_correlation_test", "Shapiro_Wilk_correlation_test"),

	/**
	 * The '<em><b>Pearson correlation test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PEARSON_CORRELATION_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	PEARSON_CORRELATION_TEST(6, "Pearson_correlation_test", "Pearson_correlation_test"),

	/**
	 * The '<em><b>Spearman correlation test</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEARMAN_CORRELATION_TEST_VALUE
	 * @generated
	 * @ordered
	 */
	SPEARMAN_CORRELATION_TEST(7, "Spearman_correlation_test", "Spearman_correlation_test");

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
	 * The '<em><b>Stacked bar plots</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STACKED_BAR_PLOTS
	 * @model name="Stacked_bar_plots"
	 * @generated
	 * @ordered
	 */
	public static final int STACKED_BAR_PLOTS_VALUE = 1;

	/**
	 * The '<em><b>Grouped bar plots</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROUPED_BAR_PLOTS
	 * @model name="Grouped_bar_plots"
	 * @generated
	 * @ordered
	 */
	public static final int GROUPED_BAR_PLOTS_VALUE = 2;

	/**
	 * The '<em><b>Bubble charts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUBBLE_CHARTS
	 * @model name="Bubble_charts"
	 * @generated
	 * @ordered
	 */
	public static final int BUBBLE_CHARTS_VALUE = 3;

	/**
	 * The '<em><b>Fisher exact test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FISHER_EXACT_TEST
	 * @model name="Fisher_exact_test"
	 * @generated
	 * @ordered
	 */
	public static final int FISHER_EXACT_TEST_VALUE = 4;

	/**
	 * The '<em><b>Shapiro Wilk correlation test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHAPIRO_WILK_CORRELATION_TEST
	 * @model name="Shapiro_Wilk_correlation_test"
	 * @generated
	 * @ordered
	 */
	public static final int SHAPIRO_WILK_CORRELATION_TEST_VALUE = 5;

	/**
	 * The '<em><b>Pearson correlation test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PEARSON_CORRELATION_TEST
	 * @model name="Pearson_correlation_test"
	 * @generated
	 * @ordered
	 */
	public static final int PEARSON_CORRELATION_TEST_VALUE = 6;

	/**
	 * The '<em><b>Spearman correlation test</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPEARMAN_CORRELATION_TEST
	 * @model name="Spearman_correlation_test"
	 * @generated
	 * @ordered
	 */
	public static final int SPEARMAN_CORRELATION_TEST_VALUE = 7;

	/**
	 * An array of all the '<em><b>Comp Stats</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CompStats[] VALUES_ARRAY =
		new CompStats[] {
			FREQUENCY_TABLES,
			STACKED_BAR_PLOTS,
			GROUPED_BAR_PLOTS,
			BUBBLE_CHARTS,
			FISHER_EXACT_TEST,
			SHAPIRO_WILK_CORRELATION_TEST,
			PEARSON_CORRELATION_TEST,
			SPEARMAN_CORRELATION_TEST,
		};

	/**
	 * A public read-only list of all the '<em><b>Comp Stats</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CompStats> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Comp Stats</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompStats get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompStats result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comp Stats</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompStats getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompStats result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comp Stats</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CompStats get(int value) {
		switch (value) {
			case FREQUENCY_TABLES_VALUE: return FREQUENCY_TABLES;
			case STACKED_BAR_PLOTS_VALUE: return STACKED_BAR_PLOTS;
			case GROUPED_BAR_PLOTS_VALUE: return GROUPED_BAR_PLOTS;
			case BUBBLE_CHARTS_VALUE: return BUBBLE_CHARTS;
			case FISHER_EXACT_TEST_VALUE: return FISHER_EXACT_TEST;
			case SHAPIRO_WILK_CORRELATION_TEST_VALUE: return SHAPIRO_WILK_CORRELATION_TEST;
			case PEARSON_CORRELATION_TEST_VALUE: return PEARSON_CORRELATION_TEST;
			case SPEARMAN_CORRELATION_TEST_VALUE: return SPEARMAN_CORRELATION_TEST;
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
	private CompStats(int value, String name, String literal) {
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
	
} //CompStats
