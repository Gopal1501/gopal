import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class takeScreenShot {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",c);  
	  	WebDriver driver = new FirefoxDriver();
	  	
	  	driver.get("https://www.facebook.com/");
	  	screenShot("login_btn");
	  	

	}
	
	public static void screenShot(String filename) {
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:\\Users\\91844\\eclipse-workspace\\Demo\\src"+filename+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
