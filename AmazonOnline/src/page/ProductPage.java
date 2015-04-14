package page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class ProductPage {
	
	WebDriver driver;
	
	By selectProduct = By.xpath(".//*[@id='result_2']/div/div/div/div[2]/div[1]/a/h2");
	
	public ProductPage(WebDriver driver){
		
		this.driver = driver;
	}

	
	public void clickProduct(){
		
		driver.findElement(selectProduct).click();
	}

}
