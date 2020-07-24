package com.leaftaps.pages;

import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod{
	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	public ViewLeadPage leadVerify() {
		System.out.println("Lead created successfully");
		String text=driver.findElementByXPath(property.getProperty("viewleadpage.leadCname.xpath")).getText();
		System.out.println("Company Name: " + text);
		return this;
}
	public DuplicatePage clickDuplicate() {
		driver.findElementByLinkText("Duplicate Lead").click();
		return new DuplicatePage(driver);
	}
	
	public EditPage clickEdit() {
		driver.findElementByLinkText("Edit").click();
		return new EditPage(driver);
	}
	public FindLeads clickFindLead() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeads(driver);
	}
}

