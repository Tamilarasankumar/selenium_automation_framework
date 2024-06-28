package com.tmb.pages;

import org.openqa.selenium.By;

import com.tmb.driver.DriverManager;

public final class OrangeHRMLoginPage {

	private final By textboxusername=By.id("user_id");

	private final By textboxpassword=By.id("password");

	private final By buttonlogin=By.id("entry-login");

	public OrangeHRMLoginPage enterUserName(String username) {

		DriverManager.getDriver().findElement(textboxusername).sendKeys(username);

		return this;

	}

	public OrangeHRMLoginPage enterPassword(String password) {

		DriverManager.getDriver().findElement(textboxpassword).sendKeys(password);

		return this;

	}

	public OrangeHRMHomePage clickLogin() {

		DriverManager.getDriver().findElement(buttonlogin).click();

		return new OrangeHRMHomePage();

	}

	public String getTitle() {

		return DriverManager.getDriver().getTitle();

	}

}