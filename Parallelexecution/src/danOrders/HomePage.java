package danOrders;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage<T> {


	FunctionLibrary  fLib = new FunctionLibrary();
	Objects dm = new Objects();
	
	public static WebDriver driver = null;
	public static WebElement element = null;
	GenericType type2 = new GenericType();
	Beanclass beanClass = new Beanclass();
	//Call pages
	//public void Login(String driver,String username,String password)
	public void login(WebDriver driver, T userName,T password)
	{
		System.out.println("getDriver :"+userName);
		System.out.println("getDriver :"+password);
		System.out.println("getDriver :"+driver);
		element = dm.SignIn(driver);
		
		fLib.Click(element, null);  
		
		WebElement email = dm.EnterEmail(driver);
		fLib.set(email, userName,"");
		
		WebElement pwd = dm.EnterPwd(driver);
		fLib.set(pwd, password, "");

		WebElement clickLogin = dm.LoginBtn(driver);
		fLib.Click(clickLogin, null);	
	}
	public void addItemThroughDepartmentPage(WebDriver driver) {
		
		WebElement clickWhitewine = dm.WhiteWine(driver);
		fLib.Click(clickWhitewine, null);
		WebElement clickChardonnay = dm.Chardonnay(driver);
		fLib.Click(clickChardonnay, null);
		WebElement clickAddItem = dm.AddItemDepartmentPage(driver);
		fLib.Click(clickAddItem, null);
		
	}
	public void logout(WebDriver driver) {
		WebElement logout = dm.Logout(driver);
		fLib.Click(logout, null);
		try {
			fLib.wait(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fLib.closeBrowser(driver);
	}
	
	public void throughPastBuys(WebDriver driver) {
		
		
	}
	

	
}
