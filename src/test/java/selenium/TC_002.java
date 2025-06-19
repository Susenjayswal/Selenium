package selenium;

public class TC_002 extends BaseTest {

	public static void init()
	{
		
	}
	public static void main(String[] args) throws Exception  {
		launch("chromebrowser");
		navigate("amazonurl");
		Thread.sleep(3000);
		driver.close();
	
		launch("firefoxbrowser");
		navigate("bestbuyurl");
		Thread.sleep(3000);
		driver.close();
	}

	
}
