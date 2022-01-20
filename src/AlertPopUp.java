import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");  
	  	WebDriver driver = new FirefoxDriver();
	  	
	  	
	  	driver.get("https://mypage.rediff.com/login/dologin");
	  	
	  	driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
	  	
	  	Alert alert =driver.switchTo().alert();
	  	String alertText=driver.switchTo().alert().getText();
	  	
	  	if(alertText.contains("Please enter valid email")) {
	  		
	  		System.out.println("as expected");
	  	}
	  	alert.accept();
	  	
	  	
	  	driver.quit();
	  	
	  	
	  	
	  	


	}

}
