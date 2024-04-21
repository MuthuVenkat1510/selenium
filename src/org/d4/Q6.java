package org.d4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("v.mkumar2525@gmail.com");
		String v1 = txtEmail.getAttribute("value");
		System.out.println(v1);
		WebElement txtpara = driver.findElement(By.id("pass"));
		txtpara.sendKeys("2121313");
		String text = txtpara.getAttribute("value");
		System.out.println(text);
	}

}
