package org.samox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class SampleTest {
public static WebDriver driver;
@BeforeClass
public static void before()  {
	System.setProperty("webdriver.chrome.driver", "C:\\oxygen new\\Firstday\\driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
	
}


	@Parameters({"Fname","Lname","Address","Email"})

	@Test
	
	public void test1(String s1,String s2,String s3,String s4)  {
		
		
	WebElement txtFirstname=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	txtFirstname.sendKeys(s1);
	
	WebElement txtSecondname=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	txtSecondname.sendKeys(s2);
    
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	
    WebElement txtAddress=driver.findElement(By.xpath("//textarea[@rows='3']"));
	txtAddress.sendKeys(s3);
	
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	
	
	WebElement txtMail=driver.findElement(By.xpath("//input[@type='email']"));
	txtMail.sendKeys(s4);
	
//	WebElement txtPhn=driver.findElement(By.xpath("//input[@type='tel']"));
//	txtPhn.sendKeys(s5);
//	
//	WebElement txtGen=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
//	txtGen.click();
//	
//	
//	WebElement txtHob=driver.findElement(By.id("checkbox1"));
//	txtHob.click();
//	WebElement txtLang=driver.findElement(By.id("msdd"));
//	txtLang.sendKeys(s6);
//	
//
//WebElement txtSkill=driver.findElement(By.id("Skills"));
//    txtSkill.sendKeys(s7);
//	
//	WebElement txtPass1=driver.findElement(By.id("secondpassword"));
//	txtPass1.sendKeys(s7);	
//	WebElement txtPass=driver.findElement(By.id("firstpassword"));
//txtPass.sendKeys(s8);
//
//	
//	
	}
	



	
}
