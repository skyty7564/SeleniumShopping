package com.uiPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Product {

	public Product(WebDriver driver) {
		this.driver = driver;
	}

	WebDriver driver;
	@FindBy(how = How.NAME, using = "save_to_cart")
	@CacheLookup
	WebElement addItemToCart;
	@FindBy(how = How.ID, using = "menuCart")
	@CacheLookup
	WebElement goMenuCart;

	@FindBy(how = How.CLASS_NAME, using = "GRAY")
	@CacheLookup
	WebElement colorGrey;
	@FindBy(how = How.CLASS_NAME, using = "BLACK")
	@CacheLookup
	WebElement colorBlack;
	@FindBy(how = How.CLASS_NAME, using = "WHITE")
	@CacheLookup
	WebElement colorWhite;

	public void addToCart(String color) {
		if (color.equalsIgnoreCase("White")) {
			colorWhite.click();
		} else if (color.equalsIgnoreCase("Black")) {
			colorBlack.click();
		} else if (color.equalsIgnoreCase("GRAY")) {
			colorGrey.click();
		}

		addItemToCart.click();
		goMenuCart.click();

	}
}
