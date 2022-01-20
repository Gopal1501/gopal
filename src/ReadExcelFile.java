import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.xlsFile.Xls_Reader;
public class ReadExcelFile {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");  
	  	WebDriver driver = new FirefoxDriver();
	  	driver.get("regestration.com");
		
		Xls_Reader reader =new Xls_Reader("C:\\Users\\91844\\eclipse-workspace\\Demo\\src\\com\\xlsFile\\xlfile.xls");
		int noOFrow=reader.getRowCount("Sheet1");
		
		for(int  row=2; row<=noOFrow; row++) {
			
			String firstname= reader.getCellData("Sheet1","First Name",  row);
			String lastname= reader.getCellData("Sheet1","Last Name",  row);
			String gender= reader.getCellData("Sheet1","Gender",  row);
			String country= reader.getCellData("Sheet1","Country",  row);
			String age= reader.getCellData("Sheet1","age",  row);
			String Date= reader.getCellData("Sheet1","Date",  row);
			String id= reader.getCellData("Sheet1","ID",  row);
			
			
			driver.findElement(By.linkText("firstname")).clear();
			driver.findElement(By.linkText("firstname")).sendKeys(firstname);
			
			driver.findElement(By.linkText("lastname")).clear();
			driver.findElement(By.linkText("lastname")).sendKeys(lastname);
			Select select=new Select(driver.findElement(By.linkText("country")));
			select.selectByValue(country);
			
		}
		
		
		
		
				
	}

}



