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

public class MultiStepDef {
	
	private WebDriver driver;
	
	
	@Given("^That the User is on the Facebook login page$")
	public void the_User_is_on_the_Facebook_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium 3 installs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	
	
	@When("^User enters \"(.*)\" as first name$")
	public void User_enters_their_first_name(String firstName) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='u_0_l']")).sendKeys(firstName);
		Thread.sleep(1000);
	}
		
	
	@Then("^Check that the username \"(.*)\" is present within the first name field$")
	public void Check_that_the_username_field_is_present_within_the_first_name_field(String firstName) throws InterruptedException {
		String userNameActual = driver.findElement(By.xpath("//input[@id='u_0_l']")).getAttribute("value");
		Assert.assertEquals(firstName, userNameActual);
		Thread.sleep(1000);
	}
	
	@And("^User enters their surname \"(.*)\"$")
	public void User_enters_their_surname(String surName) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='u_0_n']")).sendKeys(surName);
		Thread.sleep(1000);
	}
	
	@But("^User mobile field should be blank$")
	public void User_mobile_field_should_be_blank() throws InterruptedException {
		String mobileActual = driver.findElement(By.xpath("//input[@id='u_0_q']")).getAttribute("value");
		Assert.assertEquals("", mobileActual);
		Thread.sleep(1000);
	}
	
	@Then("^Close browser$")
	public void Close_browser() {
		driver.quit();
		driver=null;
	}
	
	

}
