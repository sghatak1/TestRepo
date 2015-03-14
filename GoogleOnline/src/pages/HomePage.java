package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
	
	By titleText =By.xpath(".//*[@id='hplogo']/div");
	
	By gmailLink = By.xpath(".//*[@id='gbw']/div/div/div[1]/div[2]/a");
	
    
	public HomePage(WebDriver driver){
   	 
        this.driver = driver;
 
    }
	
	public String getHomePageTitle(){
		 
	     return driver.findElement(titleText).getText();
	 
	}
	
    public void clickGmail(){
    	 
        driver.findElement(gmailLink).click();

    }
    
}
