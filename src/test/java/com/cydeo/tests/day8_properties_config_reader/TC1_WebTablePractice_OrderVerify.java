package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC1_WebTablePractice_OrderVerify {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables");

    }

    @Test
    public void order_name_verify_test() {

        //2. Verify Bob’s name is listed as expected. //Expected: “Bob Martin”

        WebElement bobMartinCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

        System.out.println("bobMartinCell.getText() = " + bobMartinCell.getText());

        String expectedName = "Bob Martin";
        String actualName = bobMartinCell.getText();

        Assert.assertEquals(actualName, expectedName);

        //3. Verify Bob Martin’s order date is as expected: 12/31/2021

        WebElement bobMartinDateCell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']/following-sibling::td[3]"));

        String expectedDate = "12/31/2021";
        String actualDate = bobMartinDateCell.getText();

        Assert.assertEquals(actualDate, expectedDate);

    }

    @Test
    public void test2() {

        String customerOrderDate1 = WebUtilities.returnOrderDate(driver, "Alexandra Gray");

        System.out.println(customerOrderDate1);

        String customerOrderDate2 = WebUtilities.returnOrderDate(driver, "John Doe");

        System.out.println(customerOrderDate2);

        String customerOrderDate3 = WebUtilities.returnOrderDate(driver, "Stewart Dawidson");

        System.out.println(customerOrderDate3);


        String customerOrderDate4 = WebUtilities.returnOrderDate(driver, "Bart Fisher");

        System.out.println(customerOrderDate4);


        String customerOrderDate5 = WebUtilities.returnOrderDate(driver, "Ned Stark");

        System.out.println(customerOrderDate5);


        String customerOrderDate6 = WebUtilities.returnOrderDate(driver, "Bob Martin");

        System.out.println(customerOrderDate6);


        String customerOrderDate7 = WebUtilities.returnOrderDate(driver, "Samuel Jackson");

        System.out.println(customerOrderDate7);


        String customerOrderDate8 = WebUtilities.returnOrderDate(driver, "Robert Baratheon");

        System.out.println(customerOrderDate8);

    }

    @Test
    public void test3() {

        WebUtilities.orderVerify(driver, "Bart Fisher", "01/16/2021");

    }


}

/*
TC #1: Web table practice
1. Go to: https://practice.cydeo.com/web-tables
2. Verify Bob’s name is listed as expected.
Expected: “Bob Martin”
3. Verify Bob Martin’s order date is as expected: 12/31/2021
 */