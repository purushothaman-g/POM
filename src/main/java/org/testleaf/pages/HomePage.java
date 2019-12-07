package org.testleaf.pages;

import org.testleaf.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
   
	public MyHomePage clickonSRMSFA(){
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}
	
}
