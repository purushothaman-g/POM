package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{

	public CreateLeadPage enterCompanyName(String data) {
	    driver.findElementById("createLeadForm_companyName").sendKeys(data);
		return this;
	}
	public CreateLeadPage enterLeadname(String data) {
		driver.findElementById("createLeadForm_firstName").sendKeys(data);
		return this;
	}
	public CreateLeadPage enterLeadLastName(String data) {
		driver.findElementById("createLeadForm_lastName").sendKeys(data);
		return this;
	}
	public ViewLeadPage ClickonCreateLeadButton() {
		driver.findElementByName("submitButton").click();
		return new ViewLeadPage();
	}
	
}
