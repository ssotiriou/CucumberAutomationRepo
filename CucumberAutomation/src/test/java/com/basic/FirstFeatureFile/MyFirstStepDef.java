package com.basic.FirstFeatureFile;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class MyFirstStepDef {
	
	private WebDriver driver;
	//String nodeURL = "http://localhost:4444/wd/hub";
	
	@Given("^That the User is on the Facebook login page$")
	public void the_User_is_on_the_Facebook_login_page() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium 3 installs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//Set the Remote Web Driver
		//System.out.println("Firefox with MyFirstStepDef - started");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\selenium 3 installs\\geckodriver-v0.19.1-win64\\geckodriver.exe");
    	//DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		//capabilities.setPlatform(Platform.WINDOWS);
		//capabilities.setVersion("");
		//driver = new RemoteWebDriver(new URL(nodeURL),capabilities);
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//TESTER CHANGE FOR GIT
		
	}
	
	
	@When("^User enters their first name$")
	public void User_enters_their_first_name() {
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys("David");
	}
	
	@Then("^Check that the username field is present within the first name field$")
	public void Check_that_the_username_field_is_present_within_the_first_name_field() {
		String userNameActual = driver.findElement(By.xpath("//input[@id='u_0_l']")).getAttribute("value");
		Assert.assertEquals("David", userNameActual);
		driver.quit();
	}
	
	

}
