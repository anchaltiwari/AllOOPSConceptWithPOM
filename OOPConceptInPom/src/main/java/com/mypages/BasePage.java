package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends PageGrandParent{

	public BasePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By Locator) {
		
		return getElement(Locator).getText();
	}

	@Override
	public WebElement getElement(By locator) {
		
		WebElement element = null;
		
		try {
			waitForElementPresent(locator);
			element = driver.findElement(locator);
			return element;
		} catch (Exception e) {
			e.printStackTrace();
			return element;
		}

	}

	@Override
	public void waitForElementPresent(By locator) {
		
	
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void waitForPageTitlePresent(String title) {
		try {
			wait.until(ExpectedConditions.titleContains(title));
		} catch(Exception e) {
			e.printStackTrace();

		}
	}

}
