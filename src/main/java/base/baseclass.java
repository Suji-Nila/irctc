package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public static String URL="https://www.irctc.co.in/nget/train-search";
	public static WebDriver driver;
	public static Actions act;
	
	@BeforeTest
	public static void start() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		act=new Actions(driver);
		//maximize
		driver.manage().window().maximize();
		driver.get(URL);
		
		
		
	}

	private static void end() {
		// TODO Auto-generated method stub
		driver.get(URL);
		
		
	}

}
