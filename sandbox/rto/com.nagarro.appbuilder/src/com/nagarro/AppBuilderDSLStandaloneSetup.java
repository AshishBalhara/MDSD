/*
 * generated by Xtext
 */
package com.nagarro;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class AppBuilderDSLStandaloneSetup extends AppBuilderDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new AppBuilderDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

