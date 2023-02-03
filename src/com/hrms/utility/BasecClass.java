package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BasecClass {
public static WebDriver driver;
public static void OpenApplication() {
	System.setProperty("webdriver.chrome.driver","C:\\Santosh Landge\\Software testing\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	Reporter.log("Application Opend");
}
public static void CloseApplication() {
	driver.close();
	Reporter.log("Application Closed");
}
}
