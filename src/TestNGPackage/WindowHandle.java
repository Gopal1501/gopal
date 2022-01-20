package TestNGPackage;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");  
	  	WebDriver driver = new FirefoxDriver();
	  	
	  	
	  	driver.get("http://demo.guru99.com/popup.php");
	  	 String parent= driver.getWindowHandle();
	  	 
	  	 
	  	 driver.findElement(By.xpath("/html/body/p/a")).click();
	     
	  	 Set<String>allWindow=   driver.getWindowHandles();
	  	 
	  	 for(String child :allWindow) {
	  		 if(!parent.equalsIgnoreCase(child)) {
	  			 driver.switchTo().window(child);
	  			 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("gopal@gmail.com");
	  			 
	  			 
	  			 driver.findElement(By.name("btnLogin")).click();
	  			 driver.close();
	  			 
	  		 }
	  		 
	  	 }
	  	 driver.switchTo().window(parent);

	}

}
		