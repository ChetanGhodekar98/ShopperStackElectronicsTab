package Util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataProvider.GetSheetData;
import ShopperStackPom.AddAddress_Pom;
import ShopperStackPom.DeliveryAddress_Pom;

public class SS_Electronics_45_Test extends SS_Electronics_Test{

	
	@Test(dependsOnMethods = "TestCase")
	public void TestCase_45() throws InterruptedException, AWTException {
		
		Thread.sleep(5000);
		DeliveryAddress_Pom address=new DeliveryAddress_Pom(webDriver);
		address.getAddNewAddressButton().click();
		Thread.sleep(2000);
		
		AddAddress_Pom addAddress=new AddAddress_Pom(webDriver);
		addAddress.getHomeRadioButton().click();
		Thread.sleep(10000);
		
		String[][] data=new String[6][2];
		data[0][0]="432101";
		data[0][1]="valid";
		data[1][0]="432103";
		data[1][1]="valid";
		data[2][0]="4";
		data[2][1]="invalid";
		data[3][0]=" ";
		data[3][1]="invalid";
		data[4][0]="4321";
		data[4][1]="invalid";
		
		for(int i=0;i<data.length;i++) {
			 {
				addAddress.getPincodeTextField().sendKeys(data[i][0]);
				Thread.sleep(2000);
					if(data[i][1].equals("valid")) {
						String color=addAddress.getPincodeTextField().getCssValue("color");
						Assert.assertEquals(color, "rgba(0, 0, 0, 0.87)","PASSED");
						System.out.println(color);
					}else {
						addAddress.getPincodeErrorMessage().isDisplayed();					
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
