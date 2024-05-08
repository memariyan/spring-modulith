package com.example.modulith;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;
import org.springframework.modulith.test.ApplicationModuleTest;

@ApplicationModuleTest
class ModulithApplicationTests {

	@Test
	void createApplicationModuleModel() {
		ApplicationModules modules = ApplicationModules.of(ModulithApplication.class);
		modules.forEach(System.out::println);
		modules.verify();
		new Documenter(modules)
				.writeDocumentation()
				.writeIndividualModulesAsPlantUml();
	}

}
