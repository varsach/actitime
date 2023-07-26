package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;


public class MainMethodClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		LoginPage l = new LoginPage(driver);
		l.setLogin("admin", "manager");
		Thread.sleep(2000);
		
		HomePage h=new HomePage(driver);
		h.setTasks();
		Thread.sleep(2000);
		
		

	}

}
