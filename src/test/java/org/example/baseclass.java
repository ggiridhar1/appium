package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class baseclass extends genric {


    @BeforeSuite
    public static void startSuite() throws IOException, InterruptedException {

        runAvd();
        Thread.sleep(20000);
        runAppiumServer();
        Thread.sleep(5000);

    }

    @AfterSuite
    public static void stopSuite() throws IOException {
        stopAppiumServer();
        killemu();
    }

//    @BeforeClass
//    public static AndroidDriver<AndroidElement> handshake() throws MalformedURLException {
//        return driverIntalization();
//    }

//    @AfterClass
//    public static void endHandShake(){
//        closeDriver();
//    }

//    public static AndroidDriver<AndroidElement> driverInitialization() throws MalformedURLException {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("browserName", "Android");
//        capabilities.setCapability("appium:platformVersion", "14.0.0");
//        capabilities.setCapability("appium:deviceName", "Pixel_3a_1_1");
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("appium:automationName", "UiAutomator2");
//        capabilities.setCapability("appium:app", "C:/Users/girid/OneDrive/Documents/apks/9.3.0-qarelease-v9.2.3-D202311060923 (1).apk");
//
//        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//        return driver;
//    }

}
