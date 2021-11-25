/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.iml.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.iml.ui.internal.ImlActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ExtendedIMLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(ImlActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		ImlActivator activator = ImlActivator.getInstance();
		return activator != null ? activator.getInjector(ImlActivator.ORG_XTEXT_EXAMPLE_IML_EXTENDEDIML) : null;
	}

}