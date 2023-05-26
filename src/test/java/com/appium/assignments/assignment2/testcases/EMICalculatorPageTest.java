package com.appium.assignments.assignment2.testcases;

import com.appium.assignments.assignment2.BaseEMICalculatorTest;
import com.appium.assignments.assignment2.pages.EMICalculatorPage;
import com.appium.assignments.assignment2.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EMICalculatorPageTest extends BaseEMICalculatorTest {
   LandingPage landingPage;
   EMICalculatorPage emiCalculatorPage;

   @Test(priority = 0)
    public void EMICalculateShouldSucceed(){
      landingPage = new LandingPage();
      emiCalculatorPage = landingPage.tapEMICalculatorBtn()
               .fillAmount(100)
               .fillInterest(7)
               .fillYear(2)
               .fillMonth(12)
               .fillFee(22)
               .tapCalculateBtn();
      Assert.assertTrue(emiCalculatorPage.hasDetailBtn());
   }

   @Test(priority = 1)
   public void calculationResetShouldSucceed(){
      emiCalculatorPage = emiCalculatorPage
              .fillAmount(300)
              .fillInterest(20)
              .fillYear(3)
              .fillMonth(10)
              .fillFee(10)
              .tapCalculateBtn()
              .tapResetBtn();
      Assert.assertFalse(emiCalculatorPage.hasDetailBtn());
   }

   @Test(priority = 2)
   public void detailPageViewShouldSucceed(){
      emiCalculatorPage = emiCalculatorPage
              .fillAmount(200)
              .fillInterest(8)
              .fillYear(2)
              .fillMonth(10)
              .fillFee(3)
              .tapCalculateBtn()
              .tapDetailsBtn();
      Assert.assertTrue(emiCalculatorPage.hasLayoutDetailContainer(), "true");
   }
}
