package Util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import ShopperStackPom.AddAddress_Pom;
import ShopperStackPom.DeliveryAddress_Pom;

public class SS_Electronics_56_Test extends SS_Electronics_Test{

	
	@Test(dependsOnMethods = "TestCase")
	public void TestCase_56() throws InterruptedException{
		DeliveryAddress_Pom address=new DeliveryAddress_Pom(webDriver);
		address.getAddNewAddressButton().click();
		
		
		AddAddress_Pom addAddress=new AddAddress_Pom(webDriver);
		addAddress.getHomeRadioButton().click();
		Thread.sleep(4000);
		
		addAddress.getNameTextField().sendKeys("Saloni");
		addAddress.getHouseOfficeInfoTextField().sendKeys("Pune");
		addAddress.getStreetInfoTextField().sendKeys("Hadapsar");
		addAddress.getLandmarkTextField().sendKeys("Ram Tekdi");
		
		WebElement dd=addAddress.getCityDropDown();
		Select select=new Select(dd);
		select.selectByValue("India");
		
		dd=addAddress.getStateDropDown();
		select=new Select(dd);
		select.selectByValue("Maharashtra");
		
		dd=addAddress.getCityDropDown();
		select=new Select(dd);
		select.selectByValue("Pune");
		
		addAddress.getPhoneNumberTextField().sendKeys("411013");
		addAddress.getPhoneNumberTextField().sendKeys("7875686835");
		Thread.sleep(3000);
		if(addAddress.getAddAddressButton().isEnabled()) {
			addAddress.getAddAddressButton().click();
			Thread.sleep(4000);
			addAddress.getAddAddressAddedToasterMessage().isDisplayed();
		}
		
	}

}
