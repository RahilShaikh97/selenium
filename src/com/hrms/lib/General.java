package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class General extends Globle{
	//to provoid all reuseable funtions related to whole application
	public void openApplication() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shaik\\eclipse-workspace\\Java\\Selenium\\src\\drivers\\Firefox\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application Open");
	
			
		}
	
	public void login() {
		
		driver.findElement(By.name(txt_loginname)).sendKeys(username);
		driver.findElement(By.name(txt_password)).sendKeys(pass);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Completed");
		
	}
	
	public void logout() {
		
		driver.findElement(By.linkText(btn_logout)).click();
		System.out.println("Logout completed");
	}
	
	public void closeApplication() {
		
		driver.close();
		System.out.println("Application Close");
		
		
	}
	public void enterintoframe() {
		driver.switchTo().frame(frame_empinfo);
		System.out.println("Enter into Frame");
		
	}
	public void exitfromframe() {
		driver.switchTo().defaultContent();
		System.out.println("Exit from Frame");
	}
	public void addempinfo() {
		driver.findElement(By.xpath(add_btn)).click();
		driver.findElement(By.name(txt_Efn)).sendKeys(FN);
		driver.findElement(By.name(txt_Eln)).sendKeys(LN);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("Employee information successfully added");
		
	}
	
}