package danOrders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPages<T> {
	

	FunctionLibrary  fLib = new FunctionLibrary();
	Objects dm = new Objects();
	
	public static WebDriver driver = null;
	public static WebElement element = null;
	GenericType type2 = new GenericType();
	Beanclass beanClass = new Beanclass();
	

public void postCode(WebDriver driver, T postCode) {
	WebElement pCode = dm.PostCode(driver);
	fLib.set (pCode, postCode,"");
	
}
public void checkout(WebDriver driver) {
	WebElement dBtn = dm.DeliveryOptionsBtn(driver);
	fLib.Click(dBtn, null);

	WebElement sDelivery = dm.StandardDeleivery(driver);
	fLib.Click(sDelivery, null);

	WebElement dChkOut = dm.DeliveryCheckout(driver);
	fLib.Click(dChkOut, null);

	WebElement next = dm.clickNext(driver);
	fLib.Click(next, null);

	WebElement next1 = dm.clickNext1(driver);
	fLib.Click(next1, null);

	WebElement dAdrs = dm.UseDeliveryAdrsCheck(driver);
	fLib.Click(dAdrs, null);

	WebElement sAdrs = dm.BillingAddress(driver);
	fLib.Click(sAdrs, null);

	WebElement cRadio = dm.PaymentRadio(driver);
	fLib.Click(cRadio, null);

	WebElement tc = dm.TermsAndConditions(driver);
	fLib.Click(tc, null);

	WebElement age = dm.TermsAndConditions1(driver);
	fLib.Click(age, null);
	

}


}
