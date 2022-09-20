package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePage extends Base {
	/*
	 * Constructor
	 */
	public HomePage() {
		PageFactory.initElements(driver, this);		
	}
	@FindBy(xpath="//a[text()='TEST ENVIRONMENT']")
	private WebElement logoText;
	
	@FindBy(xpath="//input[@name='search']")
	private WebElement searchBar;
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myaccountLink;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginLink;
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement registerLink;
	
	public boolean isLogoTextDisplayed() {
		if(logoText.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void sendTextTosearch(String searchText) {
		searchBar.sendKeys(searchText);
	}
	
	public void clickOnMyAccount() {
		myaccountLink.click();
	}
	
	public void clickOnLogin() {
		loginLink.click();
	}
	
	public void clickOnRegister() {
		registerLink.click();
	}

}
