package org.d9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Q7 {




	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MUGILAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement countryBox = driver.findElement(By.xpath("//select[@name='country']"));

		Select s = new Select(countryBox);
		List<WebElement> country = s.getOptions();
		int nocountry = country.size();
		System.out.println(nocountry);
		for (WebElement total : country) {
			
			String text = total.getAttribute("value");
			System.out.println(text);
		}
	
		}
	





}
