package Test.day18;

import Pages.FaceBookPage;
import Utilities.Driver;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_Ders {

    @Test
    public void test01() {

        //https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");
        //POM’a uygun olarak email, sifre kutularini ve giris yap
        //butonunu locate edin
        FaceBookPage faceBookPage = new FaceBookPage();
        //FacebookPage facebookPage = new FacebookPage();
        Faker faker = new Faker();
        //Faker class’ini kullanarak email ve sifre degerlerini
        //yazdirip, giris butonuna basin
        //FaceBookPage.email.sendKeys(faker.internet().emailAddress());
        //FaceBookPage.sifre.sendKeys(faker.internet().password());
        //FaceBookPage.login.click();
        //Basarili giris yapilamadigini test edin
        //Assert.assertTrue(FaceBookPage.girisYapilmadi.isDisplayed());
    }

}
