package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {

	public CreateLeadPage ClickonCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}
}
