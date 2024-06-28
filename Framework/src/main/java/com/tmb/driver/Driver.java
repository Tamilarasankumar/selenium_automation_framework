package com.tmb.driver;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

import com.tmb.constants.FrameworkConstants;
import com.tmb.utils.ReadPropertyFile;

public final class Driver {

	private Driver() {

	}

	public static void initDriver() throws Exception{

		if(Objects.isNull(DriverManager.getDriver())) {

			System.setProperty("webdriver.chrome.driver",FrameworkConstants.getChromeDriverPath());

			DriverManager.setDriver(new ChromeDriver());

			DriverManager.getDriver().get(ReadPropertyFile.getValue("url"));

		}

	}

	public static void quitDriver() {

		if(Objects.nonNull(DriverManager.getDriver())) {

			DriverManager.getDriver().quit();

			DriverManager.unload();

		}

	}

}