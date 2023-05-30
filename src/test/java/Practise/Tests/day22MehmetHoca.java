package Practise.Tests;

import Practise.Pages.HerokuTestPage;
import Practise.Utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class day22MehmetHoca {
    /**
     * NOTT bazi webelementleri tek tiklama ile tetiklenmiyor o nedenle bu class da bazi elementler tek tik double click
     * bazan enter klavyede tuslara basma
     * bazen sayfada baska yere tiklama 2 kez (double click degil)
     * ...................
     * Burada bu durmun olmasinda farkli amaclar var cocuk kilidi, guvenlik, tıp alaninda calismalar, cocuk oyunlari,
     * oyunlar, endustri,kodu veya sayfayi bozmaya karsi denemeler
     */

//Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
//Click all the buttons and verify they are all clicked

    /**
     * NOTTT OBJEYİ class level da initialize et cunki testte olusturunca bazi exception turlerini verebilir...
     */

    HerokuTestPage herokuTestPage;
    Actions actions =new Actions(Driver.getDriver());



    @Test
    public void test01() throws InterruptedException {
        //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html");


        //Click all the buttons and verify they are all clicked
        herokuTestPage = new HerokuTestPage();

        /**kodlarımız yazarken clean code kapsamında daha sade kod yazabilmek amacı ile her test methodu içerisinde
        ayrı bir object create etmektense bu objecti class seviyesinde instance olarak create edip
        test methodlarında buna değer atamak ve kullanmak daha uygun bir yöntemdir
        */
        herokuTestPage.onBlur.click();//buna tıkladigimda acilmiyordu sayfada herhangi biryere tiklayinca aktive oluyor tiklanabiliyordu
                                        // bu yuzden sayfada baska bir yere tiklarim
        herokuTestPage.onClick.click();//Onclick i locate ettigim icin ona tikladim sayfanin baska bir yeri de olurdu
        herokuTestPage.onClick.click();//2 kez tiklayinca aciliyor


        /**Context menuler sag tiklama menuleridir
         * Burada actions kullanirim nedeni; bana bikac kez lazim olacak
         * sag tiklama sag click istedigi icin actions olusturdum
         */

        actions.contextClick(herokuTestPage.onContextMenu).//her tıklamadan sonra event trigger cıkıyor olay tetiklendi
                doubleClick(herokuTestPage.onDoubleClick).
                click(herokuTestPage.onFocus).
                click(herokuTestPage.onKeyDown).//keydown klavyede tıklama istiyor enter yaptik o nedenle klavye action i sendKeys(Keys.ENTER) ile yaptim
                                                // baska tuslara da basilabilir
                sendKeys(Keys.ENTER).
                click(herokuTestPage.onKeyUp).
                sendKeys(Keys.ENTER).
                click(herokuTestPage.onKeyPress).
                sendKeys(Keys.ENTER).
                moveToElement(herokuTestPage.onMouseOver).//onMouseOver da durum farkli ustune gidiyorum moveto ile sonra ustune geldim tetiklenmedi
                                                //bunun icin baska biryere gelip ayrildim uzerinden
                moveToElement(herokuTestPage.onMouseLeave).
                moveToElement(herokuTestPage.onMouseOver).
                click(herokuTestPage.onMouseDown).perform();

    }

        @Test (dependsOnMethods = "test01")
        public void test02() throws InterruptedException {
//dependsOnMethods ile yaptığımız şey burayı çalıştırmadan önce tet01 çalışsın demekti diğer türlü hata alırdık

            //Assert icin verify icin event trigger leri alirsam bu benim icin bir gostergedir. Event trigger larimi list e alsam ve
            // 11 tane olmasi gerekiyor size i 11 ise demekki basarmisim verfy im dogru olur

            Thread.sleep(2000);
            List<WebElement> clicked = herokuTestPage.eventTriggeredList;//clicklenen eventtrigger lerimi al liste at
            //Assert.assertEquals(11,clicked.size());
            Assert.assertEquals(clicked.size(), 11);
//burada bu test yukardaki teste bagli oncesinde yukariyi calistirmali



    }
}
