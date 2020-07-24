package com.leaftaps.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.pages.LoginPage;
import com.leataps.testng.base.ProjectSpecificMethod;

public class TC005_Mergelead extends ProjectSpecificMethod{
	@BeforeTest
	public void setData() {
		excelFileName="TC005";
	}
	@Test(dataProvider="ArrayData")
	public void runMergeLead(String username,String password,String fName1,String fName2) throws InterruptedException {
		new LoginPage(driver).enterUsername(username).enterPassword(password).login()
		.crmsfa().lead().clickMergeLead().fromWidget().windowHandle1().fName(fName1).clickFindLead().getLeadID()
		.toWidget().switchWindow1().firstName(fName2).findLeadsClick().clickFirstLead()
		.clickMerge().alert().clickFindLead()
		.sendLeadID().clickFindLeads().verifyMerge();
}
}
