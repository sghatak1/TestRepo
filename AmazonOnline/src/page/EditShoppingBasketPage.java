package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class EditShoppingBasketPage {

	WebDriver driver;
	
	By editBasketQuantity = By.xpath(".//*[@id='a-autoid-2-announce']");
	
	By newBasketQuantity = By.xpath(".//*[@id='dropdown1_2']");
	
	By clickCheckout = By.xpath(".//*[@id='sc-buy-box-ptc-button']/span/input");
	
	public EditShoppingBasketPage(WebDriver driver){
		
		this.driver = driver;
	}
	
	public void selectBasketQuantity(){
		
		driver.findElement(editBasketQuantity).click();
	}
	
	public void selectNewBasketQuantity(){
		
		driver.findElement(newBasketQuantity).click();
	}
	
	public void clickProceedToCheckout(){
	
		driver.findElement(clickCheckout).click();
	}
	
	public void editShoppingBasket(){
		
		this.selectBasketQuantity();
		
		this.selectNewBasketQuantity();
		
		this.clickProceedToCheckout();
		
	}
	
}
