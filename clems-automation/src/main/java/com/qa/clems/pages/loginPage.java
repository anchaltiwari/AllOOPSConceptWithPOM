package com.qa.clems.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage extends ClemsBasepage{

	public loginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	// page locators
	By userName = By.name("login");
	By logInButton = By.name("commit");
	By password = By.id("password");
	public void doLogin(String user, String pwd) {
		// user name
		waitForElementVisibility(userName);
		doSenKeys(userName,user);
		//password
		waitForElementVisibility(password);
		doSenKeys(password,pwd);
		// login button
		waitForElementVisibility(password);
		doClick(logInButton);
	}

}
