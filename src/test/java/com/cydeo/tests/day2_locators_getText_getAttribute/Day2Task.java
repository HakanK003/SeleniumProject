package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com");

        System.out.println(driver.getCurrentUrl().contains("cydeo")?"Yes it contains":"No it isn't contain");

        System.out.println(driver.getTitle().equals("Practice")?"Yes, they are same":"No, they are different");

        driver.quit();

    }

}

/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com
3. Verify URL contains
Expected: cydeo
4. Verify title:
       Expected: Practice

 */