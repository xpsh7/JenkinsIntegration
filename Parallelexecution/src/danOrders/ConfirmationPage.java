package danOrders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmationPage<T> {
	
	FunctionLibrary  fLib = new FunctionLibrary();
	Objects dm = new Objects();
	
	public static WebDriver driver = null;
	public static WebElement element = null;
	GenericType type2 = new GenericType();
	Beanclass beanClass = new Beanclass();
	
	public void orderConfirmation(WebDriver driver)
	{
		WebElement ordernumber = dm.OrderNumber(driver);
		String orderNumber = fLib.getTextfromElement(ordernumber, "");
		System.out.println("_________Order Placed___________");
		System.out.println("Order Number:"+orderNumber);
	}

}
