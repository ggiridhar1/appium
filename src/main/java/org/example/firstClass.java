package org.example;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


public class firstClass {

	public static void main(String[] args)throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver;

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.VERSION, "14.0.0");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		capabilities.setCapability(MobileCapabilityType.APP, "C:/Users/girid/OneDrive/Documents/apks/9.3.0-qarelease-v9.2.3-D202311060923 (1).apk");

		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		Thread.sleep(10000);

		 //driver.findElementByXPath("//android.widget.TextView[@content-desc='App']");
		WebElement elements = driver.findElementByXPath("//android.widget.EditText[@content-desc='login-phNumber-tb']");

		//touch
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(elements).perform();

		//send keys
		elements.sendKeys("9972311465");

		//tap on sign in with otp
		WebElement otp=driver.findElementByXPath("//android.widget.TextView[@text='Sign in with OTP']");
		touchAction.tap(otp).perform();

		Thread.sleep(1000);

		//enter otp & verify Otp
		WebElement enterOtp=driver.findElementByAccessibilityId("login-otp-tb");
		enterOtp.sendKeys("123456");
		WebElement verfyOtp=driver.findElementByAccessibilityId("login-verify-btn");
		touchAction.tap(verfyOtp).perform();

		Thread.sleep(1000);

		//Relational type
		WebElement type = driver.findElementByXPath("//android.view.ViewGroup[@content-desc='ws-enterprise-tile']");
		touchAction.tap(type).perform();

		Thread.sleep(1000);

		//work space
		WebElement workspace = driver.findElementByXPath("//android.view.ViewGroup[@content-desc='ws-customer-tile']");
		touchAction.tap(workspace).perform();

		Thread.sleep(1000);

		//Customer select
		WebElement customerSelect =driver.findElementByAccessibilityId("Customer, tab, 2 of 4");
		touchAction.tap(customerSelect).perform();

		Thread.sleep(10000);
		driver.quit();





	}
}