package Test.day17ABuOz;

import org.openqa.selenium.WebDriver;

public class DriverABuoz {

    /** Pom da bu sekilde karar verimis neden degil de kural gibi bu durum static methodlar kullanma durumu;
    Pom de Driver icin TestBase classina extends etmek yerine
    Driver classindan static methodlar kullanarak
    driver olusturup, ilgili ayarlarin yapilmasi
    ve en sonda driver in kapatilmasi tercih edilmistir
     */

    //JUnit testBase classinda her sekilde basta ve sonra driver calisiyor ve onun karar verdigi sekilde
    //driver acilip kapaniyordu/ Ancak TestNG de acilip kapanma zamanlarine biz karar verebiliyoruz yani
    //ben istedigim zaman aciliyor ben istedigim zaman kapaniyor serbestisi kontrolu
    //Bazi methodlarda classtan once 1 kere driver in calisip en sonda kapanmasi daha mantiklidir
    //Bazi classlarda ise  her seferinde acilip kapanmasi mantiklidir iste bu nedenle herseferinde acilip kapansin istemiyorum
    //iste bu nedenle (herseferinde standart setUp  tearDown gerek yok)

    static WebDriver driver;//3- return olacak obje mi olusturdum bu sekilde asagida static method kabul etmedi
    //  4- bu durumda static yaparimki static method alsin kullanabilsin

    public static WebDriver getDriverDriver(){  //1
        //bu method her istedigim yere driver i getirebilir mi?
        // void ken hayir getirebilmesi icin birsey dondurmesi gerekli
        // void yerine Webdriver olmali ve yani bunu dondurmeli

        return driver;// driver objesi olustururum ki dondursun  //2

    }

    public static void closeDriver(){

        driver.close();

    }




}
