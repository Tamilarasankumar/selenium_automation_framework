package com.tmb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.tmb.constants.FrameworkConstants;

import com.tmb.driver.DriverManager;

public class BasePage {
	
	protected void click(By by, String waitstrategy) {
		if(waitstrategy.equalsIgnoreCase("clickable")) {
			explicityWaitForElementToBeClickable(by);
		}
		else if(waitstrategy.equalsIgnoreCase("present")) {
			explicitlyWaitForElementToBePresent(by);
		}
		explicityWaitForElementToBeClickable(by);
		DriverManager.getDriver().findElement(by).click();
	}
	
	protected void sendKeys(By by,String value,String waitstrategy) {
		if(waitstrategy.equalsIgnoreCase("clickable")) {
			explicityWaitForElementToBeClickable(by);
		}
		else if(waitstrategy.equalsIgnoreCase("present")) {
			explicitlyWaitForElementToBePresent(by);
		}
		explicityWaitForElementToBeClickable(by);
		DriverManager.getDriver().findElement(by).sendKeys(value);
		}
	
	public String getPageTitle() {
		return DriverManager.getDriver().getTitle();
		
	}
	private void explicityWaitForElementToBeClickable(By by) {
		new WebDriverWait(DriverManager.getDriver(),FrameworkConstants.getExplicitwait())
		.until(ExpectedConditions.elementToBeClickable(by)); //old fashioned way
	}
	
	private void explicitlyWaitForElementToBePresent(By by) {
		new WebDriverWait(DriverManager.getDriver(),FrameworkConstants.getExplicitwait())
		.until(ExpectedConditions.presenceOfElementLocated(by));
	}
}

