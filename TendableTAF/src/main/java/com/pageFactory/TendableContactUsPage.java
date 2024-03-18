package com.pageFactory;

import org.openqa.selenium.By;

import com.generic.Pojo;

public class TendableContactUsPage {
	// Locators

	By loc_btnMarketing = By.xpath("//div[@class='text-center']//button[text()='Contact'][1]");
	By loc_strFullName = By.xpath("//input[@name='fullName']");
	By loc_strOrganizationName = By.xpath("//input[@name='organisationName']");
	By loc_noPhoneNumber = By.xpath("//input[@name='cellPhone']");
	By loc_strEmail = By.xpath("//input[@name='email']");
	By loc_strMessage = By.xpath("//input[@name='message']");
	By loc_btnAgree = By
			.xpath("//div[@class='form']//form[@id='contactMarketingPipedrive-163701']//input[@name='consentAgreed']");
	By loc_drpSelectOption = By
			.xpath("//div[@class='form']//form[@id='contactMarketingPipedrive-163701']//select[@name='jobRole']");
	By loc_btnSubmit = By.xpath("//div[@class='form']//form[@id='contactMarketingPipedrive-163701']//button");
	By loc_strErrorMsg = By.xpath("//div[@class='form']//form[@id='contactMarketingPipedrive-163701']//button");

	public void clickOnMarketingButton() throws InterruptedException {
		// Pojo.getSeleniumWrapperFunctions().waitFor(5);
		Pojo.getObjWebdriver().findElement(loc_btnMarketing).click();

	}

	public void fillContactForm(String name, String organisationName, String PhoneNumber, String Email, String JobRole)
			throws InterruptedException {
		// Fill the name field

		// set full Name
		Pojo.getObjWebdriver().findElement(loc_strFullName);
		Pojo.getSeleniumWrapperFunctions().setText(loc_strFullName, name);

		// set Organization Name
		Pojo.getObjWebdriver().findElement(loc_strOrganizationName);
		Pojo.getSeleniumWrapperFunctions().setText(loc_strOrganizationName, organisationName);

		// set PhoneNumber
		Pojo.getObjWebdriver().findElement(loc_noPhoneNumber);
		Pojo.getSeleniumWrapperFunctions().setText(loc_noPhoneNumber, PhoneNumber);

		// set Email
		Pojo.getObjWebdriver().findElement(loc_strEmail);
		Pojo.getSeleniumWrapperFunctions().setText(loc_strEmail, Email);
		// select job Role
		Pojo.getSeleniumWrapperFunctions().selectDropDown(loc_drpSelectOption, JobRole);

		// Submit the form
		Pojo.getSeleniumWrapperFunctions().click(loc_btnSubmit);

		// Pojo.getSeleniumWrapperFunctions().wait(5);
	}

	public boolean isErrorMessageDisplayed() {
		try {
			return Pojo.getSeleniumWrapperFunctions().checkElementDisplayed(loc_strErrorMsg);
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
}
