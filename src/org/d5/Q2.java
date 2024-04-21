package org.d5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q2 {
	public static void main(String[] args) {
		System.getProperty("webdriver.chrome.driver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		ac.moveToElement(prime).perform();
		prime.click();
}
}//img[@id='multiasins-img-link']