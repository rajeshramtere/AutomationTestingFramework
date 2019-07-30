package com.blablacar.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.blablacar.qa.base.TestBase;
import com.blablacar.qa.pages.FooterPage;
import com.blablacar.qa.pages.HomePage;
import com.blablacar.qa.pages.LoginPage;

public class FooterPageTest extends TestBase{

	public FooterPageTest()
	{
		super();
	}
	
	LoginPage loginPage;
	HomePage homePage;
	FooterPage footerPage;
	
	@BeforeMethod
	public void Setup() throws IOException
	{
		Initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		footerPage = new FooterPage();
	}
	
	@Test
	public void ValidateHowItWorksLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		footerPage.ValidateHowItWorksLink();
		driver.close();
	}
	
	@Test
	public void ValidateAboutUsLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		footerPage.ValidateAboutUsLink();
		driver.close();
	}
	
	@Test
	public void ValidateFAQsLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		footerPage.ValidateFAQsLink();
		driver.close();
	}
	
	@Test
	public void ValidateContactLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		footerPage.ValidateContactLink();
		driver.close();
	}
	
	@Test
	public void ValidateTermsAndConditionsLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		footerPage.ValidateTermsAndConditionsLink();
		driver.close();
	}
	
	@Test
	public void ValidatePressLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		footerPage.ValidatePressLink();
		driver.close();
	}
	
	@Test
	public void ValidateWeAreHiringLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		footerPage.ValidateWeAreHiringLink();
		driver.close();
	}
	
	@Test
	public void ValidateFindOutMoreLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		footerPage.ValidateFindOutMoreLink();
		driver.close();
	}
	
	@Test
	public void ValidateFacebookLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		footerPage.ValidateFacebookLink();
		driver.close();
	}
	
	@Test
	public void ValidateYoutubeLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		footerPage.ValidateYoutubeLink();
		driver.close();
	}
	
	@Test
	public void ValidateInstagramLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		footerPage.ValidateInstagramLink();
		driver.close();
	}
	
	@Test
	public void ValidateTwitterLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		footerPage.ValidateTwitterLink();
		driver.close();
	}
}
