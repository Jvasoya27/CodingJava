package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedShadowDom {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayde\\eclipse\\java-2022-03\\eclipse\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://shop.polymer-project.org/");
		driver.manage().window().maximize();
		
		WebElement root = driver.findElement(By.tagName("shop-app"));  // Root node /Shadow host
		WebElement shadowDom1 = getShadowDom(root, driver);
		WebElement ironPages = shadowDom1.findElement(By.tagName("iron-pages"));
		WebElement shopHome = ironPages.findElement(By.name("home"));
		
		WebElement shadowDom2 = getShadowDom(shopHome, driver);
		
		shadowDom2.findElement(By.cssSelector("div:nth-child(3) > shop-button >a")).click();
		
	}
	
	static WebElement getShadowDom(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement shadowDom1 = (WebElement) js.executeScript("return arguments[0].shadowRoot", element);
		return shadowDom1;
	}

}
