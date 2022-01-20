import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");  
	  	WebDriver driver = new FirefoxDriver();
	  	
	  	driver.get("http://www.zlti.com");
	  	
	  	List<WebElement> linklist =  driver.findElements(By.tagName("a"));
	
	  	linklist.addAll(driver.findElements(By.tagName("img")));
	  	System.out.println(linklist.size());
	  	List<WebElement> actualLink= new ArrayList<WebElement>();
	  	
	  	for(int i=0;i<linklist.size();i++){
	  		
	  		if(linklist.get(i).getAttribute("href")!=null) {
	  			actualLink.add(linklist.get(i));
	  		}
	  	}
	  	System.out.println(actualLink.size());
	  	
	  	for(int j=0; j < actualLink.size();j++) {
	  	HttpURLConnection connection =	(HttpURLConnection)new URL(actualLink.get(j).
	  			getAttribute("href")).openConnection();
	  	connection.connect();
	  	String msg=connection.getResponseMessage();
	  	connection.disconnect();
	  	System.out.println(actualLink.get(j).getAttribute("href")+"---"+msg);
	  	
	  	}
	  	

	}

}
