/**
 */
package Relis;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Relis.RelisFactory
 * @model kind="package"
 * @generated
 */
public interface RelisPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Relis";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "geodes.sms.relis";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RelisPackage eINSTANCE = Relis.impl.RelisPackageImpl.init();

	/**
	 * The meta object id for the '{@link Relis.impl.RelisRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Relis.impl.RelisRootImpl
	 * @see Relis.impl.RelisPackageImpl#getRelisRoot()
	 * @generated
	 */
	int RELIS_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIS_ROOT__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIS_ROOT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIS_ROOT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link Relis.impl.StatisticImpl <em>Statistic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Relis.impl.StatisticImpl
	 * @see Relis.impl.RelisPackageImpl#getStatistic()
	 * @generated
	 */
	int STATISTIC = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC__NAME = 0;

	/**
	 * The number of structural features of the '<em>Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Relis.impl.DescriptiveImpl <em>Descriptive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Relis.impl.DescriptiveImpl
	 * @see Relis.impl.RelisPackageImpl#getDescriptive()
	 * @generated
	 */
	int DESCRIPTIVE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE__NAME = STATISTIC__NAME;

	/**
	 * The feature id for the '<em><b>Stats</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE__STATS = STATISTIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Descriptive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTIVE_FEATURE_COUNT = STATISTIC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Relis.impl.ComparativeImpl <em>Comparative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Relis.impl.ComparativeImpl
	 * @see Relis.impl.RelisPackageImpl#getComparative()
	 * @generated
	 */
	int COMPARATIVE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE__NAME = STATISTIC__NAME;

	/**
	 * The feature id for the '<em><b>Stats</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE__STATS = STATISTIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comparative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARATIVE_FEATURE_COUNT = STATISTIC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Relis.impl.EvolutionImpl <em>Evolution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Relis.impl.EvolutionImpl
	 * @see Relis.impl.RelisPackageImpl#getEvolution()
	 * @generated
	 */
	int EVOLUTION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION__NAME = STATISTIC__NAME;

	/**
	 * The feature id for the '<em><b>Stats</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION__STATS = STATISTIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Evolution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION_FEATURE_COUNT = STATISTIC_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link Relis.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Relis.impl.VariableImpl
	 * @see Relis.impl.RelisPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Statistic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__STATISTIC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link Relis.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Relis.Type
	 * @see Relis.impl.RelisPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 6;


	/**
	 * The meta object id for the '{@link Relis.CompStats <em>Comp Stats</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Relis.CompStats
	 * @see Relis.impl.RelisPackageImpl#getCompStats()
	 * @generated
	 */
	int COMP_STATS = 7;

	/**
	 * The meta object id for the '{@link Relis.EvoStats <em>Evo Stats</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Relis.EvoStats
	 * @see Relis.impl.RelisPackageImpl#getEvoStats()
	 * @generated
	 */
	int EVO_STATS = 8;

	/**
	 * The meta object id for the '{@link Relis.DescStats <em>Desc Stats</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Relis.DescStats
	 * @see Relis.impl.RelisPackageImpl#getDescStats()
	 * @generated
	 */
	int DESC_STATS = 9;


	/**
	 * Returns the meta object for class '{@link Relis.RelisRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see Relis.RelisRoot
	 * @generated
	 */
	EClass getRelisRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link Relis.RelisRoot#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see Relis.RelisRoot#getVariable()
	 * @see #getRelisRoot()
	 * @generated
	 */
	EReference getRelisRoot_Variable();

	/**
	 * Returns the meta object for the attribute '{@link Relis.RelisRoot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Relis.RelisRoot#getName()
	 * @see #getRelisRoot()
	 * @generated
	 */
	EAttribute getRelisRoot_Name();

	/**
	 * Returns the meta object for class '{@link Relis.Statistic <em>Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistic</em>'.
	 * @see Relis.Statistic
	 * @generated
	 */
	EClass getStatistic();

	/**
	 * Returns the meta object for the attribute '{@link Relis.Statistic#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Relis.Statistic#getName()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_Name();

	/**
	 * Returns the meta object for class '{@link Relis.Descriptive <em>Descriptive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptive</em>'.
	 * @see Relis.Descriptive
	 * @generated
	 */
	EClass getDescriptive();

	/**
	 * Returns the meta object for the attribute list '{@link Relis.Descriptive#getStats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Stats</em>'.
	 * @see Relis.Descriptive#getStats()
	 * @see #getDescriptive()
	 * @generated
	 */
	EAttribute getDescriptive_Stats();

	/**
	 * Returns the meta object for class '{@link Relis.Comparative <em>Comparative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparative</em>'.
	 * @see Relis.Comparative
	 * @generated
	 */
	EClass getComparative();

	/**
	 * Returns the meta object for the attribute list '{@link Relis.Comparative#getStats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Stats</em>'.
	 * @see Relis.Comparative#getStats()
	 * @see #getComparative()
	 * @generated
	 */
	EAttribute getComparative_Stats();

	/**
	 * Returns the meta object for class '{@link Relis.Evolution <em>Evolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evolution</em>'.
	 * @see Relis.Evolution
	 * @generated
	 */
	EClass getEvolution();

	/**
	 * Returns the meta object for the attribute list '{@link Relis.Evolution#getStats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Stats</em>'.
	 * @see Relis.Evolution#getStats()
	 * @see #getEvolution()
	 * @generated
	 */
	EAttribute getEvolution_Stats();

	/**
	 * Returns the meta object for class '{@link Relis.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see Relis.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link Relis.Variable#getStatistic <em>Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statistic</em>'.
	 * @see Relis.Variable#getStatistic()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Statistic();

	/**
	 * Returns the meta object for the attribute '{@link Relis.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Relis.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link Relis.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Relis.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for enum '{@link Relis.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see Relis.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the meta object for enum '{@link Relis.CompStats <em>Comp Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comp Stats</em>'.
	 * @see Relis.CompStats
	 * @generated
	 */
	EEnum getCompStats();

	/**
	 * Returns the meta object for enum '{@link Relis.EvoStats <em>Evo Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Evo Stats</em>'.
	 * @see Relis.EvoStats
	 * @generated
	 */
	EEnum getEvoStats();

	/**
	 * Returns the meta object for enum '{@link Relis.DescStats <em>Desc Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Desc Stats</em>'.
	 * @see Relis.DescStats
	 * @generated
	 */
	EEnum getDescStats();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RelisFactory getRelisFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Relis.impl.RelisRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Relis.impl.RelisRootImpl
		 * @see Relis.impl.RelisPackageImpl#getRelisRoot()
		 * @generated
		 */
		EClass RELIS_ROOT = eINSTANCE.getRelisRoot();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELIS_ROOT__VARIABLE = eINSTANCE.getRelisRoot_Variable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELIS_ROOT__NAME = eINSTANCE.getRelisRoot_Name();

		/**
		 * The meta object literal for the '{@link Relis.impl.StatisticImpl <em>Statistic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Relis.impl.StatisticImpl
		 * @see Relis.impl.RelisPackageImpl#getStatistic()
		 * @generated
		 */
		EClass STATISTIC = eINSTANCE.getStatistic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIC__NAME = eINSTANCE.getStatistic_Name();

		/**
		 * The meta object literal for the '{@link Relis.impl.DescriptiveImpl <em>Descriptive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Relis.impl.DescriptiveImpl
		 * @see Relis.impl.RelisPackageImpl#getDescriptive()
		 * @generated
		 */
		EClass DESCRIPTIVE = eINSTANCE.getDescriptive();

		/**
		 * The meta object literal for the '<em><b>Stats</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTIVE__STATS = eINSTANCE.getDescriptive_Stats();

		/**
		 * The meta object literal for the '{@link Relis.impl.ComparativeImpl <em>Comparative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Relis.impl.ComparativeImpl
		 * @see Relis.impl.RelisPackageImpl#getComparative()
		 * @generated
		 */
		EClass COMPARATIVE = eINSTANCE.getComparative();

		/**
		 * The meta object literal for the '<em><b>Stats</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARATIVE__STATS = eINSTANCE.getComparative_Stats();

		/**
		 * The meta object literal for the '{@link Relis.impl.EvolutionImpl <em>Evolution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Relis.impl.EvolutionImpl
		 * @see Relis.impl.RelisPackageImpl#getEvolution()
		 * @generated
		 */
		EClass EVOLUTION = eINSTANCE.getEvolution();

		/**
		 * The meta object literal for the '<em><b>Stats</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLUTION__STATS = eINSTANCE.getEvolution_Stats();

		/**
		 * The meta object literal for the '{@link Relis.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Relis.impl.VariableImpl
		 * @see Relis.impl.RelisPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Statistic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__STATISTIC = eINSTANCE.getVariable_Statistic();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link Relis.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Relis.Type
		 * @see Relis.impl.RelisPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link Relis.CompStats <em>Comp Stats</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Relis.CompStats
		 * @see Relis.impl.RelisPackageImpl#getCompStats()
		 * @generated
		 */
		EEnum COMP_STATS = eINSTANCE.getCompStats();

		/**
		 * The meta object literal for the '{@link Relis.EvoStats <em>Evo Stats</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Relis.EvoStats
		 * @see Relis.impl.RelisPackageImpl#getEvoStats()
		 * @generated
		 */
		EEnum EVO_STATS = eINSTANCE.getEvoStats();

		/**
		 * The meta object literal for the '{@link Relis.DescStats <em>Desc Stats</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Relis.DescStats
		 * @see Relis.impl.RelisPackageImpl#getDescStats()
		 * @generated
		 */
		EEnum DESC_STATS = eINSTANCE.getDescStats();

	}

} //RelisPackage
