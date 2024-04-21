package org.d3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.redbus.in/\r\n");
WebElement btnsign = driver.findElement(By.id("i-icon-profile"));
btnsign.click();
System.out.println("a");
WebElement btnsign1 = driver.findElement(By.id("signInLink"));
btnsign1.click();
System.out.println("b");
WebElement txtmbno = driver.findElement(By.id("mobileNoInp"));
txtmbno.sendKeys("9585177353");
WebElement btnotp = driver.findElement(By.id("otp-container"));
btnotp.click();
}
}
