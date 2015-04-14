package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class AddressDetailPage {

	WebDriver driver;
	
	By addFullnameText = By.xpath(".//*[@id='enterAddressFullName']");
	
	By addLine1Text = By.xpath(".//*[@id='enterAddressAddressLine1']");
	
	By addLine2Text = By.xpath(".//*[@id='enterAddressAddressLine2']");
	
	By addCityText = By.xpath(".//*[@id='enterAddressCity']");
	
	By addRegionStateText = By.xpath(".//*[@id='enterAddressStateOrRegion']");
	
	By addPostalCodeText = By.xpath(".//*[@id='enterAddressPostalCode']");
	
	By addCountry = By.xpath(".//*[@id='enterAddressCountryCode']");
	
	By addPhoneText = By.xpath(".//*[@id='enterAddressPhoneNumber']");
	
	By clickAddCoutinue = By.xpath(".//*[@id='newShippingAddressFormFromIdentity']/div[1]/div/form/div[7]/span/span/input");
	
	public AddressDetailPage(WebDriver driver){
		
		this.driver = driver;
	}
	
	public void custFullName(String strFullname){
		
		driver.findElement(addFullnameText).sendKeys(strFullname);
	}
	
	public void custAddLine1(String strAddLine1){
		
		driver.findElement(addLine1Text).sendKeys(strAddLine1);
	}
	
	public void custAddLine2(String strAddLine2){
		
		driver.findElement(addLine2Text).sendKeys(strAddLine2);
	}
	
	public void custCity(String strCity){
		
		driver.findElement(addCityText).sendKeys(strCity);
	}

	public void custRegionState(String strRegionState){
		
		driver.findElement(addRegionStateText).sendKeys(strRegionState);
	}

	public void custPostalCode(String strPostalCode){
		
		driver.findElement(addPostalCodeText).sendKeys(strPostalCode);
	}
	
	public void custCountry(String strCountry){
		
		Select Country = new Select(driver.findElement(addCountry));
		Country.selectByVisibleText(strCountry);
	}
	
	public void custPhone(String strPhone){
		
		driver.findElement(addPhoneText).sendKeys(strPhone);
	}
	
	public void custAddCoutinue(){
		
		driver.findElement(clickAddCoutinue).click();
	}
	
	
	public void customer_address_details(String strFullname, String strAddLine1, String strAddLine2, String strCity, String strRegionState, String strPostalCode, String strCountry, String strPhone){
		
		this.custFullName(strFullname);
		
		this.custAddLine1(strAddLine1);
		
		this.custAddLine2(strAddLine2);
		
		this.custCity(strCity);
		
		this.custRegionState(null);
		
		this.custCountry(strCountry);
		
		this.custPostalCode(strPostalCode);
		
		this.custPhone(strPhone);
		
		this.custAddCoutinue();
		
	}
}
