package com.generic;

import org.openqa.selenium.WebDriver;

public class Pojo {
	private static WebDriver objWebdriver;
	 private static SeleniumWrapperFunctions SeleniumWrapperFunctions;
private static Utilities objuUtilities;
	public static Utilities getObjuUtilities() {
	return objuUtilities;
}
public static void setObjuUtilities(Utilities objuUtilities) {
	Pojo.objuUtilities = objuUtilities;
}
	public static WebDriver getObjWebdriver() {
		return objWebdriver;
	}
	public static void setObjWebdriver(WebDriver objWebdriver) {
		Pojo.objWebdriver = objWebdriver;
	}
	public static SeleniumWrapperFunctions getSeleniumWrapperFunctions() {
		return SeleniumWrapperFunctions;
	}
	public static void setSeleniumWrapperFunctions(SeleniumWrapperFunctions seleniumWrapperFunctions) {
		SeleniumWrapperFunctions = seleniumWrapperFunctions;
	}
}
