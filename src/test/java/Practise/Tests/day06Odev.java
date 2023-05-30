package Practise.Tests;

import Practise.Pages.SauceDemoPage;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class day06Odev {

     /*
//     * Navigate to  https://www.saucedemo.com/
//     * Enter the username  as standard_user
//     * Enter the password as   secret_sauce
//     * Click on login button
//     * Choose price low to high
//       and verify that PRICE (LOW TO HIGH) is visible
     */

    @Test
    public void testSauseDemo() throws InterruptedException {
        //     * Navigate to  https://www.saucedemo.com/
        Driver.getDriver().get("https://www.saucedemo.com/");

        //     * Enter the username  as standard_user

        SauceDemoPage sauceDemoPage=new SauceDemoPage();

        Thread.sleep(3000);
        //sauceDemoPage.userName.sendKeys("performance_glitch_user");




                //sendKeys("standard_user", Keys.ENTER);

        //     * Enter the password as   secret_sauce
        //sauceDemoPage.passWord.sendKeys("secret_sauce",Keys.ENTER);

        //     * Click on login button






    }
}
