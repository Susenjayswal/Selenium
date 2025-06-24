package selenium;

public class TC_001 extends BaseTest {

	public static void main(String[] args) throws Exception  {
		launch("chrome");
		System.out.println("Chrome is active");
		navigate("https://www.amazon.com/");
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String ps=driver.getPageSource();
		System.out.println("Page Source "+ps);
		driver.manage().deleteAllCookies();
		System.out.println("Cookies deleted");
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.close();
	}

	
}
