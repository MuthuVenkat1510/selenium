package org.d11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUGILAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//to print even rows only
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < allRows.size(); i++) {
			if (i==2||i==4||i==6) {
				WebElement eachRow = allRows.get(i);
				List<WebElement> allData = eachRow.findElements(By.tagName("td"));
				for (int j = 0; j < allData.size(); j++) {
					if (i==2||i==4||i==6) {
						WebElement eachData = allData.get(j);
						System.out.println(eachData.getText());
						
					}
					
				}
				
				
			}
		}
	}

}
