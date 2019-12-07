package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	
	public ViewLeadPage verifyLead(String data) {
		String text = driver.findElementById("viewLead_firstName_sp").getText();
		if(data.equals(text)) {
			System.out.println(data);
			
		}
		return this;
	}

}
