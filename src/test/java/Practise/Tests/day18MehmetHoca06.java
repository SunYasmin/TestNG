package Practise.Tests;

import Practise.Pages.DhtmlgoodiesPage;
import Utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class day18MehmetHoca06 {


    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Fill in capitals by country.


    @Test
    public void test01() {
        //Design Pattern
        //static yapmasaydik driver methodu her defasında obje uretecegim ya da testbase extends esnek degil
        //iste page object model i bulanlar bunu dusunerek static yapmis

        // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        // Fill in capitals by country.


        // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        DhtmlgoodiesPage dhtmlgoodiesPage = new DhtmlgoodiesPage();

        //mouse hareketlerini yapabilmek icin actions kullanmam gerekli actions objesi olustur
        Actions actions = new Actions(Driver.getDriver());
//        actions.dragAndDrop(dhtmlgoodiesPage.oslo,dhtmlgoodiesPage.norway).perform();
//        actions.dragAndDrop(dhtmlgoodiesPage.stockholm,dhtmlgoodiesPage.sweden).perform();
//        actions.dragAndDrop(dhtmlgoodiesPage.washington,dhtmlgoodiesPage.unitedStates).perform();
//        actions.dragAndDrop(dhtmlgoodiesPage.copenhagen,dhtmlgoodiesPage.denmark).perform();
//        actions.dragAndDrop(dhtmlgoodiesPage.seoul,dhtmlgoodiesPage.southKorea).perform();
//        actions.dragAndDrop(dhtmlgoodiesPage.rome,dhtmlgoodiesPage.italy).perform();
//        actions.dragAndDrop(dhtmlgoodiesPage.madrid,dhtmlgoodiesPage.spain).perform();


    //dragAndDrop()  surukle birak eslesmesi icin
        actions.dragAndDrop(dhtmlgoodiesPage.oslo,dhtmlgoodiesPage.norway).
                dragAndDrop(dhtmlgoodiesPage.stockholm,dhtmlgoodiesPage.sweden).
                dragAndDrop(dhtmlgoodiesPage.washington,dhtmlgoodiesPage.unitedStates).
                dragAndDrop(dhtmlgoodiesPage.copenhagen, dhtmlgoodiesPage.denmark).
                dragAndDrop(dhtmlgoodiesPage.seoul,dhtmlgoodiesPage.southKorea).
                dragAndDrop(dhtmlgoodiesPage.rome,dhtmlgoodiesPage.italy).
                dragAndDrop(dhtmlgoodiesPage.madrid,dhtmlgoodiesPage.spain).perform();

        Driver.closeDriver();



        /****
-Frameworkler buyudukce yeni classlar yeni test methodlari yeni webelementler olusturdukca
icinden cikilmaz, anlasilmaz, tekrar bakimi yapilamaz, guncellemesi cok zor hatta imkansiz bir hal alir.
-Uzmanlar reusable, maintainable, rahat manipule edilebilir bir framework icin bir design pattern olarak
POM (page object model)'de karar vermisler.
-Olmazsa olmazlar
        1) Driver class
        2) Page class
        3) Test class
           Utilities
-Aradigimiz bir web elementi ya da bir methodu kolaylikla bulabilmek ve guncelleyebilmek icin javadan
ogrenmis oldugumuz OOP Concept Selenium ile page object modelde birlestirilmis oluyor.

 */


    }
}
