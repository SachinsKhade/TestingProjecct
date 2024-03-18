package com.tests;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flows.ConstantsValue;
import com.flows.TendableFlow;
import com.generic.BaseTest;

public class TendableTest extends BaseTest{
	private TendableFlow objTendableFlow;
	public void initialisedFlowAndPages() {

		objTendableFlow = new TendableFlow();
	}

	@BeforeClass
	public void setup() {
		this.initializeBrowser(ConstantsValue.strBrowser, ConstantsValue.strURL);
		this.initialisedFlowAndPages();
	}
	
@Test
public void TCID_01_verifyTestMenuAccessibility() throws InterruptedException {
	objTendableFlow.tendable_Flow();
}
@AfterClass
public void tearDownEnviorment() {
	this.tearDownEnv();
}

}
