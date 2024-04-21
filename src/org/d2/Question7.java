package org.d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question7 {
public static void main(String[] args) {
		


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		WebElement txtuser = driver.findElement(By.className("_aa4b _add6 _ac4d"));
		txtuser.sendKeys("v.mkumar15@gmail.com");
		WebElement txtpass = driver.findElement(By.name("password"));
		txtpass.sendKeys("Muthu10;");
		
	}

}
