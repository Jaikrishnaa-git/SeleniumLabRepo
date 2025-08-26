package Lab_Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Lab4{
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) throws InterruptedException {
	  System.out.println("This is the test");
	  
	  driver.get("http://tutorialsninja.com/demo/");

      Assert.assertEquals(driver.getTitle(), "Your Store", "Title mismatch!");

      driver.findElement(By.linkText("Desktops")).click();

      driver.findElement(By.linkText("Mac (1)")).click();

      WebElement sortBy = driver.findElement(By.id("input-sort"));
      sortBy.sendKeys("Name (A - Z)");

      WebElement heading = driver.findElement(By.xpath("//h2[contains(text(),'Mac')]"));
      Assert.assertTrue(heading.isDisplayed(), "Mac heading not found!");
      Thread.sleep(2000);

      driver.findElement(By.xpath("//button[contains(@onclick,'cart.add')]")).click();

      WebElement searchBox = driver.findElement(By.name("search"));
      searchBox.sendKeys("Mobile");
      driver.findElement(By.cssSelector("button.btn.btn-default")).click();
      //Thread.sleep(2000);

      WebElement searchCriteria = driver.findElement(By.name("search"));
      searchCriteria.clear();

      searchCriteria.sendKeys("Monitors");
      driver.findElement(By.name("description")).click();
      driver.findElement(By.cssSelector("button.btn.btn-default")).click();
      //Thread.sleep(2000);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method");
	  WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method");
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
	  System.out.println("This is before class");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is before suite");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after suite");

  }

}