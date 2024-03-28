package ShopperStackPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import BasePackage.BasePage;
import lombok.Getter;
@Getter
public class LoginPage_Pom extends BasePage{
	
	public LoginPage_Pom(WebDriver webDriver) {
		super(webDriver);
	}
	
	@FindBy(xpath = "//strong")
	private WebElement shopperLoginText;
	
	@FindBy(id="Email")
	private WebElement emailTextField;

	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginButton;
	
}
