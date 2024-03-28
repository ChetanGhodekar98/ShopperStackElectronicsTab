package Util;

import org.testng.annotations.Test;

import ShopperStackPom.AddAddress_Pom;
import ShopperStackPom.DeliveryAddress_Pom;

public class SS_Electronics_08_Test extends SS_Electronics_Test{
	
	@Test(dependsOnMethods = "TestCase")
	public void TestCase_08() throws InterruptedException {
		DeliveryAddress_Pom address=new DeliveryAddress_Pom(webDriver);
		address.getAddNewAddressButton().click();
		Thread.sleep(4000);
		
		AddAddress_Pom addAddress=new AddAddress_Pom(webDriver);
		addAddress.getOfficeRadioButton().click();
		Thread.sleep(4000); 
		addAddress.getOfficeRadioButton().isSelected();
	}

}
