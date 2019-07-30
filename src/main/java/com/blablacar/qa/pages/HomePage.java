package com.blablacar.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.blablacar.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath = "//button[@class = 'jsx-3475587623' and @type='button']")
	WebElement menuLink;
	
	@FindBy(xpath = "//div[contains(text(), 'Dashboard')]")
	WebElement dashboardLink;
	
	@FindBy(xpath = "//div[contains(text(), 'Rides offered')]")
	WebElement ridesOfferedLink;
	
	@FindBy(xpath = "//div[contains(text(), 'Bookings')]")
	WebElement bookingLink;
	
	@FindBy(xpath = "//div[contains(text(), 'Questions/Answers')]")
	WebElement questionsAndAnswersLink;
	
	@FindBy(xpath = "//div[contains(text(), 'Alerts')]")
	WebElement alertsLink;
	
	@FindBy(xpath = "//div[contains(text(), 'Profile')]")
	WebElement profileLink;
	
	@FindBy(xpath = "//div[contains(text(), 'Payments & refunds')]")
	WebElement payementsLink;
	
	@FindBy(xpath = "//div[contains(text(), 'Log out')]")
	WebElement logoutLink;
	
	LoginPage loginPage;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public DashboardPage NavigateToDashboard() throws InterruptedException
	{
		Thread.sleep(5000);
		menuLink.click();
		Thread.sleep(2000);
		dashboardLink.click();
		Thread.sleep(5000);
		return new DashboardPage();
	}
	
	public ProfilePage NavigateToProfilePage() throws InterruptedException
	{
		Thread.sleep(5000);
		menuLink.click();
		Thread.sleep(2000);
		profileLink.click();
		Thread.sleep(5000);
		return new ProfilePage();
	}
	
	public String ValidateHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public void Logout() throws InterruptedException
	{
		Thread.sleep(5000);
		menuLink.click();
		Thread.sleep(4000);
		logoutLink.click();
		Thread.sleep(4000);
	}
	
	public void VerifyDashboardDropDownMenu() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";
		
		Thread.sleep(5000);
		menuLink.click();
		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.xpath("//div[contains(text(), 'Dashboard')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Dashboard menu is missing";
			testResult = false;
		}
		
		Assert.assertEquals(testResult, true, "Dashboard menu is missing from drop down menu of Home Page");
	}
	
	public void VerifyRidesOfferedDropDownMenu() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";
		
		Thread.sleep(5000);
		menuLink.click();
		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.xpath("//div[contains(text(), 'Rides offered')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Rides Offered menu is missing";
			testResult = false;
		}
		
		Assert.assertEquals(testResult, true, "Rides Offered menu is missing from drop down menu of Home Page");
	}
	
	public void VerifyBookingsDropDownMenu() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";
		
		Thread.sleep(5000);
		menuLink.click();
		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.xpath("//div[contains(text(), 'Bookings')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Bookings menu is missing";
			testResult = false;
		}
		
		Assert.assertEquals(testResult, true, "Bookings menu is missing from drop down menu of Home Page");
	}
	
	public void VerifyQuestionsAndAnswersDropDownMenu() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";
		
		Thread.sleep(5000);
		menuLink.click();
		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.xpath("//div[contains(text(), 'Questions/Answers')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Questions/Answers menu is missing";
			testResult = false;
		}
		
		Assert.assertEquals(testResult, true, "Questions/Answers menu is missing from drop down menu of Home Page");
	}
	
	public void VerifyAlertsDropDownMenu() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";
		
		Thread.sleep(5000);
		menuLink.click();
		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.xpath("//div[contains(text(), 'Alerts')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Alerts menu is missing";
			testResult = false;
		}
		
		Assert.assertEquals(testResult, true, "Alerts menu is missing from drop down menu of Home Page");
	}
	
	public void VerifyProfileDropDownMenu() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";
		
		Thread.sleep(5000);
		menuLink.click();
		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.xpath("//div[contains(text(), 'Profile')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Profile menu is missing";
			testResult = false;
		}
		
		Assert.assertEquals(testResult, true, "Profile menu is missing from drop down menu of Home Page");
	}
	
	public void VerifyPaymentsDropDownMenu() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";
		
		Thread.sleep(5000);
		menuLink.click();
		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.xpath("//div[contains(text(), 'Payments & refunds')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Payments & Refunds menu is missing";
			testResult = false;
		}
		
		Assert.assertEquals(testResult, true, "Payments & Refunds menu is missing from drop down menu of Home Page");
	}
	
	public void VerifyLogoutDropDownMenu() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";
		
		Thread.sleep(5000);
		menuLink.click();
		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.xpath("//div[contains(text(), 'Log out')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Logout menu is missing";
			testResult = false;
		}
		
		Assert.assertEquals(testResult, true, "Logout menu is missing from drop down menu of Home Page");
	}
}
