package com.Parameterization_in_TestNG_Using_XML;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class Demo_Parameterization_ByUsing_XML
{
	
	static WebDriver driver;

	 @Test
	 @Parameters({"Username","Password"})
	  public void Test3(String username, String password) 
	  {
		  driver.get("https://www.linkedin.com/");
		  driver.findElement(By.xpath("//input[@name='session_key']")).sendKeys(username);
		  driver.findElement(By.xpath("//input[@name='session_password']")).sendKeys(password);
		  
		  
		  
	  }

	
	
  @BeforeTest
  public void beforeTest()
  {
	 System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	 ChromeOptions option=new ChromeOptions();
	 option.addArguments("----disable-notification----");
	 driver=new ChromeDriver(option);
	 driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.close();
  }

}
