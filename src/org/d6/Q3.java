package org.d6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q3 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		Robot r = new Robot();
		WebElement btnclick = driver.findElement(By.id("heading20"));
		btnclick.click();
		WebElement clickcts = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		ac.contextClick(clickcts).keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_UP).click().perform();


	}	

}
