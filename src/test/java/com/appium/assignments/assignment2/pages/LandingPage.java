package com.appium.assignments.assignment2.pages;

import com.appium.assignments.assignment2.BaseEMICalculatorTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LandingPage extends BaseEMICalculatorTest {
    @FindBy(id = "btnStart")
    WebElement btnStartEl;

    @FindBy(id = "btnCompare")
    WebElement btnCompareEl;

    public LandingPage(){
        PageFactory.initElements(driver, this);
    }

    public EMICalculatorPage tapEMICalculatorBtn(){
        btnStartEl.isDisplayed();
        btnStartEl.click();
        return new EMICalculatorPage();
    }

    public CompareLoansPage tapCompareLoansBtn(){
        btnCompareEl.isDisplayed();
        btnCompareEl.click();
        return new CompareLoansPage();
    }

    public boolean isEMICalculatorBtnShown(){
        return btnStartEl.isDisplayed();
    }

    public boolean isCompareLoansBtnShown(){
        return btnCompareEl.isDisplayed();
    }

}
