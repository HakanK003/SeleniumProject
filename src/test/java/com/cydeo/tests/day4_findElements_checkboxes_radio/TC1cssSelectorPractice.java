package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1cssSelectorPractice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        //2 "a[href='/']" //3 a.nav-link  //4 //a[@href='/']  //5 //a[@class='nav-link']

        WebElement forgotPassword = driver.findElement(By.cssSelector("h2"));
        //2 //h2   //3  div.example>h2  //4 //h2  //5 //h2[text()='Forgot Password']

        WebElement eMailText = driver.findElement(By.cssSelector("label[for='email']"));
        //2 //label[@for='email']

        WebElement eMailInputBox = driver.findElement(By.cssSelector("input[type='text']"));
        //2 //input[@type='text']  //3 //input[@name='email']  //4  input[name='email']
        //5 //input[@pattern='[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$']
        //6 input[pattern='[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$']  //7 //input[@required]  //8 input[required]
        // driver.findElement(By.xpath("//input[contains(@pattern,'a-z')]"));
        //   //tagName[contains(@attribute,'value')]
        //e. “Retrieve password” button
        //button[@type='submit']
        //button[@class='radius']
        WebElement retrievePasswordBtn = driver.findElement(By.xpath("//button[@id='form_submit']"));

        //f. “Powered by Cydeo text
        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //4. Verify all web elements are displayed.
        System.out.println("homeLink_ex1.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + forgotPassword.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + eMailText.isDisplayed());
        System.out.println("inputBox_ex1.isDisplayed() = " + eMailInputBox.isDisplayed());
        System.out.println("retrievePasswordBtn.isDisplayed() = " + retrievePasswordBtn.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());

        //WebElement poweredByCydeoLink = driver.findElement(By.cssSelector());


    }

}

/*
XPATH and CSS Selector PRACTICES
DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS
locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible

Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible
 */