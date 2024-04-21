package org.d9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q5 {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MUGILAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement createNew = driver.findElement(By.xpath("//a[text()='Create new account']"));
		createNew.click();
		Thread.sleep(2000);
		WebElement dayBox = driver.findElement(By.id("day"));

		Select s = new Select(dayBox);
		List<WebElement> totalday = s.getOptions();
		int noday = totalday.size();
		System.out.println(noday);
		for (int i = 0; i < totalday.size(); i=i+2) {
		
			System.out.println(i);
		}
	
		}
	


}
