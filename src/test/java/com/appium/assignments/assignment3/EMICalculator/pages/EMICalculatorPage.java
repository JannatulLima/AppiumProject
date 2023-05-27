package com.appium.assignments.assignment3.EMICalculator.pages;

import com.appium.assignments.assignment3.BaseTest;
import com.appium.assignments.assignment3.EMICalculator.BaseEMICalculatorTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EMICalculatorPage extends BaseEMICalculatorTest {
    @FindBy(id = "etLoanAmount")
    WebElement amountFieldEl;

    @FindBy(id = "etInterest")
    WebElement interestFieldEl;

    @FindBy(id = "etYears")
    WebElement yearFieldEl;

    @FindBy(id = "etMonths")
    WebElement monthFieldEl;

    @FindBy(id = "etFee")
    WebElement feeFieldEl;

    @FindBy(id = "btnCalculate")
    WebElement calculateBtnEl;

    @FindBy(id = "btnReset")
    WebElement resetBtnEl;

    @FindBy(id = "btnDetail")
    List<WebElement> detailBtnEl;

    @FindBy(id = "layoutDetailContainer")
    WebElement layoutDetailContainerEl;

    public EMICalculatorPage() {
        PageFactory.initElements(driver, this);
    }

    public EMICalculatorPage fillAmount(int amount) {
        amountFieldEl.isDisplayed();
        amountFieldEl.clear();
        amountFieldEl.sendKeys(String.valueOf(amount));
        return this;
    }

    public EMICalculatorPage fillInterest(int interest) {
        interestFieldEl.isDisplayed();
        interestFieldEl.clear();
        interestFieldEl.sendKeys(String.valueOf(interest));
        return this;
    }

    public EMICalculatorPage fillMonth(int month) {
        monthFieldEl.isDisplayed();
        monthFieldEl.clear();
        monthFieldEl.sendKeys(String.valueOf(month));
        return this;
    }

    public EMICalculatorPage fillYear(int year) {
        yearFieldEl.isDisplayed();
        yearFieldEl.clear();
        yearFieldEl.sendKeys(String.valueOf(year));
        return this;
    }

    public EMICalculatorPage fillFee(int fee) {
        feeFieldEl.isDisplayed();
        feeFieldEl.clear();
        feeFieldEl.sendKeys(String.valueOf(fee));
        return this;
    }

    public EMICalculatorPage tapCalculateBtn() {
        calculateBtnEl.isDisplayed();
        calculateBtnEl.click();
        return this;
    }

    public EMICalculatorPage tapResetBtn() {
        resetBtnEl.isDisplayed();
        resetBtnEl.click();
        return this;
    }

    public EMICalculatorPage tapDetailsBtn() {
        detailBtnEl.get(0).isDisplayed();
        detailBtnEl.get(0).click();
        return this;
    }

    public boolean isCalculateBtnShown() {
        return calculateBtnEl.isDisplayed();
    }

    public boolean isResetBtnShown() {
        return resetBtnEl.isDisplayed();
    }

    public boolean hasDetailBtn() {
        return detailBtnEl.size() > 0;
    }

    public boolean hasLayoutDetailContainer() {
        return layoutDetailContainerEl.isDisplayed();
    }
}
