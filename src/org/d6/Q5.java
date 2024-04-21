package org.d6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q5 {
	public static void main(String[] args) throws AWTException {
		System.getProperty("webdiver.chrome.driver",
				"C:\\Users\\MUGILAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		Robot r = new Robot();
		WebElement resume = driver.findElement(By.xpath("//div[@id='heading201']"));
		resume.click();
		WebElement resume4 = driver.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
		resume4.click();
		WebElement resume5 = driver.findElement(By.xpath("//embed[@javascript='allow']"));
		ac.contextClick(resume5).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
}
}