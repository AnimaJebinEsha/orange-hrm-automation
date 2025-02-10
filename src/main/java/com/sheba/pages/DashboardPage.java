package com.sheba.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By leaveMenu = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/span[1]");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickLeaveMenu() {
        WebElement leaveBtn = wait.until(ExpectedConditions.elementToBeClickable(leaveMenu));
        leaveBtn.click();
    }
}
