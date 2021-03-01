package com.TestPackages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.framworkPackage.BrowserFactory;

public class HelperClass {

	public static WebDriver driver;
	BrowserFactory obj1;

	public HelperClass() {
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Get tp suite");
	}

	@BeforeGroups
	public void BeforeClass() {
		System.out.println("in @BeforeClass");
	}

	@BeforeMethod
	public void beforeMethodClass() {
		System.out.println("in @BeforeMethod");
		HelperClass.driver = BrowserFactory.getDriver("chrome");
	}

	@AfterMethod
	public void close() {
		// this.driver.close();
	}

	@AfterClass
	public void afterClass() {

	}

	@AfterSuite
	public void afterSuite() throws IOException {
		driver.quit();
	}

}
