package ShopperStackPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import BasePackage.BasePage;
import lombok.Getter;
@Getter
public class ProductDescription_Pom extends BasePage{
	
	public ProductDescription_Pom(WebDriver webDriver) {
		super(webDriver);
	}
	
	@FindBy(xpath = "//span[text()='buy now']")
	private WebElement buyNowButton;
}
