package Test.day18;

import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.annotations.Test;

public class C02_ConfigurationProperties {

    @Test
    public void test01() {
        //Amazon sayfasına ve facebook sayfasına gidiniz
        String urlamzn = ConfigReader.getProperty("amznUrl");
        String urlFace = ConfigReader.getProperty("faceUrl");
        Driver.getDriver().get(urlamzn);
        Driver.getDriver().get(urlFace);
        Driver.closeDriver();

    }
}
