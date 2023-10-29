/**
 */
package Relis;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Relis.Variable#getStatistic <em>Statistic</em>}</li>
 *   <li>{@link Relis.Variable#getName <em>Name</em>}</li>
 *   <li>{@link Relis.Variable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see Relis.RelisPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Statistic</b></em>' containment reference list.
	 * The list contents are of type {@link Relis.Statistic}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statistic</em>' containment reference list.
	 * @see Relis.RelisPackage#getVariable_Statistic()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statistic> getStatistic();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Relis.RelisPackage#getVariable_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Relis.Variable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Relis.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see Relis.Type
	 * @see #setType(Type)
	 * @see Relis.RelisPackage#getVariable_Type()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link Relis.Variable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see Relis.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Variable
