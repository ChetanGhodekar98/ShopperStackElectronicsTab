package Util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import ShopperStackPom.AddAddress_Pom;
import ShopperStackPom.DeliveryAddress_Pom;

public class SS_Electronics_38_Test extends SS_Electronics_Test{
	@Test(dependsOnMethods = "TestCase")
	public void TestCase_13() throws InterruptedException {
		DeliveryAddress_Pom address=new DeliveryAddress_Pom(webDriver);
		address.getAddNewAddressButton().click();
		Thread.sleep(2000);
		
		AddAddress_Pom addAddress=new AddAddress_Pom(webDriver);
		addAddress.getHomeRadioButton().click();
		Thread.sleep(4000);
		
		WebElement dropDown=addAddress.getCountryDropDown();
		Select dd=new Select(dropDown);
		
		dropDown.isSelected();
		}
}
