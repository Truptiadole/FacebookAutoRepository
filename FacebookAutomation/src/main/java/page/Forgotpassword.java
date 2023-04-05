package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgotpassword {
	
	@FindBy(xpath= "//table//div")
	private WebElement textmassage; //nonstatic
	
	@FindBy(xpath="	//input[@type='text']")
	private WebElement EmailOrpass;
	
	@FindBy(xpath="//a[text()='Cancel']")
	private WebElement CancelButton ;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement SearchButton ;
	
	
    public Forgotpassword(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

    public String gettextmassage() {
    	String text= textmassage.getText();
		return text;
			}	
    public void sendEmailOrpass() {
    	EmailOrpass.sendKeys("Trupti");
			}	
    
    public void clickonCancelButton() {
    	CancelButton.click();
			}	
    public void clickonSearchButton() {
    	SearchButton.click();				
    }
    
    
}
