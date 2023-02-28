package tek.sdet.framework.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{

	private POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")    
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekschoolLogo));
		logger.info("User is on retail website");
		
	}
	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signinButton);
		logger.info("User click on Sign in option");
	}
	
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassWord(String emailValue, String passValue) {
		sendText(factory.signinPage().emailInput, emailValue);
		sendText(factory.signinPage().passwordInput, passValue);
		logger.info("User enter email and password value");
	}
	
	@And("User click on login button")
	public void userClickOnLoginButton() {
		click(factory.signinPage().loginBtn);
		logger.info("User click on log in button");
	}
	
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedIntoAccount() {
		waitTillPresence(factory.homePage().accountLink);
		Assert.assertTrue(isElementDisplayed(factory.homePage().logOutButton));
		logger.info("User should be logged in into Account");
	}
	
	@And("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signinPage().createAccountBtn);
		logger.info("User click on Create New Account button");
	}
	
	@And("User fill the sign up information with below data")
	public void userFillTheSignUpFormWithBelowData(DataTable table) {
		List<Map<String, String>> data = table.asMaps(String.class, String.class);
		sendText(factory.signupPage().nameInput, data.get(0).get("name"));
		sendText(factory.signupPage().emailInput, data.get(0).get("email"));
		sendText(factory.signupPage().passwordInput, data.get(0).get("password"));
		sendText(factory.signupPage().confirmPasswordInput, data.get(0).get("confirmPassword"));
		logger.info("User fill the sign up information form with data table");
	}
	
	@And("User click in Sign Up button")
	public void userClickInSignUpButton() {
		click(factory.signupPage().signupButton);
		logger.info("User click in Sign up button");
	}
	
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		waitTillClickable(factory.accountPage().profileImage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().profileImage));
		logger.info("User is logged into Account page");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
