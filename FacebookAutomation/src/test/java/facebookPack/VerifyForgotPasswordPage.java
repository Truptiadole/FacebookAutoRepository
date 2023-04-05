package facebookPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.Forgotpassword;
import page.LoginPage;

public class VerifyForgotPasswordPage {
    
	WebDriver driver;
	LoginPage loginPage;
	Forgotpassword forgotpassword;
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Before class");
		System.setProperty("webdriver.chrome.diver", "E:\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void goToForgatePasswordPage() {
	System.out.println("Before Method");
	driver.get("https://www.facebook.com/");
	loginPage = new LoginPage(driver);
	loginPage.clickonForgottenpassword();
	forgotpassword = new Forgotpassword(driver);
	
	}
	
	@Test
	public void verifyforgotpasswordtext() {
		System.out.println("verifyforgotpasswordtext");
		//Forgotpassword forgotpassword = new Forgotpassword(driver);
		String actualMsg =  forgotpassword.gettextmassage();
		String expectedMsg="Please enter your email address or mobile number to search for your account.";
		if(actualMsg.equals("expectedMsg"))
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILD");
		}
	}
	
	@Test
	public void verifyCancleButton() {
		System.out.println("verifyCancleButton");
		//Forgotpassword forgotpassword = new Forgotpassword(driver);
		forgotpassword.clickonCancelButton();
		String expectedURL="";
		String expectedTitle="";
		String actualURL= driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		if(expectedURL.equals(actualURL) && (expectedTitle.equals(actualTitle)))
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILD");
		}
	}
	
	@Test
	public void verifySearchButton() {
		System.out.println("verifySearchButton");
		//Forgotpassword forgotpassword = new Forgotpassword(driver);
		forgotpassword.sendEmailOrpass();
		forgotpassword.clickonSearchButton();
		
		String expectedURL="";
		String expectedTitle="";
		String actualURL= driver.getCurrentUrl();
		String actualTitle=driver.getTitle();
		if(expectedURL.equals(actualURL) && (expectedTitle.equals(actualTitle)))
		{
			System.out.println("PASSED");
		}
		else
		{
			System.out.println("FAILD");
		}
		
		
		
		
		
		
	}
}
