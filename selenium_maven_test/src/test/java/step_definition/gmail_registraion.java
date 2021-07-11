package step_definition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class gmail_registraion {
	
	WebDriver driver;
	
	@Given("gmail home page should load")
	public void gmail_home_page_should_load() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Raj kumar\\eclipse-workspace\\selenium_maven_test\\utilities\\webdrivers\\chrome driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/gmail/about/#");
		String tittle=driver.getTitle();
		System.out.println(tittle);
				
	   
	}
	@When("page tittle verified")
	public void verifytittle()
	{
		 boolean verifytittle= driver.getTitle().equalsIgnoreCase("Gmail - Email from Google");
		    
		    assertTrue(verifytittle);
	
		    
	}
	
	@Then("click on sign in")
	public void click_on_sign_in() {
	
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
		
    
	}

	@Then("switch to sign in window enter {String} and {String}")
	public void sign_in_window_enter() {
	
		String Parent = driver.getWindowHandle();
		
		System.out.println(Parent);
		
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
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("email");
		
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password");
				
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("password");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		
		

	}


}
