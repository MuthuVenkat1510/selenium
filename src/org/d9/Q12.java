package org.d9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q12 {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\MUGILAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://output.jsbin.com/osebed/2");
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			WebElement fruitsBox = driver.findElement(By.id("fruits"));

			Select s = new Select(fruitsBox);
			List<WebElement> fruits = s.getOptions();
			int nofruits = fruits.size();
			System.out.println("Total Fruits"+nofruits);
			for (int i = 1; i < fruits.size(); i=i+2) {
				s.selectByIndex(i);
			}
			
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			int allselected = allSelectedOptions.size();
			System.out.println("NO of NON selected options"+(nofruits-allselected));
		
		
		
			}


}
