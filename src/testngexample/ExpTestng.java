package testngexample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExpTestng {
	@BeforeMethod
public void login() {
	System.out.println("Login completed");
	
}
	@AfterMethod
public void logout() {
	System.out.println("Logout Completed");
	
}
	@Test(priority=2)
public void addemp() {
	System.out.println("adding new employee");
}
	@Test(priority=1)
public void delemp() {
	System.out.println("delete emp");
}
}
