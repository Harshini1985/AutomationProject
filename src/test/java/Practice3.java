import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;

 

public class Practice3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Krishnakishore\\eclipse-workspace\\AutomationPractice\\drivers\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    //TC6
    WebElement txtEmail = driver.findElement(By.id("email"));
    txtEmail.sendKeys("lanmerkpharmaceuticals@gmail.com");
    WebElement txtPass = driver.findElement(By.id("passwd"));
    txtPass.sendKeys("Lanmerk@123");
    WebElement btnSubmit = driver.findElement(By.id("SubmitLogin"));
    btnSubmit.click();
    
    WebElement tabTshirt = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
    tabTshirt.click();
    
    WebElement imgTshirt=driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']"));
    Assert.assertTrue("Image is not displayed",imgTshirt.isDisplayed());
    
    WebElement prodName = driver.findElement(By.xpath("(//a[@title='Faded Short Sleeve T-shirts'])[1]"));
    Assert.assertTrue("Product Name is not displayed", prodName.isDisplayed());
    System.out.println("Assert Passed");
    
    //TC6--step 6
    
   // @FindBy(xpath="(//tr[@class='odd'])[1]")
    // private WebElement txtData1;

    //@FindBy(xpath="//tr[@class='even']")
    //private WebElement txtData2;

    //@FindBy(xpath="(//tr[@class='odd'])[2]")
    //private WebElement txtData3;

    
    //a[@title='View']
}
}
