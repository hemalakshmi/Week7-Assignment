package com.leaftaps.pages;



import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class MergeLeadPage extends ProjectSpecificMethod{
	
	public MergeLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	 public FromContactPage fromWidget() {
		 driver.findElementByXPath("//img[@alt='Lookup']").click();
		 return new FromContactPage(driver);
	 }

	 public ToContactPage toWidget() {
		 driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
		 return new ToContactPage(driver);
		 
	 }

	 public MergeAlert clickMerge() {
		 driver.findElementByXPath("//a[text()='Merge']").click();
		 return new MergeAlert(driver);
	 }
}
