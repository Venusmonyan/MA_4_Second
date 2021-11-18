package com.mindtree.utilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class OpenChrome {
public static WebDriver driver;
@BeforeClass
public void setup() throws FileNotFoundException, IOException {
	ReadPropertyFile r = new ReadPropertyFile();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("start-maximized");
	System.setProperty(r.getChromeDriverKey(), r.getChromeDriverPath());
	driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(r.getimplicitWait(),TimeUnit.SECONDS);
}

@AfterClass
public void tearDown() {
	driver.quit();
}

}
