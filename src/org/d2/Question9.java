package org.d2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question9 {
public static void main(String[] args) {
		


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtuser = driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched"));
		txtuser.sendKeys("v.mkumar15@gmail.com");
		WebElement txtpass = driver.findElement(By.name("password"));
		txtpass.sendKeys("Muthu10;");
		
	}

}
