package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationExercisePage {

    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//*[text()=' Products']")
    public WebElement prouducts;

    @FindBy (xpath = "//*[text()='All Products']")
    public WebElement allProductTitle;

    @FindBy (xpath = "//input[@id='search_product']")
    public WebElement searchBox;


    @FindBy (xpath = "//button[@id='submit_search']")
    public WebElement searchButton;

    @FindBy (xpath = "//button[@id='submit_search']")
    public WebElement searchProductTitle;

    @FindBy (xpath = "//button[@id='submit_search']")
    public WebElement viewProduct;

}
