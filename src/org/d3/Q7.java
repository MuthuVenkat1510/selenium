package org.d3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		WebElement txtfrom = driver.findElement(By.xpath("//input[@title='From station']"));
		txtfrom.sendKeys("vridhachalam");
		WebElement txtxTo = driver.findElement(By.xpath("//input[@title='To station']"));
		txtxTo.sendKeys("chidambaram");
		WebElement btnsrch = driver.findElement(By.id("trainFormButton"));
		btnsrch.click();

	}

}
