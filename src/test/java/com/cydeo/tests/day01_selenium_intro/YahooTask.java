package com.cydeo.tests.day01_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooTask {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com");

        System.out.println(driver.getTitle().equals("Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos")?"They are same":"They aren't same");

        driver.quit();

    }

}
