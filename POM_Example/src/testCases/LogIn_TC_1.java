package testCases;

import java.io.PrintStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Dashboard;
import pages.HomePage;
import pages.LogInPage;

public class LogIn_TC_1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayde\\eclipse\\java-2022-03\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoqa.com/books");
		
		HomePage home = new HomePage(driver);
		
		LogInPage login = new LogInPage(driver);
		
		Dashboard dash = new Dashboard(driver);
		
		home.clickLogin();
		
		login.enterUsername(null);
		login.enterPassword(null);
		
		login.clickLogin();
		
		System.out.println("The page heading is --" + dash.getHeading());
		
		dash.clickLogout();
		
		driver.quit();
	
	}

}
