package com.cydeo.tests.day08_properties_config_reader.smartBearTask;

import com.cydeo.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPlacing {

    public static void main(String[] args) {

        Faker faker = new Faker();

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        SmartBearUtilities.login(driver, "Tester", "test");

        WebElement orderButton = driver.findElement(By.xpath("//a[@href='Process.aspx']"));

        orderButton.click();

        SmartBearUtilities.enterProductInformation(driver, "FamilyAlbum", "3");

        //SmartBearUtilities.enterAddressInformation();




    }

}
