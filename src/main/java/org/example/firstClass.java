package org.example;

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
		capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\girid\\Downloads\\ApiDemos.apk");

		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		Thread.sleep(10000);

		WebElement asseibilityButton = driver.findElementByXPath("//android.widget.TextView[@content-desc='App']");

	}
}