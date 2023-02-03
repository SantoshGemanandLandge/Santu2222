package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BasecClass;
import com.hrms.utility.Log;

public class AddEmp_Page extends BasecClass {
//obj
	static By frame_enter=By.xpath("//input[@value='Add']");
	static By txt_EFN=By.name("txtEmpFirstName");
	static By txt_ELN=By.name("txtEmpLastName");
	static By txt_save=By.id("btnEdit");
	public static void AddEmp(String EFN,String ELN) {
		driver.switchTo().frame("rightMenu");
		System.out.println("Enter the Frame");
		Reporter.log("Enter the Frame");
		Log.info("Enter the Frame");
		driver.findElement(frame_enter).click();
		driver.findElement(txt_EFN).sendKeys(EFN);
		driver.findElement(txt_ELN).sendKeys(ELN);
		driver.findElement(txt_save).click();
		Reporter.log("Add emp Succesfully");
		Log.info("Add Emp Succesfully");
		driver.switchTo().defaultContent();
		//System.out.println("Exit Frame");
		Reporter.log("Exit Frame");
		Log.info("Exit emp");
	
	}
}

