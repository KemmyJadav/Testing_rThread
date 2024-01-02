package Kemmy.rThread;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBase {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	

	@BeforeClass
	public void configureAppium() throws MalformedURLException
	
	{

		service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\KemmyJadav\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Kemmy_avd");
		options.setChromedriverExecutable("C:\\Users\\KemmyJadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
//		options.setApp("C:\\Users\\KemmyJadav\\eclipse-workspace\\rThread\\src\\test\\java\\Resources\\rThread 13.apk");
//		options.setApp("C:\\Users\\KemmyJadav\\eclipse-workspace\\rThread\\src\\test\\java\\Resources\\rThread 15.apk");
		options.setApp("C:\\Users\\KemmyJadav\\eclipse-workspace\\rThread\\src\\test\\java\\Resources\\rThread 18.apk");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void ClickOnNextButton()
	{
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		service.stop();
	}
}