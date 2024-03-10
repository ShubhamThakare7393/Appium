package MobMeven;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class trialTest1 extends BaseClass{
@Test
public void firsttest() throws MalformedURLException
{
	StartServerAndLaunchApp();
	////Type of Locator in Appium----> Xpath, id, accessibilityId, classname, androidUIAutomator
	driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
	driver.findElement(By.id("android:id/checkbox")).click();
	driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	driver.findElement(By.id("android:id/edit")).sendKeys("hgsdgsg");
	driver.findElement(By.id("android:id/button1")).click();
//	driver.quit();
	
}
}
