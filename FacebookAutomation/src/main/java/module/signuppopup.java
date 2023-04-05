package module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signuppopup {

	@FindBy(xpath= "(//input[@type='text'])[2]")
	private WebElement FirstName; //nonstatic
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement Surname;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement MobOrEmail;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement Newpassword ;
	
	@FindBy(xpath="	//select[@aria-label='Day']")
	private WebElement BirthOfDay ;
	
	@FindBy(xpath="//select[@aria-label='Month']")
	private WebElement BirthOfMonth ;
	
	@FindBy(xpath="//select[@aria-label='Year']")
	private WebElement birthOfYear ;
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement Female ;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement male ;
	
	@FindBy(xpath="(//input[@type='radio'])[3]")
	private WebElement Custom ;
	
	@FindBy(xpath="//select[@aria-label='Select your pronoun']")
	private WebElement Selectyourpronoun;
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	private WebElement GenderOptional;
	
	
	@FindBy(xpath="//button[text()='Sign Up'][1]")
	private WebElement SignUp;
	
	
	WebDriver driver;
	WebDriverWait wait;

	
   public signuppopup(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
		wait= new WebDriverWait(driver,20);

		}	
	public void sendFirstName() {
		FirstName.sendKeys("Trupti");
	}
	
	public void sendSurname() {
		Surname.sendKeys("Adole");
	}

	public void sendMobOrEmail() {
		MobOrEmail.sendKeys("1234567890");
	}
	
	public void sendNewpassword() {
		Newpassword.sendKeys("120012");
	}
	
	public void selectBirthOfDay() {
		Select select= new Select(BirthOfDay);
		select.selectByVisibleText("2");
		
	}
	public void selectBirthOfMonth() {
		Select select= new Select(BirthOfMonth);
		select.selectByVisibleText("may");
		
	}
	
	public void selectbirthOfYear() {
		Select select= new Select(birthOfYear);
		select.selectByVisibleText("2020");
		
	}
	public void clickOnCustom() {
		Actions action = new Actions(driver);
		
		//WebDriverWait wait= new WebDriverWait(driver,20);
		wait= new WebDriverWait(driver,20);

		wait.until(ExpectedConditions.visibilityOf(Custom));
		
	    action.moveToElement(Custom).click().build().perform();	
	    
	}	
	
	public void clickOnFemale() {
		Actions action = new Actions(driver);
	    action.moveToElement(Female).click().build().perform();	
	}	
	
	public void clickOnmale() {
		Actions action = new Actions(driver);
	    action.moveToElement(male).click().build().perform();	
	}	
	
	public void sendGenderOptional() {
		GenderOptional.sendKeys("abcd");
	}
	
	
	
}

























