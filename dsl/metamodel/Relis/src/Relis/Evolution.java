/**
 */
package Relis;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Relis.Evolution#getStats <em>Stats</em>}</li>
 * </ul>
 *
 * @see Relis.RelisPackage#getEvolution()
 * @model
 * @generated
 */
public interface Evolution extends Statistic {

	/**
	 * Returns the value of the '<em><b>Stats</b></em>' attribute list.
	 * The list contents are of type {@link Relis.EvoStats}.
	 * The literals are from the enumeration {@link Relis.EvoStats}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stats</em>' attribute list.
	 * @see Relis.EvoStats
	 * @see Relis.RelisPackage#getEvolution_Stats()
	 * @model
	 * @generated
	 */
	EList<EvoStats> getStats();
} // Evolution
