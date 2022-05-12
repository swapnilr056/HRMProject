package com.HrmProject.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObject {
	WebDriver driver;
	
	public LoginPageObject(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how=How.XPATH,using="//input[@id='txtUsername']")
	private WebElement username;
	
	@FindBy(how=How.XPATH,using="//input[@id='txtPassword']")
	private WebElement password;
	@FindBy(how=How.XPATH,using="//input[@id='btnLogin']")
	private WebElement login;
	
	public WebElement getUsername() {
		return username;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getLogin() {
		return login;
	}
	public void setLogin(WebElement login) {
		this.login = login;
	}
	
	
}
