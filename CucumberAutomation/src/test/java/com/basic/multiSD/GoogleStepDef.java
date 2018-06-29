package com.basic.multiSD;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleStepDef {

	private WebDriver driver;
	
	@Given("^That the user is on google home page$")
	public void that_the_user_is_on_google_home_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium 3 installs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	
	
	@When("^User enters search string$")
	public void User_enters_their_first_name() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("selenium");
		Thread.sleep(1000);
	}

	@Then("^Close browser quickly$")
	public void Close_browser() {
		driver.quit();
		driver=null;
	}
	
	
	
}
