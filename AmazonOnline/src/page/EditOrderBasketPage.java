package page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class EditOrderBasketPage {

	WebDriver driver;
	
	By editOrderBasket = By.xpath(".//*[@id='a-autoid-0-announce']");
	
	
	public EditOrderBasketPage(WebDriver driver){
		
		this.driver = driver;
	}
	
	public void clickEditOrderBasket(){
		
		driver.findElement(editOrderBasket).click();
	}	
	
	public void editOrderBasket(){
		
		this.clickEditOrderBasket();
	}
}
