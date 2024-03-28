package BasePackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	
	protected static  WebDriver webDriver;
	

	
	@BeforeClass
	public void launchApplication() {
		webDriver=new ChromeDriver();
		webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		webDriver.manage().window().maximize();
		webDriver.get("https://www.shoppersstack.com");
	}
	
	
	@AfterClass
	public void closeApplication() {
		webDriver.close();
	}
}
