package com.leaftaps.pages;

import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class MergeAlert extends ProjectSpecificMethod{
	public MergeAlert(ChromeDriver driver) {
		this.driver = driver;
	}
	public ViewLeadPage alert() {
		driver.switchTo().alert().accept();
		return new ViewLeadPage(driver);
	}
}
