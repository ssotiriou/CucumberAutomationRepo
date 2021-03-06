package com.basic.multiSD;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		//dryRun=true,
		features= {"src/test/resources/com/basic/multiFF/"},
		glue= {"com/basic/multiSD/"},
		plugin={"pretty",
				"html:target/cucumberhtmlreport",
				"json:target/cucumber-report4.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport_Multi.html"
				}
		)

public class RunMultiTest {

	
}
