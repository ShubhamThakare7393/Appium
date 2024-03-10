package MobMeven;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage {
@AndroidFindBy(id="com.telldus.flow:id/btn_ok") private WebElement LoginPopUpBtn;
@AndroidFindBy(id="com.telldus.flow:id/et_mobile_or_email") private WebElement LoginTextField;
@AndroidFindBy(id="com.telldus.flow:id/btn_verification_code") private WebElement VerifivationBtn;

public LoginPage(AndroidDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void Btn() {
	LoginPopUpBtn.click();
}
public void EnterMail() {
	LoginTextField.sendKeys("shubham.thakare@orahi.com");
}
public void VerificationBtn() {
	VerifivationBtn.click();
}
}
