package danOrders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart<T> {
	
	FunctionLibrary  fLib = new FunctionLibrary();
	Objects dm = new Objects();
	
	public static WebDriver driver = null;
	public static WebElement element = null;
	GenericType type2 = new GenericType();
	Beanclass beanClass = new Beanclass();
	
	public void shoppingCart(WebDriver driver) {
		
		WebElement clickView = dm.ViewCart(driver);
		fLib.Click(clickView, null);
	
		WebElement dOpt = dm.DeliveryOption(driver);
		fLib.Click(dOpt, null);
	}

	public void typeDelivery(WebDriver driver2, T postCode) {
		
		WebElement clickView = dm.ViewCart(driver);
		fLib.Click(clickView, null);
	
		WebElement dOpt = dm.DeliveryOption(driver);
		fLib.Click(dOpt, null);
		
		WebElement pCode = dm.PostCode(driver);
		fLib.set (pCode, postCode,"");
				
	}



}
