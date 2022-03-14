package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4LibraryVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://library2.cybertekschool.com/login.html");

        WebElement userName = driver.findElement(By.className("form-control"));
        userName.sendKeys("incorrect@email.com");

        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("incorrect password");

        WebElement singInButton = driver.findElement(By.tagName("button"));
        singInButton.click();



    }

}

/*
        //TC #4: Library verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to http://library2.cybertekschool.com/login.html
        driver.get("http://library2.cybertekschool.com/login.html");
        //3. Enter username: “incorrect@email.com”
        //4. Enter password: “incorrect password”
        //5. Click to Sign in button
        //6. Verify: visually “Sorry, Wrong Email or Password”
        //displayed
 */