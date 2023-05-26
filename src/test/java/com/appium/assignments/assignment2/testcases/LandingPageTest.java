package com.appium.assignments.assignment2.testcases;

import com.appium.assignments.assignment2.BaseEMICalculatorTest;
import com.appium.assignments.assignment2.pages.LandingPage;
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
