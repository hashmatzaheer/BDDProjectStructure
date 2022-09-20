package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RegisterPage extends Base{
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-firstname")
	private WebElement firstNameTextBox;
	
	@FindBy(id="input-lastname")
	private WebElement lastNameTextBox;
	
	@FindBy(id="input-email")
	private WebElement emailTextBox;
	
	@FindBy(id="input-telephone")
	private WebElement telephoneTextBox;
	
	@FindBy(id="input-password")
	private WebElement passwordTextBox;
	
	@FindBy(id="input-confirm")
	private WebElement confirmPasswordTextBox;
	
	@FindBy(xpath="//input[@name='newsletter' and @value='1']")
	private WebElement yesSubscribe;
	
	@FindBy(xpath="//input[@name='newsletter' and @value='0']")
	private WebElement noSubscribe;
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement privacyPolicy;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	private WebElement successMessage;
	
	public void enterFirstName(String firstname) {
		firstNameTextBox.sendKeys(firstname);
	}
	
	public void enterLastName(String lastName) {
		lastNameTextBox.sendKeys(lastName);
	}
	
	public void enterEmail(String email) {
		emailTextBox.sendKeys(email);
	}
	
	public void enterTelephone(String telephone) {
		telephoneTextBox.sendKeys(telephone);
	}
	
	public void enterPassword(String password) {
		passwordTextBox.sendKeys(password);
	}
	
	public void enterConfirmPassword(String confirmPassword) {
		confirmPasswordTextBox.sendKeys(confirmPassword);
	}
	
	public void selectSubscribe(String option) {
		if(option.equalsIgnoreCase("yes") && !yesSubscribe.isSelected())
			yesSubscribe.click();
		else
			noSubscribe.click();
	}
	
	public void clickPrivacyPolicy() {
		privacyPolicy.click();
	}
	
	public void clickOnContinueButton() {
		continueButton.click();
	}
	
	public String getSuccessMessage() {
		String actualMessage=successMessage.getText();
		return actualMessage;
	}

}
