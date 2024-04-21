package org.d3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q14 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		WebElement btnsig = driver.findElement(By.className("r2iyh"));
		btnsig.click();
		WebElement btnsig1 = driver.findElement(By.id("mobile"));
		btnsig1.sendKeys("9500262565");
		WebElement btnsig2 = driver.findElement(By.id("name"));
		btnsig2.sendKeys("Muthu");
		WebElement btnsig3 = driver.findElement(By.id("email"));
		btnsig3.sendKeys("MuthuVenkat1510@gmail.com");
		WebElement btnsig4 = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		btnsig4.click();
	}
	
}
