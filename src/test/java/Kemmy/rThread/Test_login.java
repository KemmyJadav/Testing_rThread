package Kemmy.rThread;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.SupportsContextSwitching;

public class Test_login extends AppiumBase
{
	

	@Test
	public void login() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("Login")).click();
	
		
		Thread.sleep(10000);
		
		Set<String> contexts = ((SupportsContextSwitching) driver).getContextHandles();
		
		for(String contextName: contexts)
		{
//			System.out.println("******************");
			System.out.println(contextName);
//			System.out.println("******************");
		}
		Thread.sleep(5000);
		
		
//		((SupportsContextSwitching) driver).context("WEBVIEW_org.chromium.webview_shell");
		driver.findElement(By.id("username")).sendKeys("kemmy@yopmail.com");
		driver.findElement(By.id("username")).sendKeys(Keys.TAB);
		driver.findElement(By.id("password")).sendKeys("Kemmy@12345");
		driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElement(By.id("username")).sendKeys("kemmy@yopmail.com");
		
//		System.out.println(driver.findElement(By.name("action")).toString());
//		driver.findElement(By.name("action"));
//		driver.findElement(By.name("action")).sendKeys(Keys.ENTER);
//		driver.pressKey(new KeyEvent(AndroidKey.BACK));
//		driver.context("NATIVE_APP");
		
		
		
	}
	
/*@DataProvider
	public Object [][] getData()
	{
		return new Object [][] { {"Saurabh A", "female", "Argentina"} };
	}*/
}




