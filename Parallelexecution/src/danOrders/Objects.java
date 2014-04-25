package danOrders;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;


	public class Objects<T> {
		GeneralFunctions genFunc = new GeneralFunctions();
		public static WebElement SignIn(WebDriver driver)
	    {
			WebElement search = driver.findElement(By.id("Header-Sign In Right")); //xpath(".//*[@id='Header-Sign In Right']"));
	    	return search;
	    }

		public WebElement EnterEmail(WebDriver driver) 
		{
			WebElement email = driver.findElement(By.id("email"));
	    	return email;
		}
		public WebElement EnterPwd(WebDriver driver) 
		{
			WebElement pwd = driver.findElement(By.id("pwd"));
	    	return pwd;
		}
		public WebElement LoginBtn(WebDriver driver) 
		{
			WebElement clickLogin = driver.findElement(By.id("loginSubmit"));
	    	return clickLogin;
		}
		
		public WebElement WhiteWine(WebDriver driver)
	    {
			WebElement search = driver.findElement(By.linkText("White Wine"));
	    	return search;
	    }
		public WebElement Chardonnay(WebDriver driver)
	    {
			WebElement search = driver.findElement(By.linkText("Chardonnay"));
	    	return search;
	    }
		public WebElement ItemSearchField(WebDriver driver)
	    {
			WebElement search = driver.findElement(By.id("search-input"));
	    	return search;
	    }
		
	    public WebElement AddItemDepartmentPage(WebDriver driver)
	    {
			WebElement search = driver.findElement(By.xpath(".//*[@id='addToDMCart845524441806659']/fieldset/a"));
	    	return search;
	    }
		
		public WebElement SearchBtn(WebDriver driver)
	    {
			WebElement sBtn = driver.findElement(By.xpath(".//*[@id='header-search']/div/a/span"));
	    	return sBtn;
	    }
		
		public WebElement SelectItem(WebDriver driver)
	    {
			WebElement sItem = driver.findElement(By.xpath(".//*[@id='results-list-container']/div[1]/div[2]/h3/a"));
	    	return sItem;
	    }
		
		public WebElement AddToCart(WebDriver driver, T searchProduct)
	    {
			String strPRDidQuery="Select PRD_ID from PRODUCT Where PRD_CODE='"+ searchProduct +"'";
			//String productId = genFunc.GetDataFromMainDb(strPRDidQuery);
			//System.out.println(productId);
			String htmlId = "addToDMCart845524441808133";
			//String htmlId = "addToDMCart"+productId;
			System.out.println(htmlId);
			//WebElement addtoCart = driver.findElement(By.id("addToDMCart"+productId));
			//WebElement addtoCart = driver.findElement(By.xpath("//button[@id='"+htmlId+"']"));
			WebElement addtoCart = driver.findElement(By.xpath(".//*[@id='addToDMCart845524441808133']/fieldset/a"));
	    	return addtoCart;
	    }
			
		public WebElement ViewCart(WebDriver driver)
	    {
			WebElement view = driver.findElement(By.linkText("View Cart"));
	    	return view;
	    }
		
		public WebElement DeliveryOption(WebDriver driver)
	    {
			WebElement radio = driver.findElement(By.xpath(".//*[@id='hdtab']/a/span"));
	    	return radio;
	    }
		
		public WebElement PostCode(WebDriver driver)
	    {
			WebElement pCode = driver.findElement(By.id("delPostCodeId"));
	    	return pCode;
	    }
		
		public WebElement DeliveryOptionsBtn1(WebDriver driver)
	    {
			WebElement deliverySuburb = driver.findElement(By.cssSelector("[data-value='"+InputData.suburb+"']"));
	    	return deliverySuburb;
	    }
		public WebElement DeliveryOptionsBtn(WebDriver driver)
	    {
			WebElement deliverySuburb = driver.findElement(By.id("delEstimClick"));
	    	return deliverySuburb;
	    }
		public WebElement StandardDeleivery(WebDriver driver)
	    {
			WebElement sdRadio = driver.findElement(By.xpath(".//*[@id='hdcontent']/div[2]/ul/li/a/span"));
	    	return sdRadio;
	    }
		public WebElement DeliveryCheckout(WebDriver driver)
	    {
			WebElement checkout = driver.findElement(By.xpath(".//*[@id='enableCheckOut']/button"));
	    	return checkout;
	    }

		public WebElement PhoneNumber(WebDriver driver)
	    {
			WebElement pNum = driver.findElement(By.id("phone"));
	    	return pNum;
	    }
		
		public WebElement DateDOB(WebDriver driver)
	    {
			WebElement date = driver.findElement(By.id("dayOfBirth-DOB"));
	    	return date;
	    }
		
		public WebElement monthDOB(WebDriver driver)
	    {
			WebElement month = driver.findElement(By.id("monthOfBirth-DOB"));
	    	return month;
	    }
			
		public WebElement yearDOB(WebDriver driver)
	    {
			WebElement year = driver.findElement(By.id("yearOfBirth-DOB"));
	    	return year;
	    }
			
		public WebElement clickNext(WebDriver driver)
	    {
			WebElement next = driver.findElement(By.id("saveAboutYouDetailsNext"));
	    	return next;
	    }
		
		
		public WebElement SingleDelivery(WebDriver driver)
	    {
			WebElement radio1 = driver.findElement(By.id("single-delivery-radio"));
	    	return radio1;
	    }
		
		
		
		public WebElement address1(WebDriver driver)
	    {
			WebElement adrs1 = driver.findElement(By.id("address1"));
	    	return adrs1;
	    }
		
		public WebElement address2(WebDriver driver)
	    {
			WebElement adrs2 = driver.findElement(By.id("address2"));
	    	return adrs2;
	    }
		
		public WebElement clickNext1(WebDriver driver)
	    {
			WebElement next1 = driver.findElement(By.linkText("Next"));
	    	return next1;
	    }
		
		public WebElement UseDeliveryAdrsCheck(WebDriver driver)
	    {
			WebElement adrsCheck = driver.findElement(By.id("usedeliveryaddress"));
	    	return adrsCheck;
	    }
		 
		public WebElement BillingAddress(WebDriver driver)
	    {
			WebElement billing = driver.findElement(By.id("billing-address-ship-address"));
	    	return billing;
	    }
		
		
		public WebElement PaymentRadio(WebDriver driver)
	    {
			WebElement payType = driver.findElement(By.name("cardpay"));
	    	return payType;
	    }
		public WebElement TermsAndConditions(WebDriver driver)
	    {
			WebElement tcCheck =  driver.findElement(By.name("tncagree"));
	    	return tcCheck;
	    }
		
		public WebElement TermsAndConditions1(WebDriver driver)
	    {
			WebElement ageCheck1 = driver.findElement(By.name("ageagree"));
	    	return ageCheck1;
	    }
		public WebElement SubmitOrder(WebDriver driver)
	    {
			WebElement submit =  driver.findElement(By.id("submitYourOrder"));
	    	return submit;
	    }
		public WebElement PaymentFrame(WebDriver driver)
	    {
			WebElement iframe = driver.findElement(By.id("datacashIframe"));
	    	return iframe;
	    }
		public WebElement SelectCard(WebDriver driver)
	    {
			WebElement credCard = driver.findElement(By.id("card-selection"));
	    	return credCard;
	    }
		
		
		public WebElement CardNumber(WebDriver driver)
	    {
			WebElement card = driver.findElement(By.name("card_number"));
	    	return card;
	    }
		
		public WebElement ExpiryMonth(WebDriver driver)
	    {
			WebElement exMonth = driver.findElement(By.name("exp_month"));
	    	return exMonth;
	    }
		
		public WebElement ExpiryYear(WebDriver driver)
	    {
			WebElement exYear = driver.findElement(By.name("exp_year"));
	    	return exYear;
	    }
		
		public WebElement EnterCVV(WebDriver driver)
	    {
			WebElement cvv = driver.findElement(By.id("ccv"));
	    	return cvv;
	    }	
		public WebElement Paynow(WebDriver driver)
	    {
			WebElement paynow = driver.findElement(By.id("pay-now"));
	    	return paynow;
	    }	
		public WebElement OrderNumber(WebDriver driver)
	    {
			WebElement ordernumber = driver.findElement(By.id("order-num"));
	    	return ordernumber;
	    }
		public WebElement Logout(WebDriver driver)
	    {
			WebElement logout = driver.findElement(By.linkText("Logout"));
	    	return logout;
	    }
		
	

}
