package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayde\\eclipse\\java-2022-03\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();	// Maximize the web page
		
		// Tag & ID
		//driver.findElement(By.cssSelector("#email")).sendKeys("Smith");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("Smith");
		
		// Tag & Class
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Smith");
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("Smith");
		
		// Tag & Attribute
		//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("Smith");
		//driver.findElement(By.cssSelector("[name=email]")).sendKeys("Smith");
		
		// Tag, Class & Attribute
		 driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("Smith");
	}

}
