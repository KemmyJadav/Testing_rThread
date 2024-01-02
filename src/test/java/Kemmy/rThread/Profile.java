package Kemmy.rThread;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Profile extends AppiumBase
{
	@Test
	public void profilePage() throws InterruptedException
	{
		
		driver.findElement(AppiumBy.accessibilityId("Login")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.accessibilityId("Hello,, Kemmy QA!")).click();
//		driver.findElement(AppiumBy.accessibilityId("Profile")).click();
		Thread.sleep(10000);
	}
}  
	




