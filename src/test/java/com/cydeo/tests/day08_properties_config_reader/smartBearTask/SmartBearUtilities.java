package com.cydeo.tests.day08_properties_config_reader.smartBearTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SmartBearUtilities {

    public static void login(WebDriver driver, String username, String password){

        WebElement usernameInputBox = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));

        usernameInputBox.sendKeys(username);

        WebElement passwordInputBox = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));

        passwordInputBox.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$login_button']"));

        loginButton.click();

    }


    public static void enterProductInformation(WebDriver driver, String productType, String quantity){

        Select dropdownProductType = new Select(driver.findElement(By.xpath("//select[@onchange='productsChanged()']")));

        dropdownProductType.selectByVisibleText(productType);

        WebElement quantityInputBox = driver.findElement(By.xpath("//input[@onchange='productsChanged()']"));

        quantityInputBox.sendKeys(quantity);

        WebElement calculateButton = driver.findElement(By.xpath("//input[@value='Calculate']"));

        calculateButton.click();

    }


    public static void enterAddressInformation(WebDriver driver, String name, String street, String city, String state, String zip){

        WebElement nameInputBox = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtName']"));

        nameInputBox.sendKeys(name);

        WebElement streetInputBox = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox2']"));

        streetInputBox.sendKeys(street);

        WebElement cityInputBox = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox3']"));

        cityInputBox.sendKeys(city);

        WebElement stateInputBox = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox4']"));

        stateInputBox.sendKeys(state);

        WebElement zipInputBox = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox5']"));

        zipInputBox.sendKeys(zip);

    }

}
