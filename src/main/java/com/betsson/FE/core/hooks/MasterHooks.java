package com.betsson.FE.core.hooks;

import com.betsson.FE.core.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class MasterHooks extends DriverFactory {

	@Before
	public void setup() {
		driver = getDriver();
	}

	@After
	public void tearDown(Scenario scenario) {
		try {
				driver.manage().deleteAllCookies();
				//driver.quit();
				//driver = null;
		} catch (Exception e) {
			System.out.println("Methods failed: tearDownFailure, Exception: " + e.getMessage());
		}
	}

}
