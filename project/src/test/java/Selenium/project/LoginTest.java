package Selenium.project;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoginTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  
	  driver.findElement(By.xpath("//input[@id='UserLogin_username']")).sendKeys("admin");;
	  driver.findElement(By.xpath("//input[@id='UserLogin_password']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@class='btn bg-teal btn-block']")).click();

      driver.findElement(By.xpath("//div[@class='category-title h6']//ul[@class='icons-list']//li//a[@href='#']")).click();
      driver.findElement(By.xpath("//div[@class='category-title h6 category-collapsed']//ul[@class='icons-list']//li//a[@href='#']")).click();
	  Thread.sleep(1000);
      driver.findElement(By.xpath("//a[@class='sidebar-control sidebar-main-toggle hidden-xs']")).click();
      Thread.sleep(1000);
	  driver.findElement(By.xpath("//a[@class='sidebar-control sidebar-main-toggle hidden-xs']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//i[@class='icon-git-compare']")).click();
      driver.findElement(By.xpath("//i[@class='icon-git-compare']")).click();
    
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.elixiraid.com/index.php");
		driver.manage().window().maximize();
		
  }

}
