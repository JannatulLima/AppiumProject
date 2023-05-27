package com.appium.assignments.assignment3.calculator;

import com.appium.assignments.assignment3.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseCalculatorTest extends BaseTest {
    @Override
    protected String getAppPackage() {
        return "com.veronicaapps.veronica.simplecalculator";
    }

    @Override
    protected String getAppActivity() {
        return ".MainActivity";
    }
}
