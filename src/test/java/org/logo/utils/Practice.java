package org.logo.utils;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException{
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\Krishnakishore\\eclipse-workspace\\AutomationPractice\\drivers\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	      
	      //TC1
	      WebElement txtEmail = driver.findElement(By.id("email"));
	      txtEmail.sendKeys("lanmerkpharmaceuticals@gmail.com");
	      WebElement txtPass = driver.findElement(By.id("passwd"));
	      txtPass.sendKeys("Lanmerk@123");
	      WebElement btnSubmit = driver.findElement(By.id("SubmitLogin"));
	      btnSubmit.click();
	      String title=driver.getTitle();
	      System.out.println(title);
	      Assert.assertEquals("My account - My Store",title);
	      
	      // Check placeholder text
	      
	      WebElement txtSearch = driver.findElement(By.id("search_query_top"));
	      System.out.println(txtSearch.getText());
	      
	      WebElement imgLogo = driver.findElement(By.xpath("//img[@alt=\"My Store\"]"));
	      Assert.assertTrue("Logo is not displayed", imgLogo.isDisplayed());
	      
	      WebElement callImage = driver.findElement(By.xpath("//span[@class='shop-phone']"));
	      Assert.assertTrue("Contact Info is not displayed",callImage.isDisplayed()); 
	      System.out.println("CallImage");
	      
	      WebElement tabContact =driver.findElement(By.xpath("//a[text()='Contact us']"));
	      Assert.assertTrue("Contact Us Tab is not displayed",tabContact.isDisplayed() );
	      System.out.println("Contact Us");
	      
	      WebElement tabSign =driver.findElement(By.xpath("//a[@title='Log me out']"));
	      Assert.assertTrue("Sign Out Tab is not displayed",tabSign.isDisplayed() );
	      System.out.println("Tab Sign");
	      
	      WebElement txtPlace = driver.findElement(By.id("search_query_top"));
	      System.out.println(txtPlace.isDisplayed()); 
	      
	    //TC4
	      
	      WebElement tabDresses= driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
	      tabDresses.click();
	      System.out.println(driver.getTitle());
	      Assert.assertEquals("Dresses - My Store",driver.getTitle());
	      
	      WebElement tabWomen = driver.findElement(By.xpath("//a[text()='Women']"));
	      tabWomen.click();
	      System.out.println(driver.getTitle());
	      Assert.assertEquals("Women - My Store",driver.getTitle());
	      
	      WebElement tabTshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
	      tabTshirt.click();
	      System.out.println(driver.getTitle());
	      Assert.assertEquals("T-shirts - My Store",driver.getTitle());
	      
	      
	      
	       
}
}
