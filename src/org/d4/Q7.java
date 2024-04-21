package org.d4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		WebElement txtEmail = driver.findElement(By.xpath("//input[@class='gLFyf']"));
		txtEmail.sendKeys("greens velmurugan");
		WebElement btnsrc = driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));
		btnsrc.click();
		WebElement txtpara = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
		txtpara.click();
	}
}

		