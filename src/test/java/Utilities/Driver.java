package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

    //Bu class ta gizli bir constructor var onu kullanarak burdan bir obje olusturup singlepattern deki adrese gittim
    //burada 2 yol oldu o class ta ulasirken bu da dogru degil
    //gizli cons. i iptal etmek icin constrouctor olustururum tek yol olsun diye
    //buraya private cons. olusturuyorum baska kimse ulasamaz ulasmak isteyen class adi ile ulasir
    // Default constructor'u devre dısı bırakmak yani SingletonPattern yapmak icin kullanılıyor
    private Driver(){

    }
    static WebDriver driver;

        /*
        Testlerimizi çalıştırdığımızda her seferinde yeni driver oluşturduğu için her test methodu
        için yeni bir pencere(driver) açıyor. Eğer driver'a bir değer atanmamışsa yani driver==null ise
        bir kere driver'i çalıştır diyerek bir kere if içini çalıştıracak. Ve driver artık bir kere
        çalıştığı için ve değer atandığı için null olmayacak ve direk return edecek ve diğer
        teslerimiz aynı pencere(driver) üzerinde çalışacak
         */

    public static WebDriver getDriver() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }
    public static void closeDriver() {
        if (driver != null) { // driver'a değer atanmışsa kapat
            driver.close();
            driver = null; // Kapandıktan sonra sonraki açmaları garanti altına almak için driver'i tekrar null yaptık
        }
    }
    public static void quitDriver() {
        if (driver != null)
            driver.quit();
        driver = null;
    }


}
