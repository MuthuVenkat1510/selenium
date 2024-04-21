package org.d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question10 {
public static void main(String[] args) {
		


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		WebElement txtuser = driver.findElement(By.id("username"));
		txtuser.sendKeys("v.mkumar15@gmail.com");
		WebElement txtpass = driver.findElement(By.id("password"));
		txtpass.sendKeys("Muthu10;");
		
}

}
