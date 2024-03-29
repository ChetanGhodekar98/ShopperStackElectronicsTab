package Util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.Assert;
import org.testng.annotations.Test;

import ShopperStackPom.AddAddress_Pom;
import ShopperStackPom.DeliveryAddress_Pom;

public class SS_Electronics_46_Test extends SS_Electronics_Test{

	
	@Test(dependsOnMethods = "TestCase",dataProvider = "data")
	public void TestCase_46() throws InterruptedException, AWTException {
		DeliveryAddress_Pom address=new DeliveryAddress_Pom(webDriver);
		address.getAddNewAddressButton().click();
		Thread.sleep(2000);
		
		AddAddress_Pom addAddress=new AddAddress_Pom(webDriver);
		addAddress.getHomeRadioButton().click();
		Thread.sleep(10000);
		
		String[][] data=new String[5][2];
		data[0][0]="7083382992";
		data[0][1]="valid";
		data[1][0]="708@sall";
		data[1][1]="invalid";
		data[2][0]=" ";
		data[2][1]="invalid";
		data[3][0]="saloni 123";
		data[3][1]="invalid";
		data[4][0]="1234567891";
		data[4][1]="invalid";
		
		for(int i=0;i<data.length;i++) {
			 {
				addAddress.getPhoneNumberTextField().sendKeys(data[i][0]);
				Thread.sleep(2000);
					if(data[i][1].equals("valid")) {
						String color=addAddress.getPhoneNumberTextField().getCssValue("color");
						System.out.println(color);
						Assert.assertEquals(color, "rgba(0, 0, 0, 0.87)","PASSED");
					}else {
						String color=addAddress.getPhoneNumberTextField().getCssValue("color");
						Assert.assertNotEquals(color, "rgba(0, 0, 0, 0.87)","PASSED");
					}
					Thread.sleep(3000);
					Robot robot=new Robot();
					robot.keyPress(KeyEvent.VK_CONTROL);
					Thread.sleep(2000);
					robot.keyPress(KeyEvent.VK_A);
					Thread.sleep(2000);
					robot.keyPress(KeyEvent.VK_BACK_SPACE);
					Thread.sleep(2000);
					robot.keyRelease(KeyEvent.VK_BACK_SPACE);
					robot.keyRelease(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_CONTROL);
				}	
		}
		}
		
}
