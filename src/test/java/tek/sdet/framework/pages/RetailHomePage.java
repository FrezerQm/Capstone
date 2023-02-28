package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{

	public RetailHomePage() {
		PageFactory.initElements(getDriver(),this);
	}
		//header
		@FindBy(linkText = "TEKSCHOOL")   //the same driver.findElement()
		public WebElement tekschoolLogo;
		
		@FindBy(id = "search")
		public WebElement departmentDropDown;
		
		@FindBy(id = "searchInput")
		public WebElement searchBarInput;
		 
		@FindBy(id = "searchBtn")
		public WebElement searchButton;
		
		@FindBy(id = "signinLink")
		public WebElement signinButton;
		
		@FindBy(id = "cartBtn")
		public WebElement cartButton;
		
		@FindBy(id = "accountLink")
		public WebElement accountLink;
		
		@FindBy(id = "logoutBtn")
		public WebElement logOutButton;
		
		@FindBy (id = "orderLink")
		public WebElement orderButton;
		
		//SideBar
		   @FindBy (xpath = "//div[@class='sidebar__header']")
		   public WebElement header;
		   
		   @FindBy(id = "closeBtn")
		   public WebElement closeButton;
		   
		   @FindBy(id = "contentHeader")
		   public WebElement contentHeader;
		
		   @FindBy(xpath = "//span[text()='Electronics']")
		   public WebElement electronics;
		   
		     @FindBy (id = "submenuBtn")
		     public WebElement mainMenu;
		     
		     @FindBy (xpath = "//span[text()='TV & Video']")
		     public WebElement tvVideo;
		     
		     @FindBy (xpath = "//span[text()='Video Games']")
		     public WebElement videoGames;
		     
		  @FindBy(xpath = "//span[text()='Computers']")
		  public WebElement computers;
		  
		     @FindBy (xpath = "//span[text()='Accessories']")
		     public WebElement accessories;
		     
		     @FindBy (xpath = "//span[text()='Networking']")
		     public WebElement networking;
		     
		 @FindBy(xpath = "//span[text()='Smart Home']")
		  public WebElement smartHome;
		 
		     @FindBy (xpath = "//span[text()='Smart Home Lightning']")
		     public WebElement lightning;
		     
		     @FindBy (xpath = "//span[text()='Plugs and Outlets']")
		     public WebElement outlets;
		     
		 @FindBy (xpath = "//span[text()='Sports']")
		 public WebElement sports;
		 
		     @FindBy(xpath = "//span[text()='Athletic Clothing']")
		     public WebElement clothing;
		     
		     @FindBy (xpath = "//span[text()='Exercise & Fitness']")
		     public WebElement fitness;
		     
		 @FindBy (xpath = "//span[text()='Automative']")
	      public WebElement automative;
		 
		     @FindBy (xpath = "//span[text()='Automative Parts & Accessories']")
	          public WebElement autoAccessories;
		     
		     @FindBy (xpath = "//span[text()='MotorCycle & Powersports']")
		     public WebElement powersports;
		     
		//header2
		@FindBy(id = "hamburgerBtn")
		public WebElement hamburgerButton;
		
		@FindBy(linkText = "Test Selenium")
		public WebElement testSelenium;
		
		@FindBy(id = "heroImage")
		public WebElement homePageImg;
		
		//Shop by category
		@FindBy (xpath = "(//div[@class='home__category-item'])[1]" )
		public WebElement TVVideoDept;
		
		@FindBy(xpath = "(//div[@class='home__category-item'])[2]")
		public WebElement videogameDept;
		
		@FindBy (xpath = "(//div[@class='home__category-item'])[3]")
		public WebElement accessoriesDept;
		
		@FindBy(xpath = "(//div[@class='home__category-item'])[4]")
		public WebElement networkingDept;
		
		@FindBy(xpath = "(//div[@class='home__category-item'])[5]")
		public WebElement lightningDept;
		
		@FindBy (xpath = "(//div[@class='home__category-item'])[6]")
		public WebElement outletDept;
		
		@FindBy (xpath = "(//div[@class='home__category-item'])[7]")
		public WebElement clothingDept;
		
		@FindBy (xpath = "(//div[@class='home__category-item'])[8]")
		public WebElement fitnessDept;
		
		@FindBy (xpath = "(//div[@class='home__category-item'])[9]")
		public WebElement autoAccessoriesDept;
		
		@FindBy (xpath = "(//div[@class='home__category-item'])[10]")
		public WebElement powerSportDept;
		
		@FindBy(xpath = "//img[@alt='YESLIFE Ski Mask']")
		public WebElement skiMask;
		
		@FindBy(xpath = "//img[@alt='Under Armour Men's Playoff 2.0 Golf Polo']")
		public WebElement poloShirt;
		
		@FindBy (xpath = "//img[@alt='Lutron Pico Smart Remote Control ']")
		public WebElement remote;
		
		@FindBy (xpath = "//img[@alt='X-PRO 125cc Vader Adult Motorcycle Gas Motorcycle']")
		public WebElement motorbike;
		
		@FindBy (xpath = "//img[@alt='USB Microphone']")
		public WebElement microphone;
		
		@FindBy (xpath = "//img[@alt='VIPERTEK VTS-989-1 Billion Heavy Duty Stun Gun']")
		public WebElement stuntGun;
		
		@FindBy (xpath = "//img[@alt='Bike Phone Holder']")
		public WebElement phoneHolder;
		
		@FindBy(xpath = "//img[@alt='Ubiquiti UniFi 6 Pro Access Point']")
		public WebElement accessPoint;
		
		@FindBy(xpath = "//img[@alt='Amazon Fire TV ']")
		public WebElement amazonTV;
		
		@FindBy (xpath = "//img[@alt='TCL 32-inch 3-Series 720p Roku Smart TV - 32S335, 2021 Model']")
		public WebElement tclTV;
		
		@FindBy (xpath = "//img[@alt='WILSON Traditional Soccer Ball']")
		public WebElement soccerBall;
		
		@FindBy(xpath = "//img[@alt='SanDisk 128GB Ultra microSDXC UHS-I Memory Card']")
		public WebElement memoryCard;
		
		@FindBy(xpath = "//img[@alt='Trading Card Binder for Pokemon']")
		public WebElement pokemonItem;
		
		@FindBy(className = "products__layout")
		public WebElement product;
		
		@FindBy(className = "product__select")
		public WebElement qty;
		
		@FindBy(id = "addToCartBtn")
		public WebElement addToCartButton;
		
		@FindBy(id = "cartQuantity")
		public WebElement cartQuantity;
		
		@FindBy(id = "proceedBtn")
		public WebElement proceedToCheckout;
		
		@FindBy(id = "addAddressBtn")
		public WebElement addAddressButton;
		
		@FindBy(id = "addPaymentBtn")
		public WebElement addPaymentButton;
		
		@FindBy(id = "placeOrderBtn")
		public WebElement placeOrderButton;
		
		@FindBy (xpath = "//div[text()='For Learning Purposes Only']")
		public WebElement footer;
		
		
	}

