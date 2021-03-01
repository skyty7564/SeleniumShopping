package com.TestPackages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.framworkPackage.BrowserFactory;
import com.framworkPackage.CaptureScreenShot;
import com.uiPackages.LoginPage;
import com.uiPackages.OrderPayment;
import com.uiPackages.Product;
import com.uiPackages.Search;
import com.uiPackages.ShoppingCart;

public class TestCaseClass extends HelperClass {
	public TestCaseClass() {
	}

	@Test
	public void returnBill() {
		
	//	System.setProperty("webdriver.chrome.driver", "F:\\Download\\chromedriver_win32\\chromedriver.exe");
		
	//	WebDriver driver = new ChromeDriver();
	//	driver.get("http://advantageonlineshopping.com/#/");
	//	driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	try {
		System.out.println("in returnBill");
		driver = obj1.getDriver();
		driver.get("http://advantageonlineshopping.com/#/");
		LoginPage.getLogin(driver);
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginWordPress("bob123", "Wreck123");
		Search.getSearch(driver);
		Product getProduct = PageFactory.initElements(driver, Product.class);
		getProduct.addToCart("white");
		ShoppingCart cart = PageFactory.initElements(driver, ShoppingCart.class);
		cart.checkout();
		OrderPayment.moveSelectPayment("creditCard",driver);
		OrderPayment payment = PageFactory.initElements(driver, OrderPayment.class);
		payment.creditcard("112312312323","#468", "12", "2027", "Bon jovy");
		String billShoppingFile = System.getProperty("user.dir") + "\\" + "ScreenShots\\billDetail -"
				+ CaptureScreenShot.getDataTimeStamp() + ".png";
		
			CaptureScreenShot.getScreenShot(BrowserFactory.getDriver(), billShoppingFile);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
