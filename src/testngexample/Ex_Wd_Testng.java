package testngexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ex_Wd_Testng {
	WebDriver driver;
	@BeforeClass
public void startapp() {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\shaik\\eclipse-workspace\\Java\\Selenium\\src\\drivers\\Firefox\\geckodriver.exe");
	driver = new FirefoxDriver();
	
}
	@AfterClass
	public void tiredown() {
		driver.close();
	}
	@Test
	public void tc001() {
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application opened");//console
		Reporter.log("application opened");
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		Reporter.log("Login completed");
		Reporter.log(driver.getTitle());
		driver.findElement(By.linkText("Logout")).click();
		Reporter.log("Logout completed");
	}
}
   