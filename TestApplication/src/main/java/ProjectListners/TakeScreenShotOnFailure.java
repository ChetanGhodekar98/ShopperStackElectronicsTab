package ProjectListners;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import BasePackage.BaseClass;

public class TakeScreenShotOnFailure extends BaseClass{
	
	

	public void takeScreenShotOnFailure() {
				try {
					TakesScreenshot takeScreenShot=(TakesScreenshot)webDriver;
					File source=takeScreenShot.getScreenshotAs(OutputType.FILE);
					String name="SS_"+((LocalDateTime.now().toString()).replace("-", "/"));
					File target=new File("./src/test/resources/ScreenShots"+name+".png");
					FileHandler.copy(source,target);
		} catch (IOException e) {
					e.printStackTrace();
		}
	}
	
}
