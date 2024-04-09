package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.training.base.BasePage;

public class LoginPage extends BasePage{ 

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//input[@name='Login']")
	WebElement login;
	
	@FindBy(xpath="//span[@id='userNavLabel']")
	WebElement profile;
	
	@FindBy(xpath="//a[@title='Logout']")
	WebElement logout;
	
	@FindBy(id="rememberUn")
	WebElement rememberme;
	
	@FindBy(id="forgot_password_link")
	WebElement forgotpassword;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement typeusername;
	
	@FindBy(name="continue")
	WebElement continueButton;
	
	@FindBy(xpath="//a[contains(text(),'Return to Login')]")
	WebElement returntohomepage;
	
	@FindBy(name="username, password")
	WebElement wrongusernameandpassword;
	

	public void enterintoUsername(String strusername) {
		waitforElement(username);
		username.sendKeys(strusername);
		
	}
	public void enterintoPassword(String strpassword) {
		waitforElement(password);
		password.sendKeys(strpassword);
	}
	public void clickLogin() {
		waitforElement(login);
		login.click();
		
	}
	
	public void clickprofile () throws InterruptedException {
		waitforElement(profile);
		profile.click();
		
		
	}
	
	public void clickLogout () {
		waitforElement(logout);
		logout.click();
	}
	
	public void rememberme() {
		waitforElement(rememberme);
		rememberme.click();
	}
	
	public void forgotpassword() {
		waitforElement(forgotpassword);
		forgotpassword.click();
	}
	
	public void typeusername(String strtypeusername) {
		waitforElement(typeusername);
		typeusername.sendKeys(strtypeusername);
		
	}
	
	public void continueButton() {
		waitforElement(continueButton);
		continueButton.click();
	}
	
	public void returntohomepage() {
		waitforElement(returntohomepage);
		returntohomepage.click();
	}
	
	public void wrongusernameandpassword () {
		waitforElement(wrongusernameandpassword);
		wrongusernameandpassword.sendKeys();
	}
	
}
	
	