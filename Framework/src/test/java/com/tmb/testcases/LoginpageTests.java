package com.tmb.testcases;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.testng.annotations.Test;

public class LoginpageTests extends BaseTest{

	@Test
	public void test1() {

		driver.findElement(By.name("q")).sendKeys("Automation",Keys.ENTER);

	}

	public void test2() {

		driver.findElement(By.name("q")).sendKeys("Testing mini bytes",Keys.ENTER);

	}

}