package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pages.LoginPage;
import com.leataps.testng.base.ProjectSpecificMethod;

public class TC004_Editlead extends ProjectSpecificMethod{
	@BeforeTest
	public void setData() {
		excelFileName="TC004";
	}
	@Test(dataProvider="ArrayData")
	public void runDeleteLead(String username,String password,String phoneNumb,String updateName) throws InterruptedException {
		new LoginPage(driver).enterUsername(username).enterPassword(password).login()
		.crmsfa().lead().findLeads().phoneNo(phoneNumb).clickEdit().editCompName(updateName);
}
}
