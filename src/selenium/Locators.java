package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayde\\eclipse\\java-2022-03\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();	// Maximize the web page
		
		// ID & Name locators
		WebElement searchbox = driver.findElement(By.id("email"));
		
		searchbox.sendKeys("Jaydeep");
		
		driver.findElement(By.id("pass")).sendKeys("123456");
		
		driver.findElement(By.name("login")).click();
		
		// Link Text and Partial Link Text
		
		driver.findElement(By.linkText("Create a Page")).click();
		
		//driver.findElement(By.partialLinkText("Page")).click();
		
	}

}
