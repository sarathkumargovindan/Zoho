package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.Baseclass;
import com.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends Baseclass {
	WebDriver driver = Runner.driver;

	@Given("^launch The Url$")
	public void launch_The_Url() throws Throwable {

		launchUrl("https://www.zoho.com/login.html");
		implicitywait(3);
	}

	@When("^enter The Login Details$")
	public void enter_The_Login_Details() throws Throwable {
		WebElement signup = webElement("//a[@href='signup.html']");
		clickOnElement(signup);
		WebElement emailid = webElement("//input[@type ='email']");
		userInput(emailid, "email");
		WebElement pass = webElement("//input[@type ='password']");
		userInput(pass, "password");
		WebElement mobno = webElement("//input[@id ='rmobile']");
		userInput(mobno, "258658686");

		Thread.sleep(1000);
		WebElement agree = webElement("//span[@id='signup-termservice']");
		clickOnElement(agree);

		Thread.sleep(1000);
		WebElement signup1 = webElement("//input[@type='submit']");
		clickOnElement(signup1);

	}

	@Then("^take Screenshot Of The Webpage$")
	public void take_Screenshot_Of_The_Webpage() throws Throwable {
		capture("img1");
	}

}
