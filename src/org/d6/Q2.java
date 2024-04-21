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

public class Q2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.getProperty("webdriver.chrome.driver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/webhp");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		Robot r = new Robot();
		WebElement txt = driver.findElement(By.name("q"));
		txt.sendKeys("Velmurugan");
		ac.doubleClick(txt).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
	}	
}
