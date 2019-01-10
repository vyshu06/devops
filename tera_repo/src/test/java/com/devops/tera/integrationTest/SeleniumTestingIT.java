package com.devops.tera.integrationTest;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SeleniumTestingIT 
{
	private static WebDriver driver;
	private static String baseUrl;	
    static String result = "";
    static String exception = null;
    
  @BeforeClass
  public static void beforeTest() 
  {
	  driver = new FirefoxDriver();
	  baseUrl = "http://10.53.67.57:1010/tera";  
  }
  
  @Test()
  public void teraAdminLogin() 
  {
	  try 
	  {
	  	driver.get(baseUrl); 
		driver.manage().window().maximize();
		driver.findElement(By.id("loginId")).clear();
		driver.findElement(By.id("loginId")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		String expectedText = "Home Page";
		String innertext = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font")).getText();
		Assert.assertEquals(innertext, expectedText);
	  }
	  catch (Exception ex) 
	  {
          exception = ex.getMessage();
          System.out.println(result);
	  }
  }
  @Test
  public void teraCreateServiceRequestNavigation() 
  {
	  try 
	  {
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[2]/a/font")).click();
		String expectedText = "Create Service Request";
		String innertext = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font")).getText();
		Assert.assertEquals(innertext, expectedText);
	  }
	  catch (Exception ex) 
	  {
          exception = ex.getMessage();
          System.out.println(result);
	  }
 }
  
 @Test
  public void teraCreateServiceRequestRegistration() 
  {
      try 
	  {
    	driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")).clear();
  		driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")).sendKeys("admin");
  		
  		driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr/td/table/tbody/tr[3]/td[2]/input")).clear();
  		driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr/td/table/tbody/tr[3]/td[2]/input")).sendKeys("admin@techmahindra.com");
  		
  		driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).clear();
  		driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")).sendKeys("084597578");
  		
  		driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input")).clear();
  		driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input")).sendKeys("1234567890");
  		
  		driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")).clear();
  		driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")).sendKeys("1234567890");
  		
  		driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")).clear();
  		driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")).sendKeys("123");
  		
  		driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")).clear();
  		driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")).sendKeys("TERA");
  		
  		driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr/td/table/tbody/tr[9]/td[2]/textarea")).clear();
  		driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr/td/table/tbody/tr[9]/td[2]/textarea")).sendKeys("TERA project for testing");
  		
  		driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr/td/table/tbody/tr[10]/td[2]/textarea")).clear();
  		driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr/td/table/tbody/tr[10]/td[2]/textarea")).sendKeys("Performance Testing of the application");
  		
  		driver.findElement(By.xpath("//*[@id='txtFromDate']")).clear();
  		driver.findElement(By.xpath("//*[@id='txtFromDate']")).sendKeys("1-9-2015");
  		
  		driver.findElement(By.xpath("//*[@id='txtToDate']")).clear();
  		driver.findElement(By.xpath("//*[@id='txtToDate']")).sendKeys("10-9-2015");
  		
  		driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")).clear();
  		driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")).sendKeys("3");
  		
  		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
	  }
	  catch (Exception ex) 
	  {
          exception = ex.getMessage();
          System.out.println(result);
	  }
  }
 
 
 @Test
 public void teraServiceRequestList() 
 {
      try 
      {
		   driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[3]/a/font")).click();
		   String expectedText = "Service Request List";
		   String innertext = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font")).getText();
		   Assert.assertEquals(innertext, expectedText);
      }
	  catch (Exception ex) 
	  {
	       exception = ex.getMessage();
	       System.out.println(result);
	  }
 }
      
 @Test
 public void teraViewSearchServiceRequest() 
 {
      try 
      {
		   String expectedText = "Performance Testing of the application";
		   String innertext = driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr[2]/td[4]")).getText();
		   Assert.assertEquals(innertext, expectedText);
      }
	  catch (Exception ex) 
	  {
	       exception = ex.getMessage();
	       System.out.println(result);
	  }
  }
 

 @Test
 public void teraViewServiceRequestDetails() 
 {
      try 
      {
		   driver.findElement(By.xpath("/html/body/form[2]/table/tbody/tr[2]/td/a")).click();
		   String expectedText = "Service Request Details";
		   String innertext = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font")).getText();
		   Assert.assertEquals(innertext, expectedText);
      }
	  catch (Exception ex) 
	  {
	       exception = ex.getMessage();
	       System.out.println(result);
	  }
  }
 
 @Test
 public void teraReport() 
 {
      try 
      {
		   driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[4]/a/font")).click();
		   String expectedText = "Report";
		   String innertext = driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font")).getText();
		   Assert.assertEquals(innertext, expectedText);
      }
	  catch (Exception ex) 
	  {
	       exception = ex.getMessage();
	       System.out.println(result);
	  }
  }

 
 @Test
 public void teraXit() 
 {
      try 
      {
		   driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[5]/a/font")).click();
		   String expectedText = "Test Environment Request Application.";
		   String innertext = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td/font")).getText();
		   Assert.assertEquals(innertext, expectedText);
      }
	  catch (Exception ex) 
	  {
	       exception = ex.getMessage();
	       System.out.println(result);
	  }
  }

 
@AfterClass
  public static void afterTest() 
  {
	  driver.quit();
  }


 }


  

