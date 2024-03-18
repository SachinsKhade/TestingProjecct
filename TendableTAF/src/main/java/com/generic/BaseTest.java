package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {
	private WebDriver driver;
	private SeleniumWrapperFunctions objSeleniumWrapperFunctions;
	
	private Utilities objUtilities;

	public void initializeBrowser(String strBrowser,String strURL) {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		if(strBrowser.equalsIgnoreCase("Chrome")) {
			driver= new ChromeDriver();
		}
		else if(strBrowser.equalsIgnoreCase("Edge")) {
			driver= new EdgeDriver();

		}
		
		objSeleniumWrapperFunctions = new SeleniumWrapperFunctions();
		Pojo.setSeleniumWrapperFunctions(objSeleniumWrapperFunctions);
		driver.manage().window().maximize();
		Pojo.setObjWebdriver(driver);
		Pojo.setObjuUtilities(objUtilities);
		System.out.println("Web environment initialized");
		Pojo.getObjWebdriver().get(strURL);
	
	}

	public void tearDownEnv() {
		driver.close();
		System.out.println("Web Environment Closed");
	}
}
