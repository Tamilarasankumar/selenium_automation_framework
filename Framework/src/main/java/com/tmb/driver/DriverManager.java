package com.tmb.driver;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public final class DriverManager {

	private DriverManager() {

	}

	private static ThreadLocal<WebDriver> dr=ThreadLocal.withInitial(()->{

		System.setProperty("webdriver.chrome.driver", "/src/test/resources/executables/chromedriver.exe");

		return new ChromeDriver();

	});

	public static WebDriver getDriver() {

		return dr.get();

	}

	public static void setDriver(WebDriver driverref) {

		dr.set(driverref);

	}

	public static void unload() {

		dr.remove();

	}

}