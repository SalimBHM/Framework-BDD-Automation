package com.selenium.e2eTests.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonMethods {

	public WebDriver driver;
	public static Properties prop;
	public static Properties prop1;

	public CommonMethods() {
		driver = Setup.driver;
	}

	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);

	public void openApplication() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/configs/config.properties");
		prop.load(fis);
		driver.get(prop.getProperty("url"));
	}

	public void openURL() throws IOException {
		prop1 = new Properties();
		FileInputStream fis = new FileInputStream("src/test/resources/configs/config.properties");
		prop1.load(fis);
		driver.get(prop1.getProperty("url1"));
	}

	public void autocomplete1(WebElement element, String value) throws InterruptedException {
		element.sendKeys(Keys.CONTROL, Keys.chord("a"));
		element.sendKeys(Keys.DELETE);
		element.sendKeys(value);
		Thread.sleep(2000);
		element.sendKeys(Keys.ARROW_DOWN);
		element.sendKeys(Keys.ENTER);
	}

	public void autocomplete(WebElement element, int index) {
		WebElement autoOptions = element;
		List<WebElement> optionsToSelect = autoOptions.findElements(By.tagName("li"));
		int indexToSelect = index;
		if (indexToSelect <= optionsToSelect.size()) {
			optionsToSelect.get(indexToSelect).click();
		}
	}
}