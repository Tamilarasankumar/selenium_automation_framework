package com.tmb.pages;

import org.openqa.selenium.By;

public final class OrangeHRMLoginPage extends BasePage{

	private final By textboxusername=By.id("user_id");
	private final By textboxpassword=By.id("password");
	private final By buttonlogin=By.id("entry-login");
	
	public OrangeHRMLoginPage enterUserName(String username) {
	
		sendKeys(textboxusername,username,"present");
		return this;
		
	}
	
	public OrangeHRMLoginPage enterPassword(String password) {
		
		sendKeys(textboxpassword,password,"present");
		return this;
		
	}
	public OrangeHRMHomePage clickLogin() {
		click(buttonlogin,"clickable");
		return new OrangeHRMHomePage();
	}
	
	
	
}
