package org.d3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp\r\n");
WebElement txtName = driver.findElement(By.id("firstName"));
txtName.sendKeys("Muthu");
WebElement txtLName = driver.findElement(By.id("lastName"));
txtLName.sendKeys("Venkat");
WebElement txtid = driver.findElement(By.id("username"));
txtid.sendKeys("mv8048226");
WebElement txtpwd = driver.findElement(By.name("passwd"));
txtpwd.sendKeys("Venkat151015");
WebElement txtCpwd = driver.findElement(By.name("ConfirmPasswd"));
txtCpwd.sendKeys("Venkat151015");
	}
}