package com.leaftaps.pages;

import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class LeadsPage extends ProjectSpecificMethod{
	public LeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
public verifyDeleteLeadPage leads() {
	driver.findElementByLinkText("Find Leads").click();
	return new verifyDeleteLeadPage(driver);
}
}
