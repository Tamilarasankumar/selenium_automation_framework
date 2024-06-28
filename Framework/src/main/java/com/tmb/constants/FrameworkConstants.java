package com.tmb.constants;

public final class FrameworkConstants {
	private FrameworkConstants() {
		
	}
	private static final String RRESOURCESPATH=System.getProperty("user.dir")+"/src/test/resources";
	private static final String CHROMEDRIVERPATH=RRESOURCESPATH+"/executables/chromedriver.exe";
	private static final String CONFIGFILEPATH=RRESOURCESPATH+"/config/config.properties";
	private static final int EXPLICITWAIT=500;

	
	public static int getExplicitwait() {
		return EXPLICITWAIT;
	}





	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}


	


	public static String getConfigFilePath() {
		return CONFIGFILEPATH;
	}
}
