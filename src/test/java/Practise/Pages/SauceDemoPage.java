package Practise.Pages;

import Practise.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoPage {


    public SauceDemoPage (){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    //@FindBy(xpath = "(//input[@class='input_error form_input'])[1]")
    //public WebElement userName;

    //@FindBy(xpath = "//input[@id='password']")
    //public WebElement passWord;




}
