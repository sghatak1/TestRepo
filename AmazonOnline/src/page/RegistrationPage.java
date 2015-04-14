package page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	
	WebDriver driver;
	
	By nameText = By.xpath(".//*[@id='ap_customer_name']");
	
	By emailCheckText = By.xpath(".//*[@id='ap_email_check']");
	
	By passwordText = By.xpath(".//*[@id='ap_password']");
	
	By passwordCheckText = By.xpath(".//*[@id='ap_password_check']");
	
	By clickCreateAccount = By.xpath(".//*[@id='continue-input']");
	
	
	public RegistrationPage(WebDriver driver){
		
		this.driver = driver;
	}
			

	public void customerName(String strCustName){
		
		driver.findElement(nameText).sendKeys(strCustName);
	}
	
	public void customerEmail(String strCustEmail){
		
		driver.findElement(emailCheckText).sendKeys(strCustEmail);
	}
	
	public void customerPassword(String strCustPwd){
		
		driver.findElement(passwordText).sendKeys(strCustPwd);
	}
	
	public void customerPasswordCheck(String strCustPwdCheck){
		
		driver.findElement(passwordCheckText).sendKeys(strCustPwdCheck);
	}
	
	public void createCustomerAccound(){
		
		driver.findElement(clickCreateAccount).click();
	}
	
	public void CustomerRegistration(String strCustName, String strCustEmail, String strCustPwd, String strCustPwdCheck){
		
		this.customerName(strCustName);
		
		this.customerEmail(strCustEmail);
		
		this.customerPassword(strCustPwdCheck);
		
		this.customerPasswordCheck(strCustPwdCheck);
		
		this.createCustomerAccound();
		
	}
}
