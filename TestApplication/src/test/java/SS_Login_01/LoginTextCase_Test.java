package SS_Login_01;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import ShopperStackPom.HomePage_PomClass;
import ShopperStackPom.LoginPage_Pom;

public class LoginTextCase_Test extends BaseClass{

	@Test
	public void login() throws InterruptedException {
		HomePage_PomClass homePage=new HomePage_PomClass(webDriver);
		boolean status=homePage.getWelcomeMsg().isDisplayed();
		Assert.assertTrue(status, "WELCOME MESSAGE DISPLAYED");
		Thread.sleep(1000);
		homePage.getLoginButton().click();
		
		LoginPage_Pom loginPage=new LoginPage_Pom(webDriver);
		status=loginPage.getShopperLoginText().isDisplayed();
		Assert.assertTrue(status, "Shopper Login Displayed");
		
		loginPage.getEmailTextField().sendKeys("chetanghodekar7875@gmail.com");
		loginPage.getPasswordTextField().sendKeys("Chetan@7875");
		loginPage.getLoginButton().click();
		
		status=homePage.getHomeLink().getText().contains("Home");		
		Thread.sleep(1000);
		Assert.assertTrue(status,"HOME PAGE DISLAYED");
	}
	
}
