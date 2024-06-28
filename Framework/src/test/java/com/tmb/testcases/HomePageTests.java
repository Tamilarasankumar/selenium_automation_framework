package com.tmb.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.tmb.driver.Driver;

public final class HomePageTests extends BaseTest{


	private HomePageTests() {

	}
	@Test
	public void test3() {
		Driver.initDriver();
		Driver.driver.findElement(By.name("q")).sendKeys("Testing mini bytes",Keys.ENTER);
	}

	

}