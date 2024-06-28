package com.tmb.pages;

import org.openqa.selenium.By;

public final class OrangeHRMHomePage extends BasePage{
	
	private final By linkwelcome=By.id("Courses.label");
	private final By linklogout=By.id("topframe.logout.label");
	
	public OrangeHRMHomePage clickWelcome() {
		click(linkwelcome,"present");
		return this;
		
	}
	
	public OrangeHRMLoginPage clickLogout() {
		
		
	//	wait.until(d->d.findElement(link_logout).isEnabled()); //java 8 way
		click(linklogout,"clickable");
		return new OrangeHRMLoginPage();
		
	}
	
}
