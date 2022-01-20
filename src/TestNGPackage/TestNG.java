package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {

	WebDriver driver;
	@BeforeMethod
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		
	}
	@Test
	public void verifyHomePageTitle() {
		String expectedTitle="sare jaha se accha hindusta hamara";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
		
	}
	
	
	
	
	
	@AfterTest
	public void endConnection() {
		driver.close();
	}
	

	

}
/*	@BeforeTest
public void setUp() {
System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");  
 driver =new FirefoxDriver();
 driver.get("http://demo.guru99.com/test/newtours/");
 

}
@Test
public void testTitle() {
String expectedTitle = "Welcome: Mercury Tours";
String actualTitle = driver.getTitle();


Assert.assertEquals(expectedTitle,actualTitle);
}

@AfterTest
public void terminateBrowser(){
driver.close();
}  */