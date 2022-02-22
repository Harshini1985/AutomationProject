import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	 public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Krishnakishore\\eclipse-workspace\\AutomationPractice\\drivers\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	      
	    //TC4
	      WebElement tabSignIn = driver.findElement(By.xpath("//a[@class='login']"));
	      tabSignIn.click();
	      System.out.println(driver.getTitle());
	      Assert.assertEquals("Login - My Store",driver.getTitle());
	      
	      WebElement txtEmail = driver.findElement(By.id("email"));
	      txtEmail.sendKeys("lanmerkpharmaceuticals@gmail.com");
	      WebElement txtPass = driver.findElement(By.id("passwd"));
	      txtPass.sendKeys("Lanmerk@123");
	      WebElement btnSubmit = driver.findElement(By.id("SubmitLogin"));
	      btnSubmit.click();
	       
	      WebElement txtUserName=driver.findElement(By.xpath("//span[text()='Ram Remo']"));
	      String text=txtUserName.getText();
	      System.out.println(text);
	      Assert.assertEquals("Ram Remo",text);
	      
	      //TC5
	 
	      WebElement scrollText = driver.findElement(By.xpath("//a[text()='Ecommerce software by PrestaShop™']"));
	      JavascriptExecutor js=(JavascriptExecutor)driver;
	      js.executeScript("arguments[0].scrollIntoView(true)",scrollText);
	      
	      WebElement title1 = driver.findElement(By.xpath("//h4[text()='Categories']"));
	      //String text1=title1.getText();
	      //Assert.assertEquals("Categories",text1);
	      Assert.assertTrue("Title is not displayed", title1.isDisplayed());
	      
	      WebElement title2 = driver.findElement(By.xpath("//h4[text()='Information']"));
	      Assert.assertTrue("Title is not displayed", title2.isDisplayed());
	      
	      WebElement title3 = driver.findElement(By.xpath("//a[text()='My account']"));
	      Assert.assertTrue("Title is not displayed", title3.isDisplayed());
	      
	      WebElement subLink1 = driver.findElement(By.xpath("//a[contains(@title,'You will find here')]"));
	      String subText1=subLink1.getText();
	      System.out.println(subText1);
	      Assert.assertEquals("Women",subText1);
	      
	      WebElement subLink2 = driver.findElement(By.xpath("//a[@title='Specials']"));
	      String subText2=subLink2.getText();
	      System.out.println(subText2);
	      Assert.assertEquals("Specials",subText2);
	    
	      WebElement subLink3 = driver.findElement(By.xpath("//a[@title='New products']"));
	      String subText3=subLink3.getText();
	      System.out.println(subText3);
	      Assert.assertEquals("New products",subText3);
	      
	      WebElement subLink4 = driver.findElement(By.xpath("//a[@title='Best sellers']"));
	      String subText4=subLink4.getText();
	      System.out.println(subText4);
	      Assert.assertEquals("Best sellers",subText4);
	      
	      WebElement subLink5 = driver.findElement(By.xpath("//a[@title='Our stores']"));
	      String subText5 = subLink5.getText();
	      System.out.println(subText5);
	      Assert.assertEquals("Our stores",subText5);
	      
	      WebElement subLink6 = driver.findElement(By.xpath("//a[@title='Contact us']"));
	      String subText6 = subLink6.getText();
	      System.out.println(subText6);
	      Assert.assertEquals("Contact us",subText6);
	      
	      WebElement subLink7 = driver.findElement(By.xpath("//a[@title='Terms and conditions of use']"));
	      String subText7 = subLink7.getText();
	      System.out.println(subText7);
	      Assert.assertEquals("Terms and conditions of use",subText7);
	      
	      WebElement subLink8 = driver.findElement(By.xpath("//a[@title='About us']"));
	      String subText8 = subLink8.getText();
	      System.out.println(subText8);
	      Assert.assertEquals("About us",subText8);
	      
	      WebElement subLink9 = driver.findElement(By.xpath("//a[@title='Sitemap']"));
	      String subText9 = subLink9.getText();
	      System.out.println(subText9);
	      Assert.assertEquals("Sitemap",subText9);
	      
	      WebElement subLink10 = driver.findElement(By.xpath("//a[@title='My orders']"));
	      String subText10 = subLink10.getText();
	      System.out.println(subText10);
	      Assert.assertEquals("My orders",subText10);
	      
	      WebElement subLink11 = driver.findElement(By.xpath("//a[@title='My credit slips']"));
	      String subText11 = subLink11.getText();
	      System.out.println(subText11);
	      Assert.assertEquals("My credit slips",subText11);
	      	       
	      WebElement subLink12 = driver.findElement(By.xpath("//a[@title='My addresses']"));
	      String subText12 = subLink12.getText();
	      System.out.println(subText12);
	      Assert.assertEquals("My addresses",subText12);
	      
	      WebElement subLink13 = driver.findElement(By.xpath("//a[@title='Manage my personal information']"));
	      String subText13 = subLink13.getText();
	      System.out.println(subText13);
	      Assert.assertEquals("My personal info",subText13);
	      
	      WebElement subLink14 = driver.findElement(By.xpath("//a[@title='Sign out']"));
	      String subText14 = subLink14.getText();
	      System.out.println(subText14);
	      Assert.assertEquals("Sign out",subText14);
	            
	 }
      
}
