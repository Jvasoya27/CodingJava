package TestNg;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class GoogleTest {

	WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayde\\eclipse\\java-2022-03\\eclipse\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 1, groups = "Title")
	public void googleTitleTest() {

		String title = driver.getTitle();
		System.out.println(title);

		assertEquals(title, "Google", "title is not matched");
	}

	@Test(priority = 3, groups = "Test")
	public void googleLogoTest() {

		boolean b1 = driver.findElement(By.className("lnXdpd")).isDisplayed();
		assertTrue(b1);
	}

	@Test(priority = 2, groups = "Link")
	public void mailLinkTest() {

		boolean b2 = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}

	@Test(priority = 6, groups = "Test")
	public void test1() {

		System.out.println("Test = 1");
	}

	@Test(priority = 5, groups = "Test")
	public void test2() {

		System.out.println("Test = 2");
	}

	@Test(priority = 4, groups = "Test")
	public void test3() {

		System.out.println("Test = 3");
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
