package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboard {

	WebDriver driver;

	// Constructor that will be automatically called as soon as the object of the
	// class is created
	public Dashboard(WebDriver driver) {

		this.driver = driver;

	}

	// Locators for the page title and the logout button
	By heading = By.xpath("//div[@class=\"main-header\"]");
	By logoutbtn = By.id("submit");

	// Method to capture the page heading
	public String getHeading() {

		String head = driver.findElement(heading).getText();
		return head;
	}

	// Method to click on Logout buttonF
	public void clickLogout() {

		driver.findElement(logoutbtn).click();
	}

}
