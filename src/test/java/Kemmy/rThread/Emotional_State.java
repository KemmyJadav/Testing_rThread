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
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Emotional_State extends AppiumBase
{
	

	@Test
	public void DailyActivity1() throws InterruptedException
	{
		
		driver.findElement(AppiumBy.accessibilityId("Login")).click();
		Thread.sleep(20000);
		
		driver.findElement(AppiumBy.accessibilityId("Emotional State, Last submitted : 20 hours ago")).click();

		driver.findElement(AppiumBy.accessibilityId("Sad")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Yelling")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Yes")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		
		driver.findElement(AppiumBy.accessibilityId("No")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Yes")).click();
		driver.findElement(AppiumBy.accessibilityId("Next")).click();
		
//		driver.findElement(AppiumBy.accessibilityId("Submit")).click();
		
		
		Thread.sleep(5000);
		
		
	}
}



