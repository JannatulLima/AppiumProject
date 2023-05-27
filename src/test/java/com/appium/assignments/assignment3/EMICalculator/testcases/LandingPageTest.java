package com.appium.assignments.assignment3.EMICalculator.testcases;

import com.appium.assignments.assignment3.BaseTest;
import com.appium.assignments.assignment3.EMICalculator.BaseEMICalculatorTest;
import com.appium.assignments.assignment3.EMICalculator.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LandingPageTest extends BaseEMICalculatorTest {
    LandingPage landingPage;

    @Test
    public void EMICalculatorBtnShouldBeShown(){
        landingPage = new LandingPage();
        Assert.assertTrue(landingPage.isEMICalculatorBtnShown());
    }

    @Test
    public void CompareLoansButtonShouldBeShown(){
        landingPage = new LandingPage();
        Assert.assertTrue(landingPage.isCompareLoansBtnShown());
    }

}
