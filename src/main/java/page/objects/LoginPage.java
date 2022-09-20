package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPage extends Base{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-email")
	private WebElement emailTextBox;
	
	@FindBy(id="input-password")
	private WebElement passwordTextBox;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//h2[text()='My Account']")
	private WebElement myaccountText;
	
	public void enterEmail(String email) {
		emailTextBox.sendKeys(email);
	}
	
	public void enterPassword(String password) {
		passwordTextBox.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public boolean isMyAccountTextDisplayed() {
		if(myaccountText.isDisplayed())
			return true;
		else return false;
	}

}
