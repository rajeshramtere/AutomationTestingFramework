package com.blablacar.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.blablacar.qa.base.TestBase;

public class RegistrationPage extends TestBase{

	@FindBy(xpath = "//div/a[contains(text(), 'Sign up')]")
	WebElement registartionLink;
	
	@FindBy(xpath = "//div/nav/a/div/div[contains(text(), 'Sign up with my email')]")
	WebElement signUpByEmailLink;
	
	@FindBy(name = "email")
	WebElement emailIdTextBox;
	
	@FindBy(xpath = "//div/button[contains(text(), 'Continue')]")
	WebElement continueButton;
	
	@FindBy(name = "firstname")
	WebElement firstNameTextBox;
	
	@FindBy(name = "lastname")
	WebElement lastNameTextBox;
	
	@FindBy(name = "birthdate")
	WebElement birthdateTextBox;
	
	@FindBy(xpath = "//div/div[contains(text(), 'Man')]")
	WebElement selectManRadioButton;
	
	@FindBy(name = "password")
	WebElement passwordTextBox;
	
	//Initializing page objects
	public RegistrationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String ValidateRegistartionPageTitle() throws InterruptedException
	{
		Thread.sleep(2000);
		registartionLink.click();
		return driver.getTitle();
	}
	
	public void Registration(String emailId, String firstName, String lastName, String date, 
								String month, String year, String password) throws InterruptedException
	{
		Thread.sleep(2000);
		registartionLink.click();
		Thread.sleep(2000);
		signUpByEmailLink.click();
		Thread.sleep(2000);
		emailIdTextBox.sendKeys(emailId);
		Thread.sleep(2000);
		continueButton.click();
		Thread.sleep(2000);
		firstNameTextBox.sendKeys(firstName);
		Thread.sleep(2000);
		lastNameTextBox.sendKeys(lastName);
		Thread.sleep(2000);
		continueButton.click();
		Thread.sleep(2000);
		birthdateTextBox.sendKeys(date);
		Thread.sleep(2000);
		birthdateTextBox.sendKeys(month);
		Thread.sleep(2000);
		birthdateTextBox.sendKeys(year);
		Thread.sleep(2000);
		continueButton.click();
		Thread.sleep(2000);
		selectManRadioButton.click();
		Thread.sleep(2000);
		passwordTextBox.sendKeys(password);
		Thread.sleep(2000);
		continueButton.click();
	}
}
