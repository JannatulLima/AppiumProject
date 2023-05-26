package com.appium.assignments.assignment2.pages;

import com.appium.assignments.assignment2.BaseEMICalculatorTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CompareLoansPage extends BaseEMICalculatorTest {
    @FindBy(id = "etLoanAmount1")
    WebElement etLoanAmount1El;

    @FindBy(id = "etInterest1")
    WebElement etInterest1El;

    @FindBy(id = "etPeriod1")
    WebElement etPeriod1El;

    @FindBy(id = "etLoanAmount2")
    WebElement etLoanAmount2El;

    @FindBy(id = "etInterest2")
    WebElement etInterest2El;

    @FindBy(id = "etPeriod2")
    WebElement etPeriod2El;

    @FindBy(id = "btnCalculate")
    WebElement calculateBtnEl;

    @FindBy(id = "btnReset")
    WebElement resetBtnEl;

    @FindBy(id = "layoutTable")
    List<WebElement>  layoutTableEl;

    public CompareLoansPage(){
        PageFactory.initElements(driver, this);
    }

    public CompareLoansPage fillLoadAmount1(int amount1){
        etLoanAmount1El.isDisplayed();
        etLoanAmount1El.clear();
        etLoanAmount1El.sendKeys(String.valueOf(amount1));
        return this;
    }

    public CompareLoansPage fillInterest1(int interest1){
        etInterest1El.isDisplayed();
        etInterest1El.clear();
        etInterest1El.sendKeys(String.valueOf(interest1));
        return this;
    }

    public CompareLoansPage fillPeriod1(int period1){
        etPeriod1El.isDisplayed();
        etPeriod1El.clear();
        etPeriod1El.sendKeys(String.valueOf(period1));
        return this;
    }

    public CompareLoansPage fillLoadAmount2(int amount2){
        etLoanAmount2El.isDisplayed();
        etLoanAmount2El.clear();
        etLoanAmount2El.sendKeys(String.valueOf(amount2));
        return this;
    }

    public CompareLoansPage fillInterest2(int interest2){
        etInterest2El.isDisplayed();
        etInterest2El.clear();
        etInterest2El.sendKeys(String.valueOf(interest2));
        return this;
    }

    public CompareLoansPage fillPeriod2(int period2){
        etPeriod2El.isDisplayed();
        etPeriod2El.clear();
        etPeriod2El.sendKeys(String.valueOf(period2));
        return this;
    }

    public CompareLoansPage tapCalculateBtn(){
        calculateBtnEl.isDisplayed();
        calculateBtnEl.click();
        return this;
    }

    public CompareLoansPage tapResetBtn(){
        resetBtnEl.isDisplayed();
        resetBtnEl.click();
        return this;
    }

    public boolean isCalculateBtnShown(){
        return calculateBtnEl.isDisplayed();
    }

    public boolean isResetBtnShown(){
        return resetBtnEl.isDisplayed();
    }

    public boolean hasLayoutTable(){
        return layoutTableEl.size() > 0;
    }

}
