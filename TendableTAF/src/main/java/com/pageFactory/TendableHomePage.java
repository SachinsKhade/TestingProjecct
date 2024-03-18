package com.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.generic.Pojo;
import com.generic.SeleniumWrapperFunctions;

public class TendableHomePage {
	
// Locators
	By loc_menuOptions = By.xpath("//input[@class='ag-filter-filter'][@type='text']");
	By loc_btnContactUs = By.xpath("//div[@class='button-links-panel']//a[text()='Contact Us']");
	By loc_btnRequestDemo = By.xpath("//div[@class='button-links-panel']//a[text()='Request A Demo']");
	public void verifyHomePageIsDisplayed() {
		String Title = Pojo.getObjWebdriver().getTitle();
		System.out.println(Title);
		String strURL = Pojo.getSeleniumWrapperFunctions().getURL();
		System.out.println(strURL);
	}
	


	// Method to confirm accessibility of top-level menus
	public  boolean confirmMenuAccessibility(String menuName) {
		By locator = By.xpath("//nav[@id='main-navigation-new']//li/a[text()='" + menuName + "']");
		boolean menuAccessible = false;

		// Find the menu item element by its name
		WebElement menuElement = Pojo.getObjWebdriver().findElement(locator);

		// Check if the menu item is accessible
		if (menuElement.isDisplayed() && menuElement.isEnabled()) {
			menuAccessible = true;
			System.out.println("Menu item '" + menuName + "' is accessible.");
		
		} else {
			System.out.println("Menu item '" + menuName + "' is not accessible.");
		}

		return menuAccessible;
	}
	
	 @SuppressWarnings("static-access")
	public  boolean verifyDemoButton() {
	        boolean buttonFound = false;

	        //this.verifyRequestDemoButton("Home", buttonFound);
	        Pojo.getSeleniumWrapperFunctions().waitFor(5);

	        // Verify "Request a Demo" button on Our Story page
	        verifyRequestDemoButton("Our Story", buttonFound);
	        Pojo.getSeleniumWrapperFunctions().waitFor(5);
	        // Verify "Request a Demo" button on Our Solution page
	        verifyRequestDemoButton("Our Solution", buttonFound);

	        // Verify "Request a Demo" button on Why Tendable page
	        verifyRequestDemoButton("Why Tendable?", buttonFound);
	        Pojo.getSeleniumWrapperFunctions().waitFor(5);
	        return buttonFound;
	    }
	 
	// Method to verify "Request a Demo" button on a specific page
	    @SuppressWarnings("static-access")
		private  void verifyRequestDemoButton(String pageName, boolean buttonFound) {
	    	By locator = By.xpath("//nav[@id='main-navigation-new']//li/a[text()='" + pageName + "']");
	        Pojo.getObjWebdriver().findElement(locator).click();
	        WebElement requestDemoButton = null;
	        Pojo.getSeleniumWrapperFunctions().waitFor(5);

	        try {
	            requestDemoButton = Pojo.getObjWebdriver().findElement(loc_btnRequestDemo);
	            
	        } catch (org.openqa.selenium.NoSuchElementException e) {
	            // "Request a Demo" button not found
	            System.out.println("Request a Demo button is not present on " + pageName + " page.");
	        }

	        if (requestDemoButton != null && requestDemoButton.isDisplayed() && requestDemoButton.isEnabled()) {
	            // "Request a Demo" button is present and active
	            buttonFound = true;
	            System.out.println("Request a Demo button is present and active on " + pageName + " page.");
	        } else {
	            // "Request a Demo" button is not present or active
	            System.out.println("Request a Demo button is NOT present or active on " + pageName + " page.");
	        }
	    }
		public void selectContactUsButton()
		{

		Pojo.getObjWebdriver().findElement(loc_btnContactUs).click();
		
		}
}
