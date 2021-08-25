package com.qa.clems.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClemsBasepage extends PageParent{

	public ClemsBasepage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	// Generic util wrapper:
	
	public void doClick(By locator) {
		driver.findElement(locator).click();
	}
	public void doActionClick(By locator) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(locator)).click().build().perform();
	}
	public void doJavaScriptExecutorClick(By locator) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("argument[0].click();", driver.findElement(locator));
	}
	public void doSenKeys(By locator, String str) {
		driver.findElement(locator).sendKeys(str);
	}
	public String getPageTitle(String title) {
		return driver.getTitle();
		
	}
	public void waitForElementVisibility(By locator) {
		try { 
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (Exception e) {
			String ele = locator.toString();
			e.printStackTrace();
		}
	}
	// creating custom xpath
	public static String createMyXpath(String xpthExpression, Object... args) {
		for(int i = 0; i<args.length; i++) {
			xpthExpression = xpthExpression.replace("{"+ i + "}",(CharSequence) args[i]);
		}
		return xpthExpression;
	}
	// xpath for pattern //li[contains(text(),'String value...')]
	public String myLiXpath(String contatingText) {
		String xpathForGivenText = createMyXpath("li[contains(text(),'{0}')]",contatingText);
		return xpathForGivenText;
		
	}
}
