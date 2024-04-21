package org.d5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q11 {
	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.chrome.driver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		WebElement dept = driver.findElement(By.xpath("(//a[@data-id='departmentsFlyout'])[1]"));
		ac.moveToElement(dept).perform();
		WebElement heat = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
		Thread.sleep(5000);
		ac.moveToElement(heat).perform();
		WebElement air = driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
		ac.moveToElement(air).perform();
		WebElement port = driver.findElement(By.xpath("(//a[text()='Portable Air Conditioners'])[1]"));
		ac.moveToElement(port).perform();
		Thread.sleep(3000);
		port.click();

}
}