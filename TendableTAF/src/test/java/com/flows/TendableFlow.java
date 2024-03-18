package com.flows;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import com.pageFactory.TendableContactUsPage;
import com.pageFactory.TendableHomePage;

public class TendableFlow {
	private TendableHomePage objTendableHomePage;
	private TendableContactUsPage objTendableContactUsPage;

	public TendableFlow() {
		objTendableHomePage = new TendableHomePage();
		objTendableContactUsPage = new TendableContactUsPage();
	}

	public void tendable_Flow() throws InterruptedException {
		boolean isMenuOurStoryAccessible = objTendableHomePage
				.confirmMenuAccessibility(ConstantsValue.strMenuOptionsOurStory);
		Assert.assertTrue(isMenuOurStoryAccessible);
		boolean isMenuOurSolutionAccessible = objTendableHomePage
				.confirmMenuAccessibility(ConstantsValue.strMenuOptionsOurSolution);
		Assert.assertTrue(isMenuOurSolutionAccessible);
		boolean isMenuWhyTendablAccessible = objTendableHomePage
				.confirmMenuAccessibility(ConstantsValue.strMenuOptionsWhyTendable);
		Assert.assertTrue(isMenuWhyTendablAccessible);
		objTendableHomePage.verifyDemoButton();
		objTendableHomePage.selectContactUsButton();
		objTendableHomePage.selectContactUsButton();
		objTendableContactUsPage.clickOnMarketingButton();
		objTendableContactUsPage.clickOnMarketingButton();
		objTendableContactUsPage.fillContactForm(ConstantsValue.strFullName, ConstantsValue.strOrganizationName,
				ConstantsValue.strPhoneNumber, ConstantsValue.strMenuEmail, ConstantsValue.strJobRole);
		boolean Error = objTendableContactUsPage.isErrorMessageDisplayed();
		Assert.assertTrue(Error);
	}
}
