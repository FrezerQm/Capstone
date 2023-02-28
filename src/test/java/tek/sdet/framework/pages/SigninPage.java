package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class SigninPage extends BaseSetup{

	public SigninPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//h1[text()='TEKSCHOOL']")
	public WebElement title;
	
	//Login Form
	@FindBy(xpath = "//h1[text()='Sign in']")
	public WebElement subtitle;
	
	@FindBy(id = "email")
	public WebElement emailInput;
	
	@FindBy(id = "password")
	public WebElement passwordInput;
	
	@FindBy(id = "loginBtn")
	public WebElement loginBtn;
	
	@FindBy (id = "newAccountBtn")
	public WebElement createAccountBtn;
	
	@FindBy (id = "newCompanyAccount")
	public WebElement companyAccount;
	
	

}
