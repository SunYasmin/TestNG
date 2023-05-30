package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HmcPage {

    public HmcPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement login;


    @FindBy(xpath = "//*[@id='UserName']")
    public WebElement userName;


    @FindBy(xpath = "//*[@class='username username-hide-on-mobile']")
    public WebElement girisYapildi;

    @FindBy(xpath = "//*[text()='Try again please']")
    public WebElement girisYapilamadi;

    @FindBy(xpath = "//*[text()='Hotel Management']")
    public WebElement hotelManagementButton;

    @FindBy (xpath = "//*[@href='/admin/RoomReservationAdmin']")
    public WebElement roomReservationButton;

    @FindBy(xpath = "//*[@class='btn btn-circle btn-default']")
    public WebElement addRoomReservationButonu;

    @FindBy(id = "IDUser")
    public WebElement selectUserDropDown;


    @FindBy(id = "IDUser")
    public WebElement roomResrvSuccessfully;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement okButtonn;





}


