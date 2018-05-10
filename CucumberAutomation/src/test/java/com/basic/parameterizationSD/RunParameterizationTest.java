package com.basic.parameterizationSD;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		dryRun=false,
		features= {"src/test/resources/com/basic/parameterizationFF/"},
		glue= {"com/basic/parameterizationSD/"},
		plugin={"pretty",
				"html:target/cucumberhtmlreport",
				"html:target/cucumber-report5.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport_Parameterization.html"
				}
		)

public class RunParameterizationTest {

	
	
	
}
