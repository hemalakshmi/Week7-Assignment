package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pages.LoginPage;
import com.leataps.testng.base.ProjectSpecificMethod;

public class TC003_Duplicatelead extends ProjectSpecificMethod{
	@BeforeTest
	public void setData() {
		excelFileName="TC002";
	}
	@Test(dataProvider="ArrayData")
	public void runDuplicateLead(String username,String password,String phoneNumb) throws InterruptedException {
		new LoginPage(driver).enterUsername(username).enterPassword(password).login()
		.crmsfa().lead().findLeads().phoneNo(phoneNumb).clickDuplicate()
		.duplicateLead();
}
}
