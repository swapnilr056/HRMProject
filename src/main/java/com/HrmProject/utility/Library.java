package com.HrmProject.utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

public class Library {
	// common method 
	public void custoum_sendKeys(String value,WebElement element) {
		try {
			if(element.isEnabled()&&element.isDisplayed()) {
				element.sendKeys(value);
			}
		} catch (Exception e) {
			System.out.println("unable to send value");
		}
		
		
	}
	public void custom_click(WebElement element, String fieldname) {
		try {
			if(element.isEnabled()&&element.isDisplayed()) {
				element.click();
			
			}
		} catch (Exception e) {
			System.out.println("unable to click");
		}
		
		
	}

}
