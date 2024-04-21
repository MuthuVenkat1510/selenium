package org.d11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MUGILAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// to print middle rows middle data
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.id("customers"));
		List<WebElement> allRows = table.findElements(By.tagName("tr"));

		WebElement eachRow = allRows.get(allRows.size() - 4);
		List<WebElement> allData = eachRow.findElements(By.tagName("td"));

		WebElement eachData = allData.get(allData.size() - 2);
		System.out.println(eachData.getText());

	}

}
