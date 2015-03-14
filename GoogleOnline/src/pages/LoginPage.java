package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	By createAccount = By.xpath(".//*[@id='link-signup']");
	
	public LoginPage(WebDriver driver){
	   	 
        this.driver = driver;
 
    }
	
    public void clickCreateAccount(){
    	 
        driver.findElement(createAccount).click();

    }

	
}
