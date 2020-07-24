package com.leaftaps.pages;

import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class DeletePage extends ProjectSpecificMethod{
	public DeletePage(ChromeDriver driver) {
		this.driver = driver;
	}
public LeadsPage delete() {
	driver.findElementByLinkText("Delete").click();
	return new LeadsPage(driver);
}
}
