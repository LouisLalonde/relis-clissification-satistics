/**
 */
package Relis;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptive</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Relis.Descriptive#getStats <em>Stats</em>}</li>
 * </ul>
 *
 * @see Relis.RelisPackage#getDescriptive()
 * @model
 * @generated
 */
public interface Descriptive extends Statistic {

	/**
	 * Returns the value of the '<em><b>Stats</b></em>' attribute list.
	 * The list contents are of type {@link Relis.DescStats}.
	 * The literals are from the enumeration {@link Relis.DescStats}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stats</em>' attribute list.
	 * @see Relis.DescStats
	 * @see Relis.RelisPackage#getDescriptive_Stats()
	 * @model
	 * @generated
	 */
	EList<DescStats> getStats();
} // Descriptive
