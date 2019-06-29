package org.samox;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptTask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\oxygen new\\Firstday\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com");
		driver.manage().window().maximize();
		WebElement txtFont = driver.findElement(By.xpath("//h1[@style='font-size:22px;']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;	
		Object ob = js.executeScript("return arguments[0].getAttribute('style','color')", txtFont);
		          


String s=(String)ob;
System.out.println(s);

		
		
	}

}
