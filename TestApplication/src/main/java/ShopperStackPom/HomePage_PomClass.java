package ShopperStackPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import BasePackage.BasePage;
import lombok.Getter;

@Getter
public class HomePage_PomClass extends BasePage{
	
	public HomePage_PomClass(WebDriver webDriver) {
		super(webDriver);
	}
	@FindBy(id="loginBtn")
	private WebElement loginButton;
	
	@FindBy(xpath = "//h3")
	private WebElement welcomeMsg; 
	
	@FindBy(xpath = "//a[text()='Home']")
	private WebElement homeLink;
	
	@FindBy(xpath = "//li/a[@id='electronics']")
	private WebElement electronicTab;
	
	@FindBy(xpath = "//li/a[contains(text(),'Electronics GST Store')]")
	private WebElement ElectronicsGSTStore;
		
	
	
}
