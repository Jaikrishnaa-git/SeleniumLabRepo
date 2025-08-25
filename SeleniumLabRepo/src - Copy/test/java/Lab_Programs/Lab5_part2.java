package Lab_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab5_part2 {

	public static void part2()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		String input = "qwertyuiopasdfghjklzxcvbnmqwerty";
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		firstName.sendKeys(input);
		driver.findElement(By.id("input-lastname")).sendKeys("Saravanan");
		driver.findElement(By.id("input-email")).sendKeys("jaikrishnaa.git@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		try
		{
		 WebElement errorMessage = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset/div[2]/div/div"));
		 if(errorMessage.isDisplayed())
		 {
			System.out.println("Error Message is Displayed on 33 charcater input");
		 }
		 else
		 {
			System.out.println("Error Message is not Displayed on 33 charcater input");
		 }
		}
		catch(Exception e)
		{
			System.out.println("Input is within 32 characters");
		}
//		finally
//		{
//			driver.quit();
//		}
	    
	}
	public static void main(String[]args)
	{
		part2();
	}
}
