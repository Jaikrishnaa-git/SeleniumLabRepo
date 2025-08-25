package Package1;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC003_FindAllElements {

	public static void main(String args[])
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		try
		{
			driver.findElement(By.xpath("//button[type='submit']")).click();
		}
		catch(Exception e)
		{
			
		}
		ArrayList<WebElement> allLinks=(ArrayList<WebElement>) driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		for(WebElement link : allLinks)
		{
			if(!link.getText().equals(""))System.out.println(link.getText());
		}
	}
}
