package com.blablacar.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.blablacar.qa.base.TestBase;
import com.gargoylesoftware.htmlunit.ThreadedRefreshHandler;

public class ProfilePage extends TestBase{

	@FindBy(xpath = "//li[contains(text(), 'Profile information')]")
	WebElement profileInformationHeader;

	@FindBy(xpath = "//a[contains(text(), 'Personal information')]")
	WebElement personalInformationLink;

	@FindBy(xpath = "//a[contains(text(), 'Photo')]")
	WebElement photoLink;

	@FindBy(xpath = "//a[@class= 'PictureUpload-remove']")
	WebElement removeThisPhoto;

	@FindBy(xpath = "//a[contains(text(), 'Preferences')]")
	WebElement preferencesLink;

	@FindBy(xpath = "//span[@data-hasqtip= '12']")
	WebElement quitTypeChattinessOption;

	@FindBy(xpath = "//span[@data-hasqtip= '13']")
	WebElement iTalkDependingUponMoodChattinessOption;

	@FindBy(xpath = "//span[@data-hasqtip= '14']")
	WebElement iLoveToChatChattinessOption;

	@FindBy(xpath = "//span[@data-hasqtip= '15']")
	WebElement noSmokingOption;

	@FindBy(xpath = "//span[@data-hasqtip= '16']")
	WebElement sometimesSmokingIsOkOption;

	@FindBy(xpath = "//span[@data-hasqtip= '17']")
	WebElement smokingOption;

	@FindBy(xpath = "//span[@data-hasqtip= '18']")
	WebElement noPetsOptions;

	@FindBy(xpath = "//span[@data-hasqtip= '19']")
	WebElement dependsUponPetOption;

	@FindBy(xpath = "//span[@data-hasqtip= '20']")
	WebElement petsAreAllowedOption;

	@FindBy(xpath = "//span[@data-hasqtip= '21']")
	WebElement noMusicOption;

	@FindBy(xpath = "//span[@data-hasqtip= '22']")
	WebElement fancyMusicOption;

	@FindBy(xpath = "//span[@data-hasqtip= '23']")
	WebElement musicIsAllowedOption;

	@FindBy(xpath = "//a[contains(text(), 'Verification')]")
	WebElement verificationLink;

	@FindBy(xpath = "//a[contains(text(), 'Postal address')]")
	WebElement postalAddressLink;

	@FindBy(xpath = "//a[contains(text(), 'Car')]")
	WebElement carLink;

	@FindBy(xpath = "//li[contains(text(), 'Ratings')]")
	WebElement ratingsHeader;

	@FindBy(xpath = "//a[contains(text(), 'Ratings received')]")
	WebElement ratingsReceivedLink;

	@FindBy(xpath = "//a[contains(text(), 'Ratings given')]")
	WebElement ratingsGivenLink;

	@FindBy(xpath = "//li[contains(text(), 'Account')]")
	WebElement accountHeader;

	@FindBy(xpath = "//a[contains(text(), 'Completed transactions')]")
	WebElement completedTransactionsLink;

	@FindBy(xpath = "//a[contains(text(), 'Notifications')]")
	WebElement notificationsLink;

	@FindBy(xpath = "//a[contains(text(), 'Password')]")
	WebElement passwordLink;

	@FindBy(xpath = "//a[contains(text(), 'Close my account')]")
	WebElement closeMyAccountLink;

	@FindBy(xpath = "//h1[contains(text(), 'Your personal information')]")
	WebElement personalInformationHeader;

	@FindBy(id = "profile_general_firstname")
	WebElement firstNameTextbox;

	@FindBy(id = "profile_general_lastname")
	WebElement lastNameTextbox;

	@FindBy(id = "profile_general_birthDate")
	WebElement birthdateTextbox;

	@FindBy(id = "profile_general_biography")
	WebElement biographyTextarea;

	@FindBy(xpath = "//a[contains(text(), 'your profile')]")
	WebElement yourProfileLinkOnPostalAddressTab;

	@FindBy(id = "postal_addressInput")
	WebElement postalAddressInputTextbox;

	@FindBy(id = "address_address")
	WebElement addressTextbox;

	@FindBy(id = "address_address_complement")
	WebElement complimentAddressTextbox;

	@FindBy(id = "address_zipcode")
	WebElement pincodeTextbox;

	@FindBy(id = "address_city")
	WebElement cityTextbox;

	@FindBy(xpath = "//a[contains(text(), 'See My Bookings')]")
	WebElement seeMyBookingsLink;

	@FindBy(xpath = "//a[contains(text(), 'Archived payments')]")
	WebElement archivedPaymentsLink;

	@FindBy(xpath = "//a[contains(text(), 'Recent payments')]")
	WebElement recentPaymentsLink;

	@FindBy(xpath = "//div[contains(text(), 'Push notifications')]")
	WebElement pushNotificationsLink;

	@FindBy(xpath = "//div[contains(text(), 'Email')]")
	WebElement emailLink;

	@FindBy(xpath = "//div[contains(text(), 'SMS')]")
	WebElement smsLink;

	@FindBy(id = "password_change_oldPassword")
	WebElement oldPasswordTextbox;

	@FindBy(id = "password_change_newPassword_first")
	WebElement newPasswordTextbox;

	@FindBy(id = "password_change_newPassword_second")
	WebElement confirmNewPasswordTextbox;

	@FindBy(xpath = "//a[contains(text(), 'edit your profile')]")
	WebElement editYourProfileLink;

	@FindBy(xpath = "//li[2]/a[contains(text(), 'contact us')]")
	WebElement firstContactUsLink;

	@FindBy(xpath = "//li[4]/a[contains(text(), 'contact us')]")
	WebElement secondContactUsLink;

	@FindBy(xpath = "//a[contains(text(), 'edit your notifications')]")
	WebElement editYourNotificationsLink;

	@FindBy(xpath = "//button[@class = 'btn-validation btn-large apply-btn-loader' and @type='submit']")
	WebElement saveButton;

	@FindBy(xpath = "//button[@class = 'btn-validation apply-btn-loader' and @type='submit']")
	WebElement changePasswordSaveButton;

	@FindBy(id = "vehicle_vehicle_license_plate_number")
	WebElement vehicleNumberPlateTextbox;

	@FindBy(xpath = "//button[@type='button' and @data-label='Continue']")
	WebElement continueButton;

	@FindBy(id = "vehicle_vehicle_registration_year")
	WebElement vehicleRegistrationYearTextbox;

	@FindBy(id = "vehicle_vehicle_submit")
	WebElement addCarSubmitButton;

	@FindBy(xpath = "//label[contains(text(), 'No thanks')]")
	WebElement noThanksButton;

	@FindBy(xpath = "//a[contains(text(), 'Add a car')]")
	WebElement addCarButton;

	@FindBy(xpath = "//a[contains(text(), 'Back')]")
	WebElement backButton;

	@FindBy(xpath = "//a[@data-show-modal='deleteCarModal']")
	WebElement deleteCarLink;
	
	public String carManufacturerLink = "//div[contains(text(), 'replace')]";
	public String carModelLink = "//div[contains(text(), 'replace')]";
	public String carColorLink = "//span[contains(text(), 'replace')]";
	public String carTypeLink = "//span[contains(text(), 'replace')]";

	public String deleteCarByIndexLink = "(//a[@data-show-modal='deleteCarModal'])[replace]";
	public String uploadPhotoLink = "(//span[contains(text(), 'Upload photo')])[replace]";
	public String carListPresentOnCarPage = "//section[@class='vehicle-container clearfix']";

	@FindBy(xpath = "//a[contains(text(), 'Confirm')]")
	WebElement confirmButton;
	
	public ProfilePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void UploadPhoto(String index)
	{
		List<WebElement> carList = driver.findElements(By.xpath(carListPresentOnCarPage));
		if(carList.size()>=1)
		{
			try
			{			
				Thread.sleep(3000);
				driver.findElement(By.xpath(uploadPhotoLink.replace("replace", index))).click();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void AddMultipleCarsUsingExcelData(String numberPlate, String manufacturer, String model,
			String type, String color, String registrationYear) throws InterruptedException
	{
		List<WebElement> carList = driver.findElements(By.xpath(carListPresentOnCarPage));
		if(carList.size()>=1)
		{
			try
			{
				Thread.sleep(3000);
				addCarButton.click();
				Thread.sleep(5000);
				vehicleNumberPlateTextbox.sendKeys(numberPlate);
				Thread.sleep(3000);
				continueButton.click();
				Thread.sleep(3000);		
				driver.findElement(By.xpath(carManufacturerLink.replace("replace", manufacturer))).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(carModelLink.replace("replace", model))).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(carTypeLink.replace("replace", type))).click();		
				Thread.sleep(3000);
				driver.findElement(By.xpath(carColorLink.replace("replace", color))).click();
				Thread.sleep(3000);	
				vehicleRegistrationYearTextbox.sendKeys(registrationYear);
				Thread.sleep(3000);	
				addCarSubmitButton.click();
				Thread.sleep(5000);
				
				System.out.println("Your new car added successfully !!");
			}
			catch (Exception e) {
				System.out.println("Add Car button is not available !! Please add atleast one car first !!");
				e.printStackTrace();
			}
		}
	}

	//delete one car by passing index of car from list of cars
	public void DeleteCarByIndex(String carIndex)
	{
		//we will get list of elements (findElements)
		List<WebElement> carList = driver.findElements(By.xpath(carListPresentOnCarPage));
		if(carList.size()>=2)
		{
			try
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath(deleteCarByIndexLink.replace("replace", carIndex))).click();
				Thread.sleep(3000);
				//driver.switchTo().alert().accept();
				confirmButton.click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//p[contains(text(), 'You car has been deleted successfully.')]"));
				Thread.sleep(5000);
			}
			catch (Exception e) {
				System.out.println("Pass valid index of car which you want to delete from list");
				e.printStackTrace();
			}
		}
	}

	//Delete one car present on webpage
	public void DeleteSingleCar() throws InterruptedException
	{
		List<WebElement> carList = driver.findElements(By.xpath(carListPresentOnCarPage));
		if(carList.size()==1)
		{
			try
			{
				Thread.sleep(2000);
				deleteCarLink.click();
				Thread.sleep(3000);
				//driver.switchTo().alert().accept();
				confirmButton.click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//p[contains(text(), 'You car has been deleted successfully.')]"));
				Thread.sleep(5000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void AddSingleCarInformation() throws InterruptedException
	{
		Thread.sleep(3000);
		vehicleNumberPlateTextbox.sendKeys("MH14CX0309");
		Thread.sleep(3000);
		continueButton.click();
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//ul/li/a/div[contains(text(), '                    HONDA                ')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul/li/a/div[contains(text(), '                    CIVIC                ')]")).click();
		Thread.sleep(3000);		
		driver.findElement(By.xpath("//span/input[@value = '_UE_BERLINE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span/input[@value = 'FFFFFF']")).click();
		Thread.sleep(3000);
		vehicleRegistrationYearTextbox.sendKeys("2017");
		Thread.sleep(3000);	
		addCarSubmitButton.click();
		Thread.sleep(5000);

		System.out.println("Your new car added successfully !!");
	}

	public void SaveEditedProfileInformation() throws InterruptedException
	{
		Thread.sleep(3000);
		firstNameTextbox.clear();
		Thread.sleep(1000);
		firstNameTextbox.sendKeys(properties.getProperty("firstName"));
		Thread.sleep(1000);
		lastNameTextbox.clear();
		Thread.sleep(1000);
		lastNameTextbox.sendKeys(properties.getProperty("lastName"));
		Thread.sleep(1000);
		birthdateTextbox.clear();
		Thread.sleep(1000);
		birthdateTextbox.sendKeys(properties.getProperty("dataOfBirth"));
		Thread.sleep(1000);
		biographyTextarea.clear();
		Thread.sleep(1000);
		biographyTextarea.sendKeys(properties.getProperty("biography"));
		Thread.sleep(2000);
		saveButton.click();
	}

	public String ValidatePersonalInformationPageTitle() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.getTitle();
	}

	public void ValidatePersonalInformationHeaderName()
	{
		boolean testResult = true;
		String msg = "";

		try
		{
			driver.findElement(By.xpath("//h1[contains(text(), 'Your personal information')]"));
		}
		catch(Exception ex)
		{
			testResult = false;
			msg = msg + "Personal Information header is not found after clicking on Personal Information tab of Profile page";
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void ProfilePhotoTabClick() throws InterruptedException
	{
		Thread.sleep(2000);
		photoLink.click();
	}

	public void RemoveProfilePhotoClick() throws InterruptedException
	{
		Thread.sleep(2000);
		removeThisPhoto.click();
		Thread.sleep(2000);
	}

	public void PreferencesTabClick() throws InterruptedException
	{
		Thread.sleep(2000);
		preferencesLink.click();
	}

	public String ValidatePreferencesPageTitle() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.getTitle();
	}

	public void ValidatePreferencesHeaderName() throws InterruptedException
	{
		boolean testResult = true;
		String msg = "";

		Thread.sleep(3000);

		try
		{
			driver.findElement(By.xpath("//h1[contains(text(), 'Your carpooling preferences')]"));
		}
		catch(Exception ex)
		{
			testResult = false;
			msg = msg + "Preferences header is not found after clicking on Preferences tab of Profile page";
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void SelectPreferences() throws InterruptedException
	{
		Thread.sleep(2000);
		quitTypeChattinessOption.click();
		Thread.sleep(2000);
		noSmokingOption.click();
		Thread.sleep(2000);
		noPetsOptions.click();
		Thread.sleep(2000);
		fancyMusicOption.click();
		Thread.sleep(2000);
		saveButton.click();
		Thread.sleep(5000);
	}

	public void VerificationTabClick() throws InterruptedException
	{
		Thread.sleep(2000);
		verificationLink.click();
	}

	public String ValidateVerificationPageTitle() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.getTitle();
	}

	public void ValidateVerificationHeaderName() throws InterruptedException
	{	
		boolean testResult = true;
		String msg = "";

		Thread.sleep(3000);

		try
		{
			driver.findElement(By.xpath("//h1[contains(text(), 'Verification')]"));
		}
		catch(Exception ex)
		{
			testResult = false;
			msg = msg + "Verification header is not found after clicking on Verification tab of Profile page";
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void PostalAddressTabClick() throws InterruptedException
	{
		Thread.sleep(2000);
		postalAddressLink.click();
	}

	public String ValidatePostalAddressPageTitle() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.getTitle();
	}

	public void YourProfileClickOnPostalAddressTab() throws InterruptedException
	{
		Thread.sleep(2000);
		yourProfileLinkOnPostalAddressTab.click();
	}

	public void SaveUserName() throws InterruptedException
	{
		Thread.sleep(3000);
		firstNameTextbox.clear();
		Thread.sleep(1000);
		firstNameTextbox.sendKeys(properties.getProperty("firstName"));
		Thread.sleep(1000);
		lastNameTextbox.clear();
		Thread.sleep(1000);
		lastNameTextbox.sendKeys(properties.getProperty("lastName"));
		Thread.sleep(2000);
		saveButton.click();
	}

	public void SavePostalAddress() throws InterruptedException
	{
		Thread.sleep(3000);
		postalAddressInputTextbox.clear();
		postalAddressInputTextbox.sendKeys(properties.getProperty("streetAddress"));
		Thread.sleep(2000);
		addressTextbox.clear();
		addressTextbox.sendKeys(properties.getProperty("address"));
		Thread.sleep(2000);
		complimentAddressTextbox.clear();
		complimentAddressTextbox.sendKeys(properties.getProperty("complimentryAddress"));
		Thread.sleep(2000);
		pincodeTextbox.clear();
		pincodeTextbox.sendKeys(properties.getProperty("pincode"));
		Thread.sleep(2000);
		cityTextbox.clear();
		cityTextbox.sendKeys(properties.getProperty("city"));
		Thread.sleep(3000);
		saveButton.click();
	}

	public void ValidatePostalAddressHeaderName() throws InterruptedException
	{	
		boolean testResult = true;
		String msg = "";

		Thread.sleep(3000);

		try
		{
			driver.findElement(By.xpath("//h1[contains(text(), 'Your postal address')]"));
		}
		catch(Exception ex)
		{
			testResult = false;
			msg = msg + "Your postal address header is not found after clicking on Postal Address tab of Profile page";
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void RatingsReceivedTabClick() throws InterruptedException
	{
		Thread.sleep(2000);
		ratingsReceivedLink.click();
	}

	public String ValidateRatingsReceivedPageTitle() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.getTitle();
	}

	public void RatingsGivenTabClick() throws InterruptedException
	{
		Thread.sleep(2000);
		ratingsGivenLink.click();
	}

	public String ValidateRatingsGivenPageTitle() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.getTitle();
	}

	public void CompletedTransactionsTabClick() throws InterruptedException
	{
		Thread.sleep(2000);
		completedTransactionsLink.click();
	}

	public void ValidateCompletedTransactionsHeaderName() throws InterruptedException
	{
		boolean testResult = true;
		String msg = "";

		Thread.sleep(3000);

		try
		{
			driver.findElement(By.xpath("//h1[contains(text(), 'Completed transactions')]"));
		}
		catch(Exception ex)
		{
			testResult = false;
			msg = msg + "Your Completed Transactions header is not found after clicking on Completed Transcations tab of Profile page";
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void SeeMyBookingsLinkClick() throws InterruptedException
	{
		Thread.sleep(2000);
		seeMyBookingsLink.click();
		Thread.sleep(3000);
	}

	public void RecentPaymentsLinkClick() throws InterruptedException
	{
		Thread.sleep(2000);
		recentPaymentsLink.click();
		Thread.sleep(3000);
	}

	public void ArchivedPaymentsLinkClick() throws InterruptedException
	{
		Thread.sleep(2000);
		archivedPaymentsLink.click();
		Thread.sleep(3000);
	}

	public String ValidateCompletedTransactionsPageTitle() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.getTitle();
	}

	public void NotificationsTabClick() throws InterruptedException
	{
		Thread.sleep(2000);
		notificationsLink.click();
	}

	public String ValidateNotificationsPageTitle() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.getTitle();
	}

	public void ValidateNotificationsHeaderName() throws InterruptedException
	{
		boolean testResult = true;
		String msg = "";

		Thread.sleep(3000);

		try
		{
			driver.findElement(By.xpath("//h1[contains(text(), 'Notifications & Communication')]"));
		}
		catch(Exception ex)
		{
			testResult = false;
			msg = msg + "Notifications & Communication header is not found after clicking on Notifications tab of Profile page";
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void ValidatePushNotificationsLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = "";

		Thread.sleep(3000);

		try
		{
			driver.findElement(By.xpath("//div[contains(text(), 'Push notifications')]"));
		}
		catch(Exception ex)
		{
			testResult = false;
			msg = msg + "Push Notifications link is not present on Notification page";
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void PushNotificationsLinkClick() throws InterruptedException
	{
		Thread.sleep(2000);
		pushNotificationsLink.click();
		Thread.sleep(3000);
	}

	public void ValidateEmailLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = "";

		Thread.sleep(3000);

		try
		{
			driver.findElement(By.xpath("//div[contains(text(), 'Email')]"));
		}
		catch(Exception ex)
		{
			testResult = false;
			msg = msg + "Email link is not present on Notification page";
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void EmailsLinkClick() throws InterruptedException
	{
		Thread.sleep(2000);
		emailLink.click();
		Thread.sleep(3000);
	}

	public void ValidateSMSLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = "";

		Thread.sleep(3000);

		try
		{
			driver.findElement(By.xpath("//div[contains(text(), 'SMS')]"));
		}
		catch(Exception ex)
		{
			testResult = false;
			msg = msg + "SMS link is not present on Notification page";
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void SMSLinkClick() throws InterruptedException
	{
		Thread.sleep(2000);
		smsLink.click();
		Thread.sleep(3000);
	}

	public void PasswordTabClick() throws InterruptedException
	{
		Thread.sleep(2000);
		passwordLink.click();
	}

	public void ValidateChangePasswordHeaderName() throws InterruptedException
	{
		boolean testResult = true;
		String msg = "";

		Thread.sleep(3000);

		try
		{
			driver.findElement(By.xpath("//h1[contains(text(), 'Change password')]"));
		}
		catch(Exception ex)
		{
			testResult = false;
			msg = msg + "Change Password header is not present on Password page";
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void ChangeUserPassword() throws InterruptedException
	{
		Thread.sleep(2000);
		oldPasswordTextbox.sendKeys(properties.getProperty("password"));
		Thread.sleep(2000);
		newPasswordTextbox.sendKeys(properties.getProperty("newPassword"));
		Thread.sleep(2000);
		confirmNewPasswordTextbox.sendKeys(properties.getProperty("newPassword"));
		Thread.sleep(2000);
		changePasswordSaveButton.click();
		Thread.sleep(5000);
	}

	public String ValidatePasswordPageTitle() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.getTitle();
	}

	public void CloseMyAccountTabClick() throws InterruptedException
	{
		Thread.sleep(2000);
		closeMyAccountLink.click();
	}

	public String ValidateCloseMyAccountPageTitle() throws InterruptedException
	{
		Thread.sleep(2000);
		return driver.getTitle();
	}

	public void ValidateCloseYourAccountHeaderName() throws InterruptedException
	{
		boolean testResult = true;
		String msg = "";

		Thread.sleep(3000);

		try
		{
			driver.findElement(By.xpath("//h1[contains(text(), 'Close your account')]"));
		}
		catch(Exception ex)
		{
			testResult = false;
			msg = msg + "Close your account header is not present on Password page";
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void ValidateEditYourProfileLinkOnCloseAccountPage() throws InterruptedException
	{
		boolean testResult = true;
		String msg = "";

		Thread.sleep(3000);

		try
		{
			driver.findElement(By.xpath("//a[contains(text(), 'edit your profile')]"));
		}
		catch(Exception ex)
		{
			testResult = false;
			msg = msg + "Edit your profile link is not present on Close Account page";
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void EditYourProfileClickOnCloseAccountPage() throws InterruptedException
	{
		Thread.sleep(2000);
		editYourProfileLink.click();
		Thread.sleep(4000);
	}

	public void ValidateContactUsLinkOnCloseAccountPage() throws InterruptedException
	{
		boolean testResult = true;
		String msg = "";

		Thread.sleep(3000);

		try
		{
			driver.findElement(By.xpath("//li[2]/a[contains(text(), 'contact us')]"));
		}
		catch(Exception ex)
		{
			testResult = false;
			msg = msg + "Contact us link is not present on Close Account page";
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void FirstContactUsClickOnCloseAccountPage() throws InterruptedException
	{
		Thread.sleep(2000);
		firstContactUsLink.click();
		Thread.sleep(4000);
	}

	public void ValidateSecondContactUsLinkOnCloseAccountPage() throws InterruptedException
	{
		boolean testResult = true;
		String msg = "";

		Thread.sleep(3000);

		try
		{
			driver.findElement(By.xpath("//li[4]/a[contains(text(), 'contact us')]"));
		}
		catch(Exception ex)
		{
			testResult = false;
			msg = msg + "Second Contact us link is not present on Close Account page";
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void SecondContactUsClickOnCloseAccountPage() throws InterruptedException
	{
		Thread.sleep(2000);
		secondContactUsLink.click();
		Thread.sleep(4000);
	}


	public void ValidateEditYourNotificationsLinkOnCloseAccountPage() throws InterruptedException
	{
		boolean testResult = true;
		String msg = "";

		Thread.sleep(3000);

		try
		{
			driver.findElement(By.xpath("//a[contains(text(), 'edit your notifications')]"));
		}
		catch(Exception ex)
		{
			testResult = false;
			msg = msg + "Edit your notifications link is not present on Close Account page";
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void EditYourNotificationsClickOnCloseAccountPage() throws InterruptedException
	{
		Thread.sleep(2000);
		editYourNotificationsLink.click();
		Thread.sleep(4000);
	}


	public void CarTabClick() throws InterruptedException
	{
		Thread.sleep(2000);
		carLink.click();
	}

	public void ValidatePhotoHeaderName() throws InterruptedException
	{
		boolean testResult = true;
		String msg = "";

		Thread.sleep(3000);

		try
		{
			driver.findElement(By.xpath("//h1[contains(text(), 'Your profile photo')]"));
		}
		catch(Exception ex)
		{
			testResult = false;
			msg = msg + "Your profile photo header is not found after clicking on Photo tab of Profile page";
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public String ValidateProfilePageTitle()
	{
		return driver.getTitle();
	}

	public void ValidateRatingsHeader() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";

		Thread.sleep(2000);

		try
		{
			driver.findElement(By.xpath("//li[contains(text(), 'Ratings')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Ratings header is missing from profile page";
			testResult = false;
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void ValidateRatingsReceivedLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";

		Thread.sleep(2000);

		try
		{
			driver.findElement(By.xpath("//a[contains(text(), 'Ratings received')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Ratings received link is missing from profile page";
			testResult = false;
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void ValidateRatingsGivenLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";

		Thread.sleep(2000);

		try
		{
			driver.findElement(By.xpath("//a[contains(text(), 'Ratings given')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Ratings given link is missing from profile page";
			testResult = false;
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void ValidatePersonalInformationLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";

		Thread.sleep(2000);

		try
		{
			driver.findElement(By.xpath("//a[contains(text(), 'Personal information')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Personal Information link is missing from profile page";
			testResult = false;
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void ValidatePhotoLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";

		Thread.sleep(2000);

		try
		{
			driver.findElement(By.xpath("//a[contains(text(), 'Photo')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Photo link is missing from profile page";
			testResult = false;
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void ValidatePreferencesLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";

		Thread.sleep(2000);

		try
		{
			driver.findElement(By.xpath("//a[contains(text(), 'Preferences')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Preferences link is missing from profile page";
			testResult = false;
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void ValidateVerificationLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";

		Thread.sleep(2000);

		try
		{
			driver.findElement(By.xpath("//a[contains(text(), 'Verification')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Verification link is missing from profile page";
			testResult = false;
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void ValidateCarLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";

		Thread.sleep(2000);

		try
		{
			driver.findElement(By.xpath("//a[contains(text(), 'Car')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Car link is missing from profile page";
			testResult = false;
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void ValidatePostalAddressLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";

		Thread.sleep(2000);

		try
		{
			driver.findElement(By.xpath("//a[contains(text(), 'Postal address')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Postal Address link is missing from profile page";
			testResult = false;
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void ValidateAccountHeader() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";

		Thread.sleep(2000);

		try
		{
			driver.findElement(By.xpath("//li[contains(text(), 'Account')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Account header is missing from profile page";
			testResult = false;
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void ValidateCompletedTransactionsLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";

		Thread.sleep(2000);

		try
		{
			driver.findElement(By.xpath("//a[contains(text(), 'Completed transactions')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Completed transactions link is missing from profile page";
			testResult = false;
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void ValidateNotificationsLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";

		Thread.sleep(2000);

		try
		{
			driver.findElement(By.xpath("//a[contains(text(), 'Notifications')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Notificationss link is missing from profile page";
			testResult = false;
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void ValidatePasswordLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";

		Thread.sleep(2000);

		try
		{
			driver.findElement(By.xpath("//a[contains(text(), 'Password')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Password link is missing from profile page";
			testResult = false;
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void ValidateCloseMyAccountLink() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";

		Thread.sleep(2000);

		try
		{
			driver.findElement(By.xpath("//a[contains(text(), 'Close my account')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Close my account link is missing from profile page";
			testResult = false;
		}

		Assert.assertEquals(testResult, true, msg);
	}

	public void ValidateProfileInformationHeader() throws InterruptedException
	{
		boolean testResult = true;
		String msg = " ";

		Thread.sleep(2000);

		try
		{
			driver.findElement(By.xpath("//li[contains(text(), 'Profile information')]"));
		}
		catch(Exception ex)
		{
			msg = msg + "Profile information header is missing from profile page";
			testResult = false;
		}

		Assert.assertEquals(testResult, true, msg);
	}
}
