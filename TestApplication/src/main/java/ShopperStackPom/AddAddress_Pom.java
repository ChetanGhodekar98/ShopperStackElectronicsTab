package ShopperStackPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;
import BasePackage.BasePage;
import lombok.Getter;

@Getter
public class AddAddress_Pom extends BasePage{
	
	public AddAddress_Pom(WebDriver webDriver) {
		super(webDriver);
	}
	@FindBy(id="Home")
	private WebElement homeRadioButton;
	
	@FindBy(id ="Office")
	private WebElement officeRadioButton;
	
	@FindBy(id ="Other")
	private WebElement otherRadioButton;
	
	@FindBy(id="Name")
	private WebElement nameTextField;
	
	@FindBy(xpath = "//p[text()='Must be alphabets']")
	private WebElement nameTextFieldErrorMessage;
	
	@FindBy(id="Name-label")
	private WebElement nameText;
	
	@FindBy(id="Name-helper-text")
	private WebElement Musthaveatleast3andlessthan20charactersMsg;
	
	@FindBy(id="House/Office Info")
	private WebElement HouseOfficeInfoTextField;
	
	@FindBy(id = "Street Info")
	private WebElement streetInfoTextField;
	
	@FindBy(id="Landmark")
	private WebElement LandmarkTextField;
	
	@FindBy(id="Country")
	private WebElement countryDropDown;
	
	@FindBy(id="State")
	private WebElement stateDropDown;
	
	@FindBy(id="City")
	private WebElement cityDropDown;
	
	@FindBy(id="Pincode")
	private WebElement pincodeTextField;
	
	@FindBy(id="pincode-error")
	private WebElement pincodeErrorMessage;
	
	@FindBy(id="Phone Number")
	private WebElement phoneNumberTextField;
	
	@FindBy(id="addAddress")
	private WebElement addAddressButton;
	
	@FindBy(id="5z938wu")
	private WebElement addAddressAddedToasterMessage;
}
