package org.example;


import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class baseclass extends genric {


    @BeforeSuite
    public static void startSuite() throws IOException, InterruptedException {

        runAvd();
        Thread.sleep(20000);
        runAppiumServer();
        Thread.sleep(10000);

    }

    @AfterSuite
    public static void stopSuite() throws IOException {
        stopAppiumServer();
        killemu();
    }

}
