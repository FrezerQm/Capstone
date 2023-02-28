package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility{

	private POMFactory factory = new POMFactory();

	
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountLink);
		logger.info("User click on Account option");
	}
	
	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhoneNumber(String name, String phoneNumber) {
		clearTextUsingSendKeys(factory.accountPage().nameInput);
		sendText(factory.accountPage().nameInput, name);
		clearTextUsingSendKeys(factory.accountPage().phoneInput);
		sendText(factory.accountPage().phoneInput, phoneNumber);
		logger.info("User update name and phone number");
	}
	
	@And("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().personalUpdateBtn);
		logger.info("User click update button");
	}
	
	@Then("User profile information should be updated")
	public void userProfileInformationUpdated(){
		String actualName = factory.accountPage().nameInput.getAttribute("value");
		System.out.println("Actual Name: " + actualName);
		String expectedName = "PhantomFN";
		Assert.assertEquals(expectedName, actualName);
		waitTillPresence(factory.accountPage().updatedInfoMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().updatedInfoMessage));
		logger.info("User profile information is updated");
		
	}
	
	@And("User enter below information")
	public void userEnterNewPassword(DataTable table) {
		List<Map<String, String>> data = table.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPasswordInput, data.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPasswordInput, data.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPasswordInput, data.get(0).get("confirmPassword"));
		logger.info("User enter information in data table");
	}
	
	@And("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().changePasswordButton);
		logger.info("User click on Change Password button");
	}
	
	@Then("A message should be displayed 'Password Updated Successfully'")
	public void successMessageShouldBeDisplayed() {
		waitTillPresence(factory.accountPage().updatedPasswordMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().updatedPasswordMessage));
		logger.info("A message confirm user successfully updated password should be displayed");
	}
	
	@And("User click on Add a payment method")
	public void userClickOnAddPaymentMethod() {
		click(factory.accountPage().addPaymentMethod);
		logger.info("User click on Add Payment Method button");
	}
	
	@And("User fill Debit or credit card information")
	public void userFillCardInfomation(DataTable table) {
		List<Map<String, String>> data = table.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberInput,data.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardInput, data.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonth, data.get(0).get("ExpirationMonth"));
		selectByVisibleText(factory.accountPage().expirationYear, data.get(0).get("expirationYear"));
		sendText(factory.accountPage().securityCodeInput, data.get(0).get("securityCode"));
		logger.info("User fill debit or credit card information");
	}
	
	@And("User click on Add Your Card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().addYourCardButton);
		logger.info("User click on Add Your Card button");
	}
	
	@Then("A message should be displayed 'Payment Method added successfully'")
	public void aConfirmMessageShouldBeDisplayed() {
		waitTillPresence(factory.accountPage().addedCardMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addedCardMessage));
		logger.info("A message should be displayed");
	}
	
	@And("User click on Edit option of card section")
	public void userClickOnEditOptionofCardSection() {
		click(factory.accountPage().cardInfo);
		click(factory.accountPage().editCardOption);
		logger.info("User click on Edit option of card section");
	}
	
	@And("User edit information with below data")
	public void userEditInfoWithData(DataTable table) {
		List<Map<String, String>> data = table.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
		sendText(factory.accountPage().cardNumberInput, data.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().nameOnCardInput);
		sendText(factory.accountPage().nameOnCardInput, data.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().expirationMonth, data.get(0).get("expirationMonth"));
		selectByVisibleText(factory.accountPage().expirationYear, data.get(0).get("expirationYear"));
		clearTextUsingSendKeys(factory.accountPage().securityCodeInput);
		sendText(factory.accountPage().securityCodeInput, data.get(0).get("securityCode"));
		logger.info("User update card information");
	}
	
	@And("User click on Update Your Card button")
	public void userClickOnUpdateCardButton() {
		click(factory.accountPage().addYourCardButton);
		logger.info("User click Update Your Card button");
	}
	
	@Then("A message should be displayed 'Payment Method updated Successfully'")
	public void confirmMessageShouldBeDisplayed() {
		waitTillPresence(factory.accountPage().updatedCardMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().updatedCardMessage));
		logger.info("A message should be displayed 'Payment Method updated Successfully'");
	}
	
	@And("User click on remove option of Card section")
	public void userClickOnremoveOption() {
		click(factory.accountPage().cardInfo);
		click(factory.accountPage().removeCardOption);
		logger.info("User click on remove option of card section");
	}
	
	@Then("Payment details should be removed")
	public void paymentDetailRemove() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().debitCard));
		logger.info("Remove card");
	}
	
	@And("User click on Add Address option")
	public void userClickOnAddAddress() {
		click(factory.accountPage().addAddressOption);
		logger.info("User click on add Address option");
	}
	
	@And("User fill new address form with below information")
	public void userFillAddressForm(DataTable table) {
		List<Map<String, String>> data = table.asMaps(String.class,String.class);
		selectByVisibleText(factory.accountPage().country, data.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().fullNameInput);
		sendText(factory.accountPage().fullNameInput, data.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().phoneNumberInput);
		sendText(factory.accountPage().phoneNumberInput, data.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().streetInput);
		sendText(factory.accountPage().streetInput, data.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().aptInput);
		sendText(factory.accountPage().aptInput, data.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().cityInput);
		sendText(factory.accountPage().cityInput, data.get(0).get("city"));
		selectByVisibleText(factory.accountPage().state, data.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().zipCodeInput);
		sendText(factory.accountPage().zipCodeInput, data.get(0).get("zipCode"));
		logger.info("User fill new address form");
	}
	
	@And("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		waitTillClickable(factory.accountPage().addAddressButton);
		click(factory.accountPage().addAddressButton);
		logger.info("User click Add Your Address button");
	}
	
	@Then("A message should be displayed 'Address Added Successfully'")
	public void aMessageShouldBeDisplayed() {
		waitTillPresence(factory.accountPage().addedAddressMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addedAddressMessage));
		logger.info("A message should be displayed 'Address Added Successfully'" );
	}
	
	@And("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(factory.accountPage().editAddress);
		logger.info("User click on Edit Address option");
	}
	
	@And("User click Update Your Address button")
	public void userClickOnUpdateAddressButton() {
		click(factory.accountPage().addAddressButton);
		logger.info("User click on Update Your Address button");
	}
	
	@Then("A message should be displayed 'Address Uploaded Successfully'")
	public void confirmMessageshouldBeDisplayed() {
		waitTillPresence(factory.accountPage().updatedAddressMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().updatedAddressMessage));
		logger.info("A message should be displayed 'Address Added Successfully'" );
	}
	
	@And("User click on remove option of Address section")
	public void userClickOnRemoveAddressOption() {
		click(factory.accountPage().removeAddress);
		logger.info("User click on remove option of Address section");
	}
	
	@Then("Address details should be removed")
	public void removeAddress() throws InterruptedException {
		wait(500);
		Assert.assertFalse(isElementDisplayed(factory.accountPage().addedAddress));
		logger.info("Remove added Address");
	}
	
}
