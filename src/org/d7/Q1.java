package org.d7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MUGILAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	
	TakesScreenshot ss = (TakesScreenshot) driver;
	File src = ss.getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\MUGILAN\\eclipse-workspace\\Selenium\\ScreenShot\\greens.png");
	FileUtils.copyFile(src, des);
	
}
}
