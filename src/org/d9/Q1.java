package org.d9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUGILAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement stateDropDown = driver.findElement(By.className("css-19bqh2r"));
	
	Select s = new Select(stateDropDown);
	boolean multiple = s.isMultiple();
	System.out.println(multiple);
}
}
