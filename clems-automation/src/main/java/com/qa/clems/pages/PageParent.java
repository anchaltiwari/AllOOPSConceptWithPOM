package com.qa.clems.pages;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageParent {
	public static WebDriver driver;
	public static WebDriverWait wait;

	// PageParent class constructor
	public PageParent(WebDriver driver, WebDriverWait wait) {
		PageParent.driver = driver;
		PageParent.wait = wait;
	}

	// create a method with java genarics and return a new page
	// TestPage, whatever the page class we are going to pass, it will have the
	// class reference of That page
	public <TestPage extends ClemsBasepage> TestPage getInstance(Class<TestPage> pageClass) {
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class, WebDriverWait.class).newInstance(this.driver,
					this.wait);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
