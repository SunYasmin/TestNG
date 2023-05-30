package Test.day20;

import Pages.HmcPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;

public class C03_E2ETest {

    @Test
    public void E2ETest() throws InterruptedException {

        //Tests packagenin altına class olusturun: CreateHotel
        //Bir metod olusturun: createHotel
        //https://www.hotelmycamp.com adresine git.
        Driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));
        HmcPage hmcPage = new HmcPage();
        hmcPage.login.click();

        //Username textbox ve password metin kutularını locate edin ve asagidaki verileri
        //Username : manager
        //Password  : Manager1!
        //        Login butonuna tıklayın.
        hmcPage.userName.sendKeys(ConfigReader.getProperty("user"));//sendKeys icine direk configuration daki user i yazsam almaz
                                                    // o yuzden configreader.getProperty ekliyorum
        /**password e action ile gidecegim
         *
         */
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).
                sendKeys(Keys.ENTER).perform();


        //Hotel Management/Room reservation menusunden ADD ROOM RESERVATION butonuna tiklayin

        hmcPage.hotelManagementButton.click();
        Thread.sleep(3000);
        hmcPage.roomReservationButton.click();
        Thread.sleep(3000);
        hmcPage.addRoomReservationButonu.click();

        Faker faker = new Faker();
        //Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        //Save butonuna tıklayın.
        hmcPage.selectUserDropDown.sendKeys("manager");
        actions.sendKeys(Keys.TAB).sendKeys("Guzelbahce").
                sendKeys(Keys.TAB).sendKeys("1500").
                sendKeys(Keys.TAB).sendKeys("10/02/2022").sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys("10/03/2022").sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys("2").sendKeys(Keys.TAB).sendKeys("2").
                sendKeys(Keys.TAB).sendKeys(faker.name().fullName()).sendKeys(Keys.TAB).
                sendKeys(faker.phoneNumber().cellPhone()).sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress()).sendKeys(Keys.TAB).sendKeys("skajdlaksjdaasd")
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();




        //“RoomReservation was inserted successfully” textinin göründüğünü test edin.
        Thread.sleep(3000);
        Assert.assertTrue(hmcPage.roomResrvSuccessfully.isDisplayed());


        Thread.sleep(3000);
        //OK butonuna tıklayın.
        hmcPage.okButtonn.click();


    }
}
