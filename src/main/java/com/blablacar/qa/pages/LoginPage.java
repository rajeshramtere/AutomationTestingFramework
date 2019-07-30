package com.blablacar.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.blablacar.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory / Object Repository(OR)
	@FindBy(xpath = "//a[contains(text(), 'Log in')]")
	WebElement loginLink;
	
	@FindBy(xpath = "//div[contains(text(), 'Use my email')]")
	WebElement useMyEmail;
	
	@FindBy(name = "login")
	WebElement usernameTextbox;
	
	@FindBy(name = "password")
	WebElement passwordTextbox;
	
	@FindBy(xpath = "//button[contains(text(), 'Log in')]")
	WebElement loginBtn;
	
	//Initializing page objects
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String ValidateLoginPageTitle() throws InterruptedException
	{
		Thread.sleep(2000);
		loginLink.click();
		Thread.sleep(2000);
		return driver.getTitle();
	}
	
	public HomePage Login(String username, String password) throws InterruptedException
	{
		Thread.sleep(2000);
		loginLink.click();
		Thread.sleep(2000);
		useMyEmail.click();
		Thread.sleep(2000);
		usernameTextbox.sendKeys(username);
		Thread.sleep(2000);
		passwordTextbox.sendKeys(password);
		loginBtn.click();
		
		return new HomePage();
	}
}
