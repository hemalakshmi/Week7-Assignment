package com.leaftaps.pages;

import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class EditPage extends ProjectSpecificMethod{
	public EditPage(ChromeDriver driver) {
		this.driver = driver;
	}
public EditPage editCompName(String data) {
	driver.findElementById("updateLeadForm_companyName").clear();
	driver.findElementById("updateLeadForm_companyName").sendKeys(data);
	driver.findElementByName("submitButton").click();
	System.out.println("Edited Successfully");
	return this;
}
}
