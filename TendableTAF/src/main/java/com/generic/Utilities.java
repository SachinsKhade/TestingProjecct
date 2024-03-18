package com.generic;

import org.openqa.selenium.support.ui.LoadableComponent;

public class Utilities extends LoadableComponent<Utilities>{

	
	public void logReporter(String strPassStatement, String strFailStatement, boolean blnLog) {

		if (blnLog) {
			System.out.println(strPassStatement);
		} else {
			System.out.println(strFailStatement);

		}

	}

	@Override
	protected void load() {

	}

	@Override
	protected void isLoaded() throws Error {

	}
}
