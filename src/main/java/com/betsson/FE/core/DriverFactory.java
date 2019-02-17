package com.betsson.FE.core;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import com.betsson.FE.pageobject.LoginPage;

public class DriverFactory {

	public static WebDriver driver;
	public static LoginPage loginPage;

	public WebDriver getDriver() {
		try {
			// Read configuration file and check browser property
			Properties p = new Properties();
			FileInputStream fi = new FileInputStream(Constants.CONFIG_PROPERTIES_DIRECTORY);
			p.load(fi);
			String browserName = p.getProperty("browser");

			// Set driver depending on browser property
			switch (browserName) {
			case "chrome":
				if (null == driver) {
					System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_DIRECTORY);
					// CHROME OPTIONS
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				break;
			case "firefox":
				// code
				if (null == driver) {
					System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_DIRECTORY);
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					driver = new FirefoxDriver();
				}
				break;
			case "ie":
				if (null == driver) {
					DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					System.setProperty("webdriver.ie.driver", Constants.IE_DRIVER_DIRECTORY);
					capabilities.setCapability("ignoreZoomSetting", true);
					//driver = new InternetExplorerDriver(capabilities);
					driver = new InternetExplorerDriver();
					driver.manage().window().maximize();
				}
				break;
			}
		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			loginPage = PageFactory.initElements(driver, LoginPage.class);
			
		}
		return driver;
	}

}
