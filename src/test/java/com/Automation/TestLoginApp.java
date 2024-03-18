package com.Automation;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.junit.Test;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestLoginApp {
	@Test
	public void TestLoginApp1() {
	WebDriver driver ; 
	ChromeOptions opt = new ChromeOptions();
	//opt.addArguments("--headless"); 
	driver = new ChromeDriver(opt); 

	// TODO Auto-generated method stub
	System.out.print("Its working \n");
	System.out.println("Launching Chrome browser \n");	
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Subhangee_Pingale\\Downloads\\chromedriver_win32\\chromedriver.exe");
/*
	// To run headless browser	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
	driver = new ChromeDriver(options);
 */
	// non headless browser	
	driver = new ChromeDriver();
 
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://qa.gto-app.com/");

	driver.findElement(By.xpath("//*[@id=\'root\']/div/div[1]/div/div/button")).click();
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));

	driver.findElement(By.xpath("//*[@id=\'i0116\']")).sendKeys("girish.jaju@alixpartners.com");
	driver.findElement(By.xpath("//*[@id=\'idSIButton9\']")).click();

	ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs1.get(1));

	driver.findElement(By.xpath("//*[@id=\'i0118\']")).sendKeys("Fivepandavinforest5");

	driver.findElement(By.xpath("//*[@id=\'idSIButton9\']")).isDisplayed();
	//driver.findElement(By.xpath("//*[@id=\'idSIButton9\']")).click();

	System.out.println("Finished Test");	

}
}