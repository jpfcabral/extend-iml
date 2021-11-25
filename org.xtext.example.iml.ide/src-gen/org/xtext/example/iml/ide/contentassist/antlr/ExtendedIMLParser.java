/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.iml.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.iml.ide.contentassist.antlr.internal.InternalExtendedIMLParser;
import org.xtext.example.iml.services.ExtendedIMLGrammarAccess;

public class ExtendedIMLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ExtendedIMLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ExtendedIMLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAbstractElementAccess().getAlternatives(), "rule__AbstractElement__Alternatives");
			builder.put(grammarAccess.getImporterAccess().getAlternatives(), "rule__Importer__Alternatives");
			builder.put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
			builder.put(grammarAccess.getImageImporterAccess().getGroup(), "rule__ImageImporter__Group__0");
			builder.put(grammarAccess.getQualifiedPathAccess().getGroup(), "rule__QualifiedPath__Group__0");
			builder.put(grammarAccess.getQualifiedPathAccess().getGroup_2(), "rule__QualifiedPath__Group_2__0");
			builder.put(grammarAccess.getDirImporterAccess().getGroup(), "rule__DirImporter__Group__0");
			builder.put(grammarAccess.getRotateOperationAccess().getGroup(), "rule__RotateOperation__Group__0");
			builder.put(grammarAccess.getFilterOperationAccess().getGroup(), "rule__FilterOperation__Group__0");
			builder.put(grammarAccess.getBlurOperationAccess().getGroup(), "rule__BlurOperation__Group__0");
			builder.put(grammarAccess.getEqualizeOperationAccess().getGroup(), "rule__EqualizeOperation__Group__0");
			builder.put(grammarAccess.getModelAccess().getElementsAssignment(), "rule__Model__ElementsAssignment");
			builder.put(grammarAccess.getImageImporterAccess().getNameAssignment_0(), "rule__ImageImporter__NameAssignment_0");
			builder.put(grammarAccess.getImageImporterAccess().getImportedNamespaceAssignment_2(), "rule__ImageImporter__ImportedNamespaceAssignment_2");
			builder.put(grammarAccess.getDirImporterAccess().getPathDirAssignment_1(), "rule__DirImporter__PathDirAssignment_1");
			builder.put(grammarAccess.getRotateOperationAccess().getDegreeAssignment_2(), "rule__RotateOperation__DegreeAssignment_2");
			builder.put(grammarAccess.getFilterOperationAccess().getVarAssignment_1(), "rule__FilterOperation__VarAssignment_1");
			builder.put(grammarAccess.getBlurOperationAccess().getVarAssignment_1(), "rule__BlurOperation__VarAssignment_1");
			builder.put(grammarAccess.getEqualizeOperationAccess().getVarAssignment_1(), "rule__EqualizeOperation__VarAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ExtendedIMLGrammarAccess grammarAccess;

	@Override
	protected InternalExtendedIMLParser createParser() {
		InternalExtendedIMLParser result = new InternalExtendedIMLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ExtendedIMLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ExtendedIMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}