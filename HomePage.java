package com.leaftaps.pages;

import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod{
	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	public MyHomePage crmsfa() {
		driver.findElementByLinkText(property.getProperty("homepage.crmsfa.linktext")).click();
		return new MyHomePage(driver);
	}
}
