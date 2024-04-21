package org.d4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement txtEmail = driver.findElement(By.className("_3704LK"));
		txtEmail.sendKeys("hp monitor");
		WebElement btnc = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnc.click();

		WebElement btnsrc = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		btnsrc.click();
		WebElement btnsrc1 = driver.findElement(By.className("_2kHMtA"));
		btnsrc1.click();
	}
}
