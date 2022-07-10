package TestNg;

import org.testng.annotations.*;

public class TestNgBasicTest {

// Pre-condition annotation --- Starting with @before
	@BeforeSuite
	public void setUp() {

		System.out.println("@BeforeSuite---Setup System Property for chrome");
	}

	@BeforeTest
	public void launchTheBrowser() {

		System.out.println("@BeforeTest---Launch The Browser");
	}

	@BeforeClass
	public void logIn() {

		System.out.println("@BeforeClass---Log In to app");
	}

	@BeforeMethod
	public void enterURL() {

		System.out.println("@BeforeMethod---Enterning the URL");
	}

// Test cases --- Starting with @Test
	@Test
	public void googleTitleTest() {

		System.out.println("Google Title Test");
	}
	
	@Test
	public void searchTest() {
		
		System.out.println("Search test");
	}
	
// Post-condition annotation --- Starting with @After	
	@AfterMethod
	public void logOut() {

		System.out.println("@AfterMethod---Logout from app");
	}

	@AfterClass
	public void closeBrowser() {

		System.out.println("@AfterClass---Close Browser");
	}

	@AfterTest
	public void deleteAllCookies() {

		System.out.println("@AfterTest---Delete All Cookies");
	}

}
