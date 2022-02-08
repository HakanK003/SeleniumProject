package com.cydeo.tests.day3_cssSelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();

        System.out.println(actualRememberMeLabel.equals(expectedRememberMeLabel)?"Test Case Passed":"Test Case Failed");


        WebElement forgotYourPasswordButton = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgetYourPassword = "Forgot your password?";
        String actualForgetYourPassword = forgotYourPasswordButton.getText();

        System.out.println(actualForgetYourPassword.equals(expectedForgetYourPassword)?"Test Case Passed":"Test Case Failed");

    }

}

/*
TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Verify “remember me” label text is as expected:
Expected: Remember me on this computer
4- Verify “forgot password” link text is as expected:
Expected: Forgot your password?
5- Verify “forgot password” href attribute’s value contains expected:
Expected: forgot_password=yes

PS: Inspect and decide which locator you should be using to locate web
elements.
 */