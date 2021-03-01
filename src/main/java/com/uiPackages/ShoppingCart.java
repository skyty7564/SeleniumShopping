package com.uiPackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShoppingCart {

	public ShoppingCart(WebDriver driver) {
		this.driver = driver;
	}

	WebDriver driver;
	@FindBy(how = How.ID, using = "checkOutButton")
	@CacheLookup
	WebElement checkout;
	@FindBy(how = How.CLASS_NAME, using = "edit")
	@CacheLookup
	WebElement Edit;
	@FindBy(how = How.CLASS_NAME, using = "remove")
	@CacheLookup
	WebElement Remove;

	public void checkout() {
		checkout.click();
	}

	public void remove() {
		Remove.click();
	}

	public void edit() {
		Edit.click();
	}
}
