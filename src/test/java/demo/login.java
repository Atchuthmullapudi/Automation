package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {

	static WebDriver driver;
	
	@Test(priority=1)
	public static void initialize() {
		 driver = new ChromeDriver();
		// driver.get("https://www.google.com");
		 System.out.println("Navigated to google");
		
		 
	}
	
	@Test(priority=2)
	public static void browse() {
		 driver.get("https://www.youtube.com");
	}
	
}

