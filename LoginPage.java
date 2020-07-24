package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.leataps.testng.base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod{
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}
public LoginPage enterUsername(String data) {
	driver.findElement(By.id(property.getProperty("loginpage.username.id"))).sendKeys(data);
	return this;
}
public LoginPage enterPassword(String data) {
	driver.findElement(By.id(property.getProperty("loginpage.password.id"))).sendKeys(data);
	return this;
}
public HomePage login() {
	driver.findElementByClassName(property.getProperty("loginpage.loginbutton.class")).click();
	return new HomePage(driver);
}
}
