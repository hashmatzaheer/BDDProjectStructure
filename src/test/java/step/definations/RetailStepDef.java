package step.definations;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;
import page.objects.RegisterPage;
import utilities.Utility;

public class RetailStepDef extends Base {
	
	RegisterPage registerPage = new RegisterPage();
	HomePage homePage = new HomePage();
	
	@When("user click on Register option")
	public void user_click_on_register_option() {
		homePage.clickOnRegister();
		logger.info("user clicked on register option");
	}

	@When("user fill the register form with below information")
	public void user_fill_the_register_form_with_below_information(DataTable dataTable) {
		List<Map<String, String>> information = dataTable.asMaps(String.class,String.class);
		
		registerPage.enterFirstName(information.get(0).get("firstName"));
		registerPage.enterLastName(information.get(0).get("lastName"));
		registerPage.enterEmail(information.get(0).get("email"));
		registerPage.enterTelephone(information.get(0).get("telephone"));
		registerPage.enterPassword(information.get(0).get("password"));
		registerPage.enterConfirmPassword(information.get(0).get("PasswordConfirm"));
		registerPage.selectSubscribe(information.get(0).get("subscribe"));
		logger.info("user entered Register Page information");

	}

	@When("user accept privacyPolicy")
	public void user_accept_privacy_policy() {
		registerPage.clickPrivacyPolicy();
		logger.info("user clicked on Privacy Policy");
	}

	@When("user click on Continue Button")
	public void user_click_on_continue_button() {
	    registerPage.clickOnContinueButton();
	    logger.info("user clicked on Continue button");
	}

	@Then("user should see a successfull message {string}")
	public void user_should_see_a_successfull_message(String expected) {
	  Assert.assertEquals(expected, registerPage.getSuccessMessage());
	  logger.info("Account Has Been created successfully");
	  Utility.takeScreenShot();
	  try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
