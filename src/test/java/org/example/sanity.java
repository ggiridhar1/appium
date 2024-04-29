package org.example;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import org.testng.annotations.Test;


public class sanity extends baseclass {

@Test
	public static void test1() throws MalformedURLException, InterruptedException {
	AndroidDriver<AndroidElement> driver;
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("appium:browserName", "Android");
	capabilities.setCapability("appium:platformVersion", "14.0.0");
	capabilities.setCapability("appium:deviceName", "Pixel_3a_1_1");
	capabilities.setCapability("appium:platformName", "Android");
	capabilities.setCapability("appium:automationName", "UiAutomator2");
	capabilities.setCapability("appium:app", "C:/Users/girid/OneDrive/Documents/apks/9.3.0-qarelease-v9.2.3-D202311060923 (1).apk");

	driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);



		Thread.sleep(10000);


		 WebElement phoneNoField =driver.findElementByXPath("//android.widget.EditText[@content-desc='login-phNumber-tb']");

		 //Click on field
		phoneNoField.click();


		//send keys
		phoneNoField.sendKeys("9972311465");

		//tap on sign in with otp
		WebElement otp=driver.findElementByXPath("//android.widget.TextView[@text='Sign in with OTP']");
		otp.click();

		Thread.sleep(1000);

		//enter otp & verify Otp
		WebElement enterOtp=driver.findElementByAccessibilityId("login-otp-tb");
		enterOtp.sendKeys("123456");
		WebElement verfyOtp=driver.findElementByAccessibilityId("login-verify-btn");
		verfyOtp.click();

		Thread.sleep(1000);

		//Select Relational type
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc='ws-enterprise-tile']").click();


		Thread.sleep(1000);

		//Select work space
		driver.findElementByXPath("//android.view.ViewGroup[@content-desc='ws-customer-tile']").click();


		Thread.sleep(1000);

		//Select Customer tab
		driver.findElementByAccessibilityId("Customer, tab, 2 of 4").click();


		Thread.sleep(10000);

		closeDriver(driver);

	}
}