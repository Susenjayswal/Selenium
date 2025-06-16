package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest{

	public static WebDriver driver;
	
	public static void launch(String browser) 
	{
		if (browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver =new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		
	}
	
	public static void navigate(String url)
	{
		System.out.println("Before driver.get()");
		driver.get(url);
		System.out.println("After driver.get()");


	}
}
