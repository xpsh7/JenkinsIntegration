package danOrders;

		
		import java.io.IOException;
		import java.util.List;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.Dimension;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.WebDriver.Navigation;
		import org.openqa.selenium.WebDriver.Options;
		import org.openqa.selenium.WebDriver.TargetLocator;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.ie.InternetExplorerDriver;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.ui.ExpectedCondition;
		import org.openqa.selenium.support.ui.Select;
		import org.openqa.selenium.support.ui.WebDriverWait;

		public class FunctionLibrary<T> {
		
			
			
			@SuppressWarnings("finally")
			public WebDriver OpenBrowser(WebDriver driver,String browser, String url, String Expected)
			{
				try{
					if(browser.equals("FireFox"))
					{
						driver = new FirefoxDriver();
					}
					else if(browser.equals("Chrome"))
					{
						driver = new ChromeDriver();
					}
					else if(browser.equals("IE"))
					{
						driver = new InternetExplorerDriver();
					}
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.get(url);
				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
				finally{
					return driver;
				}
				
			}
			public WebDriver closeBrowser(WebDriver driver)
			{
				try{									
						driver = new FirefoxDriver();
						driver.close();
					}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
				finally{
					return driver;
				}
			}
			public void set (WebElement element,T data, String Expected)
			{
				try
				{
					element.sendKeys(data.toString());
					//element.sendKeys((CharSequence[]) data);
				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
			}
			
			public void Click(WebElement element, String Expected)
			{
				try{
				element.click();
				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
			}
				
			public Boolean ElementisDisplayed(WebElement element, String Expected)
			{
				Boolean bElement = false;
				try{
					bElement = element.isDisplayed();
				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
				finally
				{
					return bElement;
				}
				
			}
			
			public Boolean ElementisEnabled(WebElement element, String Expected)
			{
				Boolean bElement = false;
				try{
					bElement = element.isEnabled();
				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
				finally
				{
					return bElement;
				}
				
			}
				
			@SuppressWarnings("finally")
			public Boolean elementisSelected(WebElement element, String Expected)
			{
				Boolean bElement = false;
				try{
					bElement = element.isSelected();
				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
				finally
				{
					return bElement;
				}
				
			}
			
			public String ret_String(WebElement element, String Expected)
			{
				String ret_string = "";
				try{
				ret_string = element.getText();
				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
				finally
				{
					return ret_string;
					
				}
			}
			
			public String ret_Attribute(WebElement element,String value, String Expected)
			{
				String ret_string = "";
				try{
				ret_string = element.getAttribute(value);
				
				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
				finally
				{
					return ret_string;
					
				}
			}
			
				
			public void quit(WebDriver driver) {
				
				try{
					driver.quit();			
					}
					catch(Exception exp)
					{
						exp.printStackTrace();
					}
							
			}
			
					
			public String getTitle(WebDriver driver) {
				
				String ret_string = "";
				try{
				ret_string = driver.getTitle();
				
				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
				finally
				{
					return ret_string;
					
				}
			}
			
			
			public String getCurrentUrl(WebDriver driver) {
				String ret_string = "";
				try{
				ret_string = driver.getCurrentUrl();
				
				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
				finally
				{
					return ret_string;
					
				}
			}
			
			public void get(WebDriver driver, String URL) {
				// TODO Auto-generated method stub
				
				
				try{
				 driver.get(URL);
				
				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
						
			}
			

			@SuppressWarnings("finally")
			public  Boolean selectFromComboBox(WebElement element, T value, T Expected)
			{
				Boolean bElement = false;
				try
				{
					Select selectBox = new Select(element);
					List<WebElement> selectOptions = selectBox.getOptions();
					for(int i = 0; i< selectOptions.size(); i++)
					{
						if(selectOptions.get(i).getText().equals(value))
						{
							selectOptions.get(i).click();
							//selectBox.selectByVisibleText(value);
							bElement = true;
							break;
						}
					}
				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
				finally
				{
					return bElement;
				}
			}

			public static Boolean selectRadioButton(List<WebElement> element, String attributeName, String value, String Expected)
			{
				Boolean bElement = false;
				//System.out.println(element.size());
				try{

						for(int i = 0; i<element.size(); i++)
						{
							//System.out.println(element.get(i).getAttribute("id"));
							if(element.get(i).getAttribute("id").equals(value))
							{
								element.get(i).click();
								bElement = true;
								break;
							}
						}
					}
					catch(Exception exp)
					{
						exp.printStackTrace();
					}
				return bElement;

			}


			@SuppressWarnings("finally")
			public String getTextfromElement(WebElement element, String Expected)
			{
				String ret_string = "";
				try{
					ret_string = element.getText();
				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
				finally
				{
					return ret_string;

				}
			}


			@SuppressWarnings("finally")
			public String getWindowHandle(WebDriver driver, String Expected) {
				String ret_string = "";
				try{
				ret_string = driver.getWindowHandle();

				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
				finally
				{
					return ret_string;

				}
			}

			@SuppressWarnings("finally")
			public String toString(WebDriver driver, String Expected) {
				String ret_string = "";
				try{
				ret_string = driver.toString();

				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
				finally
				{
					return ret_string;

				}
			}


			@SuppressWarnings("finally")
			public Boolean equals(WebDriver driver, Object object, String Expected) {
				Boolean fBoolean = false;
				try{
					fBoolean = driver.equals(object);
				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
				finally
				{
					return fBoolean;

				}
			}

			public void switchTo(WebDriver driver, WebElement element, String Expected) {
				try{
					driver.switchTo().frame(element);
				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
			}

			public void alertHandle(WebDriver driver, WebElement element, String status, String Expected) {
				try{
					if(status.equalsIgnoreCase("Ok"))
						{
						driver.switchTo().alert().accept();
						}
					else if(status.equalsIgnoreCase("Cancel"))
					{
						driver.switchTo().alert().dismiss();
					}

				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
			}

			public void mouseOver(WebDriver driver, WebElement element, String Expected) {
				try{
						Actions action = new Actions(driver);
						action.moveToElement(element).build().perform();
				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
			}


			public void killProcessFromTaskManager(String processName) throws IOException
			{
				try{
					Runtime.getRuntime().exec("taskkill /IM "+processName);
				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
			}


			@SuppressWarnings("finally")
			public List<WebElement> AllElements(WebElement element, String value)
			{
				List<WebElement> elementList =  null;
				try
				{
					elementList = element.findElements(By.id(value));

				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
				finally
				{
					return elementList;

				}

			}


			public void clear(WebElement element, String Expected)
			{
				try{
				element.clear();
				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
			}

		@SuppressWarnings("finally")
		public Boolean equals(WebElement element,String value, String Expected)
			{
				Boolean bElement = false;
				try{
					bElement = element.equals(value);
				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
				finally
				{
					return bElement;
				}

			}


			@SuppressWarnings("finally")
			public String getCssValue(WebElement element,String value, String Expected)
			{
				String ret_string= "";
				try{
				ret_string= element.getCssValue(value);

				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
				finally
				{
					return ret_string;

				}
			}


			@SuppressWarnings("finally")
			public String getTagName(WebElement element, String Expected)
			{
				String ret_string = "";
				try{
				ret_string = element.getTagName();

				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
				finally
				{
					return ret_string;

				}
			}


			@SuppressWarnings("finally")
			public int hashCode(WebElement element, String Expected)
			{
				int ret_int = 0;
				try{
					ret_int = element.hashCode();

				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
				finally
				{
					return ret_int;

				}
			}


			public void notify(WebElement element, String Expected)
			{
				try{
				element.notify();
				}
				catch(Exception exp)
				{
					exp.printStackTrace();
				}
			}


			public void notifyAll(WebElement element, String Expected)
				{
					try{
					element.notifyAll();
					}
					catch(Exception exp)
					{
						exp.printStackTrace();
					}
				}


			public void submit(WebElement element, String Expected)
				{
					try{
					element.submit();
					}
					catch(Exception exp)
					{
						exp.printStackTrace();
					}
				}


			@SuppressWarnings("finally")
			public String toString(WebElement element, String Expected)
				{
					String ret_string = "";
					try{
					ret_string = element.toString();

					}
					catch(Exception exp)
					{
						exp.printStackTrace();
					}
					finally
					{
						return ret_string;

					}
				}

			public void wait(WebElement element, String Expected)
				{
					try{
					element.wait();
					}
					catch(Exception exp)
					{
						exp.printStackTrace();
					}
				}
		}
