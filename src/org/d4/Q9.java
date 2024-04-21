package org.d4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q9 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement txtEmail = driver.findElement(By.name("keyword"));
		txtEmail.sendKeys("hp laptop");
		
		WebElement btnsrc = driver.findElement(By.xpath("//span[text()='Search']"));
		btnsrc.click();
		WebElement btnsrc1 = driver.findElement(By.xpath("//p[contains(text(),'mind')]"));
		btnsrc1.click();
	}
}
