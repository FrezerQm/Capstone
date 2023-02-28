package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {

	private RetailHomePage homePage;
	private SigninPage signinPage;
	private AccountPage accountPage;
	private SignUpPage signupPage;
	private RetailOrderPage orderPage;

	public POMFactory() {
		this.homePage = new RetailHomePage();
		this.signinPage = new SigninPage();
		this.signupPage = new SignUpPage();
		this.accountPage = new AccountPage();
		this.orderPage = new RetailOrderPage();
	}

	public RetailHomePage homePage() {
		return this.homePage;
	}

	public SigninPage signinPage() {
		return this.signinPage;
	}

	public AccountPage accountPage() {
		return this.accountPage;
	}

	public SignUpPage signupPage() {
		return this.signupPage;
	}
	
	public RetailOrderPage orderPage() {
		return this.orderPage;
	}
}
