package org.d10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
	public static void main(String[] args) {
		System.setProperty("webdriver,chrome,driver", "C:\\Users\\MUGILAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement searchTxt = driver.findElement(By.id("twotabsearchtextbox"));
		searchTxt.sendKeys("iphone X");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
