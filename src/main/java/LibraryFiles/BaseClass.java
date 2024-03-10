package LibraryFiles;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	public UiAutomator2Options options;
	public AndroidDriver driver;
public void StartServerAndLaunchApp() throws MalformedURLException {
	
////Optional code for Automaticaly run the Appium server
//	Map <String, String> env=new HashMap<String, String>(System.getenv());
//	env.put("ANDROID_HOME", "C:\\Users\\Shubham Thakare\\AppData\\Local\\Android\\Sdk");
//	env.put("JAVA_HOME", "C:\\Program Files\\Java\\jdk-11.0.15.1");
	////Code for Automatomatically run the Appium server
//	AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Shubham Thakare\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
//			.withIPAddress("127.0.0.1").usingPort(4723).build();
//	service.start();
//	

	 options=new UiAutomator2Options();  ////the class which is used to set emulator device and then install the app in emulator 
	options.setDeviceName("Pixel XL API 30");//Pixel XL API 30 //samsung SM G973F
	options.setApp("C:\\Users\\Shubham Thakare\\OneDrive\\Desktop\\Automation\\Appium\\src\\test\\java\\resource\\resources\\ApiDemos-debug.apk");
	 driver=new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
}
}
