package com.mindtree.stepdefinitions;



import java.util.concurrent.TimeUnit;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.mindtree.uistore.AppUi;
import com.mindtree.utilities.ExtentLogUtilities;
import com.mindtree.utilities.Logs;
import com.mindtree.utilities.ReadPropertyFile;
import com.mindtree.utilities.ScreenShot;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	public WebDriver driver;
	public ReadPropertyFile rs;
	public AppUi ap;
	static ExtentTest test;
	static ExtentReports report;
	static Logs logs;
	static ScreenShot se;

	@Given("^User launch Chrome browser and opens url \"([^\"]*)\"$")
	public void user_launch_Chrome_browser_and_opens_url(String URL) throws Throwable {

		rs = new ReadPropertyFile();
		PropertyConfigurator.configure(rs.getlog4jPath());
		String key = rs.getChromeDriverKey();
		String path = rs.getChromeDriverPath();
		System.setProperty(key,path);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get(URL);
		
		report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReports\\" + "ExtentReportResults-"
				+ System.currentTimeMillis() + "-.html");
		String name = Thread.currentThread().getStackTrace()[1].getMethodName();
		logs = new Logs(name);
		
		logs.logger.info("Opening URL");
		test = report.startTest("Open Url");
		ExtentLogUtilities.pass(driver, test, "URL Opened");
		logs.logger.info("URL Opened");
		report.endTest(test);
		report.flush();
	}

	@When("^user clicks on Essentials Select-A-Size on Footer$")
	public void user_clicks_on_Essentials_Select_A_Size_on_Footer() throws Throwable {
		String name = Thread.currentThread().getStackTrace()[1].getMethodName();
		logs = new Logs(name);
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   
	    WebElement element = driver.findElement(AppUi.essentials);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	    Thread.sleep(500);
	    
		logs.logger.info("Clicks on Essentials Select-A-Size Button");
	    driver.findElement(AppUi.essentials).click();
	    test = report.startTest("Essentials Select-A-Size");
		logs.logger.info("Clicks on Essentials Select-A-Size Button");
		ExtentLogUtilities.pass(driver, test, "Clicks on Essentials Select-A-Size Button");
		report.endTest(test);
		report.flush();
		
	}

	@Then("^verify if \"([^\"]*)\" is present in Essentials Select-A-Size Page$")
	public void verify_if_is_present_in_Essentials_Select_A_Size_Page(String arg1) throws Throwable {
		test = report.startTest("Verifying "+arg1+" if Found");
		String name = Thread.currentThread().getStackTrace()[1].getMethodName();
		logs = new Logs(name);
	    if(driver.getPageSource().contains(arg1)) {
				ExtentLogUtilities.pass(driver, test, "verify_if_is_present_in_Essentials_Select_A_Size_Page");
				logs.logger.info(arg1+"is Found");
				report.endTest(test);
				report.flush();
		}
		else {
			ExtentLogUtilities.fail(driver, test,"Verifying Write a Review is found in the Essentials Select-A-Size page ");
			report.endTest(test);
			logs.logger.error(arg1+"is not Found");
			report.flush();
		}

	}
	
	@After
		public void tearDown() {
			driver.close();
		}
	}

