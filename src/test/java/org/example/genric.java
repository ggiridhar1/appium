package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class genric {
    static String path="cmd /c start appium --address 127.0.0.1 --port 4723 --base-path /wd/hub --allow-cors --allow-insecure ALLOW_INSECURE";
    static String emulatorcommand = "cmd /c start emulator  @Pixel_3a_1_1";
    //static AndroidDriver<AndroidElement> driver;


    public static void runAppiumServer() throws IOException, InterruptedException {
        Runtime.getRuntime().exec(path);
    }

    public static void runAvd() throws IOException{
        Runtime.getRuntime().exec(emulatorcommand);

    }

    public static void killemu() throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder("adb", "emu", "kill");
        Process process = processBuilder.start();
    }

    public static void stopAppiumServer() {
        try {
            URL url = new URL("http://127.0.0.1:4723/wd/hub/shutdown");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.getResponseCode(); // Send the request to shutdown the Appium server
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static AndroidDriver<AndroidElement> driverIntalization() throws MalformedURLException {
//         AndroidDriver<AndroidElement> driver;
//         DesiredCapabilities capabilities = new DesiredCapabilities();
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

    public static void closeDriver(AndroidDriver<AndroidElement>driver){
        driver.close();
    }
}
