package TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
	@Test
	@Parameters({"browserr","url","username"})
	public static void test1(String browserr,String url,String username) {
		if(browserr.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");  
		  	WebDriver driver = new FirefoxDriver();
		  	
		  	
		  	driver.get(url);
		  	driver.findElement(By.xpath("//input[@name=\"username\"]")).clear();
		  	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
		  	driver.findElement(By.xpath("//input[@id=\"login-signin\"]")).click();
		  	
		}
		if(browserr.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");  
		  	WebDriver driver = new FirefoxDriver();
		  	
		  	
		  	driver.get(url);
		  	driver.findElement(By.xpath("//input[@name=\"username\"]")).clear();
		  	driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(username);
		  	driver.findElement(By.xpath("//input[@id=\"login-signin\"]")).click();
		  	
		}
		
	}

}
