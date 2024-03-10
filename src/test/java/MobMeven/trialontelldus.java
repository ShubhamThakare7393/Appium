package MobMeven;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;
import io.appium.java_client.AppiumBy;

public class trialontelldus extends BaseClass{
	@Test
public void tc1() throws MalformedURLException {
	StartServerAndLaunchApp();
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	String actualText = driver.findElement(By.id("com.telldus.flow:id/tv_title")).getText();
	Assert.assertEquals(actualText, "Information");
	driver.findElement(AppiumBy.className("android.widget.Button")).click();
	String loginTextActual = driver.findElement(By.id("com.telldus.flow:id/tv_login_text")).getText();
	Assert.assertEquals(loginTextActual, "Login");
	String AfterLoginText = driver.findElement(By.id("com.telldus.flow:id/welcome_back_expand_your_smart_home")).getText();
	Assert.assertEquals(AfterLoginText, "Welcome back, expand your smart home");
	String befor = driver.findElement(By.id("com.telldus.flow:id/enter_your_mobile_number_or_email_id")).getText();
	Assert.assertEquals(befor, "Enter your mobile number or email id");
//Social Login 
	driver.findElement(By.id("com.telldus.flow:id/btn_google")).click();
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout")).click();
	//Atached mobile number pop up
	
	//driver.findElement(By.id("com.telldus.flow:id/btn_yes")).click();
	driver.findElement(By.id("com.telldus.flow:id/btn_no")).click();
	driver.findElement(By.id("com.android.permissioncontroller:id/permission_deny_button")).click();
	
	
//	LogOut 
	driver.findElement(By.id("com.telldus.flow:id/iv_hamburger")).click();//
	driver.findElement(By.id("com.telldus.flow:id/cl_logout")).click();
//	driver.findElement(By.id("com.telldus.flow:id/btn_yes")).click();
//	driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("shubham.thakare@orahi.com");
//	driver.findElement(By.id("com.telldus.flow:id/tv_register")).click();
	
	
}
}
