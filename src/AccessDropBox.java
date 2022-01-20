import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AccessDropBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		 
		Select nameOfCountry = new Select(driver.findElement(By.name("country")));
		
		nameOfCountry.selectByVisibleText("INDIA");
		nameOfCountry.selectByIndex(2);
		
		boolean a=nameOfCountry.isMultiple();
		System.out.println(a);
		
		driver.quit();
		 
		 

	}

}
