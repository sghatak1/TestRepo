package page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	By searchProduct = By.xpath(".//*[@id='twotabsearchtextbox']");
	
	By goSearchProduct = By.xpath(".//*[@id='nav-searchbar']/div[1]/input");
	
	public HomePage(WebDriver driver){
		
		this.driver = driver;
	}

	public void searchProductName(String strProductName){
		
		driver.findElement(searchProduct).sendKeys(strProductName);
	}
	
	public void clickGo(){
		
		driver.findElement(goSearchProduct).click();
	}
	
	public void HomePageProdSearch(String strProductName){
		
		this.searchProductName(strProductName);
		
		this.clickGo();
	}
}
