package Pages;

import Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPage {

    public FaceBookPage() {
    //Nicin bu satiri cons body yi kullaniyoruz; Locate yaparken driver a ihtiyacimiz var ;
        // bu satir olmazsa driver nerde driver yok locate edecegim ama bu class ta olusturayim desek driver imiz driver classinda
        //neden cons icinde yaptik; cons icinde yaparsak test classinda obje olusturduk ve parametresiz cons kullandik ve
        // bu calisti this bu class taki driver driver classindaki driver dir dedive aldi geldi.

    PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[@id='email']")
    public WebElement email;
    @FindBy(xpath = "//*[@id='pass']")
    public WebElement sifre;
    @FindBy(xpath = "//*[@class='_9ay7']")
    public WebElement girisYapilmadi;
    @FindBy(xpath = "//*[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")
    public WebElement login;
}