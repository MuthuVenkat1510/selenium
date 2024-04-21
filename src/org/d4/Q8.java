package org.d4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		WebElement txtEmail = driver.findElement(By.id("username"));
		txtEmail.sendKeys("greens");
		String v1 = txtEmail.getAttribute("value");
		System.out.println(v1);
		WebElement btnsrc = driver.findElement(By.id("password"));
		btnsrc.sendKeys("123456789");
		String v2 = btnsrc.getAttribute("value");
		System.out.println(v2);
		
	}
}
