package Practise.Tests;

import Pages.AutomationExercisePage;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day23SearchProductTest {

// 1. Tarayıcıyı başlat
// 2. 'http://automationexercise.com' url'sine gidin
// 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
// 4. 'Ürünler' butonuna tıklayın
// 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
// 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın
// 7. 'ARARAN ÜRÜNLER'in görünür olduğunu doğrulayın
// 8. Aramayla ilgili ürünün ("blue top") görünür olduğunu doğrulayın

    AutomationExercisePage automationExercisePage;
    @Test
    public void automExrcProdSearchProductTest() {
        // 1. Tarayıcıyı başlat
        // 2. 'http://automationexercise.com' url'sine gidin
        Driver.getDriver().get("http://automationexercise.com");

        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        /**Sayfada unique olan bir lementi alip dogrulamak lazim burda mantikli olan url diger elemanlar uymuyor
         *
         */
        String homeUrl = "http://automationexercise.com";
        //String expectedUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),homeUrl);

        automationExercisePage = new AutomationExercisePage();

        // 4. 'Ürünler' butonuna tıklayın
        automationExercisePage.prouducts.click();

        // 5. Kullanıcının TÜM ÜRÜNLER sayfasına başarıyla gittiğini doğrulayın
        Assert.assertTrue(automationExercisePage.allProductTitle.isDisplayed());

       // String productPgeUrl = "http://automationexercise.com/products";  not bunu unique olmadigi icin kaullanmadim
       // Assert.assertEquals(Driver.getDriver().getCurrentUrl(),productPgeUrl);
        /** not search box larin tagi genelde input olur
        Detaycı olmak guzel ama altını doldurmak lazim nasil derlerse
         sayfamda dogrulama yaparken hem url hem unique bir element bulup ondan assert yaparim
         */

        // 6. Arama girişine ürün adını girin ve ara düğmesine tıklayın

        //sendKeys("Dress", Keys.TAB,Keys.ENTER)  3 oge ile de olur
        //actions.sendKeys(aEP.searchProduct,"blue top").sendKeys(Keys.TAB,Keys.ENTER).perform(); actions ile de olur
        //actions.click(searchProductPage.searchBox).sendKeys("blue top", Keys.ENTER).perform();


        /**
        Bence başlığı assert etmek yeterli değil, başlık gelse bile ürünler gelmeyebilir,
         ürünleri liste çekip size() yapmamız daha mantıklı değil mi ? kesinlikleeeee
         */





    }
}
