package com.basic.ShareDataSD;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {
	
	WebDriver driver;
	String nodeURL = "http://192.168.0.17:6666/wd/hub";
	
	
	@Before
	public WebDriver setup() throws MalformedURLException {
		if(driver==null) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium 3 installs\\chromedriver_win32\\chromedriver.exe");
		//driver = new ChromeDriver();
		
		
		//Set the Remote Web Driver
				//System.out.println("Chrome with MyFirstStepDef - started");
				//System.setProperty("webdriver.chrome.driver","C:\\Users\\Stelios\\Desktop\\selenium 3 installs\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeURL), options);
		
								
				
				
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		return driver;
	
	}
	
	@After
	public void tearDown() {
		driver.quit();
		driver=null;
	}
	
	
	
}
