package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_FIRSTNAME = "//*[@id=\"u_0_l\"]";
    public static final String XPATH_LASTNAME = "//div[@class=\"large_form\"]/div/div/div[2]/div/div/input";
    public static final String XPATH_PHONEMAIL = "//div[@class=\"large_form\"]/div[2]/div/div/input";

    public static final String XPATH_DAY = "//*[@id=\"day\"]";
    public static final String XPATH_MONTH = "//*[@id=\"month\"]";
    public static final String XPATH_YEAR = "//*[@id=\"year\"]";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement firstNameField = driver.findElement(By.xpath(XPATH_FIRSTNAME));
        firstNameField.sendKeys("John");

        WebElement lastNameField = driver.findElement(By.xpath(XPATH_LASTNAME));
        lastNameField.sendKeys("Smith");

        WebElement phoneMailField = driver.findElement(By.xpath(XPATH_PHONEMAIL));
        phoneMailField.sendKeys("johnsmith@mail.com");

        WebElement selectDay =  driver.findElement(By.xpath(XPATH_DAY));
        Select day = new Select(selectDay);
        day.selectByIndex(20);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select month = new Select(selectMonth);
        month.selectByIndex(8);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select year = new Select(selectYear);
        year.selectByValue("2000");
    }
}
