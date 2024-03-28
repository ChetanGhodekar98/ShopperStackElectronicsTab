package ShopperStackPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import BasePackage.BasePage;
import lombok.Getter;

@Getter
public class DeliveryAddress_Pom extends BasePage{
	
	public DeliveryAddress_Pom(WebDriver webDriver) {
		super(webDriver);
	}
	
	@FindBy(id="21034")
	private WebElement homeAddressRadioBuuton;
	
	@FindBy(xpath = "//span[text()='Add New Address']")
	private WebElement addNewAddressButton;
	
}
