package com.uiPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {

	static WebDriver driver;

	public static void getSearch(WebDriver drivers) {
		driver = drivers;
		try {
			WebElement SearchBox = driver.findElement(By.xpath("//*[@id=\"menuSearch\"]"));
			SearchBox.click();
			WebElement Search = driver.findElement(By.xpath("//*[@id=\"autoComplete\"]"));
			Search.sendKeys("Hp");
			Search.sendKeys(Keys.RETURN);
			WebElement exit = driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]/a/div/div[1]/div/div/div"));
			exit.click();
			WebElement hpLaptop = driver.findElement(By.xpath(
					"/html/body/div[3]/section/article/div[3]/div/div/div[1]/div/ul/li[1]/div/div[1]/div/input"));
			hpLaptop.click();
			System.out.println("Click product");
			WebElement product = driver.findElement(By.xpath("//*[@id=\"9\"]"));
			product.click();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
