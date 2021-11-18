package com.mindtree.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	Properties RPS = new Properties();;
	FileInputStream fis;
	
	public ReadPropertyFile() throws IOException,FileNotFoundException {
	FileInputStream fis=new FileInputStream("./ConfigurationFiles/Config.properties");
	RPS.load(fis);
	}
	
	public String getChromeDriverPath() {
		String getDriverPath = RPS.getProperty("ChromeDriverPath");
		if(getDriverPath!=null) {
			return getDriverPath;
		}
		else
			throw new RuntimeException("ChromeDriverPath NOT SPECIFIED");
	}
	
	public String getHeaderParaContent() {
		String HeaderParaContent = RPS.getProperty("HeaderParaContent");
		if(HeaderParaContent!=null) {
			return HeaderParaContent;
		}
		else
			throw new RuntimeException("HeaderParaContent NOT SPECIFIED");
	}
	public String getloggerName() {
		String loggerName = RPS.getProperty("loggerName_1");
		if(loggerName!=null) {
			return loggerName;
		}
		else
			throw new RuntimeException("loggerName_1 NOT SPECIFIED");
	}
	
	public String getTestname() {
		String Testname = RPS.getProperty("Testname");
		if(Testname!=null) {
			return Testname;
		}
		else
			throw new RuntimeException("Testname NOT SPECIFIED");
	}
	public String getlog4jPath() {
		String log4jPath = RPS.getProperty("log4jPath");
		if(log4jPath!=null) {
			return log4jPath;
		}
		else
			throw new RuntimeException("log4jPath NOT SPECIFIED");
	}
	
	public String getChromeDriverKey() {
		String ChromeDriverKey = RPS.getProperty("ChromeDriverKey");
		if(ChromeDriverKey!=null) {
			return ChromeDriverKey;
		}
		else
			throw new RuntimeException("ChromeDriverKey NOT SPECIFIED");
	}
	
	public String geturl() {
		String url = RPS.getProperty("url");
		if(url!=null) {
			return url;
		}
		else
			throw new RuntimeException("URL NOT SPECIFIED");
	}
	
	public String getExtentReportPath() {
		String ExtentReportPath = RPS.getProperty("ExtentReportPath");
		if(ExtentReportPath!=null) {
			return ExtentReportPath;
		}
		else
			throw new RuntimeException("ExtentReportPath NOT SPECIFIED");
	}
	
	public int getimplicitWait() {
		String implicitWait = RPS.getProperty("implicitWait");
		int Iw = 0;
		if(implicitWait!=null) {
			try {
				Iw =Integer.parseInt(implicitWait);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return Iw;
		}
		else
			throw new RuntimeException("ImplicitWait NOT SPECIFIED");
	}

	public String getExcelFilePath() {
		String ExcelFilePath = RPS.getProperty("ExcelFilePath");
		if(ExcelFilePath!=null) {
			return ExcelFilePath;
		}
		else
			throw new RuntimeException("ExcelFilePath NOT SPECIFIED");
	}

	
}
