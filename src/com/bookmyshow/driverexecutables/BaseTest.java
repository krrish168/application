package com.bookmyshow.driverexecutables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest
{
	public WebDriver driver;
	@BeforeMethod
	public void preCondition()
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		//driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		driver.get("https://in.bookmyshow.com/");
	}
	
	@AfterMethod
	public void tearDown(ITestResult res)
	{
	
		int status=res.getStatus();
		ITestNGMethod me=res.getMethod();
		String name=me.getMethodName();
		//driver.close();
	}

}
