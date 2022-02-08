package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        String firstTitleContains = "Gmail";
        String secondTitleContains = "Google";


        driver.get("https://google.com");

        WebElement gmailButton = driver.findElement(By.className("gb_d"));

        gmailButton.click();

        System.out.println(driver.getTitle().contains(firstTitleContains)?"Test Case Passed":"Test Case Failed");

        driver.navigate().back();

        System.out.println(driver.getTitle().contains(secondTitleContains)?"Test Case Passed":"Test Case Failed");


    }

}

/*
TC #3: Back and forth navigation
1- Open a chrome browser
2- Go to: https://google.com
3- Click to Gmail from top right.
4- Verify title contains:
  Expected: Gmail
5- Go back to Google by using the .back();
6- Verify title equals:
  Expected: Google
 */