package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageGrandParent {
	// Abstract class can have Abstract and Non-Abstract methods
	// It is used to start the hierarchy , Only to put prototype methods without body, it's child classes responsibility to impliment those methods.
	// You can not create the Object of an Abstract class, But can create the constructor of that abstract class.
	WebDriver driver;
	WebDriverWait wait;
	
	// Constructor
	public PageGrandParent(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver,15);
	}
	
	// Abstract Methods
	// All child classes must have these methods define
	
	public abstract String getPageTitle();
	public abstract String getPageHeader(By Locator);
	public abstract WebElement getElement(By locator);	
	public abstract void waitForElementPresent(By locator);
	public abstract void waitForPageTitlePresent(String title);

	// Generic Method To return Instance of a class
	
	public <TPage extends BasePage> TPage getInstance(Class<TPage> pageClass) {
		
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		} 

	}
	

}
