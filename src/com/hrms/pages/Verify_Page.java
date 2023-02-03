package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.BasecClass;
import com.hrms.utility.Log;

public class Verify_Page extends BasecClass {
//Verify fun For Whole Application
	public static void verify(String Title) {
	if(driver.getTitle().equals(Title))
	{
		Reporter.log("Title Matched");
		Log.info("Title Matched");
	}
	else
	{
		Reporter.log("Titled Not Matched");
		Log.info("Title Not Matched");
		Reporter.log(driver.getTitle());
		Log.info(driver.getTitle());
	}
	}
}
