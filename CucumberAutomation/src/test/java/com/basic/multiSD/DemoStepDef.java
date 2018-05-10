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


public class DemoStepDef {

	private WebDriver driver;
	
	@Given("^That the user is on the demo site page$")
	public void that_the_user_is_on_the_demo_site_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\selenium 3 installs\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	
	
	@When("^User enters first name$")
	public void User_enters_first_name() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Tom");
		Thread.sleep(1000);
	}
	
	
	@When("^User enters last name$")
	public void User_enters_last_name() throws InterruptedException {
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Jerry");
		Thread.sleep(1000);
	}
	
	
}
