package com.leaftaps.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class ToContactPage extends ProjectSpecificMethod{
	
	public ToContactPage(ChromeDriver driver) {
		this.driver = driver;
	}
	public ToContactPage switchWindow1() {
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		return this;
	}
	public ToContactPage firstName(String data) {
		driver.findElementByXPath("//input[@name='firstName']").sendKeys(data);
		return this;
	}
	public ToContactPage findLeadsClick() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		return this;
	}
	public MergeLeadPage clickFirstLead() {
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<>(allWindows2);
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
		 driver.switchTo().window(allhandles2.get(0));
		return new MergeLeadPage(driver);
	}
}
