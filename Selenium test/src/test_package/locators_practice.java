package test_package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators_practice {
	
	public static void main(String args[])
	{
		String projectlocation= System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectlocation+"\\\\libs\\\\chrome driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	
		String verifytittle= driver.getTitle();
		System.out.println("Tittle is "+verifytittle);
		
		boolean Tittleverification = driver.getTitle().equalsIgnoreCase("Facebook – log in or sign up");
		Asserttrue(Tittleverification);
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("email")).sendKeys("transitioning india");  
		
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		
		driver.findElement(By.xpath("//a[@href='https://en-gb.facebook.com/']")).click();
		
		driver.findElement(By.xpath("//*[text()='Create New Account']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"u_a_b_fj\"]")).sendKeys("kali");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kali");
		
		//driver.findElement(By.xpath("//*[@id='u_0_2_be']")).click();
		//WebElement createnewaccount = driver.findElement(By.xpath("//button[contains(text(),'Create New Account')]"));
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//driver.switchTo().alert().dismiss();
		//Alert alert = driver.switchTo().alert();
		
		
		
		
		
		
		
		//driver .close();
		
		
	}

	private static void Asserttrue(boolean tittleverification) {
		// TODO Auto-generated method stub
		
	}

	

	

}
