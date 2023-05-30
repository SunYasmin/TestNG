package Test.day16ABuOz;

import Utilities.TestBaseBeforeMethodAfterMethod;
import org.testng.annotations.Test;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {

    /*
    TestNG test methodlarini isim sirasina gore calistirir
    eger isim siralamasinin disinda bir siralama ile calismasini isterseniz
    o zaman test methodlarina oncelik priority tanimlayabiliriz

    priority kucukten buyuge gore calisir
    eger bir test methoduna priority degeri atanmamissa
    default olarak priority =0 kabul edilir
    priority varsa kucukse once o
    ayniysa alfabetik sira
    yazilmadiysa 0 dir
     */


    @Test (priority = -5)  // bu teste priority 5 yazarsam alttaki 2 sinin pri 0 old.icin kendi icinde siralar
                            // once techpro sonra test02 sonra amazon
    //prio -5 yazarsam ne kadar kucukse o kadar once calistiracak once amazon calisir
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test (priority = -2) //bu durumda once amazon sonra test02 sonra techproetesti calisir
    public void test02() {
        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void techproedTesti() {
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }


}
