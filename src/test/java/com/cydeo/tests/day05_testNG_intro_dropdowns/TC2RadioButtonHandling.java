package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC2RadioButtonHandling {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/radio_buttons");

        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));

        hockeyButton.click();

        System.out.println("hockey button is selected ? " +hockeyButton.isSelected());


    }

}
