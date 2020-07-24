package com.leaftaps.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;


public class CreateLeadPage extends ProjectSpecificMethod{
	public CreateLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	public CreateLeadPage companyName(String data)
	{
		WebElement eleCompanyname = driver.findElementByXPath(property.getProperty("createleadpage.cName.xpath"));
		eleCompanyname.sendKeys(data);
		return this;
	}
	public CreateLeadPage fName(String data) {
		WebElement eleFirstname = driver.findElementByXPath(property.getProperty("createleadpage.fName.xpath"));
		eleFirstname.sendKeys(data);
		return this;
	}

	public CreateLeadPage lName(String data) {
		WebElement eleLastname = driver.findElementByXPath(property.getProperty("createleadpage.lName.xpath"));
		eleLastname.sendKeys(data);
		return this;
	}

	public CreateLeadPage phoneNumb(String data) {
    WebElement elePhoneNo = driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']");
    elePhoneNo.sendKeys(data);
    return this;
	}
	
	public ViewLeadPage createLeadButton() {
		driver.findElementByXPath(property.getProperty("createleadpage.createlead.xpath")).click();
		return new ViewLeadPage(driver);
	}

}
