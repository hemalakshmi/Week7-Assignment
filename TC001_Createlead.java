package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pages.LoginPage;
import com.leataps.testng.base.ProjectSpecificMethod;

public class TC001_Createlead extends ProjectSpecificMethod {
	@BeforeTest
	public void setData() {
		excelFileName="TC001";
	}
	@Test(dataProvider="ArrayData")
	public void runCreateLead(String username,String password,String cName,String fName,String lName,String phoneNumb) {
		LoginPage page = new LoginPage(driver);
		page.enterUsername(username).enterPassword(password).login()
		.crmsfa()
		.lead()
		.createLead()
		.companyName(cName).fName(fName).lName(lName).phoneNumb(phoneNumb).createLeadButton()
		.leadVerify();
	}
}
