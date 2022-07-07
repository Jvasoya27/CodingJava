package selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;



public class FluentWait {

	private static Wait withTimeout;

	public static void main(String[] args) {
		
		System.setProperty("WebDriver.Chrome.driver", "C:\\Users\\jayde\\eclipse\\java-2022-03\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String etitle = "Demo Guru99 Page";
		String atitle = "";
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		atitle = driver.getTitle();
		
		if(atitle.contentEquals(etitle))
		{
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		Wait wait = new FluentWait()
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>() {
			
			public webElement apply(WebDriver driver) {
				
				return
				driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i"));
			}
		});
		
		clickseleniumlink.click();
		
	}

}
