package com.blablacar.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.blablacar.qa.base.TestBase;
import com.blablacar.qa.pages.HomePage;
import com.blablacar.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void Setup() throws IOException
	{
		Initialization();
		loginPage = new LoginPage();
	}
	
	@Test
	public void LoginPageTitleTest() throws InterruptedException
	{
		String loginPageTitle = loginPage.ValidateLoginPageTitle();
		Assert.assertEquals(loginPageTitle, "Log in to your BlaBlaCar account | BlaBlaCar");
		driver.close();
	}
	
	@Test
	public void LoginTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		driver.close();
	}
	
//	@AfterMethod
//	public void TearDown() throws IOException
//	{
//		driver.quit();
//	}
	

}
