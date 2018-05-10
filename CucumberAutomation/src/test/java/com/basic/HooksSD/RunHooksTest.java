package com.basic.HooksSD;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		dryRun=false,
		features= {"src/test/resources/com/basic/HooksFF/"},
		glue= {"com/basic/HooksSD/"},
		plugin={"pretty",
				"html:target/cucumberhtmlreport",
				"html:target/cucumber-report2.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport_Hooks.html"
				}
		)

public class RunHooksTest {

	
	
	
}
