package Test.day16ABuOz;

import Utilities.TestBaseBeforeClassAfterClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class C02_BeforeClass_AfterClass extends TestBaseBeforeClassAfterClass {

    /*
    JUnit te @BeforeClass ve @AfterClass notasyonuna sahip
    methodlar static olmak ZORUNDAYDI
    TestNG bu zorunluluktan bizi kurtarir


    TestNG bize daha fazla before ve after notasyonlari sunar
    diger before/after notasyonlari tanimlayacagimiz
    grup test veya suit ten  once ve sonra calisirlar
    ileride xml dosyalari ile birlikte bunu gorecegiz
     */


    @BeforeClass
    public void beforeCalssMethod(){
        System.out.println("Before class");
    }


    @AfterClass
    public void afterClassMethod(){
        System.out.println("After class");
    }

    @Test
    public void amazonTesti() {
    driver.get("https://www.amazon.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void test02() {
        driver.get("https://www.bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void test03() {
        driver.get("https://www.techproeducation.com");
        System.out.println(driver.getCurrentUrl());
    }

//amazon bestbuy techproed sirasi ile gitti
    /* Altta konsol  da yaziyor
    Before class
https://www.amazon.com/
https://www.bestbuy.com/
https://techproeducation.com/
After class
altta arada kaliyor bakarsan dikkatli gorunur
     */


}
