package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Locators4_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jayde\\eclipse\\java-2022-03\\eclipse\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/"); //
		driver.manage().window().maximize(); // Maximize the web page

		// Absolute Xpath

		// driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("Smith");
		// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Smith");
		// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();

		// Relative path

		
		  //driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Smith");
		  //driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Smith");
		  //driver.findElement(By.xpath("//button[@name='login']")).click();
		
		// X path with or
		
		//driver.findElement(By.xpath("//input[@id='email' or @name='email']")).sendKeys("Smith");
		//driver.findElement(By.xpath("//input[@id='pass' or @data-testid='royal_pass']")).sendKeys("Smith");
		 
		// X path with and
		
		//driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("Smith");
		//driver.findElement(By.xpath("//input[@id='pass' and @data-testid='royal_pass']")).sendKeys("Smith");
		
		// X path with Contains() 
		
		//driver.findElement(By.xpath("//input[contains(@data-testid,'email')]")).sendKeys("Smith");  //data-testid="royal_email"
				
		// X path with starts-with() 
		
		driver.findElement(By.xpath("//input[starts-with(@data-testid,'royal')]")).sendKeys("Smith");  //data-testid="royal_email"		
	
	}

}
