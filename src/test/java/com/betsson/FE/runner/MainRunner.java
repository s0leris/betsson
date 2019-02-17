package com.betsson.FE.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = { "src/test/java/com/betsson/FE/features" },
		glue = {"com.betsson.FE.steps", "com.betsson.FE.core.hooks"}, 
		monochrome = true,
		tags = {"@registerAndLogin"}, 
		plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json", "com.cucumber.listener.ExtentCucumberFormatter:output/report.html" })

public class MainRunner extends AbstractTestNGCucumberTests {

}
