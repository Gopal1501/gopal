package TestNGPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Flipkart {
	WebDriver driver;
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");  
	  	 driver = new FirefoxDriver();
	  	 
		
		
	}
	@Test
	public void login() {
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.className("_1_3w1N")).click();
		driver.findElement(By.className("_2IX_2-VJZDxU")).sendKeys("8447226306");
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]")).sendKeys("Gopal@1501");

		
	}

}
