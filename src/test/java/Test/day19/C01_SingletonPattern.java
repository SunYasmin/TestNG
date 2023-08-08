package Test.day19;

import org.testng.annotations.Test;

public class C01_SingletonPattern {

    //Driver obj = new Driver();
    //obj.getDriver().get(ConfigReader.getProperty("amznUrl"));
        /*
        SingletonPattern : tekli kullanım demektir. Bir class'ın farklı class'lardan
        obje oluşturarak kullanımını engellemektir.
         */

    //SingletonPattern : tekli kullanim demektir. Bir class'in farkli class'lardan
    //obje olusturarak kullanimini engellemektir bu sebeple default consractir yerine
    // private Driver() consructur i ekledik

    /**Obje oluşturulması kontrol altına alınan
     classlarda kullanılan yapıya singleton
     pattern denir.
     Örneğin Driver
     classta singleton pattern uygularız. Çünkü driver classından obje
     oluşturulmasını istemeyiz. Çünkü bu durumda birden fazla driver oluşturulur ve
     Driverin kontrolü zorlaşır. Bunun önüne geçmek için Driver classın default
     constructoru private yapılır. Böylece başka bir classta Driver classından obje
     üretilemez.
     Peki obje üretilmezse bu sayfadaki
     WebDriveri nasıl kullanacağız?
     WebDriveri
     bu class içerisinde static yaparsam WebDrivera class ismi üzerinden
     ulaşabilirim.
     */

    @Test
    public void test01() {

        //Driver obj = new Driver();
        //obj.getDriver().get(ConfigReader.getProperty("amznUrl"));
        /*
        SingletonPattern : tekli kullanım demektir. Bir class'ın farklı class'lardan
        obje oluşturarak kullanımını engellemektir.
         */


    }






}
