package Package1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC005_UsingSelect {

	public static void main(String args[])
	{
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		driver.findElement(By.linkText("Desktops")).click();
		driver.findElement(By.linkText("Mac (1)")).click();
		Select sort = new Select(driver.findElement(By.id("input-sort")));
		List<WebElement> list = sort.getOptions();
		for(WebElement opt : list)
		{
			System.out.println(opt.getText());
		}
	}
}
