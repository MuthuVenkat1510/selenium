package org.d5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q1 {
	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		WebElement src1 = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
		WebElement des1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement src2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement des2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		
		ac.dragAndDrop(src1, des1).perform();
		
	
		ac.dragAndDrop(src2, des2).perform();
		
		
	}

}
