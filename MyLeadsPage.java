package com.leaftaps.pages;

import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class MyLeadsPage extends ProjectSpecificMethod{
	public MyLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
	public CreateLeadPage createLead() {
		driver.findElementByLinkText(property.getProperty("myleadspage.createlead.linktext")).click();
		return new CreateLeadPage(driver);
	}

	public FindWithPhoneNumb findLeads() {
		driver.findElementByLinkText("Find Leads").click();
		return new FindWithPhoneNumb(driver);
		}   
 public MergeLeadPage clickMergeLead() {
	 driver.findElementByLinkText("Merge Leads").click();
	 return new MergeLeadPage(driver);
 }
 
}
