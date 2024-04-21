package org.d7;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {


		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\MUGILAN\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://greenstech.in/selenium-course-content.html\r\n");
			driver.manage().window().maximize();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement srldwn = driver.findElement(By.id("heading2011"));

			js.executeScript("arguments[0].scrollIntoView(true)", srldwn);
			TakesScreenshot tk = (TakesScreenshot) driver;
			File src = tk.getScreenshotAs(OutputType.FILE);
			File des = new File("C:\\Users\\MUGILAN\\eclipse-workspace\\Selenium\\ScreenShot");

			FileUtils.copyFile(src, des);
			WebElement srlUp = driver.findElement(By.xpath("//h3[text()='Online Classroom']"));
			js.executeScript("arguments[0].scrollIntoView(false)", srlUp);
		}


}