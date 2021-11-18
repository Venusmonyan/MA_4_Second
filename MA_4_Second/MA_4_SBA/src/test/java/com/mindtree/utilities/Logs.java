package com.mindtree.utilities;


import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logs {
	public Logger logger;
	ReadPropertyFile rs;
	String name = "";
	public Logs(String name){
	try {
		rs = new ReadPropertyFile();
		this.name = name;
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	logger = Logger.getLogger(this.name);
	PropertyConfigurator.configure(rs.getlog4jPath());
	}
}
