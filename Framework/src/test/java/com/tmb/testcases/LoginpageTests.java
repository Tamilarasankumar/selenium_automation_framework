package com.tmb.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.tmb.driver.Driver;

public final class LoginpageTests extends BaseTest{


	private LoginpageTests(){

	}

	@Test
	public void test2() {
		Driver.driver.findElement(By.name("q")).sendKeys("Testing mini bytes",Keys.ENTER);
	}

	

}