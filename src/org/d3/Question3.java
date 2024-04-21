package org.d3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html\r\n");
		Thread.sleep(5000);
		WebElement txtusr = driver
				.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched"));
		txtusr.sendKeys("muthu");
		WebElement txtpass = driver.findElement(By.xpath("//input[@type='password']"));
		txtpass.sendKeys("12326543466964");
	}
}