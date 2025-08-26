package Lab_Programs;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Lab9_part1_lab3 {
  WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) throws InterruptedException {
	  
	  driver.get("https://tutorialsninja.com/demo/index.php?");
	  driver.findElement(By.linkText("Desktops")).click();
	  driver.findElement(By.linkText("Mac (1)")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[2]/div[2]/button[1]")).click();
  }
  @Parameters("browser")
  @BeforeMethod
  public void beforeMethod(String brow) {
	  if(brow.equalsIgnoreCase("chrome"))
	  {
	  WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
	  }
	  
	  if(brow.equalsIgnoreCase("edge"))
	  {
	  WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
	  }
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	 
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
