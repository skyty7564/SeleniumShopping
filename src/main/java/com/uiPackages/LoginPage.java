package com.uiPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LoginPage {

	WebDriver driver;
	static WebDriver driverLogin;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public static void getLogin(WebDriver driver) {

		driverLogin = driver;
		WebElement SearchBox = driverLogin.findElement(By.xpath("//*[@id=\"menuUser\"]"));

		SearchBox.click();
	}

	@FindBy(how = How.NAME, using = "username")
	@CacheLookup
	WebElement username;
	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	WebElement password;
	@FindBy(how = How.ID, using = "sign_in_btnundefined")
	@CacheLookup
	WebElement login;

	public void loginWordPress(String use, String pass) {

		try {
			username.sendKeys(use);
			Thread.sleep(3000);
			password.sendKeys(pass);
			Thread.sleep(3000);
			login.click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
