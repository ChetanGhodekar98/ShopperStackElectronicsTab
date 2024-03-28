package Util;

import static org.testng.Assert.assertFalse;

import java.util.NoSuchElementException;

import org.testng.Assert;
import org.testng.annotations.Test;

import ShopperStackPom.AddAddress_Pom;
import ShopperStackPom.DeliveryAddress_Pom;

public class SS_Electronics_10_Test extends SS_Electronics_Test{
	@Test(dependsOnMethods = "TestCase")
	public void TestCase_10() throws InterruptedException {
		DeliveryAddress_Pom address=new DeliveryAddress_Pom(webDriver);
		address.getAddNewAddressButton().click();
		Thread.sleep(2000);
		
		AddAddress_Pom addAddress=new AddAddress_Pom(webDriver);
		addAddress.getHomeRadioButton().click();
		Thread.sleep(4000);
		
		addAddress.getNameTextField().sendKeys("sal");
		
		Thread.sleep(2000);
		
		String color=addAddress.getNameText().getCssValue("color");
		Assert.assertEquals(color, "rgba(63, 81, 181, 1)","PASSED");
	}
}
