import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmplicitAndExplictWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");  
	  	WebDriver driver = new FirefoxDriver();
	  	
	  	
	  	
	  	driver.manage().window().minimize();
	  	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  	
	  	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  	
	  	driver.get("https://www.facebook.com/");
	  	
	  	WebElement email =driver.findElement(By.xpath("//input[@name=\"email\"]"));
	  	WebElement pass =driver.findElement(By.xpath("//input[@name=\"pass\"]"));
	  	WebElement login =driver.findElement(By.xpath("//*[@name=\"login\"]"));
	  	
	  	
	  	sendKeys(driver, email, 20, "8447226306");
	  	sendKeys(driver, pass, 20, "Gopal@1501");
	  	clickable(driver, login, 20);
	}
	public static void sendKeys(WebDriver driver,WebElement element,int timeout,String value) {
		
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		
	}
	public static void clickable(WebDriver driver,WebElement element,int timeout) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(login));
		element.click();
		
	}
	  	
	  	
	  	
	  	


}
