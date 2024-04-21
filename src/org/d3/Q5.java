package org.d3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(" http://greenstech.in/selenium-course-content.html");
	WebElement btnintvq = driver.findElement(By.id("heading20"));
	btnintvq.click();
	System.out.println("a");
	Thread.sleep(5000);
	WebElement btncts = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
	btncts.click();
	}

}
