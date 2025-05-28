package test_2805;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch {
  
	static WebDriver driver;
	
	public static void main ( String  [] args) {
		
		String browser = "edge";
		
		switch (browser)
		{
		case "firefox":
			
		{
		
			driver= new FirefoxDriver();
			break;
		}
		
		case "chrome":
		{
			
			driver= new ChromeDriver();
			driver.get("https://www.google.com/");
			break;
		}
		
		
		
		case "edge":
		{
			
			driver= new EdgeDriver();
			driver.get("https://www.amazon.in/");
			
			break;
		}
		
		default:{
			System.out.println(" this is default str");
		}
	
		
		}
		
		
		
	}

}
