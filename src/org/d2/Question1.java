package org.d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("Muthu");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("234568");
	}
}
