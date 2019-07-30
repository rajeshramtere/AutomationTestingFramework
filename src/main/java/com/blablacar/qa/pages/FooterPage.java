package com.blablacar.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.blablacar.qa.base.TestBase;

public class FooterPage extends TestBase{

	@FindBy(xpath = "//a[contains(text(), 'How It Works')]")
	WebElement howItWorksLink;
	
	@FindBy(xpath = "//a[contains(text(), 'About Us')]")
	WebElement aboutUsLink;
	
	@FindBy(xpath = "//a[contains(text(), 'Frequently Asked Questions')]")
	WebElement faqsLink;
	
	@FindBy(xpath = "//a[contains(text(), 'Contact')]")
	WebElement contactLink;
	
	@FindBy(xpath = "//a[contains(text(), 'Terms and Conditions')]")
	WebElement termsAndConditionsLink;
	
	@FindBy(xpath = "//a[contains(text(), 'Press')]")
	WebElement pressLink;
	
	@FindBy(xpath = "//a[@href='/dreamjobs' and @class='text-primaryText']")
	WebElement weAreHiringLink;
	
	@FindBy(xpath = "//a[@class = 'home-more']")
	WebElement findOutMoreLink;
	
	@FindBy(xpath = "//a[@title='Link to www.facebook.com/blablacar.fr']")
	WebElement facebookLink;
	
	@FindBy(xpath = "//a[@title='Link to twitter.com/BlaBlaCar_FR']")
	WebElement twitterLink;
	
	@FindBy(xpath = "//a[@title='Link to www.youtube.com/c/BlaBlaCarFR']")
	WebElement youtubeLink;
	
	@FindBy(xpath = "//a[@title='Link to www.instagram.com/blablacarfr/']")
	WebElement instagramLink;
	
	public FooterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ValidateHowItWorksLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";

		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.xpath("//a[contains(text(), 'How It Works')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "How It Works link is missing in footer";
			testResult = false;
		}
		
		Assert.assertEquals(testResult, true, msg);
	}
	
	public void ValidateAboutUsLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";

		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.xpath("//a[contains(text(), 'About Us')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "About Us link is missing in footer";
			testResult = false;
		}
		
		Assert.assertEquals(testResult, true, msg);
	}
	
	public void ValidateFAQsLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";

		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.xpath("//a[contains(text(), 'Frequently Asked Questions')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Frequently Asked Questions link is missing in footer";
			testResult = false;
		}
		
		Assert.assertEquals(testResult, true, msg);
	}
	
	public void ValidateContactLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";
		
		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.xpath("//a[contains(text(), 'Contact')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Contact link is missing in footer";
			testResult = false;
		}
		
		Assert.assertEquals(testResult, true, msg);
	}
	
	public void ValidateTermsAndConditionsLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";
		
		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.xpath("//a[contains(text(), 'Terms and Conditions')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Terms and Conditions link is missing in footer";
			testResult = false;
		}
		
		Assert.assertEquals(testResult, true, msg);
	}
	
	public void ValidatePressLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";
		
		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.xpath("//a[contains(text(), 'Press')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Press link is missing in footer";
			testResult = false;
		}
		
		Assert.assertEquals(testResult, true, msg);
	}
	
	public void ValidateWeAreHiringLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";
		
		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.xpath("//a[@href='/dreamjobs' and @class='text-primaryText']"));
		}
		catch(Exception ex)
		{
			msg = msg + "We're Hiring link is missing in footer";
			testResult = false;
		}
		
		Assert.assertEquals(testResult, true, msg);
	}
	
	public void ValidateFindOutMoreLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";
		
		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.xpath("//a[@class = 'home-more']"));
		}
		catch(Exception ex)
		{
			msg = msg + "Find out more link is missing in footer";
			testResult = false;
		}
		
		Assert.assertEquals(testResult, true, msg);
	}
	
	public void ValidateFacebookLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";
		
		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.xpath("//a[@title='Link to www.facebook.com/blablacar.fr']"));
		}
		catch(Exception ex)
		{
			msg = msg + "Facebook link is missing in footer";
			testResult = false;
		}
		
		Assert.assertEquals(testResult, true, msg);
	}
	
	public void ValidateTwitterLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";
		
		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.xpath("//a[@title='Link to twitter.com/BlaBlaCar_FR']"));
		}
		catch(Exception ex)
		{
			msg = msg + "Twitter link is missing in footer";
			testResult = false;
		}
		
		Assert.assertEquals(testResult, true, msg);
	}
	
	public void ValidateInstagramLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";
		
		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.xpath("//a[@title='Link to www.instagram.com/blablacarfr/']"));
		}
		catch(Exception ex)
		{
			msg = msg + "Instagram link is missing in footer";
			testResult = false;
		}
		
		Assert.assertEquals(testResult, true, msg);
	}
	
	public void ValidateYoutubeLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";
		
		Thread.sleep(2000);
		
		try
		{
			driver.findElement(By.xpath("//a[@title='Link to www.youtube.com/c/BlaBlaCarFR']"));
		}
		catch(Exception ex)
		{
			msg = msg + "Youtube link is missing in footer";
			testResult = false;
		}
		
		Assert.assertEquals(testResult, true, msg);
	}
}
