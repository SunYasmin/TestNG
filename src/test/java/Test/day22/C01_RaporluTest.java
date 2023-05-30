package Test.day22;

import Pages.BlueRentalCarPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import Utilities.TestBaseRapor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_RaporluTest extends TestBaseRapor {


    /*
    -https://www.bluerentalcars.com/ adresine git
    -login butonuna bas
    -test data user email: customer@bluerentalcars.com ,
    -test data password : 12345 dataları girip login e basın
    -login butonuna tiklayin
    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
     */

    @Test
    public void test01() {

        extentTest=extentReports.createTest("Pozitif Test","Geçerli kullanıcı adı ve password ile giriş yapıldı");
        //https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Blue RentaCar sitesine gidildi.");

        //login butonuna bas
        BlueRentalCarPage brc = new BlueRentalCarPage();

        brc.blueRentalCarLogin.click();
        extentTest.info("login butonuna basildi");

        //test data user email: customer@bluerentalcars.com
        //test data password : 12345 dataları girip login e basın
        // login butonuna tiklayin
        brc.userEmail.sendKeys(ConfigReader.getProperty("brcUserEmail"));
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("brcPassWord")).
                sendKeys(Keys.ENTER).perform();
        extentTest.info("Dogru kullanici adi ve sifre girildi.");
        extentTest.info("2. defa login butonuna basildi");

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        String actualUserName = brc.basariliGiris.getText();
        String expectepUserName = "John Walker";
        Assert.assertEquals(expectepUserName,actualUserName);
        extentTest.info("Sayfaya basarili bir sekilde giris yapildi.");


    }
}
