package org.samox;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\oxygen new\\Firstday\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement txtMail = driver.findElement(By.id("email"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Hello')", txtMail);
		WebElement txtPass= driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','fghjk')", txtPass);
		
		
		
		
		
		
	}

}
