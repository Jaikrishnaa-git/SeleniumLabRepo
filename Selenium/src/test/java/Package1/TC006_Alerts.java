package Package1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC006_Alerts {

	public static void main(String args[]) throws InterruptedException
	{
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.findElement(By.id("accept")).click();
		Thread.sleep(1000);
		Alert simple = driver.switchTo().alert();
		System.out.println("Alert Message: "+simple.getText());
		simple.accept();
		Thread.sleep(1000);
		
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(1000);
		Alert confirm = driver.switchTo().alert();
		System.out.println("Alert Message: "+confirm.getText());
		simple.accept();
		Thread.sleep(1000);
		
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(1000);
		Alert promptalert=driver.switchTo().alert();
		System.out.println("Alert message: "+promptalert.getText());
		Thread.sleep(1000);
		promptalert.sendKeys("Jk");
		promptalert.dismiss();
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
