package com.basic.ShareDataSD;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShareDataStepDef {
	
	WebDriver driver;
	
	public ShareDataStepDef(SharedClass share) throws MalformedURLException {
		driver = share.setup();
	}
		
	@Given("^That the User is on the Facebook login page$")
	public void the_User_is_on_the_Facebook_login_page() throws InterruptedException {
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	
	
	@When("^User enters \"(.*)\" as first name$")
	public void User_enters_their_first_name(String firstName) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys(firstName);
		Thread.sleep(1000);
	}
		
	
}
