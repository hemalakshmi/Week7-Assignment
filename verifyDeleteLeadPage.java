package com.leaftaps.pages;

import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class verifyDeleteLeadPage extends ProjectSpecificMethod{
	public verifyDeleteLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	public verifyDeleteLeadPage verifyDelete() {
	driver.findElementByXPath("//input[@name='id']").sendKeys(leadID);
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	String text = driver.findElementByClassName("x-paging-info").getText();
	if (text.equals("No records to display")) {
		System.out.println("Text matched");
	} else {
		System.out.println("Text not matched");
	}
return this;
}
}
