package com.cydeo.tests.day3_cssSelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LocatorsGetText {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        //driver.findElement(By.className("login-inp")).sendKeys("incorrect");

        WebElement usernameInputBox = driver.findElement(By.className("login-inp"));
        usernameInputBox.sendKeys("incorrect");

        WebElement passwordInputBox = driver.findElement(By.name("USER_PASSWORD"));
        passwordInputBox.sendKeys("incorrect");

        WebElement logInButton = driver.findElement(By.className("login-btn"));
        logInButton.click();

        WebElement errorMessage = driver.findElement(By.className("errortext"));

        String expectedErrorMessage = "Incorrect login or password";

        String actualErrorMessage = errorMessage.getText();

        System.out.println( actualErrorMessage.equals(expectedErrorMessage)?"Test Case Passed":"Test Case Failed");

    }

}

/*
TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password
 */