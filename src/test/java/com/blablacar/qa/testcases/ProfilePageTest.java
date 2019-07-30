package com.blablacar.qa.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.blablacar.qa.base.TestBase;
import com.blablacar.qa.pages.DashboardPage;
import com.blablacar.qa.pages.HomePage;
import com.blablacar.qa.pages.LoginPage;
import com.blablacar.qa.pages.ProfilePage;
import com.blablacar.qa.utilities.*;

public class ProfilePageTest extends TestBase{

	public ProfilePageTest()
	{
		super();
	}
	
	LoginPage loginPage;
	HomePage homePage;
	DashboardPage dashboardPage;
	ProfilePage profilePage;
	
	@BeforeMethod
	public void Setup() throws IOException
	{
		Initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		dashboardPage = new DashboardPage();
		profilePage = new ProfilePage();
	}
	
	/////////////////////////////////////////////////////////////////////////////////
	//Add Car
	@DataProvider(name="DataProviderForAddingCars")
	public Object[][] AddCars() throws InvalidFormatException, IOException
	{
		
		String addCarExcelPath = "D:\\EclipseWorkspace\\BlaBlaCarTest\\src\\main\\java\\com\\blablacar\\qa\\testdata\\CarData.xlsx";
		ReadExcelData excelObj = new ReadExcelData(addCarExcelPath );
		
		//Getting row count of sheet
		int rowCount = excelObj.getRowCount(0);
		System.out.println("Row Count : " +rowCount);
		//Getting column count of sheet
		int columnCount = excelObj.getColumnCount(0);
		System.out.println("Column Count : " +columnCount);
		
		Object[][] data = new Object[rowCount][columnCount];
				
		for(int i=0;i<rowCount;i++ )
		{
			for(int j=0; j<columnCount; j++)
			{
				data[i][j]=excelObj.getCellData(0, i, j);
			}			
		}
		return data;
	}
	
	@Test(dataProvider="DataProviderForAddingCars")
	public void AddCarUsingExcelData(String numberPlate, String carManufacturer, String carModel,
					 String carType, String carColor, String carRegistrationYear) throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.CarTabClick();
		profilePage.AddMultipleCarsUsingExcelData(numberPlate, carManufacturer, carModel, carType, carColor, carRegistrationYear);
		driver.close();
	}
	/////////////////////////////////////////////////////////////////////////////////
	
//	@Test
//	public void AddSingleCarTest() throws InterruptedException
//	{
//		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
//		profilePage = homePage.NavigateToProfilePage();
//		profilePage.CarTabClick();
//		profilePage.UploadPhoto();
//		driver.close();
//	}
	
	@Test
	public void AddSingleCarTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.CarTabClick();
		profilePage.AddSingleCarInformation();
		driver.close();
	}
	
	@Test
	public void DeleteSingleCarTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.CarTabClick();
		profilePage.DeleteSingleCar();
		driver.close();
	}
	
	@Test
	public void DeleteCarFromListedCarsTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.CarTabClick();
		profilePage.DeleteCarByIndex("6");
		driver.close();
	}
	
	@Test
	public void SaveEditProfileInformation() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.SaveEditedProfileInformation();
		driver.close();
	}
	
	@Test
	public void ValidatePersonalInformationTabTitleTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		String personalInformationTitle = profilePage.ValidatePersonalInformationPageTitle();
		Assert.assertEquals(personalInformationTitle, properties.getProperty("personalInformationPageTitle"));
		driver.close();
	}
	
	@Test
	public void ValidatePersonalInformationHeaderNameTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.ValidatePersonalInformationHeaderName();
		driver.close();
	}
	
	@Test
	public void ValidatePhotoHeaderNameTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.ProfilePhotoTabClick();
		profilePage.ValidatePhotoHeaderName();
		driver.close();
	}
	
	@Test
	public void ValidatePhotoTabTitleTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.ProfilePhotoTabClick();
		String photoTitle = profilePage.ValidatePreferencesPageTitle();
		Assert.assertEquals(photoTitle, properties.getProperty("preferencesPageTitle"));
		driver.close();
	}
	
	@Test
	public void RemoveProfilePhotoTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.ProfilePhotoTabClick();
		profilePage.RemoveProfilePhotoClick();
		driver.close();
	}
	
	@Test
	public void ValidatePreferencesHeaderNameTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.PreferencesTabClick();
		profilePage.ValidatePreferencesHeaderName();
		driver.close();
	}	
	@Test
	public void ValidatePreferencesTabTitleTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.PreferencesTabClick();
		String preferencesTitle = profilePage.ValidatePreferencesPageTitle();
		Assert.assertEquals(preferencesTitle, properties.getProperty("preferencesPageTitle"));
		driver.close();
	}
	
	@Test
	public void SelectPreferencesTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.PreferencesTabClick();
		profilePage.SelectPreferences();
		driver.close();
	}
	
	@Test
	public void ValidateVerificatationHeaderNameTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.VerificationTabClick();
		profilePage.ValidateVerificationHeaderName();
		driver.close();
	}
	
	@Test
	public void ValidatePostalAddressHeaderNameTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.PostalAddressTabClick();
		profilePage.ValidatePostalAddressHeaderName();
		driver.close();
	}
	
	@Test
	public void ValidatePostalAddressTabTitleTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.PostalAddressTabClick();
		String postalAddressTitle = profilePage.ValidatePostalAddressPageTitle();
		Assert.assertEquals(postalAddressTitle, properties.getProperty("postalAddressPageTitle"));
		driver.close();
	}
	
	@Test
	public void ChangeUserNameThroughPostalAddressPageTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.PostalAddressTabClick();
		profilePage.YourProfileClickOnPostalAddressTab();
		profilePage.SaveUserName();
		driver.close();
	}
	
	@Test
	public void SavePostalAddressTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.PostalAddressTabClick();
		profilePage.SavePostalAddress();
		driver.close();
	}
	
	@Test
	public void ValidateVerificationTabTitleTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.VerificationTabClick();
		String verificationTitle = profilePage.ValidateVerificationPageTitle();
		Assert.assertEquals(verificationTitle, properties.getProperty("verificationPageTitle"));
		driver.close();
	}
	
	@Test
	public void ValidateRatingsReceivedTabTitleTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.RatingsReceivedTabClick();
		String ratingsReceivedTitle = profilePage.ValidateRatingsReceivedPageTitle();
		Assert.assertEquals(ratingsReceivedTitle, properties.getProperty("ratingsReceivedPageTitle"));
		driver.close();
	}
	
	@Test
	public void ValidateRatingsGivenTabTitleTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.RatingsGivenTabClick();
		String ratingsGivenTitle = profilePage.ValidateRatingsGivenPageTitle();
		Assert.assertEquals(ratingsGivenTitle, properties.getProperty("ratingsGivenPageTitle"));
		driver.close();
	}
	
	@Test
	public void ValidateCompletedTransactionsTabTitleTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.CompletedTransactionsTabClick();
		String completedTransactionsTitle = profilePage.ValidateCompletedTransactionsPageTitle();
		Assert.assertEquals(completedTransactionsTitle, properties.getProperty("completedTransactionPageTitle"));
		driver.close();
	}
	
	@Test
	public void ValidateCompletedTransactionsHeaderTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.CompletedTransactionsTabClick();
		profilePage.ValidateCompletedTransactionsHeaderName();
		driver.close();
	}
	
	@Test
	public void SeeMyBookingsLinkClickTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.CompletedTransactionsTabClick();
		profilePage.SeeMyBookingsLinkClick();
		driver.close();
	}
	
	@Test
	public void ArchivedPaymentsLinkClickTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.CompletedTransactionsTabClick();
		profilePage.ArchivedPaymentsLinkClick();
		driver.close();
	}
	
	@Test
	public void RecentPaymentsLinkClickTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.CompletedTransactionsTabClick();
		profilePage.RecentPaymentsLinkClick();
		driver.close();
	}

	@Test
	public void ValidateNotificationsTabTitleTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.NotificationsTabClick();
		String notificationsTitle = profilePage.ValidateNotificationsPageTitle();
		Assert.assertEquals(notificationsTitle, properties.getProperty("notificationsPageTitle"));
		driver.close();
	}
	
	@Test
	public void ValidateNotificationsHeaderNameTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.NotificationsTabClick();
		profilePage.ValidateNotificationsHeaderName();
		driver.close();
	}
	
	@Test
	public void ValidatePushNotificationsLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.NotificationsTabClick();
		profilePage.ValidatePushNotificationsLink();
		driver.close();
	}
	
	@Test
	public void PushNotificationsLinkClickTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.NotificationsTabClick();
		profilePage.PushNotificationsLinkClick();
		driver.close();
	}
	
	@Test
	public void ValidateEmailLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.NotificationsTabClick();
		profilePage.ValidateEmailLink();
		driver.close();
	}
	
	@Test
	public void EmailLinkClickTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.NotificationsTabClick();
		profilePage.EmailsLinkClick();
		driver.close();
	}
	
	@Test
	public void ValidateSMSLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.NotificationsTabClick();
		profilePage.ValidateSMSLink();
		driver.close();
	}
	
	@Test
	public void SMSLinkClickTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.NotificationsTabClick();
		profilePage.SMSLinkClick();
		driver.close();
	}
	
	@Test
	public void ValidatePasswordTabTitleTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.PasswordTabClick();
		String passwordTitle = profilePage.ValidatePasswordPageTitle();
		Assert.assertEquals(passwordTitle, properties.getProperty("passwordPageTitle"));
		driver.close();
	}
	
	@Test
	public void ValidateChangePasswordHeaderNameTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.PasswordTabClick();
		profilePage.ValidateChangePasswordHeaderName();
		driver.close();
	}
	
	@Test
	public void ChangePasswordTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.PasswordTabClick();
		profilePage.ChangeUserPassword();
		driver.close();
	}
////	
	@Test
	public void ValidateCloseMyAccountTabTitleTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.CloseMyAccountTabClick();
		String closeMyAccountTitle = profilePage.ValidateCloseMyAccountPageTitle();
		Assert.assertEquals(closeMyAccountTitle, properties.getProperty("closeMyAccountPageTitle"));
		driver.close();
	}
	
	@Test
	public void ValidateCloseYourAccountHeaderNameTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.CloseMyAccountTabClick();
		profilePage.ValidateCloseYourAccountHeaderName();
		driver.close();
	}
	
	@Test
	public void ValidateEditYourProfileLinkOnCloseAccountPageTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.CloseMyAccountTabClick();
		profilePage.ValidateEditYourProfileLinkOnCloseAccountPage();
		driver.close();
	}
	
	@Test
	public void ValidateContactUsLinkOnCloseAccountPageTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.CloseMyAccountTabClick();
		profilePage.ValidateContactUsLinkOnCloseAccountPage();
		driver.close();
	}
	
	@Test
	public void ValidateSecondContactUsLinkOnCloseAccountPageTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.CloseMyAccountTabClick();
		profilePage.ValidateSecondContactUsLinkOnCloseAccountPage();
		driver.close();
	}
	
	@Test
	public void ValidateEditYourNotificationsLinkOnCloseAccountPageTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.CloseMyAccountTabClick();
		profilePage.ValidateEditYourNotificationsLinkOnCloseAccountPage();
		driver.close();
	}
	
	@Test
	public void EditYourProfileClickOnCloseAccountPageTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.CloseMyAccountTabClick();
		profilePage.EditYourProfileClickOnCloseAccountPage();
		driver.close();
	}
	
	@Test
	public void FirstContactUsClickOnCloseAccountPageTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.CloseMyAccountTabClick();
		profilePage.FirstContactUsClickOnCloseAccountPage();
		driver.close();
	}
	
	@Test
	public void SecondContactUsClickOnCloseAccountPageTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.CloseMyAccountTabClick();
		profilePage.SecondContactUsClickOnCloseAccountPage();
		driver.close();
	}
	
	@Test
	public void EditYourNotificationsClickOnCloseAccountPageTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.CloseMyAccountTabClick();
		profilePage.EditYourNotificationsClickOnCloseAccountPage();
		driver.close();
	}
	
	@Test
	public void ValidateProfilePageTitleTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		
		String profilePageTitle = profilePage.ValidateProfilePageTitle();
		Assert.assertEquals(profilePageTitle, properties.getProperty("profilePageTitle"));
		driver.close();
	}

	@Test
	public void ValidateProfileInformationHeaderTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.ValidateProfileInformationHeader();
		driver.close();
	}
	
	@Test
	public void ValidatePersonalInformationLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.ValidatePersonalInformationLink();
		driver.close();
	}
	
	@Test
	public void ValidatePhotoLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.ValidatePhotoLink();
		driver.close();
	}
	
	@Test
	public void ValidatePreferencesLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.ValidatePreferencesLink();
		driver.close();
	}
	
	@Test
	public void ValidateVerificationLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.ValidateVerificationLink();
		driver.close();
	}
	
	@Test
	public void ValidateCarLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.ValidateCarLink();
		driver.close();
	}
	
	@Test
	public void ValidatePostalAddressLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.ValidatePostalAddressLink();
		driver.close();
	}
	
	@Test
	public void ValidateRatingsHeaderTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.ValidateRatingsHeader();		
		driver.close();
	}
	
	@Test
	public void ValidateRatingsReceivedLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.ValidateRatingsReceivedLink();
		driver.close();
	}
	
	@Test
	public void ValidateRatingsGivenLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.ValidateRatingsGivenLink();
		driver.close();
	}

	@Test
	public void ValidateAccountHeaderTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.ValidateAccountHeader();		
		driver.close();
	}
	
	@Test
	public void ValidateCompletedTransactionsLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.ValidateCompletedTransactionsLink();
		driver.close();
	}
	
	@Test
	public void ValidateNotificationsLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.ValidateNotificationsLink();
		driver.close();
	}
	
	@Test
	public void ValidatePasswordLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.ValidatePasswordLink();
		driver.close();
	}
	
	@Test
	public void ValidateCloseMyAccountLinkTest() throws InterruptedException
	{
		homePage = loginPage.Login(properties.getProperty("username"), properties.getProperty("password"));
		profilePage = homePage.NavigateToProfilePage();
		profilePage.ValidateCloseMyAccountLink();
		driver.close();
	}

}
