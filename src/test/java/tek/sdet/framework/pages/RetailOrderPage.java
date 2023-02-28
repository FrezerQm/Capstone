package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{

	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id = "cancelBtn")
	public WebElement cancelButton;
	
	  @FindBy(id = "reasonInput")
	  public WebElement reasonInput;
	  
	  @FindBy(id = "orderSubmitBtn")
	  public WebElement orderSubmitButton;
	
	@FindBy(id = "returnBtn")
	public WebElement returnButton;
	
	 @FindBy (id = "dropOffInput")
	 public WebElement dropOffInput;
	
	@FindBy(id = "buyAgainBtn")
	public WebElement buyAgainButton;
	
	@FindBy(id = "reviewBtn")
	public WebElement reviewButton;
	
	@FindBy(id = "headlineInput")
	public WebElement headlineInput;
	
	@FindBy(id = "descriptionInput")
	public WebElement descriptionInput;
	
	@FindBy(id = "reviewSubmitBtn")
	public WebElement addYourReviewButton;
	
	@FindBy(className = "order")
	public WebElement firstOrder;
}
