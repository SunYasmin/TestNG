package Test.day18;

import Pages.FaceBookPage;
import Utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C01_PageClassFaceBookTest {
    @Test
    public void test01() {//NOTe: POM da amac test classinda yesil hicbisey birakmamak yani manuel girecegim hicbisey burda olmayacak
                        // nerde olacak hepsi ayri classlarda olacak


        //https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");

        //POM’a uygun olarak email, sifre kutularini ve giris yap
        //butonunu locate edin
        /**NOTTTT;
         * Neden obje olusturtukda static method la gitmedik
         * amazonpage sayfasindaki webelementler static degilki static methodla gideyim
         * gidemem
         * POM da static kullanilmiyor cunki pom boyle :))
         * //this-> Driver class'indaki Driver.getDriver() 'i , Page class'indaki driver'a  esitledi/tanitti.
         *         // PageFactory nezaman bir page olusturursak pagefactory objesi olusturmamiz gerekiyor
         *         //Page factory page sayfamda bunu kurdugum zaman webelementlerimi driver im la iliskilendiriyorum
         *         //page sayfasindaki locatelerimi iliskilendirecek page factory
         */

        FaceBookPage facebookPage = new FaceBookPage();
        Faker faker = new Faker();
        //facebookPage.cookies.click();
        //Faker class’ini kullanarak email ve sifre degerlerini yazdirip
        //facebookPage.email.sendKeys(faker.internet().emailAddress());

        facebookPage.email.sendKeys("ysmnsrdrysmnsrdr@gmail.com");
        facebookPage.sifre.sendKeys(faker.internet().password());

        //giris butonuna basin
        facebookPage.login.click();


        //Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girisYapilmadi.isDisplayed());


/**
        // Basarili giris yapilamadigini test edin
        try {
            String actualText = facebookPage.girisYapilamadi.getText();
            Assert.assertTrue(actualText.contains("Facebook"));
        } catch (Exception e) {
            String acturalText2 = facebookPage.getGirisYapilamadiEvetBendim.getText();
            Assert.assertTrue(acturalText2.contains("Evet, Devam Et"));
        }
  */

/*
        String mail=faker.internet().emailAddress();
        String sifre=faker.internet().password();
        facebookPage.email.sendKeys(mail);
        facebookPage.sifre.sendKeys(sifre);
        System.out.println("mail = " + mail);
        System.out.println("sifre = " + sifre);

        Faker'in ürettiği ve girdiği mail ve şifreyi görmek isterseniz, bu şekilde değiştirebilirsiniz.
*/


        //Pages package'i altındaki klaslara obje ile ulaşmamızın sebebi constraktırın body'sinde driver'ı tanımlamış olmamız
        //her bir locate için bize driver gerektiğinden test klasında obje oluştururken constraktır ile
        // birlikte driver'ı da çağırmış oluyoruz dolayısıyla tekrar driver için ayrı bir işlem yapmamıza gerek kalmıyor



    }






}
