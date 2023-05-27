package com.appium.assignments.assignment3;

import com.appium.assignments.assignment3.util.General;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public abstract class BaseTest {
    protected static AndroidDriver driver;
    protected static WebDriverWait wait;

    protected abstract String getAppPackage();
    protected abstract String getAppActivity();
    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:udid", "192.168.86.101:5555");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:platformVersion", "11");
        capabilities.setCapability("appium:appPackage", getAppPackage());
        capabilities.setCapability("appium:appActivity", getAppActivity());
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("fullReset", "false");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(General.WAIT_TIME));
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}

