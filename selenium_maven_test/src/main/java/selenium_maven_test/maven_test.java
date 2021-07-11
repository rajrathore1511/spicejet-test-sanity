package selenium_maven_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maven_test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raj kumar\\eclipse-workspace\\selenium_maven_test\\utilities\\webdrivers\\chrome driver\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com/gmail/about/#");
		
		System.out.println(driver.getTitle());
		
		
		

	}

}
