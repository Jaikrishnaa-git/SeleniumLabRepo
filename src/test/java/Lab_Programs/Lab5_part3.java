package Lab_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab5_part3{

	public static void part3()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		String input = "Jaikrishnaa";
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		firstName.sendKeys(input);
		driver.findElement(By.id("input-lastname")).sendKeys("Saravanan");
		driver.findElement(By.id("input-email")).sendKeys("jaikrishnaa.git@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("9876543210");
	    driver.findElement(By.id("input-password")).sendKeys("Team@A8");
		driver.findElement(By.id("input-confirm")).sendKeys("Team@A8");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[3]/div/div/label/input")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement sucess = driver.findElement(By.xpath("/html/body/div[2]/div/div/h1"));
		if(sucess.isDisplayed())
		{
			System.out.print("The Success message is printed");
		}
		else
		{
			System.out.print("The Success message is not printed");
		}
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/a")).click();
		driver.findElement(By.linkText("View your order history")).click();
	}
	public static void main(String args[])
	{
		part3();
	}
}
