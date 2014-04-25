package danOrders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Payment<T> {
	FunctionLibrary  fLib = new FunctionLibrary();
	Objects dm = new Objects();
	
	public static WebDriver driver = null;
	public static WebElement element = null;
	GenericType type2 = new GenericType();
	Beanclass beanClass = new Beanclass();
	
	public void enterCreditCardDetails(WebDriver driver, T card1, T cv)
	{
//		WebElement element = dm.PaymentFrame(driver);
//		fLib.switchTo(driver, element, "");
		WebElement card = dm.SelectCard(driver);
		fLib.selectFromComboBox(card, card1,"");
		WebElement cvv = dm.EnterCVV(driver);
		fLib.set(cvv, cv, "");
		
		WebElement submit = dm.SubmitOrder(driver);
		fLib.Click(submit, null);
		
		driver.switchTo().defaultContent();
		
	
	}
	
	public void orderConfirmation(WebDriver driver)
	{
		WebElement ordernumber = dm.OrderNumber(driver);
		String orderNumber = fLib.getTextfromElement(ordernumber, "");
		System.out.println("_________Order Placed___________");
		System.out.println("Order Number:"+orderNumber);
	}
}
