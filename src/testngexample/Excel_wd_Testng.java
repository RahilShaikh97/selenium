package testngexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class Excel_wd_Testng {
WebDriver driver;
@BeforeClass
public void startup() {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\shaik\\eclipse-workspace\\Java\\Selenium\\src\\drivers\\Firefox\\geckodriver.exe");
	driver= new FirefoxDriver();
}
@AfterClass
public void teardown() {
	driver.close();
}
@Test
public void tc001() throws BiffException, IOException, InterruptedException{
	//Read
	FileInputStream file = new FileInputStream("C:\\Users\\shaik\\Documents\\loginpage.xls");
	Workbook wb = Workbook.getWorkbook(file);
	Sheet st=wb.getSheet(0);
	String un= st.getCell(0, 1).getContents();
	String ps=st.getCell(1,1).getContents();
	Reporter.log(un);
	Reporter.log(ps);
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	System.out.println("Application Opened"); //console
	Reporter.log("Application opened"); //html Report
	driver.findElement(By.name("txtUserName")).sendKeys(un);
	driver.findElement(By.name("txtPassword")).sendKeys(ps);
	Thread.sleep(3000);
	driver.findElement(By.name("Submit")).click();
	System.out.println("Login completed");
	Thread.sleep(3000);
	Reporter.log("Login completed");
	Reporter.log(driver.getTitle());
	driver.findElement(By.linkText("Logout")).click();
	Reporter.log("Logout completed");
}
}
