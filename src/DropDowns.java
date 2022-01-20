import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/signup");
		
		
		WebElement day = driver.findElement(By.id("birthday_day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		
		Select dayobj = new Select(day);
		dayobj.selectByVisibleText("15");
		
		
		Select monthobj = new Select(month);
		monthobj.selectByVisibleText("12");
		
		
		Select yearobj = new Select(year);
		yearobj.selectByVisibleText("2020");
		
		
		
		WebElement radio1 = driver.findElement(By.className("_5k_2 _5dba"));
		radio1.click();
		
		
		
		
		
		

	}

}

