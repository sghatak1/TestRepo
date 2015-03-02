package test.java.config;

import java.util.concurrent.TimeUnit;

import static test.java.executionEngine.DriverScript.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import test.java.executionEngine.DriverScript;
import test.java.utility.Log;

public class ActionKeywords {
	public static WebDriver driver;
	 
	public static void openBrowser(String object, String data){
		try{
			Log.info("Opening Browser");
			driver=new FirefoxDriver();	
		}catch(Exception e){
			Log.info("Not able to open the Browser:" + e.getMessage());
			DriverScript.bResult = false;
		}	
	}
	 
	public static void navigate(String object, String data){	
		try{
			Log.info("Navigating to URL");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(Constants.URL);	
		}catch(Exception e){
			Log.info("Not able to navigate:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}
	 
	public static void input_Search(String object, String data){
		try{
			Log.info("Input Search Value in the Search field" + object);
			driver.findElement(By.id(OR.getProperty(object))).sendKeys(data);		
		}catch(Exception e){
			Log.info("Not able to Search:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}
	 
	public static void click_Go(String object, String data){
		try{
			Log.info("Click on Go button" + object);
			driver.findElement(By.xpath(OR.getProperty(object))).click();
		}catch(Exception e){
			Log.info("Not able to Click:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}
	 
	public static void waitFor(String object, String data) throws Exception{
		try{
			Log.info("Wait for 5 seconds");
			Thread.sleep(5000);
		}catch(Exception e){
			Log.info("Not able to Wait:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}
	
	public static void click_3rdResult(String object, String data){
		try{
		    Log.info("Select the 3rd result and click on the link" + object);
		    driver.findElement(By.xpath(OR.getProperty(object))).click();	
		}catch(Exception e){
			Log.info("Not able to Select:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}
	
	public static void waitFor1(String object, String data) throws Exception{
		try{
			Log.info("Wait for 5 seconds");
			Thread.sleep(5000);
		}catch(Exception e){
			Log.info("Not able to Wait:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}
	
	public static void dropdown_SizeName(String object, String data){
		try{
			Log.info("Select Size Name from dropdown list" + object);
			Select oSizeName = new Select(driver.findElement(By.id(OR.getProperty(object))));
			oSizeName.selectByVisibleText(data);	
		}catch(Exception e){
			Log.info("Not able to Select Size:" + e.getMessage());
			DriverScript.bResult = false;
		}		
	}
	
	public static void dropdown_ColourName(String object, String data){
		try{
			Log.info("Select Colour Name from dropdown list" + object);
			Select oColourName = new Select(driver.findElement(By.id(OR.getProperty(object))));
			oColourName.selectByVisibleText(data);
		}catch(Exception e){
			Log.info("Not able to Select Colour:" + e.getMessage());
			DriverScript.bResult = false;
		}		
	}
		
	
	public static void waitFor2(String object, String data) throws Exception{
		try{
			Log.info("Wait for 5 seconds");
			Thread.sleep(5000);
		}catch(Exception e){
			Log.info("Not able to Wait:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}
	
	public static void dropdown_Quantity(String object, String data){
		try{
			Log.info("Select Quantity from the dropdown list" + object);
			Select oQuantity = new Select(driver.findElement(By.id(OR.getProperty(object))));
			oQuantity.selectByVisibleText(data);		
		}catch(Exception e){
			Log.info("Not able to Select Quantity:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}
	
	public static void click_AddToBasket(String object, String data){
		try{
			Log.info("Click on Add to Basket" + object);
			driver.findElement(By.xpath(OR.getProperty(object))).click();
		}catch(Exception e){
			Log.info("Not able to Click:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}
	
	public static void waitFor3(String object, String data) throws Exception{
		try{
			Log.info("Wait for 5 seconds");
			Thread.sleep(5000);
		}catch(Exception e){
			Log.info("Not able to Wait:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}
	
	public static void click_EditYourBasket(String object, String data){
		try{
			Log.info("Click on Edit Your Basket" + object);
			driver.findElement(By.xpath(OR.getProperty(object))).click();
		}catch(Exception e){
			Log.info("Not able to Click:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}
	
	public static void waitFor4(String object, String data) throws Exception{
		try{
			Log.info("Wait for 5 seconds");
			Thread.sleep(5000);
		}catch(Exception e){
			Log.info("Not able to Wait:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	
	public static void dropdown_EditQuantity(String object, String data){
		try{
			Log.info("Select Required Quantity from the dropdown list" + object);
			Select oEditQuantity = new Select(driver.findElement(By.id(OR.getProperty(object))));
			oEditQuantity.selectByVisibleText(data);		
		}catch(Exception e){
			Log.info("Not able to Select Quantity:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	
	public static void click_ProceedCheckout(String object, String data){
		try{
			Log.info("Click on Proceed to Checkout" + object);
			driver.findElement(By.xpath(OR.getProperty(object))).click();	
		}catch(Exception e){
			Log.info("Not able to Click:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	
	public static void waitFor5(String object, String data) throws Exception{
		try{
			Log.info("Wait for 5 seconds");
			Thread.sleep(5000);
		}catch(Exception e){
			Log.info("Not able to Wait:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	
	public static void radiobtn_NewCustomer(String object, String data){
		try{
			Log.info("Select radio button I am a new customer" + object);
			driver.findElement(By.id(OR.getProperty(object))).click();
		}catch(Exception e){
			Log.info("Not able to Select -I am a new customer-:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	
	public static void input_emaiid(String object, String data){
		try{
			Log.info("Input email id address" + object);
			driver.findElement(By.id(OR.getProperty(object))).sendKeys(data);	
		}catch(Exception e){
			Log.info("Not able to Enter Emailid" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	
	public static void click_Signin(String object, String data){
		try{
			Log.info("Click on sign in using our secure server" + object);
			driver.findElement(By.xpath(OR.getProperty(object))).click();
		}catch(Exception e){
			Log.info("Not able to Click -sign in using our secure server-:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	
	public static void waitFor6(String object, String data) throws Exception{
		try{
			Log.info("Wait for 5 seconds");
			Thread.sleep(5000);
		}catch(Exception e){
			Log.info("Not able to Wait:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}		
	
	public static void input_Name(String object, String data){
		try{
			Log.info("Input name");
			driver.findElement(By.id(OR.getProperty(object))).sendKeys(data);	
		}catch(Exception e){
			Log.info("Not able to Enter UserName:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	
	public static void input_TypeEmailidAgain(String object, String data){
		try{
			Log.info("Input email id again" + object);
			driver.findElement(By.id(OR.getProperty(object))).sendKeys(data);	
		}catch(Exception e){
			Log.info("Not able to Enter Emailid:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	
	public static void input_Password(String object, String data){
		try{
			Log.info("Input password" + object);
			driver.findElement(By.id(OR.getProperty(object))).sendKeys(data);
		}catch(Exception e){
			Log.info("Not able to Enter Password:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	
	public static void input_TypePasswordAgain(String object, String data){
		try{
			Log.info("Input password again" + object);
			driver.findElement(By.id(OR.getProperty(object))).sendKeys(data);
		}catch(Exception e){
			Log.info("Not able to Re-Enter Password:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	
	public static void click_CreateAccount(String object, String data){
		try{
		Log.info("Click on Create Account" + object);
		driver.findElement(By.xpath(OR.getProperty(object))).click();
		}catch(Exception e){
			Log.info("Not able to Click:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	

	public static void waitFor7(String object, String data) throws Exception{
		try{
			Log.info("Wait for 5 seconds");
			Thread.sleep(5000);
		}catch(Exception e){
			Log.info("Not able to Wait:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	
	public static void input_Fname(String object, String data){
		try{
			Log.info("Input Full Name" + object);
			driver.findElement(By.id(OR.getProperty(object))).sendKeys(data);		
		}catch(Exception e){
			Log.info("Not able to Enter FName:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	
	public static void input_AddLine1(String object, String data){
		try{
			Log.info("Input Address Line1" + object);
			driver.findElement(By.id(OR.getProperty(object))).sendKeys(data);
		}catch(Exception e){
			Log.info("Not able to Enter AddressLine1:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	
	public static void input_TownCity(String object, String data){
		try{
			Log.info("Input Town/City" + object);
			driver.findElement(By.id(OR.getProperty(object))).sendKeys(data);
		}catch(Exception e){
			Log.info("Not able to Enter TownCity:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	
	public static void input_Country(String object, String data){
		try{
			Log.info("Input RegionState" + object);
			driver.findElement(By.id(OR.getProperty(object))).sendKeys(data);
		}catch(Exception e){
			Log.info("Not able to Enter RegionState:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	
	public static void input_Postalcode(String object, String data){
		try{
		Log.info("Input Postalcode" + object);
		driver.findElement(By.id(OR.getProperty(object))).sendKeys(data);
		}catch(Exception e){
			Log.info("Not able to Enter Postalcode:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	
	public static void dropdown_Country(String object, String data){
		try{
			Log.info("Select Country from dropdown" + object);
			Select oCountry = new Select(driver.findElement(By.id(OR.getProperty(object))));
			oCountry.selectByVisibleText(data);	
		}catch(Exception e){
			Log.info("Not able to Select Country:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	
	public static void input_Phoneno(String object, String data){
		try{
			Log.info("Input Phone Number" + object);
			driver.findElement(By.id(OR.getProperty(object))).sendKeys(data);
		}catch(Exception e){
			Log.info("Not able to Enter PhoneNo:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	
	public static void click_Continue1(String object, String data){
		try{
			Log.info("click on Continue1" + object);
			driver.findElement(By.xpath(OR.getProperty(object))).click();
		}catch(Exception e){
			Log.info("Not able to Click:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	
	public static void waitFor8(String object, String data) throws Exception{
		try{
			Log.info("Wait for 5 seconds");
			Thread.sleep(5000);
		}catch(Exception e){
			Log.info("Not able to Wait:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
		
	public static void click_Continue2(String object, String data){
		try{
			Log.info("click on Continue2" + object);
			driver.findElement(By.xpath(OR.getProperty(object))).click();
		}catch(Exception e){
			Log.info("Not able to Click:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	
	

	public static void closeBrowser(String object, String data){
		try{
			Log.info("Closing the browser");
			driver.quit();
		}catch(Exception e){
			Log.info("Not able to Close browser:" + e.getMessage());
			DriverScript.bResult = false;
		}
	}	

}