package com.appium.assignments.assignment3.EMICalculator.testcases;

import com.appium.assignments.assignment3.BaseTest;
import com.appium.assignments.assignment3.EMICalculator.BaseEMICalculatorTest;
import com.appium.assignments.assignment3.EMICalculator.pages.CompareLoansPage;
import com.appium.assignments.assignment3.EMICalculator.pages.EMICalculatorPage;
import com.appium.assignments.assignment3.EMICalculator.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareLoansPageTest extends BaseEMICalculatorTest {
    LandingPage landingPage;
    CompareLoansPage compareLoansPage;

    @Test(priority = 0)
    public void compareLoansShouldSucceed(){
        landingPage = new LandingPage();
        Assert.assertTrue(landingPage.isEMICalculatorBtnShown(), "true");
        Assert.assertTrue(landingPage.isCompareLoansBtnShown(), "true");
        compareLoansPage = landingPage.tapCompareLoansBtn()
                .fillLoadAmount1(100)
                .fillInterest1(8)
                .fillPeriod1(6)
                .fillLoadAmount2(50)
                .fillInterest2(6)
                .fillPeriod2(4)
                .tapCalculateBtn();
        Assert.assertTrue(compareLoansPage.hasLayoutTable(), "true");
    }

    @Test(priority = 1)
    public void compareLoanCalculationResetShouldSucceed(){
        compareLoansPage = compareLoansPage.tapResetBtn();
        Assert.assertFalse(compareLoansPage.hasLayoutTable());
    }

}
