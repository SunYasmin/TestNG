package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlueRentalCarPage {

    public BlueRentalCarPage(){ /** Burasi onemli burda sadce constructor olustur obje degil!!!!!!!*/

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@role='button'])[1]")
    public WebElement blueRentalCarLogin;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement userEmail;

    @FindBy(xpath = "//*[@id='dropdown-basic-button']")
    public WebElement basariliGiris;



}
