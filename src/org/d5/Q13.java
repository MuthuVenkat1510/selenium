package org.d5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q13 {
	public static void main(String[] args) throws InterruptedException {
	System.getProperty("webdriver.chrome.driver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	Actions ac = new Actions(driver);
	WebElement mbl = driver.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
	ac.moveToElement(mbl).perform();
	WebElement paint = driver.findElement(By.xpath("//span[text()='Plain Back Covers']"));
	
	ac.moveToElement(paint).perform();
	
	paint.click();

	}
}
