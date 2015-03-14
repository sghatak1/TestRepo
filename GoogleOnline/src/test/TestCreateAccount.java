package test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.AccountEntryPage;

public class TestCreateAccount {
	
	WebDriver driver;
	
	LoginPage objLoginPage;
	
	HomePage objHomePage;
	
	AccountEntryPage objAccountEntryPage;
	
	@BeforeTest
	 
    public void setup(){
 
        driver = new FirefoxDriver();
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        driver.get("https://www.google.co.uk/");
 
    }
	
	@Test(priority=0)
	
	public void test_Account_Creation(){
		
		objHomePage = new HomePage(driver);
		
		Assert.assertTrue(objHomePage.getHomePageTitle().contains("UK"));
		
		objHomePage.clickGmail();
		
		objLoginPage = new LoginPage(driver);
		
		objLoginPage.clickCreateAccount();
		
		objAccountEntryPage = new AccountEntryPage(driver);
		
		objAccountEntryPage.setFirstName("Koh");
		
		objAccountEntryPage.setLastName("Moto");
		
		//objAccountEntryPage.setUserName("");
		
		objAccountEntryPage.setPassword("test@2015");
		
		objAccountEntryPage.setPasswordAgain("test@2015");
		
		objAccountEntryPage.setbirthdayMonth();
		
		objAccountEntryPage.setbirthdayDay("1");
		
		objAccountEntryPage.setbirthdayYear("1980");
		
		objAccountEntryPage.setGender();
		
		objAccountEntryPage.setPhoneCountry();
		
		objAccountEntryPage.setPhoneNo(Keys.END + "2071234567");
		
		objAccountEntryPage.setRecoveryEmail("kohmoto2021@gmail.com");

		objAccountEntryPage.setSkipCaptcha();
		
		objAccountEntryPage.setLocation();
		
		objAccountEntryPage.setPolicy();
		
		objAccountEntryPage.btnNextStep();
		
		Assert.assertTrue(objAccountEntryPage.chkErrorMsgUserNameText().contains("You can't leave this empty."));
		
	}
	

}
