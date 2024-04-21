package org.d5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q17 {
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
	
		WebElement fash = driver.findElement(By.xpath("//div[text()='Fashion']"));
		ac.moveToElement(fash).perform();
		WebElement recm = driver.findElement(By.xpath("(//span[text()='Your Recommendations'])[1]"));
		
		ac.moveToElement(recm).perform();
		
		recm.click();

		}

}
