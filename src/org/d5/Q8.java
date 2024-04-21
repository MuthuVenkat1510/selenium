package org.d5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q8 {
	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html\r\n");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		WebElement home = driver.findElement(By.xpath("//div[@title='Courses']"));
		ac.moveToElement(home).perform();
		WebElement software = driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
		ac.moveToElement(software).perform();
		WebElement dat = driver.findElement(By.xpath("//span[text()='DataStage Certification Training']"));
		ac.moveToElement(dat).perform();
		dat.click();
}
}
