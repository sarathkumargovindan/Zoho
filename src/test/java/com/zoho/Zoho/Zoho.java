package com.zoho.Zoho;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.base.Baseclass;

public class Zoho extends Baseclass {

	public static void main(String[] args) throws InterruptedException, IOException {
		browserLaunch();
		launchUrl("https://www.zoho.com/login.html");

		implicitywait(3);
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

		capture("img1");
	}

}
