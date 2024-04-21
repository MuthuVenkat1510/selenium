package org.d3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
WebElement txtusr = driver.findElement(By.xpath("//input[@id='email']"));
txtusr.sendKeys("9585177353");
WebElement txtpass = driver.findElement(By.xpath("//input[@type='password']"));
txtpass.sendKeys("12326543466964");
	}

}
