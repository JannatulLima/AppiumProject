package com.appium.assignments.assignment3.EMICalculator;

import com.appium.assignments.assignment3.BaseTest;

public class BaseEMICalculatorTest extends BaseTest {
    @Override
    protected String getAppPackage() {
        return "com.continuum.emi.calculator";
    }

    @Override
    protected String getAppActivity() {
        return "com.finance.emicalci.activity.Splash_screnn";
    }
}
