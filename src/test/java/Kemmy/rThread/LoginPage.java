package Kemmy.rThread;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class LoginPage extends AppiumBase{
	
	@Test
	public void LoginPage1() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("Login")).click();	
		//Native app name passed by for loop and get their name from above code
		Thread.sleep(7000);
		Set<String> contexts = driver.getContextHandles();
		for(String contextName :contexts)
		{
			System.out.println(contextName);
		}
//		driver.context("WEBVIEW_org.chromium.webview_shell");
		
		
		
		
//		WebElement user= driver.findElement(By.id("username"));
//		user.sendKeys("kemmy@yopmail.com");
		driver.findElement(By.id("username")).sendKeys("kemmy@yopmail.com");
		driver.findElement(By.id("username")).sendKeys(Keys.TAB);
		driver.findElement(By.id("password")).sendKeys("Kemmy@12345");
		driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("action")).click();
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.context("NATIVE_APP");
		Thread.sleep(3000);

	}
		
}
	


