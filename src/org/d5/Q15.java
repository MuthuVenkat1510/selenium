package org.d5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q15 {
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
	
		WebElement sign = driver.findElement(By.xpath("(//span[text()='Hello, sign in'])[1]"));
		ac.moveToElement(sign).perform();
		WebElement recm = driver.findElement(By.xpath("(//span[text()='Your Recommendations'])[1]"));
		
		ac.moveToElement(recm).perform();
		
		recm.click();

		}
}
