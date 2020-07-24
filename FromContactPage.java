package com.leaftaps.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class FromContactPage extends ProjectSpecificMethod{

		public FromContactPage(ChromeDriver driver) {
			this.driver = driver;
		}
		public FromContactPage windowHandle1() {
			Set<String> allWindows = driver.getWindowHandles();
			List<String> allhandles = new ArrayList<>(allWindows);
			driver.switchTo().window(allhandles.get(1));
			return this;
		}
		public FromContactPage fName(String data) {
			driver.findElementByXPath("//input[@name='firstName']").sendKeys(data);
			return this;
		}
		public FromContactPage clickFindLead() throws InterruptedException {
			 driver.findElementByXPath("//button[text()='Find Leads']").click();
				Thread.sleep(1000);
				return this;
		 }
		public MergeLeadPage getLeadID() {
			Set<String> allWindows = driver.getWindowHandles();
			List<String> allhandles = new ArrayList<>(allWindows);
			leadIDMerge = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").getText();
			driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a").click();
			driver.switchTo().window(allhandles.get(0));
			return new MergeLeadPage(driver);
		}
}
