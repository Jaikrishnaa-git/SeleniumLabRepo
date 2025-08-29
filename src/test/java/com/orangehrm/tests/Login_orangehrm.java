package com.orangehrm.tests;
 
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.orangehrm.Base.BaseTest;
import com.orangehtm.Pages.Loginpage;
import com.orangehrm.Utilites.ExcelUtility;
import com.orangehrm.Utilites.ScreenshotUtilities;
 
public class Login_orangehrm extends BaseTest{
	
	 static String projectpath=System.getProperty("user.dir")  ;
	@Test(dataProvider="logindata")
	public void verifylogin(String username, String password) throws IOException, InterruptedException
	{    
		String URL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		ExtentTest test = extent.createTest("login with the user:"+username);
		Loginpage obj=new Loginpage(driver);
		obj.enterusername(username);
		obj.enterpassword(password);
		obj.clickonbutton();
		
		Thread.sleep(3000);
		if(!driver.getCurrentUrl().equals(URL))
		{
			test.pass("Login is sucess for user:"+username);
			
		}
		else
			test.fail(" login unsuccess for the user:"+username).addScreenCaptureFromPath(ScreenshotUtilities.capturescreen(driver, "Verify login"));
	}
	@DataProvider
	public Object[][] logindata() throws IOException
	{
		return ExcelUtility.testData(projectpath+"\\src\\test\\resources\\Testdata\\data.xlsx", "Sheet1");
	}
 
}