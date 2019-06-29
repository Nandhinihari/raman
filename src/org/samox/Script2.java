package org.samox;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\oxygen new\\Firstday\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com");
		driver.manage().window().maximize();
		WebElement txtPri = driver.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
      JavascriptExecutor js=(JavascriptExecutor).driver;
      js.executeScript("arguments[0].scrollInfoview(true)", down);
		
      String s = txtPri.getText();
      System.out.println(s);
		
	}

}
