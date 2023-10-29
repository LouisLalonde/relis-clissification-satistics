/**
 */
package Relis;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Relis.Comparative#getStats <em>Stats</em>}</li>
 * </ul>
 *
 * @see Relis.RelisPackage#getComparative()
 * @model
 * @generated
 */
public interface Comparative extends Statistic {

	/**
	 * Returns the value of the '<em><b>Stats</b></em>' attribute list.
	 * The list contents are of type {@link Relis.CompStats}.
	 * The literals are from the enumeration {@link Relis.CompStats}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stats</em>' attribute list.
	 * @see Relis.CompStats
	 * @see Relis.RelisPackage#getComparative_Stats()
	 * @model
	 * @generated
	 */
	EList<CompStats> getStats();
} // Comparative
