package com.tmb.testcases;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.testng.annotations.Test;

public class HomePageTests extends BaseTest{

	@Test

	public void test3() {

		driver.findElement(By.name("q")).sendKeys("Testing mini bytes",Keys.ENTER);

	}

}