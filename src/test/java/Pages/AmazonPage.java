package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {

    //oluşturduğumuz constructor ile driver komutlarını tanıtmış olduk
    public AmazonPage(){ //Constructor oluşturup public yapmamız gerekir
        PageFactory.initElements(Driver.getDriver(),this);
        //this-> Driver class'indaki Driver.getDriver() 'i , Page class'indaki driver'a  esitledi/tanitti.
        // PageFactory nezaman bir page olusturursak pagefactory objesi olusturmamiz gerekiyor
        //Page factory page sayfamda bunu kurdugum zaman webelementlerimi driver im la iliskilendiriyorum
        //page sayfasindaki locatelerimi iliskilendirecek page factory
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy (xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucWE;
    //POM'da artik inheritance yerine object ve static kullanarak methodlara ulasiyoruz
    //page classina objeyle
    //driver classina static ile ulasiriz
    //diyebiliriz demi kisaca hocam
}
