package test_package;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import library.utility;

public class locator_spicejet {


	public static void main(String[] args) throws Exception {
	
		String projectlocation = System.getProperty("user.dir");

		System.out.println(projectlocation);
	
	   System.setProperty("webdriver.chrome.driver",projectlocation+"\\libs\\chrome driver\\chromedriver.exe");
	   
       WebDriver driver =new ChromeDriver();
	  
	  driver.get("https://www.spicejet.com/");
	  
		  
	  driver.manage().window().maximize();
	  
	  //use screenshot utility 
	  utility.capturescreenshot(driver,"spicejethome");
	/*  
	  TakesScreenshot ts= (TakesScreenshot)driver;
	  
	  File source = ts.getScreenshotAs(OutputType.FILE);
	  
	  FileUtils.copyFile(source, new File("C:\\Users\\Raj kumar\\eclipse-workspace\\Selenium test\\libs\\screenshots/spicejet.png"));
	  */
	
	  //verify the tittle of the page
	  //actual tittle
	  String mytittle= driver.getTitle();
	  
	  System.out.println(mytittle);
	  //expected tittle 
	  
	  String expected_tittle="SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
	  
       //Assert.assertEquals(mytittle, expected_tittle);
	  
       Assert.assertTrue(mytittle.contains("Flight"));
	   
	   
	  WebElement origin = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']") );
	      origin.click();
     
	      List<WebElement> origin_dd= driver.findElements(By.xpath("//li[@class='city_selected ']//a"));
	      
	      int size= origin_dd.size();
	      System.out.println("size of the list is " + size);
	  
	      
	      for(int i=0; i<origin_dd.size();i++)
	      {
	    	  WebElement element =origin_dd.get(i);
	      
	    	  String innerhtml  = element.getAttribute("innerHTML");
	    			  
	    		System.out.println("values are " + innerhtml);
	    		
	    		element.click();
	    	 	
	      }
	      
	      WebElement des = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']") );
	      des.click();
	      
	      List<WebElement> destination= driver.findElements(By.xpath("//li[@class='city_selected ']//a"));
		  
	      int size1= origin_dd.size();
	      System.out.println("size of the list is " + size1);
	  
	      for(int j=0; j<destination.size();j++)
	      {
	    	  WebElement element1 =origin_dd.get(j);
	      
	    	  String innerhtml1  = element1.getAttribute("innerHTML");
	    			  
	    		System.out.println("values are " + innerhtml1);
	    		
	    		element1.click();
	    	 	
	      }
	      /*
	      WebElement checkbox = driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']"));
	   
	   checkbox.click();
	   
	   System.out.println(checkbox);
     */
	      
	}

	
}
