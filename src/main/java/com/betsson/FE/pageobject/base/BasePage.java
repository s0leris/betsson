package com.betsson.FE.pageobject.base;

import java.io.IOException;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.betsson.FE.core.DriverFactory;

public class BasePage extends DriverFactory {

		protected WebDriverWait wait;
		protected JavascriptExecutor jsExecutor;

		public BasePage() throws IOException {
			this.wait = new WebDriverWait(driver, 15);
			jsExecutor = ((JavascriptExecutor) driver);
		}

		/**********************************************************************************
		 **CLICK METHODS
		 **********************************************************************************/
		public void waitAndClickElement(WebElement element) throws InterruptedException {
			boolean clicked = false;
			int attempts = 0;
			while (!clicked && attempts < 10) {
				try {
					this.wait.until(ExpectedConditions.elementToBeClickable(element)).click();
					System.out.println("Successfully clicked on the WebElement: " + "<" + element.toString() + ">");
					clicked = true;
				} catch (Exception e) {
					System.out.println("Unable to wait and click on WebElement, Exception: " + e.getMessage());
					Assert.fail("Unable to wait and click on the WebElement, using locator: " + "<" + element.toString() + ">");
				}
				attempts++;
			}
		}

		/**********************************************************************************
		 **SEND KEYS METHODS /
		 **********************************************************************************/
		public void sendKeysToWebElement(WebElement element, String textToSend) throws Exception {
			try {
				this.WaitUntilWebElementIsVisible(element);
				element.clear();
				element.sendKeys(textToSend);
				System.out.println("Successfully Sent the following keys: '" + textToSend + "' to element: " + "<"+ element.toString() + ">");
			} catch (Exception e) {
				System.out.println("Unable to locate WebElement: " + "<" + element.toString() + "> and send the following keys: " + textToSend);
				Assert.fail("Unable to send keys to WebElement, Exception: " + e.getMessage());
			}
		}

		/**********************************************************************************
		 **WAIT METHODS
		 **********************************************************************************/
		public boolean WaitUntilWebElementIsVisible(WebElement element) {
			try {
				this.wait.until(ExpectedConditions.visibilityOf(element));
				System.out.println("WebElement is visible using locator: " + "<" + element.toString() + ">");
				return true;
			} catch (Exception e) {
				System.out.println("WebElement is NOT visible, using locator: " + "<" + element.toString() + ">");
				Assert.fail("WebElement is NOT visible, Exception: " + e.getMessage());
				return false;
			}
		}

		public boolean isElementClickable(WebElement element) {
			try {
				this.wait.until(ExpectedConditions.elementToBeClickable(element));
				System.out.println("WebElement is clickable using locator: " + "<" + element.toString() + ">");
				return true;
			} catch (Exception e) {
				System.out.println("WebElement is NOT clickable using locator: " + "<" + element.toString() + ">");
				return false;
			}
		}

		/**********************************************************************************
		 **PAGE METHODS
		 **********************************************************************************/
		public BasePage loadUrl(String url) throws Exception {
			driver.get(url);
			return new BasePage();
		}

	}
