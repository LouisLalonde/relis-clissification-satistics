/**
 */
package Relis.impl;

import Relis.CompStats;
import Relis.Comparative;
import Relis.DescStats;
import Relis.Descriptive;
import Relis.EvoStats;
import Relis.Evolution;
import Relis.RelisFactory;
import Relis.RelisPackage;
import Relis.RelisRoot;
import Relis.Statistic;
import Relis.Type;
import Relis.Variable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RelisPackageImpl extends EPackageImpl implements RelisPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relisRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statisticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compStatsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evoStatsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum descStatsEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Relis.RelisPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RelisPackageImpl() {
		super(eNS_URI, RelisFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RelisPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RelisPackage init() {
		if (isInited) return (RelisPackage)EPackage.Registry.INSTANCE.getEPackage(RelisPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRelisPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RelisPackageImpl theRelisPackage = registeredRelisPackage instanceof RelisPackageImpl ? (RelisPackageImpl)registeredRelisPackage : new RelisPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRelisPackage.createPackageContents();

		// Initialize created meta-data
		theRelisPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRelisPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RelisPackage.eNS_URI, theRelisPackage);
		return theRelisPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelisRoot() {
		return relisRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelisRoot_Variable() {
		return (EReference)relisRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelisRoot_Name() {
		return (EAttribute)relisRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStatistic() {
		return statisticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStatistic_Name() {
		return (EAttribute)statisticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescriptive() {
		return descriptiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescriptive_Stats() {
		return (EAttribute)descriptiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComparative() {
		return comparativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComparative_Stats() {
		return (EAttribute)comparativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvolution() {
		return evolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvolution_Stats() {
		return (EAttribute)evolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariable_Statistic() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Type() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCompStats() {
		return compStatsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getEvoStats() {
		return evoStatsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDescStats() {
		return descStatsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelisFactory getRelisFactory() {
		return (RelisFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		relisRootEClass = createEClass(RELIS_ROOT);
		createEReference(relisRootEClass, RELIS_ROOT__VARIABLE);
		createEAttribute(relisRootEClass, RELIS_ROOT__NAME);

		statisticEClass = createEClass(STATISTIC);
		createEAttribute(statisticEClass, STATISTIC__NAME);

		descriptiveEClass = createEClass(DESCRIPTIVE);
		createEAttribute(descriptiveEClass, DESCRIPTIVE__STATS);

		comparativeEClass = createEClass(COMPARATIVE);
		createEAttribute(comparativeEClass, COMPARATIVE__STATS);

		evolutionEClass = createEClass(EVOLUTION);
		createEAttribute(evolutionEClass, EVOLUTION__STATS);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__STATISTIC);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__TYPE);

		// Create enums
		typeEEnum = createEEnum(TYPE);
		compStatsEEnum = createEEnum(COMP_STATS);
		evoStatsEEnum = createEEnum(EVO_STATS);
		descStatsEEnum = createEEnum(DESC_STATS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		descriptiveEClass.getESuperTypes().add(this.getStatistic());
		comparativeEClass.getESuperTypes().add(this.getStatistic());
		evolutionEClass.getESuperTypes().add(this.getStatistic());

		// Initialize classes and features; add operations and parameters
		initEClass(relisRootEClass, RelisRoot.class, "RelisRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelisRoot_Variable(), this.getVariable(), null, "variable", null, 0, -1, RelisRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelisRoot_Name(), ecorePackage.getEString(), "name", null, 0, 1, RelisRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statisticEClass, Statistic.class, "Statistic", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatistic_Name(), ecorePackage.getEString(), "name", null, 0, 1, Statistic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptiveEClass, Descriptive.class, "Descriptive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptive_Stats(), this.getDescStats(), "stats", null, 0, -1, Descriptive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparativeEClass, Comparative.class, "Comparative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComparative_Stats(), this.getCompStats(), "stats", null, 0, -1, Comparative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evolutionEClass, Evolution.class, "Evolution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvolution_Stats(), this.getEvoStats(), "stats", null, 0, -1, Evolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Statistic(), this.getStatistic(), null, "statistic", null, 0, -1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Type(), this.getType(), "type", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.CONTINUOUS);
		addEEnumLiteral(typeEEnum, Type.NOMINAL);
		addEEnumLiteral(typeEEnum, Type.COMPARATIVE);

		initEEnum(compStatsEEnum, CompStats.class, "CompStats");
		addEEnumLiteral(compStatsEEnum, CompStats.FREQUENCY_TABLES);
		addEEnumLiteral(compStatsEEnum, CompStats.STACKED_BAR_PLOTS);
		addEEnumLiteral(compStatsEEnum, CompStats.GROUPED_BAR_PLOTS);
		addEEnumLiteral(compStatsEEnum, CompStats.BUBBLE_CHARTS);
		addEEnumLiteral(compStatsEEnum, CompStats.FISHER_EXACT_TEST);
		addEEnumLiteral(compStatsEEnum, CompStats.SHAPIRO_WILK_CORRELATION_TEST);
		addEEnumLiteral(compStatsEEnum, CompStats.PEARSON_CORRELATION_TEST);
		addEEnumLiteral(compStatsEEnum, CompStats.SPEARMAN_CORRELATION_TEST);

		initEEnum(evoStatsEEnum, EvoStats.class, "EvoStats");
		addEEnumLiteral(evoStatsEEnum, EvoStats.FREQUENCY_TABLES);
		addEEnumLiteral(evoStatsEEnum, EvoStats.EVOLUTION_PLOTS);

		initEEnum(descStatsEEnum, DescStats.class, "DescStats");
		addEEnumLiteral(descStatsEEnum, DescStats.FREQUENCY_TABLES);
		addEEnumLiteral(descStatsEEnum, DescStats.BAR_PLOTS);
		addEEnumLiteral(descStatsEEnum, DescStats.STATISTICS);
		addEEnumLiteral(descStatsEEnum, DescStats.BOX_PLOTS);
		addEEnumLiteral(descStatsEEnum, DescStats.VIOLIN_PLOTS);

		// Create resource
		createResource(eNS_URI);
	}

} //RelisPackageImpl
