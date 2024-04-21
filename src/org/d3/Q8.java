package org.d3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
WebElement btnres = driver.findElement(By.xpath("//div[@id='heading201']"));
btnres.click();
System.out.println("a");
WebElement btnre1 = driver.findElement(By.xpath("//a[text()='Resume Model-1 ']"));
btnre1.click();
	}
}