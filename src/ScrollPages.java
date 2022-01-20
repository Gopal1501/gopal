  import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollPages {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");  
	  	WebDriver driver = new FirefoxDriver();
	  	
	  	 driver.get("http://demo.guru99.com/test/guru99home/");
	  	 
	  	WebElement Element = driver.findElement(By.linkText("Linux"));
	  	  
	  	 JavascriptExecutor js= (JavascriptExecutor) driver;
	  	 
	  	 js.executeScript("arguments[0].scrollIntoView();", Element);
	  	 
	  //	js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); till bottom
	  	 
	  	 

	}

}
