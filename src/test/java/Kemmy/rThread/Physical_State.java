package Kemmy.rThread;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
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

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Physical_State extends AppiumBase
{
	

	@Test
	public void Physical_1() throws InterruptedException
	{
		
		driver.findElement(AppiumBy.accessibilityId("Login")).click();
		Thread.sleep(20000);
		
		driver.findElement(AppiumBy.accessibilityId("Physical State, Last submitted : 13 days ago")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Energy level")).click();
		ClickOnNextButton();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Sleepy")).click();
		ClickOnNextButton();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Yes")).click();
		driver.findElement(AppiumBy.accessibilityId("Decreased")).click();
		ClickOnNextButton();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("No")).click();
		ClickOnNextButton();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Yes")).click();
		driver.findElement(AppiumBy.accessibilityId("Physicians plan")).click();
		ClickOnNextButton();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("No")).click();
		ClickOnNextButton();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("No")).click();
		ClickOnNextButton();
		Thread.sleep(2000);
		String result = driver.findElement(AppiumBy.accessibilityId("Better")).getText();
		Assert.assertEquals(result , "");
		
		Thread.sleep(5000);
	
		}
	}




