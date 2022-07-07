package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitlyExpicitlyWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\jayde\\eclipse\\java-2022-03\\eclipse\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		// Implicitly Wait -- always applied globally -- available for all the
		// WebElements
		// It can be changed anywhere at any time in code	

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement firstname = driver.findElement(By.name("firstname"));
		WebElement Surname = driver.findElement(By.name("lastname"));

		sendKeys(driver, Surname, 10, "Vasoya");
		sendKeys(driver, firstname, 5, "JAydeep");

		WebElement signup = driver.findElement(By.name("websubmit"));
		clickOn(driver, signup, 5);

	}

	// Explicit Wait:
	// 1. No Explicit keyword or method
	// 2. Available with WebDriverWait with some ExpectedConditions
	// 3. Specific to Element
	// 4. Dynamic in nature
	// 5. We should never use Implicitly and Explicit Wait togather:
	// because selenium WD will wait for the element first because of Implicitly
	// Wait and then Explicit Wait will be applied
	// hence total sychronaization wait will be increased for each element

	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {

		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

	public static void clickOn(WebDriver driver, WebElement element, int timeout) {

		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
