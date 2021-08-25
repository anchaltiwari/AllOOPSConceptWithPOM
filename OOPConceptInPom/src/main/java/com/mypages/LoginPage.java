/**
 * 
 */
package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author anchal
 * This is login page class
 * https://gmail.com/
 */	
public class LoginPage extends BasePage{
	
	// Page Locators needs to be defined with By Locator
	private By userName = By.name("identifier");
	private By nextButton = By.className("VfPpkd-vQzf8d");
	private By password = By.name("password");
	private By header = By.xpath("//div[contains(text(),'You're signed in')]");

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	// getters:

	/**
	 * @return the userName
	 */
	public WebElement getUserName() {
		return getElement(userName);
	}
	
	public WebElement getPassword() {
		return getElement(password);
	}

	/**
	 * @param userName the userName to set
	 */
//	public void setUserName(By userName) {
//		this.userName = userName;
//	}

	/**
	 * @return the nextButton
	 */
	public WebElement getNextButton() {
		return getElement(nextButton);
	}

	/**
	 * @param nextButton the nextButton to set
	 */
//	public void setNextButton(By nextButton) {
//		this.nextButton = nextButton;
//	}
	
	public String getLoginPageTitle() {
		return getPageTitle();
		
	}
	
	public String getLoginPageHeader() {
		return getPageHeader(header);
		
	}
	
	/**
	 * 
	 * @param uname
	 * @param pwd
	 * @return
	 */
	public HomePage doLogin(String uname, String pwd) {
		getUserName().sendKeys(uname);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getNextButton().click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getPassword().sendKeys(pwd);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getNextButton().click();
		
		return getInstance(HomePage.class);
	}
	
	// Method Overloading
	/** Method OverLoading, Same Signature ( Name of the methods and method type(public/private) should be same )
	 *  but different arguments, arguments must be different(type or number).
	 */
	public HomePage doLogin() {
		getUserName().sendKeys("");
		getNextButton().click();
		getPassword().sendKeys("");
		getNextButton().click();
		
		return getInstance(HomePage.class);
	}
	
	// username: anchalvaibhav87@gmail.com
	// password: abcd
	public void doLogin(String uname) {
		if(uname.contains("username")) {
			getUserName().sendKeys(uname.split(":")[1].trim());
		}else if(uname.contains("password")) {
			getPassword().sendKeys("password".split(":")[1].trim());
		}
		getNextButton().click();

	}
	
	
}
