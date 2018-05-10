package com.basic.ShareDataSD;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		dryRun=false,
		features= {"src/test/resources/com/basic/ShareDataFF/"},
		glue= {"com/basic/ShareDataSD/"},
		plugin={"pretty",
				"html:target/cucumberhtmlreport",
				"html:target/cucumber-report6.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport_ShareData.html"
				}
		)

public class RunShareDataTest {

	
	
	
}
