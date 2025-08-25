package Lab_Programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab6 {

	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("jaikrishnaa.git@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Team@A8");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("Components")).click();
		driver.findElement(By.linkText("Monitors (2)")).click();
		Select show = new Select(driver.findElement(By.id("input-limit")));
		show.selectByIndex(0);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div/div/div[2]/div[2]/button")).click();
		driver.findElement(By.linkText("Specification")).click();
		WebElement spec = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/table/tbody/tr/td[2]"));
		if(spec.isDisplayed())
		{
			System.out.println("Specifications are displayed");
		}
		else
		{
			System.out.println("Specifications are not displayed");
		}
		driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']")).click();
		WebElement sucess = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		if(sucess.isDisplayed())
		{
			System.out.println(sucess.getText());
		}
		else
		{
			System.out.println("Sucess message not displyed");
		}
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Mobile");
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/span/button")).click();
		driver.findElement(By.xpath("//input[@name='description']")).click();
		driver.findElement(By.xpath("//input[@id='button-search']")).click();
		driver.findElement(By.linkText("HTC Touch HD")).click();
		driver.findElement(By.xpath("//input[@name='quantity']")).clear();
		driver.findElement(By.xpath("//input[@name='quantity']")).sendKeys("3");
		driver.findElement(By.id("button-cart")).click();
		try
		{
			WebElement suc2 = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
			if(suc2.isDisplayed())
			{
				System.out.println(suc2.getText());
			}
	    }
		catch(Exception e)
		{
			System.out.println("Sucess message not displyed");
		}
		driver.findElement(By.xpath("//span[@id='cart-total']")).click();
		try
		{
			WebElement name = driver.findElement(By.linkText("HTC Touch HD"));
			if(name.isDisplayed())
			{
				System.out.println(name.getText()+" is displyed");
			}
		}
		catch(Exception e)
		{
			System.out.println("Phone name not displyd");
		}
		driver.findElement(By.linkText("Checkout")).click();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Logout")).click();
		WebElement logout = driver.findElement(By.xpath("/html/body/div[2]/div/div/h1"));
		if(logout.isDisplayed())
		{
			System.out.println(logout.getText());
		}
		else
		{
			System.out.println("Logout message not displyed");
		}
		driver.findElement(By.linkText("Continue")).click();
	}
}
