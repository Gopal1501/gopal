package TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPriorties {
	

	public String url = "http://demo.guru99.com/test/newtours/";
	String path = "C:\\geckodriver.exe";
	public WebDriver driver;
	String expectedTitle = null;
	String actualTitle = null;
	
	@BeforeTest
	public void launchBrowser(){
		System.setProperty("webdriver.gecko.driver", path);
		driver = new FirefoxDriver();
		driver.get(url);
		
	}
	
	
	@BeforeMethod
	public void verifyHomePageTitle() {
		driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	
	@Test (priority =0)
	public void register() {
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("indushekhar");
		driver.findElement(By.name("lastName")).sendKeys("singh");
		driver.findElement(By.name("phone")).sendKeys("8447226306");
		
	
	}
	
	@Test (priority =1)
	public void support() {
		
		driver.findElement(By.linkText("SUPPORT")).click();
		  expectedTitle = "Register: Mercury Tours";
		  expectedTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}
	
	
	@AfterMethod
	public void backToHomePage() {
		driver.findElement(By.linkText("Home")).click() ;
	}
	@AfterTest()
	public void closeCOnnection() {
		driver.close();
	}
	
	

	

}
