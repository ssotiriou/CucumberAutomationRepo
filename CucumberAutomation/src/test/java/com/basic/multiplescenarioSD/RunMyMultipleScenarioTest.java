package com.basic.multiplescenarioSD;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		dryRun=false,
		features= {"src/test/resources/com/basic/multiplescenarioFF/"},
		glue= {"com/basic/multiplescenarioSD/"},
		plugin={"pretty",
				"html:target/cucumberhtmlreport",
				"html:target/cucumber-report_MultipleScenario.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport_MultipleScenario.html"
				}
		)

public class RunMyMultipleScenarioTest {

	
	
	
}
