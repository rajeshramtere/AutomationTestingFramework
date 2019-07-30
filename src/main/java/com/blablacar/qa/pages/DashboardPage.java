package com.blablacar.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.blablacar.qa.base.TestBase;

public class DashboardPage extends TestBase{

	@FindBy(xpath = "//div/section/div/h1/span/a[@href = '/dashboard/profile/picture']")
	WebElement addPhotoLink;
	
	@FindBy(xpath = "//div/label[contains(text(), 'Choose a file')]")
	WebElement chooseFilePath;
	
	@FindBy(xpath = "//h1[contains(text(), 'Dashboard')]")
	WebElement dashboardHeaderName;
	
	@FindBy(xpath = "//a[contains(text(), 'View your public profile')]")
	WebElement viewYourPublicProfileLink;
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void UploadPhoto() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);
		addPhotoLink.click();
		Thread.sleep(2000);
		chooseFilePath.click();
		Thread.sleep(2000);
		
		StringSelection filePath = new StringSelection(properties.getProperty("photopath"));
		Thread.sleep(3000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		driver.close();
	}
	
	public String ValidateDashboardPageTitle()
	{
		return driver.getTitle();
	}
	
	public void ValidateDashboardHeaderName()
	{
		boolean testResult = true;
		String msg = " ";
		try
		{
			driver.findElement(By.xpath("//h1[contains(text(), 'Dashboard')]"));
		}
		catch(Exception ex)
		{
			testResult = false;
			msg = msg + "Dashboard header name is not matched with expected result";
		}
		
		Assert.assertEquals(testResult, true, msg);
	}
	
	public void ViewYourPublicProfileClick() throws InterruptedException
	{
		viewYourPublicProfileLink.click();
		Thread.sleep(3000);
	}
}
