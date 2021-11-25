/**
 * generated by Xtext 2.25.0
 */
package org.xtext.example.iml.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class ExtendedIMLGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    CharSequence _header = this.header();
    String _join = IteratorExtensions.join(resource.getAllContents(), "\n");
    String _plus = (_header + _join);
    fsa.generateFile(
      "scripts.py", _plus);
  }
  
  private CharSequence header() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import numpy as np");
    _builder.newLine();
    _builder.append("import cv2");
    _builder.newLine();
    _builder.newLine();
    _builder.append("def rotate_image(image, angle):");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("image_center = tuple(np.array(image.shape[1::-1]) / 2)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("rot_mat = cv2.getRotationMatrix2D(image_center, angle, 1.0)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("result = cv2.warpAffine(image, rot_mat, image.shape[1::-1], flags=cv2.INTER_LINEAR)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return result");
    _builder.newLine();
    return _builder;
  }
}
