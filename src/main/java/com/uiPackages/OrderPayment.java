package com.uiPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPayment {

	public OrderPayment(WebDriver driver) {

		OrderPayment.driver = driver;
	}

	static WebDriver driver;

	static WebElement next;
	static WebElement safePay;
	static WebElement masterCredit;
	WebElement cardNumber;
	WebElement cvv_number;
	WebElement mmListBox;
	WebElement yyyyListBox;
	WebElement cardHolder;
	WebElement payNow;
	WebElement userName;
	WebElement password;

	public static void moveSelectPayment(String paymentMethod,WebDriver drivers) {
		driver = drivers;
		next = driver.findElement(By.id("next_btn"));
		next.click();
		if (paymentMethod.equalsIgnoreCase("safePay")) {
			safePay = driver.findElement(By.name("safepay"));
			safePay.click();
		} else if (paymentMethod.equalsIgnoreCase("creditCard")) {
			masterCredit = driver.findElement(By.name("masterCredit"));
			masterCredit.click();
		}

	}

	public void makePayment(String username, String pass) {
		try {

			userName = driver.findElement(By.name("safepay_username"));
			Thread.sleep(2000);
			userName.sendKeys(username);
			Thread.sleep(2000);
			password = driver.findElement(By.name("safepay_password"));
			Thread.sleep(2000);
			password.sendKeys(pass);
			Thread.sleep(2000);
			payNow = driver.findElement(By.id("pay_now_btn_SAFEPAY"));
			Thread.sleep(2000);
			payNow.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void creditcard(String cardNum, String cvv, String mm, String yyyy, String name) {

		System.out.print(cvv);
		try {
			cardNumber = driver.findElement(By.name("card_number"));
			cardNumber.sendKeys(cardNum);
			Thread.sleep(4000);
			cvv_number = driver.findElement(By.name("cvv_number"));
			cvv_number.click();
			Thread.sleep(1000);
			cvv_number.sendKeys(cvv.trim());
			Thread.sleep(4000);
			mmListBox = driver.findElement(By.name("mmListbox"));
			mmListBox.sendKeys(mm);
			Thread.sleep(4000);
			yyyyListBox = driver.findElement(By.name("yyyyListbox"));
			yyyyListBox.sendKeys(yyyy);
			Thread.sleep(3000);
			cardHolder = driver.findElement(By.name("cardholder_name"));
			cardHolder.sendKeys(name);
			Thread.sleep(3000);
			payNow = driver.findElement(By.id("pay_now_btn_ManualPayment"));
			payNow.click();
			Thread.sleep(3000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
