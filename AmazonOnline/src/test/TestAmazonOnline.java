package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.HomePage;
import page.ProductPage;
import page.OrderPage;
import page.EditOrderBasketPage;
import page.EditShoppingBasketPage;
import page.SignInPage;
import page.RegistrationPage;
import page.AddressDetailPage;
import page.DeliveryOptionPage;


public class TestAmazonOnline {

	WebDriver driver;
	
	HomePage objHomePage;
	
	ProductPage objProductPage;
	
	OrderPage objOrderPage;
	
	EditOrderBasketPage objEditOrderBasketPage;
	
	EditShoppingBasketPage objEditShoppingBasketPage;
	
	SignInPage objSignInPage;
	
	RegistrationPage objRegistrationPage;
	
	AddressDetailPage objAddressDetailPage;
	
	DeliveryOptionPage objDeliveryOptionPage;
	
	
	@BeforeTest
	 
    public void setup(){
 
        driver = new FirefoxDriver();
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        driver.get("http://www.amazon.co.uk/");
 
    }
	
	@Test(priority=0)
	
	public void product_search(){
		
		objHomePage = new HomePage(driver);
		
		objHomePage.HomePageProdSearch("iphone6");
		
	}
	
	@Test(priority=1)
	
	public void select_product(){
		
		objProductPage = new ProductPage(driver);
		
		objProductPage.clickProduct();
		
	}
	
	@Test(priority=2)
	
	public void order_product(){
		
		objOrderPage = new OrderPage(driver);
		
		objOrderPage.OrderPageSelection("16GB", "Gold", "2");
		
	}

	@Test(priority=3)
	
	public void edit_order_product(){
		
		objEditOrderBasketPage = new EditOrderBasketPage(driver);
		
		objEditOrderBasketPage.editOrderBasket();
		
	}
	
	@Test(priority=4)
	
	public void edit_shopping_basket(){
		
		objEditShoppingBasketPage = new EditShoppingBasketPage(driver);
		
		objEditShoppingBasketPage.editShoppingBasket();
		
	}
	
	@Test(priority=5)
	
	public void customer_signin(){
		
		objSignInPage = new SignInPage(driver);
		
		objSignInPage.SingInPageDetails("kohmoto4042@gmail.com");
		
	}
	
	@Test(priority=6)
	
	public void customer_registration(){
		
		objRegistrationPage = new RegistrationPage(driver);
		
		objRegistrationPage.CustomerRegistration("Koh Moto", "kohmoto4042@gmail.com", "test@123", "test@123");
		
	}

	
	@Test(priority=7)
	
	public void customer_address(){
		
		objAddressDetailPage = new AddressDetailPage(driver);
		
		objAddressDetailPage.customer_address_details("Koh Moto", "FLAT 1, KINROSS HOUSE", "BEMERTON ESTATE", "LONDON", null, "N1 0AA", "United Kingdom", "9900944004");
		
	}
	
	@Test(priority=7)
	
	public void customer_delivery(){
		
		objDeliveryOptionPage = new DeliveryOptionPage(driver);
		
		objDeliveryOptionPage.DeliveryContinue();
	}
	
	
}
