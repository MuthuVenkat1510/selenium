package org.d4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q12 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://bazaar.shopclues.com/wholesale.html");
		WebElement txtEmail = driver.findElement(By.id("autocomplete"));
		txtEmail.sendKeys("hp laptop charger");
		
		WebElement btnsrc = driver.findElement(By.xpath("//a[@class='srch_action btn orange']"));
		btnsrc.click();
		WebElement btnsrc1 = driver.findElement(By.xpath("(//div[@class='column col3 search_blocks'])[1]"));
		btnsrc1.click();
	}

}
