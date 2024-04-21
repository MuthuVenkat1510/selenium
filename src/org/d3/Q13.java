package org.d3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q13 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/\r\n");
		WebElement btnsig = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		btnsig.sendKeys("9585177353");
		WebElement btnsig1 = driver.findElement(By.className("submitBottomOption"));
		btnsig1.click();

	}
}