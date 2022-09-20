package step.definations;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePage;
import page.objects.LoginPage;


public class HomeStepDef extends Base {
	
	HomePage homePage = new HomePage();
	LoginPage loginPage = new LoginPage();
	
	@Given("user is on Retail home")
	public void user_is_on_retail_home() {
	    Assert.assertTrue(homePage.isLogoTextDisplayed());
	    logger.info("user is on Home Page");
	}
	@When("user click on MyAccount")
	public void user_click_on_my_account() {
	  homePage.clickOnMyAccount();
	  logger.info("user clicked on MyAccount");
	}
	@When("user click on Login option")
	public void user_click_on_login_option() {
	   homePage.clickOnLogin();
	   logger.info("user clicked on login");
	}
	@When("user enter userName {string} and password {string}")
	public void user_enter_user_name_and_password(String email, String password) {
	   loginPage.enterEmail(email);
	   logger.info("user enter the username "+email);
	   loginPage.enterPassword(password);
	   logger.info("user entered the password "+password);
	}
	@When("user click on login button")
	public void user_click_on_login_button() {
	   loginPage.clickOnLoginButton();
	   logger.info("user clicked on login button");
	}
	@Then("user should be logged into myAccount Page")
	public void user_should_be_logged_into_my_account_page() {
	   Assert.assertTrue(loginPage.isMyAccountTextDisplayed());
	   logger.info("user should be in MyAccount Page");
	}


}
