package selenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest{

	public static WebDriver driver;
	public static Properties p;
	public static FileInputStream fis;
	public static Properties mainprop;
	public static Properties childprop;
	
	public static void init() throws Exception
	{
		//System.out.println(System.getProperty("user.dir"));
		fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/data.properties");
		p=new Properties();
		p.load(fis);
		String c=p.getProperty("chromebrowser");
		System.out.println(c);
		
		fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/environment.properties");
		mainprop=new Properties();
		mainprop.load(fis);
		String e=mainprop.getProperty("env");
		System.out.println(e);
		
		fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/"+e+".properties");
		childprop=new Properties();
		childprop.load(fis);
		String ch=childprop.getProperty("amazonurl");
		System.out.println(ch);
	}
	
	public static void launch(String browser) 
	{
		if (p.getProperty(browser).equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			driver =new FirefoxDriver();
		}
		else if(p.getProperty(browser).equals("edge"))
		{
			driver = new EdgeDriver();
		}
		
	}
	
	public static void navigate(String url)
	{
		System.out.println("Before driver.get()");
		driver.get(childprop.getProperty(url));
		System.out.println("After driver.get()");


	}
}
