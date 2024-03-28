package ShopperStackPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import BasePackage.BasePage;
import lombok.Getter;

@Getter
public class ElectronicGstStore_Pom extends BasePage{
	
	public ElectronicGstStore_Pom(WebDriver webDriver) {
		super(webDriver);
	}

	@FindBy(xpath = "//a[conatins(text(),'electronics')]")
	private WebElement electronicsText;
	
	@FindBy(xpath = "(//span[text()='sony'])[1]")
	private WebElement sonyTvProduct;
	
	@FindBy(xpath = "(//span[text()='sony'])[1]/../..//button")
	private WebElement sonyTvProductAddToCartButton;
}
