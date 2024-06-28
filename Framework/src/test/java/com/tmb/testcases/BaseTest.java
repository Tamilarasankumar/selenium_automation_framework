package com.tmb.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.tmb.driver.Driver;

public class BaseTest {


	protected BaseTest() {

	}

	@BeforeMethod
	public void setUp() {
		Driver.initDriver();

	}
	@AfterMethod
	public void teatDwon() {
		Driver.quitDriver();

	}

	

}