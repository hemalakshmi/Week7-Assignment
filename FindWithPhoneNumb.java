package com.leaftaps.pages;

import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class FindWithPhoneNumb extends ProjectSpecificMethod{
	public FindWithPhoneNumb(ChromeDriver driver) {
		this.driver = driver;
	}
	public DeletePage phoneNumb(String data) throws InterruptedException {
	driver.findElementByXPath("//span[text()='Phone']").click();
	driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(data);
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(2000);
	leadID = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").getText();
	driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
	return new DeletePage(driver);
}
	public ViewLeadPage phoneNo(String data) throws InterruptedException {
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(data);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a").click();
		return new ViewLeadPage(driver);
	}
}
