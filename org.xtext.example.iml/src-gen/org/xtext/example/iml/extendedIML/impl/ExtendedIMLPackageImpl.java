/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.iml.extendedIML.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.iml.extendedIML.AbstractElement;
import org.xtext.example.iml.extendedIML.BlurOperation;
import org.xtext.example.iml.extendedIML.DirImporter;
import org.xtext.example.iml.extendedIML.EqualizeOperation;
import org.xtext.example.iml.extendedIML.ExtendedIMLFactory;
import org.xtext.example.iml.extendedIML.ExtendedIMLPackage;
import org.xtext.example.iml.extendedIML.FillOperation;
import org.xtext.example.iml.extendedIML.FilterOperation;
import org.xtext.example.iml.extendedIML.ImageImporter;
import org.xtext.example.iml.extendedIML.Importer;
import org.xtext.example.iml.extendedIML.Model;
import org.xtext.example.iml.extendedIML.Operator;
import org.xtext.example.iml.extendedIML.RotateOperation;
import org.xtext.example.iml.extendedIML.SaveOperation;
import org.xtext.example.iml.extendedIML.ShowOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtendedIMLPackageImpl extends EPackageImpl implements ExtendedIMLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageImporterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dirImporterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rotateOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blurOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalizeOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass showOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass saveOperationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fillOperationEClass = null;

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
   * @see org.xtext.example.iml.extendedIML.ExtendedIMLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private ExtendedIMLPackageImpl()
  {
    super(eNS_URI, ExtendedIMLFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link ExtendedIMLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static ExtendedIMLPackage init()
  {
    if (isInited) return (ExtendedIMLPackage)EPackage.Registry.INSTANCE.getEPackage(ExtendedIMLPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredExtendedIMLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    ExtendedIMLPackageImpl theExtendedIMLPackage = registeredExtendedIMLPackage instanceof ExtendedIMLPackageImpl ? (ExtendedIMLPackageImpl)registeredExtendedIMLPackage : new ExtendedIMLPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theExtendedIMLPackage.createPackageContents();

    // Initialize created meta-data
    theExtendedIMLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theExtendedIMLPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(ExtendedIMLPackage.eNS_URI, theExtendedIMLPackage);
    return theExtendedIMLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Elements()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAbstractElement()
  {
    return abstractElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getImporter()
  {
    return importerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getImageImporter()
  {
    return imageImporterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getImageImporter_Name()
  {
    return (EAttribute)imageImporterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getImageImporter_ImportedNamespace()
  {
    return (EAttribute)imageImporterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDirImporter()
  {
    return dirImporterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDirImporter_PathDir()
  {
    return (EAttribute)dirImporterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOperator()
  {
    return operatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getOperator_Var()
  {
    return (EAttribute)operatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRotateOperation()
  {
    return rotateOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getRotateOperation_Degree()
  {
    return (EAttribute)rotateOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFilterOperation()
  {
    return filterOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBlurOperation()
  {
    return blurOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getBlurOperation_Intensity()
  {
    return (EAttribute)blurOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEqualizeOperation()
  {
    return equalizeOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getShowOperation()
  {
    return showOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSaveOperation()
  {
    return saveOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFillOperation()
  {
    return fillOperationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFillOperation_Size()
  {
    return (EAttribute)fillOperationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExtendedIMLFactory getExtendedIMLFactory()
  {
    return (ExtendedIMLFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ELEMENTS);

    abstractElementEClass = createEClass(ABSTRACT_ELEMENT);

    importerEClass = createEClass(IMPORTER);

    imageImporterEClass = createEClass(IMAGE_IMPORTER);
    createEAttribute(imageImporterEClass, IMAGE_IMPORTER__NAME);
    createEAttribute(imageImporterEClass, IMAGE_IMPORTER__IMPORTED_NAMESPACE);

    dirImporterEClass = createEClass(DIR_IMPORTER);
    createEAttribute(dirImporterEClass, DIR_IMPORTER__PATH_DIR);

    operatorEClass = createEClass(OPERATOR);
    createEAttribute(operatorEClass, OPERATOR__VAR);

    rotateOperationEClass = createEClass(ROTATE_OPERATION);
    createEAttribute(rotateOperationEClass, ROTATE_OPERATION__DEGREE);

    filterOperationEClass = createEClass(FILTER_OPERATION);

    blurOperationEClass = createEClass(BLUR_OPERATION);
    createEAttribute(blurOperationEClass, BLUR_OPERATION__INTENSITY);

    equalizeOperationEClass = createEClass(EQUALIZE_OPERATION);

    showOperationEClass = createEClass(SHOW_OPERATION);

    saveOperationEClass = createEClass(SAVE_OPERATION);

    fillOperationEClass = createEClass(FILL_OPERATION);
    createEAttribute(fillOperationEClass, FILL_OPERATION__SIZE);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    importerEClass.getESuperTypes().add(this.getAbstractElement());
    imageImporterEClass.getESuperTypes().add(this.getImporter());
    dirImporterEClass.getESuperTypes().add(this.getImporter());
    operatorEClass.getESuperTypes().add(this.getAbstractElement());
    rotateOperationEClass.getESuperTypes().add(this.getOperator());
    filterOperationEClass.getESuperTypes().add(this.getOperator());
    blurOperationEClass.getESuperTypes().add(this.getOperator());
    equalizeOperationEClass.getESuperTypes().add(this.getOperator());
    showOperationEClass.getESuperTypes().add(this.getOperator());
    saveOperationEClass.getESuperTypes().add(this.getOperator());
    fillOperationEClass.getESuperTypes().add(this.getOperator());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(importerEClass, Importer.class, "Importer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(imageImporterEClass, ImageImporter.class, "ImageImporter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImageImporter_Name(), ecorePackage.getEString(), "name", null, 0, 1, ImageImporter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImageImporter_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, ImageImporter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dirImporterEClass, DirImporter.class, "DirImporter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDirImporter_PathDir(), ecorePackage.getEString(), "pathDir", null, 0, 1, DirImporter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operatorEClass, Operator.class, "Operator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOperator_Var(), ecorePackage.getEString(), "var", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rotateOperationEClass, RotateOperation.class, "RotateOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRotateOperation_Degree(), ecorePackage.getEInt(), "degree", null, 0, 1, RotateOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterOperationEClass, FilterOperation.class, "FilterOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(blurOperationEClass, BlurOperation.class, "BlurOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBlurOperation_Intensity(), ecorePackage.getEInt(), "intensity", null, 0, 1, BlurOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equalizeOperationEClass, EqualizeOperation.class, "EqualizeOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(showOperationEClass, ShowOperation.class, "ShowOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(saveOperationEClass, SaveOperation.class, "SaveOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fillOperationEClass, FillOperation.class, "FillOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFillOperation_Size(), ecorePackage.getEInt(), "size", null, 0, 1, FillOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //ExtendedIMLPackageImpl
