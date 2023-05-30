package Practise.Tests;

import Practise.Pages.HepsiBuradaPage;
import Utilities.Driver;
import Utilities.ReusableMethods;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HepsiBurada {

    //Hepsiburada sayfasına gidiniz
    //Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
    //Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanın resmini alalım
    //Sayfayı kapatalım
    HepsiBuradaPage hepsiburadaPage;
    @Test
    public void test01() throws InterruptedException, IOException, IOException {
        //Hepsiburada sayfasına gidiniz
        Driver.getDriver().get("https://www.hepsiburada.com");
        //Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
        hepsiburadaPage = new HepsiBuradaPage();
        /*
        ReusableMethods.hover(hepsiburadaPage.elektronik);
        ReusableMethods.hover(hepsiburadaPage.bilgisayarTablet);
        Thread.sleep(3000);
        List<String> tumMenu = ReusableMethods.getElementsText(hepsiburadaPage.altBasliklar);
        for (String w:tumMenu
        ) {
            System.out.println(w+" ");
        }
        System.out.println("hepsiburadaPage.tumMenu.size() = " + hepsiburadaPage.altBasliklar.size());*/
        //List<WebElement> altBasliklar1 = hepsiburadaPage.altBasliklar;
        //List<String> isimlerList = new ArrayList<>(Arrays.asList("SERDAR", "Nalan", "Yasemin", "Zeynep"));


        for (int i = 0; i < 66; i++) {
            ReusableMethods.hover(hepsiburadaPage.elektronik);
            ReusableMethods.hover(hepsiburadaPage.bilgisayarTablet);
            hepsiburadaPage.altBasliklar.get(i).click();
            ReusableMethods.waitFor(3);
            ReusableMethods.getScreenshot("hepsiburada_");
            ReusableMethods.waitFor(3);
        }
        System.out.println(hepsiburadaPage.altBasliklar.size());
        /*
        for (WebElement each: hepsiburadaPage.altBasliklar
        ) {
            each.click();
            ReusableMethods.waitFor(3);
            ReusableMethods.getScreenshot("hepsiburada");
            ReusableMethods.waitFor(3);
        }*/
    }


}
