package com.blablacar.qa.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.blablacar.qa.base.TestBase;
import com.blablacar.qa.pages.DashboardPage;
import com.blablacar.qa.pages.HomePage;
import com.blablacar.qa.pages.LoginPage;

public class DashboardPageTest extends TestBase{

	public DashboardPageTest()
	{
		super();
	}
	
	LoginPage loginPage;
	HomePage homePage;
	DashboardPage dashboardPage;
	
	@BeforeMethod
	public void Setup() throws IOException
	{
		Initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		dashboardPage = new DashboardPage();
	}
	
	@Test
	public void ValidateDashboardPageTitleTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		dashboardPage = homePage.NavigateToDashboard();
		String dashboardPageTitle = dashboardPage.ValidateDashboardPageTitle();
		Assert.assertEquals(dashboardPageTitle, properties.getProperty("dashboardTitle"), "Title of dashboard page is not matched to expected string");
		driver.close();
	}
	
	@Test
	public void AddPhotoToProfileTest() throws InterruptedException, AWTException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		dashboardPage = homePage.NavigateToDashboard();
		dashboardPage.UploadPhoto();
	}
	
	@Test
	public void ValidateDashboardHeaderTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		dashboardPage = homePage.NavigateToDashboard();
		dashboardPage.ValidateDashboardHeaderName();
		driver.close();
	}
	
	@Test 
	public void ViewUserPublicProfileLinkClickTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		dashboardPage = homePage.NavigateToDashboard();
		dashboardPage.ViewYourPublicProfileClick();
		driver.close();
	}
}
