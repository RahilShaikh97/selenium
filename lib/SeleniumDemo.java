package hello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumDemo {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","C:\\java\\Drivers\\Chromdriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("http://www.amazon.com");
     System.out.println(driver.getTitle());
     driver.quit();
	}

}
