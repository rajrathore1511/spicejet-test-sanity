package test_package;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.internal.Systematiser;


public class gmail_registration {


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raj kumar\\eclipse-workspace\\Selenium test\\libs\\chrome driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/gmail/about/#");
		
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		
		String Parent = driver.getWindowHandle();
		
		System.out.println(Parent);
		

		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();

		Set<String> allwindows= driver.getWindowHandles();
		
		for (String child : allwindows)
		{
			if(!Parent.equalsIgnoreCase(child));
			{
				driver.switchTo().window(child);
								
				System.out.println(child);			
			}
			
		}
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/button/span")).click();;
		
		driver.findElement(By.xpath("//span[text()='For myself']")).click();
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("test");
		
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("test");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("priya34523%");
		
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test@123");
				
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
		//driver.close();
	}

}
