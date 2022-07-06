package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomeExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayde\\eclipse\\java-2022-03\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='input']")).sendKeys("testing");
		//driver.findElement(By.cssSelector("input#input")).sendKeys("testing");
		
		WebElement root = driver.findElement(By.tagName("book-app")); //Shadow host /root ele
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement shadowDom1 = (WebElement) js.executeScript("return arguments[0].shadowRoot", root);								
		
		WebElement appheader = shadowDom1.findElement(By.tagName("app-header"));
		WebElement apptoolbar = appheader.findElement(By.cssSelector("app-toolbar.toolbar.bottom"));
		WebElement bookinputdecorator = apptoolbar.findElement(By.tagName("book-input-decorator"));
		
		bookinputdecorator.findElement(By.cssSelector("input#input")).sendKeys("Testing");
		
		
		
		
		
		
	}

}
