package com.blablacar.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.blablacar.qa.base.TestBase;
import com.blablacar.qa.pages.DashboardPage;
import com.blablacar.qa.pages.HomePage;
import com.blablacar.qa.pages.LoginPage;
import com.blablacar.qa.pages.ProfilePage;

public class HomePageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	DashboardPage dashboardPage;
	ProfilePage profilePage;
	
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void Setup() throws IOException
	{
		Initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
	}
	
	@Test
	public void NavigateToDashboardPageTest() throws InterruptedException 
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		dashboardPage = homePage.NavigateToDashboard();
		driver.close();
	}
	
	@Test
	public void NavigateToProfilePageTest() throws InterruptedException 
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		driver.close();
	}
	
	@Test
	public void HomePageTitleTest()
	{
		String homePageTitle = homePage.ValidateHomePageTitle();
		Assert.assertEquals(homePageTitle, "Share your journey with BlaBlaCar - Trusted carpooling | BlaBlaCar");
		driver.close();
	}

	
	@Test
	public void LogoutTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		homePage.Logout();
		driver.close();
	}
	
	@Test
	public void VerifyDashboardDropDownMenuTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		homePage.VerifyDashboardDropDownMenu();
		driver.close();
	}
	
	@Test
	public void VerifyRidesOfferedDropDownMenuTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		homePage.VerifyRidesOfferedDropDownMenu();
		driver.close();
	}
	
	@Test
	public void VerifyAlertsDropDownMenuTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		homePage.VerifyAlertsDropDownMenu();
		driver.close();
	}
	
	@Test
	public void VerifyBookingsDropDownMenuTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		homePage.VerifyBookingsDropDownMenu();
		driver.close();
	}
	
	@Test
	public void VerifyPaymentsDropDownMenuTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		homePage.VerifyPaymentsDropDownMenu();
		driver.close();
	}
	
	@Test
	public void VerifyLogoutDropDownMenuTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		homePage.VerifyLogoutDropDownMenu();
		driver.close();
	}
	
	@Test
	public void VerifyProfileDropDownMenuTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		homePage.VerifyProfileDropDownMenu();
		driver.close();
	}
	
	@Test
	public void VerifyQuestionAndAnswersDropDownMenuTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		homePage.VerifyQuestionsAndAnswersDropDownMenu();
		driver.close();
	}
}
