package com.leaftaps.pages;

import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class DuplicatePage extends ProjectSpecificMethod{
	public DuplicatePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
public DuplicatePage duplicateLead() {
	driver.findElementByName("submitButton").click();
	System.out.println("Title for duplicate lead:" + driver.getTitle());
	return this;
}
}
