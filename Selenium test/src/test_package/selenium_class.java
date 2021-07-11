package test_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium_class {

	public static void main(String[] args)  {
		
		//System.setProperty("webdriver.firefox.marionette","C:\\Users\\Raj kumar\\eclipse-workspace\\Selenium test\\libs\\FIREFOX DRIVER\\geckodriver.exe");
		
		String projectlocation= System.getProperty("user.dir");
		
		
		System.setProperty("webdriver.chrome.driver",projectlocation+"\\libs\\chrome driver\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Raj kumar\\eclipse-workspace\\Selenium test\\libs\\chrome driver\\chromedriver.exe");
		
		//WebDriver driver= new FirefoxDriver();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://youtube.com");
		
		driver.manage().window().maximize();
		
		String Tittle = driver.getTitle();  //get tittle
		
		System.out.println("Tittle of the broswer is "+Tittle);
		
		//validation point
		
		if(Tittle.equals("YouTube"))
		{
			System.out.println("Correct tittle");
			
		}
		else
		{
			System.out.println("Incorrect tittle");
		}
			//driver.close();
	
	}

}
