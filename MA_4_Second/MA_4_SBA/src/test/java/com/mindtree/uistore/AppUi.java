package com.mindtree.uistore;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;

import com.mindtree.utilities.ReadPropertyFile;

public class AppUi {
	public String url;
	ReadPropertyFile rs;
	
	public AppUi(){
	try {
		this.rs = new ReadPropertyFile();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	url= rs.geturl();
	}
	
	public static By searchIcon = By.xpath("//*[@id=\"nav\"]/div[2]/ul/li[7]/a/img");
	public static By searchBar = By.xpath("//*[@id=\"search-box-input\"]");
	public static By searchResultDiv = By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/div[1]");
	
	public static By Tips= By.xpath("//*[@id=\"nav\"]/div[2]/ul/li[4]/a/div/h3");
	
	public static By essentials = By.xpath("//*[@id=\"footer-wrapper\"]/div[2]/div[1]/div[1]/div[1]/div/div[1]/ul/li[4]/a");
	public static By reviewButton= By.id("WAR");
}
