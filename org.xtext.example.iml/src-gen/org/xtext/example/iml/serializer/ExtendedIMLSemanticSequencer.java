/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.iml.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.iml.extendedIML.BlurOperation;
import org.xtext.example.iml.extendedIML.DirImporter;
import org.xtext.example.iml.extendedIML.EqualizeOperation;
import org.xtext.example.iml.extendedIML.ExtendedIMLPackage;
import org.xtext.example.iml.extendedIML.FillOperation;
import org.xtext.example.iml.extendedIML.FilterOperation;
import org.xtext.example.iml.extendedIML.ImageImporter;
import org.xtext.example.iml.extendedIML.Model;
import org.xtext.example.iml.extendedIML.RotateOperation;
import org.xtext.example.iml.extendedIML.SaveOperation;
import org.xtext.example.iml.extendedIML.ShowOperation;
import org.xtext.example.iml.services.ExtendedIMLGrammarAccess;

@SuppressWarnings("all")
public class ExtendedIMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ExtendedIMLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ExtendedIMLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ExtendedIMLPackage.BLUR_OPERATION:
				sequence_BlurOperation(context, (BlurOperation) semanticObject); 
				return; 
			case ExtendedIMLPackage.DIR_IMPORTER:
				sequence_DirImporter(context, (DirImporter) semanticObject); 
				return; 
			case ExtendedIMLPackage.EQUALIZE_OPERATION:
				sequence_EqualizeOperation(context, (EqualizeOperation) semanticObject); 
				return; 
			case ExtendedIMLPackage.FILL_OPERATION:
				sequence_FillOperation(context, (FillOperation) semanticObject); 
				return; 
			case ExtendedIMLPackage.FILTER_OPERATION:
				sequence_FilterOperation(context, (FilterOperation) semanticObject); 
				return; 
			case ExtendedIMLPackage.IMAGE_IMPORTER:
				sequence_ImageImporter(context, (ImageImporter) semanticObject); 
				return; 
			case ExtendedIMLPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case ExtendedIMLPackage.ROTATE_OPERATION:
				sequence_RotateOperation(context, (RotateOperation) semanticObject); 
				return; 
			case ExtendedIMLPackage.SAVE_OPERATION:
				sequence_SaveOperation(context, (SaveOperation) semanticObject); 
				return; 
			case ExtendedIMLPackage.SHOW_OPERATION:
				sequence_ShowOperation(context, (ShowOperation) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractElement returns BlurOperation
	 *     Operator returns BlurOperation
	 *     BlurOperation returns BlurOperation
	 *
	 * Constraint:
	 *     (var=ID intensity=INT)
	 */
	protected void sequence_BlurOperation(ISerializationContext context, BlurOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExtendedIMLPackage.Literals.OPERATOR__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedIMLPackage.Literals.OPERATOR__VAR));
			if (transientValues.isValueTransient(semanticObject, ExtendedIMLPackage.Literals.BLUR_OPERATION__INTENSITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedIMLPackage.Literals.BLUR_OPERATION__INTENSITY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBlurOperationAccess().getVarIDTerminalRuleCall_1_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getBlurOperationAccess().getIntensityINTTerminalRuleCall_2_0(), semanticObject.getIntensity());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns DirImporter
	 *     Importer returns DirImporter
	 *     DirImporter returns DirImporter
	 *
	 * Constraint:
	 *     pathDir=QualifiedPath
	 */
	protected void sequence_DirImporter(ISerializationContext context, DirImporter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExtendedIMLPackage.Literals.DIR_IMPORTER__PATH_DIR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedIMLPackage.Literals.DIR_IMPORTER__PATH_DIR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDirImporterAccess().getPathDirQualifiedPathParserRuleCall_1_0(), semanticObject.getPathDir());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns EqualizeOperation
	 *     Operator returns EqualizeOperation
	 *     EqualizeOperation returns EqualizeOperation
	 *
	 * Constraint:
	 *     var=ID
	 */
	protected void sequence_EqualizeOperation(ISerializationContext context, EqualizeOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExtendedIMLPackage.Literals.OPERATOR__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedIMLPackage.Literals.OPERATOR__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEqualizeOperationAccess().getVarIDTerminalRuleCall_1_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns FillOperation
	 *     Operator returns FillOperation
	 *     FillOperation returns FillOperation
	 *
	 * Constraint:
	 *     (var=ID tam=INT)
	 */
	protected void sequence_FillOperation(ISerializationContext context, FillOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExtendedIMLPackage.Literals.OPERATOR__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedIMLPackage.Literals.OPERATOR__VAR));
			if (transientValues.isValueTransient(semanticObject, ExtendedIMLPackage.Literals.FILL_OPERATION__TAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedIMLPackage.Literals.FILL_OPERATION__TAM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFillOperationAccess().getVarIDTerminalRuleCall_1_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getFillOperationAccess().getTamINTTerminalRuleCall_2_0(), semanticObject.getTam());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns FilterOperation
	 *     Operator returns FilterOperation
	 *     FilterOperation returns FilterOperation
	 *
	 * Constraint:
	 *     var=ID
	 */
	protected void sequence_FilterOperation(ISerializationContext context, FilterOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExtendedIMLPackage.Literals.OPERATOR__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedIMLPackage.Literals.OPERATOR__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFilterOperationAccess().getVarIDTerminalRuleCall_1_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns ImageImporter
	 *     Importer returns ImageImporter
	 *     ImageImporter returns ImageImporter
	 *
	 * Constraint:
	 *     (name=ID importedNamespace=QualifiedImageName)
	 */
	protected void sequence_ImageImporter(ISerializationContext context, ImageImporter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExtendedIMLPackage.Literals.IMAGE_IMPORTER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedIMLPackage.Literals.IMAGE_IMPORTER__NAME));
			if (transientValues.isValueTransient(semanticObject, ExtendedIMLPackage.Literals.IMAGE_IMPORTER__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedIMLPackage.Literals.IMAGE_IMPORTER__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImageImporterAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getImageImporterAccess().getImportedNamespaceQualifiedImageNameParserRuleCall_2_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     elements+=AbstractElement+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns RotateOperation
	 *     Operator returns RotateOperation
	 *     RotateOperation returns RotateOperation
	 *
	 * Constraint:
	 *     (var=ID degree=INT)
	 */
	protected void sequence_RotateOperation(ISerializationContext context, RotateOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExtendedIMLPackage.Literals.OPERATOR__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedIMLPackage.Literals.OPERATOR__VAR));
			if (transientValues.isValueTransient(semanticObject, ExtendedIMLPackage.Literals.ROTATE_OPERATION__DEGREE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedIMLPackage.Literals.ROTATE_OPERATION__DEGREE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRotateOperationAccess().getVarIDTerminalRuleCall_1_0(), semanticObject.getVar());
		feeder.accept(grammarAccess.getRotateOperationAccess().getDegreeINTTerminalRuleCall_2_0(), semanticObject.getDegree());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns SaveOperation
	 *     Operator returns SaveOperation
	 *     SaveOperation returns SaveOperation
	 *
	 * Constraint:
	 *     var=ID
	 */
	protected void sequence_SaveOperation(ISerializationContext context, SaveOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExtendedIMLPackage.Literals.OPERATOR__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedIMLPackage.Literals.OPERATOR__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSaveOperationAccess().getVarIDTerminalRuleCall_1_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AbstractElement returns ShowOperation
	 *     Operator returns ShowOperation
	 *     ShowOperation returns ShowOperation
	 *
	 * Constraint:
	 *     var=ID
	 */
	protected void sequence_ShowOperation(ISerializationContext context, ShowOperation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ExtendedIMLPackage.Literals.OPERATOR__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExtendedIMLPackage.Literals.OPERATOR__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getShowOperationAccess().getVarIDTerminalRuleCall_1_0(), semanticObject.getVar());
		feeder.finish();
	}
	
	
}
