package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();


        //This line will maximize the browser size
        driver.manage().window().maximize();


        driver.manage().window().fullscreen();

        driver.get("https://www.tesla.com");

        String currentTitle = driver.getTitle();

        System.out.println("currentTitle = " + currentTitle);

        Thread.sleep(3000);

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        Thread.sleep(3000);

        driver.navigate().to("https://www.google.com");

        currentTitle = driver.getTitle();

        System.out.println("currentTitle = " + currentTitle);

        String currentURL = driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);


        driver.close();   //close only current window

        driver.quit();    //all the opened windows closing

    }

}
