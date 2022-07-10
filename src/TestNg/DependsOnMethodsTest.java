package TestNg;

import org.testng.annotations.Test;

public class DependsOnMethodsTest {
	
	@Test
	public void testLogIn() {
		
		System.out.println("LogIn Test");
		//int i = 9/0; 
	}
	
	@Test(dependsOnMethods = "testLogIn")
	public void homePage() {
		
		System.out.println("Website HomePage");
	}
	
	@Test(dependsOnMethods = "testLogIn")
	public void SearchPage() {
		
		System.out.println("Search Page");
	}
	
	@Test(dependsOnMethods = "testLogIn")
	public void RegPage() {
		
		System.out.println("Registration Page");
	}
	
	@Test(dependsOnMethods = "testLogIn")
	public void InfoPage() {
		
		System.out.println("Infomation Page");
	}
}
