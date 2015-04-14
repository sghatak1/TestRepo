package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OrderPage {

	WebDriver driver;

	By prdSizeName = By.xpath(".//*[@id='firstDimension']");
	
	By prdColourName = By.xpath(".//*[@id='asinRedirect']");
	
	By prdQuanitity = By.xpath(".//*[@id='quantity']");
	
	By prdAddToBasket = By.xpath(".//*[@id='bb_atc_button']");
	
	
	public OrderPage(WebDriver driver){
		
		this.driver = driver;
	}

	public void selectProductSize(String strProductSize){
	
		Select SizeName = new Select(driver.findElement(prdSizeName));
		SizeName.selectByVisibleText(strProductSize);
		
	}	
	
	public void selectProductColour(String strProductColour){
		
		Select ColourName = new Select(driver.findElement(prdColourName));
		ColourName.selectByVisibleText(strProductColour);
	}
	
	public void selectProductQuantity(String strProdQty){
		
		Select Quantity = new Select(driver.findElement(prdQuanitity));
		Quantity.selectByVisibleText(strProdQty);
		
	}
	
	public void clickAddToBasket(){
		
		driver.findElement(prdAddToBasket).click();
		
	}
	
	public void OrderPageSelection(String strProductSize, String strProductColour, String strProdQty){
		
		this.selectProductSize(strProductSize);
		
		this.selectProductColour(strProductColour);
		
		this.selectProductQuantity(strProdQty);
		
		this.clickAddToBasket();
	}
	
}


