package com.tmb.testcases;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import com.tmb.constants.FrameworkConstants;

public class BaseTest {

	WebDriver driver;

	@BeforeMethod

	public void setUp() {

		System.setProperty("webdriver.chrome.driver",FrameworkConstants.getChromeDriverPath());

		WebDriver driver=new ChromeDriver();
		
		this.driver = driver;

		driver.get("https://google.com");

	}

	@AfterMethod

	public void teatDwon() {

		driver.quit();

	}

}