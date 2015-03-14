package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountEntryPage {

	WebDriver driver;
	
	By firstName = By.name("FirstName");
	
	By lastName = By.name("LastName");
	
	By userName = By.name("GmailAddress");
	
	By password = By.name("Passwd");
	
	By passwordAgain = By.name("PasswdAgain");
	
	By birthdayMonth = By.xpath(".//*[@id='BirthMonth']/div");
	
	By birthdayMonthOption = By.xpath(".//*[@id=':1']");
	
	By birthdayDay = By.name("BirthDay");
			
	By birthdayYear = By.name("BirthYear");		
	
	By gender = By.xpath(".//*[@id='Gender']/div");
	
	By genderOption = By.xpath(".//*[@id=':f']");
	
	By phoneNoCountry = By.xpath(".//*[@id='phone-form-element']/table/tbody/tr/th/div");
	
	By phoneNoCountryOption = By.xpath(".//*[@id=':du']");
	
	By phoneNo = By.xpath(".//*[@id='RecoveryPhoneNumber']");
	
	By recoveryEmailAddress = By.name("RecoveryEmailAddress");
	
	By captcha = By.name("SkipCaptcha");
	
	By location = By.xpath(".//*[@id='CountryCode']/div");
	
	By locationOption = By.xpath(".//*[@id=':79']");
	
	By policy = By.name("TermsOfService");
	
	By nextStep = By.xpath(".//*[@id='submitbutton']");

	By errormsgUserName = By.xpath(".//*[@id='errormsg_0_GmailAddress']");
	
	
	
    public AccountEntryPage(WebDriver driver){
    	 
        this.driver = driver;
 
    }
	
    public void setFirstName(String strFirstName){
    	 
        driver.findElement(firstName).sendKeys(strFirstName);
 
    }
    
    public void setLastName(String strLastName){
   	 
        driver.findElement(lastName).sendKeys(strLastName);
 
    }
    
    public void setUserName(String strUserName){
      	 
        driver.findElement(userName).sendKeys(strUserName);
 
    }
    
    public void setPassword(String strPassword){
     	 
        driver.findElement(password).sendKeys(strPassword);
 
    }
    
    public void setPasswordAgain(String strPasswordAgain){
    	 
        driver.findElement(passwordAgain).sendKeys(strPasswordAgain);
 
    }
    
    public void setbirthdayMonth(){
   	 
        driver.findElement(birthdayMonth).click();
        driver.findElement(birthdayMonthOption).click();
 
    }
    
    public void setbirthdayDay(String strbirthdayDay){
    	
    	driver.findElement(birthdayDay).sendKeys(strbirthdayDay);
    }
    
    public void setbirthdayYear(String strbirthdayYear){
    	
    	driver.findElement(birthdayYear).sendKeys(strbirthdayYear);
    }
    
    
    public void setGender(){
    	
    	driver.findElement(gender).click();
    	driver.findElement(genderOption).click();
    	
    }
    
    public void setPhoneCountry(){
    	
    	driver.findElement(phoneNoCountry).click();
    	driver.findElement(phoneNoCountryOption).click();
    	
    }
    
    //set the phone no
    public void setPhoneNo(String strPhoneNo){
    
    	driver.findElement(phoneNo).sendKeys(strPhoneNo);
  	    	
    }
    
    public void setRecoveryEmail(String strRecoveryEmail){
    	
    	driver.findElement(recoveryEmailAddress).sendKeys(strRecoveryEmail);
    }
    
    public void setSkipCaptcha(){
    	
    	driver.findElement(captcha).click();
    }
    
    public void setLocation(){
    	
    	driver.findElement(location).click();
    	driver.findElement(locationOption).click();
    }
    
    public void setPolicy(){
    	
    	driver.findElement(policy).click();
    }
    
    public void btnNextStep(){
    	
    	driver.findElement(nextStep).click();
    	
    }
    
    public String chkErrorMsgUserNameText(){
    	
    	return driver.findElement(errormsgUserName).getText();
    	
    }
}
