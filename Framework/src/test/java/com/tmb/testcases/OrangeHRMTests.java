package com.tmb.testcases;

import org.assertj.core.api.Assertions;

import org.testng.annotations.Test;

import com.tmb.pages.OrangeHRMLoginPage;

public final class OrangeHRMTests extends BaseTest{

	private OrangeHRMTests() {

	}

	@Test

	public void loginLogoutTest() {

		String title=new OrangeHRMLoginPage()

				.enterUserName("22CAPMCA014").enterPassword("22CAPMCA014").clickLogin().

				clickWelcome().clickLogout()

				.getPageTitle();

		Assertions.assertThat(title)

		.isEqualTo("Blackboard Learn");

	}

}