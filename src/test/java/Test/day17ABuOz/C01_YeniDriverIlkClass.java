package Test.day17ABuOz;

import Utilities.Driver;
import org.testng.annotations.Test;

public class C01_YeniDriverIlkClass {


    @Test
    public void test01() {
        Driver.getDriver().get("https://www.amazon.com");
        /*
        Bugune kadar TestBase class ina extends ederek kullandigimiz driver yerine
        bundan sonra Driver class indan Kullanacagimiz getDriver() static methodunu kullanacagiz

        Driver.getDriver()     in
        driver                 out              driver yazdigim heryere Driver.getDriver() yazacagim
         */




    }
}
