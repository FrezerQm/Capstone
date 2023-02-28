package tek.sdet.framework.steps;

import org.junit.Assert;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{

	private POMFactory factory = new POMFactory();

	@And("User click on Orders section")
	public void userClickOnOrderSection() {
		click(factory.homePage().orderButton);
		logger.info("User click on Orders section");
	}
	
	@And("User click on first order in list")
	public void userCliclOnFirstOrder() {
		click(factory.orderPage().firstOrder);
		logger.info("User clicked on first order");
	}
	
	@And("User click on Cancel The Order button")
	public void userClickOnCancelOrder() {
		click(factory.orderPage().cancelButton);
		logger.info("User click on Cancel The Order button");
	}
	
	@And("User select the cancelation reason {string}")
	public void userSelectCancelationReason(String reason) {
		click(factory.orderPage().reasonInput);
		selectByVisibleText(factory.orderPage().reasonInput, reason);
		logger.info("User select the cancelation reason 'Bought wrong item'");
	}
	
	@And("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().orderSubmitButton);
		logger.info("User click on Cancel Order button");
	}
	
	@Then("A cancelation message should be displayed {string}")
	public void cancelationMessageShouldBeDisplayed(String message) {
		Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//p[text()='" + message + "']"))));
		logger.info("Cancelation message displayed");
	}
	
	@And("User click on Return Item button")
	public void userClickOnReturnItemButton() {
		click(factory.orderPage().returnButton);
		logger.info("User click on Return Item button");
	}
	
	@And("User select the Return Reason {string}")
	public void userSelectReturnReason(String reason) {
		click(factory.orderPage().reasonInput);
		selectByVisibleText(factory.orderPage().reasonInput, reason);
		logger.info("User select return reason");
	}
	
	@And("User select the drop off service {string}")
	public void userSelectDropOffService(String service) {
		click(factory.orderPage().dropOffInput);
		selectByVisibleText(factory.orderPage().dropOffInput, service);
		logger.info("User select the drop off service 'FedEx'");
	}
	
	@And("User click on Return Order button")
	public void userClickOnReturnOrder() {
		click(factory.orderPage().orderSubmitButton);
		logger.info("User click on Return Order Button");
	}
	
	@And("User click on Review button")
	public void userClickOnReviewButton() {
		click(factory.orderPage().reviewButton);
		logger.info("User click on Review button");
	}
	
	@And("User write Review headline {string} and {string}")
	public void userWriteReview(String headline, String reviewText) {
		sendText(factory.orderPage().headlineInput, headline);
		sendText(factory.orderPage().descriptionInput, reviewText);
		logger.info("User write review");
	}
	
	@And("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(factory.orderPage().addYourReviewButton);
		logger.info("User click Add Your Review button");
	}
	
	@Then("A review message should be displayed {string}")
	public void reviewMessageSubmit(String message) {
		Assert.assertTrue(isElementDisplayed(getDriver().findElement(By.xpath("//div[text()='" + message + "']"))));
		logger.info("A review message should be displayed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
