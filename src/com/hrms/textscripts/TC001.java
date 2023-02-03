package com.hrms.textscripts;

import org.apache.log4j.xml.DOMConfigurator;

import org.testng.annotations.Test;

import com.hrms.pages.AddEmp_Page;
import com.hrms.pages.Login_Page;
import com.hrms.pages.Logout_Pages;
import com.hrms.pages.Verify_Page;
import com.hrms.utility.BasecClass;

public class TC001 {
@Test
public static void tc001() {
	DOMConfigurator.configure("log4j.xml");
	BasecClass.OpenApplication();
	Verify_Page.verify("hrms");
	Login_Page.login("nareshit","nareshit");
	Verify_Page.verify("OrangeHRM");
	AddEmp_Page.AddEmp("Santosh","Landge");
	Logout_Pages.Logout();
	BasecClass.CloseApplication();
}
}
