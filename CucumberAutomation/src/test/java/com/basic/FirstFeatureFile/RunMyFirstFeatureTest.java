package com.basic.FirstFeatureFile;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		dryRun=false,
		features= {"src/test/resources/com/basic/FeatureFiles/"},
		glue= {"com/basic/FirstFeatureFile/"},
		plugin={"pretty",
				"html:target/cucumberhtmlreport",
				"html:target/cucumber-report_FirstFeature.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport_FirstFeature.html"
				}
		)

public class RunMyFirstFeatureTest {

	
	
	
}
