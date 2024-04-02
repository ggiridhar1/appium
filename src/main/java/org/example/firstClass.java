package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class firstClass {

	public static void main(String[] args)throws MalformedURLException, InterruptedException {

		AndroidDriver<AndroidElement> driver;

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "Android");
		capabilities.setCapability("appium:platformVersion", "14.0.0");
		capabilities.setCapability("appium:deviceName", "Pixel_3a");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appium:automationName", "UiAutomator2");
		capabilities.setCapability("appium:app", "//src/main/resources/9.3.0-qarelease-v9.2.3-D202311060923 (1).apk");

		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		Thread.sleep(10000);

		 //driver.findElementByXPath("//android.widget.TextView[@content-desc='App']");
		 WebElement phoneNoField =driver.findElementByXPath("//android.widget.EditText[@content-desc='login-phNumber-tb']");

		 //Click on field
		phoneNoField.click();

//
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
		driver.quit();





	}
}