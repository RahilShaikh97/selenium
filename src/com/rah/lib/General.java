package com.rah.lib;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

import com.hrms.utility.Log;

public class General extends Globle {
	
public void openApplication() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\shaik\\eclipse-workspace\\Java\\Selenium\\src\\drivers\\Firefox\\geckodriver.exe");
	dr=new FirefoxDriver();
	dr.navigate().to(url);
	System.out.println("Application open Successfuly");
	Log.info("Application Opened");
}
public void login() {
	dr.findElement(By.name(txt_username)).sendKeys(user);
	dr.findElement(By.name(txt_password)).sendKeys(pass);
	dr.findElement(By.name(btn_login)).click();
	System.out.println("Login successful");
	Log.info("login..");
}
public void logout() {
	dr.findElement(By.linkText(btn_logout)).click();
	System.out.println("Loged-out");
	Log.info("logout");
}
public void enterFrame() {
	dr.switchTo().frame(Frame_empinfo);
	System.out.println("YOu are into Frame");
	Log.info("into frame");
}
public void backtopage() {
	dr.switchTo().defaultContent();
	System.out.println("thanks for visit");
	Log.info("exit");
}
public void closeApplication() {
	dr.close();
	System.out.println("application close");
	Log.info("Application close");
}
public void addempinfo() {
	dr.findElement(By.xpath(btn_add)).click();
	dr.findElement(By.name(emp_fn)).sendKeys(Fn);
	dr.findElement(By.name(emp_ln)).sendKeys(Ln);
	dr.findElement(By.id(btn_save)).click();
	System.out.println("Employee information successfully added");
	Log.info("adding employee");
}
}
