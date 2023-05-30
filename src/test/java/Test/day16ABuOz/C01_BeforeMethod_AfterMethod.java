package Test.day16ABuOz;

import Utilities.TestBaseBeforeMethodAfterMethod;
import org.testng.annotations.Test;

public class C01_BeforeMethod_AfterMethod extends TestBaseBeforeMethodAfterMethod {

    //Not : bekledigimiz yontem before methodu arayacak burda yok parent a gidecek
    // herbir test methodu icin 3 tane method toplamda 9 method calismis olacak
    //Not method adi kucuk harfle baslar yoksa class adi ile karisir

    @Test
    public void test01() {
        driver.get("https://amazon.com");

    }

    @Test
    public void test02() {
        driver.get("https://bestbuy.com");
    }

    @Test
    public void techproedTesti() {
        driver.get("https://techpro.com");
    }
}
//NOT  Once Techpro sonra amazon sonra bestbuy a gitti
//JUnit te random calisiyordu testler methodlar ancak
//TestNG kontrol imkanimizi arttiyor ve testleri alfabetik sira natural order a gore calistiriyor
//test01-test02-test03 yazinca bestbuy techpro amazon sirasiyla gitti
//test01-test02-techproedTesti yazinca  techpro amazon bestbuy  sirasiyla gitti

