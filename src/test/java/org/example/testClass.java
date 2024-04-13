package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class testClass {
    public static void main(String[] args) throws IOException, InterruptedException {
    testrun();
    Thread.sleep(10000);
        stopAppiumServer();


    }
        public static void testrun() throws IOException, InterruptedException {

                 //Start Appium server
                String appiumPath = "appium --address 127.0.0.1 --port 4723 --base-path /wd/hub --allow-cors --allow-insecure ALLOW_INSECURE";
                ProcessBuilder appiumProcessBuilder = new ProcessBuilder("cmd.exe", "/c", appiumPath);
                Process appiumProcess = appiumProcessBuilder.start();

                // Read Appium server output
                BufferedReader appiumReader = new BufferedReader(new InputStreamReader(appiumProcess.getInputStream()));
                String appiumLine;
                while ((appiumLine = appiumReader.readLine()) != null) {
                    System.out.println("Appium: " + appiumLine);
                }
                int appiumExitCode = appiumProcess.waitFor();
                System.out.println("Appium Exited with error code: " + appiumExitCode);

                // Wait for Appium server to start (optional)
                Thread.sleep(5000); // Wait for 5 seconds


//                // Start Emulator
//                String emulatorPath = "emulator @Pixel_3a";
//                ProcessBuilder emulatorProcessBuilder = new ProcessBuilder("cmd.exe", "/c", emulatorPath);
//                Process emulatorProcess = emulatorProcessBuilder.start();
//
//                Thread.sleep(10000);
                


                // Read Emulator outpu


        }
    private static void stopAppiumServer() {
        try {
            URL url = new URL("http://127.0.0.1:4723/wd/hub/shutdown");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.getResponseCode(); // Send the request to shutdown the Appium server
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//    public static void killemu() throws IOException {
//        ProcessBuilder processBuilder = new ProcessBuilder("adb", "emu", "kill");
//        Process process = processBuilder.start();
//    }
}
