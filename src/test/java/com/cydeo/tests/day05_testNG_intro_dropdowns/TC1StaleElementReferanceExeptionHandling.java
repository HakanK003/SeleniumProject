package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class TC1StaleElementReferanceExeptionHandling {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/add_remove_elements/");

        WebElement addElementButton = driver.findElement(By.xpath("//button[@onclick='addElement()']"));

        addElementButton.click();

        WebElement deleteButton = driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));

        System.out.println("before click "+deleteButton.isDisplayed());

        deleteButton.click();

        try {
            System.out.println("after click "+deleteButton.isDisplayed());
        }catch (StaleElementReferenceException e){
            System.out.println("delete button is not displayed");
        }





    }

}
