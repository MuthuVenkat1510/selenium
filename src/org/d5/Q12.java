package org.d5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q12 {
	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.chrome.driver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		WebElement dept = driver.findElement(By.xpath("(//a[@data-id='departmentsFlyout'])[1]"));
		ac.moveToElement(dept).perform();
		WebElement paint = driver.findElement(By.xpath("(//a[text()='Paint'])[1]"));
		
		ac.moveToElement(paint).perform();
		WebElement inte = driver.findElement(By.xpath("(//a[text()='Interior Paint'])[1]"));
		ac.moveToElement(inte).perform();
		WebElement celing = driver.findElement(By.xpath("(//a[text()='Ceiling Paint'])[1]"));
		ac.moveToElement(celing).perform();

		celing.click();

}
}
