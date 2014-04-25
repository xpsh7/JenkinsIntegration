package danOrders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DM_Main {
	
	public static WebDriver driver = null;
	public static WebElement element = null;

	//GenericsType type1 = new GenericsType();
	static Beanclass beanClass = new Beanclass();

	static MyAccountPage objMyAccountPage= new MyAccountPage();
	static HomePage objHomePage= new HomePage();
	static ShoppingCart objShoppingCart = new ShoppingCart();
	static CheckoutPages objCheckoutPages = new CheckoutPages();
	static FunctionLibrary  fLib = new FunctionLibrary();
	static Payment objPayment= new Payment();
	static ConfirmationPage objConfirmation = new ConfirmationPage();
	Objects dm = new Objects();

	//@Test
	public static void main(String args[])
	{
//--------------------------Scenario -1---------------------------------------
//		driver = fLib.OpenBrowser(driver,"FireFox", "http://ncdlmorasa1351:8080/dm/home.jsp", "");
		driver = fLib.OpenBrowser(driver,"FireFox", "http://uat2.danmurphys.com.au", "");
		beanClass.setA1("sunethra@test.com");
		beanClass.setA2("test123");
		objHomePage.login(driver,beanClass.getA1(),beanClass.getA2());
		objHomePage.addItemThroughDepartmentPage(driver);
		objShoppingCart.shoppingCart(driver);
		beanClass.setA4("2150");
		objCheckoutPages.postCode(driver, beanClass.getA4());
		objCheckoutPages.checkout(driver);
		beanClass.setA5("MasterCard - xxxxxx6207");
		beanClass.setA6("705");
		objPayment.enterCreditCardDetails(driver, beanClass.getA5(), beanClass.getA6());
		objConfirmation.orderConfirmation(driver);
		objHomePage.logout(driver);
		
			
			
//--------------------------Scenario - 2 ---------------------------------------	

//		
//		beanClass.setA1("sunethra@test.com");
//		beanClass.setA2("test123");
//		objHomePage.login(driver,beanClass.getA1(),beanClass.getA2());
//		objHomePage.throughPastBuys(driver);
//		beanClass.setA3("2150");
//		objShoppingCart.typeDelivery(driver, beanClass.getA3());
//		objShoppingCart.pickUpTypePickADay(driver);
//		
//		
//		objCheckoutPages.aboutYou(driver, beanClass.getA4());
//		objCheckoutPages.deliveryDetails(driver);
//		objPayment.paymentTypePaypalGiftCard(driver);
//		
//		objConfirmation.orderConfirmation(driver);
//		objHomePage.logout(driver);
//		
////--------------------------Scenario - 3 ---------------------------------------	
//	
//	beanClass.setA1("sunethra@test.com");
//	beanClass.setA2("test123");
//	objHomePage.login(driver,beanClass.getA1(),beanClass.getA2());
//	objHomePage.throughWishList(driver);
//	
//	objShoppingCart.shoppingCart(driver);
//	objShoppingCart.pickUpTypeNextDay(driver);
//	
//	beanClass.setA4("2150");
//	objCheckoutPages.postCode(driver, beanClass.getA4());
//	objPayment.paymentTypeCreditGiftCard(driver);
//	
//	objConfirmation.orderConfirmation(driver);
//	objHomePage.logout(driver);
//	
//	
//	
	}

}
