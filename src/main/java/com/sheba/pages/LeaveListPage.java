package com.sheba.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LeaveListPage {

    private final WebDriver driver;
    private WebDriverWait wait;

    // Locator for Apply Button
    private final By applyButton = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header[1]/div[2]/nav[1]/ul[1]/li[1]/a[1]");

    public LeaveListPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickApply() {
        WebElement applyBtn = wait.until(ExpectedConditions.elementToBeClickable(applyButton));
        applyBtn.click();
    }
}
