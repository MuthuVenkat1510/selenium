package org.d9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q3 {

public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUGILAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	WebElement createNew = driver.findElement(By.xpath("//a[text()='Create new account']"));
	createNew.click();
	Thread.sleep(2000);
	WebElement yearBox = driver.findElement(By.id("year"));
	
	
	Select s = new Select(yearBox);

	s.selectByValue("2023");
List<WebElement> totalYear = s.getOptions();
int noYear = totalYear.size();
System.out.println(noYear);
for (WebElement abc : totalYear) {
	String year = abc.getAttribute("value");
	System.out.println(year);
	
}
}



}
