package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayde\\eclipse\\java-2022-03\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://shop.shoppersdrugmart.ca/?lang=en&_ga=2.137134256.1680090515.1654940616-811793463.1654940616");
		driver.manage().window().maximize();	// Maximize the web page
		
		// class name
		int Sliders = driver.findElements(By.className("plp__bannerImage__1DIlA plp__bannerImage__36XW9")).size();
		System.out.println(Sliders);
		
		// TagName
		int links = driver.findElements(By.tagName("id")).size();
		System.out.println(links);
	}

}
