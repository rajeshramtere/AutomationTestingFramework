package com.blablacar.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.blablacar.qa.utilities.TestUtilities;

public class TestBase {

	public static WebDriver driver;
	public static Properties properties;
	
	public TestBase()
	{
		try
		{
			properties = new Properties();
			FileInputStream fileInput = new FileInputStream("D:\\EclipseWorkspace\\BlaBlaCarTest\\src\\main\\java\\com\\blablacar\\qa\\config\\config.properties");
					properties.load(fileInput);
		}
		catch(FileNotFoundException ex)
		{
			ex.printStackTrace();
		}catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void Initialization()
	{
		String browserName = properties.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					"E:\\SeleniumSoftwares\\Selenium\\chromedriver 74\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", 
					"E:\\SeleniumSoftwares\\Selenium\\geckodriver-v0.18.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtilities.PAGELOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtilities.IMPLICIT_WAIT_TIMEOUT, TimeUnit.SECONDS);
		
		driver.get(properties.getProperty("url"));
	}
}
