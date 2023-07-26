package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tasklist {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewcustbtn;
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newprojbtn;
	@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement enterprojname;
	@FindBy(xpath="//div[@class='comboboxButton']")
	private WebElement dropdowncustbtn;
	@FindBy(xpath="//div[@class='itemRow cpItemRow ' and text()='Our company']")
	private WebElement newcustdd;
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustname;
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement addprojdesp;
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createprojbtn;
	
	public Tasklist(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewcustbtn() {
		return addnewcustbtn;
	}

	public WebElement getNewprojbtn() {
		return newprojbtn;
	}

	public WebElement getEnterprojname() {
		return enterprojname;
	}

	public WebElement getdropdowncustbtn() {
		return dropdowncustbtn;
	}

	public WebElement getNewcustdd() {
		return newcustdd;
	}

	public WebElement getEntercustname() {
		return entercustname;
	}

	public WebElement getAddprojdesp() {
		return addprojdesp;
	}

	public WebElement getCreateprojbtn() {
		return createprojbtn;
	}

}
