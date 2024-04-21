package org.d6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q9 {
	 
	public static void main(String[] args) throws AWTException {
		System.getProperty("webdiver.chrome.driver",
				"C:\\Users\\MUGILAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/\r\n");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		Robot r = new Robot();
		WebElement frame = driver.findElement(By.id("nav-link-accountList"));
		frame.click();
		WebElement newacc = driver.findElement(By.xpath("//a[contains(text(),'Create')]"));
		newacc.click();
		WebElement firstName = driver.findElement(By.id("ap_customer_name"));
		firstName.sendKeys("Muthukumar");
		ac.doubleClick(firstName).perform();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
		WebElement pass = driver.findElement(By.id("ap_password"));
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
	 }		
}
