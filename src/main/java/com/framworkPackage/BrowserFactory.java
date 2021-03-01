package com.framworkPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	public static WebDriver driver;

	public BrowserFactory() {

	}

	public static WebDriver getDriver() {
		System.out.println("Ping2");
		if (driver == null) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			System.setProperty("webdriver.chrome.driver",
					"D:\\Java\\SeleniumMaven\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);

		}
		System.out.println("Get tp driver");
		return driver;
	}

	public static WebDriver getDriver(String browserName) {
		System.out.println("Ping1");
		if (driver == null) {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"D:\\Java\\SeleniumMaven\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"D:\\Java\\SeleniumMaven\\src\\main\\resources\\geckodriver-v0.29.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
			} else if (browserName.equalsIgnoreCase("IE")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				options.setPageLoadStrategy(PageLoadStrategy.NONE);
				System.setProperty("webdriver.ie.driver",
						"D:\\Java\\SeleniumMaven\\src\\main\\resources\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
			}

		}

		return driver;

	}
}
