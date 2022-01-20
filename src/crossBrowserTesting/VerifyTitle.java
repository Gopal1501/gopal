package crossBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {
	WebDriver driver;
	
	@Test
	@Parameters({"browser"})
	
	public void verifyTitle(String browserName) {
		
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");  
			driver =new FirefoxDriver();
			
		}
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\chrome.exe");  
			driver =new ChromeDriver();
			
		}
		if(browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver","C:\\ie.exe");  
			driver =new InternetExplorerDriver();
			
		}


		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable");
		System.out.println(driver.getTitle());
	}
}

/* xml code
 * <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite  name="Suite">
  <test name="Test">

<parameter name="browser" value="firefox"></parameter>
<classes>
<class name="crossBrowserTesting.VerifyTitle"></class>



</classes>


  </test> <!-- Test -->
</suite> <!-- Suite -->

 */
		
		
		
	

	


