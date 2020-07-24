package com.leaftaps.pages;

import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class FindLeads extends ProjectSpecificMethod {
	public FindLeads(ChromeDriver driver) {
		this.driver = driver;
	}
	public FindWithPhoneNumb findLeads() {
	driver.findElementByLinkText("Find Leads").click();
	return new FindWithPhoneNumb(driver);
	}  
	
	public FindLeads sendLeadID() {
		driver.findElementByXPath("//input[@name='id']").sendKeys(leadIDMerge);
		return this;
	}
	public FindLeads clickFindLeads() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		return this;
	}
	public FindLeads verifyMerge() {
		String text = driver.findElementByClassName("x-paging-info").getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		return this;
	}
}
