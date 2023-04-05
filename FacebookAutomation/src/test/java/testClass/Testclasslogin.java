package testClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.LoginPage;
import page.Forgotpassword;

public class Testclasslogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
            
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		LoginPage login=new LoginPage(driver);
		
		Thread.sleep(2000);
		
		login.senduserName();
		login.sendpassword();
		//login.clickonloginbutton();
		
		login.clickonForgottenpassword();
		
		Forgotpassword ForgotPassword=new Forgotpassword(driver);
		
		ForgotPassword.gettextmassage();
		ForgotPassword.sendEmailOrpass();
		ForgotPassword.clickonCancelButton();
		ForgotPassword.clickonSearchButton();
		
		
	}

}
