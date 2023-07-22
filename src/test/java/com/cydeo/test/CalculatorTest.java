package com.cydeo.test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {
@Test
    public void initialTest() throws MalformedURLException, InterruptedException {
    DesiredCapabilities caps = new DesiredCapabilities();
    URL url;
    /*
    we need to create an appium driver. Driver requires some compatibility settings and also provide URL and capabilities to your appium driver
     */
    caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 3");
    caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
    caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"10.0");
    caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
    //this is where we tell appium what we are testing
    caps.setCapability(MobileCapabilityType.APP,"https://cybertek-appium.s3.amazonaws.com/calculator.apk");

    url = new URL("http://localhost:4723/wd/hub");
    AppiumDriver<MobileElement> driver = new AppiumDriver<MobileElement>(url,caps);
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    driver.closeApp();
}
}
