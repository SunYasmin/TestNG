package Practise.Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DhtmlgoodiesPage {
    //Bir page sayfası ilk oluşturulduğunda, ilk yapmamız gereken şey burada bir Constructor oluşturmak. Public olmak zorunda!

    //Public olarak tanımlanan öğeye kod bloğunun içinden ve dışından erişebilir, yani her yerden ulaşılabilir denilebilir.
    //Statik tanımlaması yapıldığında ise bu sınıfa herhangi bir nesne oluşturmadan, sadece adıyla çağırıp erişim sağlanabilir.

    public DhtmlgoodiesPage (){
        PageFactory.initElements(Driver.getDriver(),this);
        //this class icindeki variable i driver gorsun diye this yazmazsak variable i gormez
        // Constructor in icine yazdigim kod ile sayfadaki webelementimi driver im ile iliskilendirdim
        // pagefactory'nin mantığı: pages sayfasında yer alan pagefactory ile
        // buradaki webelementleri driver ile ilişkilendirmiş oluyoruz.
    }
//capitals  -  baskentler
    @FindBy(xpath = "//div[@id='box1']")
    public WebElement oslo;

    @FindBy(xpath = "//div[@id='box2']")
    public WebElement stockholm;

    @FindBy(xpath = "//div[@id='box3']")
    public WebElement washington;

    @FindBy(xpath = "//div[@id='box4']")
    public WebElement copenhagen;

    @FindBy(xpath = "//div[@id='box3']")
    public WebElement seoul;

    @FindBy(xpath = "//*[@id='box6']")
    public WebElement rome;

    @FindBy(xpath = "//*[@id='box7']")
    public WebElement madrid;


// countries  -  ulkeler
    @FindBy(xpath = "//div[@id='box101")
    public WebElement norway;

    @FindBy(xpath = "//div[@id='box102")
    public WebElement sweden;

    @FindBy(xpath = "//div[@id='box103")
    public WebElement unitedStates;

    @FindBy(xpath = "//div[@id='box104")
    public WebElement denmark;

    @FindBy(xpath = "//div[@id='box105")
    public WebElement southKorea;

    @FindBy(xpath = "//div[@id='box106")
    public WebElement italy;

    @FindBy(xpath = "//div[@id='box107")
    public WebElement spain;



}
