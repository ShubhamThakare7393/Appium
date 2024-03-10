package MobMeven;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LibraryFiles.BaseClass;

public class TestClass extends BaseClass{
	LoginPage login;
@BeforeClass
public void mw() throws MalformedURLException {
	StartServerAndLaunchApp();
	login=new LoginPage(driver);
}
@Test
public void mt() {
	login.Btn();
	login.EnterMail();
	login.VerificationBtn();
	
}
}
