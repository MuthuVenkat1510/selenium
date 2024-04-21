package org.d5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q14 {
	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.chrome.driver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		WebElement wome = driver.findElement(By.xpath("(//span[@class='catText'] )[2]"));
		ac.moveToElement(wome).perform();
		WebElement heel = driver.findElement(By.xpath("//span[text()='Heels'] "));
		
		ac.moveToElement(heel).perform();
		
		heel.click();

		}

}
