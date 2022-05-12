package com.HrmProject.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.HrmProject.pom.LoginPageObject;
import com.HrmProject.utility.BaseClass;

public class LoginTest extends BaseClass {
	@Test
	public void verifyLogin01() {
		LoginPageObject login= PageFactory.initElements(driver, LoginPageObject.class);
		login.getUsername().sendKeys(excel.getStringData("Sheet1", 1, 0));
		login.getPassword().sendKeys(excel.getStringData("Sheet1", 1, 1));
		login.getLogin().click();
		
	}
	
} 