package org.testleaf.testCases;

import org.testleaf.base.ProjectSpecificMethods;
import org.testleaf.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001_LoginLogout extends ProjectSpecificMethods{

	@BeforeTest
	public void setData() {
		excelFilename ="TC001";
	}
	
	@Test(dataProvider ="fetchData")
	public void CreateLead(String username, String pwd, String companyname, String Firstname, String LastName) {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(pwd)
		.clickOnSubmit()
		.clickonSRMSFA()
		.clickonLeads()
		.ClickonCreateLead()
		.enterCompanyName(companyname)
		.enterLeadname(Firstname)
		.enterLeadLastName(LastName)
		.ClickonCreateLeadButton()
		.verifyLead(Firstname);
		
	}
	
	
}
