package test_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
	
        String projectlocation= System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectlocation+"\\libs\\chrome driver\\chromedriver.exe");
				
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://youtube.com");
		
		driver.manage().window().maximize();
		String Tittle=driver.getTitle();
		System.out.println("tittle is "+Tittle);
		 
		//driver.findElement(By.xpath("//* [@id='search']")).sendKeys("transitioning india");    //by xpath
		driver.findElement(By.id("search")).sendKeys("transitioning india");                  //by ID
		driver.findElement(By.xpath("//* [@id='search-icon-legacy']")).sendKeys(Keys.ENTER);
		
		boolean verifytittle =driver.getTitle().equalsIgnoreCase("transitioning india -YouTube");
		assertTrue(verifytittle);
		//driver.close();
		

	}

	private static void assertTrue(boolean verifytittle) {
		// TODO Auto-generated method stub
		
	}

}
