package TestNG_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cross_browser_test {
	
	WebDriver driver;
	
	@Test
	@Parameters("Browser")
	public void verfiytittle(String mybrowser) throws Exception
	{
		if(mybrowser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.marionette","C:\\Users\\Raj kumar\\eclipse-workspace\\Selenium test\\libs\\FIREFOX DRIVER\\geckodriver.exe");
			
			driver=new FirefoxDriver();
			
		}
		
		else if (mybrowser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Raj kumar\\eclipse-workspace\\Selenium test\\libs\\chrome driver\\chromedriver.exe");
			driver=new ChromeDriver();
			
		
		}
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.get("https://www.google.co.in/");
		
		System.out.println (driver.getTitle());
		
	}
}
