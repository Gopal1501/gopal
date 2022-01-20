import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");  
	  	WebDriver driver = new FirefoxDriver();
	  	
	  	
	  	driver.get("http://demo.guru99.com/test/upload/");
	  	
	  	WebElement upload = driver.findElement(By.id("uploadfile_0"));
	  	upload.sendKeys("C:\\UIperposes\\abc.txt");
	  	
	  	driver.findElement(By.id("terms")).click();
	  	driver.findElement(By.linkText("Submit File")).click();
	  	
	  	

	}

}
