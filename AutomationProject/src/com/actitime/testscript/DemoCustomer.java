package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;

import com.actitime.pom.Tasklist;

public class DemoCustomer extends BaseClass {

	@Test
	public void createcustmer() throws InterruptedException {
		Reporter.log("createcustomer",true);
		
		HomePage h=new HomePage(driver);
		h.setTasks();
		Tasklist t=new Tasklist(driver);
		t.getAddnewcustbtn().click();
		Thread.sleep(2000);
		t.getNewprojbtn().click();
		Thread.sleep(2000);
		t.getEnterprojname().sendKeys("banking_project");
		Thread.sleep(2000);
		t.getdropdowncustbtn();
		Thread.sleep(2000);
		t.getNewcustdd().click();
		Thread.sleep(2000);
		t.getAddprojdesp().sendKeys("all_banks");
		Thread.sleep(2000);
		t.getCreateprojbtn().click();
		Thread.sleep(2000);
		
		
	}

}
