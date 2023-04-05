package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//variable declaration
	@FindBy(xpath="//input[@id='email']")
	private WebElement userName; //nonstatic
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement Password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement login ;
	
	@FindBy(xpath="//a[text()='Forgotten password?']")
	private WebElement Forgottenpassword ;
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement Createnewaccount ;
	
	//pom class ka constructor banana hai constructor always public
	
	//variable initialization
	
	public LoginPage(WebDriver driver) {
		
		//sabhi webelement ko initilize krne ke liye page factory nam ka class hai
		                                   //object of same class
		PageFactory.initElements(driver, this);
		           //webelement ko find krna
		}
	
	//variable use
	
	public void senduserName() {
		userName.sendKeys("Truptiadole020@gmail.com");
			}	
	
	public void sendpassword() {
		Password.sendKeys("Trupt123");
			}	
	
	public void clickonloginbutton() {
		login.click();
			}	
	
	public void clickonForgottenpassword() {
		Forgottenpassword.click();			}	
	
	public void clickon() {
		
			}	
	
	public void clickonCreatenewaccount() {
		Createnewaccount.click();
			}

	
	}	
	
	
	
	
	
	
	


