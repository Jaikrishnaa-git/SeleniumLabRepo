package Lab_Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab5_part1 {

	public static void part1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		String title = driver.getTitle();
		System.out.println("The title is: "+title);
		String expected = "Warning: You must agree to the Privacy Policy!";
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement errorMessage = driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible"));
        String message = errorMessage.getText();
        System.out.println("The error message is:" + message);
        if(expected.equals(message))
        {
        	System.out.println("Error message displayed correctly");
        }
        else
        {System.out.println("Error message displayed incorrectly");
        	
        }
	}
	public static void main(String args[])
	{
		part1();
	}
}
