package danOrders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import atu.testng.reports.ATUReports;
import atu.testng.reports.utils.Utils;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
@Listeners({ ATUReportsListener.class, ConfigurationListener.class,MethodListener.class })
public class DanMurphyOrderCreation_class{
{
System.setProperty("atu.reporter.config", "C:\\FrameWork\\Temp\\atu.properties");
}public DanMurphyOrderCreation_class(){
}


static FunctionLibrary fLib = new FunctionLibrary();
static Beanclass beanClass = new Beanclass();
static Payment objPayment= new Payment();
static CheckoutPages objCheckoutPages= new CheckoutPages();
static ShoppingCart objShoppingCart= new ShoppingCart();
static HomePage objHomePage= new HomePage();



static WebDriver driver = null;
@BeforeClass
 public void init() {
driver = fLib.OpenBrowser(driver,"FireFox", "http://uat2.danmurphys.com.au", "");
ATUReports.setWebDriver(driver);
setIndexPageDescription();
}
private void setAuthorInfoForReports() {
ATUReports.setAuthorInfo("Automation Tester", Utils.getCurrentTime(),"1.0");
}
private void setIndexPageDescription() {
ATUReports.indexPageDescription = "DanMurphyOrder<br/> <b>Woolworths is the largest supermarket/grocery store chain in Australia, owned by Woolworths Limited</b>";
ATUReports.currentRunDescription = "DanMurphyOrder";
}
@Test
public void testcase()
//public static void main(String args[])
{
	driver = fLib.OpenBrowser(driver,"FireFox", "http://uat2.danmurphys.com.au", "");
beanClass.setA1("sunethra@test.com");
beanClass.setA2("test123");
objHomePage.login(driver,beanClass.getA1(),beanClass.getA2());
ATUReports.add("Enter Login id", "sunethra@test.com", "Logged in", "Sucessfully logged in", true);
objHomePage.addItemThroughDepartmentPage(driver);
ATUReports.add("Enter password", "test123", "Logged in", "Sucessfully logged in", true);
objShoppingCart.shoppingCart(driver);
beanClass.setA3("2150");
objCheckoutPages.postCode(driver,beanClass.getA3());
objCheckoutPages.checkout(driver);
beanClass.setA4("MasterCard - xxxxxx6207");
beanClass.setA5("705");
objPayment.enterCreditCardDetails(driver,beanClass.getA4(),beanClass.getA5());

}


@Test
public void testcase1()
//public static void main(String args[])
{
	driver = fLib.OpenBrowser(driver,"FireFox", "http://uat2.danmurphys.com.au", "");
beanClass.setA1("raymond@test.com");
beanClass.setA2("test123");
objHomePage.login(driver,beanClass.getA1(),beanClass.getA2());
ATUReports.add("Enter Login id", "raymond@test.com", "Logged in", "Sucessfully logged in", true);
objHomePage.addItemThroughDepartmentPage(driver);
ATUReports.add("Enter password", "test123", "Logged in", "Sucessfully logged in", true);
objShoppingCart.shoppingCart(driver);
beanClass.setA3("2150");
objCheckoutPages.postCode(driver,beanClass.getA3());
objCheckoutPages.checkout(driver);
beanClass.setA4("MasterCard - xxxxxx6207");
beanClass.setA5("705");
objPayment.enterCreditCardDetails(driver,beanClass.getA4(),beanClass.getA5());

}

}
