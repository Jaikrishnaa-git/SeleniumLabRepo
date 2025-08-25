package Package1;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC007_windows {

	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/window");
		driver.findElement(By.id("multi")).click();
		Set<String> windows = driver.getWindowHandles();
		for(String window : windows)
		{
			driver.switchTo().window(window);
			Thread.sleep(2000);
			System.out.println(driver.getCurrentUrl());
		}
		
		
//		Thread.sleep(3000);
//		driver.quit();
	}
}
