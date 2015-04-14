package page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class SignInPage {

	WebDriver driver;
	
	By selectCustomerType = By.xpath(".//*[@id='ap_signin_create_radio']");
	
	By emailText = By.xpath(".//*[@id='ap_email']");
	
	By clickSignUp = By.xpath(".//*[@id='signInSubmit-input']");
	
	public SignInPage(WebDriver driver){
		
		this.driver = driver;
	}
	
	public void selectCustomer(){
		
		driver.findElement(selectCustomerType).click();
	}

	public void customerEmail(String strCustEmail){
		
		driver.findElement(emailText).sendKeys(strCustEmail);
	}

	public void clickSingUp(){
		
		driver.findElement(clickSignUp).click();
	}

	public void SingInPageDetails(String strCustEmail){
		
		this.selectCustomer();
		
		this.customerEmail(strCustEmail);
		
		this.clickSingUp();
		
	}
}


