package com.mindtree.reusable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverHelper {
		
	public void click(By by,WebDriver driver,String page) {
		driver.findElement(by).click();
	}
	public String getTitle(WebDriver driver,String keys) {
		String title = "";
		title = driver.getTitle();
		return title;
		
	}
	public void clearText(By by,WebDriver driver) {
		driver.findElement(by).click();
		driver.findElement(by).clear();
	}
	public void sendText(By by, WebDriver driver, String keys) {
		driver.findElement(by).click();
		driver.findElement(by).sendKeys(keys);
		
	}
	
}
