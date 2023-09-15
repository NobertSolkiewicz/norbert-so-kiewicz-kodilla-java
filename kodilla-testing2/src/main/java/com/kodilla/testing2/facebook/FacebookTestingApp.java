package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_CREATE_ACCOUNT = "//a[@data-testid='open-registration-form-button']";
    public static final String XPATH_DAYAREA = "//select[@name='birthday_day']";
    public static final String XPATH_MONTHAREA = "//select[@name='birthday_month']";
    public static final String XPATH_YEARAREA = "//select[@name='birthday_year']";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement acceptCookiesButton = driver.findElement(By.xpath("//button[contains(text(), 'Akceptuj wszystkie pliki cookie')]"));
        acceptCookiesButton.click();

        WebElement clickCreateAccount = driver.findElement(By.name(XPATH_CREATE_ACCOUNT));
        clickCreateAccount.click();

        WebElement selectDay = driver.findElement(By.xpath(XPATH_DAYAREA));
        Select selectBoardDay = new Select(selectDay);
        selectBoardDay.selectByVisibleText("4");

        WebElement selectmonth = driver.findElement(By.xpath(XPATH_MONTHAREA));
        Select selectBoardMoth = new Select(selectmonth);
        selectBoardMoth.selectByVisibleText("października");

        WebElement selecyear = driver.findElement(By.xpath(XPATH_YEARAREA));
        Select selectBoardYear = new Select(selecyear);
        selectBoardYear.selectByVisibleText("2002");




    }
}
