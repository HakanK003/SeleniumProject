package com.cydeo.tests.day3_cssSelector_xPath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC4_cssSelector_getText {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));
        //WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[onclick=\"BX.addClass(this, 'wait');\"]"));
        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button.login-btn"));

        String expectedResetButton = "Reset password";
        String actualResetButton = resetPasswordButton.getText();

        System.out.println(actualResetButton.equals(expectedResetButton)?"Test Case Passed":"Test Case Failed");

    }

}

/*
TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Verify “Reset password” button text is as expected:
Expected: Reset password

PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
 */