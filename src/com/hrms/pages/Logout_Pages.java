package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BasecClass;
import com.hrms.utility.Log;

public class Logout_Pages extends BasecClass {
//obj
	static By txt_logout=By.linkText("Logout");
	//fun
	public static void Logout() {
		driver.findElement(txt_logout).click();
		Reporter.log("Logout Succesfully");
		Log.info("Logout Succefully");
	}
}
