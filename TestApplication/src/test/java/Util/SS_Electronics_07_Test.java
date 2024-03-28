package Util;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import ShopperStackPom.DeliveryAddress_Pom;

public class SS_Electronics_07_Test extends SS_Electronics_Test{
	
	@Test(dependsOnMethods = "TestCase")
	public void testCase_07() {
		JavascriptExecutor js = (JavascriptExecutor) webDriver;

		DeliveryAddress_Pom address=new DeliveryAddress_Pom(webDriver);
		js.executeScript("window.scrollBy(0,250)", "");
		address.getHomeAddressRadioBuuton().click();
		
		address.getHomeAddressRadioBuuton().isSelected();
		}
}
