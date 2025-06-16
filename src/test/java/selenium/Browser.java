package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static void main(String[] args) {
		WebDriver driver;
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chromedriver","/home/testsopsguru/Downloads/chrome-linux64");
//		driver = new ChromeDriver();
//		driver.get("https://digiparikshak.com/");
//		System.out.println("Page title is: " + driver.getTitle());
//		driver.close();
		
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		
//		WebDriverManager.firefoxdriver().setup();
//		FirefoxDriver driver1= new FirefoxDriver();

	}

}
