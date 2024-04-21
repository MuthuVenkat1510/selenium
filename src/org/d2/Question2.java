package org.d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/ ");
		WebElement txtfrom = driver.findElement(By.id("src"));
		txtfrom.sendKeys("vridhachalam");
		WebElement txtto = driver.findElement(By.id("dest"));
		txtto.sendKeys("chidambaram");
	}

}
