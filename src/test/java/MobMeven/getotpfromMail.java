package MobMeven;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;

public class getotpfromMail extends BaseClass{
	@Test
public void tcm() throws MalformedURLException {
		StartServerAndLaunchApp();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		String actualText = driver.findElement(By.id("com.telldus.flow:id/tv_title")).getText();
		Assert.assertEquals(actualText, "Information");
		driver.findElement(AppiumBy.className("android.widget.Button")).click();
		driver.findElement(By.id("com.telldus.flow:id/et_mobile_or_email")).sendKeys("qaorahi@gmail.com");//Mail text field 
        driver.findElement(By.id("com.telldus.flow:id/btn_verification_code")).click();//verification btn
     // Locate and click on the email containing the OTP
//        Set<String> conte = driver.getContextHandles();
//        ArrayList<String> al=new ArrayList<String>(conte);
//        for(int i=0;i<=al.size()-1;i++)
//        {
//        	System.out.println(al.get(i));
//        }
//        driver.context(al.get(1));
//        By elementLocator = AppiumBy.clazz("android.view.ViewGroup");
//        WebElement element = driver.findElement(elementLocator);
//      By emailSubject = MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"OTP for Telldus Login/Register\")");
//      driver.findElement(AppiumBy.className("android.view.ViewGroup")).click();
//
//      // Extract OTP text
//      By otpElement = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.google.android.gm:id/email_snippet\")");
//      String otp = driver.findElement(By.id("com.google.android.gm:id/email_snippet")).getText();
//      System.out.println(otp);
}
}
