
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd");
		
		// WebElement username= driver.findElement(By.id("login-username"));
		//  driver.findElement(By.id("login-username")).sendKeys("lahsiv122@gmail.com");
		// username.sendKeys("lahsiv122@gmail.com");
		//WebElement next= driver.findElement(By.id("login-signin"));
		//next.click();
		 // driver.findElement(By.id("login-signin")).click();
		  driver.findElement(By.linkText("Forgotten username?")).click();
		  

	}

}
