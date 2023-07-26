package com.actitime.testscript;

import java.io.IOException;

import com.actitime.generic.FileLib;

public class DemoGenericLibrary {

	public static void main(String[] args) throws IOException {
		FileLib f=new FileLib();
		System.out.println(f.getpropertyData("username"));
		
		System.out.println(f.getExcelData("createcustomer", 1, 3));
		
		f.setExcelData("createcustomer", 1, 5, "pass or fail");

	}

}
