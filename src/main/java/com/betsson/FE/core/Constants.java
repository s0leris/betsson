package com.betsson.FE.core;

public class Constants {

	/** Configuration Properties file **/
	public final static String CONFIG_PROPERTIES_DIRECTORY = System.getProperty("user.dir") + "\\src\\main\\java\\com\\betsson\\FE\\resources\\config.properties";
	
	/** Directory paths for web browser drivers **/
	public final static String GECKO_DRIVER_DIRECTORY = System.getProperty("user.dir") + "\\driver\\geckodriver.exe";
	public final static String CHROME_DRIVER_DIRECTORY = System.getProperty("user.dir") + "\\driver\\chromedriver.exe";
	public final static String IE_DRIVER_DIRECTORY = System.getProperty("user.dir") + "\\driver\\IEDriverServer.exe";
	
	/** URLs **/
	public final static String BETSSON_URL = "https://www.betsson.com/en/";
	
}
