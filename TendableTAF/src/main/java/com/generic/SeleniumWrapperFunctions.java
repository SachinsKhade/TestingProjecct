package com.generic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWrapperFunctions {
	private WebElement element;
	private Select objSelect;
	private WebDriverWait objWebDriverWait;
	private JavascriptExecutor objJavascriptExecutor;
	public static boolean waitFor(int timeoutsecond) {

		try {
			Thread.sleep(timeoutsecond);
			return true;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;

		}
	}

	public String getURL() {

		String url = Pojo.getObjWebdriver().getCurrentUrl();
		return url;

	}
	
	
	public boolean click(By locator) {
		try {
			waitUntillPresenceOfElement(locator);
			element =  Pojo.getObjWebdriver().findElement(locator);
			objJavascriptExecutor = (JavascriptExecutor)  Pojo.getObjWebdriver();
			objJavascriptExecutor.executeScript("arguments[0].click();", element);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	
	
	
	public List<WebElement> getWebElementList(By locator) {
		return Pojo.getObjWebdriver().findElements(locator);
	}
	
	public boolean checkElementDisplayed(By locator) {
		try {
			waitUntillPresenceOfElement(locator);
			return Pojo.getObjWebdriver().findElement(locator).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return false;
		}
	}

	
	
	public boolean waitUntillPresenceOfElement(By locator) {
		try {
			objWebDriverWait = new WebDriverWait(Pojo.getObjWebdriver(),Duration.ofSeconds(30)); 

			objWebDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return false;
		}
	}
	public boolean setText(By locator, String strText) {

		try {
			waitUntillPresenceOfElement(locator);
			Pojo.getObjWebdriver().findElement(locator).sendKeys(strText);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return false;
		}
	}
	public boolean selectDropDown(By locator, String strValue) {

		try {
			waitUntillPresenceOfElement(locator);
			element = Pojo.getObjWebdriver().findElement(locator);
			objSelect = new Select(element);
			objSelect.selectByValue(strValue);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return false;
		}
	}
}
