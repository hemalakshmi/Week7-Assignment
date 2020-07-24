package com.leaftaps.pages;

import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod{
	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	public MyLeadsPage lead() {
		driver.findElementByLinkText(property.getProperty("myhomepage.leads.linktext")).click();
		return new MyLeadsPage(driver);
	}
	
}
