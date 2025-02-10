package com.sheba;

import com.sheba.pages.DashboardPage;
import com.sheba.pages.LeaveListPage;
import com.sheba.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = new DashboardPage(driver);
        LeaveListPage leaveListPage = new LeaveListPage(driver);

        driver.get("https://opensource-demo.orangehrmlive.com");

        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();

        dashboardPage.clickLeaveMenu();

        leaveListPage.clickApply();
    }
}