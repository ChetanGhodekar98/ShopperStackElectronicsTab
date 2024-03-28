package Util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import SS_Login_01.LoginTextCase_Test;
import ShopperStackPom.ElectronicGstStore_Pom;
import ShopperStackPom.HomePage_PomClass;
import ShopperStackPom.ProductDescription_Pom;

public class SS_Electronics_Test extends LoginTextCase_Test{

	@Test(dependsOnMethods = "login")
	public void TestCase() throws InterruptedException {
		HomePage_PomClass homePage=new HomePage_PomClass(webDriver);
		Thread.sleep(4000);
				
		Actions actions=new Actions(webDriver);
		actions.moveToElement(homePage.getElectronicTab()).click().perform();;
		Thread.sleep(4000);
		homePage.getElectronicsGSTStore().click();
		Thread.sleep(4000);
		ElectronicGstStore_Pom electronicGstStore=new ElectronicGstStore_Pom(webDriver);
		
		JavascriptExecutor js = (JavascriptExecutor) webDriver;
		js.executeScript("window.scrollBy(0,2750)", "");
		
		actions.moveToElement(electronicGstStore.getSonyTvProduct());
		electronicGstStore.getSonyTvProduct().click();
		Thread.sleep(3000);
		
		ProductDescription_Pom product=new ProductDescription_Pom(webDriver);
		product.getBuyNowButton().click();
		Thread.sleep(3000);
		}
}
