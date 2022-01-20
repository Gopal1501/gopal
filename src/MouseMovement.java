import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");  
	  	WebDriver driver = new FirefoxDriver();
	  	driver.get("http://mrbool.com");
	  	Actions action =new Actions(driver);
	  	action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
	  	driver.findElement(By.linkText("ARTICLES")).click();
	  	
	  	driver.quit();
	  
	}

}
