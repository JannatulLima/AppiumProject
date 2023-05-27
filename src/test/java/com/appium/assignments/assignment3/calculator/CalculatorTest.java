package com.appium.assignments.assignment3.calculator;

import com.appium.assignments.assignment3.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseCalculatorTest {
    @Test
    public void additionShouldSucceed(){
        driver.findElement(By.id("button_eight")).click();
        driver.findElement(By.id("button_plus")).click();
        driver.findElement(By.id("button_two")).click();
        driver.findElement(By.id("button_equals")).click();
        Assert.assertEquals(driver.findElement(By.id("editText_result")).getText(), "=10");
    }

    @Test
    public void subtractionShouldSucceed(){
        driver.findElement(By.id("button_nine")).click();
        driver.findElement(By.id("button_minus")).click();
        driver.findElement(By.id("button_three")).click();
        driver.findElement(By.id("button_equals")).click();
        Assert.assertEquals(driver.findElement(By.id("editText_result")).getText(), "=6");
    }

    @Test
    public void multiplicationShouldSucceed(){
        driver.findElement(By.id("button_five")).click();
        driver.findElement(By.id("button_multiply")).click();
        driver.findElement(By.id("button_two")).click();
        driver.findElement(By.id("button_equals")).click();
        Assert.assertEquals(driver.findElement(By.id("editText_result")).getText(), "=10");
    }

    @Test
    public void divisionShouldSucceed(){
        driver.findElement(By.id("button_eight")).click();
        driver.findElement(By.id("button_divide")).click();
        driver.findElement(By.id("button_two")).click();
        driver.findElement(By.id("button_equals")).click();
        Assert.assertEquals(driver.findElement(By.id("editText_result")).getText(), "=4");
    }

    @Test
    public void percentageShouldSucceed(){
        driver.findElement(By.id("button_two")).click();
        driver.findElement(By.id("button_percent")).click();
        driver.findElement(By.id("button_equals")).click();
        Assert.assertEquals(driver.findElement(By.id("editText_result")).getText(), "=0.02");
    }
}
