package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002 {

	public static void main(String[]args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title is : "+driver.getTitle());
		driver.navigate().to("https://www.yahoo.com");
		System.out.println("Title is : "+driver.getTitle());
		driver.navigate().back();
		System.out.println("Title after back : "+driver.getTitle());
		driver.navigate().forward();
		System.out.println("Title after forward : "+driver.getTitle());
		String url= driver.getCurrentUrl();
		String page = driver.getPageSource();
		System.out.println(url);
		System.out.print(page);
		
	}
}
