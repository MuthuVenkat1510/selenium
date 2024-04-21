package org.file;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.msedge.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
	}
}
