package org.locators;

import org.libGlobal.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(xpath="//input[@name='username']"), @FindBy(id="username")})
	private WebElement txtUserName;
	@FindAll({@FindBy(xpath="//input[@name='password']"), @FindBy(id="password")})
	private WebElement txtPassword;
	@FindAll({@FindBy(xpath="//input[@name='login']"), @FindBy(id="login")})
	private WebElement btnLogin;
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
