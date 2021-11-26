/*
 * generated by Xtext 2.25.0
 */
grammar InternalExtendedIML;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.iml.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.iml.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.iml.services.ExtendedIMLGrammarAccess;

}
@parser::members {
	private ExtendedIMLGrammarAccess grammarAccess;

	public void setGrammarAccess(ExtendedIMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getElementsAssignment()); }
		(rule__Model__ElementsAssignment)*
		{ after(grammarAccess.getModelAccess().getElementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractElement
entryRuleAbstractElement
:
{ before(grammarAccess.getAbstractElementRule()); }
	 ruleAbstractElement
{ after(grammarAccess.getAbstractElementRule()); } 
	 EOF 
;

// Rule AbstractElement
ruleAbstractElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractElementAccess().getAlternatives()); }
		(rule__AbstractElement__Alternatives)
		{ after(grammarAccess.getAbstractElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImporter
entryRuleImporter
:
{ before(grammarAccess.getImporterRule()); }
	 ruleImporter
{ after(grammarAccess.getImporterRule()); } 
	 EOF 
;

// Rule Importer
ruleImporter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImporterAccess().getAlternatives()); }
		(rule__Importer__Alternatives)
		{ after(grammarAccess.getImporterAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImageImporter
entryRuleImageImporter
:
{ before(grammarAccess.getImageImporterRule()); }
	 ruleImageImporter
{ after(grammarAccess.getImageImporterRule()); } 
	 EOF 
;

// Rule ImageImporter
ruleImageImporter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImageImporterAccess().getGroup()); }
		(rule__ImageImporter__Group__0)
		{ after(grammarAccess.getImageImporterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedImageName
entryRuleQualifiedImageName
:
{ before(grammarAccess.getQualifiedImageNameRule()); }
	 ruleQualifiedImageName
{ after(grammarAccess.getQualifiedImageNameRule()); } 
	 EOF 
;

// Rule QualifiedImageName
ruleQualifiedImageName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedImageNameAccess().getIDTerminalRuleCall()); }
		RULE_ID
		{ after(grammarAccess.getQualifiedImageNameAccess().getIDTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedPath
entryRuleQualifiedPath
:
{ before(grammarAccess.getQualifiedPathRule()); }
	 ruleQualifiedPath
{ after(grammarAccess.getQualifiedPathRule()); } 
	 EOF 
;

// Rule QualifiedPath
ruleQualifiedPath 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedPathAccess().getGroup()); }
		(rule__QualifiedPath__Group__0)
		{ after(grammarAccess.getQualifiedPathAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDirImporter
entryRuleDirImporter
:
{ before(grammarAccess.getDirImporterRule()); }
	 ruleDirImporter
{ after(grammarAccess.getDirImporterRule()); } 
	 EOF 
;

// Rule DirImporter
ruleDirImporter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDirImporterAccess().getGroup()); }
		(rule__DirImporter__Group__0)
		{ after(grammarAccess.getDirImporterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOperator
entryRuleOperator
:
{ before(grammarAccess.getOperatorRule()); }
	 ruleOperator
{ after(grammarAccess.getOperatorRule()); } 
	 EOF 
;

// Rule Operator
ruleOperator 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOperatorAccess().getAlternatives()); }
		(rule__Operator__Alternatives)
		{ after(grammarAccess.getOperatorAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRotateOperation
entryRuleRotateOperation
:
{ before(grammarAccess.getRotateOperationRule()); }
	 ruleRotateOperation
{ after(grammarAccess.getRotateOperationRule()); } 
	 EOF 
;

// Rule RotateOperation
ruleRotateOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRotateOperationAccess().getGroup()); }
		(rule__RotateOperation__Group__0)
		{ after(grammarAccess.getRotateOperationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFilterOperation
entryRuleFilterOperation
:
{ before(grammarAccess.getFilterOperationRule()); }
	 ruleFilterOperation
{ after(grammarAccess.getFilterOperationRule()); } 
	 EOF 
;

// Rule FilterOperation
ruleFilterOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFilterOperationAccess().getGroup()); }
		(rule__FilterOperation__Group__0)
		{ after(grammarAccess.getFilterOperationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBlurOperation
entryRuleBlurOperation
:
{ before(grammarAccess.getBlurOperationRule()); }
	 ruleBlurOperation
{ after(grammarAccess.getBlurOperationRule()); } 
	 EOF 
;

// Rule BlurOperation
ruleBlurOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBlurOperationAccess().getGroup()); }
		(rule__BlurOperation__Group__0)
		{ after(grammarAccess.getBlurOperationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEqualizeOperation
entryRuleEqualizeOperation
:
{ before(grammarAccess.getEqualizeOperationRule()); }
	 ruleEqualizeOperation
{ after(grammarAccess.getEqualizeOperationRule()); } 
	 EOF 
;

// Rule EqualizeOperation
ruleEqualizeOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEqualizeOperationAccess().getGroup()); }
		(rule__EqualizeOperation__Group__0)
		{ after(grammarAccess.getEqualizeOperationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleShowOperation
entryRuleShowOperation
:
{ before(grammarAccess.getShowOperationRule()); }
	 ruleShowOperation
{ after(grammarAccess.getShowOperationRule()); } 
	 EOF 
;

// Rule ShowOperation
ruleShowOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getShowOperationAccess().getGroup()); }
		(rule__ShowOperation__Group__0)
		{ after(grammarAccess.getShowOperationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSaveOperation
entryRuleSaveOperation
:
{ before(grammarAccess.getSaveOperationRule()); }
	 ruleSaveOperation
{ after(grammarAccess.getSaveOperationRule()); } 
	 EOF 
;

// Rule SaveOperation
ruleSaveOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSaveOperationAccess().getGroup()); }
		(rule__SaveOperation__Group__0)
		{ after(grammarAccess.getSaveOperationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFillOperation
entryRuleFillOperation
:
{ before(grammarAccess.getFillOperationRule()); }
	 ruleFillOperation
{ after(grammarAccess.getFillOperationRule()); } 
	 EOF 
;

// Rule FillOperation
ruleFillOperation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFillOperationAccess().getGroup()); }
		(rule__FillOperation__Group__0)
		{ after(grammarAccess.getFillOperationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractElementAccess().getImporterParserRuleCall_0()); }
		ruleImporter
		{ after(grammarAccess.getAbstractElementAccess().getImporterParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractElementAccess().getOperatorParserRuleCall_1()); }
		ruleOperator
		{ after(grammarAccess.getAbstractElementAccess().getOperatorParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Importer__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImporterAccess().getImageImporterParserRuleCall_0()); }
		ruleImageImporter
		{ after(grammarAccess.getImporterAccess().getImageImporterParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getImporterAccess().getDirImporterParserRuleCall_1()); }
		ruleDirImporter
		{ after(grammarAccess.getImporterAccess().getDirImporterParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Operator__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOperatorAccess().getRotateOperationParserRuleCall_0()); }
		ruleRotateOperation
		{ after(grammarAccess.getOperatorAccess().getRotateOperationParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getFilterOperationParserRuleCall_1()); }
		ruleFilterOperation
		{ after(grammarAccess.getOperatorAccess().getFilterOperationParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getBlurOperationParserRuleCall_2()); }
		ruleBlurOperation
		{ after(grammarAccess.getOperatorAccess().getBlurOperationParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getEqualizeOperationParserRuleCall_3()); }
		ruleEqualizeOperation
		{ after(grammarAccess.getOperatorAccess().getEqualizeOperationParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getShowOperationParserRuleCall_4()); }
		ruleShowOperation
		{ after(grammarAccess.getOperatorAccess().getShowOperationParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getSaveOperationParserRuleCall_5()); }
		ruleSaveOperation
		{ after(grammarAccess.getOperatorAccess().getSaveOperationParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getOperatorAccess().getFillOperationParserRuleCall_6()); }
		ruleFillOperation
		{ after(grammarAccess.getOperatorAccess().getFillOperationParserRuleCall_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImageImporter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImageImporter__Group__0__Impl
	rule__ImageImporter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ImageImporter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImageImporterAccess().getNameAssignment_0()); }
	(rule__ImageImporter__NameAssignment_0)
	{ after(grammarAccess.getImageImporterAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImageImporter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImageImporter__Group__1__Impl
	rule__ImageImporter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ImageImporter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImageImporterAccess().getEqualsSignKeyword_1()); }
	'='
	{ after(grammarAccess.getImageImporterAccess().getEqualsSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImageImporter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ImageImporter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ImageImporter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImageImporterAccess().getImportedNamespaceAssignment_2()); }
	(rule__ImageImporter__ImportedNamespaceAssignment_2)
	{ after(grammarAccess.getImageImporterAccess().getImportedNamespaceAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedPath__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedPath__Group__0__Impl
	rule__QualifiedPath__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedPath__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedPathAccess().getSolidusKeyword_0()); }
	('/')?
	{ after(grammarAccess.getQualifiedPathAccess().getSolidusKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedPath__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedPath__Group__1__Impl
	rule__QualifiedPath__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedPath__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedPath__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedPath__Group__2__Impl
	rule__QualifiedPath__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedPath__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedPathAccess().getGroup_2()); }
	(rule__QualifiedPath__Group_2__0)*
	{ after(grammarAccess.getQualifiedPathAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedPath__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedPath__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedPath__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedPathAccess().getSolidusKeyword_3()); }
	('/')?
	{ after(grammarAccess.getQualifiedPathAccess().getSolidusKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedPath__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedPath__Group_2__0__Impl
	rule__QualifiedPath__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedPath__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedPathAccess().getSolidusKeyword_2_0()); }
	'/'
	{ after(grammarAccess.getQualifiedPathAccess().getSolidusKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedPath__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedPath__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedPath__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_2_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedPathAccess().getIDTerminalRuleCall_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DirImporter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DirImporter__Group__0__Impl
	rule__DirImporter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DirImporter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDirImporterAccess().getImagesKeyword_0()); }
	'images'
	{ after(grammarAccess.getDirImporterAccess().getImagesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DirImporter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DirImporter__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DirImporter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDirImporterAccess().getPathDirAssignment_1()); }
	(rule__DirImporter__PathDirAssignment_1)
	{ after(grammarAccess.getDirImporterAccess().getPathDirAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RotateOperation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RotateOperation__Group__0__Impl
	rule__RotateOperation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateOperation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRotateOperationAccess().getRotateKeyword_0()); }
	'rotate'
	{ after(grammarAccess.getRotateOperationAccess().getRotateKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateOperation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RotateOperation__Group__1__Impl
	rule__RotateOperation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateOperation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRotateOperationAccess().getVarAssignment_1()); }
	(rule__RotateOperation__VarAssignment_1)
	{ after(grammarAccess.getRotateOperationAccess().getVarAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateOperation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RotateOperation__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateOperation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRotateOperationAccess().getDegreeAssignment_2()); }
	(rule__RotateOperation__DegreeAssignment_2)
	{ after(grammarAccess.getRotateOperationAccess().getDegreeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FilterOperation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FilterOperation__Group__0__Impl
	rule__FilterOperation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FilterOperation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFilterOperationAccess().getFilterKeyword_0()); }
	'filter'
	{ after(grammarAccess.getFilterOperationAccess().getFilterKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FilterOperation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FilterOperation__Group__1__Impl
	rule__FilterOperation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FilterOperation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFilterOperationAccess().getVarAssignment_1()); }
	(rule__FilterOperation__VarAssignment_1)
	{ after(grammarAccess.getFilterOperationAccess().getVarAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FilterOperation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FilterOperation__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FilterOperation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFilterOperationAccess().getGrayKeyword_2()); }
	'gray'
	{ after(grammarAccess.getFilterOperationAccess().getGrayKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BlurOperation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BlurOperation__Group__0__Impl
	rule__BlurOperation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BlurOperation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlurOperationAccess().getBlurKeyword_0()); }
	'blur'
	{ after(grammarAccess.getBlurOperationAccess().getBlurKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlurOperation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BlurOperation__Group__1__Impl
	rule__BlurOperation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__BlurOperation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlurOperationAccess().getVarAssignment_1()); }
	(rule__BlurOperation__VarAssignment_1)
	{ after(grammarAccess.getBlurOperationAccess().getVarAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlurOperation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BlurOperation__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BlurOperation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBlurOperationAccess().getIntensityAssignment_2()); }
	(rule__BlurOperation__IntensityAssignment_2)
	{ after(grammarAccess.getBlurOperationAccess().getIntensityAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EqualizeOperation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EqualizeOperation__Group__0__Impl
	rule__EqualizeOperation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualizeOperation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualizeOperationAccess().getEqualizeKeyword_0()); }
	'equalize'
	{ after(grammarAccess.getEqualizeOperationAccess().getEqualizeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualizeOperation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EqualizeOperation__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualizeOperation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualizeOperationAccess().getVarAssignment_1()); }
	(rule__EqualizeOperation__VarAssignment_1)
	{ after(grammarAccess.getEqualizeOperationAccess().getVarAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ShowOperation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ShowOperation__Group__0__Impl
	rule__ShowOperation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ShowOperation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getShowOperationAccess().getShowKeyword_0()); }
	'show'
	{ after(grammarAccess.getShowOperationAccess().getShowKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ShowOperation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ShowOperation__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ShowOperation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getShowOperationAccess().getVarAssignment_1()); }
	(rule__ShowOperation__VarAssignment_1)
	{ after(grammarAccess.getShowOperationAccess().getVarAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SaveOperation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SaveOperation__Group__0__Impl
	rule__SaveOperation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SaveOperation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSaveOperationAccess().getSaveKeyword_0()); }
	'save'
	{ after(grammarAccess.getSaveOperationAccess().getSaveKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SaveOperation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SaveOperation__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SaveOperation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSaveOperationAccess().getVarAssignment_1()); }
	(rule__SaveOperation__VarAssignment_1)
	{ after(grammarAccess.getSaveOperationAccess().getVarAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FillOperation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FillOperation__Group__0__Impl
	rule__FillOperation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FillOperation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFillOperationAccess().getFillKeyword_0()); }
	'fill'
	{ after(grammarAccess.getFillOperationAccess().getFillKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FillOperation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FillOperation__Group__1__Impl
	rule__FillOperation__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FillOperation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFillOperationAccess().getVarAssignment_1()); }
	(rule__FillOperation__VarAssignment_1)
	{ after(grammarAccess.getFillOperationAccess().getVarAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FillOperation__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FillOperation__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FillOperation__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFillOperationAccess().getSizeAssignment_2()); }
	(rule__FillOperation__SizeAssignment_2)
	{ after(grammarAccess.getFillOperationAccess().getSizeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__ElementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0()); }
		ruleAbstractElement
		{ after(grammarAccess.getModelAccess().getElementsAbstractElementParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImageImporter__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImageImporterAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getImageImporterAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ImageImporter__ImportedNamespaceAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImageImporterAccess().getImportedNamespaceQualifiedImageNameParserRuleCall_2_0()); }
		ruleQualifiedImageName
		{ after(grammarAccess.getImageImporterAccess().getImportedNamespaceQualifiedImageNameParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DirImporter__PathDirAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDirImporterAccess().getPathDirQualifiedPathParserRuleCall_1_0()); }
		ruleQualifiedPath
		{ after(grammarAccess.getDirImporterAccess().getPathDirQualifiedPathParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateOperation__VarAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRotateOperationAccess().getVarIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRotateOperationAccess().getVarIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RotateOperation__DegreeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRotateOperationAccess().getDegreeINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getRotateOperationAccess().getDegreeINTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FilterOperation__VarAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFilterOperationAccess().getVarIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getFilterOperationAccess().getVarIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlurOperation__VarAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBlurOperationAccess().getVarIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getBlurOperationAccess().getVarIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BlurOperation__IntensityAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBlurOperationAccess().getIntensityINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getBlurOperationAccess().getIntensityINTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EqualizeOperation__VarAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEqualizeOperationAccess().getVarIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEqualizeOperationAccess().getVarIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ShowOperation__VarAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getShowOperationAccess().getVarIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getShowOperationAccess().getVarIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SaveOperation__VarAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSaveOperationAccess().getVarIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getSaveOperationAccess().getVarIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FillOperation__VarAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFillOperationAccess().getVarIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getFillOperationAccess().getVarIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FillOperation__SizeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFillOperationAccess().getSizeINTTerminalRuleCall_2_0()); }
		RULE_INT
		{ after(grammarAccess.getFillOperationAccess().getSizeINTTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
