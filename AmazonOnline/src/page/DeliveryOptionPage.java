package page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class DeliveryOptionPage {

	WebDriver driver;
	
	By clickDeliveryContinue = By.xpath(".//*[@id='shippingOptionFormId']/div[1]/div[2]/div/span[1]/span/input");
	
	public DeliveryOptionPage(WebDriver driver){
		
		this.driver = driver;
	}
	
	public void DeliveryContinue(){
		
		driver.findElement(clickDeliveryContinue).click();
	}
}
