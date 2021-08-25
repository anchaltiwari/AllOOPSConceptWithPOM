package com.myTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mypages.HomePage;
import com.mypages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test(priority=1,enabled=false)
	public void verifyLoginPageTitleTest() {
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		Assert.assertEquals(title, "Gmail");
	}
	@Test(priority=2)
	public void loginTest() {
		HomePage homePage = page.getInstance(LoginPage.class).doLogin("anchalvaibhav87@gmail.com", "Welcome@1");
		String homePageHeared = homePage.getHomePageHeader();
		System.out.println("Home page Header is : "+homePageHeared);
		//Assert.assertEquals(homePageHeared, "");
	}
}
