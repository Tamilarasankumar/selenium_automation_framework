package com.tmb.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.tmb.driver.DriverManager;

public class OrangeHRMHomePage {

	private final By linkwelcome=By.id("Courses.label");

	private final By linklogout=By.id("topframe.logout.label");

	public OrangeHRMHomePage clickWelcome() {

		DriverManager.getDriver().findElement(linkwelcome).click();

		return this;

	}

	public OrangeHRMLoginPage clickLogout() {

		new WebDriverWait(DriverManager.getDriver(),10)

		.until(ExpectedConditions.elementToBeClickable(linklogout)); //old fashioned way

		//	wait.until(d->d.findElement(link_logout).isEnabled()); //java 8 way

		DriverManager.getDriver().findElement(linklogout).click();

		return new OrangeHRMLoginPage();

	}

}